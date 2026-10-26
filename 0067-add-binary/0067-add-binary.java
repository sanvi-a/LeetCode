class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA;
            if (i >= 0) {
                digitA = a.charAt(i) - '0';
            } else {
                digitA = 0;
            }
            int digitB;
            if (j >= 0) {
                digitB = b.charAt(j) - '0';
            } else {
                digitB = 0;
            }
            int total = digitA + digitB + carry;
            int sum = total % 2;
            carry = total / 2;
            result.append(sum);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}

