import java.util.Arrays;
import java.util.List;
//Main Running program.
abstract class running{
	public static void main(String[] args){
    Animal[] animals = new Animal[16];
		// Give name to each animal
    List<String> animals_name_list = Arrays.asList("Lily","Liam","Harry","Hulk","David","Dylan","Cathey","Clark","Emily","Eason","Walt","Whiteside","Tom","Tiana","Roy","Richard");
    for(int i = 0 ; i < 16; i++)
    {
      String animal_name = animals_name_list.get(i);
      String firstChar = animal_name.substring(0,1);
      if(firstChar.equals("L"))
      {
        animals[i] = new Lion();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("H"))
      {
        animals[i] = new Hippo();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("D"))
      {
        animals[i] = new Dog();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("C"))
      {
        animals[i] = new Cat();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("E"))
      {
        animals[i] = new Elephant();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("W"))
      {
        animals[i] = new Wolf();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("T"))
      {
        animals[i] = new Tiger();
        animals[i].giveAnimalName(animal_name);
      }
      else if(firstChar.equals("R"))
      {
        animals[i] = new Rhino();
        animals[i].giveAnimalName(animal_name);
      }
    }

    Zookeeper billy =  new Zookeeper();
    billy.selfIntroduce();
    //Responsibilities I
    //Polymorphism: Class Animal    * Cat is random response * Lion is oveeride function in class Lion
    System.out.println("------------------------------------------");
    System.out.println("Responsibilities 1: wake the animals");
    for(int i = 0; i < 16;i++)
    {
      System.out.print((i+1)+".");  //Index
      billy.wakeTheAnimal(animals[i]);
      System.out.println(animals[i].getName() + " is a " + animals[i].getType());
      System.out.println(animals[i].getName() + "'s species is " + animals[i].getspecies());
      System.out.println(animals[i].getName() + "'s response: " + animals[i].wakeup());

    }
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println();
    //Responsibilities II
    //Polymorphism: Class Type of each Animal
    System.out.println("Responsibilities 2: roll call the animals");
    for(int i = 0; i < 16;i++)
    {
      System.out.print((i+1)+".");
      billy.callAnimal(animals[i]);
      System.out.println(animals[i].getName() + " is a " + animals[i].getType());
      System.out.println(animals[i].getName() + "'s species is " + animals[i].getspecies());
      System.out.println(animals[i].getName() + "'s response: " + animals[i].makeNoise());

    }
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println();
    //Responsibilities III
    //Polymorphism: Class Animal
    System.out.println("Responsibilities 3: feed the animals");
    for(int i = 0; i < 16;i++)
    {
      System.out.print((i+1)+".");
      billy.feedAnimal(animals[i]);
      System.out.println(animals[i].getName() + " is a " + animals[i].getType());
      System.out.println(animals[i].getName() + "'s species is " + animals[i].getspecies());
      System.out.println(animals[i].getName() + "'s response: " + animals[i].eat());
    }
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println();
    //Responsibilities IV
    //Polymorphism: Class Animal
    System.out.println("Responsibilities 4: exercise the animals");
    for(int i = 0; i < 16;i++)
    {
      System.out.print((i+1)+".");
      billy.exercise(animals[i]);
      System.out.println(animals[i].getName() + " is a " + animals[i].getType());
      System.out.println(animals[i].getName() + "'s species is " + animals[i].getspecies());
      System.out.println(animals[i].getName() + "'s response: " + animals[i].roam ());
    }
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println();
    //Responsibilities V
    //Polymorphism: Class Species of each Animal
    System.out.println("Responsibilities 5: shut down the Zoo");
    for(int i = 0; i < 16;i++)
    {
      System.out.print((i+1)+".");
      billy.closeZoo(animals[i]);
      System.out.println(animals[i].getName() + " is a " + animals[i].getType());
      System.out.println(animals[i].getName() + "'s species is " + animals[i].getspecies());
      System.out.println(animals[i].getName() + "'s response: " + animals[i].sleep());
    }
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println();

	}
}
