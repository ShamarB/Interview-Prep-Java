package String;

public class BackspaceCompare {
	
	public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1;
        int index2 = t.length() - 1;
        
        while (index1 >= 0 || index2 >= 0) {
            int i1 = getNextIndex(s, index1);
            int i2 = getNextIndex(t, index2);
            
            if (i1 < 0 && i2 < 0)
                return true;
            if (i1 < 0 || i2 < 0)
                return false;
            if (s.charAt(i1) != t.charAt(i2))
                return false;
            
            index1 = i1 - 1;
            index2 = i2 - 1;
        }
        return true;
    }
    
    public int getNextIndex(String s, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (s.charAt(index) == '#')
                backspaceCount++;
            else if (backspaceCount > 0)
                backspaceCount--;
            else
                break;
            
            index--;
        }
        return index;
    }

	public static void main(String[] args) {
		String s1 = "ab#c";
		String s2 = "ad#c";
		BackspaceCompare obj = new BackspaceCompare();
		boolean ans = obj.backspaceCompare(s1, s2);
		System.out.println(ans);
	}

}
