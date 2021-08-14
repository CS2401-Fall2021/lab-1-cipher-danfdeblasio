class Main {
  public static void main(String[] args) {
     runTests();
  }
  public void runTests(){
    // Here is an example test case
   String messageToEncode="here is a top secret message";
   String sampleEncoded="khuh lv d wrs vhfuhw phvvdjh";
   int shift =3;
   Cipher cipher= new Cipher(shift);
   System.out.println("Did it work?"+cipher.encode(messageToEncode).equals(sampleEncoded));

  // TODO: implement 3 more test cases, like the one above using inputs that handle the edge cases you've identified.
  }
  
   
}
