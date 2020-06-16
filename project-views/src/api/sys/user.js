import request from '@/utils/request'
// 添加用户
export function add(data) {
  return request({
    url: '/user/add',
    method: 'post',
    data
  })
}

// 根据id删除用户
export function deleteUser(id) {
  return request({
    url: '/user/delete',
    method: 'get',
    params: { id }
  })
}

// 修改用户
export function update(data) {
  return request({
    url: '/user/update',
    method: 'post',
    data
  })
}

// 根据用户对象进行查询用户
export function list(data) {
  return request({
    url: '/user/list',
    method: 'post',
    data
  })
}
