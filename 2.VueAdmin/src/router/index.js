	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import guahao from '@/views/guahao/list'
	import yiliaozhishi from '@/views/yiliaozhishi/list'
	import xinguanyimiao from '@/views/xinguanyimiao/list'
	import discussyiliaozhishi from '@/views/discussyiliaozhishi/list'
	import zaixianjiaoliu from '@/views/zaixianjiaoliu/list'
	import keshi from '@/views/keshi/list'
	import hpvyimiaoyuyue from '@/views/hpvyimiaoyuyue/list'
	import jiankangtijian from '@/views/jiankangtijian/list'
	import zhishileixing from '@/views/zhishileixing/list'
	import xinguanyimiaoyuyue from '@/views/xinguanyimiaoyuyue/list'
	import storeup from '@/views/storeup/list'
	import tijianbaogao from '@/views/tijianbaogao/list'
	import hpvyimiao from '@/views/hpvyimiao/list'
	import tijianyuyue from '@/views/tijianyuyue/list'
	import baogaoxinxi from '@/views/baogaoxinxi/list'
	import yuyueguahao from '@/views/yuyueguahao/list'
	import tijianfenlei from '@/views/tijianfenlei/list'
	import jiankangriji from '@/views/jiankangriji/list'
	import yonghu from '@/views/yonghu/list'
	import config from '@/views/config/list'
	import yisheng from '@/views/yisheng/list'
	import yishengRegister from '@/views/yisheng/register'
	import yishengCenter from '@/views/yisheng/center'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页Home',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/yishengCenter',
			name: '医生个人中心',
			component: yishengCenter
		}
		,{
			path: '/guahao',
			name: '挂号',
			component: guahao
		}
		,{
			path: '/yiliaozhishi',
			name: '医疗知识',
			component: yiliaozhishi
		}
		,{
			path: '/xinguanyimiao',
			name: '新冠疫苗',
			component: xinguanyimiao
		}
		,{
			path: '/discussyiliaozhishi',
			name: '医疗知识评论',
			component: discussyiliaozhishi
		}
		,{
			path: '/zaixianjiaoliu',
			name: '在线交流',
			component: zaixianjiaoliu
		}
		,{
			path: '/keshi',
			name: '科室',
			component: keshi
		}
		,{
			path: '/hpvyimiaoyuyue',
			name: 'hpv疫苗预约',
			component: hpvyimiaoyuyue
		}
		,{
			path: '/jiankangtijian',
			name: '健康体检',
			component: jiankangtijian
		}
		,{
			path: '/zhishileixing',
			name: '知识类型',
			component: zhishileixing
		}
		,{
			path: '/xinguanyimiaoyuyue',
			name: '新冠疫苗预约',
			component: xinguanyimiaoyuyue
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/tijianbaogao',
			name: '体检报告',
			component: tijianbaogao
		}
		,{
			path: '/hpvyimiao',
			name: 'hpv疫苗',
			component: hpvyimiao
		}
		,{
			path: '/tijianyuyue',
			name: '体检预约',
			component: tijianyuyue
		}
		,{
			path: '/baogaoxinxi',
			name: '报告信息',
			component: baogaoxinxi
		}
		,{
			path: '/yuyueguahao',
			name: '预约挂号',
			component: yuyueguahao
		}
		,{
			path: '/tijianfenlei',
			name: '体检分类',
			component: tijianfenlei
		}
		,{
			path: '/jiankangriji',
			name: '健康日记',
			component: jiankangriji
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/yisheng',
			name: '医生',
			component: yisheng
		}
		]
	},
	{
		path: '/yishengRegister',
		name: '医生注册',
		component: yishengRegister
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
