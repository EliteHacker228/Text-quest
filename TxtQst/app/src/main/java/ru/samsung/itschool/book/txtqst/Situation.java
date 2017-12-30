package ru.samsung.itschool.book.txtqst;

/**
 * Created by Максим on 30.12.2017.
 */

public class Situation {
    Situation[] direction;
    String subject,text;
    int dK,dA,dR;
    public Situation (String subject, String text, int variants, int dk,int da,int dr) {
        this.subject=subject;
        this.text=text;
        dK=dk;
        dA=da;
        dR=dr;
        direction=new Situation[variants];
    }
}