import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
    public static void main(String[] args) {

        import java.io.File;

        File pasta = new File("saida");
        if (!pasta.exists()) {
        pasta.mkdirs();
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida/arquivo.txt"))) {
            writer.write("Linha 1");
            writer.newLine();
            writer.write("Linha 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
