public class JPA405 {
    public static void main(String[] args) {
        char[] original = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] reversed = reverseArray(original);
        
        System.out.print("反轉陣列資料之前: ");
        printArray(original);
        
        System.out.print("反轉陣列資料之後: ");
        printArray(reversed);
    }
    
    public static char[] reverseArray(char[] array) {
        int length = array.length;
        char[] reversedArray = new char[length];
        
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        
        return reversedArray;
    }
    
    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
