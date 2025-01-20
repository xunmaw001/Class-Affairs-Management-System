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
    import news from '@/views/modules/news/list'
    import dangyuanpeixun from '@/views/modules/dangyuanpeixun/list'
    import jiankangdangan from '@/views/modules/jiankangdangan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import banhuizuzhi from '@/views/modules/banhuizuzhi/list'
    import banwei from '@/views/modules/banwei/list'
    import dangyuanfazhan from '@/views/modules/dangyuanfazhan/list'
    import xueshengchengji from '@/views/modules/xueshengchengji/list'
    import huodongxinxi from '@/views/modules/huodongxinxi/list'
    import discusshuodongxinxi from '@/views/modules/discusshuodongxinxi/list'
    import discusswenhuaxuexi from '@/views/modules/discusswenhuaxuexi/list'
    import discussdangyuanpeixun from '@/views/modules/discussdangyuanpeixun/list'
    import discussbanhuizuzhi from '@/views/modules/discussbanhuizuzhi/list'
    import banfeitongzhi from '@/views/modules/banfeitongzhi/list'
    import config from '@/views/modules/config/list'
    import discussdangyuanfazhan from '@/views/modules/discussdangyuanfazhan/list'
    import wenhuaxuexi from '@/views/modules/wenhuaxuexi/list'


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
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/dangyuanpeixun',
        name: '党员培训',
        component: dangyuanpeixun
      }
      ,{
	path: '/jiankangdangan',
        name: '健康档案',
        component: jiankangdangan
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/banhuizuzhi',
        name: '班会组织',
        component: banhuizuzhi
      }
      ,{
	path: '/banwei',
        name: '班委',
        component: banwei
      }
      ,{
	path: '/dangyuanfazhan',
        name: '党员发展',
        component: dangyuanfazhan
      }
      ,{
	path: '/xueshengchengji',
        name: '学生成绩',
        component: xueshengchengji
      }
      ,{
	path: '/huodongxinxi',
        name: '活动信息',
        component: huodongxinxi
      }
      ,{
	path: '/discusshuodongxinxi',
        name: '活动信息评论',
        component: discusshuodongxinxi
      }
      ,{
	path: '/discusswenhuaxuexi',
        name: '文化学习评论',
        component: discusswenhuaxuexi
      }
      ,{
	path: '/discussdangyuanpeixun',
        name: '党员培训评论',
        component: discussdangyuanpeixun
      }
      ,{
	path: '/discussbanhuizuzhi',
        name: '班会组织评论',
        component: discussbanhuizuzhi
      }
      ,{
	path: '/banfeitongzhi',
        name: '班费通知',
        component: banfeitongzhi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussdangyuanfazhan',
        name: '党员发展评论',
        component: discussdangyuanfazhan
      }
      ,{
	path: '/wenhuaxuexi',
        name: '文化学习',
        component: wenhuaxuexi
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
