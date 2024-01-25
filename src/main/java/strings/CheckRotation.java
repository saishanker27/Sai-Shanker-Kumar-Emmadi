package strings;

public class CheckRotation {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        boolean isRotation = isRotation(str1, str2);
        System.out.println(isRotation);
    }
    private static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}