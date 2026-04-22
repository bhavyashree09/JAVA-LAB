import java.io.*;

class FileCopyLineByLine {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("File copied successfully");
    }
}