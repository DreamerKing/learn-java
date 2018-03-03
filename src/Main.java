public class Main {

    public static void main(String[] args) {
       /* System.out.println("Hello World!");
        Integer a = new Integer("10");
        Integer b = new Integer(11);
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));
        float c = a.floatValue();
        System.out.println(c);
        String d=  "10100101";
        int e = Integer.parseInt(d,3);
        System.out.println(e);
        System.out.println(Integer.sum(1,2));*/

       int count;
       char[] values = { '*', '_', '%', '8', 'L', 'l', ' '};
       for(count = 0; count < values.length; count++) {
           if(Character.isDigit(values[count])) {
               System.out.println(values[count] + "是一个数字");
           }
           if(Character.isLetter(values[count])) {
               System.out.println(values[count] + "是一个字母");
           }
           if(Character.isLowerCase(values[count])) {
               System.out.println(values[count] + "是一个小写字母");
           }

           if(Character.isUnicodeIdentifierStart(values[count])) {
               System.out.println(values[count] + "是一个有效Unicode字符");
           }
           if(Character.isWhitespace(values[count])) {
               System.out.println(values[count] + "是一个空白字符");
           }
       }
    }
}
