package observer;

public class Button1 {
		public void onClick() {		// notify 부분
		// 이벤트 처리
		if(onClickListener != null) onClickListener.onClick(this);
		
	}
	
	public interface OnClickListener{   //Observer interface		
		public void onClick(Button1 button);			
	}	
	private OnClickListener onClickListener;	
	
	public void setOnClickListener(OnClickListener onClickListener) { 	// setObserver
		this.onClickListener = onClickListener;
	}
}
