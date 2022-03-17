package myPackage;

public class BMI {
    int age;
    double weight;
    int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double calculateBMI(int age, double weight, int height){
        double totalBMI;
        totalBMI = weight / ((height * height)/10000);
        return totalBMI;
    }
}
