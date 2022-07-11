package week1.day2;

public class MyMobile {
int model = 720;
float version = 6.1f;
char type = 'C';
String name = "Windows";
public void makeCall() {
System.out.println("Calling");
}
public void sendMsg() {
System.out.println("Message has been sent");
}
private void payBills() {
System.out.println("Bill payment has been successful");
}
public static void main(String[] args) {
MyMobile output= new MyMobile();
System.out.println("Model No:" +output.model);
System.out.println("OS Version:" +output.version);
System.out.println("Charger type:" +output.type);
System.out.println("OS Name:" +output.name);
output.makeCall();
output.sendMsg();
output.payBills();
}
}
