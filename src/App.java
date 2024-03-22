import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        Cofrinho cofrinho = new Cofrinho();
        int opcaoUsuario; // vai receber a opcao do usuario de acordo com o menu seguinte(MENU)
        int opcao; // vai receber a opcao do usuario de acordo com o menu seguinte(switch-case)

        // FRASE DE BOAS VINDAS
        System.out.println("---- Bem vindo ao seu Cofrinho Virtual ----");

        //INICIO DO LOOP
        while (true) {
            // MENU PRINCIPAL
            System.out.println("[0] Sair.  [1] Adicionar moeda.  [2] Remover moeda.");
            System.out.println("[3] Listar todas as moedas.  [4] Total convertido para Real.");

            // adquirindo a opcao do usuario
            System.out.print("> ");
            opcaoUsuario = sc.nextInt();
            
            // comparando e executando de acordo com o que o usuario escolheu
            switch (opcaoUsuario) {
                // primeiro caso: Perguntar o tipo, o valor e adicionar moedas<
                case 1:
                //MENU ADICIONAR MOEDAS
                    System.out.println("Qual moeda deseja adicionar?\n[1] Euro  [2] Dolar  [3] Real  [0] Voltar");
                    System.out.print("> ");
                    opcao = sc.nextInt();

                    if (opcao == 0){
                    // Volta ao MENU PRINCIPAL caso o usuario desista da ação
                        break;
                    }
                    else if (opcao == 1){
                     // instancia o Euro e o valor é recebido pela variavel de mesmo nome, em seguida o armazena na lista.
                        Euro euro = new Euro();
                        System.out.println("Digite o valor: ");
                        euro.valor = sc.nextDouble();
                        cofrinho.adicionar(euro);
                        System.out.println("Adicionado com sucesso!");
                    }
                    else if (opcao == 2) {
                    // instancia o Dolar e o valor é recebido pela variavel de mesmo nome, em seguida o armazena na lista.
                        Dolar dolar = new Dolar();
                        System.out.println("Digite o valor: ");
                        dolar.valor = sc.nextDouble();
                        cofrinho.adicionar(dolar);
                        System.out.println("Adicionado com sucesso!");
                    }
                    else if (opcao == 3) {
                    // instancia o Real e o valor é recebido pela variavel de mesmo nome, em seguida o armazena na lista.
                        Real real = new Real();
                        System.out.println("Digite o valor: ");
                        real.valor = sc.nextDouble();
                        cofrinho.adicionar(real);
                        System.out.println("Adicionado com sucesso!");
                    }
                    break;

                case 2:
                    /* REMOVER MOEDAS
                     * lista todas as moedas adicionadas e pergunta ao
                     * usuario qual das moedas deseja remover. O mesmo insere
                     * o index da moeda e a mesma é removida imediatamente.
                     */
                    System.out.println("Qual moeda deseja remover?");
                    cofrinho.listagemMoedas();
                    System.out.println("> ");
                    opcao = sc.nextInt();
                    cofrinho.remover(opcao);
                    System.out.println("Moeda removida!!");
                    break;

                case 3:
                // LISTAGEM DE MOEDAS
                    // lista todas as moedas e seus valores na ordem em que foram adicionadas 
                    System.out.println("Moedas adicionadas:.");
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                // mostra o total das moedas convertidas para real
                    System.out.printf("Total convertido em real: %.2f%n", (cofrinho.totalConvertido()));
                    break;
                }

            /* 
            Como o break do switch-case não encerra o loop,
            o IF abaixo encerra o programa de acordo com
            a entrada do usuário.
            */
            if (opcaoUsuario == 0){
                System.out.println("Obrigado por usar, volte sempre!");
                break;
            }
        } 

        sc.close(); // Scanner fechado fora do while
    }
}