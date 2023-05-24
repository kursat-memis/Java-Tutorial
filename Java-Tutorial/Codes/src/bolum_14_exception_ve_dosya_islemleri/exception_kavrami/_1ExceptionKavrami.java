package bolum_14_exception_ve_dosya_islemleri.exception_kavrami;

public class _1ExceptionKavrami {
    public static void main(String[] args) {
        try {
            Integer sayi = new Integer("asd");
            System.out.println("Sayi: " + sayi);
        } catch (Exception e) {
            System.out.println("Hata çıktı: " + e.toString());
        }

        // NullPointerException
        try {
            String s = null;
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            int x = 5 / 0;
            System.out.println("x: " + x);
        } catch (Exception e) {
            System.out.println("Hata: " + e.toString());
        }

        try {
            int[] sayilar = {1, 2, 3};
            System.out.println("Sayiların 3. indexindeki eleman: " + sayilar[3]);
        } catch (Exception e) {
            System.out.println("Hata: " + e.toString());
        }

        try {
            Object o = new Object();
            String b = (String) o;
        } catch (Exception e) {
            System.out.println("Hata: " + e.toString());
        } finally {
            System.out.println("Finally bloğu hata çıksa da çıkmasa da çalıştırılır.");
        }

        System.out.println("--------------------------------------");

        try {
            int deneme = 5 / 0;
        } finally {
            System.out.println("Catch blogu yazılmadığı için exception yakalanamadığından dolayı fırlatılacaktır ancak finally blogu calistiktan sonra.");
        }

        System.out.println("Program buradan devam ediyor.");
    }
}

