import java.sql.*;

public class DB {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/dblibrary";
            con = DriverManager.getConnection(url,"root","root");
            stmt = con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    // insert, update, delete
    
    public void update(String qry) throws Exception
    {
        stmt.executeUpdate(qry);
    }
    public ResultSet execute(String qry) throws Exception
    {
        rs = stmt.executeQuery(qry);  //for taking the values from backend to frontend we use resultset(i.e. executeQuery)
        return rs;
    }
    
    
    
    public int generateId(String tableName, String colName) throws Exception
    {
        String qry="select ifnull(max("+colName+"),0)max from "+ tableName;
        rs = stmt.executeQuery(qry);
        rs.next();
        int n = rs.getInt("max");
        n++;
        return n;
    }

    boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
int a = 10;
sop("a") --> a
sop(a) -> 10
*/