package reference;


public class CallByReference02 {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        ref_a.age = 10;
        ref_b.age = 20;

        System.out.println(ref_a);
        System.out.println(ref_b);
    }
}

class Animal {
    public int age;
}
