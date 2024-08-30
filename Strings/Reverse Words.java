package string;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str="Hello Hi I am akash";
		
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.print(rev(s[i]));
			System.out.print(" ");
		}
		
	}
	static String rev(String str) {
		char[] ch=str.toCharArray();
		int l=0,h=ch.length-1;
		while(l<h) {
			char t=ch[l];
			ch[l]=ch[h];
			ch[h]=t;
			l++;
			h--;
		}
		String st=new String(ch);
		return st;
	}
}
