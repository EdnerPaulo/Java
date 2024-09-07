package cadastro;

public class Pessoa {

    // Atributos
    private int id_pessoa;
    private String nome;
    private String endereco;
    private String telefone;
    private int idade;
    private double altura;
    protected boolean pagamentoRealizado;
    private String cursoMatriculado;

    // Métodos getters e setters
    public int getid_pessoa() {
        return id_pessoa;
    }

    public void setid_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    // Métodos da classe
    public void cadastrar() {
        System.out.println(nome + " foi cadastrado com sucesso.");
    }

    public void registrar() {
        System.out.println(nome + " foi registrado no sistema.");
    }

    public void matricular(String curso) {
        this.cursoMatriculado = curso;
        System.out.println(nome + " foi matriculado no curso: " + curso);
    }

    public void pagar(double valor) {
        this.pagamentoRealizado = true;
        System.out.println(nome + " realizou o pagamento de R$ " + valor);
    }

    public void estudar() {
        if (cursoMatriculado != null && pagamentoRealizado) {
            System.out.println(nome + " está estudando o curso: " + cursoMatriculado);
        } else if (cursoMatriculado == null) {
            System.out.println(nome + " não está matriculado em nenhum curso.");
        } else if (!pagamentoRealizado) {
            System.out.println(nome + " precisa realizar o pagamento antes de estudar.");
        }
    }

    // Método principal da classe Pessoa
    public static void main(String[] args) {
        Pessoa robson = new Pessoa();
        robson.setid_pessoa(1);
        robson.setnome("Robson");
        robson.cadastrar();
        robson.registrar();
        robson.matricular("Engenharia Elétrica");
        robson.pagar(500.00);
        robson.estudar();
        System.out.println("Aluno: " + robson.getnome() + " cadastrado.");
        robson.setnome("Robson de Souza Ultramari");
        System.out.println("Incluiu sobrenome: " + robson.getnome() + ". ");
        System.out.println("=============");
        
        // Criação do aluno e chamada de métodos
        Aluno maria = new Aluno(2, "Maria Silva", "Rua das Flores, 123", "9999-9999", 22, 1.65, true, "Engenharia", "2024A", "Engenharia Elétrica");
        maria.cadastrar();  // Sobrescreve o método da classe Pessoa
        maria.matricular("Engenharia Elétrica");
        maria.pagar(500.00);
        maria.estudar();
    }
}

// Classe Aluno herdando de Pessoa
class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    // Construtor da classe Aluno
    public Aluno(int id_pessoa, String nome, String endereco, String telefone, int idade, double altura, boolean pagamentoRealizado, String cursoMatriculado, String matricula, String curso) {
        super(); // Chama o construtor da superclasse (Pessoa)
        this.setid_pessoa(id_pessoa);
        this.setnome(nome);
        this.setendereco(endereco);
        this.settelefone(telefone);
        this.setidade(idade);
        this.setaltura(altura);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Métodos específicos da classe Aluno
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrita de métodos
    @Override
    public void cadastrar() {
        System.out.println(getnome() + " foi cadastrado como aluno no curso: " + curso);
    }

    @Override
    public void estudar() {
        if (getCurso() != null && getCurso().equals(curso) && pagamentoRealizado) {
            System.out.println(getnome() + " está estudando o curso: " + curso);
        } else if (getCurso() == null) {
            System.out.println(getnome() + " não está matriculado em nenhum curso.");
        } else if (!pagamentoRealizado) {
            System.out.println(getnome() + " precisa realizar o pagamento antes de estudar.");
        }
    }
}
