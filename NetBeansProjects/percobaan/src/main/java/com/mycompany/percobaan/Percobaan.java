#include <iostream>
#include <conio.h>
using namespace std;
/*
//Muhammad Rofi Ariansyah
//Prak7 #001
//Mendeklarasikan struct dengan type student
struct student {
    //Mendeklarasikan atau membuat variabel dari struct student
    string id;
    string name;
    float gpa;
    string discipline;
} ;//End Structure
int main(){
    //Menginisialisasi array dengan value 2
    const int SIZE = 2;
    //Mendefinisikan struct type student std dengan array SIZE
    student std[SIZE];
    //Membuat perulangan untuk memasukkan value ke dalam array type sdt
    for(int i=0; i<SIZE; i++){
        cout<<"Enter data for student "<<i+1<<endl;
        cout<<"------------------------"<<endl;
        cout<<"Enter ID:\t\t";
        cin>>std[i].id;
        cout<<"Enter Name:\t\t";
        cin>>std[i].name;
        cout<<"Enter GPA:\t\t";
        cin>>std[i].gpa;
        cout<<"Enter Discpline:\t";
        cin>>std[i].discipline;
    }
    //Membuat perulangan dan mengakses member type struct
    //untuk menampilkan hasil dari inputan sebelumnya
    for (int i=0; i<SIZE; i++){
        cout<<"\n";
        cout<<"Student "<<i+1<<endl;
        cout<<"---------"<<endl;
        cout<<"ID:\t\t\t"<<std[i].id<<endl;
        cout<<"Name:\t\t\t"<<std[i].name<<endl;
        cout<<"GPA:\t\t\t"<<std[i].gpa<<endl;
        cout<<"Discipline:\t\t"<<std[i].discipline<<endl;
        }
        return 0;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #002
//Mendeklarasikan struct dengan type Address
struct Address{
    //Mendeklarasikan atau membuat variabel dari struct Address
    char HouseNo[25];
    char City[25];
};
//Mendeklarasikan struct dengan type Employee
struct Employee{
    //Mendeklarasikan atau membuat variabel dari struct Employee
    char name [25];
    //nested struct
    Address Add;
};
int main () {
    //Mendeklarasikan variabel i dan type Employee E
    int i;
    Employee E;
    //Menginputkan value ke dalam type struct Employee dan Address
    cout<<"\nEnter Employee Name: ";
    cin>>E.name;
    cout<<"\nEnter Employee City: ";
    cin>>E.Add.City;
    cout<<"\nEnter Employee House No: ";
    cin>>E.Add.HouseNo;
    //Menampilkan dan mengakses member dari type struct
     cout<<"\nDetail of Employees";
     cout<<"\nEmployee Name: "<<E.name;
     cout<<"\nEmployee City: "<<E.Add.City;
     cout<<"\nEmployee House No: "<<E.Add.HouseNo;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #003
//Mendeklarasikan struct dengan type Employee
struct Employee{
    //Mendeklarasikan atau membuat variabel dari struct Employee
    char ename[20];
    int ssn;
    float salary;
    //Mendeklarasikan struct didalam struct Employee
    struct date{
        //Mendeklarasikan atau membuat variabel dari struct Date
        int date;
        int month;
        int year;
    }doj;
//Menginisialisasi isi dari type Employee
}emp={"Adil",1000,1000.50,{22,6,2016}};
int main (){
    //Menampilkan dan mengakses ke 2 type struct
    cout<<"\nEmployee Name: "<<emp.ename;
    cout<<"\nEmployee SSN: "<<emp.ssn;
    cout<<"\nEmployee Salary: "<<emp.salary;
    cout<<"\nEmployee DOJ: "
    <<emp.doj.date<<"/"
    <<emp.doj.month<<"/"
    <<emp.doj.year;
return 0;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #004
struct Pixel{
    int C,R;
};
void Display(Pixel P){
    cout<<"Col"<<P.C<<"Row"<<P.R<<endl;
}
int main(){
    Pixel X = {40,50},Y,Z;
    Z=X;
    X.C += 10;
    Y=Z;
    Y.C += 10;
    Y.R += 20;
    Z.C -= 15;
    Display(X); Display(Y);  Display(Z);
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #005
//Mendeklarasikan struct dengan type Play
struct Play {
    //Mendeklarasi variabel didalam type struct Play
    int score, bonus;
};
//Mendeklarasikan fungsi dengan nama calculate
void calculate (Play &P, int N=10){
    P.score++;
    P.bonus+=N;
}
int main(){
//Mendeklarasikan type play dan fungsi selanjutnya menginisialisasi isi datanya
    Play PL= {10,15};
    calculate(PL,5);
    //Menampilkan hasil dari inisialisasi type struct dan memanggil fungsi
    cout<<PL.score<<":"<<PL.bonus<<endl;
    calculate(PL);
    cout<<PL.score<<":"<<PL.bonus<<endl;
    calculate(PL,15);
    cout<<PL.score<<":"<<PL.bonus<<endl;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #006
//Mendeklarasikan struct dengan type Pixels
struct Pixels{
    //Mendeklarasi variabel didalam type struct Pixels
    int color,style;
};
//Mendeklarasikan fungsi dengan nama ShowPoint dengan isi type struct
void showPoint (Pixels P){
    cout<<P.color<<":"<<P.style<<endl;
}
int main (){
    //Mendeklarasikan type Pixels dan menginisialisasi isi data
    Pixels Point1 = {5, 3}, Point2;
    //Memanggil fungsi
    showPoint(Point1);
     //Mendeklarasikan type Pixels 2 dan menginisialisasi isi data
     Point2 = Point1;
     Point1.color +=2;
     showPoint(Point2);
     return 0;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #007
int main (){
    //Mendeklarasikan structure menggunakan typedef
    typedef int Number;
    Number num1=40,num2=20;
    Number answer;

    answer = num1 + num2;
    cout<<"Answer: "<<answer;
return 0;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #008
//Mendeklarasikan structure menggunakan typedef
typedef struct b1{ //Tag name is optional
    //Mendeklarasikan variabel dari b1
    char bname[30];
    int ssn;
    int pages;
}book;//book is new type
//Menginisialisasi type book b1
book b1={"C++", 1000,90};
int main (){
    //Menampilkan dan mengakses type struct
    cout<<"Name of Book: "<<b1.bname;
    cout<<"\nSSN of Book: "<<b1.ssn;
    cout<<"\nPages of Book: "<<b1.pages;
return 0;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #009
typedef struct Date{
    int dd;
    int mm;
    int yyyy;
};
typedef struct Time{
    int h;
    int m;
    int s;
};
typedef struct Login{
    int ID;
    Date tglLogin;
    Time wktLogin;
};
int main (){
    Login user1;
    cout<<"User 1\n";
    cout<<"ID: ";
    cin>>user1.ID;
    cout<<"Tanggal Login\n";
    cout<<"Hari : ";
    cin>>user1.tglLogin.dd;
    cout<<"Bulan : ";
    cin>>user1.tglLogin.mm;
    cout<<"Tahun : ";
    cin>>user1.tglLogin.yyyy;
    cout<<"Waktu Login\n";
    cout<<"Jam : ";
    cin>>user1.wktLogin.h;
    cout<<"Menit : ";
    cin>>user1.wktLogin.m;
    cout<<"Detik : ";
    cin>>user1.wktLogin.s;
    cout<<"Terima Kasih\n";
    cout<<"\nData Anda: ";
    cout<<"\nID : "<<user1.ID;
    cout<<"\nDate : "<<user1.tglLogin.dd<<"/"<<user1.tglLogin.mm<<"/"<<user1.tglLogin.yyyy;
    cout<<"\nClock : "<<user1.wktLogin.h<<":"<<user1.wktLogin.m<<":"<<user1.wktLogin.s;
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #010
typedef struct Date{
    int dd;
    int mm;
    int yyyy;
};
typedef struct Time{
    int h;
    int m;
    int s;
};
typedef struct Login{
    int ID;
    Date tglLogin;
    Time waktuLogin;
};
int main()
{
    Login user[3];
    for (int i=0; i<3; i++){
        cout<<"\nUSER ke : "<<i+1;
        cout<<"\nID : ";
        cin>>user[i].ID;
        cout<<"Tanggal Login"<<endl;
        cout<<"Hari : ";
        cin>>user[i].tglLogin.dd;
        cout<<"Bulan : ";
        cin>>user[i].tglLogin.mm;
        cout<<"Tahun : ";
        cin>>user[i].tglLogin.yyyy;
        cout<<"Waktu Login"<<endl;
        cout<<"Jam : ";
        cin>>user[i].waktuLogin.h;
        cout<<"Menit : ";
        cin>>user[i].waktuLogin.m;
        cout<<"Detik : ";
        cin>>user[i].waktuLogin.s;

    }
    bool Loop = true;
    while(Loop){
        int X=0;
        cout<<"\nData ke: ";
        cin>>X;
        if(X < 3){
            cout<<"\nUser ke "<<X+1<<" adalah : "<<user[X].ID;
            cout<<"\nLogin ID : "<<user[X].ID;
            cout<<"\nLogin Date : "<<user[X].tglLogin.dd<<"/"<<user[X].tglLogin.mm<<"/"<<user[X].tglLogin.yyyy;
            cout<<"\nLogin Time : "<<user[X].waktuLogin.h<<":"<<user[X].waktuLogin.m<<":"<<user[X].waktuLogin.s;
            cout<<endl;
            ++X;
        }
        else Loop = false;

    }
}*/
/*
//Muhammad Rofi Ariansyah
//Prak7 #011
struct buku {
	string Kode; string Judul; string Pengarang;
} Koleksi[50];
int JmlKoleksi = 0;
void AddKoleksi() {
	system("CLS");
	cout << "Tambah Koleksi" << endl;
	cout << "Kode buku: ", cin >> Koleksi[JmlKoleksi].Kode;
	cout << "Judul buku: ", cin >> Koleksi[JmlKoleksi].Judul;
	cout << "Pengarang: ", cin >> Koleksi[JmlKoleksi].Pengarang;
	JmlKoleksi++;
}
void DspKoleksi() {
	do {
	system("CLS");
	for(int i = 0; i < JmlKoleksi; ++i) {
		cout << "Koleksi buku ke-"<<i<<":"<< endl;
		cout << "Kode buku: " << Koleksi[i].Kode << endl;
		cout << "Judul buku: " << Koleksi[i].Judul << endl;
		cout << "Pengarang: " << Koleksi[i].Pengarang << endl;
		cout << "===================="<< endl;
	}
	cout << "Kembali (4)";
	} while(getch() != '4');
}


void FndKoleksi() {
	do {
	system("CLS");
	string Kde;
	string a = "Kembali ke menu (4)";
	string b = "Tekan sembarang tombol untuk mencari kembali\n";
	cout << "Cari kode buku: ", cin >> Kde;
	int Fnd = 0;
	while(Kde!=Koleksi[Fnd].Kode&&Fnd<JmlKoleksi) Fnd++;
		if(Kde==Koleksi[Fnd].Kode) {
			cout << "Koleksi buku ke-"<<Fnd<<":"<< endl;
			cout << "Kode buku: " << Koleksi[Fnd].Kode << endl;
			cout << "Judul buku: " << Koleksi[Fnd].Judul << endl;
			cout << "Pengarang: " << Koleksi[Fnd].Pengarang << endl;
			cout << "===================="<< endl<< endl;
			cout << b;
			cout << a;
		} else {
			cout << "Buku tidak ditemukan!\n\n";
			cout << b;
			cout << a;
		}
	} while(getch() != '4');
}


void menu() {
	bool Exit = false;
	do {
		system("CLS");
		cout << "1. Tambah Koleksi" << endl;
		cout << "2. Lihat Koleksi" << endl;
		cout << "3. Cari Koleksi" << endl;
		cout << "0. Keluar" << endl;
		cout << "Tekan 0-3 untuk memilih: ";
		switch(getch()) {
			case '1': AddKoleksi(); break;
			case '2': DspKoleksi(); break; menu();
			case '3': FndKoleksi(); break; menu();
			case '0': Exit=true; break;
			default: cout << "Pilihan tidak tersedia!";
			getch(); break;
		}
	} while(!Exit);
}
int main(int argc, char** argv) {
	menu();
	return 0;
}*/