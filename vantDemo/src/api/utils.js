import request from './request.js'

const api = {}

api.getDetails = () => {  //不带参数的get请求
	return request({
		url: 'demo/getByPage',
		methods: 'get'
	})
}

api.getIndexByxxx = (data) => {  //带一个参数的get请求
	return request({
		url: 'demo/getIndexByxxx?fydm=' + data,
		method: 'get'
	})
}

api.getxxListByPage = (pageNo, pageSize) => {  //带两个参数的get请求，且加了headers
	return request({
		url: 'jsc/getxxListByPage?pageNo=' + pageNo + '&pageSize=' + pageSize,
		method: 'get',
		headers: {
			'Content-Type': 'application/x-www-form-urlencoded'
		}
	})
}

api.getRylbByxxx = (data) => {  //post方式请求
	return request({
		url: 'demo/getRylbByxxx',
		method: 'post',
		data: data
	})
}


/* api.getFgxq = (data) => {  //带headers的post请求，但在这里写不生效，所以须在页面中写axios的方式
	return request({
		// headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
		url: 'jsc/cbfg',
		method: 'post',
		data: data
	})
}
 
	getFgxq(item) {  //这是在页面中写的带headers的方式
		let params = new URLSearchParams()
		params.append('cbfg', item.cbfg)
		axios.post(path.baseUrl + '/jsc/cbfg', params, {
		headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
		}).then(param => {

*/


export default api
