
fun main(){
    val person = Human("Levin",20,62)
    person.eat(1)
    println(person.weight)
    person.speak("Hello world!")
    person.birthday()
    person.age
    val data = identity("Zipporah","Nganga","znw@gmail.com","0712345678","124ft!")
    println(data.firstName)
    println(data.lastName)
}
class Human( var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
        return weight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }
}
data class identity(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}