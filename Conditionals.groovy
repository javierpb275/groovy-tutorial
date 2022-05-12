//if else if else
def num = 0;

if (num > 0)
    println "num is bigger than 0";
else if (num == 0)
    println "num is equal to 0";
else 
    println "num is less than 0";


//switch
def x = 10;
def result = "";

switch(x) {
    case 0:
        result = "x is zero";
        break;
    case {x>0}:
        result = "x is bigger than zero";
        break;
    case {x<0}:
        result = "x is less than zero";
        break;
    default:
        result = "Invalid number";
}

println result;