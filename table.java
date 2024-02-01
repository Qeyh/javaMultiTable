package multi_table;

public class table {
	
	public static void main(String[] args) {
        int tableSize = 10;
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int product = i * j;
                System.out.print(product + "\t");
            }
            System.out.println();
        }//change for commit
    }
}
