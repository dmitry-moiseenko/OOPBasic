package FileFinderMask;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parent directory: ");
        String root = scanner.nextLine();

        System.out.println("Parent directory is \"" + root + "\"");
        System.out.println("Enter file mask, \"pdf, jpg, mp3 .....\"" );
        String mask = scanner.nextLine();
        System.out.println("file mask is \"" + mask + "\"");

        searcher(root, mask);

    }

    private static void searcher(String root, String mask) {
        File rootDir = new File(root);
        List<String> result = new ArrayList<String>();
        Queue<File> fileTree = new PriorityQueue<File>();

        Collections.addAll(fileTree, rootDir.listFiles());

        while (!fileTree.isEmpty())
        {
            File currentFile = fileTree.remove();
            if(currentFile.isDirectory()){
                Collections.addAll(fileTree, currentFile.listFiles());
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }

        List<String> founed = new ArrayList<String>();

        for (int j = 0; j < result.size(); j++) {
            int i = result.get(j).lastIndexOf('.');
            System.out.println(result.get(j).substring(i + 1));
            if (result.get(j).substring(i+1).equals(mask)){
                founed.add(result.get(j));
            }
        }
        System.out.println(founed);
    }
}
