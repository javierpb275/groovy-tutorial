//Arithmetic operators
//asserts: checks if it is true amd if it is, it does nothing but if it is false, 
//it prints in the console assertion failed and tells you where the error is.
assert 1 + 2 == 3;
assert 4 - 3 == 1;
assert 3 * 5 == 15;
assert 3 / 2 == 1.5;
assert 10 % 3 == 1;
assert 2 ** 3 == 8;

assert 9.intdiv(5) == 1;
assert 2.2.plus(1.1) == 3.3;

println "==========================";

//Unary operators
assert +3 == 3;
assert -4 == 0 - 4;
assert -(-1) == 1;

println "==========================";

//Increment ++ & Decrement --
int i = 10;
println i++;//10
println (++i);//12
int i2 = 10;
println i2--;//10
println (--i2);//8

println "==========================";

//Assignment arithmetic operators
def a = 4
a += 3;
assert a == 7;

def b = 5
b -= 3;
assert b == 2;

println "==========================";

//Relational operators
assert 1 + 2 == 3;
assert 3 != 4;

assert -2 < 3;
assert 2 <= 2;
assert 3 <= 4;

assert 5 > 1;
assert 5 >= -2;

println "==========================";

//Logical operators
assert !false;
assert true && true;
assert true || false;

println "==========================";

//Precedence
assert (!false && false) == false;
assert true || true && false;

println "==========================";

//Bitwise operators
int c = 20;
int d = 25;
println (c & d) //16

println Integer.toBinaryString(20)//10100
println Integer.toBinaryString(25)//11001
                                  // 10000
println Integer.parseInt("10000", 2)//16

println "==========================";

//Conditional operators
assert (!true) == false;
assert (!'foo') == false;
assert (!'') == true; 

println "==========================";

//Ternary operator
output = (1>2) ? "1 IS greater" : "1 is NOT greater";
println output;