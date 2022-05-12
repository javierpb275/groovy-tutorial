//for
for (int i = 1; i <= 5; i++) {
    println i;
}

println "========================";

//for in
for (a in 1..5) {
    println a
}

println "========================";

//upto
1.upto(5)
{
    println "$it";
}

println "========================";

//times
5.times //0 - 4
{
    println "$it";
}

println "========================";

//step
1.step(10, 2) { //1, 3, 5, 7, 9
    println "$it";
}

println "========================";

//for in
for (i in ["abc", 'A', 5, true, 1.2]) {
    println i
}

println "========================";

//iterate over a map
def map = [
    "abc": 1,
    "def": 2,
    "xyz": 3
]
x = 0;

for (e in map) {
    println e
    println e.key
    println e.value
    x += e.value;
}

println x;

println "========================";

//while
int i = 1;
while(i<=5) {
    println i;
    i=i+1;
}