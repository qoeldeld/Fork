package kr.android.Ultra_Meeting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ultra_Meeting extends Activity{
	TextView textView;
		TextView textView2;

			/** Called when the activity is first created. */
				@Override
					public void onCreate(Bundle savedInstanceState) {
							super.onCreate(savedInstanceState);
									this.requestWindowFeature(Window.FEATURE_NO_TITLE);
											getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
													setContentView(R.layout.main);

															textView = (TextView) findViewById(R.id.EditText01);
																	textView2 = (TextView) findViewById(R.id.EditText02);
																			Button btn3 = (Button) findViewById(R.id.Button03);

																					btn3.setOnClickListener(new OnClickListener() {

																								public void onClick(View v) {
																												// TODO Auto-generated method stub

																																if ((textView.getText().toString()).equals("")){
																																					Toast.makeText(getBaseContext(), "ID를 입력하세요.", 1).show();
																																									}else if((textView2.getText().toString()).equals("")){
																																														Toast.makeText(getBaseContext(), "비밀번호를 입력하세요.", 1).show();
																																																		}
																																																						else {
																																																											Intent intent = new Intent(Ultra_Meeting.this, menu.class);
																																																																Bundle myData = new Bundle();
																																																																					myData.putString("key", textView.getText().toString());
																																																																										intent.putExtras(myData);
																																																																															startActivity(intent);
																																																																																			}
																																																																																						}
																																																																																								});
																																																																																									}
																																																																																									}

