package inheritanceDemo;

 class Device {
	 
	 void powerOn() {
		 System.out.println("Welcome");
	 }
	 

}

 class Laptop extends Device{
	 void code() {
		 System.out.println("Coding on laptop"); // is-A relationhip;
	 }
 }
 
 class Mobile extends Device {
	 void ring() {
		 System.out.println("Phone is ringing");
	 }
 }
 
 class Engine {
	 void start() {
		 System.out.println("engine is starting..");
	 }
 }
 
 class Car extends Engine{
	 Engine engine = new Engine();// has a relation;
	 void carEngine() {
		 System.out.println("Car has Engine");
		 engine.start();
	 }
 }