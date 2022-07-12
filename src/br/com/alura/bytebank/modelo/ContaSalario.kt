package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: String,
    numero: Int
) : br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
){

   override fun saca(valor: Double){
        if(saldo > valor)
        saldo -= valor
      }
    }


