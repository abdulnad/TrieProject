import java.util.*;


public class main {
    public static void main(String[] args) {


        //ArrayLists
        ArrayList<String> al1 = randomStrings(100);
        ArrayList<String> al2 = randomStrings(500);
        ArrayList<String> al3 = randomStrings(1000);
        ArrayList<String> al4 = randomStrings(5000);
        ArrayList<String> al5 = randomStrings(7500);
        //My Tries
        Trie t = new Trie();
        Trie t2 = new Trie();
        Trie t3 = new Trie();

        //Insert Strings into Tries
        t.insert("pizza");
        t2.insert("pizza");
        t3.insert("pizza");
        for(String s:al1) t.insert(s);
        for(String s:al2) t2.insert(s);
        for(String s:al3) t3.insert(s);



        //Running Time - START t1
        long startTime = 0;
        long endTime = 0;
        long totalTime = 0;
        t.search("pizza"); // First search occurs to remove any memory allocation biases
        startTime = System.nanoTime();
        int a = t.search("pizza"); // TRIE SEARCH
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("t1 search time: " + totalTime);
        System.out.println("-------------");
        //END t1
        startTime = System.nanoTime();
        int b = t2.search("pizza"); // TRIE SEARCH
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("t2 search time: " + totalTime);
        System.out.println("-------------");
        //END t2
        startTime = System.nanoTime();
        int c = t3.search("pizza"); // TRIE SEARCH
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("t3 search time: " + totalTime);
        System.out.println("-------------");
        //END t3


        //ARRAY LIST SEQUENTIAL SEARCH
        startTime=System.nanoTime();
        searchAL(al1,"pizza"); // array list search
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("arrayList1 time: " + totalTime);
        //
        startTime=System.nanoTime();
        searchAL(al2,"pizza"); // array list search
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("arrayList2 time: " + totalTime);
        //
        startTime=System.nanoTime();
        searchAL(al3,"pizza"); // array list search
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("arrayList3 time: " + totalTime);
    }


    //Searches through an array list of random strings
    public static int searchAL(ArrayList<String> al, String s){
        int count = 0;
        for(int i=0;i<al.size();i++){
            if(al.get(i).contentEquals(s))
                count++;
        }
        return count;
    }

    //Generates an array list of random strings
    public static ArrayList<String> randomStrings(int size){
        ArrayList<String> strings = new ArrayList<>();



        for(int i=0;i<size;i++){
            String s = "";
            int randSize = (int) (Math.random()*10)+2;
            for(int j=0;j<randSize;j++){
                int randLetter = (int) (Math.random()*26)+97;
                char letter = (char) randLetter;
                s+=letter;
            }
            strings.add(s);

        }

        return strings;
    }
    /*
    //Generates a stack full of random strings
    public static Stack<String> randomStringsStack(int size){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<size;i++){
            String s = "";
            int randSize = (int) (Math.random()*10)+2;
            int r = (int) (Math.random()*5);
            for(int j=0;j<randSize;j++){
                int randLetter = (int) (Math.random()*26)+97;
                char letter = (char) randLetter;
                s+=letter;
            }
            stack.push(s);

        }

        return stack;
    }

     */


}
