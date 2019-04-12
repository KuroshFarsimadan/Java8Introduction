import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStreams {

	public static void main(String[] args) throws IOException {
		/*
		 * FileReader and writer is better than FileInputStream and output
		 * stream (character reading instead of bytes)
		 * 
		 * BufferedReader and PrintWriter is better than FileReader and writer
		 * as it reads lines of characters
		 */
	}

	/*
	 * Below methods use buffered I/O streams. Buffered input streams read data
	 * from a memory area known as a buffer; the native input API is called only
	 * when the buffer is empty. Similarly, buffered output streams write data
	 * to a buffer, and the native output API is called only when the buffer is
	 * full.
	 */
	public void lineReader() throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("forinput.txt"));
			outputStream = new PrintWriter(new FileWriter("foroutput.txt"));
			// outputStream = new BufferedWriter(new
			// FileWriter("foroutput.txt"));

			String l;
			/*
			 * Invoking readLine returns a line of text with the line. CopyLines
			 * outputs each line using println, which appends the line
			 * terminator for the current operating system. This might not be
			 * the same line terminator that was used in the input file.
			 */
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

	/*
	 * Below methods use unbuffered I/O. Each read or write request is handled
	 * directly by the underlying OS. This can make a program much less
	 * efficient, since each such request often triggers disk access, network
	 * activity, or some other operation that is relatively expensive.
	 */

	/*
	 * Reading lines is more efficient than reading characters. You can imagine
	 * how the OS has to manage resources for every character reading rather
	 * than reading one line at a time
	 */

	/* Reading characters is more efficient than reading bytes */
	public void characterReader() throws IOException {
		// Read data from source one at a time
		FileReader in = null;

		// Write data to destination file one at a time
		FileWriter out = null;

		try {
			in = new FileReader("forinput.txt");
			out = new FileWriter("foroutput.txt");

			/*
			 * CopyCharacters is very similar to CopyBytes. The most important
			 * difference is that CopyCharacters uses FileReader and FileWriter
			 * for input and output in place of FileInputStream and
			 * FileOutputStream. Notice that both CopyBytes and CopyCharacters
			 * use an int variable to read to and write from. However, in
			 * CopyCharacters, the int variable holds a character value in its
			 * last 16 bits; in CopyBytes, the int variable holds a byte value
			 * in its last 8 bits.
			 */

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

	public void byteReader() throws IOException {
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
			/*
			 * Closing a stream when it's no longer needed is very important —
			 * so important that CopyBytes uses a finally block to guarantee
			 * that both streams will be closed even if an error occurs. This
			 * practice helps avoid serious resource leaks.
			 * 
			 * One possible error is that CopyBytes was unable to open one or
			 * both files. When that happens, the stream variable corresponding
			 * to the file never changes from its initial null value. That's why
			 * CopyBytes makes sure that each stream variable contains an object
			 * reference before invoking close.
			 */
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
