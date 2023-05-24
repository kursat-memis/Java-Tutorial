package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri;

import java.io.*;

public class _2TryWithRecourses {
    public static void main(String[] args) {
        /*
            TryWithRecourses:
            - Açılan dosyayı finally bloğu kullanarak manuel olarak kapatmamız yerine dosyayla iş bitildiğinde java tarafından otomatik
            kapatılmasını sağlar.
            Tek yapman gereken: try dedikten sonra () koy ve dosyayı bu parantezler içinde tanımla.
         */


        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.dat")));) {
            dataOutputStream.writeUTF("merhaba");
            dataOutputStream.writeUTF("ben");
            dataOutputStream.writeUTF("try-with-recourses.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("test.dat")))) {
            boolean endOfFile = false;
            while(!endOfFile) {
                try {
                    System.out.println(dataInputStream.readUTF());
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
