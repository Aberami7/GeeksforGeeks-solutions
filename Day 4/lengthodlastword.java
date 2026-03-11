public class lengthodlastword {
  
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String b= str[str.length-1];
        return b.length();
        
    }
}
    

