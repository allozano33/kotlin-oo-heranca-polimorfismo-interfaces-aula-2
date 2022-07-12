package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: br.com.alura.bytebank.modelo.Autenticavel, senha: Int) {
        if (admin.autentica(senha)){
            println("Bem Vindo ao Bytebank")
        } else {
            println("Falha na Autenticação")
        }
    }
}