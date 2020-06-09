<template>
  <!--这是一个全局组件，上方展示的内容-->
   <div id="common" class="container">
      <div class="row">
        <div class="col-md-3">ceshi 1</div>
        <div class="col-md-3">ceshi 1</div>
        <div class="col-md-3">ceshi 1</div>
        <div class="col-md-3">ceshi 1</div>
      </div>
   </div>
</template>

<script>
  export default{}
</script>
<!--scoped 相当于作用域-->
<style scoped>
  #common{
    color:#761C19;
    line-height: 60px;
  }
</style>
