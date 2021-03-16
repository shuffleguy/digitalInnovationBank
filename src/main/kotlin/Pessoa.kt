package one.digitalinnovation.digionebank
class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.456.789-10"
        private set

    inner class Endereco{

        var rua: String = "Rua teste"
    }

}
fun main(){

    val clientename = Pessoa()

    println(clientename.nome)
    println(clientename.cpf)
    println(clientename.Endereco().rua)//inner class chamada

}