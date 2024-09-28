<template>
  <div class="home">
    <div>
      <ul>
        <li v-for="(item, index) in bots" :key="index">
          <div>名称：{{ item.name }} 战力：{{ item.rating }}</div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import $ from 'jquery';
import {ref} from 'vue';

export default {
  name: 'HomeView',
  components: {
  },
  setup: () => {
    let bots = ref("");
    $.ajax({
      url:"http://localhost:8081/pk/getinfo/hi/",
      type:"get",
      success: resp=>{
        bots.value = resp;
        console.log(typeof(bots.value));
        console.log(bots);
      }
    })
    return {
      bots
    }
  }
}
</script>
