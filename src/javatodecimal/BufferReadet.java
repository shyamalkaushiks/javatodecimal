package javatodecimal;

import java.io.FileReader;
import java.io.*;


public class BufferReadet {
	 public static void main(String[] args) {
	        String csvFile = "C:\\Users\\DELL\\Desktop\\input.csv";
	        String outputFile = "output.txt";
	        String line;
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
	             FileWriter fw = new FileWriter(outputFile)) {

	            double sum = 0;

	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(cvsSplitBy);
	                StringBuilder outputLine = new StringBuilder();

	                for (String value : values) {
	                    outputLine.append(value).append(", ");
	                    try {
	                        double num = Double.parseDouble(value);
	                        sum += num;
	                    } catch (NumberFormatException e) {
	                        // Ignore if not a number
	                    }
	                }

	                outputLine.append("Sum: ").append(sum);
	                fw.write(outputLine.toString() + "\n");
	                sum = 0; // Reset sum for next line
	            }

	            System.out.println("CSV file has been read successfully and output has been written to " + outputFile);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
