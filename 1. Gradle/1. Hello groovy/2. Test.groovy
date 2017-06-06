// List
def list = [123, "米斯蒂娅·萝蕾拉", true, 9.8]
println list
list[10] = "八意永琳"
println list

// Map
def map = ["key1":"蓬莱山辉夜","key2":123]
println map.key1    //方式1
println map["key2"] //方式2
map.key3 = "藤原妹红" //添加方式
println map

// Range
def range = 1..10 //包含[1, 10]的List
println range
println range.from
println range.to
range = 1..<10  //包含[1, 10)的List
println range
println range[5]