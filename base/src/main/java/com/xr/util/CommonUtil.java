package com.xr.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

public class CommonUtil {
    /**
     * 产生盐值
     * @return
     */
    public static String getSalt(){
        //生成盐需要存入数据库中的
        String salt =new SecureRandomNumberGenerator().nextBytes().toHex();
        return salt;
    }

    /**
     * 根据盐值和原始密码MD5加密n次
     * @param originalPassword 原始密码
     * @param salt 盐
     * @param n 次数
     * @return
     */
    public static String getMD5Password(String originalPassword,String salt,Integer n){
        String md5Password = new Md5Hash(originalPassword,salt,n).toString();
        return md5Password;
    }

    // 测试
    public static void main(String[] args) {
        //生成盐（部分，需要存入数据库中）
        String salt = "5335955735497b7611098e5ab516f7df";// getSalt();
        System.out.println(salt);
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String pwd = getMD5Password("lisi123",salt,2);
        System.out.println(pwd);
    }
}
