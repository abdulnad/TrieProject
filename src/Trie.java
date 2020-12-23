public class Trie {
    TrieNode root = new TrieNode();


    public void insert(String s){

        TrieNode node = root;

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';

            if(node.children[index]==null)
                node.children[index] = new TrieNode();


            node = node.children[index];
        }
        node.word = s;
        node.occurances++;

    }

    public int search(String s){
        TrieNode node = root;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(node.children[index]==null)
                return 0;
            node = node.children[index];

        }
            if(node.word.contentEquals(s))
                return node.occurances;
            else return 0;


    }









}
