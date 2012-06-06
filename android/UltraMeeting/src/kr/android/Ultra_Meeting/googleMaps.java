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
		Drawable drawable;// 마커로 그림 그릴때 불러오기 위한 클래스
			List<Overlay> list; // 마커 위에 마커가 올라갈 수도 있게 때문에 list 타입으로 선언
				// 맵에 컬렉션 타입으로 구성
					HelloOverlay helloOverlay;

						@Override
							protected void onCreate(Bundle savedInstanceState) {
									// TODO Auto-generated method stub
											super.onCreate(savedInstanceState);
													setContentView(R.layout.m1_1);

															mapView = (MapView) findViewById(R.id.mapview);
																	// Zoom이 되야 겠지 우선
																			mapView.setBuiltInZoomControls(true);
																					// 위성 지도로 만들고 싶다면 true
																							mapView.setSatellite(false);

																									// 위도하고 경도값을 지정함
																											GeoPoint p = new GeoPoint(37556447, 126945184);
																													// 실제좌표값을 맵뷰에 출력, 좌표값이 바뀌면 바뀐 위치를 화면에 출력
																															MapController mc = mapView.getController();
																																	mc.animateTo(p); // animateTo() 메소드에 매개변수로 받는다. 이곳으로 지도의 중심으로 가게 한다.
																																			mc.setZoom(18); // 1~21 숫자가 클수록 정밀하게 표시

																																					// 현재 맵에 등록된 레이어 목록을 추출해서 리스트로 참조한다.
																																							list = mapView.getOverlays();
																																									// 맵에 중심에 꽂아줄 이미지 생성
																																											drawable = this.getResources().getDrawable(R.drawable.androidmarker);
																																													// 생성한 이미지를 HelloOverlay에 넣고 객체값을 받는다.
																																															helloOverlay = new HelloOverlay(drawable);
																																																	// OverlayItem 클래스에 지도의 위.경도 값을 받은 객체 하나를 생성한다.
																																																			OverlayItem overlayItem = new OverlayItem(p, "", "");
																																																					// 이를 받아서 helloOverlay에 추가한다. 넣게되면 list에 추가하게 되고 다추가하고 난 뒤에 populate해서
																																																							// 그려준다.
																																																									helloOverlay.addOverlay(overlayItem);
																																																											// 리스트에 추가한다. googleMap.java에 추가.
																																																													list.add(helloOverlay);

																																																														}

																																																															@Override
																																																																protected boolean isRouteDisplayed() {
																																																																		// TODO Auto-generated method stub
																																																																				return false;
																																																																					}

																																																																					}
