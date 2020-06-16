import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/**
 * 注意: 子菜单只有在 route children.length >= 1 才出现
 * 详情参见: https://panjiachen.github.io/vue-element-admin-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   如果设置为true，项目将不会显示在侧栏中(默认为false)
 * alwaysShow: true               如果设置为true，将始终显示根菜单
 *                                如果不总是设置show，当项目有多个子路由时，
 *                                它将成为嵌套模式，否则不显示根菜单
 * redirect: noRedirect           如果设置noRedirect，则不会在面包屑中重定向
 * name:'router-name'             名称由<keep-alive>(必须设置!!)使用
 * meta : {
    roles: ['admin','editor']    控制页面角色(可以设置多个角色)
    title: 'title'               名称显示在侧边栏和面包屑(推荐设置)
    icon: 'svg-name'             图标显示在侧栏中
    noCache: true                如果设置为true，页面将不会被缓存(默认为false)
    affix: true                  如果设置为true，则标记将附加在标记视图中
    breadcrumb: false            如果设置为false，则该项将隐藏在breadcrumb中(默认为true)
    activeMenu: '/example/list'  如果设置路径，侧栏将突出显示您设置的路径
  }
 */

/**
 * constantRoutes
 * 不需要验证的全局视图
 * 所有的角色都可以查看
 */

export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path*',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/auth-redirect',
    component: () => import('@/views/login/auth-redirect'),
    hidden: true
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  },
  {
    path: '/401',
    component: () => import('@/views/error-page/401'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [
      {
        path: 'dashboard',
        component: () => import('@/views/dashboard/index'),
        name: '工作台',
        meta: { title: '工作台', icon: 'dashboard', affix: true }
      }
    ]
  },
  {
    path: '/profile',
    component: Layout,
    redirect: '/profile/index',
    hidden: true,
    children: [
      {
        path: 'index',
        component: () => import('@/views/profile/index'),
        name: 'Profile',
        meta: { title: 'Profile', icon: 'user', noCache: true }
      }
    ]
  }
]

/**
 * 异步路由
 * 需要根据用户角色动态加载的路由
 */
export const asyncRoutes = [
  {
    path: '/sys',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: false, // 总是显示根菜单
    name: '系统管理',
    meta: {
      title: '系统管理',
      icon: 'qq',
      roles: ['admin', 'editor'] // 您可以在根导航中设置角色
    },
    children: [
      {
        path: 'user',
        component: () => import('../views/sys/user'),
        name: '部门管理',
        meta: { title: '部门管理', roles: ['admin'] }
      },
      {
        path: 'user',
        component: () => import('../views/sys/user'),
        name: '用户管理',
        meta: { title: '员工管理', roles: ['admin'] }
      },
      {
        path: 'role',
        component: () => import('../views/table/complex-table'),
        name: '岗位管理',
        meta: { title: '岗位管理', roles: ['admin'] }
      },
      {
        path: 'menu',
        component: () => import('../views/table/complex-table'),
        name: '权限管理',
        meta: { title: '权限管理', roles: ['admin'] }
      },
      {
        path: 'menu',
        component: () => import('../views/table/complex-table'),
        name: '日志管理',
        meta: { title: '日志管理', roles: ['admin'] }
      }
    ]
  },
  {
    path: '/record',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: true, // 总是显示根菜单
    name: '基础档案',
    meta: {
      title: '基础档案设置',
      icon: 'qq',
      roles: ['editor', 'admin'] // you can set roles in root nav
    },
    children: [
      {
        path: 'recordset',
        component: () => import('../views/table/complex-table'),
        name: '基础档案设置',
        meta: { title: '基础档案设置', roles: ['admin', 'editor'] }
      },
      {
        path: 'pick',
        component: () => import('../views/table/complex-table'),
        name: 'pick',
        meta: { title: '收派标准', roles: ['editor'] }
      },
      {
        path: 'regular',
        component: () => import('../views/table/complex-table'),
        name: '班车线路',
        meta: { title: '班车线路', roles: ['editor'] }
      }
    ]
  },
  {
    path: '/table',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: true, // 总是显示根菜单
    name: '报表',
    meta: {
      title: '报表汇总',
      icon: 'qq',
      roles: ['editor', 'admin'] // you can set roles in root nav
    },
    children: [
      {
        path: 'xxtable',
        component: () => import('../views/table/complex-table'),
        name: 'xx报表',
        meta: { title: '基础档案设置', roles: ['admin1', 'editor'] }
      }
    ]
  },
  // 404 页面必须放在最后 !!!
  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
