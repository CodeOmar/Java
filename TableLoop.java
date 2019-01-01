public class TableLoop{
public static void main(String[] args){
   System.out.println("N\tN*10\tN*100\tN*1000");
   
   int a = 1, a2, a3, a4; 
   
   while (a <= 5){
   
   a2 = a*10;
   a3 = a*100;
   a4 = a*1000; 
   System.out.println(a + "\t"+ a2 + "\t\t" + a3 + "\t" + a4);
   
   a++; 
  }
 }
}