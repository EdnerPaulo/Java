package fauna
public class Animal {

    // Atributos
    private String Nome;
    private float Peso ;
    private String Origem;
    private int Idade;
    private double Altura;
    
    // Métodos getters e setters
    
    public String getnome() {
        return Nome;
    }
    
    public void setnome(String nome) {
        this.Nome = nome;
    }
    
    public float getPeso() {
        return Peso;
    }
    
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
    public String getOrigem() {
        return Origem;
    }
    
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public int getidade() {
        return Idade;
    }
    
    public void setidade(int idade) {
        this.Idade = idade;
    }
    
    // Métodos da classe
    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }
    
    public void fazer_som() {
        System.out.println(Nome + " está fazendo som.");
    }
    
    public void dormir () {
        System.out.println(Nome + " está dormindo. ");
    }
    
    public void alimentar() {
        System.out.println(Nome + " está comendo. ");
    }
    
    public class Mamifero extends Animal {
        
        // Atributos
        private float Tamanho ;
        private float Envergadura ;
        
        // Métodos getters e setters
        
        public float getTamanho() {
            return Tamanho;
        }
        
        public void setEnvergadura(float Envergadura) {
            this.Envergadura = Envergadura;
        }

        // Métodos da classe

        public void correr() {
            System.out.println(Nome + " está correndo.");
        }

            public class Cachorro extends Mamifero {
                 
                //Atributos
                private String Raça;

                //Métodos getters e setters

                public string getRaça() {

                    return Raça;
                }
                public void setRaça(String Raça){
                    this.Raça = Raça;
                }

                //Métodos da classe
                public void fazer_som(){
                    System.out.printIn(Nome + " está fazendo som.");
                }
                public void morder(){
                    System.out.println(Nome + " está mordendo.");
                }

            }    


        }


    }

    
 
