public class Test {
    public static void main(String[] args) {
        String input = "aaa果4金5a";
        StringBuffer sb = new StringBuffer();
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                int tmp = Integer.valueOf(String.valueOf(c[i]));
                for (int j = 0; j < tmp; j++) {
                    sb.append(c[i + 1]);
                }
                i++;
            } else {
                sb.append(c[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
