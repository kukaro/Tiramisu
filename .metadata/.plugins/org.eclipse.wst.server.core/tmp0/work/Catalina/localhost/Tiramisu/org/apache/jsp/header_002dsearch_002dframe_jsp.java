/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-20 12:15:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_002dsearch_002dframe_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--header start here-->\r\n");
      out.write("<div class=\"header-main\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header-left\">\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"search-box\" style=\"border-color:#53270E\">\r\n");
      out.write("\t\t\t<form action=\"#검색처리\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"빅데이터\" required=\"\">\t\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"\">\t\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	if (session != null && session.getAttribute("memberId") != null) {
	
	
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"header-right\">\r\n");
      out.write("\t\t<div class=\"profile_details_left\">\r\n");
      out.write("\t\t\t<!--notifications of menu start -->\r\n");
      out.write("\t\t\t<ul class=\"nofitications-dropdown\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown head-dpdn\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fa fa-envelope\"></i><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"badge\">N</span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"notification_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>N개의 새로운 메시지가 왔습니다</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"user_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/basic_user.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>가츠동 먹을래?</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><b>이성민</b> | 07-17 09:45</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"odd\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"user_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/basic_user.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>부민캠퍼스에서 하시는...</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><b>이형건</b> | 07-17 09:45</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"user_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/basic_user.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>민트초코가 최고야</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><b>김태정</b> | 07-17 09:45</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"notification_bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">See all messages</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown head-dpdn\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fa fa-bell\"></i><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"badge blue\">N</span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"notification_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>N개의 새로운 알람이 왔습니다</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>새로운 투표가 등록되었습니다</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>07-17 09:45\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Bigdata프로젝트</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"odd\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>새로운 공지가 등록되었습니다</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>07-16 18:40\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>JAVA스터디</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>참여율 꼴등! 분발하세요!</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>07-16 11:12\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>보쌈부서</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"notification_bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">See all notifications</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--notification menu end -->\r\n");
      out.write("\t\t<div class=\"profile_details\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown profile_details_drop\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_img\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"prfil-img\"><img src=\"images/basic_user.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" style=\"width: 50px; height: 50px;\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>");
      out.print((String)session.getAttribute("nickname") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>");
      out.print((String)session.getAttribute("memberId") );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-down lnr\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-angle-up lnr\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"MemberController?action=logout\"><i class=\"fa fa-sign-out\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
} else {
	
      out.write("\r\n");
      out.write("\t<div class=\"header-right\" >\r\n");
      out.write("\t<form action=\"loginAndSignup.jsp\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Login & Sign Up\" class=\"iogin\" style=\"font-size:18px; padding:0px 50px 0px 50px; position:absolute; top:20px; right:20px;\">  \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--heder end here-->");
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
