package kr.android.Ultra_Meeting;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class googleMaps extends MapActivity {

	MapView mapView;
		Drawable drawable;// ��Ŀ�� �׸� �׸��� �ҷ����� ���� Ŭ����
			List<Overlay> list; // ��Ŀ ���� ��Ŀ�� �ö� ���� �ְ� ������ list Ÿ������ ����
				// �ʿ� �÷��� Ÿ������ ����
					HelloOverlay helloOverlay;

						@Override
							protected void onCreate(Bundle savedInstanceState) {
									// TODO Auto-generated method stub
											super.onCreate(savedInstanceState);
													setContentView(R.layout.m1_1);

															mapView = (MapView) findViewById(R.id.mapview);
																	// Zoom�� �Ǿ� ���� �켱
																			mapView.setBuiltInZoomControls(true);
																					// ���� ������ ����� �ʹٸ� true
																							mapView.setSatellite(false);

																									// �����ϰ� �浵���� ������
																											GeoPoint p = new GeoPoint(37556447, 126945184);
																													// ������ǥ���� �ʺ信 ���, ��ǥ���� �ٲ�� �ٲ� ��ġ�� ȭ�鿡 ���
																															MapController mc = mapView.getController();
																																	mc.animateTo(p); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																			mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��

																																					// ���� �ʿ� ��ϵ� ���̾� ����� �����ؼ� ����Ʈ�� �����Ѵ�.
																																							list = mapView.getOverlays();
																																									// �ʿ� �߽ɿ� �Ⱦ��� �̹��� ����
																																											drawable = this.getResources().getDrawable(R.drawable.androidmarker);
																																													// ������ �̹����� HelloOverlay�� �ְ� ��ü���� �޴´�.
																																															helloOverlay = new HelloOverlay(drawable);
																																																	// OverlayItem Ŭ������ ������ ��.�浵 ���� ���� ��ü �ϳ��� �����Ѵ�.
																																																			OverlayItem overlayItem = new OverlayItem(p, "", "");
																																																					// �̸� �޾Ƽ� helloOverlay�� �߰��Ѵ�. �ְԵǸ� list�� �߰��ϰ� �ǰ� ���߰��ϰ� �� �ڿ� populate�ؼ�
																																																							// �׷��ش�.
																																																									helloOverlay.addOverlay(overlayItem);
																																																											// ����Ʈ�� �߰��Ѵ�. googleMap.java�� �߰�.
																																																													list.add(helloOverlay);

																																																														}

																																																															@Override
																																																																protected boolean isRouteDisplayed() {
																																																																		// TODO Auto-generated method stub
																																																																				return false;
																																																																					}

																																																																					}
