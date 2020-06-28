fun main() {
    testaComportamentosConta()

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")


    println("==============")
    println("==============")
    println("==============")
    println("==============")

    val ana = Gerente(
        nome = "Aba",
        cpf = "111.111.111-11",
        salario = 2000.00,
        senha = 123
    )

    println("nome ${ana.nome}")
    println("cpf ${ana.cpf}")
    println("salario ${ana.salario}")
    println("bonificacao ${ana.bonificacao}")
    println("autenticacao ${ana.autentica(123)}")

    println("==============")
    println("==============")
    println("==============")
    println("==============")

    val pedro = Diretor(
        nome = "Pedro",
        cpf = "111.111.111-11",
        salario = 3000.00,
        senha = 123,
        plr = 200.0
    )

    println("nome ${pedro.nome}")
    println("cpf ${pedro.cpf}")
    println("salario ${pedro.salario}")
    println("bonificacao ${pedro.bonificacao}")
    println("autenticacao ${pedro.autentica(123)}")
    println("plr ${pedro.plr}")
}



