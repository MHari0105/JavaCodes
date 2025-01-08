public class Main {
    public static void main(String[] args) {

        String uuid = "existing_new";
        String existingUid = uuid.split("_")[0];
        String newId = uuid.split("_")[1];

        System.out.println(existingUid + " : " + newId);
    }
}