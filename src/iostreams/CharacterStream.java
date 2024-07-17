// Why two classes for streams, bcoz data can either be in bytes or in english characters (UTF). 
// For handling text files always use CharacterStream.

package iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try{
            reader = new FileReader("src\\iostreams\\inputFile.txt");
            writer = new FileWriter("src\\iostreams\\characterOutputFile.txt");

            // Read input file and write the content character-by-character
            int fileContent = 0;
            while (fileContent != -1) {
                fileContent = reader.read();
                writer.append((char) fileContent);
            }

        }catch(Exception e){
            System.out.println(e);
        }finally{
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            
        }

    }
}
