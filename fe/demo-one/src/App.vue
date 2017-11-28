<template>
  <div id="app">
    Hello,{{name}}
  </div>
</template>

<script>
  export default {
    name: 'app',
    data () {
      return {
        name: '您的名字还未加载出来哦~~'
      }
    },
    mounted () {
      this.getData()
    },
    methods: {
      getData () {
        this.$http.get('http://localhost:8089/demo1/index.json').then((res) => {
          console.log(res)
          if (res.status === 200) {
            this.name = res.data.name
          } else {
            this.name = '状态码不是200哦~后台返回出错啦~'
          }
        }).catch((err) => {
          console.log(err)
          this.name = '未知错误F12查看一下'
        })
      }
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
