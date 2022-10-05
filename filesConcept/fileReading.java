package files;

//Reading the file
//Create a file in resource folder as data.txt and add some content
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileReadRunner {
	public static void main(String[] args) throws IOException {
		Path pathtoRead = Paths.get("./resources/data.txt");

		//List<String> lines = Files.readAllLines(pathtoRead);
		//System.out.println(lines);
		//alternative
		Files.lines(pathtoRead).map(String::toUpperCase).filter(str -> str.contains("a")).forEach(System.out::println);
	}

}
