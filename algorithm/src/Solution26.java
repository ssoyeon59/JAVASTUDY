public class Solution26 { // 제일 작은 수 제거하기

    public static int[] solution26(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) { //이 조건을 제일 먼저 줘서 -1값을 넣어주다
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length -1]; //최소값을 빼서 저장하기 위해 길이지정
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]); //Math.min 함수 (주어진 숫자들 중 가장 작은 값을 반환)
            }
            int index = 0;
            for(int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    continue;
                }
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println((int) solution26((4, 3, 2, 1));
    }
}
