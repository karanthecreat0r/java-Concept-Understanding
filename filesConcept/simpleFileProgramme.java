package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// we can use file.walk to walk through current directory
public class directoryScanRunner {
	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
		Predicate<? super Path> Predicate = path -> String.valueOf(path).contains("java");
		// Files.list(currentDirectory).forEach(System.out::println);
		Files.walk(currentDirectory, 4).filter(Predicate).forEach(System.out::println);

		// another way

		BiPredicate<Path, BasicFileAttributes> matcher = (path, atributes) -> String.valueOf(path).contains("java");
		Files.find(currentDirectory, 4, matcher);
	}

}
