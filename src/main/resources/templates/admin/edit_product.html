<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org"
	th:replace="~{base::layout(~{::section})}">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section>
		<div class="container p-5 mt-3">
			<div class="row">
				<div class="col-md-8 offset-md-2">
					<div class="card card-sh">
						<div class="card-header text-center ">
							<p class="fs-4">Edit Product</p>

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
							<form action="/admin/updateProduct" method="post"
								enctype="multipart/form-data">
								<input type="hidden" name="id" th:value="${product.id}">
								<div class="mb-3">
									<label>Enter Title</label> <input type="text" name="title"
										th:value="${product.title}" class="form-control">
								</div>

								<div class="mb-3">
									<label>Enter Description</label>
									<textarea rows="3" cols="" class="form-control"
										name="description">[[${product.description}]]</textarea>
								</div>
								<div class="row">
									<div class="mb-3 col">
										<label>Category</label> <select class="form-control"
											name="category">
											<option>[[${product.category}]]</option>
											<option th:each="c:${categories}">[[${c.name}]]</option>
										</select>
									</div>
									<div class="mb-3 col">
										<label>Enter Price</label> <input type="number" name="price"
											th:value="${product.price}" class="form-control">
									</div>
								</div>

								<div class="row">
									<div class="mb-3 col">
										<label>Discount</label> <input type="number" name="discount"
											th:value="${product.discount}" class="form-control">
									</div>
									<div class="mb-3 col">
										<label>Discount Price</label> <input type="number" readonly
											th:value="${product.discountPrice}" class="form-control">
									</div>
								</div>

								<div class="mb-3">
									<label>Status</label>

									<div class="form-check">
										<input class="form-check-input" type="radio" th:checked="${product.isActive==true}"
											value="true" name="isActive" id="flexRadioDefault1">
										<label class="form-check-label" for="flexRadioDefault1">
											Active </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="isActive" th:checked="${product.isActive==false}"
											value="false" id="flexRadioDefault2"> <label
											class="form-check-label" for="flexRadioDefault2">
											Inactive </label>
									</div>

								</div>

								<div class="row">

									<div class="mb-3 col">
										<label>Enter Stock</label> <input type="text" name="stock"
											th:value="${product.stock}" class="form-control">
									</div>

									<div class="mb-3 col">
										<label>Upload Image</label> <input type="file" name="file"
											class="form-control">
									</div>

									<div class="mt-1">
										<img th:src="@{'/img/product_img/'+${product.image}}"
											width="100px" height="100px">
									</div>

								</div>
								<button class="btn btn-primary col-md-12">Update</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>