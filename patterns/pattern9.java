// 0-1 TRIANGLE Algorithm 

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


public class pattern9 {

    public static void inverted_rotated_pyramid_number(int n){

        for (int i = 1; i <= n; i++) {
            
            for(int j = 1; j<=i; j++){
                
                if((i+j) % 2 == 0){
                    System.out.print(" "+"1");
                }else{
                    System.out.print(" "+"0");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        inverted_rotated_pyramid_number(5); 
        
    }
}