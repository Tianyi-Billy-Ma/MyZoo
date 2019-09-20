public class Zookeeper{
	public void selfIntroduce(){
		System.out.println("Hi, I'm Tianyi, the zookeeper.");
	}
	//tmp is the temperate animal that I would do some activities
	public void wakeTheAnimal(Animal tmp){
		System.out.println("Tianyi wake up " + tmp.getName());
	}
	public void callAnimal(Animal tmp){
		System.out.println("Tianyi roll call " + tmp.getName());
	}
	public void feedAnimal(Animal tmp){
		System.out.println("Tianyi feed " + tmp.getName());
	}
	public void closeZoo(Animal tmp){
		System.out.println("Tianyi let " + tmp.getName() + " go to sleep");
	}
	public void exercise(Animal tmp){
		System.out.println("Tianyi train " + tmp.getName());
	}
}
