package kr.android.Ultra_Meeting;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import java.util.List;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class rs6_w extends MapActivity implements OnClickListener {

	MapView mapView;
		// 맵에 중심에 꽂아줄 이미지 생성 // 마커로 그림 그릴때 불러오기 위한 클래스
			Drawable drawable,db1,db2;
				List<Overlay> list; // 마커 위에 마커가 올라갈 수도 있게 때문에 list 타입으로 선언
					
						// 맵에 컬렉션 타입으로 구성
							// 생성한 이미지를 HelloOverlay에 넣고 객체값을 받는다.
								UMOverlay umoverlay,umo1,umo2;
									

										// 위도하고 경도값을 지정함
											GeoPoint p,p1,p2;
												

													OverlayItem overlayItem01;
														OverlayItem overlayItem02;
															OverlayItem overlayItem03;
																
																	// 실제좌표값을 맵뷰에 출력, 좌표값이 바뀌면 바뀐 위치를 화면에 출력
																		MapController mc;
																			
																				@Override
																					protected void onCreate(Bundle savedInstanceState) {
																							// TODO Auto-generated method stub
																									super.onCreate(savedInstanceState);
																											setContentView(R.layout.meeting_planner);
																													
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
																																																																							
																																																																									mc = mapView.getController();
																																																																													
																																																																															p = new GeoPoint(37581776,127009874);
																																																																																	p1 = new GeoPoint(37585676,127005674);
																																																																																			p2 = new GeoPoint(37569923,126988403);

																																																																																					

																																																																																							
																																																																																									
																																																																																											mc.animateTo(p2); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																																																																													mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시

																																																																																															list = mapView.getOverlays(); 
																																																																																																	
																																																																																																			drawable = this.getResources().getDrawable(R.drawable.blackpin);
																																																																																																					db1 = this.getResources().getDrawable(R.drawable.bluepin);
																																																																																																							db2 = this.getResources().getDrawable(R.drawable.redpin);
																																																																																																									
																																																																																																											umoverlay = new UMOverlay(drawable);
																																																																																																													umo1 = new UMOverlay(db1);// 현재 맵에 등록된 레이어 목록을 추출해서 리스트로 참조한다.
																																																																																																															umo2 = new UMOverlay(db2);
																																																																																																																	
																																																																																																																			overlayItem01 = new OverlayItem(p, "", "");
																																																																																																																					overlayItem02 = new OverlayItem(p1, "", "");
																																																																																																																							overlayItem03 = new OverlayItem(p2, "", "");

																																																																																																																									// OverlayItem 클래스에 지도의 위.경도 값을 받은 객체 하나를 생성한다.
																																																																																																																											
																																																																																																																													// 이를 받아서 helloOverlay에 추가한다. 넣게되면 list에 추가하게 되고 다추가하고 난 뒤에 populate해서
																																																																																																																															// 그려준다.
																																																																																																																																	umoverlay.addOverlay(overlayItem01);
																																																																																																																																			umo1.addOverlay(overlayItem02);
																																																																																																																																					umo2.addOverlay(overlayItem03);

																																																																																																																																							// 리스트에 추가한다. googleMap.java에 추가.

																																																																																																																																									list.add(umoverlay);
																																																																																																																																											list.add(umo1);
																																																																																																																																													list.add(umo2);



																																																																																																																																														}

																																																																																																																																															@Override
																																																																																																																																																protected boolean isRouteDisplayed() {
																																																																																																																																																		// TODO Auto-generated method stub
																																																																																																																																																				return false;
																																																																																																																																																					}
																																																																																																																																																						
																																																																																																																																																							public void onClick(View v) {
																																																																																																																																																									switch (v.getId()) {

																																																																																																																																																											case R.id.bt1:
																																																																																																																																																														Intent i1 = new Intent(rs6_w.this, rs6.class);
																																																																																																																																																																	startActivity(i1);
																																																																																																																																																																				break;
																																																																																																																																																																						case R.id.bt2:
																																																																																																																																																																									Intent i3 = new Intent(rs6_w.this, rs6_w.class);
																																																																																																																																																																												startActivity(i3);
																																																																																																																																																																															break;

																																																																																																																																																																																	case R.id.bt3:
																																																																																																																																																																																				mc.animateTo(p); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																																																																																																																																																																							mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시
																																																																																																																																																																																										break;

																																																																																																																																																																																												case R.id.bt4:
																																																																																																																																																																																															mc.animateTo(p1); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																																																																																																																																																																																		mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시
																																																																																																																																																																																																					break;

																																																																																																																																																																																																							case R.id.bt5:
																																																																																																																																																																																																										Intent i5 = new Intent(rs6_w.this, ready.class);
																																																																																																																																																																																																													startActivity(i5);
																																																																																																																																																																																																																break;

																																																																																																																																																																																																																		case R.id.bt6:
																																																																																																																																																																																																																					mc.animateTo(p2); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																																																																																																																																																																																																								mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시
																																																																																																																																																																																																																											break;
																																																																																																																																																																																																																														
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																	}

																																																																																																																																																																																																																																	}
