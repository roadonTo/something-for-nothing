import axios from 'axios'
import path from './path.js'

const service = axios.create({
	baseURL: path.baseUrl,
	timeout: 1000
})

export default service
