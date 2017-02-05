
public class ArrayHandler {
    int getLargest(int[] data){
        int max = Integer.MIN_VALUE;
        for(int i =0; i < data.length; i++){
            if (data[i] > max)
                max = data[i];
        }
        return max;
    }
}
