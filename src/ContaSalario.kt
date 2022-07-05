class ContaSalario(
    titular: String,
    numero: Int
){
    var saldo = 0.0
    private set

    fun deposita(valor: Double){
       if (valor > 0)
           this.saldo += valor
    }
        fun saca(valor: Double){
        if(saldo > valor)
        saldo -= valor
      }
    }


