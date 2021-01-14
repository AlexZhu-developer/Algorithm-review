public class recursionmaxnum {
 public int maxnum(int[] list){
    int a = 0;
    if(list.length == 2){
        if(list[0]>list[1]){
            return list[0];
        }else{
            return list[1];
        }
    }
     int sub_max = maxnum(list.remove(0));
     if(list[0]>sub_max){
         return list[0];
     }else{
         return sub_max;
     }

        }


}
