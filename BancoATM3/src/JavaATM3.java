
public class JavaATM3 {

    public static void main(String[] args) {
        
       int amount = 1687;             
       int[] billValues = {100,50,20,10,5,2};
       int[] numberofBills = getBuillDistribution(amount, billValues);
       
       printOutput(amount, billValues, numberofBills);
       
              
    }
    public static void printOutput(int amount, int[] billValues, int[] numberofBills){
        
        System.out.println("Dividindo R$" + amount + " em notas de: R$100 "
                + "R$20, R$10, R$5 e R$2");
        
        for (int i = 0; i < numberofBills.length; i++){ 
        System.out.println("Notas de R$" + billValues[i] + ": "
                    + numberofBills[i]);
        }
    
    }
    
    public static int[] getBuillDistribution(int amount, int[] billValues){ 
        
    int[] numberofBills = new int [billValues.length];
    
    for (int i=0; i < numberofBills.length; i++){
        
        numberofBills[i] = amount / billValues[i];
        amount %= billValues[i];
        
    }
    
         return numberofBills;
    
    }
    
    
    
}