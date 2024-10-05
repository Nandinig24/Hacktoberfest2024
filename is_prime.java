public class PrimeCheck {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Edge cases: numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }
        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // Not prime if divisible by any number
            }
        }
        return true;  // Prime if no divisors were found
    }
