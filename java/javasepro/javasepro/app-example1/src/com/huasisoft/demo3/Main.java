package com.huasisoft.demo3;

import java.util.Random;

/**
 * 需求:
 * 定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 * 分析:
 * 定义一个方法，生成验证码返回:方法参数是位数、方法的返回值类型是String。
 * 在方法内部使用for循环生成指定位数的随机字符，并连接起来。
 * 把连接好的随机字符作为一组验证码进行返回。
 */
public class Main {
    public static void main(String[] args) {
        // 调用方法，生成一个5位的验证码
        String code = generateCode(5);
        // 打印验证码
        System.out.println(code);

        // 调用方法，生成一个10位的验证码
        String code2 = generateCode(10);
        // 打印验证码
        System.out.println(code2);


        // 调用方法，生成一个5位的验证码
        String code3 = generateCode2(5);
        // 打印验证码
        System.out.println(code3);


        // 调用方法，生成一个10位的验证码
        String code4 = generateCode2(10);
        // 打印验证码
        System.out.println(code4);


        System.out.println('A' + 0);
        System.out.println('A' + 1);
        System.out.println('A' + 2);
        System.out.println('A' + 3);
    }

    // 定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
    public static String generateCode(int length) {
        // 定义一个字符串，保存验证码
        StringBuilder code = new StringBuilder();
        // 定义一个字符串，保存所有可能的字符
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // 随机产生5个字符

        // 产生一个随机数，作为字符的索引
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int index = r.nextInt(chars.length());
            // 根据索引获取字符，并连接到验证码上
            code.append(chars.charAt(index));
        }
        // 返回验证码
        return code.toString();
    }


    public static String generateCode2(int length) {
        // 定义一个字符串，保存验证码
        StringBuilder code = new StringBuilder();

        // 产生一个随机数，作为字符的索引
        Random r = new Random();


        // ASCII码 A-Z 65-90 、a-z 97-122、0-9 48-57
        for (int i = 0; i < length; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0 -> {
                    // 产生一个随机数，作为数字的索引
                    int index = r.nextInt(10);
                    // 根据索引获取数字，并连接到验证码上
                    code.append(index);
                }
                case 1 -> {
                    // 产生一个随机数，作为大写字母的索引
                    int index2 = r.nextInt(26);
                    // 根据索引获取大写字母，并连接到验证码上
                    code.append((char) ('A' + index2));
                    // 65 + 0-25 = 65-90 A-Z 说明：A + 0-25 = A-Z 的ASCII码；
                    // char 强制转换 int 会自动转换成 数字在ASCII码表中对应的字符
                }
                case 2 -> {
                    // 产生一个随机数，作为小写字母的索引
                    int index3 = r.nextInt(26);
                    // 根据索引获取小写字母，并连接到验证码上
                    code.append((char) ('a' + index3)); // 97 + 0-25 = 97-122 a-z 说明：a + 0-25 = a-z 的ASCII码
                }
            }
        }
        return code.toString();
    }


    public static String createCode(int n) {
        // 3、定义一个字符串变量记录生成的随机字符
        StringBuilder code = new StringBuilder();
        Random r = new Random();
        // 2、定义一个for循环，循环n次，依次生成随机字符

        for (int i = 0; i < n; i++) {
            // 3、生成一个随机字符:英文大写小写数字(012)
            int type = r.nextInt(3); // 0 1 2

            // ASCII码 A-Z 65-90 、a-z 97-122、0-9 48-57
            switch (type) {
                case 0 -> {
                    // 大写字符(A65-Z65+25)(8-25)+65
                    char ch = (char) (r.nextInt(26) + 65);
                    code.append(ch);
                }
                case 1 -> {
                    // 小写字符(a97-z97+25)(025)+97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code.append(ch1);
                }
                case 2 ->
                    // 数字字符(0-9)
                    code.append(r.nextInt(10));//0-9
            }

        }
        return code.toString();
    }
}