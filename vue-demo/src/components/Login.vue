<template>
  <div class="login-container" :style="containerHeight">
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4" style="line-height: 60px;font-size: 50px;color: #fafafa;">Charon's Demo</div>
      </div>
      <div class="row" v-show="!showForgetPassword">
        <div class="col-4"></div>
        <div class="col-4" style="line-height: 50px;font-size: 20px;">
          <div :class="showLogin?'login-button active':'login-button'" @click="showLoginDiv">登录</div>
          <div :class="showRegister?'login-button active':'login-button'" @click="showRegisterDiv">注册</div>
        </div>
      </div>
      <div v-show="showLogin">
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4" style="line-height: 50px;font-size: 20px;">
            <div class="img-div">
              <input type="text" name="userName" ref="userName" id="userName" placeholder="手机号/邮箱/用户名" />
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4" style="line-height: 50px;font-size: 20px;">
            <div class="img-div password">
              <form>
                <input type="password" name="passWord" ref="passWord" id="passWord" placeholder="密码" />
               </form>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4" style="line-height: 50px;font-size: 20px;">
            <div style="display: inline-block;float: left;">
              <div style="display: inline-block;padding-top: 4px;text-align: center;vertical-align: middle;">
                <input type="checkbox" id="forgetPassWord" />
              </div>
              <label for="forgetPassWord" class="forget-password">记住密码</label>
            </div>
            <div @click="forgetPassword" style="color:#bec0c3;display: inline-block;float: right;cursor: pointer;">忘记密码?</div>
          </div>
        </div>
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4">
            <div class="login-div" @click="login">登 录</div>
          </div>
        </div>
      </div>
      <!--注册-->
      <div v-show="showRegister">
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4" style="line-height: 50px;font-size: 20px;">
            <div class="img-div">
              <input type="text" name="userName" id="userName11" placeholder="请输入您的手机号" />
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4" style="line-height: 50px;font-size: 20px;">
            <div class="img-div password">
              <input type="text" name="userName" id="userName22" placeholder="6-12位字符组合密码" />
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4">
            <div class="login-div" @click="register">注 冊</div>
          </div>
        </div>
      </div>
      <div v-show="showForgetPassword"></div>
    </div>
  </div>
</template>
<script>
  //引入MD5的js
  import {hex_md5} from "../assets/js/md5.js";

  export default {
    data() {
      return {
        containerHeight: {
          height: ''
        },
        showLogin: true,
        showRegister: false,
        showForgetPassword: false
      }
    },
    methods: {
      getHeight() {
        this.containerHeight.height = window.screen.availHeight - 72 + 'px';
      },
      showLoginDiv() {
        //点击登录tab显示登录页面
        this.showLogin = true;
        this.showRegister = false;
      },
      showRegisterDiv() {
        //点击注册tab显示注册页面
        this.showLogin = false;
        this.showRegister = true;
      },
      login() {
        //验证参数
        if(!this.$refs.userName.value){
          this.$toast('用户名不能为空','error');
        }
        if(!this.$refs.passWord.value){
          this.$toast('密码不能为空','error');
        }
        //点击登录按钮需要对密码进行加密--使用md5
        const password = this.$refs.passWord.value;
        const userName = this.$refs.userName.value;
        const md5Password = hex_md5(password);
        this.$refs.passWord.value = md5Password;
        // 通过axios实现登录功能
        this.$axios.post('http://localhost:8082/web/login',{userName,md5Password}).then(function(res){
            this.$toast("登录成功","success");
        }).catch(function (error) {
             this.$toast("登录成功,用户名或密码不正确","error");
        });
      },
      register() {

      },
      forgetPassword(){
          window.location.href = "";
      }
    },
    created() {
      window.addEventListener('resize', this.getHeight());
      this.getHeight();
    }
  }
</script>
<style scoped>
  .row {
    margin-top: 20px;
    margin-bottom: 20px;
  }

  .login-container {
    background-image: url(../assets/img/bg.png);
    padding-top: 10%;
  }

  .login-button {
    width: 49%;
    display: inline-block;
    background-color: #384148;
    opacity: 0.6;
    color: #6c757c;
    font-weight: bold;
    cursor: pointer;
  }

  .active {
    color: #17c29b;
    background-color: #272b34;
    opacity: 0.8;
  }

  .img-div {
    width: 100%;
    background-color:#475361;
    background-image: url(../assets/img/user-name.png);
    background-position: 10px;
    background-repeat: no-repeat;
    height: 100%;
    background-size: 40px 40px;
  }

  .password {
    background-image: url(../assets/img/pass-word.png);
  }

  input[type='text'],
  input[type="password"] {
    width: calc(100% - 60px);
    float: right;
    background-color: #475361;
    color: #909ba7;
    border: 0px;
  }

  .forget-password {
    color: #bec0c3;
    cursor: pointer;
  }

  .login-div {
    line-height: 50px;
    font-size: 20px;
    color: #FFF;
    background-color: #1ab392;
    border-radius: 7px;
    font-weight: bold;
    cursor: pointer;
  }

  input[type=checkbox] {
    padding: 0;
    width: 20px;
    height: 20px;
  }
</style>
