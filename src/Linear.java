public class Linear{

    public static int linearFunction(int[] arr, int target){
        if(arr.length==0 || arr==null){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }

    public static String searchInString(String str, char target){
        if(str==null || str.length()==0){
            return "";
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target) return str.charAt(i)+"";
        }
        return "nothing to return";
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int target=5;
        System.out.println(searchInString("piyush bansal",'m'));
    }
}