public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2 = new Teacher("Graham Bell","0000","FZK");
        Teacher t3 = new Teacher("Külyutmaz","1111","BİO");

        Course tarih = new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK",t2);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji","103","BİO",t3);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();

        Student s2 = new Student("Düdük Necmi","444","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,50,70);
        s2.isPass();
    }
}
