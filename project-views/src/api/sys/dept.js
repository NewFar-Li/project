import request from '@/utils/request'

// 返回分好组的部门集合
export function groupDept() {
  return request({
    url: '/dept/groupDept',
    method: 'get'
  })
}
