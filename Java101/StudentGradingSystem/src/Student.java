public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalQuizNote = matVerbal;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.verbalQuizNote = fizikVerbal;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalQuizNote = kimyaVerbal;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.verbalQuizNote == 0
                || this.fizik.note == 0 || this.fizik.verbalQuizNote == 0
                || this.kimya.note == 0 || this.kimya.verbalQuizNote == 0)
        {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f\n", this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note * 0.8 + this.fizik.verbalQuizNote * 0.2
                + this.kimya.note * 0.85 + this.kimya.verbalQuizNote * 0.15
                + this.mat.note * 0.75 + this.mat.note * 0.25) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " - sözlü notu: " + this.mat.verbalQuizNote);
        System.out.println("Fizik Notu : " + this.fizik.note + " - sözlü notu: " + this.fizik.verbalQuizNote);
        System.out.println("Kimya Notu : " + this.kimya.note + " - sözlü notu: " + this.kimya.verbalQuizNote);
    }
}
