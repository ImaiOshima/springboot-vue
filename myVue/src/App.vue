<template>
  <div>
    <router-view></router-view>
    <!--<p>{{numCount}}</p>-->
    <!--<p>{{count}}</p>-->
    <!--<el-button type="primary" @click="increment"> + </el-button>-->
    <!--<el-button type="danger" @click="del"> - </el-button>-->
  </div>
</template>

<script>
  import {mapState,mapGetters} from 'vuex'
export default {
  name: 'App',
  computed:{
    ...mapGetters({
      numCount: 'doneTodos',
     count: 'getNum'
    })
  },
  methods:{
    increment(){
      this.$store.commit('increment');
    },
    del(){
      if(this.count > 0 ){
      this.$store.commit('del');
      }
    }
  }
}
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
