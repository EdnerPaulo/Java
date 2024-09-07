package br.com.meuprojeto.cadastro;

public class pessoa {
    private int id_pessoa;
    private string nome;
    private string endereço;
    private string telefone;
    private int idade;
    private double altura;

    public string getid_pessoa() {
        return id_pessoa;
    }

    public void setid_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public string getnome() {
        return nome;
    }

    public void setnome(string nome) {
        this.nome = nome;
    }

    public string getendereço() {
        return endereço;
    }

    public void setendereço(string endereço) {
        this.endereço = endereço;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(string idade) {
        this.idade = idade;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }
    public void registrar() {
        System.out.println(nome + " foi resgistrado no sistema.");
    }
    public void matricular( string curso) {
        System.out.println(nome + " foi matriculado no curso." + curso);
    }
    public void pagar(double valor) {
        this.pagamentoRealizado = true;
        System.out.println(nome + " realizou o pagamento de R$ " + valor);
    }
    public void estudar() {
        if (!cursoMatriculado.isEmpty) {
            
        }
        System.out.println(nome + " começou a estudar.");
    }
    public void cadastrar() {
        System.out.println(nome + " foi cadestreado com sucesso.");
    }

    

}