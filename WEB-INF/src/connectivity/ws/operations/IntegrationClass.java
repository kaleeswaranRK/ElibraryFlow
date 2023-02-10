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
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;

public class IntegrationClass {
	int CONNECTION_TIMEOUT_MS = 10 * 1000;
	RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS)
			.setConnectTimeout(CONNECTION_TIMEOUT_MS).setSocketTimeout(CONNECTION_TIMEOUT_MS).build();
	CloseableHttpClient httpClient = HttpClientBuilder.create().build();

	public List<JSONObject> apiGet(String url) {
		try {
			JSONObject jsonobj=null;
			HttpGet Request = new HttpGet(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			CloseableHttpResponse response = httpClient.execute(Request);

			if (response.getStatusLine().getStatusCode() != 200) {
				return null;
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
				String output = br.readLine();
				System.out.println("Output from Server .... \n");
				if (output != null) {
					System.out.println(output);
					jsonobj = new JSONObject(output);
					if (jsonobj.get("status").toString().equalsIgnoreCase("200")) {
						jsonobj = new JSONObject(jsonobj.get("data").toString());
						JSONArray result = (JSONArray) jsonobj.get("Result");
						List<JSONObject> list=new ArrayList();
						if (result != null ) {
							for (int i = 0; i < result.length(); i++) {
								JSONObject object = (JSONObject)result.get(i);
								list.add(object);
							}
							return list;
						} else {
							return null;
						}
					} else {
						return null;
					}
				}
			}

		}

		catch (ClientProtocolException e) {

			System.out.println(e);

		} catch (IOException e) {

			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}
	public String apiGetPassword(String url) {
		try {
			JSONObject jsonobj=null;
			HttpGet Request = new HttpGet(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			CloseableHttpResponse response = httpClient.execute(Request);

			if (response.getStatusLine().getStatusCode() != 200) {
				return null;
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
							return password;
						} else {
							return null;
						}
					} else {
						return null;
					}
				}
			}

		}

		catch (ClientProtocolException e) {

			System.out.println(e);

		} catch (IOException e) {

			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public String apiPost(String url, String js) {
		try {
			JSONObject jsonobj=null;
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost Request = new HttpPost(url);
			Request.setHeader("Accept", "application/json");
			Request.setHeader("Content-type", "application/json");
			StringEntity stringEntity = new StringEntity(js);
			Request.setEntity(stringEntity);
			CloseableHttpResponse response = httpClient.execute(Request);
			if (response.getStatusLine().getStatusCode() != 200) {
				return null;
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
						return Result;
					} else {
						return null;
					}
				} else {
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

			System.out.println(e);

		} catch (IOException e) {

			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		}
		return null;

	}
}
