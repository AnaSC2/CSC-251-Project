/// Demo.java
import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of policies: ");
        int numPolicies = scanner.nextInt();
        scanner.nextLine();

        Policy[] policies = new Policy[numPolicies];
        int smokerCount = 0, nonSmokerCount = 0;

        for (int i = 0; i < numPolicies; i++) {
            System.out.print("Enter Policy Number: ");
            int policyNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Provider Name: ");
            String providerName = scanner.nextLine();

            System.out.print("Enter Policyholder's First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Policyholder's Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Policyholder's Age: ");
            int age = scanner.nextInt();
            
            System.out.print("Is the Policyholder a smoker? (true/false): ");
            boolean smoker = scanner.nextBoolean();
            
            System.out.print("Enter Policyholder's Height (in inches): ");
            double height = scanner.nextDouble();
            
            System.out.print("Enter Policyholder's Weight (in pounds): ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smoker, height, weight);
            policies[i] = new Policy(policyNumber, providerName, holder);

            System.out.println("\nPolicy Details:");
            System.out.println(policies[i]);
            System.out.println("Policyholder's BMI: " + String.format("%.2f", holder.calculateBMI()));
            System.out.println("Policy Price: $" + String.format("%.2f", policies[i].calculatePolicyPrice()));
            System.out.println();
            
            if (holder.isSmoker()) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
        
        scanner.close();
    }
}
