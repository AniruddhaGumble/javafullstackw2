package sp;

public class LeaveDetails {
	
	private int fulldays;
	private int halfdays;
	
	public LeaveDetails()
	{
		
	}
	
	public LeaveDetails(int fulldays, int halfdays) {
		super();
		this.fulldays = fulldays;
		this.halfdays = halfdays;
	}
	public int getFulldays() {
		return fulldays;
	}
	public void setFulldays(int fulldays) {
		this.fulldays = fulldays;
	}
	public int getHalfdays() {
		return halfdays;
	}
	public void setHalfdays(int halfdays) {
		this.halfdays = halfdays;
	}
	
	

}
