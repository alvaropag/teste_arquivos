//TesteArquivos.java
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteArquivos {

    public void criaArquivo() throws IOException {
        File f = new File("./arquivo.txt");
        if(f.createNewFile()){
            System.out.println("Arquivo criado com sucesso!");
        }
        else {
            System.out.println("Arquivo nao criado!");
        }
    }

    public void criaArquivoFiles() throws IOException {
        Path path = Paths.get("/home/alvaro/tmp/teste.txt");
        Files.createFile(path);
    }

    public void getCurrentPath(){
        File f = new File(".");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }

    public void lerArquivo() throws IOException {
        Path path = Paths.get("/home/alvaro/tmp/teste.txt");
        List<String> allLines = Files.readAllLines(path);
        for(String line : allLines){
            System.out.println(line);
        }
    }

    public void escreverArquivo() throws IOException {
        Path path = Paths.get("/home/alvaro/tmp/teste.txt");
        List<String> linhas = Arrays.asList("teste3", "teste2", "teste1");
        Files.write(path, linhas, StandardOpenOption.APPEND);
    }
}
