package ImageProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicImageProcessor implements ImageProcessorInterface {
    @Override
    public String process(String imagePath) {
        // Lógica para realizar processamento básico da imagem

        String newImagePath = "uploads/file.jpg";
try {
            // O equivalente ao file_put_contents no Java
            // Passamos o caminho e um array de bytes vazio (já que a string original era "")
            Files.write(Paths.get(newImagePath), new byte[0]);
            
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }        
        return newImagePath;
    }
}
