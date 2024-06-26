/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriaArquivoPessoasComEndereco {

    public static void main(String[] args) {
        List<Pessoa> pessoas = lerArquivoPessoas("Pessoas.csv");
        Map<Integer, List<String[]>> enderecos = lerArquivoEnderecos("Endereços.csv");
        criarArquivoPessoasComEndereco(pessoas, enderecos, "PessoasComEndereço.csv");
    }

    private static List<Pessoa> lerArquivoPessoas(String caminhoArquivo) {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int codigo = Integer.parseInt(dados[0]);
                String nome = dados[1];
                pessoas.add(new Pessoa(codigo, nome, null, null));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    private static Map<Integer, List<String[]>> lerArquivoEnderecos(String caminhoArquivo) {
        Map<Integer, List<String[]>> enderecos = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String rua = dados[0];
                String cidade = dados[1];
                int codigo = Integer.parseInt(dados[2]);
                enderecos.computeIfAbsent(codigo, k -> new ArrayList<>()).add(new String[]{rua, cidade});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    private static void criarArquivoPessoasComEndereco(List<Pessoa> pessoas, Map<Integer, List<String[]>> enderecos, String caminhoArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Pessoa pessoa : pessoas) {
                int codigo = pessoa.getCodigo();
                if (enderecos.containsKey(codigo)) {
                    for (String[] endereco : enderecos.get(codigo)) {
                        Pessoa pessoaComEndereco = new Pessoa(codigo, pessoa.getNome(), endereco[0], endereco[1]);
                        bw.write(pessoaComEndereco.toCsv());
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

} */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriaArquivoPessoasComEndereco {

    public static void main(String[] args) {
        List<Pessoa> pessoas = lerArquivoPessoas("Pessoas.csv");
        Map<Integer, List<String[]>> enderecos = lerArquivoEnderecos("Endereços.csv");
        criarArquivoPessoasComEndereco(pessoas, enderecos, "PessoasComEndereço.csv");
    }

    private static List<Pessoa> lerArquivoPessoas(String caminhoArquivo) {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int codigo = Integer.parseInt(dados[0]);
                String nome = dados[1];
                pessoas.add(new Pessoa(codigo, nome, null, null));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    private static Map<Integer, List<String[]>> lerArquivoEnderecos(String caminhoArquivo) {
        Map<Integer, List<String[]>> enderecos = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String rua = dados[0];
                String cidade = dados[1];
                int codigo = Integer.parseInt(dados[2]);
                enderecos.computeIfAbsent(codigo, k -> new ArrayList<>()).add(new String[]{rua, cidade});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    private static void criarArquivoPessoasComEndereco(List<Pessoa> pessoas, Map<Integer, List<String[]>> enderecos, String caminhoArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Pessoa pessoa : pessoas) {
                int codigo = pessoa.getCodigo();
                if (enderecos.containsKey(codigo)) {
                    for (String[] endereco : enderecos.get(codigo)) {
                        Pessoa pessoaComEndereco = new Pessoa(codigo, pessoa.getNome(), endereco[0], endereco[1]);
                        bw.write(pessoaComEndereco.toCsv());
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
