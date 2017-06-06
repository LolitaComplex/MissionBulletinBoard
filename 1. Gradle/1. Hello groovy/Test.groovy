print "hello groovy!"

def int i = 100
def short s = 10
def byte b = 1
def long l = 1000
def char c = 'a'
def float f = 1.0
def double d = 1.0212
def boolean boo = true

def String stc = "我的名字"
def int[] arr = [2, 3, 4]
println i + "\t" + 
    s + "\t" + 
    b + "\t" + 
    l + "\t" + 
    c + "\t" + 
    f + "\t" + 
    d + "\t" + 
    boo + "\t" 

println stc + "\t " + arr
println getString("铃仙-优昙华院-因幡");
println(getName())

String getString(arg){
    return "你的名字：" + arg;
}

def getName(){
    "上白泽慧音";
}
