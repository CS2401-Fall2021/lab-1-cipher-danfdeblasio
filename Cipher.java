public class Cipher{
  int shift;
  public Cipher(int shift){
    this.shift=shift;
  }
     // TODO: write a function that implements a cesear cipher
  public String encode(String s){
    String rtn = "";
    for(int i=0; i<s.length(); i++){
      if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
        int index = (int)s.charAt(i)-(int)'a';
        index += shift;
        index %= 26;
        index += (int)'a';
        rtn += (char) index;
      }
      else if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
        int index = (int)s.charAt(i)-(int)'A';
        index += shift;
        index %= 26;
        index += (int)'A';
        rtn += (char) index;
      }
      else{
        rtn += s.charAt(i);
      }
    }
    return rtn;
  }

  // Followup Problem1: You are at headquarters, and receive an encrypted message. 
  // You know the number by which it has been shifted. Write a method to decrypt it.
  public String decode(String s){
    String rtn = "";
    for(int i=0; i<s.length(); i++){
      if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
        int index = (int)s.charAt(i)-(int)'a';
        index -= shift;
        if(index < 0) index += 26;
        index += (int)'a';
        rtn += (char) index;
      }
      else if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
        int index = (int)s.charAt(i)-(int)'A';
        index -= shift;
        if(index < 0) index += 26;
        index += (int)'A';
        rtn += (char) index;
      }
      else{
        rtn += s.charAt(i);
      }
    }
    return rtn;
  }
}
