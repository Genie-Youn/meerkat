<!DOCTYPE html>
<%@page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <meta charset="utf-8">
    <title>meerkat</title>
    <script src="resources/js/jquery-1.11.3.min.js"></script>
    <script src="resources/js/bootstrap.js"></script>
    <script src="resources/js/meerkat.js"></script>
    <link href="resources/css/bootstrap.css" rel="stylesheet">
</head>

<body>
    <!-- nav -->
    <nav class="navbar navbar-inverse">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active" id="btn-join"><a href="#">사용자추가</a></li>
            </ul>
        </div>
    </nav>
    <!-- joinModal -->
    <div class="modal fade" id="modal-join" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">사용자추가</h4>
                </div>
                <div class="modal-body">
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">사번</span>
                        <input type="text" class="form-control" id="input-userId" placeholder="User_Ids" aria-describedby="basic-addon1">
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">이름</span>
                        <input type="text" class="form-control" id="input-name" placeholder="name" aria-describedby="basic-addon1">
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">전화번호</span>
                        <input type="text" class="form-control" id="input-phoneNumber" placeholder="phoneNumber" aria-describedby="basic-addon1">
                    </div>
                    <br>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                    <button type="button" class="btn btn-primary" id="btn-join-submit">등록</button>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
    <!-- /.modal -->
</body>

</html>