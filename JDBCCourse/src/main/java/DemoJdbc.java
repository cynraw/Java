import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) {
        /*
        * Import package
        * Load driver
        * Register driver
        * Create connection
        * Execute statement
        * close connection
        */
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String userName = "root";
        String password = "jmaranga-2010";

        int sID = 101;
        String sName = "Uongo";
        int marks = 67;
        String query = "INSERT INTO students VALUES (?, ?, ?)";

        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, sID);
            pstmt.setString(2, sName);
            pstmt.setInt(3, marks);

            pstmt.execute();

//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//
//            while(rs.next()){
//                int id = rs.getInt("sID");
//                String name = rs.getString("sName");
//                int marks = rs.getInt("sMarks");
//
//                System.out.println("Student number " + id + " is " + name + " and had a total of " + marks + " marks.");
//            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!" + e.getMessage());
        }

    }
}
