//byte
byte b = 10;
println b;
println Byte.MIN_VALUE;//-128
println Byte.MAX_VALUE;//127
println "================================";

//short
short s = 100;
println s;
println Short.MIN_VALUE;//-32768
println Short.MAX_VALUE;//32767
println "================================";

//int
int i = 1000;
println i;
println Integer.MIN_VALUE;//-2147483648
println Integer.MAX_VALUE;//2147483647
println "================================";

//long
long l = 1000000L;
println l;
println Long.MIN_VALUE;//-9223372036854775808
println Long.MAX_VALUE;//9223372036854775807
println "================================";

//float
float f = 100.002F;
println f;
println Float.MIN_VALUE;//1.4E-45
println Float.MAX_VALUE;//3.4028235E38
println "================================";

//double
double d = 1000.0002;
println d;
println Double.MIN_VALUE;//4.9E-324
println Double.MAX_VALUE;//1.7976931348623157E308
println "================================";

//char
char c = 'A'
println c;
println "================================";

//boolean
boolean truth = true;
boolean lie = false;
println truth;
println lie;
println "================================";

//String
String groovy = 'Groovy'
println groovy;
println "================================";

//casting
def test = (byte)10;
println test.getClass().getName();//java.lang.Byte