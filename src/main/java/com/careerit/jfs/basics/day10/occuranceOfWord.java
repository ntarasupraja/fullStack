package com.careerit.jfs.basics.day10;

public class occuranceOfWord {
    public static void main(String[] args) {
        String arr = """
                       Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                       Lorem Ipsum has been simply the industry's standard dummy text ever since the 1500s, 
                       when an unknown simply printer took a galley of type and simply scrambled it to make a type 
                       specimen book. It has survived simply not only five centuries, but also the leap 
                       into electronic typesetting, remaining essentially unchanged. 
                """;


        arr=arr.replaceAll(",","")
                .replaceAll("\\.","")
                .replaceAll("\\n","");
        String[] str=arr.split(" ");
        int count=occuranceofWord( str,"simply");
        System.out.println(count);
    }
    public static int occuranceofWord(String[] words,String text){
        int count=0;
        for(String ele:words){
            if (ele.equals(text)){
                count+=1;
            }
        }
    return count;
    }
}

