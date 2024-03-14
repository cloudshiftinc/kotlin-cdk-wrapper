package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer,
) : CfnResource(cdkObject), IInspectable {
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
   * The authorizer ID.
   */
  public open fun attrAuthorizerId(): String = unwrap(this).getAttrAuthorizerId()

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   */
  public open fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   */
  public open fun authorizerCredentialsArn(`value`: String) {
    unwrap(this).setAuthorizerCredentialsArn(`value`)
  }

  /**
   * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
   */
  public open fun authorizerPayloadFormatVersion(): String? =
      unwrap(this).getAuthorizerPayloadFormatVersion()

  /**
   * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
   */
  public open fun authorizerPayloadFormatVersion(`value`: String) {
    unwrap(this).setAuthorizerPayloadFormatVersion(`value`)
  }

  /**
   * The time to live (TTL) for cached authorizer results, in seconds.
   */
  public open fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  /**
   * The time to live (TTL) for cached authorizer results, in seconds.
   */
  public open fun authorizerResultTtlInSeconds(`value`: Number) {
    unwrap(this).setAuthorizerResultTtlInSeconds(`value`)
  }

  /**
   * The authorizer type.
   */
  public open fun authorizerType(): String = unwrap(this).getAuthorizerType()

  /**
   * The authorizer type.
   */
  public open fun authorizerType(`value`: String) {
    unwrap(this).setAuthorizerType(`value`)
  }

  /**
   * The authorizer's Uniform Resource Identifier (URI).
   */
  public open fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  /**
   * The authorizer's Uniform Resource Identifier (URI).
   */
  public open fun authorizerUri(`value`: String) {
    unwrap(this).setAuthorizerUri(`value`)
  }

  /**
   * Specifies whether a Lambda authorizer returns a response in a simple format.
   */
  public open fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

  /**
   * Specifies whether a Lambda authorizer returns a response in a simple format.
   */
  public open fun enableSimpleResponses(`value`: Boolean) {
    unwrap(this).setEnableSimpleResponses(`value`)
  }

  /**
   * Specifies whether a Lambda authorizer returns a response in a simple format.
   */
  public open fun enableSimpleResponses(`value`: IResolvable) {
    unwrap(this).setEnableSimpleResponses(`value`.let(IResolvable::unwrap))
  }

  /**
   * The identity source for which authorization is requested.
   */
  public open fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  /**
   * The identity source for which authorization is requested.
   */
  public open fun identitySource(`value`: List<String>) {
    unwrap(this).setIdentitySource(`value`)
  }

  /**
   * The identity source for which authorization is requested.
   */
  public open fun identitySource(vararg `value`: String): Unit = identitySource(`value`.toList())

  /**
   * This parameter is not used.
   */
  public open fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  /**
   * This parameter is not used.
   */
  public open fun identityValidationExpression(`value`: String) {
    unwrap(this).setIdentityValidationExpression(`value`)
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
   * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
   */
  public open fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

  /**
   * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
   */
  public open fun jwtConfiguration(`value`: IResolvable) {
    unwrap(this).setJwtConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
   */
  public open fun jwtConfiguration(`value`: JWTConfigurationProperty) {
    unwrap(this).setJwtConfiguration(`value`.let(JWTConfigurationProperty::unwrap))
  }

  /**
   * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7749c24721a741ada0617685d46a66f9ad0a0e7684058bd9e57e5d7410224bc2")
  public open fun jwtConfiguration(`value`: JWTConfigurationProperty.Builder.() -> Unit): Unit =
      jwtConfiguration(JWTConfigurationProperty(`value`))

  /**
   * The name of the authorizer.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the authorizer.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null. Supported only for
     * `REQUEST` authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizercredentialsarn)
     * @param authorizerCredentialsArn Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer. 
     */
    public fun authorizerCredentialsArn(authorizerCredentialsArn: String)

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerpayloadformatversion)
     * @param authorizerPayloadFormatVersion Specifies the format of the payload sent to an HTTP API
     * Lambda authorizer. 
     */
    public fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String)

    /**
     * The time to live (TTL) for cached authorizer results, in seconds.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway
     * caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API
     * Lambda authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerresultttlinseconds)
     * @param authorizerResultTtlInSeconds The time to live (TTL) for cached authorizer results, in
     * seconds. 
     */
    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

    /**
     * The authorizer type.
     *
     * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to
     * use JSON Web Tokens (supported only for HTTP APIs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizertype)
     * @param authorizerType The authorizer type. 
     */
    public fun authorizerType(authorizerType: String)

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For `REQUEST` authorizers, this must be a well-formed Lambda function URI, for example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has this
     * form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where *{region}* is the
     * same as the region hosting the Lambda function, path indicates that the remaining substring in
     * the URI should be treated as the path to the resource, including the initial `/` . For Lambda
     * functions, this is usually of the form `/2015-03-31/functions/[FunctionARN]/invocations` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizeruri)
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). 
     */
    public fun authorizerUri(authorizerUri: String)

    /**
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-enablesimpleresponses)
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    /**
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-enablesimpleresponses)
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    public fun enableSimpleResponses(enableSimpleResponses: IResolvable)

    /**
     * The identity source for which authorization is requested.
     *
     * For a `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     * expressions of the specified request parameters. The identity source can be headers, query
     * string parameters, stage variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value is
     * route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use
     * selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     * `$request.querystring.Name` . These parameters are used to perform runtime validation for
     * Lambda-based authorizers by verifying all of the identity-related request parameters are present
     * in the request, not null, and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling
     * the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching
     * is enabled. To learn more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * The identity source for which authorization is requested.
     *
     * For a `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     * expressions of the specified request parameters. The identity source can be headers, query
     * string parameters, stage variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value is
     * route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use
     * selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     * `$request.querystring.Name` . These parameters are used to perform runtime validation for
     * Lambda-based authorizers by verifying all of the identity-related request parameters are present
     * in the request, not null, and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling
     * the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching
     * is enabled. To learn more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * This parameter is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identityvalidationexpression)
     * @param identityValidationExpression This parameter is not used. 
     */
    public fun identityValidationExpression(identityValidationExpression: String)

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    public fun jwtConfiguration(jwtConfiguration: IResolvable)

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    public fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty)

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e27125f0db7456c147dc77c030c5a26fe0b613bb82de1d4a8a9d63760df2af6c")
    public fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-name)
     * @param name The name of the authorizer. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null. Supported only for
     * `REQUEST` authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizercredentialsarn)
     * @param authorizerCredentialsArn Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer. 
     */
    override fun authorizerCredentialsArn(authorizerCredentialsArn: String) {
      cdkBuilder.authorizerCredentialsArn(authorizerCredentialsArn)
    }

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerpayloadformatversion)
     * @param authorizerPayloadFormatVersion Specifies the format of the payload sent to an HTTP API
     * Lambda authorizer. 
     */
    override fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String) {
      cdkBuilder.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion)
    }

    /**
     * The time to live (TTL) for cached authorizer results, in seconds.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway
     * caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API
     * Lambda authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerresultttlinseconds)
     * @param authorizerResultTtlInSeconds The time to live (TTL) for cached authorizer results, in
     * seconds. 
     */
    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    /**
     * The authorizer type.
     *
     * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to
     * use JSON Web Tokens (supported only for HTTP APIs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizertype)
     * @param authorizerType The authorizer type. 
     */
    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For `REQUEST` authorizers, this must be a well-formed Lambda function URI, for example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has this
     * form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where *{region}* is the
     * same as the region hosting the Lambda function, path indicates that the remaining substring in
     * the URI should be treated as the path to the resource, including the initial `/` . For Lambda
     * functions, this is usually of the form `/2015-03-31/functions/[FunctionARN]/invocations` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizeruri)
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). 
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-enablesimpleresponses)
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-enablesimpleresponses)
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    override fun enableSimpleResponses(enableSimpleResponses: IResolvable) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses.let(IResolvable::unwrap))
    }

    /**
     * The identity source for which authorization is requested.
     *
     * For a `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     * expressions of the specified request parameters. The identity source can be headers, query
     * string parameters, stage variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value is
     * route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use
     * selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     * `$request.querystring.Name` . These parameters are used to perform runtime validation for
     * Lambda-based authorizers by verifying all of the identity-related request parameters are present
     * in the request, not null, and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling
     * the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching
     * is enabled. To learn more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * For a `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     * expressions of the specified request parameters. The identity source can be headers, query
     * string parameters, stage variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value is
     * route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use
     * selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     * `$request.querystring.Name` . These parameters are used to perform runtime validation for
     * Lambda-based authorizers by verifying all of the identity-related request parameters are present
     * in the request, not null, and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling
     * the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching
     * is enabled. To learn more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * This parameter is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identityvalidationexpression)
     * @param identityValidationExpression This parameter is not used. 
     */
    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    override fun jwtConfiguration(jwtConfiguration: IResolvable) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    override fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(JWTConfigurationProperty::unwrap))
    }

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e27125f0db7456c147dc77c030c5a26fe0b613bb82de1d4a8a9d63760df2af6c")
    override fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty.Builder.() -> Unit):
        Unit = jwtConfiguration(JWTConfigurationProperty(jwtConfiguration))

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-name)
     * @param name The name of the authorizer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer):
        CfnAuthorizer = CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer = wrapped.cdkObject
  }

  public interface JWTConfigurationProperty {
    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
     * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) . Required
     * for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience)
     */
    public fun audience(): List<String> = unwrap(this).getAudience() ?: emptyList()

    /**
     * The base domain of the identity provider that issues JSON Web Tokens.
     *
     * For example, an Amazon Cognito user pool has the following format: `https://cognito-idp.
     * {region} .amazonaws.com/ {userPoolId}` . Required for the `JWT` authorizer type. Supported only
     * for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer)
     */
    public fun issuer(): String? = unwrap(this).getIssuer()

    /**
     * A builder for [JWTConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audience A list of the intended recipients of the JWT.
       * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
       * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) .
       * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
       */
      public fun audience(audience: List<String>)

      /**
       * @param audience A list of the intended recipients of the JWT.
       * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
       * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) .
       * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
       */
      public fun audience(vararg audience: String)

      /**
       * @param issuer The base domain of the identity provider that issues JSON Web Tokens.
       * For example, an Amazon Cognito user pool has the following format: `https://cognito-idp.
       * {region} .amazonaws.com/ {userPoolId}` . Required for the `JWT` authorizer type. Supported
       * only for HTTP APIs.
       */
      public fun issuer(issuer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty.builder()

      /**
       * @param audience A list of the intended recipients of the JWT.
       * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
       * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) .
       * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
       */
      override fun audience(audience: List<String>) {
        cdkBuilder.audience(audience)
      }

      /**
       * @param audience A list of the intended recipients of the JWT.
       * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
       * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) .
       * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
       */
      override fun audience(vararg audience: String): Unit = audience(audience.toList())

      /**
       * @param issuer The base domain of the identity provider that issues JSON Web Tokens.
       * For example, an Amazon Cognito user pool has the following format: `https://cognito-idp.
       * {region} .amazonaws.com/ {userPoolId}` . Required for the `JWT` authorizer type. Supported
       * only for HTTP APIs.
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty,
    ) : CdkObject(cdkObject), JWTConfigurationProperty {
      /**
       * A list of the intended recipients of the JWT.
       *
       * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
       * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) .
       * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience)
       */
      override fun audience(): List<String> = unwrap(this).getAudience() ?: emptyList()

      /**
       * The base domain of the identity provider that issues JSON Web Tokens.
       *
       * For example, an Amazon Cognito user pool has the following format: `https://cognito-idp.
       * {region} .amazonaws.com/ {userPoolId}` . Required for the `JWT` authorizer type. Supported
       * only for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer)
       */
      override fun issuer(): String? = unwrap(this).getIssuer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JWTConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty):
          JWTConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JWTConfigurationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty
    }
  }
}
