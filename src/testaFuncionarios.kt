fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")
    println("senha ${fran.senha}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val maria = Analista(
        "maria",
        "444.444.444-44",
        3000.0
    )

    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario} ")
    println("bonificacao ${maria.bonificacao}")

    val godofredo = AnalistadeIT(
        "Godofredo",
        "555.555.555-55",
        7224.0
    )
    println("nome ${godofredo.nome}")
    println("cpf ${godofredo.cpf}")
    println("salario ${godofredo.salario}")
    println("bonificação ${godofredo.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    calculadora.registra(godofredo)

    println("total de bonificação é ${calculadora.total}")
}
