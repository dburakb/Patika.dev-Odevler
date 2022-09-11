public class Teacher {
    String name;
    String telno;
    String branch;

    Teacher(String name, String telno, String branch) {
        this.name = name;
        this.telno = telno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.telno);
        System.out.println("Bölümü: " + this.branch);
    }
}
