package files;

//Write in a text
//Create a file in resource folder as file-Write.txt
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fileWriteRunner {
	public static void main(String[] args) throws IOException {
		Path pathtoWrite = Paths.get("./resources/file-Write.txt");
		List<String> list = List.of("karan", "makker");
		Files.write(pathtoWrite, list);
	}

}
