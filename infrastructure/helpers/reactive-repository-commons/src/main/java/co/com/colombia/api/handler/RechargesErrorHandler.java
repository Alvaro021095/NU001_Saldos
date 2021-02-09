package co.com.colombia.api.handler;

import co.com.colombia.api.helpersutil.CommonRecharges;
import co.com.colombia.api.helpersutil.HelpersUtil;
import co.com.colombia.api.model.prueba.commons.Header;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.logging.Logger;

@Component
@Order(-2)
public class RechargesErrorHandler extends AbstractErrorWebExceptionHandler {

    private final static Logger LOGGER = Logger.getLogger(RechargesErrorHandler.class.getName());

    public RechargesErrorHandler(ErrorAttributes errorAttributes, ResourceProperties resourceProperties,
                                 ApplicationContext applicationContext, ServerCodecConfigurer codecConfigurer) {
        super(errorAttributes, resourceProperties, applicationContext);
        this.setMessageWriters(codecConfigurer.getWriters());

    }

    @Override
    protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {
        return RouterFunctions.route(RequestPredicates.all(), this::getResponseError);

    }

    public Mono<ServerResponse> getResponseError(ServerRequest serverRequest) {
        HelpersUtil helpersUtil = new HelpersUtil();

        Header header = Header.builder().build();

        try {
            header = (Header) CommonRecharges.buildHeader(serverRequest, Header.class);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            LOGGER.info("Error al tratar de construir los headers - " + getClass().getName());
        }
        Map<String, String> errorMessage = helpersUtil.getErrorMessage(header.getTransactionTracker(), getError(serverRequest));

        if (errorMessage.isEmpty()) {
            Map<String, Object> errorPropertie = getErrorAttributes(serverRequest, true);
            String stat = String.valueOf(errorPropertie.get(HelpersUtil.STATUS));
            String detail = String.valueOf(errorPropertie.get(HelpersUtil.DETAIL));
            errorMessage.put(HelpersUtil.STATUS, stat);
            errorMessage.put(HelpersUtil.DETAIL, detail);
            Header finalHeader = header;
            return helpersUtil.responseError(errorMessage, header);
        }

        Header finalHeader = header;
        return helpersUtil.responseError(errorMessage, header);


    }

}