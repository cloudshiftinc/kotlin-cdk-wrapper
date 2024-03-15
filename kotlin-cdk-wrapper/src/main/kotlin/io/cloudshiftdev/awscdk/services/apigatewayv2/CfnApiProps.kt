@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object body;
 * CfnApiProps cfnApiProps = CfnApiProps.builder()
 * .apiKeySelectionExpression("apiKeySelectionExpression")
 * .basePath("basePath")
 * .body(body)
 * .bodyS3Location(BodyS3LocationProperty.builder()
 * .bucket("bucket")
 * .etag("etag")
 * .key("key")
 * .version("version")
 * .build())
 * .corsConfiguration(CorsProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build())
 * .credentialsArn("credentialsArn")
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .disableSchemaValidation(false)
 * .failOnWarnings(false)
 * .name("name")
 * .protocolType("protocolType")
 * .routeKey("routeKey")
 * .routeSelectionExpression("routeSelectionExpression")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .target("target")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html)
 */
public interface CfnApiProps {
  /**
   * An API key selection expression.
   *
   * Supported only for WebSocket APIs. See [API Key Selection
   * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression)
   */
  public fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

  /**
   * Specifies how to interpret the base path of the API during import.
   *
   * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To learn
   * more, see [Set the OpenAPI basePath
   * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
   * . Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath)
   */
  public fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
   */
  public fun body(): Any? = unwrap(this).getBody()

  /**
   * The S3 location of an OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
   */
  public fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  /**
   * A CORS configuration.
   *
   * Supported only for HTTP APIs. See [Configuring
   * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
   * information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
   */
  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

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
   */
  public fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  /**
   * The description of the API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   *
   * By default, clients can invoke your API with the default
   * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom
   * domain name to invoke your API, disable the default endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
   */
  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * Avoid validating models when creating a deployment.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
   */
  public fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   *
   * By default, API creation continues if a warning is encountered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
   */
  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   * The name of the API.
   *
   * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The API protocol.
   *
   * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition for
   * `Body` or `S3BodyLocation` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype)
   */
  public fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   * This property is part of quick create.
   *
   * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
   * route acts as a catch-all for any request made to your API, for a particular stage. The `$default`
   * route key can't be modified. You can add routes after creating the API, and you can update the
   * route keys of additional routes. Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey)
   */
  public fun routeKey(): String? = unwrap(this).getRouteKey()

  /**
   * The route selection expression for the API.
   *
   * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` . If
   * not provided, this will be the default for HTTP APIs. This property is required for WebSocket
   * APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression)
   */
  public fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * This property is part of quick create.
   *
   * Quick create produces an API with an integration, a default catch-all route, and a default
   * stage which is configured to automatically deploy changes. For HTTP integrations, specify a fully
   * qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will
   * be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target)
   */
  public fun target(): String? = unwrap(this).getTarget()

  /**
   * A version identifier for the API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version)
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [CfnApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeySelectionExpression An API key selection expression.
     * Supported only for WebSocket APIs. See [API Key Selection
     * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
     * .
     */
    public fun apiKeySelectionExpression(apiKeySelectionExpression: String)

    /**
     * @param basePath Specifies how to interpret the base path of the API during import.
     * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To
     * learn more, see [Set the OpenAPI basePath
     * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
     * . Supported only for HTTP APIs.
     */
    public fun basePath(basePath: String)

    /**
     * @param body The OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    public fun body(body: Any)

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    public fun bodyS3Location(bodyS3Location: IResolvable)

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty)

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d71807161d56ef0d717788230292af19650bde7c222e4e35bf6d11c0ca168")
    public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty.Builder.() -> Unit)

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty)

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a92d7b738439b927cb69162409c5b3e4ecfcae985c234a30a0dfa59485f4957")
    public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty.Builder.() -> Unit)

    /**
     * @param credentialsArn This property is part of quick create.
     * It specifies the credentials required for the integration, if any. For a Lambda integration,
     * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
     * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
     * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
     * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
     * only for HTTP APIs.
     */
    public fun credentialsArn(credentialsArn: String)

    /**
     * @param description The description of the API.
     */
    public fun description(description: String)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * @param disableSchemaValidation Avoid validating models when creating a deployment.
     * Supported only for WebSocket APIs.
     */
    public fun disableSchemaValidation(disableSchemaValidation: Boolean)

    /**
     * @param disableSchemaValidation Avoid validating models when creating a deployment.
     * Supported only for WebSocket APIs.
     */
    public fun disableSchemaValidation(disableSchemaValidation: IResolvable)

    /**
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered.
     * By default, API creation continues if a warning is encountered.
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered.
     * By default, API creation continues if a warning is encountered.
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * @param name The name of the API.
     * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
     */
    public fun name(name: String)

    /**
     * @param protocolType The API protocol.
     * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition
     * for `Body` or `S3BodyLocation` .
     */
    public fun protocolType(protocolType: String)

    /**
     * @param routeKey This property is part of quick create.
     * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
     * route acts as a catch-all for any request made to your API, for a particular stage. The
     * `$default` route key can't be modified. You can add routes after creating the API, and you can
     * update the route keys of additional routes. Supported only for HTTP APIs.
     */
    public fun routeKey(routeKey: String)

    /**
     * @param routeSelectionExpression The route selection expression for the API.
     * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` .
     * If not provided, this will be the default for HTTP APIs. This property is required for WebSocket
     * APIs.
     */
    public fun routeSelectionExpression(routeSelectionExpression: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param target This property is part of quick create.
     * Quick create produces an API with an integration, a default catch-all route, and a default
     * stage which is configured to automatically deploy changes. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The type of the
     * integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
     */
    public fun target(target: String)

    /**
     * @param version A version identifier for the API.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiProps.builder()

    /**
     * @param apiKeySelectionExpression An API key selection expression.
     * Supported only for WebSocket APIs. See [API Key Selection
     * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
     * .
     */
    override fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    /**
     * @param basePath Specifies how to interpret the base path of the API during import.
     * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To
     * learn more, see [Set the OpenAPI basePath
     * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
     * . Supported only for HTTP APIs.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param body The OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    override fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(CfnApi.BodyS3LocationProperty::unwrap))
    }

    /**
     * @param bodyS3Location The S3 location of an OpenAPI definition.
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d71807161d56ef0d717788230292af19650bde7c222e4e35bf6d11c0ca168")
    override fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty.Builder.() -> Unit):
        Unit = bodyS3Location(CfnApi.BodyS3LocationProperty(bodyS3Location))

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    override fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnApi.CorsProperty::unwrap))
    }

    /**
     * @param corsConfiguration A CORS configuration.
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a92d7b738439b927cb69162409c5b3e4ecfcae985c234a30a0dfa59485f4957")
    override fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty.Builder.() -> Unit): Unit
        = corsConfiguration(CfnApi.CorsProperty(corsConfiguration))

    /**
     * @param credentialsArn This property is part of quick create.
     * It specifies the credentials required for the integration, if any. For a Lambda integration,
     * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
     * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
     * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
     * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
     * only for HTTP APIs.
     */
    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    /**
     * @param description The description of the API.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    /**
     * @param disableSchemaValidation Avoid validating models when creating a deployment.
     * Supported only for WebSocket APIs.
     */
    override fun disableSchemaValidation(disableSchemaValidation: Boolean) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation)
    }

    /**
     * @param disableSchemaValidation Avoid validating models when creating a deployment.
     * Supported only for WebSocket APIs.
     */
    override fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation.let(IResolvable::unwrap))
    }

    /**
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered.
     * By default, API creation continues if a warning is encountered.
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
     * encountered.
     * By default, API creation continues if a warning is encountered.
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    /**
     * @param name The name of the API.
     * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param protocolType The API protocol.
     * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition
     * for `Body` or `S3BodyLocation` .
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * @param routeKey This property is part of quick create.
     * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
     * route acts as a catch-all for any request made to your API, for a particular stage. The
     * `$default` route key can't be modified. You can add routes after creating the API, and you can
     * update the route keys of additional routes. Supported only for HTTP APIs.
     */
    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    /**
     * @param routeSelectionExpression The route selection expression for the API.
     * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` .
     * If not provided, this will be the default for HTTP APIs. This property is required for WebSocket
     * APIs.
     */
    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param target This property is part of quick create.
     * Quick create produces an API with an integration, a default catch-all route, and a default
     * stage which is configured to automatically deploy changes. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The type of the
     * integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param version A version identifier for the API.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiProps,
  ) : CdkObject(cdkObject), CfnApiProps {
    /**
     * An API key selection expression.
     *
     * Supported only for WebSocket APIs. See [API Key Selection
     * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression)
     */
    override fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

    /**
     * Specifies how to interpret the base path of the API during import.
     *
     * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To
     * learn more, see [Set the OpenAPI basePath
     * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
     * . Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath)
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
     */
    override fun body(): Any? = unwrap(this).getBody()

    /**
     * The S3 location of an OpenAPI definition.
     *
     * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
     * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
     * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
     * doesn't support the combination of OpenAPI and CloudFormation resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
     */
    override fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

    /**
     * A CORS configuration.
     *
     * Supported only for HTTP APIs. See [Configuring
     * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
     */
    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

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
     */
    override fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

    /**
     * The description of the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
     */
    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    /**
     * Avoid validating models when creating a deployment.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
     */
    override fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

    /**
     * Specifies whether to rollback the API creation when a warning is encountered.
     *
     * By default, API creation continues if a warning is encountered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
     */
    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    /**
     * The name of the API.
     *
     * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The API protocol.
     *
     * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition
     * for `Body` or `S3BodyLocation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype)
     */
    override fun protocolType(): String? = unwrap(this).getProtocolType()

    /**
     * This property is part of quick create.
     *
     * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
     * route acts as a catch-all for any request made to your API, for a particular stage. The
     * `$default` route key can't be modified. You can add routes after creating the API, and you can
     * update the route keys of additional routes. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey)
     */
    override fun routeKey(): String? = unwrap(this).getRouteKey()

    /**
     * The route selection expression for the API.
     *
     * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` .
     * If not provided, this will be the default for HTTP APIs. This property is required for WebSocket
     * APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression)
     */
    override fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * This property is part of quick create.
     *
     * Quick create produces an API with an integration, a default catch-all route, and a default
     * stage which is configured to automatically deploy changes. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The type of the
     * integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target)
     */
    override fun target(): String? = unwrap(this).getTarget()

    /**
     * A version identifier for the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version)
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiProps):
        CfnApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.CfnApiProps
  }
}
