package com.huasisoft;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==================欢迎进入ATM系统=======================");
            System.out.println("登录请输入1，注册请输入2");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> login(accounts, sc);
                    case 2 -> register(accounts, sc);
                    case -1 -> System.exit(0);
                    default -> System.out.println("输入错误");
                }
            } catch (Exception e) {
                System.out.println("输入错误");
                sc.next();
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================欢迎进入登陆页面=====================");
        if (accounts.size() == 0) {
            System.out.println("请先注册");
            return;
        }

        // 输入卡号
        System.out.println("请输入卡号");
        String cardNumber = sc.next();

        // 根据卡号获取账户
        Account account = getAccountByCardNumber(accounts, cardNumber);
        if (account == null) {
            System.out.println("卡号不存在");
            return;
        }


        // 输入密码
        System.out.println("请输入密码");
        while (true) {
            String password = sc.next();
            // 判断密码是否正确
            if (!account.getPassword().equals(password)) {
                System.out.println("密码错误");
            } else {
                break;
            }
        }


        // 登录成功
        System.out.println("登录成功");
        showActionPage(accounts, sc, account);
    }


    // 登陆后的展示操作页
    private static void showActionPage(ArrayList<Account> accounts, Scanner sc, Account account) {
        System.out.println("==================欢迎进入ATM系统=======================");
        try {
            while (true) {
                System.out.println("查询余额请输入1，存款请输入2，取款请输入3，转账请输入4，修改密码请输入5，注销账户输入6，退出请输入-1");
                System.out.println("请输入操作：");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> queryBalance(account);
                    case 2 -> deposit(account, sc);
                    case 3 -> withdraw(account, sc);
                    case 4 -> transfer(accounts, account, sc); // 转账
                    case 5 -> changePassword(accounts, account, sc);
                    case 6 -> cancelAccount(accounts, account, sc);
                    case -1 -> System.exit(0);
                    default -> System.out.println("输入错误");
                }
            }
        } catch (Exception e) {
            System.out.println("输入错误");
        }
    }

    /**
     * 注销账户
     *
     * @param account 当前账户
     * @param sc      Scanner
     */
    private static void cancelAccount(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("请输入密码：");
        String password = sc.next();
        if (!account.getPassword().equals(password)) {
            System.out.println("密码错误");
            return;
        }
        System.out.println("请输入卡号：");
        String cardNumber = sc.next();
        if (!account.getCardNumber().equals(cardNumber)) {
            System.out.println("卡号错误");
            return;
        }
        System.out.println("请输入用户名：");
        String username = sc.next();
        if (!account.getUsername().equals(username)) {
            System.out.println("用户名错误");
            return;
        }

        accounts.remove(account);
        System.out.println("注销成功");

        // 打印账户信息
        printAccount(accounts);
    }

    /**
     * 修改密码
     *
     * @param account 当前账户
     * @param sc      Scanner
     */
    private static void changePassword(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("请输入新密码：");
        String newPassword = sc.next();
        account.setPassword(newPassword);
        System.out.println("修改密码成功");

        // 打印账户信息
        printAccount(accounts);
    }

    // 转账
    private static void transfer(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("请输入对方卡号：");
        String cardNumber = sc.next();
        Account otherAccount = getAccountByCardNumber(accounts, cardNumber);
        if (otherAccount == null) {
            System.out.println("卡号不存在");
            return;
        }

        System.out.println("请输入转账金额：");
        double money = sc.nextDouble();
        if (money > account.getBalance()) {
            System.out.println("余额不足");
            return;
        }
        account.setBalance(account.getBalance() - money);
        otherAccount.setBalance(otherAccount.getBalance() + money);
        System.out.println("转账成功");
        System.out.println("您的余额为：" + account.getBalance());

        // 打印账户信息
        printAccount(accounts);
    }

    private static void deposit(Account account, Scanner sc) {
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        account.setBalance(account.getBalance() + money);
        System.out.println("存款成功");
        System.out.println("您的余额为：" + account.getBalance());
    }

    // 取款
    private static void withdraw(Account account, Scanner sc) {
        System.out.println("请输入取款金额：");
        double money = sc.nextDouble();
        if (money > account.getBalance()) {
            System.out.println("余额不足");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("取款成功");
        System.out.println("您的余额为：" + account.getBalance());
    }

    private static void queryBalance(Account account) {
        System.out.println("您的余额为：" + account.getBalance());
    }


    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================欢迎进入注册页面=====================");
        Account account = new Account();

        System.out.println("请输入用户名：");
        String username = sc.next();
        account.setUsername(username);

        System.out.println("请输入密码：");
        String password = sc.next();

        System.out.println("请再次输入密码：");
        while (true) {
            String password2 = sc.next();
            if (!password.equals(password2)) {
                System.out.println("两次密码不一致，请重新输入");
            } else {
                break;
            }
        }
        account.setPassword(password);

        // 生成卡号
        String cardNumber = generateCardNumber();
        // 判断卡号是否存在
        Account ac = getAccountByCardNumber(accounts, cardNumber);
        while (ac != null) {
            cardNumber = generateCardNumber();
            ac = getAccountByCardNumber(accounts, cardNumber);
        }
        account.setCardNumber(cardNumber);


        System.out.println("注册成功");
        System.out.println("您的卡号为：" + cardNumber);


        // 存入余额
        System.out.println("请输入存入金额：");
        double balance = sc.nextDouble();
        System.out.println("存入金额为：" + balance + "元");
        account.setBalance(balance);
        System.out.println("存入成功");


        // 添加到集合
        accounts.add(account);


        // 打印账户信息
        printAccount(accounts);
    }


    // 生成卡号
    private static String generateCardNumber() {
        return "622848" + (int) (Math.random() * 1000000000);
    }

    /**
     * 根据卡号获取账户
     *
     * @param accounts   全部账户
     * @param cardNumber 卡号
     * @return Account | null
     */
    private static Account getAccountByCardNumber(ArrayList<Account> accounts, String cardNumber) {
        for (Account ac : accounts) {
            if (ac.getCardNumber().equals(cardNumber)) {
                return ac;
            }
        }
        return null;
    }

    /**
     * 打印账户信息
     *
     * @param accounts 账户集合
     */
    private static void printAccount(ArrayList<Account> accounts) {
        System.out.println("用户名\t密码\t卡号\t余额");
        accounts.forEach(a -> {
            System.out.print(a.getUsername());
            System.out.print('\t' + a.getPassword());
            System.out.print('\t' + a.getCardNumber() + '\t');
            System.out.print(a.getBalance());
            System.out.println();
        });
    }


}
