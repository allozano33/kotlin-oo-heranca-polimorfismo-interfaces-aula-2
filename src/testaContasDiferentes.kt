fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupança ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupança ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo cc após transferencia para poupança ${contaCorrente.saldo}")
    println("saldo cc após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo cc após transferencia para conta corrente ${contaPoupanca.saldo}")
    println("saldo cc após receber transferencia: ${contaCorrente.saldo}")
}