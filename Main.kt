fun main() {
    printName("Sam","Smith")
    greeting("Mary")
    sentence("Sam", 2005, "Plumber")
    position("Avocado")
    word("Joburg", "Joburg")
    blank("", " ")
    myName(" Patience ")
    function("A big Stone Hit The Big Bird")
    }


fun printName(fname:String,lname:String){
    val fullName = "$fname $lname" //instead of using + we use dollar sign
    println(fullName)
}
fun greeting(name:String){
    println("Hello $name")
}
  fun sentence(name: String,year:Int, profession:String){
      println("$name, born in $year is a $profession")

  }
fun position(fruit:String){
    println(fruit[0])
    println(fruit[1])
    println(fruit[2])
    println(fruit[3])
    println(fruit[4])
    println(fruit[5])
    println(fruit[6])
    println(fruit.indexOf("v"))
    println(fruit.indexOf("o"))

}
fun word(city: String, town: String){
    println(city==town)
    println(city.equals(town))
    println(city.uppercase())
    println(city.lowercase())

}
fun blank(emptyString: String,blankString: String){
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(emptyString.isBlank())
    println(blankString.isBlank())

}
fun myName(name: String){
    println(name)
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())

}
fun function(sent:String){
    println(sent.replace("g", "b"))
    println(sent.split(""))
    println(sent.split("i"))
}













