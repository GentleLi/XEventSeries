package com.android.tao.xeventseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.tao.xeventseries.view.XStrokeRoundRectButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.xbtn_two)
    XStrokeRoundRectButton mBtnTwo;
    @BindView(R.id.xbtn_one)
    XStrokeRoundRectButton mBtnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }


    @OnClick(R.id.xbtn_one)
    public void onClickXBtnOne(View view){
        Toast.makeText(this, "click top menu", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.xbtn_two)
    public void onClickXBtnTwo(View view){
        Toast.makeText(this, "click bottom menu", Toast.LENGTH_SHORT).show();
    }

}
