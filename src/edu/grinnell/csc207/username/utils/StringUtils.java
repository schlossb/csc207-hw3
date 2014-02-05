package edu.grinnell.csc207.username.utils;

public class StringUtils
{
  
  public static
 String[] splitAt (String str, char ch)
 {
   java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
   //ArrayList to store a variable amount of substrings
   java.util.ArrayList<String> DynStrs = new java.util.ArrayList<String>();

   //The most recent ch
int lastbreak = 0;
  //The last ch in the string
int finalbreak = str.lastIndexOf (ch);
pen.print ("final break: " + finalbreak);
  //the next ch in the string
int nextbreak = str.indexOf (ch);
if (nextbreak == 0)
DynStrs.add ("");

while (lastbreak < finalbreak)
  {
      nextbreak = str.indexOf(ch, lastbreak);
      DynStrs.add (str.substring (lastbreak, nextbreak));
      lastbreak = (nextbreak + 1);
   
  }//End String Parsing
   DynStrs.add (str.substring (finalbreak + 1));
   DynStrs.trimToSize ();

String[] result = new String[DynStrs.size ()];
DynStrs.toArray (result);
return result;


 }
  
  /**
   * @param args
   */
  public static void
    main (String[] args)
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
  String Str1 = "a::c";
  String[] Str2 = splitAt (Str1, ':');
  pen.println ("hi");
  for (int i=0;i<2;i++)
    {
      pen.println (Str2[i]);
    }

  

    // TODO Auto-generated method stub

  }

}
