public class MaxIntegers {
    
//objetivo da atividade era corrigir um erro de logica, que consistia em que numeros repetidos faziam o max ser igual a 0
    
    public static void main(String[] args) {
        int num1 = 3, num2 = 3, num3 = 3;
        int max = 0;
       
        if (num1 > max) {
            max = num1; 
        }
       
        if (num2 > max) {
            max = num2; 
        }
       
        if (num3 > max) {
               max = num3;
        }
     

        System.out.println(" The max of 3 numbers is " + max);
    }

}
