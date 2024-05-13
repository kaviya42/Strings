import java.util.Objects;
public class Student {
 
	int roll;
	String name;
	double fee;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
 
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", fee=" + fee + "]";
	}
 
	public int hashCode() {
		return Objects.hash(roll);
	}
	
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		
		
		return roll == other.roll;
	}
		
}