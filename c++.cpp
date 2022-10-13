#include<iostream>
using namespace std;                             //ini adalah comment dalam

int main(){
	int pilih; 										//ini adalah deklarasi tipe data dan variabela
	cout<<"======= Program C++ ======="<<endl;
	cout<<endl;
	cout<<"1. Perulangan for "<<endl;
	cout<<"2. Perulangan while "<<endl;
	cout<<"3. Perulangan Do-while "<<endl;
	cout<<"4. Array 1 dimensi "<<endl;
	cout<<"5. Array multidimensi"<<endl;
	cout<<"Masukkan Pilihan : "; cin>>pilih; 										//inputan user untuk menentukan pilihan
	if(pilih==1){ 																	//penggunaan percabangan menggunakan if-else
		cout<<"anda memilih perulangan for "<<endl;
		for(int a = 1; a<=10; a++){ 					//ini adalah perulangan menggunakan for yang dimana nilai a = 1 yang jika a<=10 maka di incrementkan terus
			cout<<" "<<a;
		}
	}else if(pilih==2){
		cout<<"anda memilih perulangan while "<<endl;
		int a=1;
		while(a<=10){ //ini adalah penggunaan perulangan while yang terdapat kondisi jika 'a' kurang dari atau sama dengan 10 maka sistem akan menjalankan programnya
			cout<<" "<<a;
			a++;
		}
	}else if(pilih==3){
		cout<<"anda memilih perulangan do-while "<<endl;
		int a=11;
		do{                               //ini adalah penggunaan perulangan do-while
			cout<<a<<endl;
			a++;
		}while(a<=10);                    //sama sepeti sebelumnya sistem akan menjalankan program ketika 'a' kurang dari atau sama dengan 10
		cout<<"Nilai terakhir a "<<a;
		
	}else if(pilih==4){
		cout<<"anda memilih array dimensi 1 :  ";
		int A[5]= {1,2,3,4,5}; 								//ini adalah array 1 dimensi
		for (int i =0; i<5; i++){							//program akan printing semua data yang terdapat di dalam array,
			cout << A[i];									//karena perulangan diulang sebanyak 5 kali maka semua data akan terprint mulai dari 1-5
		}											      
	}else if(pilih==5){
		cout<<"anda memilih array multidimensi : "<<endl; 
		int arr[2][2] = {15,23,40,29}; 									//ini adalah array 2 dimensi
 
 
  		cout << "Isi variabel arr : " << endl;							//di dalam array multidimesional terdapat 2 perulangan untuk mengprint array karena 
      for(int i = 0; i < 2; i++){										//arraynya 2 dimensi maka perlu 2 perulangan.
        for(int j = 0; j < 2; j++){		
        cout << " " << arr[i][j] << endl;
    }
}		
	}
}
