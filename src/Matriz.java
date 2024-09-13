import java.util.Scanner;
import java.util.Random;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    // Construtor que define o tamanho da matriz
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    // Método para preencher a matriz manualmente
    public void preencherManual() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para preencher a matriz com valores aleatórios
    public void preencherAleatorio(int limite) {
        Random random = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(limite);
            }
        }
    }

    // Método para inserir um valor em uma posição específica da matriz
    public void inserirElemento(int linha, int coluna, int valor) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Método para remover um valor de uma posição específica da matriz (definindo como 0)
    public void removerElemento(int linha, int coluna) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = 0; // Considerando que "remover" zera o elemento
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Método para exibir a matriz
    public void exibirMatriz() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
