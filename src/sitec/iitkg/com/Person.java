package sitec.iitkg.com;

public class Person {
	
	int prsId;
	String prsName;
	int age;
	public int getPrsId() {
		return prsId;
	}
	public void setPrsId(int prsId) {
		this.prsId = prsId;
	}
	public String getPrsName() {
		return prsName;
	}
	public void setPrsName(String prsName) {
		this.prsName = prsName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [prsId=" + prsId + ", prsName=" + prsName + ", age=" + age + "]";
	}
	
}
