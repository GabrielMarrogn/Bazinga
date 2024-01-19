import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String tesoura = "tesoura";
        String papel = "papel";
        String pedra = "pedra";
        String lagarto = "lagarto";
        String spock = "Spock";


        for(int i = 1; i <= a; i++){
            String jogo = br.readLine();
            String[] dados = jogo.split(" ");

            //empate
            if(dados[0].equals(dados[1])){
                System.out.println("Caso #" +i +": De novo!");
            }

            //a tesoura corta o papel
            if(dados[0].equals(tesoura) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(papel) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //o papel embrulha a pedra
            if(dados[0].equals(papel) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(pedra) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }
            
            //pedra esmaga o lagarto
            if(dados[0].equals(pedra) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(lagarto) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //lagarto envenena Spock
            if(dados[0].equals(lagarto) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(spock) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //Spock destroi a tesoura
            if(dados[0].equals(spock) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(tesoura) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //tesouta decapita o lagarto
            if(dados[0].equals(tesoura) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(lagarto) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //lagarto come o papel
            if(dados[0].equals(lagarto) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(papel) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //papel contesta Spock
            if(dados[0].equals(papel) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(spock) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //Spock destoi a pedra
            if(dados[0].equals(spock) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(pedra) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            //Pedra quebre a tesoura
            if(dados[0].equals(pedra) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(tesoura) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }
        }
    }
}
