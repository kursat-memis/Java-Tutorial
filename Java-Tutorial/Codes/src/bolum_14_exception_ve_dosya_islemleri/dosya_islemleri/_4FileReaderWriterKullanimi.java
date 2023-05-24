package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri;

import java.io.*;

public class _4FileReaderWriterKullanimi {
    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("karakter.txt", true))) {
            bufferedWriter.write("merhaba");
            bufferedWriter.newLine();
            bufferedWriter.write("ben\n");
            bufferedWriter.write("kürşat\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("karakter.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
