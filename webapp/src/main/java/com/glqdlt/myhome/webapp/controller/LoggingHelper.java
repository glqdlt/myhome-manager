package com.glqdlt.myhome.webapp.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Slf4j
public class LoggingHelper {
    private static String parameterDumps(HttpServletRequest req) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<String, String[]>> entries = req.getParameterMap().entrySet();
        stringBuilder.append("{ ");
        for (Map.Entry<String, String[]> entry : entries) {
            stringBuilder.append(entry.getKey())
                    .append(" = ")
                    .append(Arrays.toString(entry.getValue()))
                    .append(", ");
        }
        if (stringBuilder.length() > 2) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static void loggingRequestDetail(HttpServletRequest httpServletRequest, String line) {
        String uri = httpServletRequest.getRequestURI();
        String remoteUser = httpServletRequest.getRemoteUser();
        String parameterMap = parameterDumps(httpServletRequest);
        Optional<String> userName = Optional.ofNullable(httpServletRequest.getUserPrincipal().getName());
        String userIp = httpServletRequest.getRemoteAddr();
        String sessionId = httpServletRequest.getSession().getId();
        log.info("[{} / {} / {}], Request URI : {}, UserName : {}, Parameters : {}, Remote : {}", userIp, sessionId, line, uri, userName.orElse("Not Authenticated"), parameterMap, remoteUser);
    }

}
