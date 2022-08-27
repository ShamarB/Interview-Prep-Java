package Tries;

public class Trie {
	
	private Node root;

    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) current.children[c - 'a'] = new Node(c);
            current = current.children[c - 'a'];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }
    
    //returns the very last node in a word
    private Node getNode(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) return null; //no node has that path of characters
            current = current.children[c - 'a'];
        }
        return current;
    }
    
    class Node {
        public char c;
        public boolean isWord;
        public Node[] children;
        
        public Node(char c) {
            this.c = c;
            isWord = false;
            children = new Node[26];
        }
    }
    
    public static void main(String[] args) {
    	String word = "hello";
    	Trie obj = new Trie();
    	obj.insert(word);
    	Node node = obj.getNode(word);
    	System.out.println(node.c);
    	boolean ans = obj.startsWith("hell");
    	System.out.println(ans);
    	boolean ans2 = obj.search("no");
    	System.out.println(ans2);
;    }

}
