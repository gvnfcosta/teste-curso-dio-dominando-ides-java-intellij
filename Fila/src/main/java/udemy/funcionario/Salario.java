package udemy.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Entre com os dados");
        System.out.print("Nome: ");
        funcionario.nome = ler.nextLine();

        System.out.print("Salário: ");
        funcionario.salarioBruto = ler.nextDouble();

        System.out.print("Taxa: ");
        funcionario.taxa = ler.nextDouble();

        System.out.println("Dados do Funcionáio: " + funcionario);

        System.out.println();
        System.out.print("Qual porcentagem será acrescida ao salário? ");
        double porcentagem = ler.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println("Salário atualizado: " + funcionario);

        ler.close();
    }
}
