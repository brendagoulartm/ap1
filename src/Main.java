import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões da matriz
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        // Criando a matriz
        Matriz matriz = new Matriz(linhas, colunas);

        // Preenchendo a matriz manualmente ou com valores aleatórios
        System.out.println("Escolha uma opção para preencher a matriz:");
        System.out.println("1 - Preenchimento manual");
        System.out.println("2 - Preenchimento com valores aleatórios");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            matriz.preencherManual();
        } else if (opcao == 2) {
            System.out.print("Digite o limite máximo para os valores aleatórios: ");
            int limite = scanner.nextInt();
            matriz.preencherAleatorio(limite);
        }

        // Exibindo a matriz preenchida
        System.out.println("\nMatriz preenchida:");
        matriz.exibirMatriz();

        // Inserindo um elemento em uma posição específica
        System.out.print("\nDigite a linha para inserir um valor: ");
        int linhaIns = scanner.nextInt();

        System.out.print("Digite a coluna para inserir um valor: ");
        int colunaIns = scanner.nextInt();

        System.out.print("Digite o valor a ser inserido: ");
        int valorIns = scanner.nextInt();

        matriz.inserirElemento(linhaIns, colunaIns, valorIns);
        System.out.println("\nMatriz após inserção:");
        matriz.exibirMatriz();

        // Removendo um elemento de uma posição específica
        System.out.print("\nDigite a linha para remover o valor: ");
        int linhaRem = scanner.nextInt();

        System.out.print("Digite a coluna para remover o valor: ");
        int colunaRem = scanner.nextInt();

        matriz.removerElemento(linhaRem, colunaRem);
        System.out.println("\nMatriz após remoção:");
        matriz.exibirMatriz();

        scanner.close();
    }
}
