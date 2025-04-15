
 public class PrimeCheck {
        public static boolean isPrime(int num, int divisor) {
            if (num < 2) {
                return false; // Numbers less than 2 are not prime
            }
            if (divisor == 1) {
                return true; // If we've checked all divisors, it's prime
            }
            if (num % divisor == 0) {
                return false; // If num is divisible by any divisor, it's not prime
            }
            return isPrime(num, divisor - 1); // Check for next divisor
        }
    
        public static void main(String[] args) {
            int num = 7; // Change this number to test
            boolean result = isPrime(num, num / 2); // Start checking from num/2
            if (result) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
 }

