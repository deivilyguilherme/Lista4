
public class Gerente extends Funcionario {
    private String login;
    private String senha;

    public Gerente(double salario, String nome, String login, String senha) {
        super(salario, nome);
        this.login = login;
        this.senha = senha;
    }

    // Métodos getters e setters para login e senha.

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}