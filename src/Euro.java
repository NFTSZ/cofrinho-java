class Euro extends Moeda {
    // definindo o nome da moeda
    public Euro(){
        nome = "Euro";
    }

    // função converter() herdada da classe Moeda sendo ¨personalizada" de acordo com a moeda.
    @Override
    public double converter(){
        double valorReal = 5.43;
        return valor * valorReal;
    }
}