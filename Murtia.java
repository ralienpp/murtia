import java.awt.Robot;
// import java.util.Random;

public class Murtia {

    public static void main(String[] args) throws Exception{
        System.out.println("Stared");
		
		Robot robot = new Robot();
		int i = 0;
		
		while(true){
			robot.mouseMove(i+1, i+1);
			Thread.sleep(5000);
			System.out.println("Just moved it");
			i++;
			if (i == 10) {
				i=0;
			}
		}
    }

}
