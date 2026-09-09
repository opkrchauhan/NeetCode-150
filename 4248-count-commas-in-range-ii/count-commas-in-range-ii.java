class Solution {
    public long countCommas(long n) {
        long sum = 0;

        long start = 1000;
        long commas = 1;

        while (start <= n) {

            long end = start * 1000 - 1;
            long last = Math.min(n, end);

            long count = last - start + 1;

            sum += count * commas;

            start *= 1000;
            commas++;
        }

        return sum;
    }
}