package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * An API key selection expression.
   */
  public open fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

  /**
   * An API key selection expression.
   */
  public open fun apiKeySelectionExpression(`value`: String) {
    unwrap(this).setApiKeySelectionExpression(`value`)
  }

  /**
   * The default endpoint for an API.
   *
   * For example: `https://abcdef.execute-api.us-west-2.amazonaws.com` .
   */
  public open fun attrApiEndpoint(): String = unwrap(this).getAttrApiEndpoint()

  /**
   * The API identifier.
   */
  public open fun attrApiId(): String = unwrap(this).getAttrApiId()

  /**
   * Specifies how to interpret the base path of the API during import.
   */
  public open fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * Specifies how to interpret the base path of the API during import.
   */
  public open fun basePath(`value`: String) {
    unwrap(this).setBasePath(`value`)
  }

  /**
   * The OpenAPI definition.
   */
  public open fun body(): Any? = unwrap(this).getBody()

  /**
   * The OpenAPI definition.
   */
  public open fun body(`value`: Any) {
    unwrap(this).setBody(`value`)
  }

  /**
   * The S3 location of an OpenAPI definition.
   */
  public open fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  /**
   * The S3 location of an OpenAPI definition.
   */
  public open fun bodyS3Location(`value`: IResolvable) {
    unwrap(this).setBodyS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The S3 location of an OpenAPI definition.
   */
  public open fun bodyS3Location(`value`: BodyS3LocationProperty) {
    unwrap(this).setBodyS3Location(`value`.let(BodyS3LocationProperty::unwrap))
  }

  /**
   * The S3 location of an OpenAPI definition.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("516fd4018fecd77062130379450ecc7c7c2af21005bc60eb117136b26b528d73")
  public open fun bodyS3Location(`value`: BodyS3LocationProperty.Builder.() -> Unit): Unit =
      bodyS3Location(BodyS3LocationProperty(`value`))

  /**
   * A CORS configuration.
   */
  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  /**
   * A CORS configuration.
   */
  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A CORS configuration.
   */
  public open fun corsConfiguration(`value`: CorsProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsProperty::unwrap))
  }

  /**
   * A CORS configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ab639bc3144a84f8657719bf89a43f1c70dbab0f8b7845a837715446cb569e0")
  public open fun corsConfiguration(`value`: CorsProperty.Builder.() -> Unit): Unit =
      corsConfiguration(CorsProperty(`value`))

  /**
   * This property is part of quick create.
   */
  public open fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  /**
   * This property is part of quick create.
   */
  public open fun credentialsArn(`value`: String) {
    unwrap(this).setCredentialsArn(`value`)
  }

  /**
   * The description of the API.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the API.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(`value`: Boolean) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(`value`: IResolvable) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * Avoid validating models when creating a deployment.
   */
  public open fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

  /**
   * Avoid validating models when creating a deployment.
   */
  public open fun disableSchemaValidation(`value`: Boolean) {
    unwrap(this).setDisableSchemaValidation(`value`)
  }

  /**
   * Avoid validating models when creating a deployment.
   */
  public open fun disableSchemaValidation(`value`: IResolvable) {
    unwrap(this).setDisableSchemaValidation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   */
  public open fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   */
  public open fun failOnWarnings(`value`: Boolean) {
    unwrap(this).setFailOnWarnings(`value`)
  }

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   */
  public open fun failOnWarnings(`value`: IResolvable) {
    unwrap(this).setFailOnWarnings(`value`.let(IResolvable::unwrap))
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
   * The name of the API.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the API.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The API protocol.
   */
  public open fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   * The API protocol.
   */
  public open fun protocolType(`value`: String) {
    unwrap(this).setProtocolType(`value`)
  }

  /**
   * This property is part of quick create.
   */
  public open fun routeKey(): String? = unwrap(this).getRouteKey()

  /**
   * This property is part of quick create.
   */
  public open fun routeKey(`value`: String) {
    unwrap(this).setRouteKey(`value`)
  }

  /**
   * The route selection expression for the API.
   */
  public open fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  /**
   * The route selection expression for the API.
   */
  public open fun routeSelectionExpression(`value`: String) {
    unwrap(this).setRouteSelectionExpression(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * This property is part of quick create.
   */
  public open fun target(): String? = unwrap(this).getTarget()

  /**
   * This property is part of quick create.
   */
  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  /**
   * A version identifier for the API.
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * A version identifier for the API.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An API key selection expression.
     *
     * Supported only for WebSocket APIs. See [API Key Selection
     * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression)
     * @param apiKeySelectionExpression An API key selection expression. 
     */
    public fun apiKeySelectionExpression(apiKeySelectionExpression: String)

    /**
     * Specifies how to interpret the base path of the API during import.
     *
     * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To
     * learn more, see [Set the OpenAPI basePath
     * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
     * . Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath)
     * @param basePath Specifies how to interpret the base path of the API during import. 
     */
    public fun basePath(basePath: String)

    /**
     * The OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
     * @param body The OpenAPI definition. 
     */
    public fun body(body: Any)

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    public fun bodyS3Location(bodyS3Location: IResolvable)

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    public fun bodyS3Location(bodyS3Location: BodyS3LocationProperty)

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a90237a320cf324f8dd5e9a6a50761ea24608581d85aecde0a7e6bc58d2a5eb")
    public fun bodyS3Location(bodyS3Location: BodyS3LocationProperty.Builder.() -> Unit)

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    public fun corsConfiguration(corsConfiguration: CorsProperty)

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f803d77858b6f8b040301865bed6b151f6f89b883c041b1bb83acae6a32dd00")
    public fun corsConfiguration(corsConfiguration: CorsProperty.Builder.() -> Unit)

    /**
     * This property is part of quick create.
     *
     * It specifies the credentials required for the integration, if any. For a Lambda integration,
     * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
     * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
     * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
     * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
     * only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn)
     * @param credentialsArn This property is part of quick create. 
     */
    public fun credentialsArn(credentialsArn: String)

    /**
     * The description of the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description)
     * @param description The description of the API. 
     */
    public fun description(description: String)

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * Avoid validating models when creating a deployment.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
     * @param disableSchemaValidation Avoid validating models when creating a deployment. 
     */
    public fun disableSchemaValidation(disableSchemaValidation: Boolean)

    /**
     * Avoid validating models when creating a deployment.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
     * @param disableSchemaValidation Avoid validating models when creating a deployment. 
     */
    public fun disableSchemaValidation(disableSchemaValidation: IResolvable)

    /**
     * Specifies whether to rollback the API creation when a warning is encountered.
     *
     * By default, API creation continues if a warning is encountered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered. 
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * Specifies whether to rollback the API creation when a warning is encountered.
     *
     * By default, API creation continues if a warning is encountered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered. 
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * The name of the API.
     *
     * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name)
     * @param name The name of the API. 
     */
    public fun name(name: String)

    /**
     * The API protocol.
     *
     * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition
     * for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype)
     * @param protocolType The API protocol. 
     */
    public fun protocolType(protocolType: String)

    /**
     * This property is part of quick create.
     *
     * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
     * route acts as a catch-all for any request made to your API, for a particular stage. The
     * `$default` route key can't be modified. You can add routes after creating the API, and you can
     * update the route keys of additional routes. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey)
     * @param routeKey This property is part of quick create. 
     */
    public fun routeKey(routeKey: String)

    /**
     * The route selection expression for the API.
     *
     * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` .
     * If not provided, this will be the default for HTTP APIs. This property is required for WebSocket
     * APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression)
     * @param routeSelectionExpression The route selection expression for the API. 
     */
    public fun routeSelectionExpression(routeSelectionExpression: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * This property is part of quick create.
     *
     * Quick create produces an API with an integration, a default catch-all route, and a default
     * stage which is configured to automatically deploy changes. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The type of the
     * integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target)
     * @param target This property is part of quick create. 
     */
    public fun target(target: String)

    /**
     * A version identifier for the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version)
     * @param version A version identifier for the API. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApi.Builder.create(scope, id)

    /**
     * An API key selection expression.
     *
     * Supported only for WebSocket APIs. See [API Key Selection
     * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression)
     * @param apiKeySelectionExpression An API key selection expression. 
     */
    override fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    /**
     * Specifies how to interpret the base path of the API during import.
     *
     * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To
     * learn more, see [Set the OpenAPI basePath
     * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
     * . Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath)
     * @param basePath Specifies how to interpret the base path of the API during import. 
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * The OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
     * @param body The OpenAPI definition. 
     */
    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    override fun bodyS3Location(bodyS3Location: BodyS3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(BodyS3LocationProperty::unwrap))
    }

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     * @param bodyS3Location The S3 location of an OpenAPI definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a90237a320cf324f8dd5e9a6a50761ea24608581d85aecde0a7e6bc58d2a5eb")
    override fun bodyS3Location(bodyS3Location: BodyS3LocationProperty.Builder.() -> Unit): Unit =
        bodyS3Location(BodyS3LocationProperty(bodyS3Location))

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    override fun corsConfiguration(corsConfiguration: CorsProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsProperty::unwrap))
    }

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     * @param corsConfiguration A CORS configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f803d77858b6f8b040301865bed6b151f6f89b883c041b1bb83acae6a32dd00")
    override fun corsConfiguration(corsConfiguration: CorsProperty.Builder.() -> Unit): Unit =
        corsConfiguration(CorsProperty(corsConfiguration))

    /**
     * This property is part of quick create.
     *
     * It specifies the credentials required for the integration, if any. For a Lambda integration,
     * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
     * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
     * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
     * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
     * only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn)
     * @param credentialsArn This property is part of quick create. 
     */
    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    /**
     * The description of the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description)
     * @param description The description of the API. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    /**
     * Avoid validating models when creating a deployment.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
     * @param disableSchemaValidation Avoid validating models when creating a deployment. 
     */
    override fun disableSchemaValidation(disableSchemaValidation: Boolean) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation)
    }

    /**
     * Avoid validating models when creating a deployment.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
     * @param disableSchemaValidation Avoid validating models when creating a deployment. 
     */
    override fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether to rollback the API creation when a warning is encountered.
     *
     * By default, API creation continues if a warning is encountered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered. 
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * Specifies whether to rollback the API creation when a warning is encountered.
     *
     * By default, API creation continues if a warning is encountered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered. 
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    /**
     * The name of the API.
     *
     * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name)
     * @param name The name of the API. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The API protocol.
     *
     * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition
     * for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype)
     * @param protocolType The API protocol. 
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * This property is part of quick create.
     *
     * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
     * route acts as a catch-all for any request made to your API, for a particular stage. The
     * `$default` route key can't be modified. You can add routes after creating the API, and you can
     * update the route keys of additional routes. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey)
     * @param routeKey This property is part of quick create. 
     */
    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    /**
     * The route selection expression for the API.
     *
     * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` .
     * If not provided, this will be the default for HTTP APIs. This property is required for WebSocket
     * APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression)
     * @param routeSelectionExpression The route selection expression for the API. 
     */
    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * This property is part of quick create.
     *
     * Quick create produces an API with an integration, a default catch-all route, and a default
     * stage which is configured to automatically deploy changes. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The type of the
     * integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target)
     * @param target This property is part of quick create. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * A version identifier for the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version)
     * @param version A version identifier for the API. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi): CfnApi =
        CfnApi(cdkObject)

    internal fun unwrap(wrapped: CfnApi): software.amazon.awscdk.services.apigatewayv2.CfnApi =
        wrapped.cdkObject
  }

  public interface BodyS3LocationProperty {
    /**
     * The S3 bucket that contains the OpenAPI definition to import.
     *
     * Required if you specify a `BodyS3Location` for an API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The Etag of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-etag)
     */
    public fun etag(): String? = unwrap(this).getEtag()

    /**
     * The key of the S3 object.
     *
     * Required if you specify a `BodyS3Location` for an API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The version of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [BodyS3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The S3 bucket that contains the OpenAPI definition to import.
       * Required if you specify a `BodyS3Location` for an API.
       */
      public fun bucket(bucket: String)

      /**
       * @param etag The Etag of the S3 object.
       */
      public fun etag(etag: String)

      /**
       * @param key The key of the S3 object.
       * Required if you specify a `BodyS3Location` for an API.
       */
      public fun key(key: String)

      /**
       * @param version The version of the S3 object.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty.builder()

      /**
       * @param bucket The S3 bucket that contains the OpenAPI definition to import.
       * Required if you specify a `BodyS3Location` for an API.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param etag The Etag of the S3 object.
       */
      override fun etag(etag: String) {
        cdkBuilder.etag(etag)
      }

      /**
       * @param key The key of the S3 object.
       * Required if you specify a `BodyS3Location` for an API.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The version of the S3 object.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty,
    ) : BodyS3LocationProperty {
      /**
       * The S3 bucket that contains the OpenAPI definition to import.
       *
       * Required if you specify a `BodyS3Location` for an API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * The Etag of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-etag)
       */
      override fun etag(): String? = unwrap(this).getEtag()

      /**
       * The key of the S3 object.
       *
       * Required if you specify a `BodyS3Location` for an API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The version of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html#cfn-apigatewayv2-api-bodys3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BodyS3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty):
          BodyS3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyS3LocationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CorsProperty {
    /**
     * Specifies whether credentials are included in the CORS request.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials)
     */
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    /**
     * Represents a collection of allowed headers.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders)
     */
    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    /**
     * Represents a collection of allowed HTTP methods.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods)
     */
    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    /**
     * Represents a collection of allowed origins.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins)
     */
    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    /**
     * Represents a collection of exposed headers.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders)
     */
    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    /**
     * The number of seconds that the browser should cache preflight request results.
     *
     * Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage)
     */
    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCredentials Specifies whether credentials are included in the CORS request.
       * Supported only for HTTP APIs.
       */
      public fun allowCredentials(allowCredentials: Boolean)

      /**
       * @param allowCredentials Specifies whether credentials are included in the CORS request.
       * Supported only for HTTP APIs.
       */
      public fun allowCredentials(allowCredentials: IResolvable)

      /**
       * @param allowHeaders Represents a collection of allowed headers.
       * Supported only for HTTP APIs.
       */
      public fun allowHeaders(allowHeaders: List<String>)

      /**
       * @param allowHeaders Represents a collection of allowed headers.
       * Supported only for HTTP APIs.
       */
      public fun allowHeaders(vararg allowHeaders: String)

      /**
       * @param allowMethods Represents a collection of allowed HTTP methods.
       * Supported only for HTTP APIs.
       */
      public fun allowMethods(allowMethods: List<String>)

      /**
       * @param allowMethods Represents a collection of allowed HTTP methods.
       * Supported only for HTTP APIs.
       */
      public fun allowMethods(vararg allowMethods: String)

      /**
       * @param allowOrigins Represents a collection of allowed origins.
       * Supported only for HTTP APIs.
       */
      public fun allowOrigins(allowOrigins: List<String>)

      /**
       * @param allowOrigins Represents a collection of allowed origins.
       * Supported only for HTTP APIs.
       */
      public fun allowOrigins(vararg allowOrigins: String)

      /**
       * @param exposeHeaders Represents a collection of exposed headers.
       * Supported only for HTTP APIs.
       */
      public fun exposeHeaders(exposeHeaders: List<String>)

      /**
       * @param exposeHeaders Represents a collection of exposed headers.
       * Supported only for HTTP APIs.
       */
      public fun exposeHeaders(vararg exposeHeaders: String)

      /**
       * @param maxAge The number of seconds that the browser should cache preflight request
       * results.
       * Supported only for HTTP APIs.
       */
      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty.builder()

      /**
       * @param allowCredentials Specifies whether credentials are included in the CORS request.
       * Supported only for HTTP APIs.
       */
      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      /**
       * @param allowCredentials Specifies whether credentials are included in the CORS request.
       * Supported only for HTTP APIs.
       */
      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param allowHeaders Represents a collection of allowed headers.
       * Supported only for HTTP APIs.
       */
      override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      /**
       * @param allowHeaders Represents a collection of allowed headers.
       * Supported only for HTTP APIs.
       */
      override fun allowHeaders(vararg allowHeaders: String): Unit =
          allowHeaders(allowHeaders.toList())

      /**
       * @param allowMethods Represents a collection of allowed HTTP methods.
       * Supported only for HTTP APIs.
       */
      override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      /**
       * @param allowMethods Represents a collection of allowed HTTP methods.
       * Supported only for HTTP APIs.
       */
      override fun allowMethods(vararg allowMethods: String): Unit =
          allowMethods(allowMethods.toList())

      /**
       * @param allowOrigins Represents a collection of allowed origins.
       * Supported only for HTTP APIs.
       */
      override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      /**
       * @param allowOrigins Represents a collection of allowed origins.
       * Supported only for HTTP APIs.
       */
      override fun allowOrigins(vararg allowOrigins: String): Unit =
          allowOrigins(allowOrigins.toList())

      /**
       * @param exposeHeaders Represents a collection of exposed headers.
       * Supported only for HTTP APIs.
       */
      override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      /**
       * @param exposeHeaders Represents a collection of exposed headers.
       * Supported only for HTTP APIs.
       */
      override fun exposeHeaders(vararg exposeHeaders: String): Unit =
          exposeHeaders(exposeHeaders.toList())

      /**
       * @param maxAge The number of seconds that the browser should cache preflight request
       * results.
       * Supported only for HTTP APIs.
       */
      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty,
    ) : CorsProperty {
      /**
       * Specifies whether credentials are included in the CORS request.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials)
       */
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      /**
       * Represents a collection of allowed headers.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders)
       */
      override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

      /**
       * Represents a collection of allowed HTTP methods.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods)
       */
      override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

      /**
       * Represents a collection of allowed origins.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins)
       */
      override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

      /**
       * Represents a collection of exposed headers.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders)
       */
      override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

      /**
       * The number of seconds that the browser should cache preflight request results.
       *
       * Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage)
       */
      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty):
          CorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
