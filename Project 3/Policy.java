// Policy.java
public class Policy {
    private static int policyCount = 0;
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
    }
    
    public static int getPolicyCount() {
        return policyCount;
    }
    
    public double calculatePolicyPrice() {
        double basePrice = 600.0;
        if (policyHolder.calculateBMI() > 35) {
            basePrice += 200;
        }
        if (policyHolder.isSmoker()) {
            basePrice += 100;
        }
        return basePrice;
    }
    
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }
    
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString() + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }
}
