package labsession8;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5}; // Missing 4
        int n = arr.length + 1;   // total numbers should be 5

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number: " + missing); // 4
    }
}
