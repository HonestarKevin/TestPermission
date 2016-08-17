package com.honestar.qrpermission;

import com.zxing.activity.CaptureActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button HomePageLoginButton = null;
	private Button HomePageUselogButton = null;
	private ImageView HomePageQRImageView = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		HomePageLoginButton = (Button)findViewById(R.id.home_page_button_login);
		HomePageUselogButton = (Button)findViewById(R.id.home_page_button_use_log);
		HomePageQRImageView = (ImageView)findViewById(R.id.home_page_qr_image_view);
		
		InitView();
		
		RegisterListener();
	}

	private void RegisterListener() {
		HomePageLoginButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				//打开扫描界面扫描条形码或二维码
				Intent openCameraIntent = new Intent(MainActivity.this,CaptureActivity.class);
				startActivityForResult(openCameraIntent, 0);	
			}
		});
		HomePageUselogButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				//打开扫描界面扫描条形码或二维码
				Intent openCameraIntent = new Intent(MainActivity.this,CaptureActivity.class);
				startActivityForResult(openCameraIntent, 0);	
			}
		});
	}
	private void InitView() {
		//create bitmap for equipment  code 
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		//处理扫描结果（在界面上显示）
		if (resultCode == RESULT_OK) {
			Bundle bundle = data.getExtras();
			String scanResult = bundle.getString("result");
			//resultTextView.setText(scanResult);
			Toast.makeText(getApplicationContext(), scanResult, Toast.LENGTH_LONG).show();
		}
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}
	
}
