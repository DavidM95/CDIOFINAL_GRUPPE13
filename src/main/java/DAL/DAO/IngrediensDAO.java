//package DAL.DAO;
//
//import DAL.DTO.IIngrediensDTO;
//import DAL.DTO.IngrediensDTO;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class IngrediensDAO implements IIngrediensDAO {
//
//    public void createIngrediens(Connection connection, IIngrediensDTO ingredientDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("INSERT into Ingrediens values(?,?,?,?);");
//
//            statement.setInt(1, ingredientDTO.getOpskriftID());
//            statement.setString(2, ingredientDTO.getIngrediensNavn());
//            statement.setInt(3, ingredientDTO.getIngrediensID());
//            statement.setInt(4, ingredientDTO.getMængde());
//
//            statement.execute();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public IIngrediensDTO getIngrediens(Connection connection, int ID) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Ingrediens WHERE IngrediensID = ?;");
//
//            statement.setInt(1, ID);
//
//            ResultSet resultSet = statement.executeQuery();
//
//            IIngrediensDTO ingrediensDTO = null;
//
//            while (resultSet.next()){
//                ingrediensDTO = new IngrediensDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(4), resultSet.getInt(3));
//            }
//
//            return ingrediensDTO;
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void updateIngrediens(Connection connection, IIngrediensDTO ingredientDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("UPDATE Ingrediens SET OpskriftID = ?, Ingrediensnavn = ?, IngrediensID = ?, Mængde = ? WHERE IngrediensID = ?;");
//
//            statement.setInt(1, ingredientDTO.getOpskriftID());
//            statement.setString(2, ingredientDTO.getIngrediensNavn());
//            statement.setInt(3, ingredientDTO.getIngrediensID());
//            statement.setInt(4, ingredientDTO.getMængde());
//            statement.setInt(5, ingredientDTO.getIngrediensID());
//
//            statement.executeUpdate();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteIngrediens(Connection connection, int ID) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("DELETE from Ingrediens WHERE IngrediensID  = ?;");
//
//            statement.setInt(1, ID);
//
//            statement.execute();
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//}
