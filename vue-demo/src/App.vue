<template>
  <div id="app">
    <!-- <Common :if="showCoommon"></Common> -->
    <Login></Login>
  </div>
</template>

<script>
import Login from '@/components/Login.vue'

export default {
  name: 'app',
  components: {
    'Login':Login
  },
	data(){
		return {
      "showCoommon":false
    }
	},
  mode : 'history'   //去除#号
}
</script>

<style scoped>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
