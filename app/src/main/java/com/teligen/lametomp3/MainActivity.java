package com.teligen.lametomp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*yr add*/
    private String pathWav = "/storage/emulated/0/ebm_record/2018-05-03 20:39:44.wav";
    private String pathMp3 = "/storage/emulated/0/ebm_record/txtBroadcast.mp3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*final Mp3Recorder mp3Recorder = new Mp3Recorder();
        final Button mBtnRec = (Button)findViewById(R.id.btn_record);
        mBtnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mp3Recorder.isRecording()){
                    mp3Recorder.startMp3Record();
                    mBtnRec.setText("停止录音");
                }else{
                    mp3Recorder.stopMp3Record();
                    mBtnRec.setText("开始录音");
                }
            }
        });*/

        //LameMp3.lameInit(2000, 2, 2000, 8, 5);

        //LameMp3.initEncoder();

        Button convertMp3 = (Button) findViewById(R.id.btn_convert);
        convertMp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mytest", "onClick: 111");
                LameMp3.lameConvertmp3(pathWav, pathMp3);
            }
        });

    }
}
