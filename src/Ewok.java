import java.util.Random;

public class Ewok
{
    //data fields for Ewok
    private String name;
    private int age;


    //constructor for Ewok
    public Ewok(){
        String ewokName = name;
        int ewokAge = age;
    }

    //generate random Ewok noise
    String makeNoise() {
        String noises[] = new String[] {"Chak", "Den", "Yaa-yaah!", "Kri", "Coatee-cha tu yub nub!", "Pritka pritka", "Chiba chiba sohpa?", "Safaka", "Fringa data moshvee!", "Fazwakreemo"};
        Random n = new Random();
        int randomNoise = n.nextInt(noises.length);
        return (noises[randomNoise]);
    }

    //name and age setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
