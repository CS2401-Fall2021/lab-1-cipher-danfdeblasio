class Main {
  public static void main(String[] args) {
     runTests();
  }
  public static void runTests(){
    // Here is an example test case
   String messageToEncode="here is a top secret message!";
   String sampleEncoded="khuh lv d wrs vhfuhw phvvdjh!";
   int shift =3;
   Cipher cipher= new Cipher(shift);

   // Can we change this to create a temp string on encode
   // also we're avoiding objects, so maybe we can make it a static method within this class? 
   // i.e. encode(String in, int shift) and decode(String in, int shift)
   System.out.println(cipher.encode(messageToEncode));
   System.out.println("Did it work?"+cipher.encode(messageToEncode).equals(sampleEncoded));

  // TODO: implement 3 more test cases, like the one above using inputs that handle the edge cases you've identified.
  }
  
   
}
