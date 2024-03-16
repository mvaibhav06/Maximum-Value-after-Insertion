public class MaxValueAfterInsertion {
    public String maxValue(String n, int x) {
        String out = "";
        if(n.charAt(0)=='-'){
            for(int i=1; i<n.length(); i++){
                int currentNumber = Character.getNumericValue(n.charAt(i));
                if(currentNumber>x){
                    out = n.substring(0,i) + x + n.substring(i);
                    return out;
                }
            }

        }else{
            for(int i=0; i<n.length(); i++){
                int currentNumber = Character.getNumericValue(n.charAt(i));
                if(currentNumber<x){
                    out = n.substring(0,i) + x + n.substring(i);
                    return out;
                }
            }
        }
        out = n + x;
        return out;
    }
}
