package one.digitalinnovation.digionebank
class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.456.789-10"
        private set

    fun datauni()="$nome e $cpf"
}
fun main(){

    val clientename = Pessoa()

   println(clientename.datauni())


}