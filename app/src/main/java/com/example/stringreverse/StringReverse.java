package com.example.stringreverse;

public class StringReverse {
     public  String reversestring(String string){
StringBuilder subbuild = new StringBuilder();
for(int i = string.length() - 1; i >= 0; i--){
    subbuild.append(string.charAt(i));
}
     return subbuild.toString();
     }

}
