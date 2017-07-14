package AFD;

/**
 * Created by Miguel Angel on 13/07/2017.
 */
public class inicio {
    int cont;
    boolean aceptar;
    char [] car;

    public static void main(String[]args){
        inicio aut = new inicio();
        String cadena = "f23.0";
        aut.car = cadena.toCharArray();
        aut.comienzo();
        if(aut.aceptar == true){
            System.out.println("Cadena aceptada");
        }else{
            System.out.println("Cadena no aceptada");
        }
    }

    public void comienzo(){
        cont = 0;
        q0();
    }
    public void q0(){
        System.out.println("En q0");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == 'd') {
                cont++;
                q1();
            }
            else if (car[cont] == 'f') {
                cont++;
                q9();
            }
            else if(car[cont] == 'c'){
                cont++;
                q3();
                 }
            else if(car[cont]=='o'){
                cont++;
                q8();
            }
            else if(car[cont]=='h'){
                cont++;
                q2();
            }
         else if(isNum1_9(car[cont])||isAlphaA_Z(car[cont])||isNegative(car[cont])||isPoint(car[cont])){
                    cont++;
                    q_Error();

            }
        }
    }
    public void q1(){
        System.out.println("En q1");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q17();
            }
            else if (car[cont] == '-') {
                cont++;
                q14();
            }
            else if(isNum1_9(car[cont])){
                cont++;
                q4();
            }
            else if(isAlphaa_z(car[cont])||isAlphaA_Z(car[cont])||isNegative(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();

            }
        }
    }
    public void q2(){
        System.out.println("En q2");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q11();
            }
            else if (isNum1_9(car[cont])||isAlphaA_Z(car[cont])) {
                cont++;
                q13();
            }
            else if(isAlphaa_z(car[cont])||isPoint(car[cont])||isNegative(car[cont])){
                cont++;
                q_Error();

            }
        }
    }
    private boolean isNum1_3(char c){
        return c >= '1' && c <= '3';
    }
    public void q3(){
        System.out.println("En q3");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q11();
            }
            else if (isNum1_3(car[cont])) {
                cont++;
                q5();
            }
            else if(isAlphaa_z(car[cont])||isAlphaA_Z(car[cont])||isPoint(car[cont])||isNegative(car[cont])){
                cont++;
                q_Error();

            }
        }
    }
    public void q4(){
        System.out.println("En q4");
        aceptar = true;
        if(cont<car.length) {
            if (car[cont]=='0'||isNum1_9(car[cont])) {
                cont++;
                q4();
            }
            else if(car.toString()=="[a-zA-Z]|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    public void q5(){
        System.out.println("En q5");
        aceptar = true;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q5();
            }
            else if(car.toString()=="[a-zA-Z]|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    public void q6(){
        System.out.println("En q6");
        aceptar = true;
        if(cont<car.length) {
             if(car.toString()=="[a-zA-Z0-9]|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    public void q7(){
        System.out.println("En q7");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '.') {
                cont++;
                q10();
            }
            if (isNum1_9(car[cont])||car[cont]=='0') {
                cont++;
                q17();
            }
            else if(isNegative(car[cont])||isAlphaa_z(car[cont])||isAlphaA_Z(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    private boolean isNum1_7(char c){
        return c >= '1' && c <= '9';
    }
    public void q8(){
        System.out.println("En q8");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q11();
            }
            else if (isNum1_7(car[cont])) {
                cont++;
                q12();
            }
            else if(isAlphaa_z(car[cont])||isAlphaA_Z(car[cont])||isNegative(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q9(){
        System.out.println("En q9");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q26();
            }
            else if (car[cont] == '-') {
                cont++;
                q18();
            }
            else if (isNum1_9(car[cont])) {
                cont++;
                q7();
            }
            else if(isAlphaa_z(car[cont])||isAlphaa_z(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q10(){
        System.out.println("En q10");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q6();
            }
            else if (isNum1_9(car[cont])) {
                cont++;
                q16();
            }
            else if (isNum1_9(car[cont])||car[cont]=='0') {
                cont++;
                q10();
            }
            else if(isNegative(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q11(){
        System.out.println("En q11");
        aceptar = true;
        if(cont<car.length) {

            if(isAlphaa_z(car[cont])||isAlphaA_Z(car[cont])||isNegative(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q12(){
        System.out.println("En q12");
        aceptar = true;
        if(cont<car.length) {
            if (car.toString()=="[0-7]") {
                cont++;
                q12();
            }
            else if(car.toString()=="[a-zA-Z]|.|-|[8-9]"){
                cont++;
                q_Error();
            }
        }
    }
    private boolean isAlphaA_F(char c){
        return c >= 'A' && c <= 'F';
    }
    public void q13(){
        System.out.println("En q13");
        aceptar = true;
        if(cont<car.length) {
            if (isAlphaA_F(car[cont])||isNum1_9(car[cont])||car[cont] == '0') {
                cont++;
                q13();
            }
            else if(isAlphaa_z(car[cont])||isNegative(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q14(){
        System.out.println("En q14");
        aceptar = false;
        if(cont<car.length) {
            if (car.toString()=="[1-9]") {
                cont++;
                q4();
            }
            if (car.toString()=="0|-") {
                cont++;
                q13();
            }
            else if(car.toString()=="[a-zA-Z]|0|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    public void q16(){
        System.out.println("En q16");
        aceptar = true;
        if(cont<car.length) {
        if(car.toString()=="[a-zA-Z]|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    public void q17(){
        System.out.println("En q17");
        aceptar = true;
        if(cont<car.length) {
            if(isAlphaa_z(car[cont])||car.toString()=="[a-zA-Z0-9]|.|-"){
                cont++;
                q_Error();
            }
        }
    }
    private boolean isNum1_9(char c){
        return c >= '1' && c <= '9';
    }
    private boolean isAlphaA_Z(char c){
        return c >= 'A' && c <= 'Z';
    }
    private boolean isAlphaa_z(char c){
        return  c >= 'a' && c <= 'z';
    }
    private boolean isNegative(char c){
        return c == '-';
    }
    private boolean isPoint(char c){
        return c == '.';
    }
    public void q18(){
        System.out.println("En q18");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '0') {
                cont++;
                q20();
            }
            if (isNum1_9(car[cont])||isAlphaA_Z(car[cont])) {
                cont++;
                q7();
            }
            else if(isNum1_9(car[cont])||isAlphaa_z(car[cont])||isPoint(car[cont])){
                cont++;
                q_Error();
            }
        }
    }
    public void q20(){
        System.out.println("En q20");
        aceptar = false;
        if(cont<car.length) {
            if (car[cont] == '.') {
                cont++;
                q10();
            }
            else if(isNum1_9(car[cont])||isAlphaa_z(car[cont])||isPoint(car[cont])|isNegative(car[cont])){
                cont++;
                q_Error();
            }
        }

    }

    public void q26(){
        System.out.println("En q20");
        aceptar = true;
        if(cont<car.length) {
            if (car[cont] == '.') {
                cont++;
                q10();
            }
            else if(isNum1_9(car[cont])||isAlphaa_z(car[cont])||isPoint(car[cont])|isNegative(car[cont])||isAlphaA_Z(car[cont])){
                cont++;
                q_Error();
            }
        }

    }


    public void q_Error(){
        System.out.println("Error");
        aceptar = false;
        return;
    }

}

