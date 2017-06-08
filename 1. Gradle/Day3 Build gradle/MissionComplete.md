
# Gradle各种概念

## 普通概念

1. Gradle用途：解决构建中的各种需求，比如定制Release版、Debug版、Test版
2. Gradle特点：DSL (Domain Specific Language) 领域相关语言。在于Ant、Maven对比时，Maven使用Xml进行配置，可Xml中很难描述条件语句
3. Groovy动态语言，运行时编译成Java类字节码，通过JVM执行Java类
4. Gradle编译中，每一个待编译的Moudle都是一个Project，一个Project有包含一系列的Task
5. Multi-Projects Build：其实就是指的用setting.gradle绑定全部Project在一起后编译的过程，不用分别`cd`到指定目录分别编译了

## 重要概念

![Gradle工作流程](../../image/1.%20Gradle_Workline.png)
- 初始化阶段及解析Setting.gradle文件创建Setting对象
- 配置阶段会解析每个子目录中的build.gradle，Configuration会建立一个有向图来描述Task之间的依赖关系
- 执行任务
- **Hook：** 每个阶段完结时我们都可以拿到这个调用点，添加怎么样的逻辑在此处都是我们说的算

> 接下来就是API了，我们要主要提及以下几个对象

1. Gradle对象：只执行这个Gradle流程最早时就创建了Gradle，并且在整个流程中任何阶段都是唯一的
2. Project对象：每一个build.gradle会转换为一个Project对象
3. Settings对象：显然settings.gradle会转换为一个Settings对象

**注：** 对于其他gradle文件，除非定义class，否则会转换成一个实现了Script接口的对象

# 命令

1. `gradlew project`：查看所有Project
2. `gradlew project-path:tasks`：获取指定Project中全部Task
3. `gradlew task-name`：执行任务

**注：** Task之间是可以依赖的，比如TaskA依赖TaskB，那么执行A时自动会先处理TaskB

