
public class Authentication { 
    public static void main(String[] args) { 
        boolean isLoggedIn = false; 
        boolean isPremiumUser = true; 
    
        if(isLoggedIn) 
        {     
            if(isPremiumUser) { 
                System.out.println("Welcome Premium User! You are authenticated."); 
            } else {
                System.out.println("Standard User authenticated. Upgrade to Premium?");
            }
        } else {
            System.out.println("Please log in first.");
        }
    } 
}
