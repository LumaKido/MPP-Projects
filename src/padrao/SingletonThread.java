package padrao;

public class SingletonThread {
	private static volatile SingletonThread instance;
	private String data;
	
	private SingletonThread(String data) {
		this.data = data;
	}
	
	public static SingletonThread getInstance(String data) {
		SingletonThread result = instance;
		if(result == null) {
			synchronized (SingletonThread.class){
				if(result == null) {
					instance = result = new SingletonThread(data);
				}
			}
		}	
		return result;
	}
}
