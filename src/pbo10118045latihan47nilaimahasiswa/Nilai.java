/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan47nilaimahasiswa;

/**
 *
 * @author Ilham
 */
public class Nilai {
    private final double quiz,uts,uas;
    private double NA;

    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double hitungNilaiAkhir(){
        NA = 0.2*quiz+0.3*uts+0.5*uas;
        return NA;
    }
    
    public char Index(double NA){
        
        if((NA >= 80)&&(NA <= 100))
            return 'A';
        else if((NA >=68)&&(NA < 80))
            return 'B';
        else if((NA >=56)&&(NA < 68))
            return 'C';
        else if((NA >=45)&&(NA < 56))
            return 'D' ;        
        else return 'E';
        
        
             
    }
    
    public String Ket(char index){
        switch (index) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            default:
                return "Sangat Kurang";
    }

    }
    
}
