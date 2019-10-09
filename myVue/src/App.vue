<template >
  <div>
    <div class="static" v-bind:class="{active:isActive,'text-danger':hasError}">123</div>
  </div>
</template>

<script>
import Todo from "./components/todo";
export default {
  name: 'App',
    components: {Todo},
    data:function(){
        return {
            firstName:'akb',
            lastName:'48',
            isActive:true,
            hasError:true
        }
      },
    computed:{
      fullName:{
          get:function(){
              return this.firstName +' '+ this.lastName
          },
          set:function(newValue){
              var names = newValue.splice(' ')
              this.firstName = names[0]
              this.lastName = names[names.length - 1]
          }
      }
    },
    methods:{
      reverseMessage:function(){
          this.message = this.message.split('').reverse().join('')
          this.message1 = this.message1.split('').reverse().join('')
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
