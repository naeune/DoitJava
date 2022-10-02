package singleton;

public class Company {
	private static Company instance = new Company(); // 유일하게 생성된 인스턴스
	public static Company getInstance() { // 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
