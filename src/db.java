

import java.sql.*;

public class db {
    Connection con = DbC.connect();
    Statement stm = con.createStatement();
   public  db() throws SQLException {
  }

    public void createt() throws Exception{
        DbC.connect();
        stm.execute(Query.create);
        stm.close();
    }
    public  void insert(int id, String nm, String eml, int slry) throws Exception{
        PreparedStatement itsm = con.prepareStatement(Query.insert);
       // Connection con = DbC.connect();
        //Statement stm = con.createStatement();
        itsm.setInt(1,id);
        itsm.setString(2,nm);
        itsm.setString(3,eml);
        itsm.setInt(4,slry);
        itsm.execute();
        //itsm.close();
        //con.close();

    }
    public void read() throws Exception{
       // Connection con = DbC.connect();
        //Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(Query.select);
        while (rs.next()){
            System.out.println("id = "+ rs.getInt(1));
            System.out.println("name = "+ rs.getString(2));
            System.out.println("email = "+ rs.getString(3));
            System.out.println("salary = "+ rs.getInt(4));
        }
       // con.close();
       // stm.close();
    }
    public void update(int id, String name) throws Exception{
        PreparedStatement ptsm = con.prepareStatement(Query.update);
        ptsm.setInt(2,id);
        ptsm.setString(1,name);
        ptsm.execute();
       // con.close();
        //ptsm.close();
    }
    public void delete(int id)throws Exception{
        PreparedStatement ptsm = con.prepareStatement(Query.delete);
        ptsm.setInt(1,id);

        ptsm.execute();
      //  con.close();
        //ptsm.close();
    }

}