package connectivity.ws.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import connectivity.db.operations.DBCBConnect;
import flow.IProjectVariables;

public class IVRDataClass {
	public void ivRdataMethod(SCESession mysession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Call history data method Start", mysession);
		IVariableField flowName = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_FLOW_NAME);
		IVariableField ucidNo = mysession.getVariableField(IProjectVariables.SESSION,
				IProjectVariables.SESSION_FIELD_UCID);
		IVariableField sessionId = mysession.getVariableField(IProjectVariables.SESSION,
				IProjectVariables.SESSION_FIELD_SESSIONID);
		IVariableField dnisNo = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_DNIS);
		IVariableField clidNo = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_CLID);
		IVariableField startDate = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_START_DATE);
		IVariableField endDate = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_END_DATE);
		IVariableField duration = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_DURATION);
		IVariableField exitLocation = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_EXIT_LOCATION);
		IVariableField endReason = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_END_REASON);
		IVariableField app_Ip = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_APP_IP);
		DBCBConnect datasource = new DBCBConnect();
		BasicDataSource dbConnect = datasource.DBConnect(mysession);
		Connection connection;
		try {
			connection = dbConnect.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into KLIBRARY_CALL_HISTORY(FLOW_NAME,UCID_NUMBER,SESSION_ID,DNIS_NUMBER,CLID_NUMBER,STARTING_DATE,ENDING_DATE,DURATION,EXIT_LOCATION,EXIT_REASON,APP_IP) values(?,?,?,?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1, flowName.toString());
			prepareStatement.setString(2, ucidNo.toString());
			prepareStatement.setString(3, sessionId.toString());
			prepareStatement.setString(4, dnisNo.toString());
			prepareStatement.setString(5, clidNo.toString());
			prepareStatement.setString(6, startDate.toString());
			prepareStatement.setString(7, endDate.toString());
			prepareStatement.setString(8, duration.toString());
			prepareStatement.setString(9, exitLocation.toString());
			prepareStatement.setString(10, endReason.toString());
			prepareStatement.setString(11, app_Ip.toString());
			boolean execute = prepareStatement.execute();
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Call history Created"+execute, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "1.Flow Name : "+flowName, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO," 2.UCID NO : "+ucidNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "3.sessionId : "+sessionId, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "4.DNIS NO : "+dnisNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "5.CLID NO : "+clidNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "6.StartingDate : "+startDate.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "7.End Date : "+endDate.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "8.Duration : "+duration.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "9.Exit Location : "+exitLocation.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "10.Exit Reason : "+endReason, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "11.appIP : "+app_Ip.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Call history data method Exit", mysession);

		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,e.getMessage(), mysession);

		}


		
	}
}
