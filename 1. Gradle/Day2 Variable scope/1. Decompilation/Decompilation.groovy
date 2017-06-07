//执行语句
print "藤原妹红"

//情况1：调用printX()会报错
def x = 1;
def printX(){
    print x;
}

//情况2：正解是这样，不要定义类型或者def
y = 2;
def printY(){
    print y;
}


printY();
//情况3：真正的成员变量创建
import groovy.transform.Field;

@Field z = 3;
def printZ(){
    print z;
}

printZ()