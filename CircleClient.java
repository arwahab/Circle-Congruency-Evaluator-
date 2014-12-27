// Circle client //
// Wahab, Abdul //

package circle;
import java.util.Scanner;

public class CircleClient {
 public static void main(String[] args) {
     Scanner round = new Scanner(System.in);
Circle circleA, circleB, circleC;

System.out.println("Type the radius for Circle A: ");
double firstRadius = round.nextDouble();
while (firstRadius<0){
    System.out.println("Please enter a positive value for the radius.");
    firstRadius = round.nextDouble();
}
System.out.println("Type the radius for Circle B: ");
double secondRadius = round.nextDouble();
while (secondRadius<0){
    System.out.println("Please enter a positive value for the radius.");
    secondRadius = round.nextDouble();
}
System.out.println("Type the radius for Circle C: ");
double thirdRadius = round.nextDouble();
while (thirdRadius<0){
    System.out.println("Please enter a positive value for the radius.");
    thirdRadius = round.nextDouble();
}
 circleA = new Circle(firstRadius);
 circleB = new Circle(secondRadius);
 circleC = new Circle(thirdRadius);
 
 if(circleB.equals(circleA))
 {
 System.out.println("Circle A & Circle B are the same!");
 }
 else 
 {
 System.out.println("Circle A & Circle B are not equal!");
 
 if(circleA.equals(circleC))
 {
 System.out.println("Circle A & Circle C are the same!");
 }
 else 
 {
 System.out.println("Circle A & Circle C are not equal!");
 }
 
 }
 }
 }

 
 
