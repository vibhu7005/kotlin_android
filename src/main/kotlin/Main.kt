import declarations.Employee

fun main(args: Array<String>) {
   val e1 = Employee("jordiee", "sde2", 23)
   val e2 = Employee("jordiee", "sde2", 23)
   println(e1 == e2)
   println(e1 === e2)
   //structural equaliy (yes)

}