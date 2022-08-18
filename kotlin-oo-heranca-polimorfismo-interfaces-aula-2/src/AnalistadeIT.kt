class AnalistadeIT(
    nome: String,
    cpf: String,
    salario: Double,

    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }
}