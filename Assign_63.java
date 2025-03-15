package daya_2;

public class Assign_63 
{
public static void main(String[] args)
{
	String s="    Daya Mounika Reddy ";
	String s1="";
	String S2=s.trim();
	System.out.println(S2);
	//System.out.println(s.trim());
	System.out.println(s.substring(6));//substring Staring index
	System.out.println(s.substring(6, 10));//sub string starting and ending index
	System.out.println(s.isEmpty());
	System.out.println(s1.isEmpty());
	System.out.println(s.replaceAll("Daya", "Mouni"));//string replace
	System.out.println(s.replace('D', 'M'));// character replace
	System.out.println(s.replaceFirst("Reddy", "Mounika"));//replacing any string with new string
	System.out.println(s.replace('u', 'z'));
	System.out.println(s.repeat(5));
}

}
