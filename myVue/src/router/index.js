import Vue from 'vue'
import Router from 'vue-router'
import Header from '@/components/Header'
import App from '@/App'
import index from '@/components/index'
import login from '@/components/login'

Vue.use(Router);

export default new Router({
  routes: [
    {
      path:"/",
      component:App
    },
    {
      path:'/index',
      component:index
    },
    {
      path:'/login',
      component:login
    }
  ]
})
