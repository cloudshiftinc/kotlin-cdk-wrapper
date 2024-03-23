@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAuthorizer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnAuthorizerProps cfnAuthorizerProps = CfnAuthorizerProps.builder()
 * .apiId("apiId")
 * .authorizerType("authorizerType")
 * .name("name")
 * // the properties below are optional
 * .authorizerCredentialsArn("authorizerCredentialsArn")
 * .authorizerPayloadFormatVersion("authorizerPayloadFormatVersion")
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .enableSimpleResponses(false)
 * .identitySource(List.of("identitySource"))
 * .identityValidationExpression("identityValidationExpression")
 * .jwtConfiguration(JWTConfigurationProperty.builder()
 * .audience(List.of("audience"))
 * .issuer("issuer")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html)
 */
public interface CfnAuthorizerProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-apiid)
   */
  public fun apiId(): String

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   *
   * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
   * use resource-based permissions on the Lambda function, specify null. Supported only for `REQUEST`
   * authorizers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizercredentialsarn)
   */
  public fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

  /**
   * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
   *
   * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn more,
   * see [Working with AWS Lambda authorizers for HTTP
   * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerpayloadformatversion)
   */
  public fun authorizerPayloadFormatVersion(): String? =
      unwrap(this).getAuthorizerPayloadFormatVersion()

  /**
   * The time to live (TTL) for cached authorizer results, in seconds.
   *
   * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway caches
   * authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API Lambda
   * authorizers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerresultttlinseconds)
   */
  public fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  /**
   * The authorizer type.
   *
   * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to use
   * JSON Web Tokens (supported only for HTTP APIs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizertype)
   */
  public fun authorizerType(): String

  /**
   * The authorizer's Uniform Resource Identifier (URI).
   *
   * For `REQUEST` authorizers, this must be a well-formed Lambda function URI, for example,
   * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
   * *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has this
   * form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where *{region}* is the
   * same as the region hosting the Lambda function, path indicates that the remaining substring in the
   * URI should be treated as the path to the resource, including the initial `/` . For Lambda
   * functions, this is usually of the form `/2015-03-31/functions/[FunctionARN]/invocations` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizeruri)
   */
  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  /**
   * Specifies whether a Lambda authorizer returns a response in a simple format.
   *
   * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
   * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn more,
   * see [Working with AWS Lambda authorizers for HTTP
   * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-enablesimpleresponses)
   */
  public fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

  /**
   * The identity source for which authorization is requested.
   *
   * For a `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
   * expressions of the specified request parameters. The identity source can be headers, query string
   * parameters, stage variables, and context parameters. For example, if an Auth header and a Name
   * query string parameter are defined as identity sources, this value is route.request.header.Auth,
   * route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use selection expressions
   * prefixed with `$` , for example, `$request.header.Auth` , `$request.querystring.Name` . These
   * parameters are used to perform runtime validation for Lambda-based authorizers by verifying all of
   * the identity-related request parameters are present in the request, not null, and non-empty. Only
   * when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns
   * a 401 Unauthorized response without calling the Lambda function. For HTTP APIs, identity sources
   * are also used as the cache key when caching is enabled. To learn more, see [Working with AWS
   * Lambda authorizers for HTTP
   * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
   * .
   *
   * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
   * inbound requests. Currently only header-based and query parameter-based selections are supported,
   * for example `$request.header.Authorization` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
   */
  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  /**
   * This parameter is not used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identityvalidationexpression)
   */
  public fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  /**
   * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
   *
   * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
   */
  public fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

  /**
   * The name of the authorizer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param authorizerCredentialsArn Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer.
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null. Supported only for
     * `REQUEST` authorizers.
     */
    public fun authorizerCredentialsArn(authorizerCredentialsArn: String)

    /**
     * @param authorizerPayloadFormatVersion Specifies the format of the payload sent to an HTTP API
     * Lambda authorizer.
     * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    public fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String)

    /**
     * @param authorizerResultTtlInSeconds The time to live (TTL) for cached authorizer results, in
     * seconds.
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway
     * caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API
     * Lambda authorizers.
     */
    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

    /**
     * @param authorizerType The authorizer type. 
     * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to
     * use JSON Web Tokens (supported only for HTTP APIs).
     */
    public fun authorizerType(authorizerType: String)

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers, this must be a well-formed Lambda function URI, for example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has this
     * form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where *{region}* is the
     * same as the region hosting the Lambda function, path indicates that the remaining substring in
     * the URI should be treated as the path to the resource, including the initial `/` . For Lambda
     * functions, this is usually of the form `/2015-03-31/functions/[FunctionARN]/invocations` .
     */
    public fun authorizerUri(authorizerUri: String)

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    public fun enableSimpleResponses(enableSimpleResponses: IResolvable)

    /**
     * @param identitySource The identity source for which authorization is requested.
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
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested.
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
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * @param identityValidationExpression This parameter is not used.
     */
    public fun identityValidationExpression(identityValidationExpression: String)

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    public fun jwtConfiguration(jwtConfiguration: IResolvable)

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    public fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty)

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b11f8a5034f85dc691738f6d297ffd0d7c87ee055ef978e9caf722477f84da16")
    public
        fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the authorizer. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param authorizerCredentialsArn Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer.
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null. Supported only for
     * `REQUEST` authorizers.
     */
    override fun authorizerCredentialsArn(authorizerCredentialsArn: String) {
      cdkBuilder.authorizerCredentialsArn(authorizerCredentialsArn)
    }

    /**
     * @param authorizerPayloadFormatVersion Specifies the format of the payload sent to an HTTP API
     * Lambda authorizer.
     * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    override fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String) {
      cdkBuilder.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion)
    }

    /**
     * @param authorizerResultTtlInSeconds The time to live (TTL) for cached authorizer results, in
     * seconds.
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway
     * caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API
     * Lambda authorizers.
     */
    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    /**
     * @param authorizerType The authorizer type. 
     * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to
     * use JSON Web Tokens (supported only for HTTP APIs).
     */
    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers, this must be a well-formed Lambda function URI, for example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has this
     * form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where *{region}* is the
     * same as the region hosting the Lambda function, path indicates that the remaining substring in
     * the URI should be treated as the path to the resource, including the initial `/` . For Lambda
     * functions, this is usually of the form `/2015-03-31/functions/[FunctionARN]/invocations` .
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * By default, a Lambda authorizer must return an IAM policy. If enabled, the Lambda authorizer
     * can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     */
    override fun enableSimpleResponses(enableSimpleResponses: IResolvable) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses.let(IResolvable::unwrap))
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
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
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
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
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * @param identityValidationExpression This parameter is not used.
     */
    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    override fun jwtConfiguration(jwtConfiguration: IResolvable) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    override fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(CfnAuthorizer.JWTConfigurationProperty::unwrap))
    }

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     * authorizer.
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b11f8a5034f85dc691738f6d297ffd0d7c87ee055ef978e9caf722477f84da16")
    override
        fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit):
        Unit = jwtConfiguration(CfnAuthorizer.JWTConfigurationProperty(jwtConfiguration))

    /**
     * @param name The name of the authorizer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps,
  ) : CdkObject(cdkObject), CfnAuthorizerProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null. Supported only for
     * `REQUEST` authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizercredentialsarn)
     */
    override fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Required for HTTP API Lambda authorizers. Supported values are `1.0` and `2.0` . To learn
     * more, see [Working with AWS Lambda authorizers for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerpayloadformatversion)
     */
    override fun authorizerPayloadFormatVersion(): String? =
        unwrap(this).getAuthorizerPayloadFormatVersion()

    /**
     * The time to live (TTL) for cached authorizer results, in seconds.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway
     * caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API
     * Lambda authorizers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizerresultttlinseconds)
     */
    override fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    /**
     * The authorizer type.
     *
     * Specify `REQUEST` for a Lambda function using incoming request parameters. Specify `JWT` to
     * use JSON Web Tokens (supported only for HTTP APIs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-authorizertype)
     */
    override fun authorizerType(): String = unwrap(this).getAuthorizerType()

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
     */
    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

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
     */
    override fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

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
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    /**
     * This parameter is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identityvalidationexpression)
     */
    override fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-jwtconfiguration)
     */
    override fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps):
        CfnAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAuthorizerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps
  }
}
