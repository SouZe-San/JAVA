import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * We can Write,Create ,Read, Delete Any File form here...............
 * 
 * Want to See the File Just Run For One time........
 */


public class File_handling {
    public static void main(String[] args) throws IOException {
    // File Creating -----------
        File file = new File("newFile.txt");  // given the name of file
        try {
            file.createNewFile();     // _--------> As this function throw Exception then it would be better that wrap it in try catch...  
            System.out.println("File Successfully Created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    // File Writing ----------------
        // FileWriter class is used with its write() method to write some content in a file.
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("newFile.txt");
            fileWriter.write("Hello You %&^&^&* Boy < You Are A fool Boy > Go and Sleep Uin your home\nYou should Die on Road");
            fileWriter.append("\n You Bad Boy Go hell");
            fileWriter.write(table);
            fileWriter.close();
        } catch (Exception e) {
           System.out.println(e);

        }
    // file reading -----------
        try {
            Scanner scanner = new Scanner(file);  // Now give from Where Have to read .... thats why instead of given System given File Name 
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        
        // File Deleting --------------
        // For delete file Used <object>.delete() method

        // if (file.delete()) {
        //     System.out.println("I have delete a file that name is : " + file.getName());
        // } else {
        //     System.out.println("Sorri Boys!");
        // }
    }
}
