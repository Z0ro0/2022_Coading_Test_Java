public class Algo_ex7 {
    public static void main(String[] args){
        int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
        int x = 18; int n = A.length;
        int location;

        location = binarySearch(A, 0, n-1, x);

        System.out.println(x + "의 지수 = " + location);
    }

    public static int binarySearch(int[] A, int first, int last, int target){
        int result;

        if(first > last)//찾지 못한 경우
            result = -1;
        else {
            int mid = (first+last)/2; //중간 요소의 지수를 구함

            if(target==A[mid])//타겟이 중간 요수와 같은 경우
                result = mid;
            else if (target<A[mid])//타켓이 중간 요소보다 작으면 앞에서 찾기
                result = binarySearch(A, first, mid-1, target);
            else//타겟이 중간 요소보다 크면 뒤에서 찾기
                result = binarySearch(A, mid+1, last, target);
        }
        return result;
    }
}
