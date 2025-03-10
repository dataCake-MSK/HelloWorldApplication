import java.util.Arrays;

public class HelloWorldApplication {
    public static void main(String[] args){
        System.out.println("Hello World");

        int num = 0;
        final double pi = 3.14;  // 상수 초기화

        for (int i=0; i<4; i++){  // 반복문
            num = num + i;
        }

        System.out.println(num);

        int[] numArray = {11, 22, 33};
        System.out.println(numArray[0]);

        int[] numArray2 = new int[5];
        numArray2[0] = 44;
        numArray2[1] = 55;  // 나머지 요소는 초기값 0 유지

        System.out.println(numArray2);  // 메모리 위치
        System.out.println(Arrays.toString(numArray2));  // 패키지 사용 배열 출력
        System.out.println(numArray2.length);  // field 확인

        String greeting = "";
        String[] stringArray = {"How", "are", "you"};  // 문자열 배열 초기화
        for (String elem: stringArray){  // 다른 반복문
            greeting =  greeting + elem + "? ";
        }

        System.out.println(greeting);

        int[] numArray3 = {6, 7, 8};
        int[] copyArray = numArray3;
        numArray3[0] = 9;  // numArray3를 바꿨지만 shallow copy된 copyArray도 바뀜
        System.out.println(Arrays.toString(copyArray));
    }
}
