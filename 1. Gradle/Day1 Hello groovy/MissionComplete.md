**1.** 熟悉Groovy基本语法

> 基本数据类型、变量定义、函数声明等

**Coding1：**[Test1](1.%20Test.groovy)

**Result1：**
- 基本数据类型与Java相同，变量前边定义需要`def`（可省略)，函数声明可定义返回值类型为`def`表示任意类型
- 每行结尾可省略`;`，函数调用可省略`()`，推荐系统函数调用省略例如`print "groovy"`
- 字符串支持较完善，又类似jQuery中`$`的语法，字符串中支持换行

----

**2.** 常用引用数据类型

**Coding2：**[Test2](2.%20Test.groovy)

**Result2:**
- 作为动态语言当然所有的事物都是对象，基本数据类型在Groovy中全是包装数据类型（空间略大）
- 容器类分为三种
    - List，一般用ArrayList作为实现类
    - Map，一般用LinkedHashMap作为实现类
    - Rnage，是List的扩展

**3.** [API文档](http://www.groovy-lang.org/api.html)

----

**4.** 闭包

> 闭包语法、特点、实际用途

**Coding3：**[Closure](3.%20Closure.groovy)

**Result3：**
1. 语法
```groovy
def closure = {
    String param1, int param2 ->
        //code
        println param1 + param2
}

//1.参数类型可省略
{
    param1, param2 ->
        println param1 + param2
}
//2.如果只有一个参数，可以省略参数列表，使用It单独表示这唯一的参数
{
    println it
}
//3.如果没有参数
{
    -> println "无参数"
}
```
> 这个闭包当做Js中定义function比较容易理解，当想定义function对象时，这时就想着定义Closure对象就好

2. 特点
- 闭包特点及回调，构思这个过程要把定义和运行两个过程分开来考虑。JS中是这样的，我作为一个对象定义在你的环境中，并引用着你的环境

3. 用途
- 可以增长某些变量生命周期、私有某些变量、统一初始化变量等的作用。例子中写了一个，这在JS中有很重要的用途
- 在Groovy中最重要的作用在于与简写规则连用，能写出脚本格式的语言
```groovy
//这段脚本中包含4处简写，两处闭包的使用
task android {
    defaultConfig {
        version 1;
    }
}
```
- `task android`: 系统函数task，省略小括号()
- `android(Closure)`: 函数android因为参数列表最后一个参数是`Closure`类型，可省略小括号
- `defultConfig(Closure)`：同上
- `version 1`：系统函数version(int)，省略小括号

```groovy
def getByName(String name, Closure closure){
    closure(name)
}

getByName("蓬莱山辉夜", {
    println it
})

getByName("蓬莱山辉夜"){
    println it
}
```
- 以上`getByName()`需要两个参数，由于第二个参数是Closure是闭包，调用时可以写成第二种样式，看起来就像声明函数，而非调用函数

```groovy 
apply plugin:'com.android.application'
```
- 实际上是 `apply([plugin:'com.android.application'])`，apply函数需要一个Map类型的参数


