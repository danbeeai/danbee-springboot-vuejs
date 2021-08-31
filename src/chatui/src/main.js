import 'babel-polyfill'
import Vue from 'vue'
//import chatBtn from './chatBtn.vue'
import chatBody from './chatBody.vue'
import VueAgile from 'vue-agile'

Vue.use(VueAgile);

Vue.config.productionTip = false

console.log("%cdanbee.Ai", "color: #ffc629; font-family: sans-serif; font-size: 4.5em; font-weight: bolder; text-shadow: #000 1px 1px;");

new Vue({
  el: '#container',
  render(h) {
    //return h(chatBtn, {props: this.nodeProperties()});
    return h(chatBody, {props: this.nodeProperties()});
  },
  methods: {
    nodeProperties() {
      let props = {};
      Array.prototype.forEach.call(this.$el.attributes, (node) => {
        //console.log('node.name : ' + node.name + ', node.value : ' + node.value);
        props[node.name] = node.value;
      });
      return props;
    },
  }
});
