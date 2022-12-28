public class BubbleSort {
    public static void main(String[] args){
        int[] intArray = {89, 45, 67, 92, 39, 74, 26, 90};
        int i;

        System.out.print("정렬 전 배열: ");
        //정렬되기 전의 배열 출력
        for (i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
        bubbleSort(intArray);//정렬하기 위해 메소드 호출

        System.out.print("\n정렬 후 배열: ");

        for (i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void bubbleSort(int[] A){
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j < A.length-1; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}
