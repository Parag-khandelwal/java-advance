// If we dont know what data will be contained in a file, we use ByteStream


package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        
        FileInputStream inpStream = null;
        FileOutputStream outStream = null;

        try{
            inpStream = new FileInputStream("src\\iostreams\\inputFile.txt");
            outStream = new FileOutputStream("src\\iostreams\\outputFile.txt");

            // reads the file byte-by-byte, returns -1 when reached the end of file.
            int fileContent = 0;
            while(fileContent != -1){
                fileContent = inpStream.read();
                outStream.write((byte) fileContent); // typecasting int fileContent in (byte) bcoz the file is getting read byte-by-byte
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            if(inpStream != null){
                inpStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }

    }
}
