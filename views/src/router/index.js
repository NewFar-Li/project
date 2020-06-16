import Vue from 'vue'
import Router from 'vue-router'
import Login from '../view/Login'
import Home from '../view/Home'
import NotFound from '../view/404'

Vue.use(Router)

const router = new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/users/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/404',
      name: 'notFound',
      component: NotFound
    }
  ]
})
router.beforeEach((to, from, next) => {
  // 登录成功后，会把用户信息保存在会话
  // 存在时间为会话生命周期，页面关闭即失效
  let user = sessionStorage.getItem('user')
  // 如果是登录
  if (to.path == '/users/login') {
    if (user) {
      // 会话里存在用户信息,代表已经登录，跳转到首页
      next({path: '/'})
    } else {
      // 放行
      next()
    }
  } else {
    // 不是登录，用户信息不存在，去登录
    if (!user) {
      next({path: '/users/login'})
    } else {
      // 存在用户信息，放行
      next()
    }
  }
})
export default router
