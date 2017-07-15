/**
 * 
 */
package lights;

import java.util.concurrent.TimeUnit;

import service.LightTraffic;

/**
 * @author alex_jd
 *
 */
public class GreenLight implements LightTraffic {
	private int duration = 0;	
	
	public GreenLight(int duration){
		this.duration = duration;
	}

	/* (non-Javadoc)
	 * @see service.LightTraffic#myStatus()
	 */
	@Override
	public void myStatus() {
		// TODO Auto-generated method stub
		System.out.println("Now the GREEN light is shining. Duration is " + duration + " min");
		try {
			TimeUnit.MINUTES.sleep(duration);
		} catch (InterruptedException e) {
			
		}
		
	}
}
