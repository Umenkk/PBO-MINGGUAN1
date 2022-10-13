

import java.util.Scanner;                                           //ini adalah comment

public class Main {
    public static void main(String[] args) {

        int pilih;                                                  //ini adalah pendeklarasian tipe data dan variabel
        Scanner inputan = new Scanner(System.in);                   //ini adalah pendeklarasian untuk menggunakan inputan dinamis   
        System.out.println("Ini adalah program java");           //di java kita menggunakn SOUT untuk mengprint kata kata
        System.out.println("Masukkan pilihan anda : ");
        System.out.println("1. Perulangan for ");
        System.out.println("2. Perulangan While");
        System.out.println("3. perulangan do-while");
        System.out.println("4. Array 1 dimensi ");
        System.out.println("5. Array multidimensi");
        System.out.println("Masukkan pilihan anda : "); pilih = inputan.nextInt();    //ini adalah inputan user nantinya untuk menentukan pilihan

        if (pilih == 1) {                                                        //ini adalah penggunaan if else
            System.out.println("anda memilih perulangan for");
            for (int a = 1; a <= 10; a++) {                                     //ini adalah perulangan menggunakan for dalam java, sama dengan di c++
                System.out.print(a);
            }
        } else if (pilih == 2) {
            System.out.print("anda memilih perulangan while");
            int a = 0;
            while (a <= 10) {                                                   //ini adalah perulangan menggunakan while
                System.out.println(a);  //ini adalah penggunaan perulangan while yang terdapat kondisi jika 'a' kurang dari atau sama dengan 10 maka sistem akan menjalankan programnya
                a++;
            }
        }else if(pilih==3){
            System.out.println("anda memilih perulangan do-while"); //ini adalah perulangan menggunakan do-while
            int a=15;
            do{
                System.out.println(a);
                a++;
            }while(a<=10);                                      ////sama sepeti sebelumnya sistem akan menjalankan program ketika 'a' kurang dari atau sama dengan 10
            System.out.println(a);
        }else if(pilih==4){
            System.out.println("anda memilih array dimensi 1");                 //ini adalah array 1 dimensi
            int A[]= {1,2,3,4,5};                                                  //program akan printing semua data yang terdapat di dalam array
            for (int i =0; i<5; i++){                                              //karena perulangan diulang sebanyak 5 kali maka semua data akan terprint mulai dari 1-5
                System.out.println(A[i]);                                          //tidak jauh berbeda dari c++
            }
        }else if(pilih==5){
            System.out.println("anda memilih array multidimensi : ");
            int [][]arr = {
                {0, 1, 2}, {2, 3, 4}, {5, 6, 7}
              };                                                         //ini adalah array 2 dimensi
     
     
              System.out.println("Isi variabel arr:");
              for (int[] array: arr) { 
                System.out.print("[");
                for (int n: array) {  
                  System.out.print(n + " ");                                // printing  item
                }
                System.out.print("]");                                      // printing line baru
              }
              System.out.println("]\n");
    }
   }
} 
