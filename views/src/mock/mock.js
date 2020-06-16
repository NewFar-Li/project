import Mock from 'mockjs'
// 模拟用户数据
Mock.mock('http://localhost:9527/user', {
  data: {
    'name': '@name', // 随机生成姓名
    'email': '@email',
    'age|1-10': 5 // 区间取值
  }
});
// 模拟菜单数据
Mock.mock('http://localhost:9527/menu', {
  data: {
    'id': '@increment', // 自动增长
    'name': 'menu',
    'order|10-20': 12
  }
});
// 模拟菜单数据
Mock.mock('http://localhost:8080/login', {
  data: {
    'token': '12345678'
  }
  // 其他数据
});
