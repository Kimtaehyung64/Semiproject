/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-06-01 09:31:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.auction;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auction_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/auction/../include/footer.jsp", Long.valueOf(1590935123427L));
    _jspx_dependants.put("/WEB-INF/views/auction/../include/header_index.jsp", Long.valueOf(1590932179513L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1588293609789L));
    _jspx_dependants.put("jar:file:/C:/ikosmo64/webapp/projectworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uiProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/auction/../include/header_menu.jsp", Long.valueOf(1591002295064L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("  \t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"EUC-KR\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Grayscale - Start Bootstrap Theme</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\r\n");
      out.write("        <!-- Font Awesome icons (free version)-->\r\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.12.1/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"resources/css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/auction/main/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/auction/main/banner.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("       \r\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav2\" >\r\n");
      out.write("         <div class=\"container .col-md-12\">\r\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">메인메뉴테스트</a><button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">Menu<i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                 <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item2\"><a class=\"nav-link2 js-scroll-trigger\" href=\"#about\">강온유님 환영합니다.</a></li>\r\n");
      out.write("                      \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto2\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=estate&code=2\">매물 등록</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" onclick=\"location = 'semi.Project?page=community&code=1'\">커뮤니티</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=customer&code=1\">고객센터</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=commercial&subcode=98\">상가</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                    </ul>\r\n");
      out.write("                      <ul class=\"navbar-nav ml-auto2\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#about\">내정보</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#projects\">로그아웃</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            </nav>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"width: 1500px;margin: 80px auto; \">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("\t\t  <a class=\"navbar-brand\" href=\"#\">부동산경매</a>\r\n");
      out.write("\t\t  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t  </button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("\t\t    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t      <li class=\"nav-item active\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">물건검색 <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("\t\t      </li>\r\n");
      out.write("\t\t      <li class=\"nav-item\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">판매관리</a>\r\n");
      out.write("\t\t      </li>\r\n");
      out.write("\t\t      <li class=\"nav-item\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">구매관리</a>\r\n");
      out.write("\t\t      </li>\r\n");
      out.write("\t\t      <li class=\"nav-item\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">부동산등록</a>\r\n");
      out.write("\t\t      </li>\r\n");
      out.write("\t\t      <li class=\"nav-item\">\r\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">경매정보</a>\r\n");
      out.write("\t\t      </li>\r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<section id=\"banner\" class=\"swiper-container main-banner-container\">\r\n");
      out.write("\t\t\t\t<div class=\"swiper-wrapper\">\r\n");
      out.write("\t\t\t\t\t<div class=\"swiper-slide banner-wrapper r1\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer;\" onclick=\"\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"swiper-slide banner-wrapper r2\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer;\" onclick=\"\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"swiper-slide banner-wrapper r3\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer;\" onclick=\"\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- banner arrow -->\r\n");
      out.write("\t\t\t\t<button class=\"swiper-button-next swiper-arrow-button swiper-arrow-button-next banner-button-next\" style=\"background-image: url('images/icon/1next.png')\"></button>\r\n");
      out.write("\t\t\t\t<button class=\"swiper-button-prev swiper-arrow-button swiper-arrow-button-prev banner-button-prev\" style=\"background-image: url('images/icon/1prev.png')\"></button>\r\n");
      out.write("\t\t\t\t<!-- banner bullets -->\r\n");
      out.write("\t\t\t\t<div class=\"swiper-pagination banner-bullet\"></div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"body\"style=\"width: 100%; height: 100%; margin: auto;\">\r\n");
      out.write("\t\t\t<div id=\"leftcontents\" style=\"position: relative; width: 70%;margin: auto;\">\r\n");
      out.write("\t\t\t\t<div id=\"searchtop\" name=\"searchtop\" style=\"width: 100%;height:65px;border: 1px solid gray;padding: 10px;\"><div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t진행사항:<select class=\"form-control\" id=\"exampleSelect1\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t<option>전체</option>\r\n");
      out.write("\t\t\t\t\t\t<option>신건</option>\r\n");
      out.write("\t\t\t\t\t\t<option>유찰</option>\r\n");
      out.write("\t\t\t\t\t\t<option>진행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>변경</option>\r\n");
      out.write("\t\t\t\t\t\t<option>예정</option>\r\n");
      out.write("\t\t\t\t\t\t<option>낙찰</option>\r\n");
      out.write("\t\t\t\t\t</select> 물건용도:<select class=\"form-control\" id=\"exampleSelect2\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t<option>전체</option>\r\n");
      out.write("\t\t\t\t\t\t<option>아파트</option>\r\n");
      out.write("\t\t\t\t\t\t<option>주택/빌라</option>\r\n");
      out.write("\t\t\t\t\t\t<option>상업/업무</option>\r\n");
      out.write("\t\t\t\t\t\t<option>공장/창고</option>\r\n");
      out.write("\t\t\t\t\t\t<option>토지</option>\r\n");
      out.write("\t\t\t\t\t\t<option>기타</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t<div id=\"datalisttop\" style=\"width: 100%;margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left;\"><button type=\"button\" class=\"btn btn-primary\" style=\"width: 200px\">관심물건등록</button></div>\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left;\"><label id=\"sumres\" style=\"margin-top: 5px;margin-left: 10px;\">(총 <b>1,006</b>건)</label></div>  \r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\" style=\"float: right;\">\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-secondary\">사건번호순</button>\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-secondary\">감정가순</button>\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-secondary\">최저가순</button>\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-secondary\">매각기일순</button>\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-secondary\">조회수순</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>   \r\n");
      out.write("\t\t\t\t<div id=\"datalist\" style=\"margin-top: 70px;\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"sabunchk\"/>\r\n");
      out.write("                                      <label class=\"custom-control-label\" for=\"sabunchk\">사건번호</label>\r\n");
      out.write("                                   </div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\" colspan=\"2\">물건용도/소재지/면적</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\" colspan=\"2\" style=\"padding-left: 0px;\">감정/최저</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">상태/입찰일/조회수</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody style=\"border-bottom: 1px solid gray;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th id=\"colchk1\" scope=\"row\" style=\"width: 180px;\"><div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"sabunch1\"/>\r\n");
      out.write("                                      <label class=\"custom-control-label\" for=\"sabunch1\">2020-0001</label>\r\n");
      out.write("                                   </div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd1_1\" style=\"width: 130px;\"><img src=\"images/kosmo.jpg\" style=\"width: 120px;height: 120px;float: left;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd1_2\" style=\"width: 500px;\"><label id=\"t1addr1_1\"><a href=\"http://localhost:8080/uiProject/semi.Project?page=auction&code=4\" style=\"color: black;\"><b>[아파트형공장]</b><br/>서울 특별시 금천구 가산동 426-5 월드 메르디앙 벤처센터 2차 410호</a></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr1_2\" style=\"font-size: 11pt;height: 6px;\">토지 70.28㎡/건물 226.2㎡</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr1_3\" style=\"font-size: 11pt;color: red;height: 6px;\">유치권</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:0px;padding-right: 0px;\"><span class=\"badge badge-primary\">감정</span><br/><span class=\"badge badge-info\">최저</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:3px;\"><b>799,000,000</b><br/><span style=\"color: blue;\"><b>327,270,000</b></span><span style=\"color: blue;padding-left: 20px;\">(41%)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"text-align: center;\">진행<br/>2020.05.26<br/>10687</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th id=\"colchk2\" scope=\"row\" style=\"width: 180px;\"><div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"sabunch2\"/>\r\n");
      out.write("                                      <label class=\"custom-control-label\" for=\"sabunch2\">2020-0002</label>\r\n");
      out.write("                                   </div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd2_1\" style=\"width: 130px;\"><img src=\"images/ko1.JPG\" style=\"width: 120px;height: 120px;float: left;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd2_2\" style=\"width: 500px;\"><label id=\"t1addr2_1\"><a href=\"http://localhost:8080/uiProject/semi.Project?page=auction&code=4\" style=\"color: black;\"><b>[아파트형공장]</b><br/>서울 특별시 구로구 구로동 197-7번지 에이스테크노타워2 6층 602-1호</a></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr2_2\" style=\"font-size: 11pt;height: 6px;\">토지 35.13㎡/건물 113.1㎡</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr2_3\" style=\"font-size: 11pt;color: red;height: 6px;\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:0px;padding-right: 0px;\"><span class=\"badge badge-primary\">감정</span><br/><span class=\"badge badge-info\">최저</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:3px;\"><b>393,000,000</b><br/><span style=\"color: blue;\"><b>160,973,000</b></span><span style=\"color: blue;padding-left: 20px;\">(41%)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"text-align: center;\">유찰1회<br/>2020.07.17<br/>8846</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th id=\"colchk3\" scope=\"row\" style=\"width: 180px;\"><div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"sabunch3\"/>\r\n");
      out.write("                                      <label class=\"custom-control-label\" for=\"sabunch3\">2020-0003</label>\r\n");
      out.write("                                   </div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd3_1\" style=\"width: 130px;\"><img src=\"images/bu2.jpg\" style=\"width: 120px;height: 120px;float: left;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"coltd3_2\" style=\"width: 500px;\"><label id=\"t1addr1_1\"><a href=\"http://localhost:8080/uiProject/semi.Project?page=auction&code=4\" style=\"color: black;\"><b>[주택/빌라]</b><br/>서울 종로구 청운동 52-19번지</a></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr3_2\" style=\"font-size: 11pt;height: 6px;\">토지 6110.28㎡/건물 3280.1㎡</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/><label id=\"t1addr3_3\" style=\"font-size: 11pt;color: red;height: 6px;\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:0px;padding-right: 0px;\"><span class=\"badge badge-primary\">감정</span><br/><span class=\"badge badge-info\">최저</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left:3px;\"><b>60,000,000,000</b><br/><span style=\"color: blue;\"><b>30,000,000,000</b></span><span style=\"color: blue;padding-left: 20px;\">(50%)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"text-align: center;\">예정<br/>2020.08.21<br/>8604</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"pagination pagination-sm\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 380px; margin: 0 auto;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item disabled\"><a class=\"page-link\" href=\"#\">&laquo;</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">6</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">7</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">8</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">9</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">10</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">&raquo;</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"resources/js/auction/auction_main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer-->\r\n");
      out.write("        <footer class=\"footer bg-black small text-center text-white-50\"><div class=\"container\">Copyright ⓒ   Your Website 2020</div></footer>\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("      \r\n");
      out.write("        <script\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Third party plugin JS-->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"resources/js/scripts.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/text.js\"></script>\r\n");
      out.write("         <script>\r\n");
      out.write("         $(function() {\r\n");
      out.write("        \t \r\n");
      out.write("        \t    $(\".typer\").typed({\r\n");
      out.write("         \t\t    strings: [\" C조 Project\", \" Test용 문구\", \" 조장 : 박현두\", \" 대박임\"],\r\n");
      out.write("         \t\t    typeSpeed: 500,\r\n");
      out.write("         \t\t    backDelay: 1500,\r\n");
      out.write("         \t\t    showCursor: false\r\n");
      out.write("         \t\t});\r\n");
      out.write("        \t    $('#filter_close').click(function() {\n");
      out.write("        \t    \t$('.filter-page').slideUp(1000).addClass('invisible').removeClass('visible');\r\n");
      out.write("        \t    \tclassName='invisible';\r\n");
      out.write("        \t    \tinvisible='invisible';\r\n");
      out.write("        \t    \tvisible='visible';\r\n");
      out.write("        \t    \t        \n");
      out.write("        \t    })\r\n");
      out.write("        \t    \r\n");
      out.write("        \t    $('.card').click(function() {\n");
      out.write("        \t    \t\tvar num=$(this).index();\r\n");
      out.write("        \t    \t\tconsole.log(num)\n");
      out.write("        \t    });\r\n");
      out.write("        \t    var invisible='invisible';\r\n");
      out.write("        \t    var visible='visible';\r\n");
      out.write("        \t    var className='invisible';\r\n");
      out.write("        \t   $('.filter-div').children('.btn').click(function() {\r\n");
      out.write("        \t\t  \r\n");
      out.write("           \t\t \r\n");
      out.write("        \t\t   \t$('.filter-page').removeClass(invisible);\r\n");
      out.write("       \t   \t\t\t$('.filter-page').addClass(visible);\r\n");
      out.write("        \t\t \tif(className === 'visible'){\r\n");
      out.write("        \t\t \t      \r\n");
      out.write("        \t\t \t\t$('.filter-page').slideUp(1000);\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t}else {\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t\t$('.filter-page').slideDown(1000);\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t}\n");
      out.write("        \t\t \t\t\r\n");
      out.write("            \t   \t\tclassName=visible;\r\n");
      out.write("            \t   \t\tvisible=invisible;\r\n");
      out.write("            \t   \t\tinvisible=className;\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t \t\n");
      out.write("        \t\t \t\n");
      out.write("        \t   });\r\n");
      out.write("        \t    \r\n");
      out.write("        \t    \r\n");
      out.write("\t\t});\r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("                    </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
