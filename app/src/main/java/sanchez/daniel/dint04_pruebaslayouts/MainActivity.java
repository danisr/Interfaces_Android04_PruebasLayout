package sanchez.daniel.dint04_pruebaslayouts;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    boolean buttonState;
    public ImageView image1, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.imagenes);
        //EjemploToggle();
        EjemploImageView();
        //EjemploTextView();
        //EjemploEditText();
        //EjemploRadioButton();

        /*
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "hola", Toast.LENGTH_LONG);
           }
        });
        */
    }
    /*
    public void BotonPulsado(View v) {
        Toast.makeText(MainActivity.this, "hola2", Toast.LENGTH_LONG);
    }
    */

    public void EjemploToggle() {
        setContentView(R.layout.togglebtn);

        ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
        ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        Button toggleButton3 = (Button) findViewById(R.id.toggleButton3);

        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this, "Toggle 1 activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Toggle 1 desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Toggle 1 pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = ((ToggleButton) v).isChecked();
                if(isChecked) {
                    Toast.makeText(MainActivity.this, "Toggle 2 activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Toggle 2 desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toggleButton3.setText("Apagado 3");
        buttonState = false;
        toggleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonState = !buttonState;
                if(buttonState) {
                    ((Button) v).setText("Encendido 3");
                    Toast.makeText(MainActivity.this, "Toggle 3 activado", Toast.LENGTH_SHORT).show();
                } else {
                    ((Button) v).setText("Encendido 3");
                    Toast.makeText(MainActivity.this, "Toggle 3 desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void EjemploImageView() {
        setContentView(R.layout.imagenes);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);


        image1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        image3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        image4.setBackgroundColor(Color.GREEN);

        image2.setScaleX(1.5f);
        image2.setScaleY(1.5f);


        initImages();

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initImages();
                image1.setImageDrawable(getResources().getDrawable(R.drawable.twitter));
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initImages();
                image2.setImageDrawable(getResources().getDrawable(R.drawable.seta));
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initImages();
                image3.setImageDrawable(getResources().getDrawable(R.drawable.youtube));
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initImages();
                image4.setImageDrawable(getResources().getDrawable(R.drawable.twitter));
            }
        });
    }

    public void EjemploTextView() {
        setContentView(R.layout.textview);
        TextView textView2 = (TextView) findViewById(R.id.TextView2);
        textView2.setText(Html.fromHtml("<h2><strong>titulo</strong></h2>"));
        TextView textView3 = (TextView) findViewById(R.id.TextView3);
        textView3.setText("titulo");
        //textView3.setTypeface(Typeface.DEFAULT_BOLD);
        textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"));
    }

    public void EjemploEditText() {
        setContentView(R.layout.edittext);

        final EditText edEmail = (EditText) findViewById(R.id.txtEmail);
        final EditText edPassword = (EditText) findViewById(R.id.txtPassword);
        Button bt_send = (Button) findViewById(R.id.btn_send);

        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();

                if(email.equals("dani@utad.com") && password.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login OK", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void EjemploRadioButton() {
        setContentView(R.layout.radiobutton);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.check((R.id.radioButton1)); //Para que aparezca uno marcado por defecto

        int selected = radioGroup.getCheckedRadioButtonId();
        switch (selected) {
            case R.id.radioButton1:
                break;
            case R.id.radioButton2:
                break;
            case R.id.radioButton3:
                break;
        }
    }

    //Método que se usa con EjemploImageView()
    public void initImages() {
        image1.setImageDrawable(getResources().getDrawable(R.drawable.face));
        image2.setImageDrawable(getResources().getDrawable(R.drawable.face));
        image3.setImageDrawable(getResources().getDrawable(R.drawable.face));
        image4.setImageDrawable(getResources().getDrawable(R.drawable.face));
    }
}