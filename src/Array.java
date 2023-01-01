public class Array {
    int[] arr;
    int length=0;
    public Array(int size){
        arr=new int[size];
    }
    public void insert(int val){
        if(arr.length==length){
            int[] newArr = new int[length*2];
            for(int i=0; i<length; i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[length++]=val;
    }

    public void print(){
        System.out.print("[");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void remove(int index){
        System.out.println(index);
        if(index<0 || index>=length)
            throw new IllegalArgumentException();
        for(int i=index; i<length; i++)
            arr[i]=arr[i+1];
        length--;
    }

    public int indexOf(int item){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

}
