# lab1_cipher
**You are a spy, and want to transform your message into something that your enemy cannot read if it is intercepted, but headquarters can still read. You need a Cipher!**

**A cipher (or cypher) is an algorithm for performing encryption or decryption—a series of well-defined steps that can be followed as a procedure.**

**Specifically, let’s implement a ceasar cipher: a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.**



![ciper diagram](https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Caesar_cipher_left_shift_of_3.svg/1200px-Caesar_cipher_left_shift_of_3.svg.png)



1. Ask clarifying questions (5 pts)
2. Walk through an example (5 pts)
3. List  edge cases(5 pts)
4. Describe approach as you would to a little cousin who does not know anything about computer science terms (15 pts)
5. Based off your description, identify keywords that hint what ds&a you should use in your implementation (5 pts)
6. [individually] Write Code (35 pts)
    1. Add comments describing what the code does (5 pts)
    2. Define method signature (what does it return? What are its inputs?) (5 pts)
    3. Handle edge cases
7. List 3 test cases based off edge cases, write tests  (15 pts)
8. Followup Problem1: You are at headquarters, and receive an encrypted message. You know the number by which it has been shifted. Write a method to decrypt it (5 pts).
9. Bonus Problem 1: You intercepted a message from your enemy, who also uses cesar ciphers. What does it say? How much was it shifted by? (5 extra lab pts)

*Nv dvvk rk dzuezxyk ze fiuvi kf gcre fli rkkrtb. Sizex tffbzvj reu screbvkj wfi kyv gzccfn wfik.*

10. Bonus Problem 2: That doesn't seem all that secure does it? You only have to check 26 options. Implement encode/decode methods in such a way that it would be harder to decode by an enemy. What information would both the encoder and decoder need to know? How many options would a enemy who interecepted need to check?

Possible ideas include
* Instead of shifting, each letter transforms to a predefined ordering  (or permutation) of the characters
* Instead of the lowercase alphabet, each letter transforms to any charachter
* Advanced: Implement an [RSA encryption](https://simple.wikipedia.org/wiki/RSA_algorithm)
