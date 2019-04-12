import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreams {

	public static void main(String[] args) throws IOException {
		// Read data from source one at a time
		FileInputStream in = null;

		// Write data to destination file one at a time
		FileOutputStream out = null;

		try {
			in = new FileInputStream("forinput.txt");
			out = new FileOutputStream("foroutput.txt");

			int c;

			// While not reaching the end of the line, write
			// to the destination file
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
