<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>社区管理系统 | Log in</title>

    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="all-admin-index.html"><b>I-LING</b>社区管理系统</a>
    </div>
    <!-- /.login-logo -->
    <div class="register-box-body">
        <p class="login-box-msg">新用户注册</p>

        <form action="file/fileupload2" method="post" enctype="multipart/form-data">

            <div class="form-group has-feedback">
                选择证件照：<input type="file" name="upload" class="form-control" placeholder="请选择证件照">
                    <%--<input type="submit" value="上传">--%>
            </div>

            <div class="form-group has-feedback">
                <input type="email" class="form-control" placeholder="小区选择" readonly>
                <select class="form-control select2" style="width: 100%"
                        name="participant">
                    <option value="1" selected="selected">华府龙源居民区一</option>
                    <option value="2">华府龙源居民区二</option>
                    <option value="3">山水文园居民区一</option>
                    <option value="4">山水文园居民区二</option>
                    <option value="5">山水文园居民区三</option>
                    <option value="6">山水文园居民区四</option>
                    <option value="7">水印康桥居民区一</option>
                </select>
            </div>

            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 我同意 <a href="#">协议</a>
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">注册</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

<%--        <div class="social-auth-links text-center">--%>
<%--            <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-qq"></i> 腾讯QQ用户登录</a>--%>
<%--            <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i> 微信用户登录</a>--%>
<%--        </div>--%>

        <a href="all-admin-login.html" class="text-center">我有账号，现在就去登录</a>
    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function() {
        $('input').iCheck({
            checkboxClass : 'icheckbox_square-blue',
            radioClass : 'iradio_square-blue',
            increaseArea : '20%' // optional
        });
    });
</script>
</body>

</html>