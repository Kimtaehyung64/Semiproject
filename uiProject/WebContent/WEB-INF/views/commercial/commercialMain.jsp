<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../commercial/header_index.jsp"%>


<%@include file="../commercial/sidemenu.jsp" %>
<!-- Page Content -->
<div class="container">
	<!-- Call to Action Well -->
	<script src="js/json2.js"></script>
	<div class="card text-white bg-secondary my-5 py-4 text-center">
		<div class="card-body">
			<form class="form-inline">
				<select id="combobox1" class="form-control"
					style="margin-right: 30px; width: 120px">
					<!-- <input type="text" autocomplete="off" placeholder="Select a State" class="combobox input-large form-control"> -->
					<option>�� ����</option>
				</select>	
				<select id="combobox6" class="form-control" style="margin-right:30px;width:120px">
				<!-- <input type="text" autocomplete="off" placeholder="Select a State" class="combobox input-large form-control"> -->
				<option>�� ����</option>
			</select>
				<select id="combobox2" class="form-control"
					style="margin-right: 30px; width: 200px">
					<option>������з�</option>
				</select>			
				<select id="combobox3" class="form-control"
					style="margin-right: 30px; width: 250px">
					<option>�����ߺз�</option>
				</select>			
				<select id="combobox4" class="form-control"
					style="margin-right: 30px; width: 200px">
					<option>�����Һз�</option>
				</select>			
			</form>
			<!-- <p class="text-white m-0">���� ��ġ ���� ��ư ���� �ڸ�</p> -->
		</div>
	</div>
	<!-- Heading Row -->
	<div class="row align-items-center my-5">
		<div id="map" class="col-lg-7" style="width: 100%; height: 400px;">
			<!-- <img class="img-fluid rounded mb-4 mb-lg-0" src="http://placehold.it/900x400"> -->
		</div>
		     <script type="text/javascript"
			src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=wejnreaybi"></script>
		<script>
			var seoul = new naver.maps.LatLngBounds(new naver.maps.LatLng(
					37.42829747263545, 126.76620435615891),
					new naver.maps.LatLng(37.7010174173061, 127.18379493229875));
			var map = new naver.maps.Map(document.getElementById('map'), {
				minZoom : 10.5,
				zoom : 10.5,
				mapTypeId : 'normal',
				center : new naver.maps.LatLng(37.4098871, 126.989261),
				maxBounds : seoul,
				logoControl : false,
				baseTileOpacity : 0
			});
			/* var HOME_PATH = window.HOME_PATH || '.'; */
			naver.maps.Event.once(map, 'init_stylemap', function() {
				$.ajax({
					url : 'resources/js/commercial/seoul_municipalities_geo.json',
					dataType : 'json',
					success : startDataLayer
				});
			});
			//geoJson ���̾� �߰��ϱ�
			function startDataLayer(geojson) {
				map.data.addGeoJson(geojson);
				map.data.setStyle(function(feature) {
					var color = 'black';
					if (feature.getProperty('isColorful')) {
						color = feature.getProperty('color');
					}
					return {
						fillColor : 'white',
						strokeColor : color,
						strokeWeight : 2,
						icon : null
					};
				});
				map.data.addListener('click', function(e) {
					e.feature.setProperty('isColorful', true);
					
				});
				map.data.addListener('dblclick', function(e) {
					var bounds = e.feature.getBounds();

					if (bounds) {
						map.panToBounds(bounds);
					}
				});
				map.data.addListener('mouseover', function(e) {
					map.data.overrideStyle(e.feature, {
						strokeWeight : 8,
						icon : 'resources/js/commercial/seoul_municipalities_geo.json'
					});
				});
				map.data.addListener('mouseout', function(e) {
					map.data.revertStyle();
				});
			}
			/* 	for (var i = 0; i < ${array.length}; i++) {
					var marker = new naver.maps.Marker({
						position: new naver.maps.LatLng(x,y),
						map : map,
						title : '�׸�'
					})
				}*/
		</script>
		<div class="col-lg-5">
			<h1 class="font-weight-light">���� ���� ����</h1>
			<p>â���� ���Ͻô� ������ ��ǥ�� �������ּ���. �� ���� ��ó�� �����α�, �ֺ� ��Ǻм�, �ǰŷ��� �� �پ���
				������ �����ص帳�ϴ�. ���� �� �ڼ��� ������ ��� �����ø� �Ʒ� ��ư�� �����ּ���.</p>
			<a class="btn btn-primary" href="#"
				style="margin: 0 auto;width=300px;">Contect Us!</a>
		</div>
		<!-- /.col-md-4 -->
	</div>
	<!-- /.row -->
	<!-- Content Row -->
	<div class="row">
		<div class="col-md-4 mb-5">
			<div class="card h-100">
				<div class="card-body">
					<h2 class="card-title">�Ź� 1</h2>
					<p class="card-text">�Ź� ���� �̹��� �� ���� �ڸ�</p>
				</div>
				<div class="card-footer">
					<a href="#" class="btn btn-primary btn-sm">More Info</a>
				</div>
			</div>
		</div>
		<!-- /.col-md-4 -->
		<div class="col-md-4 mb-5">
			<div class="card h-100">
				<div class="card-body">
					<h2 class="card-title">�Ź� 2</h2>
					<p class="card-text">�Ź� ���� �̹��� �� ���� �ڸ�</p>
				</div>
				<div class="card-footer">
					<a href="#" class="btn btn-primary btn-sm">More Info</a>
				</div>
			</div>
		</div>
		<!-- /.col-md-4 -->
		<div class="col-md-4 mb-5">
			<div class="card h-100">
				<div class="card-body">
					<h2 class="card-title">�Ź� 3</h2>
					<p class="card-text">�Ź� ���� �̹��� �� ���� �ڸ�</p>
				</div>
				<div class="card-footer">
					<a href="#" class="btn btn-primary btn-sm">More Info</a>
				</div>
			</div>
		</div>
		<!-- /.col-md-4 -->
	</div>
	<!-- /.row -->
</div>
<!-- /.container -->
<%@ include file="../commercial/footer.jsp"%>
</html>