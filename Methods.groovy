def printHello() {
    println "Hello";
}

def sum(int a, int b = 20) {
    println "Sum is " + (a+b);
}

def sub(int a, int b) {
    def c = a - b;
    return c;
}

printHello()
sum(2, 2);
sum(5);
println sub(5, 2);