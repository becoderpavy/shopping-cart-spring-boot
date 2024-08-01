<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org"
	th:replace="~{base::layout(~{::section})}">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section>
		<div class="container-fluid mt-4 p-3">
			<div class="row">
				<p class="text-center fs-3 mt-2">All Products</p>
				<hr>
				<a href="/admin/" class="text-decoration-none"><i
					class="fa-solid fa-arrow-left"></i> Back</a>
				<th:block th:if="${session.succMsg}">
					<p class="text-success fw-bold">[[${session.succMsg}]]</p>
					<th:block th:text="${@commnServiceImpl.removeSessionMessage()}"></th:block>
				</th:block>

				<th:block th:if="${session.errorMsg}">
					<p class="text-danger fw-bold">[[${session.errorMsg}]]</p>
					<th:block th:text="${@commnServiceImpl.removeSessionMessage()}"></th:block>
				</th:block>

				<th:block th:if="${session.errorMsg}">
					<p class="text-danger fw-bold text-center">[[${session.errorMsg}]]</p>
					<th:block th:text="${@commnServiceImpl.removeSessionMessage()}"></th:block>
				</th:block>
				<div class="col-md-4 p-3">

					<form action="/admin/products" method="get">
						<div class="row">
							<div class="col">
								<input type="text" class="form-control " name="ch">
							</div>
							<div class="col">
								<button class="btn btn-primary col">Search</button>
							</div>
						</div>
					</form>

				</div>


				<!-- <div class="card card-sh">-->
				<div class="p-3">
					<table class="table table-bordered">
						<thead class="table-light ">
							<tr>
								<th scope="col">Sl No</th>
								<th scope="col">Image</th>
								<th scope="col">Title</th>
								<th scope="col">Category</th>
								<th scope="col">Price</th>
								<th scope="col">Discount</th>
								<th scope="col">Discount Price</th>
								<th scope="col">Status</th>
								<th scope="col">Stock</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<tr th:each="p,c:${products}">
								<th scope="row">[[${c.count}]]</th>
								<td><img th:src="@{'/img/product_img/'+${p.image}}"
									width="70px" height="70px"></td>
								<td>[[${p.title}]]</td>
								<td>[[${p.category}]]</td>
								<td>[[${p.price}]]</td>
								<td>[[${p.discount}]]</td>
								<td>[[${p.discountPrice}]]</td>
								<td>[[${p.isActive}]]</td>
								<td>[[${p.stock}]]</td>
								<td><a th:href="@{'/admin/editProduct/'+${p.id}}"
									class="btn btn-sm btn-primary"><i
										class="fa-solid fa-pen-to-square"></i>Edit</a> <a
									th:href="@{'/admin/deleteProduct/'+${p.id}}"
									class="btn btn-sm btn-danger"><i class="fa-solid fa-trash"></i>
										Delete</a></td>
							</tr>

						</tbody>
					</table>

					<div class="row">
						<div class="col-md-4">Total Product : [[${totalElements}]]</div>
						<div class="col-md-6">

							<nav aria-label="Page navigation example">
								<ul class="pagination">
									<li class="page-item"
										th:classappend="${isFirst} ? 'disabled':''"><a
										class="page-link"
										th:href="@{'/admin/products?pageNo='+${pageNo-1}}"
										aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									</a></li>

									<li th:each="i:${#numbers.sequence(1,totalPages)}"
										class="page-item" th:classappend="${pageNo+1==i}?'active':''"
										]]><a class="page-link"
										th:href="@{'/admin/products?pageNo='+${i-1}}">[[${i}]]</a></li>

									<li class="page-item"
										th:classappend="${isLast} ? 'disabled':''"><a
										class="page-link"
										th:href="@{'/admin/products?pageNo='+${pageNo+1}}"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- 	</div> -->
	</section>
</body>
</html>