package co.com.colombia.api.reactive.util;

import co.com.colombia.api.model.commons.Header;
import co.com.colombia.api.model.commons.HeaderName;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Util {

    /**
     * Construye un objeto Header y se valida que cumpla con las restricciones de los campos
     * @param request
     * @return
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static Header buildHeaders(ServerRequest request) {

        Header header = null;
        try {
            header = (Header) buildHeader(request,Header.class);
            return header;

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException |
                InstantiationException e) {
            return header;
        }

    }

    /**
     * Metodo para construir objeto Header
     * @param
     * @return
     */
    public static Object buildHeader(ServerRequest request, Class<?> spec) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        HttpHeaders httpHeaders;
        httpHeaders = request.headers().asHttpHeaders();
        //Crear un nuevo objeto del modelo de validación de cabecera (spec)
        Object object = spec.getDeclaredConstructor().newInstance();
        //recorrer los campos de la clase modelo (cabeceras)
        for (Field f : spec.getFields()) {
            //Se valida que la cabecera no tenga un valor por defecto
            if(f.get(object)==null){
                //Si la anotacion está presente se toma el valor, de lo contrario se toma el nombre del campo
                String name = httpHeaders.getFirst(f.isAnnotationPresent(HeaderName.class) ?
                        f.getAnnotation(HeaderName.class).value() : f.getName());
                f.set(object, name);
            }
        }

        return object;

    }

}
