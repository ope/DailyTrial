class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }else if (x % 10 == 0){
            x = x / 10;
        }
        String input = String.valueOf(x);
        String output = "";
        char sign = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(ch == '-'){
                sign = '-';
            }else{
                sb.insert(0, ch);                
            }
        }
        if (sign == '-'){
            sb.insert(0, sign);
        }
        String str = new String(sb);
        int result = 0;
        try{
            result = Integer.valueOf(str).intValue();            
        }catch(NumberFormatException e){
            return 0;
        }
        return result;
    }
}
