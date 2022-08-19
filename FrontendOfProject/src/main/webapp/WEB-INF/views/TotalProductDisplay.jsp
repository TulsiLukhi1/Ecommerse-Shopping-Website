
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<br>
<br>
<form action="<c:url value="/addToCart/${product/productId }" /> ">
	<table class="table-bordered">



		<tr>
			<td rowspan="8"><img
				src="<c:url value="/resources/images/image/${product.productId }.jpg " /> "
				height="300" alt="Generic placeholder thumbnail"></td>


			<td>Product Id</td>
			<td>${product.productId }</td>

			<td>Product Name</td>
			<td>${product.productName }</td>

			<td>Price</td>
			<td>${product.price }</td>

			<td>Stock</td>
			<td>${product.stock }</td>

			<td>Supplier Id</td>
			<td>${product.supplierId }</td>

			<td>Description</td>
			<td>${product.categoryDesc }</td>
			
		</tr>
		
		
		<tr>
			<td>Quantity <select name="quantity">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
			</select>
			</td>
			<td><input type="submit" value="BUY" class="btn btn-success"></td>
		</tr>



	</table>
</form>