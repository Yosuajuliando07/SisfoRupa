package com.praktikum.sisforupa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Simulasi_nilai extends AppCompatActivity {
    private EditText _ETKehadiran; //ET = EditText dan TV = TextView untuk memudahkan saja
    private EditText _ETTugas;
    private EditText _ETUTS;
    private EditText _ETUAS;

    private TextView _TVNilaiAkhir;
    private  TextView _TVGradeAkhir;

    private  int _nilaiKehadiran;
    private  int _nilaiTugas;
    private  int _nilaiUTS;
    private  int _nilaiUAS;

    private  double _nilaiAkhir;
    private String _grade; //grade = range atau kelas ketentuan


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi_nilai);

        _ETKehadiran = (EditText)findViewById(R.id.ETKehadiran);
        _ETTugas = (EditText)findViewById(R.id.ETTugas);
        _ETUTS = (EditText)findViewById(R.id.ETUTS);
        _ETUAS = (EditText)findViewById(R.id.ETUAS);

        _TVNilaiAkhir = (TextView) findViewById(R.id.TVNilaiAkhir);
        _TVGradeAkhir = (TextView) findViewById(R.id.TVGradeAkhir);
    }
    //menvalidasi bahwa form harus diisi
    private  boolean validasiInput(){
        String munculpesan = "";
        if (_ETKehadiran.getText().toString().equals("")){
            munculpesan += "Nilai Kehadiran Harus Diisi min 0 !\n";
        }
        if (_ETTugas.getText().toString().equals("")){
            munculpesan += "Nilai Tugas Harus Diisi min 0 !\n";
        }
        if (_ETUTS.getText().toString().equals("")){
            munculpesan += "Nilai UTS Harus Diisi min 0!\n";

        }
        if (_ETUAS.getText().toString().equals("")){
            munculpesan += "Nilai UAS Harus Diisi min 0!\n";
        }
        if (!munculpesan.equals("")){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(munculpesan)
                    .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.dismiss();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
            return false;
        }else {
            return true;
        }
    }

    public  void  HitungonClick(View view){
        if (validasiInput()){
            _nilaiKehadiran = Integer.parseInt(_ETKehadiran.getText().toString());
            _nilaiTugas = Integer.parseInt(_ETTugas.getText().toString());
            _nilaiUTS = Integer.parseInt(_ETUTS.getText().toString());
            _nilaiUAS = Integer.parseInt(_ETUAS.getText().toString());

            _nilaiAkhir = HitungNilaiAkhir();
            _grade = gradeAkhir();

            _TVNilaiAkhir.setText(String.valueOf(_nilaiAkhir)); //MEMUNCULKAN DLM BENTUK ANGKA
            _TVGradeAkhir.setText(_grade);

        }
    }
    private  double HitungNilaiAkhir() { //function
        double kehadiran = (double)0.1* _nilaiKehadiran; //10%
        double tugas = (double)0.2 * _nilaiTugas; //20%
        double uts = (double)0.3 * _nilaiUTS; //30%
        double uas = (double)0.4 * _nilaiUAS; //40%
        return kehadiran + tugas + uts + uas; //mengembalikan nilai dgn "return"
    }
    private  String gradeAkhir(){ //function
        String grade;
        if (_nilaiAkhir >= 80){
            grade = "A";
        }else if(_nilaiAkhir <= 79 && _nilaiAkhir >= 75) {
            grade = "B+";
        }else  if(_nilaiAkhir <= 74 && _nilaiAkhir >= 69 ){
            grade = "B";
        }else  if (_nilaiAkhir <= 68 && _nilaiAkhir >= 60){
            grade = "C+";
        }else  if (_nilaiAkhir <= 59 && _nilaiAkhir >= 55){
            grade = "C";
        }else  if (_nilaiAkhir <= 54 && _nilaiAkhir >= 50){
            grade = "D+";
        }else  if (_nilaiAkhir <= 49 && _nilaiAkhir >= 44){
            grade = "D";
        }else {
            grade = "E";
        }
        return grade;
    }
}
