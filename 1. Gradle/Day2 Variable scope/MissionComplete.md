1. 变量的作用域

前提：我们研究这个问题可以把编译groovy的文件反编译为Java文件，来确定变量的作用域。`groovyc`命令为编译命令

**Coding：**
1. [创建实例变量](1.%20Decompilation/Decompilation.groovy)
2. [反编译后内存的真实情况](1.%20Decompilation/DecompileClass.java)
3. [验证是否是实例变量](1.%20Decompilation/Test.groovy)

**Result：**
创建一个真正的成员变量需要通过`@Field x = 3`这种方式

2. IO操作
[File文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/File.html)
[InputStream文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/InputStream.html)
[OutputStream文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/OutputStream.html)
[Reander文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/Reader.html)
[Writer文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/Writer.html)
[Path文档](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/Writer.html)：貌似与nio有关系

3. Xml解析使用GPath