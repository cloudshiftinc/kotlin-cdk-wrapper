@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::Integration` resource creates an integration for an API.
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
 * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
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
public open class CfnIntegration(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnIntegration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIntegrationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIntegrationProps(props)
  )

  /**
   * The API identifier.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The API identifier.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the VPC link for a private integration.
   */
  public open fun connectionId(): String? = unwrap(this).getConnectionId()

  /**
   * The ID of the VPC link for a private integration.
   */
  public open fun connectionId(`value`: String) {
    unwrap(this).setConnectionId(`value`)
  }

  /**
   * The type of the network connection to the integration endpoint.
   */
  public open fun connectionType(): String? = unwrap(this).getConnectionType()

  /**
   * The type of the network connection to the integration endpoint.
   */
  public open fun connectionType(`value`: String) {
    unwrap(this).setConnectionType(`value`)
  }

  /**
   * Supported only for WebSocket APIs.
   */
  public open fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  /**
   * Supported only for WebSocket APIs.
   */
  public open fun contentHandlingStrategy(`value`: String) {
    unwrap(this).setContentHandlingStrategy(`value`)
  }

  /**
   * Specifies the credentials required for the integration, if any.
   */
  public open fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  /**
   * Specifies the credentials required for the integration, if any.
   */
  public open fun credentialsArn(`value`: String) {
    unwrap(this).setCredentialsArn(`value`)
  }

  /**
   * The description of the integration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the integration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the integration's HTTP method type.
   */
  public open fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

  /**
   * Specifies the integration's HTTP method type.
   */
  public open fun integrationMethod(`value`: String) {
    unwrap(this).setIntegrationMethod(`value`)
  }

  /**
   * Supported only for HTTP API `AWS_PROXY` integrations.
   */
  public open fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

  /**
   * Supported only for HTTP API `AWS_PROXY` integrations.
   */
  public open fun integrationSubtype(`value`: String) {
    unwrap(this).setIntegrationSubtype(`value`)
  }

  /**
   * The integration type of an integration.
   *
   * One of the following:.
   */
  public open fun integrationType(): String = unwrap(this).getIntegrationType()

  /**
   * The integration type of an integration.
   *
   * One of the following:.
   */
  public open fun integrationType(`value`: String) {
    unwrap(this).setIntegrationType(`value`)
  }

  /**
   * For a Lambda integration, specify the URI of a Lambda function.
   */
  public open fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  /**
   * For a Lambda integration, specify the URI of a Lambda function.
   */
  public open fun integrationUri(`value`: String) {
    unwrap(this).setIntegrationUri(`value`)
  }

  /**
   * Specifies the pass-through behavior for incoming requests based on the `Content-Type` header in
   * the request, and the available mapping templates specified as the `requestTemplates` property on
   * the `Integration` resource.
   */
  public open fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

  /**
   * Specifies the pass-through behavior for incoming requests based on the `Content-Type` header in
   * the request, and the available mapping templates specified as the `requestTemplates` property on
   * the `Integration` resource.
   */
  public open fun passthroughBehavior(`value`: String) {
    unwrap(this).setPassthroughBehavior(`value`)
  }

  /**
   * Specifies the format of the payload sent to an integration.
   */
  public open fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

  /**
   * Specifies the format of the payload sent to an integration.
   */
  public open fun payloadFormatVersion(`value`: String) {
    unwrap(this).setPayloadFormatVersion(`value`)
  }

  /**
   * For WebSocket APIs, a key-value map specifying request parameters that are passed from the
   * method request to the backend.
   */
  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  /**
   * For WebSocket APIs, a key-value map specifying request parameters that are passed from the
   * method request to the backend.
   */
  public open fun requestParameters(`value`: Any) {
    unwrap(this).setRequestParameters(`value`)
  }

  /**
   * Represents a map of Velocity templates that are applied on the request payload based on the
   * value of the Content-Type header sent by the client.
   */
  public open fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

  /**
   * Represents a map of Velocity templates that are applied on the request payload based on the
   * value of the Content-Type header sent by the client.
   */
  public open fun requestTemplates(`value`: Any) {
    unwrap(this).setRequestTemplates(`value`)
  }

  /**
   * Supported only for HTTP APIs.
   */
  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * Supported only for HTTP APIs.
   */
  public open fun responseParameters(`value`: Any) {
    unwrap(this).setResponseParameters(`value`)
  }

  /**
   * The template selection expression for the integration.
   */
  public open fun templateSelectionExpression(): String? =
      unwrap(this).getTemplateSelectionExpression()

  /**
   * The template selection expression for the integration.
   */
  public open fun templateSelectionExpression(`value`: String) {
    unwrap(this).setTemplateSelectionExpression(`value`)
  }

  /**
   * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
   * milliseconds for HTTP APIs.
   */
  public open fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

  /**
   * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
   * milliseconds for HTTP APIs.
   */
  public open fun timeoutInMillis(`value`: Number) {
    unwrap(this).setTimeoutInMillis(`value`)
  }

  /**
   * The TLS configuration for a private integration.
   */
  public open fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  /**
   * The TLS configuration for a private integration.
   */
  public open fun tlsConfig(`value`: IResolvable) {
    unwrap(this).setTlsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The TLS configuration for a private integration.
   */
  public open fun tlsConfig(`value`: TlsConfigProperty) {
    unwrap(this).setTlsConfig(`value`.let(TlsConfigProperty::unwrap))
  }

  /**
   * The TLS configuration for a private integration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5bb30134710e91df085e46611248cf4051ad72fd14a810d99ed73bb57fcf8bc4")
  public open fun tlsConfig(`value`: TlsConfigProperty.Builder.() -> Unit): Unit =
      tlsConfig(TlsConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectionid)
     * @param connectionId The ID of the VPC link for a private integration. 
     */
    public fun connectionId(connectionId: String)

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
     * private connections between API Gateway and resources in a VPC. The default value is `INTERNET`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype)
     * @param connectionType The type of the network connection to the integration endpoint. 
     */
    public fun connectionType(connectionType: String)

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
     * @param contentHandlingStrategy Supported only for WebSocket APIs. 
     */
    public fun contentHandlingStrategy(contentHandlingStrategy: String)

    /**
     * Specifies the credentials required for the integration, if any.
     *
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::*:user/ *` . To use
     * resource-based permissions on supported AWS services, don't specify this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn)
     * @param credentialsArn Specifies the credentials required for the integration, if any. 
     */
    public fun credentialsArn(credentialsArn: String)

    /**
     * The description of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description)
     * @param description The description of the integration. 
     */
    public fun description(description: String)

    /**
     * Specifies the integration's HTTP method type.
     *
     * For WebSocket APIs, if you use a Lambda integration, you must set the integration method to
     * `POST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod)
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * Supported only for HTTP API `AWS_PROXY` integrations.
     *
     * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
     * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationsubtype)
     * @param integrationSubtype Supported only for HTTP API `AWS_PROXY` integrations. 
     */
    public fun integrationSubtype(integrationSubtype: String)

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
     * @param integrationType The integration type of an integration. One of the following:. 
     */
    public fun integrationType(integrationType: String)

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
     * @param integrationUri For a Lambda integration, specify the URI of a Lambda function. 
     */
    public fun integrationUri(integrationUri: String)

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
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the `Content-Type` header in the request, and the available mapping templates specified as the
     * `requestTemplates` property on the `Integration` resource. 
     */
    public fun passthroughBehavior(passthroughBehavior: String)

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
     * @param payloadFormatVersion Specifies the format of the payload sent to an integration. 
     */
    public fun payloadFormatVersion(payloadFormatVersion: String)

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
     * @param requestParameters For WebSocket APIs, a key-value map specifying request parameters
     * that are passed from the method request to the backend. 
     */
    public fun requestParameters(requestParameters: Any)

    /**
     * Represents a map of Velocity templates that are applied on the request payload based on the
     * value of the Content-Type header sent by the client.
     *
     * The content type value is the key in this map, and the template (as a String) is the value.
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates)
     * @param requestTemplates Represents a map of Velocity templates that are applied on the
     * request payload based on the value of the Content-Type header sent by the client. 
     */
    public fun requestTemplates(requestTemplates: Any)

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
     * @param responseParameters Supported only for HTTP APIs. 
     */
    public fun responseParameters(responseParameters: Any)

    /**
     * The template selection expression for the integration.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression)
     * @param templateSelectionExpression The template selection expression for the integration. 
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)

    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and
     * 30,000 milliseconds for HTTP APIs.
     *
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis)
     * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
     * and between 50 and 30,000 milliseconds for HTTP APIs. 
     */
    public fun timeoutInMillis(timeoutInMillis: Number)

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    public fun tlsConfig(tlsConfig: IResolvable)

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    public fun tlsConfig(tlsConfig: TlsConfigProperty)

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e11854d1d00980109f25cf64cb2b1fd7f9d27ae16bb1d5624827f41e207b41")
    public fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectionid)
     * @param connectionId The ID of the VPC link for a private integration. 
     */
    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Specify `INTERNET` for connections through the public routable internet or `VPC_LINK` for
     * private connections between API Gateway and resources in a VPC. The default value is `INTERNET`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype)
     * @param connectionType The type of the network connection to the integration endpoint. 
     */
    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy)
     * @param contentHandlingStrategy Supported only for WebSocket APIs. 
     */
    override fun contentHandlingStrategy(contentHandlingStrategy: String) {
      cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    /**
     * Specifies the credentials required for the integration, if any.
     *
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::*:user/ *` . To use
     * resource-based permissions on supported AWS services, don't specify this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn)
     * @param credentialsArn Specifies the credentials required for the integration, if any. 
     */
    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    /**
     * The description of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description)
     * @param description The description of the integration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies the integration's HTTP method type.
     *
     * For WebSocket APIs, if you use a Lambda integration, you must set the integration method to
     * `POST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod)
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * Supported only for HTTP API `AWS_PROXY` integrations.
     *
     * Specifies the AWS service action to invoke. To learn more, see [Integration subtype
     * reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationsubtype)
     * @param integrationSubtype Supported only for HTTP API `AWS_PROXY` integrations. 
     */
    override fun integrationSubtype(integrationSubtype: String) {
      cdkBuilder.integrationSubtype(integrationSubtype)
    }

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
     * @param integrationType The integration type of an integration. One of the following:. 
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

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
     * @param integrationUri For a Lambda integration, specify the URI of a Lambda function. 
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

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
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the `Content-Type` header in the request, and the available mapping templates specified as the
     * `requestTemplates` property on the `Integration` resource. 
     */
    override fun passthroughBehavior(passthroughBehavior: String) {
      cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

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
     * @param payloadFormatVersion Specifies the format of the payload sent to an integration. 
     */
    override fun payloadFormatVersion(payloadFormatVersion: String) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

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
     * @param requestParameters For WebSocket APIs, a key-value map specifying request parameters
     * that are passed from the method request to the backend. 
     */
    override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * Represents a map of Velocity templates that are applied on the request payload based on the
     * value of the Content-Type header sent by the client.
     *
     * The content type value is the key in this map, and the template (as a String) is the value.
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates)
     * @param requestTemplates Represents a map of Velocity templates that are applied on the
     * request payload based on the value of the Content-Type header sent by the client. 
     */
    override fun requestTemplates(requestTemplates: Any) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

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
     * @param responseParameters Supported only for HTTP APIs. 
     */
    override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * The template selection expression for the integration.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression)
     * @param templateSelectionExpression The template selection expression for the integration. 
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and
     * 30,000 milliseconds for HTTP APIs.
     *
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis)
     * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
     * and between 50 and 30,000 milliseconds for HTTP APIs. 
     */
    override fun timeoutInMillis(timeoutInMillis: Number) {
      cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    override fun tlsConfig(tlsConfig: TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(TlsConfigProperty::unwrap))
    }

    /**
     * The TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-tlsconfig)
     * @param tlsConfig The TLS configuration for a private integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e11854d1d00980109f25cf64cb2b1fd7f9d27ae16bb1d5624827f41e207b41")
    override fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(TlsConfigProperty(tlsConfig))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ResponseParameterListProperty responseParameterListProperty =
   * ResponseParameterListProperty.builder()
   * .responseParameters(List.of(ResponseParameterProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
   */
  public interface ResponseParameterListProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html#cfn-apigatewayv2-integration-responseparameterlist-responseparameters)
     */
    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * A builder for [ResponseParameterListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param responseParameters the value to be set.
       */
      public fun responseParameters(responseParameters: IResolvable)

      /**
       * @param responseParameters the value to be set.
       */
      public fun responseParameters(responseParameters: List<Any>)

      /**
       * @param responseParameters the value to be set.
       */
      public fun responseParameters(vararg responseParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.builder()

      /**
       * @param responseParameters the value to be set.
       */
      override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      /**
       * @param responseParameters the value to be set.
       */
      override fun responseParameters(responseParameters: List<Any>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      /**
       * @param responseParameters the value to be set.
       */
      override fun responseParameters(vararg responseParameters: Any): Unit =
          responseParameters(responseParameters.toList())

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty,
    ) : CdkObject(cdkObject), ResponseParameterListProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html#cfn-apigatewayv2-integration-responseparameterlist-responseparameters)
       */
      override fun responseParameters(): Any? = unwrap(this).getResponseParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseParameterListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty):
          ResponseParameterListProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResponseParameterListProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseParameterListProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ResponseParameterProperty responseParameterProperty = ResponseParameterProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html)
   */
  public interface ResponseParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html#cfn-apigatewayv2-integration-responseparameter-destination)
     */
    public fun destination(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html#cfn-apigatewayv2-integration-responseparameter-source)
     */
    public fun source(): String

    /**
     * A builder for [ResponseParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination the value to be set. 
       */
      public fun destination(destination: String)

      /**
       * @param source the value to be set. 
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.builder()

      /**
       * @param destination the value to be set. 
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param source the value to be set. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty,
    ) : CdkObject(cdkObject), ResponseParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html#cfn-apigatewayv2-integration-responseparameter-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html#cfn-apigatewayv2-integration-responseparameter-source)
       */
      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty):
          ResponseParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResponseParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseParameterProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty
    }
  }

  /**
   * The `TlsConfig` property specifies the TLS configuration for a private integration.
   *
   * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
   * Supported only for HTTP APIs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
   * .serverNameToVerify("serverNameToVerify")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
   */
  public interface TlsConfigProperty {
    /**
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's
     * certificate.
     *
     * The server name is also included in the TLS handshake to support Server Name Indication (SNI)
     * or virtual hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify)
     */
    public fun serverNameToVerify(): String? = unwrap(this).getServerNameToVerify()

    /**
     * A builder for [TlsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverNameToVerify If you specify a server name, API Gateway uses it to verify the
       * hostname on the integration's certificate.
       * The server name is also included in the TLS handshake to support Server Name Indication
       * (SNI) or virtual hosting.
       */
      public fun serverNameToVerify(serverNameToVerify: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.builder()

      /**
       * @param serverNameToVerify If you specify a server name, API Gateway uses it to verify the
       * hostname on the integration's certificate.
       * The server name is also included in the TLS handshake to support Server Name Indication
       * (SNI) or virtual hosting.
       */
      override fun serverNameToVerify(serverNameToVerify: String) {
        cdkBuilder.serverNameToVerify(serverNameToVerify)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty,
    ) : CdkObject(cdkObject), TlsConfigProperty {
      /**
       * If you specify a server name, API Gateway uses it to verify the hostname on the
       * integration's certificate.
       *
       * The server name is also included in the TLS handshake to support Server Name Indication
       * (SNI) or virtual hosting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify)
       */
      override fun serverNameToVerify(): String? = unwrap(this).getServerNameToVerify()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TlsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty):
          TlsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TlsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsConfigProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty
    }
  }
}
