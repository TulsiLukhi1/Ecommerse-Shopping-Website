<%@page language="java" contentType="text/html"%>
<%@include file="/WEB-INF/views/Header.jsp" %>

<form action="perform_login" method="post" style="padding-right:400px ;padding-left:400px ;padding-top:20px" >

  <!-- Email input -->
  <div style="padding-bottom:50px">
  <center><h1>Sign In</h1></center>
  </div>
  <div class="form-outline mb-4" style="padding-bottom:30px">
    <input type="text" id="form2Example1" class="form-control" name="username"/>
    <label class="form-label" for="form2Example1">User Name</label>
  </div>

  <!-- Password input -->
  <div class="form-outline mb-4" style="padding-bottom:30px">
    <input type="password" id="form2Example2" class="form-control" name="password" required />
    <label class="form-label" for="form2Example2">Password</label>
  </div>

  <!-- 2 column grid layout for inline styling -->
  <div class="row mb-4" style="padding-bottom:30px">
    <div class="col d-flex justify-content-center">
      <!-- Checkbox -->
      <div class="form-check">
        <input
          class="form-check-input"
          type="checkbox"
          value=""
          id="form2Example31"
          checked
        />
        <label class="form-check-label" for="form2Example31"> Remember me </label>
      </div>
    </div>

    <div class="col" style="padding-bottom:10px">
      <!-- Simple link -->
      <a href="#!">Forgot password?</a>
    </div>
  </div>

  <!-- Submit button -->
  <button type="submit" class="btn btn-primary btn-block mb-4" value="LOGIN">Sign in</button>

  <!-- Register buttons -->
  <div class="text-center" style="padding-top:10px">
    <p>Not yet Registered? <a href="register">Register</a></p>
    

   
  </div>
</form>
