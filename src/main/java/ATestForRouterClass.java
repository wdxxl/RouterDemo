import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.wdxxl.common.ICommonService;
import com.wdxxl.common.PPConstants;
import com.wdxxl.common.ServiceCategory;
import com.wdxxl.common.impl.ILogServiceImpl;
import com.wdxxl.router.jauter.Routed;
import com.wdxxl.router.jauter.ppa.PPAction;
import com.wdxxl.router.jauter.ppa.PPMethod;
import com.wdxxl.router.jauter.ppa.PPRouter;

public class ATestForRouterClass {

	public static void main(String[] args) throws Exception {
		JsonParser parser = new JsonParser();
		String paramStr = "{\"url\": \"ftsSearch/init/123\",\"method\":\"GET\"}";
		JsonObject requestObject = parser.parse(paramStr).getAsJsonObject();
		String path = requestObject.get(PPConstants.HTTP_REQ_URL).getAsString();
		String method = requestObject.get(PPConstants.HTTP_REQ_METHOD).getAsString();
		PPMethod temp = PPMethod.valueOf(method.toUpperCase());

		PPRouter router = new PPRouter();
		router.createPPActionFactory();
		Routed routed = router.route(temp, path);
		PPAction action = (PPAction) routed.instanceFromTarget();

		Map<ServiceCategory, ICommonService> commonServices = new HashMap<>();
		commonServices.put(ServiceCategory.LOG_SERVICE, new ILogServiceImpl());
		System.out.println(
				action.Process(requestObject, "dataBaseName", new File("path"), "unZippedPath", routed.params(), commonServices));

	}

}
