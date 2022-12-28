public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {45, 89, 67, 92, 74, 26, 80};
        int i;
        //정렬하기 전 배열 출력
        System.out.print("정렬 전 배열: ");

        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //삽입 정렬을 사용하기 정렬하기 위해 메소드 호출
        insertionSort(intArray);
        //정렬 후의 배열을 출력
        System.out.print("\n정렬 후 배열: ");

        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void insertionSort(int[] A){
        int i, j, insertElement;
        int n = A.length;
        for(i = 1; i < n; i++){
            //배열 재배열하여 정렬
            insertElement = A[i];

            j = i-1;

            //A[i]을 A[0..i-1]에 삽입할 지수를 찾는다
            while(j>=0 && A[j]>insertElement){
                A[j+1] = A[j];
                j = j-1;
            }
            //A[i]를 찾은 위치에 삽입
            A[j+1] = insertElement;
        }
    }
}
