package learn.tp5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EnregistrementFichier {

    public EnregistrementFichier(List<String> data) throws IOException {
        Path f = Paths.get("C:\\Users\\phindau\\OneDrive - Université de La Rochelle\\L1\\S2\\Informatique\\Java\\src\\learn\\tp5\\data.txt");
        Files.write(f, data, StandardCharsets.UTF_8);
    }
}
