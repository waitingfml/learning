package com.huasisoft.d1_static;

public class Demo1 {
    public static void main(String[] args) {

        // 通过类名访问静态变量
        System.out.println(User.onlineCount); // 0

        // 通过对象访问静态变量
        // 1. 创建对象
        User u1 = new User();
        // 2. 修改静态变量
        u1.onlineCount = 100; // 不建议，不符合规范，不建议通过对象访问静态变量
        // 3. 打印静态变量
        System.out.println(u1.onlineCount); // 300

        User.test();

        u1.test(); // 不建议


        // static修饰成员方法的基本用法
        // 通过类名访问静态方法
        User.test(); // 通过类名访问静态方法
        // 通过对象访问静态方法
        u1.test(); // 不建议，不符合规范，不建议通过对象访问静态方法
        //

        // static的注意事项
        // 1. 静态方法只能访问静态变量
        // 2. 静态方法不能访问非静态变量
        // 3. 静态方法不能访问非静态方法
        // 4. 非静态方法可以访问静态变量
        // 5. 非静态方法可以访问非静态变量
        // 6. 非静态方法可以访问静态方法
        // 7. 静态方法不能使用this关键字
        // 8. 静态方法不能使用super关键字
        // 9. 静态方法不能使用return关键字
        // 10. 静态方法不能使用break关键字
        // 11. 静态方法不能使用continue关键字
        // 12. 静态方法不能使用try...catch...finally关键字
        // 13. 静态方法不能使用throw关键字
        // 14. 静态方法不能使用throws关键字
        // 15. 静态方法不能使用synchronized关键字
        // 16. 静态方法不能使用abstract关键字
        // 17. 静态方法不能使用native关键字
        // 18. 静态方法不能使用final关键字
        // 19. 静态方法不能使用strictfp关键字
        // 20. 静态方法不能使用private关键字
        // 21. 静态方法不能使用protected关键字
        // 22. 静态方法不能使用default关键字
        // 23. 静态方法不能使用public关键字
        // 24. 静态方法不能使用volatile关键字
        // 25. 静态方法不能使用transient关键字
        // 26. 静态方法不能使用interface关键字
        // 27. 静态方法不能使用enum关键字
        // 28. 静态方法不能使用class关键字
        // 29. 静态方法不能使用extends关键字
        // 30. 静态方法不能使用implements关键字
        // 31. 静态方法不能使用instanceof关键字
        // 32. 静态方法不能使用new关键字
        // 33. 静态方法不能使用switch关键字
        // 34. 静态方法不能使用case关键字
        // 35. 静态方法不能使用do...while关键字
        // 36. 静态方法不能使用if...else关键字
        // 37. 静态方法不能使用for关键字
        // 38. 静态方法不能使用while关键字
        // 39. 静态方法不能使用goto关键字
        // 40. 静态方法不能使用const关键字
        // 41. 静态方法不能使用assert关键字
        // 42. 静态方法不能使用strictfp关键字
        // 43. 静态方法不能使用import关键字
        // 44. 静态方法不能使用package关键字
    }
}
