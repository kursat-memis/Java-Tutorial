package bolum_0_temeller;

public class _1PrimitiveVsReferanceTypes {
    public static void main(String[] args) {
        // Primitive Types
        // Not: 8 bit = 1 byte

        // 1. byte: 1 byte'lık yer kaplar. -128 - 127 arasında değer alır. Tam sayı tutar.
        byte _byte1 = 127;

        // 2. short: 2 byte'lık yer kaplar. -32.768 - 32.767 arasında değer alır. Tam sayı tutar.
        short _short1 = 32767;

        // 3. int: 4 byte'lık yer kaplar. - 2.147.483.648 - 2.147.483.647 arasında değer alır. Tam sayı tutar.
        int _int1 = 2147483647;

        // 4. long: 8 byte'lık yer kaplar. -9,223,372,036,854,775,808 - 9.223.372.036.854.775.807 aralığında değer alır. Tam sayı tutar. Tanımlarken sona l || L yazılır.
        long _long1 = 9223372036854775807L;

        // 5. float: 4 byte'lık yer kaplar.  Virgüllü sayıları tutar. Noktadan sonrasının hassas olduğu sayılarda double önerilir. Tanımlarken sonuna f || F yazılır.
        float _float1 = 2.3f;

        // 6. double: 8 byte'lık yer kaplar. Virgüllü sayıları tutar. Float'a göre daha hassasdır.
        double _double1 = 2.3;
        double _double2 = 2.3D;

        System.out.println(_float1);
        System.out.println(_double1);
        System.out.println(_double2);

        // 7. boolean: 1 bit yer kaplar. True veya false tutar.
        boolean _boolean1 = true;

        // 8. char: 2 byte'lık yer kaplar. Unicode karakter tutar. \u0000 (veya 0) - \uffff (veya 65.535) arasında değer tutar. Herhangi bir karakteri saklamak için kullanılır.
        // Unicode karakter: Her karaktere bir sayı karşılığı atayan standart. ASCII'den farkı sadece ingilizce üzerine kurulu olmaması. Universal Code açılımına sahiptir.

        char _char1 = '\u0000';
        char _char2 = 0;
        char _char3 = '\uffff';
        char _char4 = 65535;

        System.out.println(_char1);
        System.out.println(_char2);
        System.out.println(_char3);
        System.out.println(_char4);

        // Referance Types
        // Wrapper Classlar gibi bir Class'dan üretilen objelere denir.

        Integer integer = new Integer(3);
        A a = new A();

        // Not: Her primitive type'ın bir wrapper class'ı vardır.

        Boolean b = new Boolean(true);
        Character c = new Character('a');
        b = true;
        c = 'b';

        // 0 öneki sayının sekizlik sistemde, 0x öneki ise sayının onaltılık sistemde olduğunu belirtir.
        int octal = 0144; // decimal karşılığı = 100
        System.out.println(octal);

        int hexa = 0x64; // decimal karşılığı = 100
        System.out.println(hexa);

        // String: Referans type'lıdır ancak immutable'dir.

        String s = "hello";

    }
}

class A {

}