package kid;

import java.util.ArrayList;

	/**
	 * 
	 * @author yari_uygur
	 * 
	 */
	public class Repository {
		/**
		 * 
		 */
		private static ArrayList<SalesData> salesDataList = new ArrayList<SalesData>();

		/**
		 * 
		 * @param departmentId
		 * @return
		 */
		public static SalesData getSalesData(int departmentId) {
			salesDataList = generateSalesData();
			
			
			return null;
		}

		/**
		 * 
		 * @param departmentName
		 * @return
		 */
		public static SalesData getSalesData(String departmentName) {
			
			
			return null;

		}

		/**
		 * 
		 * @return
		 */
		private static ArrayList<SalesData> generateSalesData() {
			ArrayList<SalesData> salesDataList = new ArrayList<SalesData>();
			/**
			 * generate your Sales data and return
			 */
			return salesDataList;

		}
	}


