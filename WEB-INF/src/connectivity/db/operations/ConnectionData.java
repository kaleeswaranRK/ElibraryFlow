package connectivity.db.operations;

public class ConnectionData {
//	public static HikariDataSource data;
//	public void DBConnectionPooling(SCESession mySession) {
//		
//		FileInputStream fout = null;
//		try {
//			fout = new FileInputStream(
//					new File("C:\\Users\\User\\Desktop\\Kaleeswaran\\property files\\prop.properties"));
//		Properties p = new Properties();
//		p.load(fout);
//		String connectionUrl = p.getProperty("connection");
//		String username = p.getProperty("username");
//		String password = p.getProperty("password");
//		System.out.println("property read");
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl(connectionUrl);
//		System.out.println("url set");
//		config.setUsername(username);
//		config.setPassword(password);
//		config.addDataSourceProperty("minimumIdle", "5");
//		config.addDataSourceProperty("maximumPoolSize", "25");
//		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "value before", mySession);
//		data = new HikariDataSource(config);
//		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "value set", mySession);
////		IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
////				IProjectVariables.E_LIBRARY_FIELD_PROPERTY_VARIABLE);
////		DBcon.setValue(data);
//		System.out.println("value set");
//		}
//		catch (IOException e) {
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
//		}
//		finally {
//			try {
//				fout.close();
//			} catch (IOException e) {
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
//			}
//		}
//	}
}
