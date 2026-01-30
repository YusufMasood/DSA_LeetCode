public class Q_10_X1832 {
    public static void main(String[] args) {



        //Q.No. 1832. Check if the Sentence Is Pangram




        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean[] appeared = new boolean[26];

        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);

            if(c >= 'a' && c <= 'z'){
                appeared[c - 'a'] = true;
            }

        }

        for(boolean val : appeared){
            if(!val){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);

    }
}
