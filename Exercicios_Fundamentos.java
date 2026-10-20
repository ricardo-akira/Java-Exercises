void main() {
    //1 Codigo que recebe o nome e ano de nascimento e e imprima o nome e idade

    //2 Codigo que receba o tamanho de um lado do quadrado e calcule sua area

    //3 Codigo que recebe a base e a altura de um retangulo e calcula a área

    //4 Codigo que recebe o nome e idade de duas pessoas e imprime a diferenca de idade
    var scanner = new Scanner(System.in);
    System.out.print("Escolha um exercício de 1 a 4: ");
    var choice = scanner.nextInt();
    switch(choice) {
        case 1:
            var anoBase = 2026;
            System.out.print("Digite seu nome: ");
            var nome = scanner.next();
            System.out.print("Informe seu ano de nascimento: ");
            var ano = scanner.nextInt();
            var idade = anoBase - ano;
            System.out.printf("Olá %s, você tem %s anos\n", nome, idade);
            break;
        case 2:
            System.out.print("Digite o lado do quadrado: ");
            var lado = scanner.nextInt();
            int areaQuadrado = lado * lado;
            System.out.printf("O quadrado tem área de %s m²\n", areaQuadrado);
            break;
        case 3:
            System.out.print("Digite a base do retângulo: ");
            var base = scanner.nextInt();
            System.out.print("Digite a altura do retângulo: ");
            var altura = scanner.nextInt();
            var areaRetangulo = base * altura;
            System.out.printf("A área do retângulo é de %s m²", areaRetangulo);
            break;
        case 4:
            System.out.print("Digite o primeiro nome: ");
            var nome1 = scanner.next();
            System.out.print("Digite a idade: ");
            var idade1 = scanner.nextInt();
            System.out.print("Digite o segundo nome: ");
            var nome2 = scanner.next();
            System.out.print("Digite a idade: ");
            var idade2 = scanner.nextInt();
            int diferenca;
            if (idade1 > idade2) diferenca = idade1 - idade2;
            else diferenca = idade2 - idade1;
            System.out.printf("A diferenca de idade de %s e %s é de %s anos\n", nome1, nome2, diferenca);
    }
}
