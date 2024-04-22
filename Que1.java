
// String next permutations

public class Que1{
    static void reverse(char[] arr, int start,int end){
        while(start<=end){
            char temp1=arr[start];
            arr[start]=arr[end];
            arr[end]=temp1;
            start++;
            end--;
        }
    }
    public static void main(String [] args){
        String s="dcbat";
        int ind1=-1;
        int ind2=-1;
        char[] arr=s.toCharArray();
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)<s.charAt(i+1)){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){reverse(arr, 0, arr.length-1);System.out.println("no answer");return;}

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>s.charAt(ind1)){
                ind2=i;break;
            }
        }
        char temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        reverse(arr, ind1+1, arr.length-1);
    String ans="";

       for(char ch:arr){
        ans+=ch;
       }
       System.out.println(ans);
        // System.out.println(str);

    }
}