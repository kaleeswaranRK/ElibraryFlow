package connectivity.ws.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import flow.newUserAnnounce;

public class IntegrationClass {
	int CONNECTION_TIMEOUT_MS = 10 * 1000;
	RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS)
			.setConnectTimeout(CONNECTION_TIMEOUT_MS).setSocketTimeout(CONNECTION_TIMEOUT_MS).build();
	CloseableHttpClient httpClient = HttpClientBuilder.create().build();

	public List<JSONObject> apiGet(String url,SCESession mySession) {
		List<JSONObject> list=new ArrayList();
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Entry", mySession);
			JSONObject jsonobj=null;
			HttpGet Request = new HttpGet(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			CloseableHttpResponse response = httpClient.execute(Request);

			if (response.getStatusLine().getStatusCode() != 200) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "BAD REQUEST", mySession);
				return list;
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
				String output = br.readLine();
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Output server", mySession);

				if (output != null) {
					System.out.println(output);
					jsonobj = new JSONObject(output);
					if (jsonobj.get("status").toString().equalsIgnoreCase("200")) {
						jsonobj = new JSONObject(jsonobj.get("data").toString());
						JSONArray result = (JSONArray) jsonobj.get("Result");
						
						if (result != null ) {
							for (int i = 0; i < result.length(); i++) {
								JSONObject object = (JSONObject)result.get(i);
								list.add(object);
							}
							TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);
							return list;
						} else {
							TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);

							return null;
						}
					} else {
						TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);

						return null;
					}
				}
			}

		}

		catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GET method Exit", mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		}
		return list;

	}
	public String apiGetPassword(String url,SCESession mySession) {
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "API GETPASSWORD method Entry", mySession);

			JSONObject jsonobj=null;
			HttpGet Request = new HttpGet(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			CloseableHttpResponse response = httpClient.execute(Request);

			if (response.getStatusLine().getStatusCode() != 200) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "BAD REQUEST", mySession);
				return "BADREQUEST";
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
				String output = br.readLine();
				System.out.println("Output from Server .... \n");
				if (output != null) {
					System.out.println(output);
					jsonobj = new JSONObject(output);
					if (jsonobj.get("status").toString().equalsIgnoreCase("200")) {
						jsonobj = new JSONObject(jsonobj.get("data").toString());
						String password = jsonobj.get("Result").toString();
						if (password != null ) {
							TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);

							return password;
						} else {
							TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);

							return null;
						}
					} else {
						TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);
						return null;
					}
				}
			}

		}

		catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API GETPASSWORD method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		}
		return "APIERROR";

	}

	public String apiPost(String url, String js,SCESession mySession) {
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Entry", mySession);

			JSONObject jsonobj=null;
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost Request = new HttpPost(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			StringEntity stringEntity = new StringEntity(js);
			Request.setEntity(stringEntity);
			CloseableHttpResponse response = httpClient.execute(Request);
			if (response.getStatusLine().getStatusCode() != 200) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "BAD REQUEST", mySession);
				return "BADREQUEST";
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
				String output = br.readLine();
				System.out.println("Output from Server .... \n");
				if (output != null) {
					System.out.println(output);
					jsonobj = new JSONObject(output);
				if (jsonobj.get("status").toString().equalsIgnoreCase("200")) {
					jsonobj = new JSONObject(jsonobj.get("data").toString());
					String Result = jsonobj.get("Result").toString();
					if (Result != null ) {
						TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

						return Result;
					} else {
						TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

						return null;
					}
				} else {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

					return null;
				}
			}
		}


//			JSONObject parse = (JSONObject) parser.parse(jsonobj.get("data").toString());
//			System.out.println(parse.get("cartItems").toString());
//			JSONArray cart = (JSONArray) parser.parse(parse.get("cartItems").toString());
//			System.out.println(cart.get(1));
//			JSONObject book = (JSONObject) parser.parse(cart.get(1).toString());
//			System.out.println(book.get("book").toString());
//			BookCart obj = new ObjectMapper().readValue(book.toString(), BookCart.class);
//			System.out.println(obj.toString());

		}

		catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);

		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);

		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API POST method Exit", mySession);

			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		}
		return "APIERROR";

	}
}
