/*
Omar Aguirre
Sentence
12-10-18 
 */
import java.util.Random; 
public class RandomSentence {

	public static void main(String[] args) {
		Random r = new Random();
		
		String[] articles = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"}; 
		
		for (int i = 0; i < 21; i++ ) {
			int index = r.nextInt(5);
			int index2 = r.nextInt(5);
			String cap = articles[index].substring(0,1).toUpperCase() + articles[index].substring(1);
		
			String sent = cap + " " + noun[index] + " " + verb[index] + " " + preposition[index] 
					+ " " + articles[index2] + " " + noun[index2] + "." ;	
			System.out.println(sent); 
		}//for loop 	
 }//body 
}//main