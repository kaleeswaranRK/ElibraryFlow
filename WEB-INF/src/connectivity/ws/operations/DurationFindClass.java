package connectivity.ws.operations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class DurationFindClass {

	public long durationFind(SCESession mySession, String start_date, String end_date) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Duration Calculation", mySession);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			Date startDate = sdf.parse(start_date);
			Date endDate = sdf.parse(end_date);
			long difference_In_Time = endDate.getTime() - startDate.getTime();
			long difference_In_Seconds = (difference_In_Time / 1000) % 60;
			return difference_In_Seconds;
		} catch (ParseException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,e, mySession);
		}
		return 0;
	}

}
