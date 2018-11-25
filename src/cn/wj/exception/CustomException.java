package cn.wj.exception;

/**
 * 
 * <p>Title: CustomException</p>
 * <p>Description: 绯荤粺鑷畾涔夌殑寮傚父绫诲瀷锛屽疄闄呭紑鍙戜腑鍙兘瑕佸畾涔夊绉嶅紓甯哥被鍨�/p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2015-3-22涓嬪崍2:50:30
 * @version 1.0
 */
public class CustomException extends Exception {
	
	//寮傚父淇℃伅
	private String message;
	
	public CustomException(String message){
		super(message);
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
