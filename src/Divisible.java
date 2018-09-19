
public class Divisible {
	public static void main(String[] args) {
		int x = 2; //everything is divisible by 1, so I'm starting at 2
		while(true) {
			int counter = 0;
			for(int y = 2; y < 21; y++) { //starting at 2 again
				counter++; // I want to count the amount of times this loops, if it hits 19, the number is divisible by 1->20
				if(x % y != 0) { // if x is divisible by y, I don't want this number
					break; //ends the for loop to stop extra loops (also makes the counter work correctly)
				}
			}
			if(counter == 19) { //if the counter is 19, the number is divisible by 1-20
				System.out.println(x); //gives the number 
				break; // once I find the number, I want the loop to terminate
			}
			x++;
		}
	}
	
}
