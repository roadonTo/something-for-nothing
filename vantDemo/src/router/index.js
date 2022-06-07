import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

const routes = [
	{
		path: '/',
		name: 'demo',
		component: () => import('../views/demo.vue')
	}
]

const router = new VueRouter({
	routes
})

export default router
