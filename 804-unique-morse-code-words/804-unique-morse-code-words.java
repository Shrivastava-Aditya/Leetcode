class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> code = new HashSet<>();
        
        
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char letter : word.toCharArray()){
                sb.append(morse[letter-'a']);
            }
            code.add(sb.toString());
        }
        return code.size();
    }
}