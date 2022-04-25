package atCampus02.zam.ss2022.Vererbung.Dog;

public class Dog {
    public String name;
    public String eyeColor;
    public int weigth;
    public boolean appreciatesOthersDogs;

//    public Dog() {
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weigth = 17;
//        this.appreciatesOthersDogs = true;
//    }

    public Dog(String name, String eyeColor, int weigth, boolean appreciatesOthersDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weigth = weigth;
        this.appreciatesOthersDogs = appreciatesOthersDogs;
    }

    public void bark() {
        System.out.println(name + " bellt ");
    }

    public void eat() {
        System.out.println(name + " eats ");
        bark();
    }

    @Override
    public String toString() {
        String text = null;
        if (appreciatesOthersDogs) {
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes ";
        } else {
            text = name + " barks until all dogs leave the park ";
        }
        return text;
    }
}
