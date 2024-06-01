package TarefaControleDeFluxo;

import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        int nota1 = s.nextInt();

        System.out.println("Digite a nota 2: ");
        int nota2 = s.nextInt();

        System.out.println("Digite a nota 3: ");
        int nota3 = s.nextInt();

        System.out.println("Digite a nota 4");
        int nota4 = s.nextInt();

        // Calcular média
        Integer media = getNota(nota1, nota2, nota3, nota4);

        System.out.println("A média do aluno é: " + media);
        avaliarAluno(media);

        s.close();
    }

//    Método para calcular a média
    public static Integer getNota(int nota1, int nota2, int nota3, int nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void avaliarAluno(Integer media) {
        if (media >= 7){
            System.out.println("APROVADO");
        } else if (media >= 5){
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
