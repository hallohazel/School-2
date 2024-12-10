package School 2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws InterruptedException{
        
        // Cover
        System.out.println("Pendataan Anggota Sekolah\n");

        // Student/ teacher Input
        Scanner in = new Scanner(System.in);
        System.out.println("Verifikasi:\n1. Murid\n2. Guru");
        int choiceST = in.nextInt();
        System.out.println();

        // Fulltime or Parttime (Teacher)
        int choiceFP = 0;
        if (choiceST == 2) {
            System.out.println("Apakah Anda bekerja secara penuh waktu atau paruh waktu?\n1. Penuh waktu\n2. Paruh waktu");
            choiceFP = in.nextInt();
            System.out.println();
        }

        // Nama dan Umur
        in.nextLine();
        System.out.println("Masukkan nama anda: ");
        String name = in.nextLine();
        System.out.println();

        System.out.println("Masukkan umur anda: ");
        int age = in.nextInt();
        System.out.println();

        // Switch case
        switch(choiceST) {
            case 1 -> {

                System.out.println("Masukkan nomor absen anda: ");
                int num = in.nextInt();
                System.out.println();

                System.out.println("Masukkan nilai anda: ");
                int score = in.nextInt();
                System.out.println();

                System.out.println("Masukkan jurusan anda: ");
                String major = in.next();
                System.out.println();

                System.out.println("Data anda sedang diproses...");
                Thread.sleep(5000);
                System.out.println();

                System.out.println("Data Murid");
                Student s = new Student(name, age, num, score, major);
                s.print();
                
            }

            case 2 -> {

                in.nextLine();
                System.out.println("Masukkan mata pelajaran anda: ");
                String subject = in.nextLine();
                System.out.println();

                switch (choiceFP) {
                    case 1 -> {

                        System.out.println("Masukkan gaji anda: ");
                        int salary = in.nextInt();
                        System.out.println();

                        in.nextLine();
                        System.out.println("Masukkan unit kerja anda: ");
                        String unit = in.nextLine();
                        System.out.println();

                        System.out.println("Data anda sedang diproses.");
                        Thread.sleep(5000);
                        System.out.println();

                        System.out.println("Data Guru Penuh Waktu");
                        FullTime f = new FullTime(name, age, subject, salary, unit);
                        f.print();

                    }
                    case 2 -> {

                        System.out.println("Masukkan jam kerja anda: ");
                        int hours = in.nextInt();
                        System.out.println();

                        System.out.println("Data anda sedang diproses...");
                        Thread.sleep(5000);
                        System.out.println();

                        System.out.println("Data Guru Paruh Waktu");
                        PartTime p = new PartTime(name, age, subject, hours);
                        p.print();

                    }
                }
            }
        }
    }
}
