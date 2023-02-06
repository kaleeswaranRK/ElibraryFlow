package connectivity.ws.operations;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class DateInsertionClass {
	public String dateEntry(SCESession mySession) {
		
		try {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
			String startingDate = dateFormat.format(date);
			return startingDate;
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}
		return null;
		
	}
}
