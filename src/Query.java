public class Query {
    static String insert = "INSERT INTO employee(id,name,email,salary) VALUES (?,?,?,?)";
    static String  delete = "DELETE FROM employee where id =?";
    static String update = "UPDATE employee SET name = ? WHERE id = ?";
    static String select = "select * from employee";
    static String create = " create table employee(id int , name varchar(255), email varchar(255), salary int)";
    // static String
}
