package HW04;

public class hwex3 {
    //3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    public static void main(String[] args){
        for(int a = 90, b = 0; a>b; a-=5){
            System.out.println(a);
        }
    }
}
