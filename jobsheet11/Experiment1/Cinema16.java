package jobsheet11.Experiment1;

public class Cinema16 {
    public static void main(String[] args) {
        String[][] audiance = new String[4][2];
        audiance[0][0] = "Amin";
        audiance[0][1] = "Bena";
        audiance[1][0] = "Candra";
        audiance[1][1] = "Dela";
        audiance[2][0] = "Eka";
        audiance[2][1] = "Farhan";
        audiance[3][0] = "Gisel";
        audiance[3][1] = "Hana";
        System.out.printf("%s \t %s \n", audiance[0][0], audiance[0][1]);
        System.out.printf("%s \t %s \n", audiance[1][0], audiance[1][1]);
        System.out.printf("%s \t %s \n", audiance[2][0], audiance[2][1]);
        System.out.printf("%s \t %s \n", audiance[3][0], audiance[3][1]);
        System.out.println(audiance.length);
        for (String[] rowAudiance : audiance) {
            System.out.println("Lenght of row: "+rowAudiance.length);
        }
        System.out.println("Audiance in the row 3: ");
        for (int i = 0; i < audiance[2].length; i++) {
            System.out.println("audiance in the row "+(i+1)+String.join(", ", audiance[i]));
        }
    }
}