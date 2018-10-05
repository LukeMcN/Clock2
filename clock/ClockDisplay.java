/*LukeMcNair
 * Version 1 // Basic Framework
*/
package clock;

public class ClockDisplay {

	
	private NumberDisplay hour;
	private NumberDisplay minute;
	private String display;



	public ClockDisplay(){
		
		hour = new NumberDisplay(24);
		minute = new NumberDisplay(60);
		updateDisplay();
		
		
	}
	
	public ClockDisplay(int hours, int minutes){
		hour = new NumberDisplay(24);
		minute = new NumberDisplay(60);
		setTime(hours,minutes);
	}
	
	public void timeTick(){
		
	}
	
	public void setTime(int hour, int minutes){
		
	}
	
	public String getTime(){
		return display;
	}
	
	private void updateDisplay(){
		
	}
	
	
	
		
	public static void main(String[] args){
	
		
		
	}

}	