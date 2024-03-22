class Real extends Moeda {
    // definindo o nome da moeda
    public Real(){
        nome = "Real";                                           
    }

    // função converter() nessa moeda retorna apenas seu próprio valor pois já é Real.
    @Override
    public double converter(){
        return valor;
    }
}