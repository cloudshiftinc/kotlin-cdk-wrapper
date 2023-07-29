@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.ContentHandling
import software.amazon.awscdk.services.apigateway.IntegrationResponse

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * IntegrationResponse integrationResponse = IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build();
 * ```
 */
@CdkDslMarker
public class IntegrationResponseDsl {
    private val cdkBuilder: IntegrationResponse.Builder = IntegrationResponse.builder()

    /** @param contentHandling Specifies how to handle request payload content type conversions. */
    public fun contentHandling(contentHandling: ContentHandling) {
        cdkBuilder.contentHandling(contentHandling)
    }

    /**
     * @param responseParameters The response parameters from the backend response that API Gateway
     *   sends to the method response. Use the destination as the key and the source as the value:
     * * The destination must be an existing response parameter in the MethodResponse property.
     * * The source must be an existing method request parameter or a static value. You must enclose
     *   static values in single quotation marks and pre-encode these values based on the
     *   destination specified in the request.
     */
    public fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates The templates that are used to transform the integration response
     *   body. Specify templates as key-value pairs, with a content type as the key and a template
     *   as the value.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
     *   integration response based on the response from the back end. For example, if the success
     *   response returns nothing and the error response returns some string, you could use the `.+`
     *   regex to match error response. However, make sure that the error response does not contain
     *   any newline (`\n`) character in such cases. If the back end is an AWS Lambda function, the
     *   AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP
     *   status code is matched.
     */
    public fun selectionPattern(selectionPattern: String) {
        cdkBuilder.selectionPattern(selectionPattern)
    }

    /**
     * @param statusCode The status code that API Gateway uses to map the integration response to a
     *   MethodResponse status code.
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): IntegrationResponse = cdkBuilder.build()
}
