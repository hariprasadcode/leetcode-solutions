class Solution {
    public int[] scoreValidator(String[] events) {

    int score=0;
    int counter=0;
        for(int i=0;i<events.length;i++){
            if(counter==10){
                break;
            }
            if(events[i].equals("W")){
                counter++;
            }
             if(events[i].equals("WD") || events[i].equals("NB")){
                score++;
            }
            if(events[i].length()==1 && Character.isDigit(events[i].charAt(0))){
                char[]ch=events[i].toCharArray();
                int s=ch[0] - '0';
                score+=s;
            }

        }

      
   
    
      return new int[]{score,counter};  
        
    }
}