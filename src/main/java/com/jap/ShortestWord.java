package com.jap;


public class ShortestWord {
    public static void main(String[] args) {
       String words[]={"orange","apple","banana","grape","fig","cherry"};
       ShortestWord shortestWord=new ShortestWord();
       String shortword=shortestWord.findShortestWord(words);
       System.out.println("Shortest word in array is "+shortword);


    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
        String shortword;
        if(words.length==0){
            return shortword="Cannot find shortest word as array is empty";
        }

            shortword = words[0];
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() < shortword.length()) {
                    shortword = words[i];

                }
            }


        return shortword;
    }

}
