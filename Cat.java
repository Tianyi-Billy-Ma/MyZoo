import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Cat extends Feline{
		//public String sleep(){return "This Cat sleeps";		}
		@Override
		public String roam(){return "This Cat is roaming";}
		public String makeNoise(){return "The Cat makes noise";}
		public String wakeup()   //random response
		{
				List<String> response = Arrays.asList("Mewwwwww", "This cat is wakeup", "This cat doesn't want to wake up");
    		Random rand = new Random();
    		String action = response.get(rand.nextInt(response.size()));
				return action;
		}
		public String getType(){return "Cat";}
}
