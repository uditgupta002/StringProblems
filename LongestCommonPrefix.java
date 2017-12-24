import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonPrefix {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for(int t = 0;t < testCases;t++){
		    int length = Integer.parseInt(br.readLine());
		    String tempArr[] = br.readLine().split(" ");
		    int minLength = Integer.MAX_VALUE;
		    StringBuffer buf = new StringBuffer();
		    
		    for(String str: tempArr){
		        if(str.length() < minLength)
		            minLength = str.length();
		    }
		    
		    boolean exit = false;
		    for(int i=0;i<minLength && !exit ;i++){
		        char currentChar = tempArr[0].charAt(i);
		        //System.out.println("CurrentChar is "+currentChar);
		        for(int j=0;j<length;j++){
		            if(tempArr[j].charAt(i) != currentChar){
		                exit = true;
		                break;
		            }
		        }
		        if(!exit)
		            buf.append(currentChar);
		    }
		    System.out.println(buf.length() > 0 ? buf.toString():"-1");
		}
	}
}
