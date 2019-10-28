public static String season(int month,int day){

   if((month>=9 && month<=12) && (day==15||day==16))
       return "Fall";    
   else{ 
       if ((month>=4 && month<=6) && (day==16||day==15))
           return "Spring";        
       else{
           if ((month>=6 && month<=9) && (day==16||day==15))
               return "Summer";    
           else 
               return"Winter";
       }
   }
