public class Cipher{
  int shift;
  public Cipher(int shift){
    this.shift=shift;
  }
     // TODO: write a function that implements a cesear cipher
  public String encode(String s){
    String rtn = "";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) != ' '){
        rtn += (char)((int)s.charAt(i)+shift);
      }else{
        rtn += ' ';
      }
    }
    return rtn;
  }

  // Followup Problem1: You are at headquarters, and receive an encrypted message. 
  // You know the number by which it has been shifted. Write a method to decrypt it.
  public String decode(String s){
    String rtn = "";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) != ' '){
        rtn += (char)((int)s.charAt(i)-shift);
      }else{
        rtn += ' ';
      }
    }
    return rtn;
  }
}
