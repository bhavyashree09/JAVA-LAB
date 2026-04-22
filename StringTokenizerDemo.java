import java.util.StringTokenizer;

class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}