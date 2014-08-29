package org.imsglobal.basiclti;


import org.apache.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * This interface contains methods that <b>verify</b> HttpRequests
 * and generic request parameters according to the LTI
 * specification.
 * @author  Paul Gray
 * @since   1.1
 */
public interface LtiVerifier {

    /**
     * This method will verify the HttpServletRequest.
     *
     * @param request the HttpServletRequest that will be verified
     * @param secret the secret to verify the properties with
     * @return an LtiVerificationResult which will
     * contain information about the request (whether or
     * not it is valid, and if it is valid, contextual
     * information about the request).
     * @throws LtiVerificationException
     */
    public LtiVerificationResult verify(HttpServletRequest request, String secret) throws LtiVerificationException;

    /**
     * This method will verify a list of properties (mapped
     * by key & value).
     * @param parameters the parameters that will be verified. mapped by key & value
     * @param secret the secret to verify the properties with
     * @return an LtiVerificationResult which will
     * contain information about the request (whether or
     * not it is valid, and if it is valid, contextual
     * information about the request).
     * @throws LtiVerificationException
     */
    public LtiVerificationResult verifyParameters(Map<String, String> parameters, String secret) throws LtiVerificationException;

}
