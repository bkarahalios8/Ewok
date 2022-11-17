public class Main{
    public static void main (String args[]) {
        Ewok e1 = new Ewok();
        e1.setAge(7);
        System.out.println("Ewok 1's age is "+e1.getAge());

        Ewok e2 = new Ewok();
        e2.setAge(3);
        System.out.println("Ewok 2's age is "+e2.getAge());

        System.out.println("Ewok 1 is making the noise "+e1.makeNoise());
    }
}