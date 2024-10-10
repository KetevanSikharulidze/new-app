class Group (val groupName: String, val quantity:Int, var active:Boolean){
    fun details(){
        println("$groupName, $quantity, $active")
    }
}
fun main(){
    val g1 = Group("mobile apps", 27, true)
    g1.active = false
    g1.details()
}