<template>
  <div class="bodycenter">
      <el-form ref="loginForm" :model="form" :rules="rules" label-width="50px" class="login-box">
        <h3 class="login-title"></h3>
        <el-form-item label="账号" prop="username" :inline="true">
          <el-input type="text" placeholder="请输入账号" v-model="form.username" ></el-input>
          <!--<el-input type="text" placeholder="逆转" >{{reUsername}}</el-input>-->
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input type="text" placeholder="请输入密码" v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit('loginForm')">登录</el-button>
        </el-form-item>
      </el-form>
    <!--<el-form enctype="multipart/form-data">-->
      <!--<el-form-item>-->
        <!--<el-input type="file" name="location"></el-input>-->
        <!--<el-button>上传</el-button>-->
      <!--</el-form-item>-->
    <!--</el-form>-->

      <el-dialog title="温馨提示"
      :visible.sync="dialogVisible"
      width="30%"
      :before-close="handleClose" >
        <span>请输入账号和密码</span>
        <span slot="footer" class="dialog-footer">
          <el-button type="primary" @click="clearValidate('loginForm')">确定</el-button>
        </span>
      </el-dialog>
  </div>
</template>

<script>
    export default {
     // name: "Login";
      data(){
      return {
        form: {
          username:'zhangsan',
          password:'123'
        },
        rules:{
          username:[
            {required:true,message:'账号不能为空', trigger:'blur'},
          ],
          password:[
            {required:true,message:'密码不能为空',trigger:'blur'}
          ]
        },
        dialogVisible:false
      }
    },
      computed:{

      },
        methods:{
            onSubmit(value) {
              this.$refs[value].validate((valid) => {
                if (valid) {
                 let data = this.qs.stringify({
                    name:this.username,
                    password:this.password
                  })
                  this.$ajxa.post(
                    'api/login',
                    data,
                    {headers:{'Content-type':'application/json; charset=utf-8'}}
                  ).then((response)=>{
                    console.log(response);
                  }).catch((error)=>{
                    console.log(error);
                  })
                } else {
                  this.dialogVisible = true;
                  return false;
                }
            });
          },
          handleClose(done){
              this.$confirm('确认关闭吗?')
                .then(_ => {
                  done();
              })
            .catch(_ => {});
          },
          clearValidate(value){
              this.dialogVisible = false;
              this.$refs(value).resetFields();
          }
        }
    }
</script>

<style scoped lang="scss">
  .bodycenter{
    margin:auto;
    margin-top: 300px;
    width:300px;
  }
  .login-title{
    font-size:30px;
    color:red;
    text-align:center;
  }
</style>
