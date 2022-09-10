package com.example.huynhduakithu;

import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtDiem;
    CheckBox cbOne, cbTwo, cbThree;
    SeekBar sbOne, sbTwo, sbThree;
    ImageButton ibtnPlay;
    int soDiem = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        sbOne.setEnabled(false);
        sbTwo.setEnabled(false);
        sbThree.setEnabled(false);

        txtDiem.setText(soDiem + "");

        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                int number = 5;
                Random random = new Random();
                int One = random.nextInt(number);
                int Two = random.nextInt(number);
                int Three = random.nextInt(number);

                if (sbOne.getProgress() >= sbOne.getMax()) {
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "ONE WIN", Toast.LENGTH_SHORT).show();
                    if (cbOne.isChecked()) {
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    } else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableCheckBox();
                }

                if (sbTwo.getProgress() >= sbTwo.getMax()) {
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "TWO WIN", Toast.LENGTH_SHORT).show();
                    if (cbTwo.isChecked()) {
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    } else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableCheckBox();
                }

                if (sbThree.getProgress() >= sbThree.getMax()) {
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "THREE WIN", Toast.LENGTH_SHORT).show();
                    if (cbThree.isChecked()) {
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    } else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableCheckBox();
                }

                sbOne.setProgress(sbOne.getProgress() + One);
                sbTwo.setProgress(sbTwo.getProgress() + Two);
                sbThree.setProgress(sbThree.getProgress() + Three );
            }

            @Override
            public void onFinish() {

            }
        };

        ibtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbOne.isChecked() || cbTwo.isChecked() || cbThree.isChecked()) {
                    sbOne.setProgress(0);
                    sbTwo.setProgress(0);
                    sbThree.setProgress(0);
                    ibtnPlay.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    DisableCheckBox();
                }
                else {
                    Toast.makeText(MainActivity.this, "Vui lòng đặt cược trước khi chơi!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    cbTwo.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });

        cbTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    cbOne.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });

        cbThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    cbOne.setChecked(false);
                    cbTwo.setChecked(false);
                }
            }
        });
    }

    private void EnableCheckBox() {
        cbOne.setEnabled(true);
        cbTwo.setEnabled(true);
        cbThree.setEnabled(true);
    }

    private void DisableCheckBox() {
        cbOne.setEnabled(false);
        cbTwo.setEnabled(false);
        cbThree.setEnabled(false);
    }

    private void AnhXa() {
        txtDiem     = (TextView) findViewById(R.id.textviewDiemso);
        ibtnPlay    = (ImageButton) findViewById(R.id.buttonplay);
        cbOne       = (CheckBox) findViewById(R.id.chechBoxOne);
        cbTwo       = (CheckBox) findViewById(R.id.chechBoxTwo);
        cbThree     = (CheckBox) findViewById(R.id.chechBoxThree);
        sbOne       = (SeekBar) findViewById(R.id.seekBarOne);
        sbTwo       = (SeekBar) findViewById(R.id.seekBarTwo);
        sbThree     = (SeekBar) findViewById(R.id.seekBarThree);
    }
}