class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> code = new HashSet<>();
        
        
        for(String word : words){
            String tmp = "";
            for(char letter : word.toCharArray()){
                tmp+=morse[letter-'a'];
            }
            code.add(tmp);
        }
        return code.size();
    }
}