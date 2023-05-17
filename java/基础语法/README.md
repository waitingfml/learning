# 基础语法

## 基本语法
编写 Java 程序时，应注意以下几点：

* 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
* 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
* 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
* 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
* 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。


## Java 标识符
Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

关于 Java 标识符，有以下几点需要注意：

* 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
* 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
* 关键字不能用作标识符
* 标识符是大小写敏感的
* 合法标识符举例：age、$salary、_value、__1_value
* 非法标识符举例：123abc、-salary

### Java修饰符
像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：

* 访问控制修饰符 : default, public , protected, private
* 非访问控制修饰符 : final, abstract, static, synchronized
在后面的章节中我们会深入讨论 Java 修饰符。

## Java 变量
Java 中主要有如下几种类型的变量
* 局部变量
* 类变量（静态变量）
* 成员变量（非静态变量）


## Java 数组
数组是储存在堆上的对象，可以保存多个同类型变量。在后面的章节中，我们将会学到如何声明、构造以及初始化一个数组。

## Java 枚举
Java 5.0引入了枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的 bug。

例如，我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。

```
class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
   FreshJuiceSize size;
}
 
public class FreshJuiceTest {
   public static void main(String[] args){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
   }
}
```

注意：枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义。


## Java 关键字
下面列出了 Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称。

类别	关键字	说明
访问控制	private	私有的
protected	受保护的
public	公共的
default	默认
类、方法和变量修饰符	abstract	声明抽象
class	类
extends	扩充,继承
final	最终值,不可改变的
implements	实现（接口）
interface	接口
native	本地，原生方法（非 Java 实现）
new	新,创建
static	静态
strictfp	严格,精准
synchronized	线程,同步
transient	短暂
volatile	易失
程序控制语句	break	跳出循环
case	定义一个值以供 switch 选择
continue	继续
do	运行
else	否则
for	循环
if	如果
instanceof	实例
return	返回
switch	根据值选择执行
while	循环
错误处理	assert	断言表达式是否为真
catch	捕捉异常
finally	有没有异常都执行
throw	抛出一个异常对象
throws	声明一个异常可能被抛出
try	捕获异常
包相关	import	引入
package	包
基本类型	boolean	布尔型
byte	字节型
char	字符型
double	双精度浮点
float	单精度浮点
int	整型
long	长整型
short	短整型
变量引用	super	父类,超类
this	本类
void	无返回值
保留关键字	goto	是关键字，但不能使用
const	是关键字，但不能使用