import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import api from './http/index' // 引入所有插件，包括包装后的axios
Vue.config.productionTip = false

// 使用ElementUI
Vue.use(ElementUI)
// 使用自己封装的api
Vue.use(api)
new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
