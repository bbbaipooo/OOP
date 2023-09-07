public class Pro1_64011041 {
    public static void main(String[] args) throws Exception {
        int a,b,c,p=312032486,sumSeconds=157680000;
        a=sumSeconds/7;
        b=sumSeconds/13;
        c=sumSeconds/45;
        System.out.printf("The population for each of the next five years %d persons.",p+(a-b+c));
    }
}
