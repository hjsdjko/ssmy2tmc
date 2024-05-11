import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import zaotangyuyue from '@/views/modules/zaotangyuyue/list'
    import quxiaoyuyue from '@/views/modules/quxiaoyuyue/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import zaotangfenlei from '@/views/modules/zaotangfenlei/list'
    import config from '@/views/modules/config/list'
    import zaotang from '@/views/modules/zaotang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '澡堂论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/zaotangyuyue',
        name: '澡堂预约',
        component: zaotangyuyue
      }
      ,{
	path: '/quxiaoyuyue',
        name: '取消预约',
        component: quxiaoyuyue
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/zaotangfenlei',
        name: '澡堂分类',
        component: zaotangfenlei
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zaotang',
        name: '澡堂',
        component: zaotang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
