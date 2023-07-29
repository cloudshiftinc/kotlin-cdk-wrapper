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
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::GatewayResponse` resource creates a gateway response for your API.
 *
 * For more information, see
 * [API Gateway Responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html#api-gateway-gatewayResponse-definition)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnGatewayResponse cfnGatewayResponse = CfnGatewayResponse.Builder.create(this,
 * "MyCfnGatewayResponse")
 * .responseType("responseType")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .statusCode("statusCode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
 */
@CdkDslMarker
public class CfnGatewayResponseDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGatewayResponse.Builder =
        CfnGatewayResponse.Builder.create(scope, id)

    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     *
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     *   GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     *
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     *   GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     *
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     *   of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     *
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     *   of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * The response type of the associated GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
     *
     * @param responseType The response type of the associated GatewayResponse.
     */
    public fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
     *
     * @param restApiId The string identifier of the associated RestApi.
     */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    /**
     * The HTTP status code for this GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
     *
     * @param statusCode The HTTP status code for this GatewayResponse.
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnGatewayResponse = cdkBuilder.build()
}
