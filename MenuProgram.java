import java.util.Scanner;
public class MenuProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String operator;
        int pilihan, N, jumlahAngka = 0, Angka;
        float Hasil, AP, AK;
        
        do {
        System.out.println("Menu Pilihan : ");
        System.out.println("1. Program Operator");
        System.out.println("2. Program Kondisi If (Ganjil/Genap)");
        System.out.println("3. Program Kondisi For (Menampilkan Bilangan 1 hingga N)");
        System.out.println("4. Program Kondisi While (Input hingga Angka Negatif)");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Pilihan Anda       : ");
        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Angka Pertama      : ");
                AP = input.nextFloat();
                System.out.print("Masukkan Angka Kedua        : ");
                AK = input.nextFloat();
                input.nextLine();
                System.out.print("Masukkan Operator (+,-,x,/) : ");
                operator = input.nextLine();

                if (operator.equals("+")) 
                {
                    Hasil = AP + AK;
                    System.out.print("Hasil                       : " + Hasil);
                } else if (operator.equals("-"))
                {
                    Hasil = AP - AK;
                    System.out.print("Hasil                       : " + Hasil);
                } else if (operator.equals("*"))
                {
                    Hasil = AP * AK;
                    System.out.print("Hasil                       : " + Hasil);
                } else if (operator.equals("/")) 
                {
                  {    if (AK == 0) 
                    {
                        System.out.println("\nAngka Kedua Tidak Boleh 0. Coba Lagi");
                    } else 
                    {
                       Hasil = (float) AP / AK; 
                       System.out.print("Hasil                       : " + Hasil);
                    }
                  }
                } else 
                {
                    System.out.println("Pilihan Tidak Valid. Coba Lagi");
                }
                break;
            case 2:
                System.out.print("Masukkan Sebuah Angka       : ");
                Angka = input.nextInt();
                input.nextLine();
                
                if (Angka % 2 == 0) 
                {
                    System.out.print("Angka " + Angka + " Adalah Genap");
                } else
                {
                    System.out.print("Angka " + Angka + " Adalah Ganjil");
                }
                break;
            case 3:
                System.out.print("Masukkan Nilai N            : ");
                N = input.nextInt();
                input.nextLine();

                for (int i = 1; i <= N; i++) 
                {
                    System.out.print(i + " ");
                }

                break;
            case 4:
                jumlahAngka = 0;
                System.out.println("Masukkan angka (program berhenti jika angka negatif dimasukkan):");

                while (true) {
                    Angka = input.nextInt();
                    input.nextLine();
    
                if (Angka < 0) {
                    break;
                }
    
                jumlahAngka++;
            }           
                System.out.println("Jumlah angka yang dimasukkan : " + jumlahAngka);
                break;
            case 5:
                System.out.println("Keluar Dari Program.");
                break;
            default:
                System.out.println("\nPilihan Tidak Valid. Coba Lagi");
            }
            if (pilihan != 5){
                System.out.println("\nTekan enter untuk kembali Ke Menu");
                input.nextLine();
            }
        } while (pilihan != 5);
    }
}