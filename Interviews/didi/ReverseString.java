import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by qingliu on 7/13/18.
 */
public class ReverseString {
    /*
    * 题目：假设有字符串 ____abc__d_efg____hi(_ 代表空格)
    * 则输出 ： ____hi__efg_d____abc__
    * */
    public static void main(String[] args){
        reverse("    abc   d efg    hi");
    }

    private static void reverse(String input){
        List<String> space = new ArrayList<>();
        List<String> word = new ArrayList<>();

        char[] chars = input.toCharArray();

        //get space and word list
        for (int i = 0; i < chars.length; i++){
            StringBuffer spaceStr = new StringBuffer();
            StringBuffer wordStr = new StringBuffer();
            while (i < chars.length && chars[i] == ' '){
                spaceStr.append(chars[i]);
                i++;
            }
            while (i < chars.length && chars[i] != ' '){
                wordStr.append(chars[i]);
                i++;
            }
            space.add(spaceStr.toString());
            word.add(wordStr.toString());
            i = i - 1;
        }

        //reverse list
        Collections.reverse(word);
        for (int j = 0; j < space.size(); j++){
            System.out.print(space.get(j));
            System.out.print(word.get(j));
        }
    }
}
