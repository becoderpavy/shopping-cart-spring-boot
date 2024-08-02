<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org"
	th:replace="~{base::layout(~{::section})}">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section>
		<div class="container-fluid mt-5 p-5">

			<div class="card card-sh">
				<div class="card-header text-center">
					<p class="fs-4" th:if="${userType==1}">Users</p>
					<p class="fs-4" th:if="${userType==2}">Admin</p>
					<th:block th:if="${session.succMsg}">
						<p class="text-success fw-bold">[[${session.succMsg}]]</p>
						<th:block th:text="${@commnServiceImpl.removeSessionMessage()}"></th:block>
					</th:block>

					<th:block th:if="${session.errorMsg}">
						<p class="text-danger fw-bold">[[${session.errorMsg}]]</p>
						<th:block th:text="${@commnServiceImpl.removeSessionMessage()}"></th:block>
					</th:block>
				</div>
				<div class="card-body">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Sl No</th>
								<th scope="col">Profile</th>
								<th scope="col">Name</th>
								<th scope="col">Email</th>
								<th scope="col">Mobile No</th>
								<th scope="col">Address</th>
								<th scope="col">Status</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<tr th:each="u,c:${users}">
								<th scope="row">[[${c.count}]]</th>
								<td><img th:src="@{'/img/profile_img/'+${u.profileImage}}"
									width="70px" height="70px"></td>
								<td>[[${u.name}]]</td>
								<td>[[${u.email}]]</td>
								<td>[[${u.mobileNumber}]]</td>
								<td>[[${u.address+','+u.city+','+u.state+','+u.pincode}]]</td>
								<td>[[${u.isEnable}]]</td>
								<td><a th:href="@{'/admin/updateSts?status=true&id='+${u.id}}+'&type='+${userType}"
									class="btn btn-sm btn-primary">Active</a> 
										
									<a
									th:href="@{'/admin/updateSts?status=false&id='+${u.id}}+'&type='+${userType}"
									class="btn btn-sm btn-danger">
										Inactive</a></td>
							</tr>

						</tbody>
					</table>
				</div>
			</div>
		</div>

	</section>
</body>
</html>