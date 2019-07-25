import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);
const state={   //要设置的全局访问的state对象
  todos:[
    {id:1,text:'...',done:true},
    {id:2,text:'...',done:false}
  ],
  changableNum:0
  //要设置的初始属性值
};
const getters = {   //实时监听state值的变化(最新状态)
  doneTodos:state=>{
    return state.todos.length;
  },
  getNum:state=>{
    return state.changableNum;
}
};
const mutations = {
  increment(state){
    state.changableNum ++;
  },
  del(state){
    state.changableNum --;
  }
};
const store = new Vuex.Store({
  state,
  getters,
  mutations
});
export default store;
