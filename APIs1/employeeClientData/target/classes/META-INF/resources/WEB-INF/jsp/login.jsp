</html>
  <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up Form</title>
        <style>
            body {
    font-family: 'Nunito', sans-serif;
    color: #384047;
    text-align: center;
  }

  form {
    max-width: 300px;
    margin: 10px auto;
    padding: 10px 20px;
    background: #f4f7f8;
    border-radius: 8px;
  }

  h1 {
    margin: 0 0 30px 0;
    text-align: center;
  }
  input[type="radio"],
  input[type="checkbox"] {
    margin: 0 4px 8px 0;
  }

  select {
    padding: 6px;
    height: 32px;
    border-radius: 2px;
  }

  fieldset {
    margin-bottom: 30px;
    border: none;
  }


  label {
    display: block;
    margin-bottom: 8px;
  }


  form {
    max-width: 480px;
  }
        </style>


    </head>
    <body>

      <form  action  method="post">

        <h1>Employee Appraisal Form</h1>

          <label for="employeeId">Employee Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
          <input type="text" id="employeeId" name="employeeId"></label>

          <label for="employeeName">Employee Name&nbsp;&nbsp;&nbsp;:
          <input type="text" id="employeeName" name="employeeName"></label>

          <label for="salary">Salary&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
          <input type="number" id="salary" name="salary"></label>

          <label for="experience">Experience
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :


          <input type="number" id="experience" name="experience"></label>



           <input type="submit" value="Submit">


      </form>


    </body>
</html>