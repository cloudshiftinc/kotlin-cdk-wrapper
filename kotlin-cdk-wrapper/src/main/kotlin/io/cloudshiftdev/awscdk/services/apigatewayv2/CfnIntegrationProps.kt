@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object requestParameters;
 * Object requestTemplates;
 * Object responseParameters;
 * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
 * .apiId("apiId")
 * .integrationType("integrationType")
 * // the properties below are optional
 * .connectionId("connectionId")
 * .connectionType("connectionType")
 * .contentHandlingStrategy("contentHandlingStrategy")
 * .credentialsArn("credentialsArn")
 * .description("description")
 * .integrationMethod("integrationMethod")
 * .integrationSubtype("integrationSubtype")
 * .integrationUri("integrationUri")
 * .passthroughBehavior("passthroughBehavior")
 * .payloadFormatVersion("payloadFormatVersion")
 * .requestParameters(requestParameters)
 * .requestTemplates(requestTemplates)
 * .responseParameters(responseParameters)
 * .templateSelectionExpression("templateSelectionExpression")
 * .timeoutInMillis(123)
 * .tlsConfig(TlsConfigProperty.builder()
 * .serverNameToVerify("serverNameToVerify")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html)
 */
public interface CfnIntegrationProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid)
   */
  public fun apiId(): String

  /**
   * The ID of the VPC link for a private integration.
   *
   * Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectionid)
   */
  public fun connectionId(): String? = unwrap(this).getConnectionId()

  /**
   * The type of the network connection to the integration endpoint.
   *
   * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
   * private connections between API Gateway and resources in a VPC. The default value is `INTERNET` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype)
   */
  public fun connectionType(): String? = unwrap(this).getConnectionType()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy)
   */
  public fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  /**
   * Specifies the credentials required for the integration, if any.
   *
   * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
   * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed
   * through from the request, specify the string `arn:aws:iam::*:user/ *` . To use resource-based
   * permissions on supported AWS services, don't specify this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn)
   */
  public fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  /**
   * The description of the integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies the integration's HTTP method type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod)
   */
  public fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

  /**
   * Supported only for HTTP API `AWS_PROXY` integrations.
   *
   * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
   * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationsubtype)
   */
  public fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

  /**
   * The integration type of an integration. One of the following:.
   *
   * `AWS` : for integrating the route or method request with an AWS service action, including the
   * Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as
   * the Lambda custom integration. With any other AWS service action, this is known as AWS
   * integration. Supported only for WebSocket APIs.
   *
   * `AWS_PROXY` : for integrating the route or method request with a Lambda function or other AWS
   * service action. This integration is also referred to as a Lambda proxy integration.
   *
   * `HTTP` : for integrating the route or method request with an HTTP endpoint. This integration is
   * also referred to as the HTTP custom integration. Supported only for WebSocket APIs.
   *
   * `HTTP_PROXY` : for integrating the route or method request with an HTTP endpoint, with the
   * client request passed through as-is. This is also referred to as HTTP proxy integration. For HTTP
   * API private integrations, use an `HTTP_PROXY` integration.
   *
   * `MOCK` : for integrating the route or method request with API Gateway as a "loopback" endpoint
   * without invoking any backend. Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype)
   */
  public fun integrationType(): String

  /**
   * For a Lambda integration, specify the URI of a Lambda function.
   *
   * For an HTTP integration, specify a fully-qualified URL.
   *
   * For an HTTP API private integration, specify the ARN of an Application Load Balancer listener,
   * Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud
   * Map service, API Gateway uses `DiscoverInstances` to identify resources. You can use query
   * parameters to target specific resources. To learn more, see
   * [DiscoverInstances](https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html) .
   * For private integrations, all resources must be owned by the same AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri)
   */
  public fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  /**
   * Specifies the pass-through behavior for incoming requests based on the `Content-Type` header in
   * the request, and the available mapping templates specified as the `requestTemplates` property on
   * the `Integration` resource.
   *
   * There are three valid values: `WHEN_NO_MATCH` , `WHEN_NO_TEMPLATES` , and `NEVER` . Supported
   * only for WebSocket APIs.
   *
   * `WHEN_NO_MATCH` passes the request body for unmapped content types through to the integration
   * backend without transformation.
   *
   * `NEVER` rejects unmapped content types with an `HTTP 415 Unsupported Media Type` response.
   *
   * `WHEN_NO_TEMPLATES` allows pass-through when the integration has no content types mapped to
   * templates. However, if there is at least one content type defined, unmapped content types will be
   * rejected with the same `HTTP 415 Unsupported Media Type` response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior)
   */
  public fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

  /**
   * Specifies the format of the payload sent to an integration.
   *
   * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are `1.0`
   * and `2.0` . For all other integrations, `1.0` is the only supported value. To learn more, see
   * [Working with AWS Lambda proxy integrations for HTTP
   * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-payloadformatversion)
   */
  public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

  /**
   * For WebSocket APIs, a key-value map specifying request parameters that are passed from the
   * method request to the backend.
   *
   * The key is an integration request parameter name and the associated value is a method request
   * parameter value or static value that must be enclosed within single quotes and pre-encoded as
   * required by the backend. The method request parameter value must match the pattern of
   * `method.request. {location} . {name}` , where `{location}` is `querystring` , `path` , or `header`
   * ; and `{name}` must be a valid and unique method request parameter name.
   *
   * For HTTP API integrations with a specified `integrationSubtype` , request parameters are a
   * key-value map specifying parameters that are passed to `AWS_PROXY` integrations. You can provide
   * static values, or map request data, stage variables, or context variables that are evaluated at
   * runtime. To learn more, see [Working with AWS service integrations for HTTP
   * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html)
   * .
   *
   * For HTTP API integrations without a specified `integrationSubtype` request parameters are a
   * key-value map specifying how to transform HTTP requests before sending them to the backend. The
   * key should follow the pattern <action>:&lt;header|querystring|path&gt;.<location> where action can
   * be `append` , `overwrite` or `remove` . For values, you can provide static values, or map request
   * data, stage variables, or context variables that are evaluated at runtime. To learn more, see
   * [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters)
   */
  public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  /**
   * Represents a map of Velocity templates that are applied on the request payload based on the
   * value of the Content-Type header sent by the client.
   *
   * The content type value is the key in this map, and the template (as a String) is the value.
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates)
   */
  public fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

  /**
   * Supported only for HTTP APIs.
   *
   * You use response parameters to transform the HTTP response from a backend integration before
   * returning the response to clients. Specify a key-value map from a selection key to response
   * parameters. The selection key must be a valid HTTP status code within the range of 200-599. The
   * value is of type
   * [`ResponseParameterList`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
   * . To learn more, see [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-responseparameters)
   */
  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * The template selection expression for the integration.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression)
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
   * milliseconds for HTTP APIs.
   *
   * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis)
   */
  public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

  /**
   * The TLS configuration for a private integration.
   *
   * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
   * Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
   */
  public fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  /**
   * A builder for [CfnIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param connectionId The ID of the VPC link for a private integration.
     * Supported only for HTTP APIs.
     */
    public fun connectionId(connectionId: String)

    /**
     * @param connectionType The type of the network connection to the integration endpoint.
     * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
     * private connections between API Gateway and resources in a VPC. The default value is `INTERNET`
     * .
     */
    public fun connectionType(connectionType: String)

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
     * @param credentialsArn Specifies the credentials required for the integration, if any.
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::*:user/ *` . To use
     * resource-based permissions on supported AWS services, don't specify this parameter.
     */
    public fun credentialsArn(credentialsArn: String)

    /**
     * @param description The description of the integration.
     */
    public fun description(description: String)

    /**
     * @param integrationMethod Specifies the integration's HTTP method type.
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * @param integrationSubtype Supported only for HTTP API `AWS_PROXY` integrations.
     * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
     * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * .
     */
    public fun integrationSubtype(integrationSubtype: String)

    /**
     * @param integrationType The integration type of an integration. One of the following:. 
     * `AWS` : for integrating the route or method request with an AWS service action, including the
     * Lambda function-invoking action. With the Lambda function-invoking action, this is referred to
     * as the Lambda custom integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     *
     * `AWS_PROXY` : for integrating the route or method request with a Lambda function or other AWS
     * service action. This integration is also referred to as a Lambda proxy integration.
     *
     * `HTTP` : for integrating the route or method request with an HTTP endpoint. This integration
     * is also referred to as the HTTP custom integration. Supported only for WebSocket APIs.
     *
     * `HTTP_PROXY` : for integrating the route or method request with an HTTP endpoint, with the
     * client request passed through as-is. This is also referred to as HTTP proxy integration. For
     * HTTP API private integrations, use an `HTTP_PROXY` integration.
     *
     * `MOCK` : for integrating the route or method request with API Gateway as a "loopback"
     * endpoint without invoking any backend. Supported only for WebSocket APIs.
     */
    public fun integrationType(integrationType: String)

    /**
     * @param integrationUri For a Lambda integration, specify the URI of a Lambda function.
     * For an HTTP integration, specify a fully-qualified URL.
     *
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer
     * listener, Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an
     * AWS Cloud Map service, API Gateway uses `DiscoverInstances` to identify resources. You can use
     * query parameters to target specific resources. To learn more, see
     * [DiscoverInstances](https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html)
     * . For private integrations, all resources must be owned by the same AWS account .
     */
    public fun integrationUri(integrationUri: String)

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the `Content-Type` header in the request, and the available mapping templates specified as the
     * `requestTemplates` property on the `Integration` resource.
     * There are three valid values: `WHEN_NO_MATCH` , `WHEN_NO_TEMPLATES` , and `NEVER` . Supported
     * only for WebSocket APIs.
     *
     * `WHEN_NO_MATCH` passes the request body for unmapped content types through to the integration
     * backend without transformation.
     *
     * `NEVER` rejects unmapped content types with an `HTTP 415 Unsupported Media Type` response.
     *
     * `WHEN_NO_TEMPLATES` allows pass-through when the integration has no content types mapped to
     * templates. However, if there is at least one content type defined, unmapped content types will
     * be rejected with the same `HTTP 415 Unsupported Media Type` response.
     */
    public fun passthroughBehavior(passthroughBehavior: String)

    /**
     * @param payloadFormatVersion Specifies the format of the payload sent to an integration.
     * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
     * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn more,
     * see [Working with AWS Lambda proxy integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * .
     */
    public fun payloadFormatVersion(payloadFormatVersion: String)

    /**
     * @param requestParameters For WebSocket APIs, a key-value map specifying request parameters
     * that are passed from the method request to the backend.
     * The key is an integration request parameter name and the associated value is a method request
     * parameter value or static value that must be enclosed within single quotes and pre-encoded as
     * required by the backend. The method request parameter value must match the pattern of
     * `method.request. {location} . {name}` , where `{location}` is `querystring` , `path` , or
     * `header` ; and `{name}` must be a valid and unique method request parameter name.
     *
     * For HTTP API integrations with a specified `integrationSubtype` , request parameters are a
     * key-value map specifying parameters that are passed to `AWS_PROXY` integrations. You can provide
     * static values, or map request data, stage variables, or context variables that are evaluated at
     * runtime. To learn more, see [Working with AWS service integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html)
     * .
     *
     * For HTTP API integrations without a specified `integrationSubtype` request parameters are a
     * key-value map specifying how to transform HTTP requests before sending them to the backend. The
     * key should follow the pattern <action>:&lt;header|querystring|path&gt;.<location> where action
     * can be `append` , `overwrite` or `remove` . For values, you can provide static values, or map
     * request data, stage variables, or context variables that are evaluated at runtime. To learn
     * more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     */
    public fun requestParameters(requestParameters: Any)

    /**
     * @param requestTemplates Represents a map of Velocity templates that are applied on the
     * request payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a String) is the value.
     * Supported only for WebSocket APIs.
     */
    public fun requestTemplates(requestTemplates: Any)

    /**
     * @param responseParameters Supported only for HTTP APIs.
     * You use response parameters to transform the HTTP response from a backend integration before
     * returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. The
     * value is of type
     * [`ResponseParameterList`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
     * . To learn more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     */
    public fun responseParameters(responseParameters: Any)

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     * Supported only for WebSocket APIs.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)

    /**
     * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
     * and between 50 and 30,000 milliseconds for HTTP APIs.
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     */
    public fun timeoutInMillis(timeoutInMillis: Number)

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    public fun tlsConfig(tlsConfig: IResolvable)

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    public fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty)

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("532a6c7e227e91660549cd423fd956612678020d6ce7bf3db3f8a6b3c51dbc0d")
    public fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param connectionId The ID of the VPC link for a private integration.
     * Supported only for HTTP APIs.
     */
    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    /**
     * @param connectionType The type of the network connection to the integration endpoint.
     * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
     * private connections between API Gateway and resources in a VPC. The default value is `INTERNET`
     * .
     */
    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
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
     * @param credentialsArn Specifies the credentials required for the integration, if any.
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::*:user/ *` . To use
     * resource-based permissions on supported AWS services, don't specify this parameter.
     */
    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    /**
     * @param description The description of the integration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param integrationMethod Specifies the integration's HTTP method type.
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * @param integrationSubtype Supported only for HTTP API `AWS_PROXY` integrations.
     * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
     * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * .
     */
    override fun integrationSubtype(integrationSubtype: String) {
      cdkBuilder.integrationSubtype(integrationSubtype)
    }

    /**
     * @param integrationType The integration type of an integration. One of the following:. 
     * `AWS` : for integrating the route or method request with an AWS service action, including the
     * Lambda function-invoking action. With the Lambda function-invoking action, this is referred to
     * as the Lambda custom integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     *
     * `AWS_PROXY` : for integrating the route or method request with a Lambda function or other AWS
     * service action. This integration is also referred to as a Lambda proxy integration.
     *
     * `HTTP` : for integrating the route or method request with an HTTP endpoint. This integration
     * is also referred to as the HTTP custom integration. Supported only for WebSocket APIs.
     *
     * `HTTP_PROXY` : for integrating the route or method request with an HTTP endpoint, with the
     * client request passed through as-is. This is also referred to as HTTP proxy integration. For
     * HTTP API private integrations, use an `HTTP_PROXY` integration.
     *
     * `MOCK` : for integrating the route or method request with API Gateway as a "loopback"
     * endpoint without invoking any backend. Supported only for WebSocket APIs.
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    /**
     * @param integrationUri For a Lambda integration, specify the URI of a Lambda function.
     * For an HTTP integration, specify a fully-qualified URL.
     *
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer
     * listener, Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an
     * AWS Cloud Map service, API Gateway uses `DiscoverInstances` to identify resources. You can use
     * query parameters to target specific resources. To learn more, see
     * [DiscoverInstances](https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html)
     * . For private integrations, all resources must be owned by the same AWS account .
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the `Content-Type` header in the request, and the available mapping templates specified as the
     * `requestTemplates` property on the `Integration` resource.
     * There are three valid values: `WHEN_NO_MATCH` , `WHEN_NO_TEMPLATES` , and `NEVER` . Supported
     * only for WebSocket APIs.
     *
     * `WHEN_NO_MATCH` passes the request body for unmapped content types through to the integration
     * backend without transformation.
     *
     * `NEVER` rejects unmapped content types with an `HTTP 415 Unsupported Media Type` response.
     *
     * `WHEN_NO_TEMPLATES` allows pass-through when the integration has no content types mapped to
     * templates. However, if there is at least one content type defined, unmapped content types will
     * be rejected with the same `HTTP 415 Unsupported Media Type` response.
     */
    override fun passthroughBehavior(passthroughBehavior: String) {
      cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    /**
     * @param payloadFormatVersion Specifies the format of the payload sent to an integration.
     * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
     * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn more,
     * see [Working with AWS Lambda proxy integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * .
     */
    override fun payloadFormatVersion(payloadFormatVersion: String) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /**
     * @param requestParameters For WebSocket APIs, a key-value map specifying request parameters
     * that are passed from the method request to the backend.
     * The key is an integration request parameter name and the associated value is a method request
     * parameter value or static value that must be enclosed within single quotes and pre-encoded as
     * required by the backend. The method request parameter value must match the pattern of
     * `method.request. {location} . {name}` , where `{location}` is `querystring` , `path` , or
     * `header` ; and `{name}` must be a valid and unique method request parameter name.
     *
     * For HTTP API integrations with a specified `integrationSubtype` , request parameters are a
     * key-value map specifying parameters that are passed to `AWS_PROXY` integrations. You can provide
     * static values, or map request data, stage variables, or context variables that are evaluated at
     * runtime. To learn more, see [Working with AWS service integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html)
     * .
     *
     * For HTTP API integrations without a specified `integrationSubtype` request parameters are a
     * key-value map specifying how to transform HTTP requests before sending them to the backend. The
     * key should follow the pattern <action>:&lt;header|querystring|path&gt;.<location> where action
     * can be `append` , `overwrite` or `remove` . For values, you can provide static values, or map
     * request data, stage variables, or context variables that are evaluated at runtime. To learn
     * more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     */
    override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates Represents a map of Velocity templates that are applied on the
     * request payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a String) is the value.
     * Supported only for WebSocket APIs.
     */
    override fun requestTemplates(requestTemplates: Any) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param responseParameters Supported only for HTTP APIs.
     * You use response parameters to transform the HTTP response from a backend integration before
     * returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. The
     * value is of type
     * [`ResponseParameterList`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
     * . To learn more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     */
    override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     * Supported only for WebSocket APIs.
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /**
     * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
     * and between 50 and 30,000 milliseconds for HTTP APIs.
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     */
    override fun timeoutInMillis(timeoutInMillis: Number) {
      cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    override fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(CfnIntegration.TlsConfigProperty::unwrap))
    }

    /**
     * @param tlsConfig The TLS configuration for a private integration.
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("532a6c7e227e91660549cd423fd956612678020d6ce7bf3db3f8a6b3c51dbc0d")
    override fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(CfnIntegration.TlsConfigProperty(tlsConfig))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectionid)
     */
    override fun connectionId(): String? = unwrap(this).getConnectionId()

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
     * private connections between API Gateway and resources in a VPC. The default value is `INTERNET`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype)
     */
    override fun connectionType(): String? = unwrap(this).getConnectionType()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy)
     */
    override fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

    /**
     * Specifies the credentials required for the integration, if any.
     *
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::*:user/ *` . To use
     * resource-based permissions on supported AWS services, don't specify this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn)
     */
    override fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

    /**
     * The description of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies the integration's HTTP method type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod)
     */
    override fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

    /**
     * Supported only for HTTP API `AWS_PROXY` integrations.
     *
     * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
     * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationsubtype)
     */
    override fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

    /**
     * The integration type of an integration. One of the following:.
     *
     * `AWS` : for integrating the route or method request with an AWS service action, including the
     * Lambda function-invoking action. With the Lambda function-invoking action, this is referred to
     * as the Lambda custom integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     *
     * `AWS_PROXY` : for integrating the route or method request with a Lambda function or other AWS
     * service action. This integration is also referred to as a Lambda proxy integration.
     *
     * `HTTP` : for integrating the route or method request with an HTTP endpoint. This integration
     * is also referred to as the HTTP custom integration. Supported only for WebSocket APIs.
     *
     * `HTTP_PROXY` : for integrating the route or method request with an HTTP endpoint, with the
     * client request passed through as-is. This is also referred to as HTTP proxy integration. For
     * HTTP API private integrations, use an `HTTP_PROXY` integration.
     *
     * `MOCK` : for integrating the route or method request with API Gateway as a "loopback"
     * endpoint without invoking any backend. Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype)
     */
    override fun integrationType(): String = unwrap(this).getIntegrationType()

    /**
     * For a Lambda integration, specify the URI of a Lambda function.
     *
     * For an HTTP integration, specify a fully-qualified URL.
     *
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer
     * listener, Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an
     * AWS Cloud Map service, API Gateway uses `DiscoverInstances` to identify resources. You can use
     * query parameters to target specific resources. To learn more, see
     * [DiscoverInstances](https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html)
     * . For private integrations, all resources must be owned by the same AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri)
     */
    override fun integrationUri(): String? = unwrap(this).getIntegrationUri()

    /**
     * Specifies the pass-through behavior for incoming requests based on the `Content-Type` header
     * in the request, and the available mapping templates specified as the `requestTemplates` property
     * on the `Integration` resource.
     *
     * There are three valid values: `WHEN_NO_MATCH` , `WHEN_NO_TEMPLATES` , and `NEVER` . Supported
     * only for WebSocket APIs.
     *
     * `WHEN_NO_MATCH` passes the request body for unmapped content types through to the integration
     * backend without transformation.
     *
     * `NEVER` rejects unmapped content types with an `HTTP 415 Unsupported Media Type` response.
     *
     * `WHEN_NO_TEMPLATES` allows pass-through when the integration has no content types mapped to
     * templates. However, if there is at least one content type defined, unmapped content types will
     * be rejected with the same `HTTP 415 Unsupported Media Type` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior)
     */
    override fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

    /**
     * Specifies the format of the payload sent to an integration.
     *
     * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
     * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn more,
     * see [Working with AWS Lambda proxy integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-payloadformatversion)
     */
    override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    /**
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the
     * method request to the backend.
     *
     * The key is an integration request parameter name and the associated value is a method request
     * parameter value or static value that must be enclosed within single quotes and pre-encoded as
     * required by the backend. The method request parameter value must match the pattern of
     * `method.request. {location} . {name}` , where `{location}` is `querystring` , `path` , or
     * `header` ; and `{name}` must be a valid and unique method request parameter name.
     *
     * For HTTP API integrations with a specified `integrationSubtype` , request parameters are a
     * key-value map specifying parameters that are passed to `AWS_PROXY` integrations. You can provide
     * static values, or map request data, stage variables, or context variables that are evaluated at
     * runtime. To learn more, see [Working with AWS service integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html)
     * .
     *
     * For HTTP API integrations without a specified `integrationSubtype` request parameters are a
     * key-value map specifying how to transform HTTP requests before sending them to the backend. The
     * key should follow the pattern <action>:&lt;header|querystring|path&gt;.<location> where action
     * can be `append` , `overwrite` or `remove` . For values, you can provide static values, or map
     * request data, stage variables, or context variables that are evaluated at runtime. To learn
     * more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters)
     */
    override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    /**
     * Represents a map of Velocity templates that are applied on the request payload based on the
     * value of the Content-Type header sent by the client.
     *
     * The content type value is the key in this map, and the template (as a String) is the value.
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates)
     */
    override fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

    /**
     * Supported only for HTTP APIs.
     *
     * You use response parameters to transform the HTTP response from a backend integration before
     * returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. The
     * value is of type
     * [`ResponseParameterList`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
     * . To learn more, see [Transforming API requests and
     * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-responseparameters)
     */
    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * The template selection expression for the integration.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression)
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and
     * 30,000 milliseconds for HTTP APIs.
     *
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis)
     */
    override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     */
    override fun tlsConfig(): Any? = unwrap(this).getTlsConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps):
        CfnIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
  }
}
