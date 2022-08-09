package pac1;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Graph {

	static int value = 5;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc.oracle.thin:@localhost:xe","hr","hr");
		Statement state = connection.createStatement();
		ResultSet resultSet = state.executeQuery("select * from employees");
		
		Array array = resultSet.getArray(2);
		
		for (String string : args) {
			System.out.println(string);
		}
		
		
		
		
		
	
	}

	private static void binarySearch(int[] arr, int lowIndex, int highIndex) {

		int pivotIndex = (lowIndex + highIndex) / 2;

		if (arr[pivotIndex] < value) {
			binarySearch(arr, lowIndex, pivotIndex);

		} else if (arr[pivotIndex] > value) {
			binarySearch(arr, pivotIndex, highIndex);
		} else {
			if (arr[pivotIndex] == value) {
				System.out.println("found");
			} else {
				System.out.println("Not found");
			}

		}

	}

}
