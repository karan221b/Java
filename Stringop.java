class Stringop{
public static void main(String args[]){
int value=20;
String s1="whatsup";  
String s2="hello";
String s3="hello";
String s4,s7,s9;
String s5="";
String s6 = "HELLO user";
String s8="hello user";
String s10="hello     ";

s4=s2.concat(" how are you");
String s6lower=s6.toLowerCase();
String s6upper=s6.toUpperCase(); 
s7 = String.valueOf(value); 
s9=s8.replace("user","admin");

System.out.println("string length is: "+s1.length()+"    // string length");  
System.out.println(s2.compareTo(s3)+"    //string comparision");
System.out.println(s4+"    // string concatination");
System.out.println(s2.isEmpty()+"    // isempty=True");
System.out.println(s5.isEmpty()+"   //isempty=false");
System.out.println(s10+"how are you"+"      //without trim");  
System.out.println(s10.trim()+"how are you"+"   //with trim"); 
System.out.println(s6lower+"    //to lower case");
System.out.println(s6upper+"    //to upper case");
System.out.println(s7+"    // valueof operator");
System.out.println(s9+"    //string replace (user is replaced by admin)"); 

}
}