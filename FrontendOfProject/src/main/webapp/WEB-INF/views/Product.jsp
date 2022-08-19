<%@include file="/WEB-INF/views/Header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<form:form action="InsertProduct" modelAttribute="product" method="post"
	enctype="multipart/form-data">
	<table align="center" class="table-bordered">
		<tr>
			<td colspan="2"><center>Product Info</center></td>
		</tr>

		<tr>
			<td>Product Name</td>
			<td><form:input path="productName" /></td>
		</tr>

		<tr>
			<td>Price</td>
			<td><form:input path="price" /></td>
		</tr>

		<tr>
			<td>Stock</td>
			<td><form:input path="stock" /></td>
		</tr>

		<tr>
			<td>Category</td>
			<td><form:select path="categoryId">
					<form:option value="0" lable="-----select list-----" />
					<form:options items="${categoryList}"/>
					
				</form:select></td>

		</tr>


		<tr>
			<td>Supplier</td>
			<td><form:input path="supplierId" /></td>
		</tr>

		<tr>
			<td>Product Description</td>
			<td><form:input path="productDesc" /></td>
		</tr>

		<tr>
			<td>Product Image</td>
			<td><form:input type="file" path="pimage" /></td>
		</tr>

		<tr>
			<td colspan="2"><center>
					<input type="submit" value="Insert Product" />
				</center></td>
		</tr>





	</table>

</form:form>


<table class="table-bordered">
	<tr>
		<td>Product Id</td>
		<td>Product Name</td>
		<td>Price</td>
		<td>Stock</td>
		<td>Supplier</td>
		<td>Operations</td>
	</tr>


	<c:forEach items="${productList }" var="product">
		<tr>
			<td>${product.productId }</td>
			<td>${product.productName }</td>
			<td>${product.price }</td>
			<td>${product.stock }</td>
			<td>${product.supplierId }</td>

			<td><a
				href="<c:url value="/editProduct/${product.productId }" />"
				class="btn ntn-success">EDIT</a> <a
				href="<c:url value="/deleteProduct/${product.productId }" />"
				class="btn ntn-danger">DELETE</a>
			</td>
		</tr>
	</c:forEach>

</table>





