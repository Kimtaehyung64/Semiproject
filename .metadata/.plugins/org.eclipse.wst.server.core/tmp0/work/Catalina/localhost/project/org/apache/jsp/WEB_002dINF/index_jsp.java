/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-06-01 08:29:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/header.jsp", Long.valueOf(1590258076000L));
    _jspx_dependants.put("/WEB-INF/footer.jsp", Long.valueOf(1590395064000L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"EUC-KR\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>상권정보 제공 사이트</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\r\n");
      out.write("        <!-- Font Awesome icons (free version)-->\r\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.12.1/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        <!-- Navigation-->  \r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\t\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">세미프로젝트 메인</a><button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">Menu<i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    \t<li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#about\">한글테스트</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#projects\">Projects</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#signup\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>");
      out.write("\r\n");
      out.write("<header class=\"masthead\">\r\n");
      out.write("\t<div class=\"container d-flex h-100 align-items-center\">\r\n");
      out.write("\t\t<div class=\"mx-auto text-center\">\r\n");
      out.write("\t\t\t<h1 class=\"mx-auto my-0 text-uppercase\" id=\"title\">\r\n");
      out.write("\t\t\t\t<img style=\"width: 100px; height: 100px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"assets/img/copyright.jpg\"><span class=\"logotext typer\">Grayscale</span>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<h3 class=\"text-white-50 mx-auto mt-2 mb-5\">\r\n");
      out.write("\t\t\t\tProjectName 은 한발 앞서가는 분석으로 <br>최적의 매물과 가치를 만들어 드립니다.\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<a class=\"btn btn-primary js-scroll-trigger\" href=\"#signup\">Get\r\n");
      out.write("\t\t\t\tStarted</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- About-->\r\n");
      out.write("\r\n");
      out.write("<!-- Projects-->\r\n");
      out.write("\r\n");
      out.write("<!-- Signup-->\r\n");
      out.write("<section class=\"signup-section\" id=\"signup\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-10 col-lg-8 mx-auto text-center\">\r\n");
      out.write("\t\t\t\t<i class=\"far fa-paper-plane fa-2x mb-2 text-white\"></i>\r\n");
      out.write("\t\t\t\t<h2 class=\"text-white mb-5\">Subscribe to receive updates!</h2>\r\n");
      out.write("\t\t\t\t<form class=\"form-inline d-flex\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0\"\r\n");
      out.write("\t\t\t\t\t\tid=\"inputEmail\" type=\"email\" placeholder=\"Enter email address...\" />\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary mx-auto\" type=\"submit\">Subscribe</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Contact-->\r\n");
      out.write("<section class=\"contact-section bg-black\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3 mb-md-0\">\r\n");
      out.write("\t\t\t\t<div class=\"card py-4 h-100\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"hyundoo.Project?page=commercial&subcode=0\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-map-marked-alt text-primary mb-2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"text-uppercase m-0\">상가</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"my-4\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"small text-black-50\">현두 담당</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3 mb-md-0\">\r\n");
      out.write("\t\t\t\t<div class=\"card py-4 h-100\">\r\n");
      out.write("\t\t\t\t\t<a href=\"semi.Project?page=estate\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"text-uppercase m-0\">부동산</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"my-4\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"small text-black-50\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#!\">온유담당</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3 mb-md-0\">\r\n");
      out.write("\t\t\t\t<div class=\"card py-4 h-100\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-uppercase m-0\">경매</h3>\r\n");
      out.write("\t\t\t\t\t\t<hr class=\"my-4\" />\r\n");
      out.write("\t\t\t\t\t\t<div class=\"small text-black-50\">태준형님</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"social d-flex justify-content-center\">\r\n");
      out.write("\t\t\t<a class=\"mx-2\" href=\"#!\"><i class=\"fab fa-twitter\"></i></a><a\r\n");
      out.write("\t\t\t\tclass=\"mx-2\" href=\"#!\"><i class=\"fab fa-facebook-f\"></i></a><a\r\n");
      out.write("\t\t\t\tclass=\"mx-2\" href=\"#!\"><i class=\"fab fa-github\"></i></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer-->\r\n");
      out.write("        <footer class=\"footer bg-black small text-center text-white-50\"><div class=\"container\">Copyright ⓒ   Your Website 2020</div></footer>\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Third party plugin JS-->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"js/scripts.js\"></script>\r\n");
      out.write("        <script src=\"js/text.js\"></script>\r\n");
      out.write("         <script>\r\n");
      out.write("         $(function() {\r\n");
      out.write("        \t \r\n");
      out.write("        \t    $(\".typer\").typed({\r\n");
      out.write("         \t\t    strings: [\" C조 세미프로젝트\", \" Test용 문구\", \" 조장 : 박현두\", \" 나야!\"],\r\n");
      out.write("         \t\t    typeSpeed: 200,\r\n");
      out.write("         \t\t    backDelay: 500,\r\n");
      out.write("         \t\t    showCursor: false\r\n");
      out.write("         \t\t});\r\n");
      out.write("        \t    \r\n");
      out.write("        \t    \r\n");
      out.write("        \t    $('.card').click(function() {\n");
      out.write("        \t    \t\tvar num=$(this).index();\r\n");
      out.write("        \t    \t\tconsole.log(num)\n");
      out.write("        \t    });\r\n");
      out.write("\t\t});\r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("                    </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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