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

            if(dados[0].equals(dados[1])){
                System.out.println("Caso #" +i +": De novo!");
            }

            if(dados[0].equals(tesoura) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(papel) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(papel) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(pedra) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }
            
            if(dados[0].equals(pedra) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(lagarto) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(lagarto) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(spock) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(spock) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(tesoura) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(tesoura) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(lagarto) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[1].equals(lagarto) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[1].equals(papel) && dados[1].equals(lagarto)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(papel) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(spock) && dados[1].equals(papel)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(spock) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(pedra) && dados[1].equals(spock)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }

            if(dados[0].equals(pedra) && dados[1].equals(tesoura)){
                System.out.println("Caso #" +i +": Bazinga!");
            }else if(dados[0].equals(tesoura) && dados[1].equals(pedra)){
                System.out.println("Caso #" +i +": Raj trapaceou!");
            }
        }
    }
}
