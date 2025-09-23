public class Assign2 {
    public static class Car{
        int year;
        String model;
        public Car(String model,int year){
            this.year=year;
            this.model=model;
        }
        public void displayDetails() {
            System.out.println("Model: " + this.model + ", Year: " + this.year);
        }
    }        
    public static void main(String args[]){
        Car car2=new Car("Toyota",2025);
        Car car1=new Car("Creta",2024);
        car1.displayDetails();
        car2.displayDetails();
    }
}
