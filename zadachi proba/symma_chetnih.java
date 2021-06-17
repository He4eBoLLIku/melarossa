public class Main {
    public static void main(String[] args) {

        Integer[] num = {20, 2, 12, -55,-200,-220, -99,-155,14,-5 };
        int sum=0;
        for (int i:num) {
            if ((i > 0) && (i % 2 == 0)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
