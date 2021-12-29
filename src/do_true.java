public class do_true {
    public static void main(String[] args) {
        int vasyaAge = 45;
        int katyaAge = 17;
        int mishaAge = 17;
        int min = -1;
        int middle = -1;
        int max = -1;

        System.out.println(katyaAge);
        System.out.println(vasyaAge);
        System.out.println(mishaAge);
        System.out.println("--------------");

        /*get max*/
        if (katyaAge <= vasyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        }
        else if (vasyaAge <= katyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        }
        else if (katyaAge <= mishaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
        }
        /*get min*/
        if (katyaAge >= vasyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        }
        else if (vasyaAge >= katyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        }
        else if (katyaAge >= mishaAge && mishaAge <= vasyaAge) {
            min = katyaAge;
        }
        /*get middle*/
        if ((katyaAge >= vasyaAge && vasyaAge >= mishaAge) || (mishaAge >= vasyaAge && vasyaAge >= katyaAge)) {
            middle = vasyaAge;
        }
        else if ((vasyaAge >= katyaAge && katyaAge >= mishaAge) || (mishaAge >= katyaAge && katyaAge >= vasyaAge)) {
            middle = katyaAge;
        }
        else if ((katyaAge >= mishaAge && mishaAge >= vasyaAge) || (vasyaAge >= mishaAge && mishaAge >= katyaAge)) {
            middle = mishaAge;
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age " + max);
    }
}
