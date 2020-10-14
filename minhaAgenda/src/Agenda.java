import java.util.List;
public class Agenda {
    private List <Pessoa> pessoa;

    public Agenda() {
        this.pessoa = pessoa;
    }

    
    

    public List getPessoa() {
        return pessoa;
    }

    public void setPessoa(List Pessoa) {
        this.pessoa = Pessoa;
    }
    public void addnome(Pessoa nome, Telefone telefone){
        pessoa.add(nome);

    }
}
