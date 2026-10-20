void main(){
    //1 Usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

    //2 Usuário entra altura e peso, e calcula o IMC(IMC = peso/(altura * altura))

    //3 Usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par
    // e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
    // no intervalo de números informados, incluindo os números informados e em ordem decrescente;

    //4 Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
    // a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto
    // diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
    var scanner = new Scanner(System.in);
    System.out.print("Escolha um exercício de 1 a 4: ");
    var choice = scanner.nextInt();
    switch(choice){
        case 1:
            System.out.print("Informe um número para ver sua tabela: ");
            var numero = scanner.nextInt();
            for (int i=1; i <= 10; i++) {
                var resultado = (numero * i);
                System.out.printf(numero + " * " + i + " = " + resultado + "\n");
            }
            break;
        case 2:
            System.out.print("Digite sua altura: ");
            var height = scanner.nextFloat();
            System.out.print("Digite seu peso: ");
            var weight = scanner.nextFloat();
            var imc = (weight / (height * height) );
            System.out.printf("Seu IMC é %s\n", imc);
            if (imc <= 18.5) System.out.println("Abaixo do peso");
            else if (imc >= 18.6 & imc <= 24.9) System.out.println("Peso ideal");
            else if (imc >= 25 & imc <= 29.9) System.out.println("Levemente acima do peso ");
            else if (imc >= 30 & imc <= 34.9) System.out.println("Obesidade Grau I");
            else if (imc >= 35 & imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
            else if (imc >= 40) System.out.println("Obesidade Grau III (Mórbida)");
            break;
        case 3:
            System.out.print("Digite um número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite um número maior que o anterior: ");
            var numero2 = scanner.nextInt();
            while (numero1 >= numero2){
                System.out.print("ERRO! Digite um número maior que o anterior: ");
                numero2 = scanner.nextInt();
            }
            System.out.print("Escolha par ou impar: ");
            var escolha = scanner.next();
            if (Objects.equals(escolha, "par")){
                System.out.printf("Numeros entre %s e %s", numero1, numero2);
                for (var i = numero1; i <= numero2; i++){
                    if (i % 2 == 0) System.out.print("\n"+ i);
                }
            } else {
                System.out.printf("Numeros entre %s e %s", numero1, numero2);
                for (var i = numero1; i <= numero2; i++){
                    if (i % 2 != 0) System.out.print("\n"+ i);
                }
            }
            break;
        case 4:
            System.out.print("Digite um número: ");
            var primeiro = scanner.nextInt();
            while(true){
                System.out.print("\nInforme o número para verificação: ");
                var toVerify = scanner.nextInt();
                if (toVerify < primeiro){
                    System.out.printf("Informe um número maior que %s\n", toVerify);
                    continue;
                }
                var resultado = toVerify % primeiro;
                System.out.printf("\n%s %% %S = %s", toVerify, primeiro, resultado);
                if (resultado != 0) break;
            }
    }
}