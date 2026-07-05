class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] inputPieces = sentence.split("\\s+");
        for(int i = 0; i < inputPieces.length; i++) {
            if(inputPieces[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}