/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-20 06:24:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginAndSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('	');

		response.setCharacterEncoding("EUC-KR");
	
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Tiramisu Login &amp; Sign Up</title>\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"loginSignup/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"loginSignup/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"loginSignup/css/form-elements.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"loginSignup/css/style.css\">\r\n");
      out.write("<!-- Favicon and touch icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"loginSignup/ico/favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\"\r\n");
      out.write("\thref=\"loginSignup/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"loginSignup/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"loginSignup/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\r\n");
      out.write("\thref=\"loginSignup/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"loginSignup/img/backgrounds/brown.png\">\r\n");
      out.write("\t<!-- Top content -->\r\n");
      out.write("\t<div class=\"top-content\">\r\n");
      out.write("\t\t<div class=\"inner-bg\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-8 col-sm-offset-2 text\">\r\n");
      out.write("\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Tiramisu</strong> Login &amp; Sign Up\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"description\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t티라미슈는 당신의 협업을 돕는 <strong>클라우드 메신저 </strong> 입니다.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>티라미슈를 통해 혁명적인 토론과 회의, 모임을 경험해보세요!</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-top-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>이메일과 비밀번호를 입력해주세요</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-top-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form role=\"form\" action=\"MemberController?action=login\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmethod=\"post\" class=\"login-form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"loginMemberId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Your email...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-username form-control\" id=\"form-username\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"loginMemberPw\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Password...\" class=\"form-password form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"form-password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn\">로그인!</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social-login\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>아이디나 비밀번호가 생각나지 않나요?</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social-login-buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-link-2\" href=\"#\">아이디 찾기</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link-2\" href=\"#\"> 비밀번호 찾기</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-1 middle-border\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-1\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- 회원가입 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-top-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Sign up now</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>티라미슈와 함께 해주세요</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-top-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-pencil\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form role=\"form\" action=\"MemberController?action=signUp\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"registration-form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"loginMemberId\" placeholder=\"email...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-first-name form-control\" id=\"form-first-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"loginMemberPw\" placeholder=\"password...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-last-name form-control\" id=\"form-last-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"loginMemberPwV\" placeholder=\"password...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-last-name form-control\" id=\"form-last-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"loginNickname\" placeholder=\"nickname...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-email form-control\" id=\"form-email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"loginQuestion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"default\" selected>원하는 질문을 선택하세요</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"나의 좌우명은?\">나의 좌우명은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"가장 기억에 남는 장소는?\">가장 기억에 남는 장소는?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"나의 보물 제1호는?\">나의 보물 제1호는?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"본인의 출생지는?\">본인의 출생지는?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"우리집 애완동물의 이름은?\">우리집 애완동물의 이름은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"나의 노래방 애창곡은?\">나의 노래방 애창곡은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"좋아하는 스포츠 팀 이름은?\">좋아하는 스포츠 팀 이름은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"나의 출신 초등학교는?\">나의 출신 초등학교는?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"인상 깊게 읽은 책 이름은?\">인상 깊게 읽은 책 이름은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"가장 생각나는 친구 이름은?\">가장 생각나는 친구 이름은?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"loginAnswer\" placeholder=\"answer...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-email form-control\" id=\"form-email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn\">회원가입!</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-border\"></div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t 2017 Tiramisu. | <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"http://www.dbguide.net/academy.db?cmd=intro1\"\r\n");
      out.write("\t\t\t\t\t\t\ttarget=\"_blank\"><strong>Bigdata Edu. Project</strong></a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-smile-o\"></i> 김태정 변다영 이성민 이형건 <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-smile-o\"></i>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- Javascript -->\r\n");
      out.write("\t<script src=\"loginSignup/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"loginSignup/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"loginSignup/js/jquery.backstretch.min.js\"></script>\r\n");
      out.write("\t<script src=\"loginSignup/js/scripts.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
