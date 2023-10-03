import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
    	
        Gerente gerente = new Gerente(5650.0, "Maria Helena", "admin", "123456");
        Telefonista telefonista = new Telefonista(2500.0, "Tauane Rafaela", "33456");
        Secretaria secretaria = new Secretaria(3000.0, "Tiana Raquel", 101);

        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.getSalario());
        System.out.println("Telefonista: " + telefonista.getNome() + ", Salário: " + telefonista.getSalario());
        System.out.println("Secretaria: " + secretaria.getNome() + ", Salário: " + secretaria.getSalario());
    }
}
 
