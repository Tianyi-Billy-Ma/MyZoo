public abstract class Animal{
	private String animal_name;
	public void giveAnimalName(String name){this.animal_name = name;}
	public String getName(){return this.animal_name;}
	public String sleep(){return"This animal sleeps";}
	public String eat(){return "This animal is eating";}
	public String getType(){return "Animal";}
	public String getspecies(){return "Animal";}
	public String makeNoise(){return "This animal making noise";}
	public String wakeup(){return "This animal is wake up";}
	public String roam(){return "This Animal is roaming";}

}
