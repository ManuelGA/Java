package p1;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog1 = new Labrador("Chucky", "white");
        System.out.println(dog1.getName() + " says " + dog1.speak());

        Dog dog2 = new Yorkshire("Meh");
        System.out.println(dog2.getName() + " says " + dog2.speak());


        System.out.println(dog1.avgBreedWeight());

        System.out.println(dog2.avgBreedWeight());


    }
}