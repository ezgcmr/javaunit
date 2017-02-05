
public class ArrayHandler {
    int getLargest(int[] data){
        int max = 0;
        for(int i =0; i < data.length; i++){
            if (data[i] > max)
                max = data[i];
        }
        return max;
    }
}
