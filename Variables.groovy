def name = "pepe";
String name2 = "paco";
name3 = "maria";
println name;
println name2;
println 'My name is ' + name3;

println "---------------------";

//${}
println 'My name is ${name}';
println "My name is ${name}";//OK

println "---------------------";

def change = "whatever";
String change2 = "luis";
change3 = "change3"
change = 1;
change2 = 2;
change3 = 3;

println change;
println change2;
println change3;

println "------------------------";

def (a, b , c, d, e) = [1, "test", true, 24.12];
def (int a2, String b2 , boolean c2, double d2, e2) = [2, "test2", false, 12];

println "${a}, ${b}, ${c}, ${d}, ${e}"; //e = null
println "${a2}, ${b2}, ${c2}, ${d2}, ${e2}";//e2 = null

