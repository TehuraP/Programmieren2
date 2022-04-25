package atCampus02.zam.ss2022.Vererbung.Dog;

public class Beagle extends Dog {
    public String lovedFood;
    //situation when we have default constructor
    //we did not  care about the dog inside our beagle
    // therefore the  defult constructir of the dog is called
    //Dog() -> this Dog() constructor is called at the beginning
    //of the Beagle constructor (imagine in the first line)
    //we could do this also explicitely by
    // super(); // calling parent constructor (is done automatically)

    //situation when we have no default constructor (-> means every constructor has at least parameter)
    //we have to explicitly call the constructor with super
    public Beagle(String name, String eyeColor, int weigth, boolean appreciatesOthersDogs, String lovedFood) {
        super(name, eyeColor, weigth, appreciatesOthersDogs);

        this.lovedFood = lovedFood;
    }

    //here I can override (überschreiben) my method and do my own implementation and not the one of my base classes
    @Override
    public void bark() {
        // eat(); we know that we can easily call other methods
        super.bark(); //without super. it would be a recursive method, we use super to reference implementation in the parent class
        super.bark();
    }
}
