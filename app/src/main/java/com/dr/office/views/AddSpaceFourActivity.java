package com.dr.office.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dr.office.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddSpaceFourActivity extends AppCompatActivity {

    @BindView(R.id.imgBack)
    ImageView imgBack;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_space_four);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.imgBack, R.id.btn_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imgBack:
                break;
            case R.id.btn_submit:
                Intent intent = new Intent(AddSpaceFourActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
        }
    }
}