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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::IntegrationResponse` resource updates an integration response for an
 * WebSocket API.
 *
 * For more information, see
 * [Set up WebSocket API Integration Responses in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-integration-responses.html)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object responseParameters;
 * Object responseTemplates;
 * CfnIntegrationResponse cfnIntegrationResponse = CfnIntegrationResponse.Builder.create(this,
 * "MyCfnIntegrationResponse")
 * .apiId("apiId")
 * .integrationId("integrationId")
 * .integrationResponseKey("integrationResponseKey")
 * // the properties below are optional
 * .contentHandlingStrategy("contentHandlingStrategy")
 * .responseParameters(responseParameters)
 * .responseTemplates(responseTemplates)
 * .templateSelectionExpression("templateSelectionExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html)
 */
@CdkDslMarker
public class CfnIntegrationResponseDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIntegrationResponse.Builder =
        CfnIntegrationResponse.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-apiid)
     *
     * @param apiId The API identifier.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * Supported only for WebSocket APIs.
     *
     * Specifies how to handle response payload content type conversions. Supported values are
     * `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
     *
     * `CONVERT_TO_BINARY` : Converts a response payload from a Base64-encoded string to the
     * corresponding binary blob.
     *
     * `CONVERT_TO_TEXT` : Converts a response payload from a binary blob to a Base64-encoded
     * string.
     *
     * If this property is not defined, the response payload will be passed through from the
     * integration response to the route response or method response without modification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-contenthandlingstrategy)
     *
     * @param contentHandlingStrategy Supported only for WebSocket APIs.
     */
    public fun contentHandlingStrategy(contentHandlingStrategy: String) {
        cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    /**
     * The integration ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationid)
     *
     * @param integrationId The integration ID.
     */
    public fun integrationId(integrationId: String) {
        cdkBuilder.integrationId(integrationId)
    }

    /**
     * The integration response key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationresponsekey)
     *
     * @param integrationResponseKey The integration response key.
     */
    public fun integrationResponseKey(integrationResponseKey: String) {
        cdkBuilder.integrationResponseKey(integrationResponseKey)
    }

    /**
     * A key-value map specifying response parameters that are passed to the method response from
     * the backend.
     *
     * The key is a method response header parameter name and the mapped value is an integration
     * response header value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match the pattern of
     * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
     * non-static value must match the pattern of `integration.response.header. *{name}*` or
     * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique
     * response header name and `*{JSON-expression}*` is a valid JSON expression without the `$`
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responseparameters)
     *
     * @param responseParameters A key-value map specifying response parameters that are passed to
     *   the method response from the backend.
     */
    public fun responseParameters(responseParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(responseParameters)
        cdkBuilder.responseParameters(builder.map)
    }

    /**
     * A key-value map specifying response parameters that are passed to the method response from
     * the backend.
     *
     * The key is a method response header parameter name and the mapped value is an integration
     * response header value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match the pattern of
     * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
     * non-static value must match the pattern of `integration.response.header. *{name}*` or
     * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique
     * response header name and `*{JSON-expression}*` is a valid JSON expression without the `$`
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responseparameters)
     *
     * @param responseParameters A key-value map specifying response parameters that are passed to
     *   the method response from the backend.
     */
    public fun responseParameters(responseParameters: Any) {
        cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * The collection of response templates for the integration response as a string-to-string map
     * of key-value pairs.
     *
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
     *
     * @param responseTemplates The collection of response templates for the integration response as
     *   a string-to-string map of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(responseTemplates)
        cdkBuilder.responseTemplates(builder.map)
    }

    /**
     * The collection of response templates for the integration response as a string-to-string map
     * of key-value pairs.
     *
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
     *
     * @param responseTemplates The collection of response templates for the integration response as
     *   a string-to-string map of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: Any) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * The template selection expression for the integration response.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-templateselectionexpression)
     *
     * @param templateSelectionExpression The template selection expression for the integration
     *   response.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String) {
        cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build(): CfnIntegrationResponse = cdkBuilder.build()
}
