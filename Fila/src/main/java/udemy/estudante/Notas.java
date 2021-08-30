package udemy.estudante;

import java.util.Scanner;

public class Notas {

    public String nome;
    public double nota[] = {0, 0, 0};

    Scanner sc = new Scanner(System.in);

    public double calculaNotaFinal() {
        return nota[0] + nota[1] + nota[2];
    }

    public void entraNotas(){
        for(int i=0; i<3; ++i){
            System.out.print("Entre com a nota do " + (i + 1) + " trimestre: ");
            boolean j = true;

            while (j) {
                nota[i] = sc.nextDouble();
                if (i == 0 && nota[i] > 30){
                    System.out.print("A nota não deve ser maior que 30, entre novamente: ");
                }else if (i == 0){
                    j = false;
                }

                if (i > 0 && nota[i] > 35) {
                    System.out.print("A nota não deve ser maior que 35, entre novamente: ");
                } else if (i > 0) {
                    j = false;
                }
            }
        }
    }

    public void exibeNotas() {
        for (int i = 0; i < 3; ++i) {
            System.out.println("Nota do " + i + " trimestre: " + nota[i]);
        }
    }

    public double pontosFaltando(){
        if(calculaNotaFinal() < 60){
            return 60 - calculaNotaFinal();
        } else {
            return 0;
        }
    }
}
