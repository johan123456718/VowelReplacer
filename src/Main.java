/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.replaceVowels("minnie mouse", '?'));
    }
    
    
    public String replaceVowels(String str, char sign){
        
        String tmp = str.toLowerCase(); //In case if someone writes with capital letters
        char[] letters = tmp.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < letters.length; i++){
            
            switch(letters[i]){
                
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                case 'y':
                    sb.append(letters[i] = sign);
                break;
                default:
                    sb.append(letters[i]);
            }
        }
        
        return sb.toString();
    }
}
