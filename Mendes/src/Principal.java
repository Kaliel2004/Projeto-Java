import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		System.out.println(" Comecou");
		ConexaoDAO conn = new ConexaoDAO();

		
		try {
			
			System.out.println("Comecando");

			Scanner leia = new Scanner(System.in);
			Connection connection = conn.conectaBD();
			int codigo= 0;
			while (true) {
				System.out.println("1 - Cadastrar produto");
				System.out.println("2 - Consultar");
				System.out.println("3 - Atualizar");
				System.out.println("4 - Deletar");
				System.out.println("0 - Finalizar");
				int opc = leia.nextInt();
				switch (opc) {
				case 1:
					Produto pro = new Produto();
					System.out.println("Digite o preco");
					String preco = leia.next();
					pro.setPreco(preco);
					System.out.println("Digite a cor");
					String cor = leia.next();
					pro.setCor(cor);
					System.out.println("Digite o modelo");
					String modelo = leia.next();
					pro.setModelo(modelo);
//					System.out.println("A quantidade");
//					int qtd = leia.nextInt();
//					System.out.println("Digite o fabricante");
//					String fabricante = leia.next();
//					System.out.println("Digite a tensao");
//					int tensao = leia.nextInt();

					conn.insertProduto(connection, pro);
					break;
				case 2:
//					System.out.println("A quantidade");
//					int qtd = leia.nextInt();
//					System.out.println("Digite o fabricante");
//					String fabricante = leia.next();
//					System.out.println("Digite a tensao");
//					int tensao = leia.nextInt();
					break;
				case 3:
					//con.consutlarItem(connection);
					break;
				case 4:
					System.out.println("Qual coluna voce que modifica");
					String nomeColuna1 = leia.next();
					System.out.println("valor adicionar nessa coluna");
					String valor1 = leia.next();
					System.out.println("Qual codigo do produto");
					codigo = leia.nextInt();
					//conn.AtualizarItem(connection, nomeColuna1, valor1, codigo);
					break;
				case 5:
					System.out.println("Digite o codigo do produto");
					codigo = leia.nextInt();
					//con.DeletarItem(connection, codigo);
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Opcao n�o encontrada");
					break;

				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//conn.CriarEstruturaBanco(conn.conectaBD());
			//System.out.println(" terminou");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
//public void name() {
//	// create a sql date object so we can use it in our INSERT statement
//				Calendar calendar = Calendar.getInstance();
//				java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
//
//				// the mysql insert statement
//				String query = " insert into students (ID, last_name, first_name, birthday, hometown)"
//						+ " values (?, ?, ?, ?, ?)";
//
//				// create the mysql insert preparedstatement
//				PreparedStatement preparedStatement = conn.prepareStatement(query);
//				preparedStatement.setInt(1, 808028);
//				preparedStatement.setString(2, "Davis");
//				preparedStatement.setString(3, "Felicita");
//				preparedStatement.setDate(4, startDate);
//				preparedStatement.setString(5, "Venice");
//
//				// execute the preparedstatement
//				preparedStatement.execute();
//
//				conn.close();
//}

}
