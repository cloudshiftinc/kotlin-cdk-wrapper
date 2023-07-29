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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.IModel
import software.amazon.awscdk.services.apigateway.MethodResponse

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Model model;
 * MethodResponse methodResponse = MethodResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", model))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build();
 * ```
 */
@CdkDslMarker
public class MethodResponseDsl {
    private val cdkBuilder: MethodResponse.Builder = MethodResponse.builder()

    /**
     * @param responseModels The resources used for the response's content type. Specify response
     *   models as key-value pairs (string-to-string maps), with a content type as the key and a
     *   Model resource name as the value.
     */
    public fun responseModels(responseModels: Map<String, IModel>) {
        cdkBuilder.responseModels(responseModels)
    }

    /**
     * @param responseParameters Response parameters that API Gateway sends to the client that
     *   called a method. Specify response parameters as key-value pairs (string-to-Boolean maps),
     *   with a destination as the key and a Boolean as the value. Specify the destination using the
     *   following pattern: method.response.header.name, where the name is a valid, unique header
     *   name. The Boolean specifies whether a parameter is required.
     */
    public fun responseParameters(responseParameters: Map<String, Boolean>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param statusCode The method response's status code, which you map to an IntegrationResponse.
     *   Required.
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): MethodResponse = cdkBuilder.build()
}
