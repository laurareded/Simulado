import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CriaArquivos {

    public static void main(String[] args) {
        criaArquivoPessoas();
        criaArquivoEnderecos();
    }

    private static void criaArquivoPessoas() {
        String[] pessoas = {
            "1;Paulo",
            "2;Carlos",
            "3;Ana"
        };
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Pessoas.csv"))) {
            for (String pessoa : pessoas) {
                writer.write(pessoa);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void criaArquivoEnderecos() {
        String[] enderecos = {
            "Rua A;Curitiba;1",
            "Rua B;São Paulo;1",
            "Rua C;Blumenau;3"
        };
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Endereços.csv"))) {
            for (String endereco : enderecos) {
                writer.write(endereco);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
