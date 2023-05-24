package bolum_11_generic;

public class GenericArrayPrint<Type> {
    public void print(Type[] arr) {
        for (Type temp : arr) {
            System.out.println(temp);
        }
        System.out.println("---------------------");
    }
}
