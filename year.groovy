// Ask your user for a year
// Based on the year that they give you let them know if that year was a leap year or not

println("Enter a year")
def year= System.in.newReader().readLine()
year = year as Integer

if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
    println("is a leap year")
     }else{
     println("not a leap year")
     }

// def year= System.in.newReader().readLine() as Integer