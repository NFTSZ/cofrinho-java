class Dolar extends Moeda {
    // definindo o nome da moeda
    public Dolar(){
        nome = "Dolar";
    }

    // função converter() herdada da classe Moeda sendo ¨personalizada" de acordo com a moeda.
    @Override
    public double converter(){
        double valorReal = 4.97;
        return valor * valorReal;
   }
}