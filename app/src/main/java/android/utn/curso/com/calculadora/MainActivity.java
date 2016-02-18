package android.utn.curso.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt_pantalla;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
            btn_7, btn_8, btn_9, btn_0, btn_suma, btn_igual,
            btn_resta, btn_division, btn_multiplicacion, btn_c, btn_ce;
    //dice si fue seleccionada alguna operacion antes de tocar otro numero
    boolean operacion = false;
    //suma , resta, etc, identifica la operacion
    String operacion_eleccion;
    //1er num, 2do num elegido y resultado
    int primero, segundo, resultado;
    //intermediario string para parsear a int
    String stprimeros, stprimeror, stprimerom, stprimerod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_suma = (Button) findViewById(R.id.btn_suma);
        btn_resta = (Button) findViewById(R.id.btn_resta);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_multiplicacion = (Button) findViewById(R.id.btn_multiplicacion);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_ce = (Button) findViewById(R.id.btn_ce);
        btn_igual = (Button) findViewById(R.id.btn_igual);


        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_suma.setOnClickListener(this);
        btn_resta.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_multiplicacion.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_ce.setOnClickListener(this);
        btn_igual.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_0:
                txt_pantalla.setText("0");

                //si es el segundo numero de la operacion
                if (operacion == true) {
                    segundo = 0;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 0;
                }


            case R.id.btn_1:

                txt_pantalla.setText("1");
                if (operacion == true) {
                    segundo = 1;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 1;
                }


            case R.id.btn_2:
                txt_pantalla.setText("2");
                if (operacion == true) {
                    segundo = 2;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 2;
                }


            case R.id.btn_3:

                txt_pantalla.setText("3");
                if (operacion == true) {
                    segundo = 3;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 3;
                }


            case R.id.btn_4:

                txt_pantalla.setText("4");
                if (operacion == true) {
                    segundo = 4;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 4;
                }


            case R.id.btn_5:

                txt_pantalla.setText("5");
                if (operacion == true) {
                    segundo = 5;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 5;
                }


            case R.id.btn_6:

                txt_pantalla.setText("6");
                if (operacion == true) {
                    segundo = 6;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 6;
                }


            case R.id.btn_7:
                txt_pantalla.setText("7");
                if (operacion == true) {
                    segundo = 7;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 7;
                }


            case R.id.btn_8:

                txt_pantalla.setText("8");
                if (operacion == true) {
                    segundo = 8;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 8;
                }


            case R.id.btn_9:

                txt_pantalla.setText("9");

                if (operacion == true) {
                    segundo = 9;
                    switch (operacion_eleccion) {
                        case "suma":
                            resultado = primero + segundo;

                            break;
                        case "resta":
                            resultado = primero - segundo;
                            break;
                        case "division":
                            resultado = primero / segundo;
                            break;
                        case "multiplicacion":
                            resultado = primero * segundo;
                            break;
                    }
                    txt_pantalla.setText(resultado);
                } else {
                    primero = 9;
                }


            case R.id.btn_c:
                primero = 0;
                segundo = 0;
                resultado = 0;
                operacion = false;
                break;
            case R.id.btn_ce:
                primero = 0;
                segundo = 0;
                resultado = 0;
                operacion = false;
                break;
            case R.id.btn_suma:
                stprimeros = txt_pantalla.getText().toString();
                primero = Integer.parseInt(stprimeros);
                operacion = true;
                break;
            case R.id.btn_resta:
                stprimeror = txt_pantalla.getText().toString();
                primero = Integer.parseInt(stprimeror);
                operacion = true;
                break;
            case R.id.btn_multiplicacion:
                stprimerom = txt_pantalla.getText().toString();
                primero = Integer.parseInt(stprimerom);
                operacion = true;
                break;
            case R.id.btn_division:
                stprimerod = txt_pantalla.getText().toString();
                primero = Integer.parseInt(stprimerod);
                operacion = true;
                break;
            case R.id.btn_igual:
                txt_pantalla.setText(resultado);
                primero = 0;
                segundo = 0;
                stprimerod = "";
                stprimeros = "";
                stprimeror = "";
                stprimerom = "";
                operacion = false;

                break;
        }

    }
}
