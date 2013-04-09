
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ArtistLoadUtil {
	public static final String FETCH_BASE_URL = "https://itunes.apple.com/search?limit=200&entity=song&media=music&term=";
	public static class Wrapper extends JSONObject {
		public Wrapper() {
			super();
		}
		public Wrapper(JSONObject jo, String[] names) {
			super(jo, names);
		}
		public Wrapper(JSONTokener x) throws JSONException {
			super(x);
		}
		public Wrapper(Map map) {
			super(map);
		}
		public Wrapper(Object object, String[] names) {
			super(object, names);
		}
		public Wrapper(Object bean) {
			super(bean);
		}
		public Wrapper(String baseName, Locale locale) throws JSONException {
			super(baseName, locale);
		}
		public Wrapper(String source) throws JSONException {
			super(source);
		}
	}
	public static class Track extends Wrapper {
		public Track() {
			super();
		}
		public Track(JSONObject jo, String[] names) {
			super(jo, names);
		}
		public Track(JSONTokener x) throws JSONException {
			super(x);
		}
		public Track(Map map) {
			super(map);
		}
		public Track(Object object, String[] names) {
			super(object, names);
		}
		public Track(Object bean) {
			super(bean);
		}
		public Track(String baseName, Locale locale) throws JSONException {
			super(baseName, locale);
		}
		public Track(String source) throws JSONException {
			super(source);
		}
	}
