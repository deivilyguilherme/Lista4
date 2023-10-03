
public class Secretaria extends Funcionario{
    private int numeroRamal;

    public Secretaria(double salario, String nome, int numeroRamal) {
        super(salario, nome);
        this.numeroRamal = numeroRamal;
    }

    //Métodos getters e setters para número de Ramal.

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }

}