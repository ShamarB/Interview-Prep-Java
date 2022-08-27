package String;

public class AddBinary {
	
	public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		String s1 = "11";
		String s2 = "1";
		AddBinary obj = new AddBinary();
		String res = obj.addBinary(s1, s2);
		System.out.println(res);
	}

}
