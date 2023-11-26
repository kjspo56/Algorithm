package test;

import java.util.Arrays;

public class test {

    //https://velog.io/@lynn080 참고
    //퀵 정렬을 시행할 재귀 함수
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int pivot = partition(arr, left, right); // 가장 partition 함수를 실행해 나오는 pivot 값

        quickSort(arr, left, pivot - 1); //pivot 좌측 quickSort
        quickSort(arr, pivot + 1, right); //pivot 우측 quickSort
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left; //pivot 좌측 index
        int j = right; //pivot 우측 index

        while (i < j){
            while (pivot < arr[j] && i < j){
                j--; //우측에서 시작해 pivot 값보다 작은 값이 나올때까지 j 찾기
            }

            while (pivot >= arr[i] && i < j){
                i++; //좌측에서 시작해 pivot 값보다 크거나 같은 값이 나올 때까지 i 찾기
            }

            swap(arr, i, j); // arr[i]와 arr[j]의 값을 swap
        }
        swap(arr, left, i); // i와 j가 만난 자리의 값과 pivot 값을 swap
        return i; //새로운 pivot 자리의 index
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 4, 7, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("result: " + Arrays.toString(arr));
    }
}
