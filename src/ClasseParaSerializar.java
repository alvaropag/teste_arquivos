import java.io.Serial;
import java.io.Serializable;

public class ClasseParaSerializar implements Serializable {
    private String nome;
    private int idade;
    private double salario;
    @Serial
    private static final long serialVersionUID = -5407945311156318847L;

    public ClasseParaSerializar(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
