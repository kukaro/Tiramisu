/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-18 12:10:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>티라미슈~~</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\"\n");
      out.write("\tcontent=\"Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("\t\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--js-->\n");
      out.write("<script src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("<!--icons-css-->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<!--Google Fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link href='css/search.css' rel='stylesheet' type='text/css'>\n");
      out.write("<!--static chart-->\n");
      out.write("<script src=\"js/Chart.min.js\"></script>\n");
      out.write("<!--//charts-->\n");
      out.write("<!-- geo chart -->\n");
      out.write("<script src=\"//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\twindow.modernizr\n");
      out.write("\t\t\t|| document\n");
      out.write("\t\t\t\t\t.write('<script src=\"lib/modernizr/modernizr-custom.js\"><\\/script>')\n");
      out.write("</script>\n");
      out.write("<!--<script src=\"lib/html5shiv/html5shiv.js\"></script>-->\n");
      out.write("<!-- Chartinator  -->\n");
      out.write("<script src=\"js/chartinator.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
boolean isLogin = (session != null && session.getAttribute("memberId") != null ? true : false);
	System.out.println("Debug index.jsp : " + session.getAttribute("memberId"));
	if (isLogin) {
      out.write("\n");
      out.write("\t\t$(document).ready(function() {$(\"#header-frame\").load(\"header-login-frame.html\");});\n");
} else {
      out.write("\n");
      out.write("\t\t$(document).ready(function() {$(\"#header-frame\").load(\"header-logout-frame.html\");});\n");
}
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t$(\"#left-frame\").load(\"left-frame.jsp\");\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--geo chart-->\n");
      out.write("\n");
      out.write("<!--skycons-icons-->\n");
      out.write("<script src=\"js/skycons.js\"></script>\n");
      out.write("<!--//skycons-icons-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"page-container\">\n");
      out.write("\t\t<div class=\"left-content\">\n");
      out.write("\t\t\t<div class=\"mother-grid-inner\">\n");
      out.write("\t\t\t\t<div id=\"header-frame\"></div>\n");
      out.write("\t\t\t\t<!-- <div id=\"header-login-frame\"></div> -->\n");
      out.write("\t\t\t\t<!-- script-for sticky-nav -->\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\tvar navoffeset = $(\".header-main\").offset().top;\n");
      out.write("\t\t\t\t\t\t$(window).scroll(function() {\n");
      out.write("\t\t\t\t\t\t\tvar scrollpos = $(window).scrollTop();\n");
      out.write("\t\t\t\t\t\t\tif (scrollpos >= navoffeset) {\n");
      out.write("\t\t\t\t\t\t\t\t$(\".header-main\").addClass(\"fixed\");\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t$(\".header-main\").removeClass(\"fixed\");\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!-- /script-for sticky-nav -->\n");
      out.write("\t\t\t\t<!--inner block start here-->\n");
      out.write("\t\t\t\t<div style=\"width: 100%; height: 500px; position: relative;\">\n");
      out.write("\t\t\t\t\t<section id=\"wrapper\" style=\"align: center; margin: 350px;\">\n");
      out.write("\t\t\t\t\t\t<div id=\"main_search\">\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"search_space\"> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"submit\" class=\"solid\" value=\"Search\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--main-->\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t<!--wrapper-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--inner block end here-->\n");
      out.write("\t\t\t\t<!--copy rights start here-->\n");
      out.write("\t\t\t\t<div class=\"copyrights\">\n");
      out.write("\t\t\t\t\t<p>© 2017 Tiramisu. | 부산대학교 자연대연구실험동 301호</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<b>김태정 변다영 이성민 이형건 </b>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--COPY rights end here-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"left-frame\"></div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!--scrolling js-->\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\n");
      out.write("\t<!--//scrolling js-->\n");
      out.write("\t<script src=\"js/bootstrap.js\">\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\t<!-- mother grid end here-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
