
// Wahab, Abdul //

package circle;

import java.text.DecimalFormat;

class Circle{
    
double radius;

    public Circle (double r){
     radius = r;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
     
  public void setRadius(double newRadius)
  {
      radius = newRadius;
      
  }
public double getRadius(){
    return radius;
}
public boolean equals(Object o){
		if (!(o instanceof Circle)){
			return false;}
		Circle objCircle = (Circle) o;

		
		if (Math.abs(radius -objCircle.getRadius())<0.0001){
			return true;}
		else{
			return false;
		}
				
			
		}
	
	public String toString(){
		DecimalFormat areaFormat = new DecimalFormat("##0.00");
		return "Radius: " + radius + " Area; " +areaFormat.format(getArea()) ;
                
     
  }


                
                
        



        }

		
		
				
			
		
	
	
	




     












