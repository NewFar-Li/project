package com.xr.util;

import com.xr.entity.Dept;
import java.util.ArrayList;
import java.util.List;

public class DeptGroupUtil {
    /**
     * 查找一级部门
     * @param list
     * @return
     */
    public List<Dept> getFirstDept(List<Dept> list){
        //定义一个集合，放一级部门
        List<Dept> firstList = new ArrayList<>();
        for(Dept m:list) {
            // 父级部门的id为0的是一级部门
            if(m.getParentId().longValue()==0) {
                //调用下面的递归方法查找所有的子部门
                m.setItems(getItems(new Long(m.getId()),list));
                //一级部门加入到集合
                firstList.add(m);
            }
        }
        return firstList;
    }

    /**
     * 根据一级部门的id查找里面所有的子部门，包含递归算法
     * @param pid
     * @param list
     * @return
     */
    public List<Dept> getItems(Long pid,List<Dept> list){
        List<Dept> secondList = new ArrayList<Dept>();
        for(Dept m:list) {
            //是一级部门，不需要加进去
            if(m.getParentId().longValue()==0) {
                continue;
            }
            //如果当前部门的父id和传过来的一致，就可以直接加到集合里
            //Long类型对象比较相等需要使用longValue获取之后再来比较
            if(m.getParentId().longValue()==pid.longValue()) {
                m.setItems(getItems(m.getId(),list));
                secondList.add(m);
            }
        }
        return secondList;
    }
}
