public class BuilderExample {
    // Car class with Builder pattern
    public static class Car {
        private String type;
        private String color;
        private String brand;
        private int carId;

        //Car car=new Car(type,color,brand,carID)
        //car car=new Car(type,color,brand,null)
        

       
        private Car(Builder builder) { //Builder class and builder instance 
            this.type = builder.type;
            this.color = builder.color;
            this.brand = builder.brand;
            this.carId = builder.carId;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public String getBrand() {
            return brand;
        }

        public int getCarId() {
            return carId;
        }

        // Builder class
        public static class Builder {
            private String type;
            private String color;
            private String brand;
            private int carId;

            public Builder setType(String type) {
                this.type = type;
                return this;
            }

            public Builder setColor(String color) {
                this.color = color;
                return this;
            }

            public Builder setBrand(String brand) {
                this.brand = brand;
                return this;
            }

            public Builder setCarId(int carId) {
                this.carId = carId;
                return this;
            }

            public Car build() {
                return new Car(this);
            }
        }
    }

    public static void main(String[] args) {
        // Creating car objects using the Builder pattern
        Car car1 = new Car.Builder()
                .setType("Sedan")
                .setColor("Blue")
                .setBrand("Toyota")
                .setCarId(1)
                .build();

        Car car2 = new Car.Builder()
                .setType("SUV")
                .setColor("Red")
                .setBrand("Honda")
                .setCarId(2)
                .build();

        // Accessing car details
        System.out.println("Car 1: Type=" + car1.getType() + "s, Color=" + car1.getColor() + ", Brand=" + car1.getBrand() + ", CarId=" + car1.getCarId());
        System.out.println("Car 2: Type=" + car2.getType() + ", Color=" + car2.getColor() + ", Brand=" + car2.getBrand() + ", CarId=" + car2.getCarId());
    }
}
