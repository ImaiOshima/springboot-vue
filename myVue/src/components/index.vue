<template>
  <div>
    <el-container>
      <el-header>
        <Header></Header>
      </el-header>
      <el-main>Main</el-main>
      <el-footer>Footer</el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "@/components/Header"
    export default {
        name: "index",
        components:{
          Header
        }
    }
</script>

<style scoped lang = "scss">
  $width:400px;
  $height:100px;
  $color: white;
  .el-container{
    font-size:30px;
    color:red;
    width:100%;
  }
  .el-main{
    height:400px;
  }
</style>
