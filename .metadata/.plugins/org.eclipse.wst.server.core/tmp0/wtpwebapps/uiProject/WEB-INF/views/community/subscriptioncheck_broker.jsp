<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ include file="../include/header_index.jsp"%>
 <link href="resources/css/community/subscriptoncheck_broker.css" rel="stylesheet">
<%@ include file="../include/header_menu.jsp"%>

	<section class="projects-section bg-light" id="projects">
		<div class="container">
			<table class="table">
				<tr class="success">
					<th colspan="2"><a>�����</a><br>ȸ�������� ���ϵ帳�ϴ�!</th>
				</tr>
				<tr>
					<td colspan="2" id="welcome1">�������� �����Ͻø� ���� ���� ������ ������ �� �ֽ��ϴ�!</td>
				</tr>
				<tr>
					<td id="welcome2">�����ϰ� �����ôٸ�!<br><br><button type="button" class="btn btn-warning" onclick="location ='semi.Project?page=payment&code=2'">Subscribe</button></td>
					<td id="welcome3">�ƴϿ�! �������ϴ�!<br><br><button type="button" class="btn btn-success" onclick="location = 'semi.Project?page=index'">Go Main</button></td>
				</tr>
			</table>
		</div>
	</section>

<%@ include file="../include/footer.jsp"%>