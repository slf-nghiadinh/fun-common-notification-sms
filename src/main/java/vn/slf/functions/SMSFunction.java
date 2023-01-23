package vn.slf.functions;

import com.slf.core.services.repositories.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.slf.models.SMSRequest;
import vn.slf.models.SMSResponse;

import java.util.function.Function;
import java.util.logging.Logger;

@Component
public class SMSFunction implements Function<SMSRequest, SMSResponse> {

    private static final Logger LOG = Logger.getLogger(String.valueOf(SMSFunction.class));
    @Autowired
    DummyRepository dummyService;

    @Override
    public SMSResponse apply(SMSRequest request) {
        SMSResponse response = new SMSResponse();
        response.setResult(dummyService.get());

        LOG.info("[INFO] " + response.getResult());

        return response;
    }
}
