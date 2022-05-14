def range = 1..10

println range //1..10
println range.size();//10
println range.getFrom();//1
println range.getTo();//10

assert range.from == 1;
assert range.to == 10;

println range.get(3)//4
println range[3]//4

for (i in range) {
    print i + " "// 1 - 10
}

println ""

range.each { i ->
    println "Value = $i"
}

println range instanceof java.util.List //true