package Tree;
import java.util.ArrayList;


public class HeapTree {

    ArrayList <Integer> array;

    public HeapTree(){
        array=new ArrayList<Integer>();
    }


         public int getRoot(){
            if(array.isEmpty()){

            return-1;
            }
            return array.get((0));
         }


    public void heappifyMax(int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < array.size() && array.get(left) > array.get(largest)) {
            largest = left;
        }
        if (right < array.size() && array.get(right) >  array.get(largest)) {
            largest = right;
        }
        if (largest != i) {

            int temp = array.get(largest);
            array.set(largest, array.get(i));
            array.set(i, temp);
            heappifyMax(largest);
       }
      }


       public void heappifyMin(int i) {

        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < array.size() && array.get(left) < array.get(smallest)) {
            smallest = left;
        }
        if (right < array.size() && array.get(right) <  array.get(smallest)) {
            smallest = right;
        }
        if (smallest != i) {

            int temp = array.get(smallest);
            array.set(smallest, array.get(i));
            array.set(i, temp);
            heappifyMin(smallest);
       }
      }



         public void add(int e ){
                array.add(e);
                for(int i =0;i<=array.size()/2-1; i++){
                heappifyMax(i);
            }
        }
        public void addmin(int e ){
                array.add(e);
                for(int i =array.size()/2-1;i>=0; i--){
                heappifyMin(i);
            }
        }
        public void print (){
            for(int i=0;i<array.size(); i++){
                System.out.print(array.get(i)+" ");


            }
        }
         public void heappifyMax(){
                for(int i =0;i<=array.size()/2-1; i++){
                heappifyMax(i);
            }
        }
         public void heappifyMin(){
                for(int i=array.size()/2-1; i >=0; i--){
                heappifyMin(i);
            }
        }

         public int search(int e ){
            int found = -1;
             for(int i=0; i<= array.size()-1; i++){
                if(e==array.get(i)){
                    found=i;
                }
            }
            return found;

         }
         public void remove(int e){
         int index = search(e);
        if(index != -1){
        int temp = array.get(array.size()-1);
        array.set(array.size()-1,array.get(index));
        array.set(index,temp );
         }
         array.remove(array.size()-1);
         System.out.println(" ");
         print();
         System.out.println(" ");

                for(int i=0; i<= array.size()-1; i++){
                heappifyMax(i);
            }
        }

     }