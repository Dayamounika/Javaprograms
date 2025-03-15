package daya_2;

public class Assign_64 
{
public static void main(String[] args) 
{
	String S="Tarun";
	String S1=S.concat("Krishna");
	System.out.println(S1);//Concatenating two strings

	//S.concat("Krishna");//immutable can't be changed
	//System.out.println(S);//immutable can't be changed
	StringBuffer B=new StringBuffer("Mouni");
	B.append("Reddy");//mutable it can be changeable
	System.out.println(B);
	StringBuilder S2=new StringBuilder("Edupuganti");
	S2.append("Mouni");
	System.out.println(S2);
}

}
