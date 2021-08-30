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

        for(int i=0; i<3; ++i){
            System.out.print("Entre com a nota do " + (i + 1) + " trimestre: ");
            boolean j = true;

                while (j) {
                    notas.nota[i] = sc.nextDouble();
                    if (i == 0 && notas.nota[i] > 30){
                        System.out.print("A nota não deve ser maior que 30, entre novamente: ");
                    }else if (i == 0){
                        j = false;
                    }

                    if (i > 0 && notas.nota[i] > 35) {
                        System.out.print("A nota não deve ser maior que 35, entre novamente: ");
                    } else if (i > 0) {
                        j = false;
                    }
                }
        }

        for (int i=0; i<3; ++i){
            System.out.println("Nota do " + i + " trimestre: " + notas.nota[i]);
        }

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
