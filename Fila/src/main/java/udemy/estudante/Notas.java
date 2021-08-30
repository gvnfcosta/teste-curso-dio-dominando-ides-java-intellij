package udemy.estudante;

public class Notas {

    public String nome;
    public double nota[] = {0, 0, 0};

    public double calculaNotaFinal() {
        return nota[0] + nota[1] + nota[2];
    }

    public double pontosFaltando(){
        if(calculaNotaFinal() < 60){
            return 60 - calculaNotaFinal();
        } else {
            return 0;
        }
    }
}
