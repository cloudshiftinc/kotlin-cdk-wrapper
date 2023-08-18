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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps

/**
 * Properties for defining a `CfnGatewayResponse`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnGatewayResponseProps cfnGatewayResponseProps = CfnGatewayResponseProps.builder()
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
public class CfnGatewayResponsePropsDsl {
    private val cdkBuilder: CfnGatewayResponseProps.Builder = CfnGatewayResponseProps.builder()

    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     *   GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     *   GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     *   of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     *   of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /** @param responseType The response type of the associated GatewayResponse. */
    public fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
    }

    /** @param restApiId The string identifier of the associated RestApi. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    /** @param statusCode The HTTP status code for this GatewayResponse. */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnGatewayResponseProps = cdkBuilder.build()
}
