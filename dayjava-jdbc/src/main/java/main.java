import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class main {


    public static void select(){
        Connection connection = JDBCConnect.getJDBCConnection();

        ArrayList<HocSinh> hocSinhs = new ArrayList<>();

        try {
            Statement statement =connection.createStatement();
            String sql =  "select * from hocsinh where dob > 2002";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String fullName = rs.getString("fullname");
                int dob = rs.getInt("dob");
                HocSinh hocSinh = new HocSinh(id,fullName,dob);
                hocSinhs.add(hocSinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        hocSinhs.forEach(hocSinh ->{
            System.out.println(hocSinh.toString());
        });


    }

    public static void insert(String fullname, int dob){
        Connection connection = JDBCConnect.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into hocsinh(fullname,dob) values('"+ fullname + "',"+dob+")";
            statement.executeUpdate(sql);

            System.out.println("them moi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void update(int id,String fullname, int dob){
        Connection connection = JDBCConnect.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "update hocsinh set fullname = '"+fullname + "', dob = "+ dob+ " where id = "+id;
            statement.executeUpdate(sql);

            System.out.println("sua thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void delete(int id){
        Connection connection = JDBCConnect.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "delete from hocsinh where id="+id;
            statement.executeUpdate(sql);

            System.out.println("xoa thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        select();
//        insert("nguyen huu hung",2001);
//        update(1,"nguyen gia truong", 2006);
        delete(12);
    }

}
