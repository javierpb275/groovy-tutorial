try {
    int i = 1/0;
} 
catch(ArithmeticException exp1) {
    println "inside arithmetic exception block";
    println exp1.getCause();
    println exp1.getMessage();
    //exp.printStackTrace();
} 
catch(Exception exp2) {
    println "inside exception block";
    println exp2.getCause();
    println exp2.getMessage();
    //exp.printStackTrace();
} 
finally {
    println 'THE END'
}