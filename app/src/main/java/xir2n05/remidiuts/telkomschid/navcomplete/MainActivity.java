package xir2n05.remidiuts.telkomschid.navcomplete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1 = (ImageButton) findViewById(R.id.imageViewFoto1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.imageViewFoto2);
        ImageButton btn3 = (ImageButton) findViewById(R.id.imageViewFoto3);
        ImageButton btn4 = (ImageButton) findViewById(R.id.imageViewFoto4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNav1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNav2();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNav3();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNav4();
            }
        });
    }

    private void goNav1() {
        Intent intent = new Intent(this, Nav1Activity.class);
        startActivity(intent);
    }

    private void goNav2() {
        Intent intent = new Intent(this, Nav2Activity.class);
        startActivity(intent);
    }

    private void goNav3() {
        Intent intent = new Intent(this, Nav3Activity.class);
        startActivity(intent);
    }

    private void goNav4() {
        Intent intent = new Intent(this, Nav4Activity.class);
        startActivity(intent);
    }

}
