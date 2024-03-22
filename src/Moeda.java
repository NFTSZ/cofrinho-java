public abstract class Moeda {
     // variaveis instanciadas na classe que retornam o nome da moeda e seu valor
     protected String nome;
     protected double valor;
 
     // função info() que retorna o nome da moeda
     public String info() {
         return nome;
     }
 
     public abstract double converter();
}

