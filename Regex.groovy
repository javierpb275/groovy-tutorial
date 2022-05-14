def regex = /(?:[^Groovy]*)/
def match = "This is Groovy" =~ regex;

if (match) {
    def i = 0;
    while(match) {
        println match[i];
        i++;
    }
} else {
    println "NO MATCH FOUND"
}