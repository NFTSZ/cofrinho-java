import java.util.ArrayList;
import java.util.List;

public class Cofrinho extends App{
    // lista privada
    private List<Moeda> listaMoedas = new ArrayList<>();

    // função que adiciona as moedas a lista
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // função que remove as moedas da lista
    public void remover(int opcao) {
        listaMoedas.remove(opcao - 1);
    }

    // função pra listar todas as moedas e seus valores 
    public void listagemMoedas(){
        for (int i = 0; i < listaMoedas.size(); i++){
            Moeda moeda = listaMoedas.get(i);
            System.out.println((i + 1) + " : " + moeda.info() + " - " + moeda.valor);
        }
    }

    // função que converte todos os valores para Real
    public double totalConvertido(){
       double totalEmReal = 0;
       for (Moeda moeda : listaMoedas){
            totalEmReal += moeda.converter();
       }    
    return totalEmReal;
    }
}