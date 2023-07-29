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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod

/**
 * `IntegrationResponse` is a property of the
 * [Amazon API Gateway Method Integration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html)
 * property type that specifies the response that API Gateway sends after a method's backend
 * finishes processing a request.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * IntegrationResponseProperty integrationResponseProperty = IntegrationResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling("contentHandling")
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html)
 */
@CdkDslMarker
public class CfnMethodIntegrationResponsePropertyDsl {
    private val cdkBuilder: CfnMethod.IntegrationResponseProperty.Builder =
        CfnMethod.IntegrationResponseProperty.builder()

    /**
     * @param contentHandling Specifies how to handle response payload content type conversions.
     *   Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
     *   behaviors:
     *
     * If this property is not defined, the response payload will be passed through from the
     * integration response to the method response without modification.
     */
    public fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
    }

    /**
     * @param responseParameters A key-value map specifying response parameters that are passed to
     *   the method response from the back end. The key is a method response header parameter name
     *   and the mapped value is an integration response header value, a static value enclosed
     *   within a pair of single quotes, or a JSON expression from the integration response body.
     *   The mapping key must match the pattern of `method.response.header.{name}` , where `name` is
     *   a valid and unique header name. The mapped non-static value must match the pattern of
     *   `integration.response.header.{name}` or `integration.response.body.{JSON-expression}` ,
     *   where `name` is a valid and unique response header name and `JSON-expression` is a valid
     *   JSON expression without the `$` prefix.
     */
    public fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseParameters A key-value map specifying response parameters that are passed to
     *   the method response from the back end. The key is a method response header parameter name
     *   and the mapped value is an integration response header value, a static value enclosed
     *   within a pair of single quotes, or a JSON expression from the integration response body.
     *   The mapping key must match the pattern of `method.response.header.{name}` , where `name` is
     *   a valid and unique header name. The mapped non-static value must match the pattern of
     *   `integration.response.header.{name}` or `integration.response.body.{JSON-expression}` ,
     *   where `name` is a valid and unique response header name and `JSON-expression` is a valid
     *   JSON expression without the `$` prefix.
     */
    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates Specifies the templates used to transform the integration response
     *   body. Response templates are represented as a key/value map, with a content-type as the key
     *   and a template as the value.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param responseTemplates Specifies the templates used to transform the integration response
     *   body. Response templates are represented as a key/value map, with a content-type as the key
     *   and a template as the value.
     */
    public fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
     *   integration response based on the response from the back end. For example, if the success
     *   response returns nothing and the error response returns some string, you could use the `.+`
     *   regex to match error response. However, make sure that the error response does not contain
     *   any newline ( `\n` ) character in such cases. If the back end is an AWS Lambda function,
     *   the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the
     *   HTTP status code is matched.
     */
    public fun selectionPattern(selectionPattern: String) {
        cdkBuilder.selectionPattern(selectionPattern)
    }

    /**
     * @param statusCode Specifies the status code that is used to map the integration response to
     *   an existing MethodResponse.
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnMethod.IntegrationResponseProperty = cdkBuilder.build()
}
