public class TrieNode {


    TrieNode[] children = new TrieNode[26];
    String word;
    int occurances;


    TrieNode() {
        occurances=0;
        word="";
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }

}
