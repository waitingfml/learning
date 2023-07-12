package com.huasisoft.d1_static_util;

import java.util.Random;

public class HSCheck {

    private HSCheck() {
    }

    public static StringBuilder createCode(int num) {
        // 开发一个验证码工具类
        // 1. 生成验证码
        StringBuilder code = new StringBuilder();

        // 2. 验证码字符
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random r = new Random();
        for (int i = 0; i < num; i++) {
            // 3. 随机获取字符
            char c = data.charAt(r.nextInt(data.length()));
            // 4. 拼接字符
            code.append(c);
        }
        System.out.println(code);
        return code;
    }
}
