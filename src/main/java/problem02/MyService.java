package problem02;

public class MyService extends BaseService {
	
	
	public void service(String state) {
		if (state == "낮") {
			System.out.println("낮서비스시작");
		
		}
		if (state == "오후") {
			System.out.println("오후서비스시작");
		
		}
		else if (state == "밤") {
			System.out.println("밤서비스시작");
		
		}
		
	}
	
}
