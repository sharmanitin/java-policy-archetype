package ${packageName};
import com.wizni.reportaspot.model.pojo.*;

public class App implements JavaResource
{
	public ApplicationResponse execute(ApplicationRequest applicationRequest) {
		ApplicationResponse response = new ApplicationResponse();
		response.setBody(applicationRequest.getBody());
		return response;
	}
}
