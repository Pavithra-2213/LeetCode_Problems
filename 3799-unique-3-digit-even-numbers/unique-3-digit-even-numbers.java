class Solution {
    public int totalNumbers(int[] digits) {

        int[] count = new int[10];

        for (int d : digits)
            count[d]++;

        int unique = 0;

        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 0; d2 <= 9; d2++) {
                for (int d3 = 0; d3 <= 9; d3++) {

                    if (d3 % 2 != 0)
                        continue;

                    if (d1 == d2 && count[d1] < 2)
                        continue;

                    if (d1 == d3 && count[d1] < 2)
                        continue;

                    if (d2 == d3 && count[d2] < 2)
                        continue;

                    if (d1 == d2 && d2 == d3 && count[d1] < 3)
                        continue;

                    if (count[d1] > 0 &&
                        count[d2] > 0 &&
                        count[d3] > 0) {
                        unique++;
                    }
                }
            }
        }

        return unique;
    }
}