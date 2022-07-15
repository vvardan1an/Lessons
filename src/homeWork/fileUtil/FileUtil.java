package homeWork.fileUtil;

import jdk.nashorn.internal.runtime.PropertyMap;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\user\\IdeaProjects\\Lessons\\src\\Examples\\testsRandom");
        //System.out.println(fileSearch());
        try {
            //contentSearch();
            //findLines();
            createFileWithContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //printSizeOfPackage();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։

    static boolean fileSearch() {

        System.out.println("Please input PATH name.");
        String path = scanner.nextLine();

        System.out.println("Please input file name.");
        String name = scanner.nextLine();


        File file = new File(path, name);
        return file.exists();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։

    static void contentSearch() throws IOException {

        System.out.println("Please input PATH name.");
        String path = scanner.nextLine();

        System.out.println("Please input keyword.");
        String keyword = scanner.nextLine();

        File file = new File(path);

        if (file.isDirectory()) {
            for (File file1 : Objects.requireNonNull(file.listFiles())) {
                if (file1.getName().endsWith(".txt")) {
                    BufferedReader bfReader = new BufferedReader(new FileReader(file1.getAbsolutePath()));
                    String lines = "";
                    while ((lines = bfReader.readLine()) != null) {
                        if (lines.contains(keyword)) {
                            System.out.println(file1.getName());
                            break;
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։

    static void findLines() throws IOException {

        System.out.println("Please input txt file path.");
        String txtPath = scanner.nextLine();

        System.out.println("Please input keyword.");
        String keyword = scanner.nextLine();

        File file = new File(txtPath);
        if (file.isFile()) {
            String lines = "";
            BufferedReader bfReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
            while ((lines = bfReader.readLine()) != null) {
                if (lines.contains(keyword)) {
                    System.out.println(lines);
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում

    static void printSizeOfPackage() {

        System.out.println("Please input path folder.");
        String pathFolder = scanner.nextLine();

        File file = new File(pathFolder);

        if (file.isDirectory()) {
            long weigh = 0;
            for (File file1 : Objects.requireNonNull(file.listFiles())) {
                weigh += file1.length();
            }
            System.out.println("These files weigh " + weigh + " bytes.");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը

    static void createFileWithContent() throws IOException {

        System.out.println("Enter the path where you want to create the file.");
        String path = scanner.nextLine();

        System.out.println("Please enter file name.");
        String fileName = scanner.nextLine();

        System.out.println("Please write text. ");
        String content = scanner.nextLine();

        File file = new File(path, fileName);

        if (file.createNewFile()) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(content);
            bufferedWriter.close();
        }
    }
}