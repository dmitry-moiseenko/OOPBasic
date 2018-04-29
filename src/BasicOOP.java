import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicOOP {

        static ArrayList<File> fileInRootDirect = new ArrayList<File>();
        static ArrayList<File> fileInRootReceived = new ArrayList<File>();

        public static void main(String[] args) throws Exception {
            eraseFile("log.txt");


            File rootSender = new File("D:\\Folder1");
            File rootDestination = new File("D:\\Folder2");

            recursivSearch(rootSender, 1);
            recursivSearch(rootDestination, 2);


            for (int i = 0; i < fileInRootDirect.size(); i++) {
                compare(fileInRootDirect.get(i), fileInRootReceived.get(i));
            }



        }

        public static void recursivSearch(File direct, int number) throws Exception {

            ArrayList<File> directListFile = new ArrayList<File>(Arrays.asList(direct.listFiles()));

            for (File file : directListFile)
                if (file.isDirectory()) {
                    recursivSearch(file, number);
                } else {
                    if (number == 1){
                        fileInRootDirect.add(file);
                    } else {
                        fileInRootReceived.add(file);
                    }

                }

        }

        public static void eraseFile(String direct){
            File myFile = new File(direct);
            if (myFile.exists()) {
                myFile.delete();
            }
        }


        public static void compare (File direct, File received) throws Exception{
            if (!direct.getName().substring(4).equals(received.getName().substring(4))) {
                try {
                    FileWriter writer = new FileWriter("log.txt", true);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(direct.getName() + " не найден, в каталоге: " + received.getPath() + "\r\n");
                    bufferWriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        }



    }


