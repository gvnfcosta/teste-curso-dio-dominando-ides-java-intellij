package udemy.estudante;

import java.util.Locale;
import java.util.Scanner;

//Recebe nome do aluno, e as notas dos 3 primeiros trimestres, impede valor superior,
    //  calcula a média e informa o resultado, e quanto faltou.

public class Estudante {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();

        System.out.println("Entre com os dados");
        System.out.print("Nome: ");
        notas.nome = sc.nextLine();
        System.out.println(notas.nome);

        notas.entraNotas();

        notas.exibeNotas();

        System.out.println("Nota final: " + notas.calculaNotaFinal());
        System.out.println("Aluno " + notas.nome + " foi " + notas.calculaNotaFinal());
        if (notas.calculaNotaFinal() < 60) {
            System.out.println("REPROVADO");
            System.out.printf("Faltando %.2f pontos%n", notas.pontosFaltando());
        }else{
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
