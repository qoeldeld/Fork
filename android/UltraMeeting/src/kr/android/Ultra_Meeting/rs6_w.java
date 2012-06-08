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
		// �ʿ� �߽ɿ� �Ⱦ��� �̹��� ���� // ��Ŀ�� �׸� �׸��� �ҷ����� ���� Ŭ����
			Drawable drawable,db1,db2;
				List<Overlay> list; // ��Ŀ ���� ��Ŀ�� �ö� ���� �ְ� ������ list Ÿ������ ����
					
						// �ʿ� �÷��� Ÿ������ ����
							// ������ �̹����� HelloOverlay�� �ְ� ��ü���� �޴´�.
								UMOverlay umoverlay,umo1,umo2;
									

										// �����ϰ� �浵���� ������
											GeoPoint p,p1,p2;
												

													OverlayItem overlayItem01;
														OverlayItem overlayItem02;
															OverlayItem overlayItem03;
																
																	// ������ǥ���� �ʺ信 ���, ��ǥ���� �ٲ�� �ٲ� ��ġ�� ȭ�鿡 ���
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
																																																															// Zoom�� �Ǿ� ���� �켱
																																																																	mapView.setBuiltInZoomControls(true);
																																																																			// ���� ������ ����� �ʹٸ� true
																																																																					mapView.setSatellite(false);
																																																																							
																																																																									mc = mapView.getController();
																																																																													
																																																																															p = new GeoPoint(37581776,127009874);
																																																																																	p1 = new GeoPoint(37585676,127005674);
																																																																																			p2 = new GeoPoint(37569923,126988403);

																																																																																					

																																																																																							
																																																																																									
																																																																																											mc.animateTo(p2); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																																																													mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��

																																																																																															list = mapView.getOverlays(); 
																																																																																																	
																																																																																																			drawable = this.getResources().getDrawable(R.drawable.blackpin);
																																																																																																					db1 = this.getResources().getDrawable(R.drawable.bluepin);
																																																																																																							db2 = this.getResources().getDrawable(R.drawable.redpin);
																																																																																																									
																																																																																																											umoverlay = new UMOverlay(drawable);
																																																																																																													umo1 = new UMOverlay(db1);// ���� �ʿ� ��ϵ� ���̾� ����� �����ؼ� ����Ʈ�� �����Ѵ�.
																																																																																																															umo2 = new UMOverlay(db2);
																																																																																																																	
																																																																																																																			overlayItem01 = new OverlayItem(p, "", "");
																																																																																																																					overlayItem02 = new OverlayItem(p1, "", "");
																																																																																																																							overlayItem03 = new OverlayItem(p2, "", "");

																																																																																																																									// OverlayItem Ŭ������ ������ ��.�浵 ���� ���� ��ü �ϳ��� �����Ѵ�.
																																																																																																																											
																																																																																																																													// �̸� �޾Ƽ� helloOverlay�� �߰��Ѵ�. �ְԵǸ� list�� �߰��ϰ� �ǰ� ���߰��ϰ� �� �ڿ� populate�ؼ�
																																																																																																																															// �׷��ش�.
																																																																																																																																	umoverlay.addOverlay(overlayItem01);
																																																																																																																																			umo1.addOverlay(overlayItem02);
																																																																																																																																					umo2.addOverlay(overlayItem03);

																																																																																																																																							// ����Ʈ�� �߰��Ѵ�. googleMap.java�� �߰�.

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
																																																																																																																																																																																				mc.animateTo(p); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																																																																																																																																																							mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��
																																																																																																																																																																																										break;

																																																																																																																																																																																												case R.id.bt4:
																																																																																																																																																																																															mc.animateTo(p1); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																																																																																																																																																																		mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��
																																																																																																																																																																																																					break;

																																																																																																																																																																																																							case R.id.bt5:
																																																																																																																																																																																																										Intent i5 = new Intent(rs6_w.this, ready.class);
																																																																																																																																																																																																													startActivity(i5);
																																																																																																																																																																																																																break;

																																																																																																																																																																																																																		case R.id.bt6:
																																																																																																																																																																																																																					mc.animateTo(p2); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																																																																																																																																																																																								mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��
																																																																																																																																																																																																																											break;
																																																																																																																																																																																																																														
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																	}

																																																																																																																																																																																																																																	}
