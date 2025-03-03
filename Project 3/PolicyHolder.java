// PolicyHolder.java
public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean smoker;
    private double height;
    private double weight;

    public PolicyHolder(String firstName, String lastName, int age, boolean smoker, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    
    public boolean isSmoker() {
        return smoker;
    }

    @Override
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status (Y/N): " + (smoker ? "smoker" : "non-smoker") + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               "Policyholder's BMI: " + String.format("%.2f", calculateBMI());
    }
}
