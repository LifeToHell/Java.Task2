import java.io.IOException;
import java.util.logging.*;

public class sort {

    public static void bubleSort(int[] arr) {
        
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }       
        

            
        
    }

    public static void main(String[] args) {
        Logger ii = Logger.getLogger(sort.class.getName());
        String logsPath = "log.txt";
        try {
            FileHandler fh = new FileHandler(logsPath, false);
            ii.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            int[] numbers = { 5, 9, 2, 0, 4 };
            bubleSort(numbers);
            for (int i = 0; i < numbers.length; i++) {
                ii.log(Level.INFO, "element " + numbers[i]);
                System.out.print(numbers[i] + " ");
            }
            ii.log(Level.WARNING, "logger off");
            ii.info("test");
            ii.warning("logsPath");
        }
         
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
