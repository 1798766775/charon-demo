import Vue from 'vue'
import App from './App.vue'
import router from './router'
//引入全局组件
import Common from './components/Common.vue'

//引入iView的组件
import iView from 'iview'
import 'iview/dist/styles/iview.css' //使用css

//引入jquery
import $ from 'jquery'
//引入bootstrap
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import '../node_modules/bootstrap/dist/js/bootstrap.min.js'

// 全局引入Toast
import './assets/css/Toast.css';
import Toast from './assets/js/toast';
Vue.use(Toast);

//引入并配置全局的axios
import axios from 'axios'
Vue.prototype.$axios = axios;

//注册全局组件
Vue.component('Common',Common);
Vue.use(iView);

Vue.config.productionTip = false;

new Vue({
	el:'#app',
	router,
	components:{App},
	template:'<App/>'
})
