package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText packageNumberEditText;
    private Button checkButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        packageNumberEditText = findViewById(R.id.packageNumberEditText);
        checkButton = findViewById(R.id.checkButton);
        resultTextView = findViewById(R.id.resultTextView);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在這裡處理查詢邏輯
                String packageNumber = packageNumberEditText.getText().toString();
                // 假設你有一個方法來查詢包裹狀態，並返回結果
                String queryResult = queryPackageStatus(packageNumber);
                resultTextView.setText(queryResult);
            }
        });
    }

    // 假設的包裹查詢邏輯
    private String queryPackageStatus(String packageNumber) {
        // 在這裡執行包裹查詢的邏輯，並返回結果字串
        // 這只是一個範例，實際上你需要根據你的需求實現這個方法
        return "Package with number " + packageNumber + " is on its way.";
    }
}
