package observer;
import observer.Button1.OnClickListener;

public class Application {

	public static void main(String[] args) {
		
		Button1 btn = new Button1();
		
		btn.setOnClickListener(new OnClickListener() {		// 익명 클래스 
			@Override
			public void onClick(Button1 button) {
				// TODO Auto-generated method stub
				System.out.println(button+" is Clicked");
			}
		});
		btn.onClick();
	}
}
