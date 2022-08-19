<%@page language="java" contentType="text/html"%>
<%@include file="/WEB-INF/views/Header.jsp"%>
<form action="<c:uri value="/UpdateProduct" />" method="post">
	<table align="center" class="table">
		<tr>
			<td colspan="2"><h2>
					<center>Product</center>
				</h2></td>
		</tr>

		<tr>
			<td>Product Id</td>
			<td><input type="text" name="productId"
				value="${product.productId}" readonly /></td>
		</tr>

		<tr>
			<td>Product Name</td>
			<td><input type="text" name="productName"
				value="${product.productName}" /></td>
		</tr>

		<tr>
			<td>Price</td>
			<td><input type="text" name="price"
				value="${product.price}" /></td>
		</tr>
		
		<tr>
			<td>Stock</td>
			<td><input type="text" name="stock"
				value="${product.stock}" /></td>
		</tr>
		
		<tr>
			<td>Stock</td>
			<td><form:input path="stock" /></td>
		</tr>
		
		<tr>
			<td>Category</td>
			<td><select path="categoryId">
					<option value="0" lable="-----select list-----" />
					<options items="${categoryList}"/>
					
				</select></td>

		</tr>
		

		<tr>
			<td colspan="2"><center>
					<input type="submit" value="UPDATE CATEGORY" />
				</center></td>
		</tr>



	</table>
</form>

