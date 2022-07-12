package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
) : br.com.alura.bytebank.modelo.Autenticavel {
    override fun autentica(senha: Int): Boolean {
    if (this.senha == senha){
        return true
    }
        return false
    }
}