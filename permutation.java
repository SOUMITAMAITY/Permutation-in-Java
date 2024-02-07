public class permutation {
    public static void permutation(String s, String perm){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            int temp=0;
            String newstring = s.substring(0, i)+s.substring(i+1);
            permutation(newstring, perm+currchar);
        }
        
    }
     //Time complexity = O(n*n!)
    public static void main(String[] args) {
        permutation("abc","");
        
    }
}