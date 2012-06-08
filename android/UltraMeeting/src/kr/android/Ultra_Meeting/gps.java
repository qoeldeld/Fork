/*
package kr.android.Ultra_Meeting;

import java.io.*;
import java.lang.*;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class gps extends MapActivity implements OnClickListener {

	MapView mapView;
		Drawable drawable;// 마커로 그림 그릴때 불러오기 위한 클래스
			List<UMOverlay> list; // 마커 위에 마커가 올라갈 수도 있게 때문에 list 타입으로 선언
				// 맵에 컬렉션 타입으로 구성
					UMOverlay overlay;
						

							@Override
								protected void onCreate(Bundle savedInstanceState) {
										// TODO Auto-generated method stub
												super.onCreate(savedInstanceState);
														setContentView(R.layout.m1_1);
																
																		ImageButton btn1 = (ImageButton) findViewById(R.id.bt1);
																				btn1.setOnClickListener(this);
																						ImageButton btn2 = (ImageButton) findViewById(R.id.bt2);
																								btn2.setOnClickListener(this);
																										ImageButton btn3 = (ImageButton) findViewById(R.id.bt3);
																												btn3.setOnClickListener(this);
																														ImageButton btn4 = (ImageButton) findViewById(R.id.bt4);
																																btn4.setOnClickListener(this);
																																		ImageButton btn5 = (ImageButton) findViewById(R.id.bt5);
																																				btn5.setOnClickListener(this);
																																						// btn5.setAlpha(180);
																																								ImageButton btn6 = (ImageButton) findViewById(R.id.bt6);
																																										btn6.setOnClickListener(this);

																																												mapView = (MapView) findViewById(R.id.mapview);
																																														// Zoom이 되야 겠지 우선
																																																mapView.setBuiltInZoomControls(true);
																																																		// 위성 지도로 만들고 싶다면 true
																																																				mapView.setSatellite(false);

																																																						LocationManager loc = (LocationManager)getSystemService(Context.LOCATION_SERVICE);		
																																																								Location location = loc.getLastKnownLocation(LocationManager.GPS_PROVIDER);


																																																										// 위도하고 경도값을 지정함
																																																												
																																																														double lat = location.getLatitude();
																																																																double lng = location.getLongitude();
																																																																		if(lat<100)
																																																																				{
																																																																							lat*=1000000; 
																																																																									}else if(lat>100)
																																																																											{
																																																																														lat*=100000;
																																																																																}
																																																																																		if(lng<100)
																																																																																				{
																																																																																							lng*=1000000; 
																																																																																									}else if(lng>100)
																																																																																											{
																																																																																														lng*=100000;
																																																																																																}
																																																																																																		GeoPoint p = new GeoPoint((int)lat,(int)lng);
																																																																																																				// 실제좌표값을 맵뷰에 출력, 좌표값이 바뀌면 바뀐 위치를 화면에 출력
																																																																																																						MapController mc = mapView.getController();
																																																																																																								mc.animateTo(p); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																																																																																										mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시

																																																																																																												// 현재 맵에 등록된 레이어 목록을 추출해서 리스트로 참조한다.
																																																																																																														list = mapView.getOverlays();
																																																																																																																// 맵에 중심에 꽂아줄 이미지 생성
																																																																																																																		drawable = this.getResources().getDrawable(R.drawable.androidmarker);
																																																																																																																				// 생성한 이미지를 HelloOverlay에 넣고 객체값을 받는다.
																																																																																																																						overlay = new UMOverlay(drawable);
																																																																																																																								// OverlayItem 클래스에 지도의 위.경도 값을 받은 객체 하나를 생성한다.
																																																																																																																										OverlayItem overlayItem = new OverlayItem(p, "", "");
																																																																																																																												// 이를 받아서 helloOverlay에 추가한다. 넣게되면 list에 추가하게 되고 다추가하고 난 뒤에 populate해서
																																																																																																																														// 그려준다.
																																																																																																																																overlay.addOverlay(overlayItem);
																																																																																																																																		// 리스트에 추가한다. googleMap.java에 추가.
																																																																																																																																				list.add(overlay);

																																																																																																																																					}

																																																																																																																																						@Override
																																																																																																																																							protected boolean isRouteDisplayed() {
																																																																																																																																									// TODO Auto-generated method stub
																																																																																																																																											return false;
																																																																																																																																												}
																																																																																																																																													
																																																																																																																																														public void onClick(View v) {
																																																																																																																																																switch (v.getId()) {

																																																																																																																																																		case R.id.bt1:
																																																																																																																																																					Intent i1 = new Intent(gps.this, menu.class);
																																																																																																																																																								startActivity(i1);
																																																																																																																																																											break;
																																																																																																																																																													case R.id.bt2:
																																																																																																																																																																Intent i2 = new Intent(gps.this, gps.class);
																																																																																																																																																																			startActivity(i2);
																																																																																																																																																																						break;

																																																																																																																																																																								case R.id.bt3:
																																																																																																																																																																											Intent i3 = new Intent(gps.this, gps.class);
																																																																																																																																																																														startActivity(i3);
																																																																																																																																																																																	break;

																																																																																																																																																																																			case R.id.bt4:
																																																																																																																																																																																						Intent i4 = new Intent(gps.this, menu.class);
																																																																																																																																																																																									startActivity(i4);
																																																																																																																																																																																												break;

																																																																																																																																																																																														case R.id.bt5:
																																																																																																																																																																																																	Intent i5 = new Intent(gps.this, menu.class);
																																																																																																																																																																																																				startActivity(i5);
																																																																																																																																																																																																							break;

																																																																																																																																																																																																									case R.id.bt6:
																																																																																																																																																																																																												Intent i6 = new Intent(gps.this, menu.class);
																																																																																																																																																																																																															startActivity(i6);
																																																																																																																																																																																																																		break;
																																																																																																																																																																																																																					
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																								}

																																																																																																																																																																																																																								}
																																																																																																																																																																																																																								*/
