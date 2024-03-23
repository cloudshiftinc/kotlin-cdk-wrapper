@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnIntegrationResponse`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object responseParameters;
 * Object responseTemplates;
 * CfnIntegrationResponseProps cfnIntegrationResponseProps = CfnIntegrationResponseProps.builder()
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
public interface CfnIntegrationResponseProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-apiid)
   */
  public fun apiId(): String

  /**
   * Supported only for WebSocket APIs.
   *
   * Specifies how to handle response payload content type conversions. Supported values are
   * `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
   *
   * `CONVERT_TO_BINARY` : Converts a response payload from a Base64-encoded string to the
   * corresponding binary blob.
   *
   * `CONVERT_TO_TEXT` : Converts a response payload from a binary blob to a Base64-encoded string.
   *
   * If this property is not defined, the response payload will be passed through from the
   * integration response to the route response or method response without modification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-contenthandlingstrategy)
   */
  public fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  /**
   * The integration ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationid)
   */
  public fun integrationId(): String

  /**
   * The integration response key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationresponsekey)
   */
  public fun integrationResponseKey(): String

  /**
   * A key-value map specifying response parameters that are passed to the method response from the
   * backend.
   *
   * The key is a method response header parameter name and the mapped value is an integration
   * response header value, a static value enclosed within a pair of single quotes, or a JSON
   * expression from the integration response body. The mapping key must match the pattern of
   * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
   * non-static value must match the pattern of `integration.response.header. *{name}*` or
   * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique response
   * header name and `*{JSON-expression}*` is a valid JSON expression without the `$` prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responseparameters)
   */
  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * The collection of response templates for the integration response as a string-to-string map of
   * key-value pairs.
   *
   * Response templates are represented as a key/value map, with a content-type as the key and a
   * template as the value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
   */
  public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  /**
   * The template selection expression for the integration response.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-templateselectionexpression)
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * A builder for [CfnIntegrationResponseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param contentHandlingStrategy Supported only for WebSocket APIs.
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
     */
    public fun contentHandlingStrategy(contentHandlingStrategy: String)

    /**
     * @param integrationId The integration ID. 
     */
    public fun integrationId(integrationId: String)

    /**
     * @param integrationResponseKey The integration response key. 
     */
    public fun integrationResponseKey(integrationResponseKey: String)

    /**
     * @param responseParameters A key-value map specifying response parameters that are passed to
     * the method response from the backend.
     * The key is a method response header parameter name and the mapped value is an integration
     * response header value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match the pattern of
     * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
     * non-static value must match the pattern of `integration.response.header. *{name}*` or
     * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique
     * response header name and `*{JSON-expression}*` is a valid JSON expression without the `$`
     * prefix.
     */
    public fun responseParameters(responseParameters: Any)

    /**
     * @param responseTemplates The collection of response templates for the integration response as
     * a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     */
    public fun responseTemplates(responseTemplates: Any)

    /**
     * @param templateSelectionExpression The template selection expression for the integration
     * response.
     * Supported only for WebSocket APIs.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param contentHandlingStrategy Supported only for WebSocket APIs.
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
     */
    override fun contentHandlingStrategy(contentHandlingStrategy: String) {
      cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    /**
     * @param integrationId The integration ID. 
     */
    override fun integrationId(integrationId: String) {
      cdkBuilder.integrationId(integrationId)
    }

    /**
     * @param integrationResponseKey The integration response key. 
     */
    override fun integrationResponseKey(integrationResponseKey: String) {
      cdkBuilder.integrationResponseKey(integrationResponseKey)
    }

    /**
     * @param responseParameters A key-value map specifying response parameters that are passed to
     * the method response from the backend.
     * The key is a method response header parameter name and the mapped value is an integration
     * response header value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match the pattern of
     * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
     * non-static value must match the pattern of `integration.response.header. *{name}*` or
     * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique
     * response header name and `*{JSON-expression}*` is a valid JSON expression without the `$`
     * prefix.
     */
    override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates The collection of response templates for the integration response as
     * a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     */
    override fun responseTemplates(responseTemplates: Any) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param templateSelectionExpression The template selection expression for the integration
     * response.
     * Supported only for WebSocket APIs.
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps,
  ) : CdkObject(cdkObject), CfnIntegrationResponseProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

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
     */
    override fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

    /**
     * The integration ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationid)
     */
    override fun integrationId(): String = unwrap(this).getIntegrationId()

    /**
     * The integration response key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationresponsekey)
     */
    override fun integrationResponseKey(): String = unwrap(this).getIntegrationResponseKey()

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
     */
    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * The collection of response templates for the integration response as a string-to-string map
     * of key-value pairs.
     *
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
     */
    override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    /**
     * The template selection expression for the integration response.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-templateselectionexpression)
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps):
        CfnIntegrationResponseProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIntegrationResponseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationResponseProps):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
  }
}
