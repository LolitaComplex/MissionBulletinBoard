> [API文档](https://docs.gradle.org/current/dsl/)

# Gradle

- `gradleHomeDir`：返回Gradle工具的绝对路径
- `gradleUserHomeDir`：返回Gradle Home的绝对路径
- `gradleVersion`：返回当前Gradle版本
- `parent`：当我做一个Gradle工具类时，Parent才会返回父Gradle，否则为null
- `rootProject`：根目录Project对象
- `beforeProject(Closure)`：在解析完根目录build.gradle后，会触发该回调，闭包参数为Project对象
- `taskGraph.whenReady(Closure)`：当解析完Moudle中build.gradle后，开始具体Task之前会触发该回调，闭包参数为taskGraph指向的对象
- `buildFinished(Closure)`：在Buidle完成之前，也就是全部Task执行完毕时被回调，闭包参数为BuildResult对象
- `taskGraph.beforeTask(Closure)`：在执行任何Task之前都会被回调
- `taskGraph.afterTask(Closure)`：在执行任何Task之后都会被回调

# Project

- `rootDir`：项目根目录
- `projectDir`：项目Moudle的根目录，比如默认的app目录
- `buildDir`：当前Project在Build后的那个build文件夹就是这个对象
- `childProjects`：字面意思，子Project们
- `apply(Closure)`：申请一个插件
- `apply(Map<String,?>)`：申请一个插件，我们注册插件就是使用的这个函数，key目前常用有`plugin`和`from`

# Settings

# Script

# Task