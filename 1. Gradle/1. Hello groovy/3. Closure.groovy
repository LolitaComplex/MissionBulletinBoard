Closure getClosure(){
    def int count = 1;
    def closure = {
        param -> param + "\t" + ++count;
    }
};

Closure closure = getClosure();

println closure("铃仙·优昙华院·因幡");
println closure("上白泽慧音");
println closure("八意永琳");

def list = [3,13,41,234,5];
list.each {
    println it
}

