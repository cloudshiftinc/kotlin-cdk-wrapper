package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAuthorizerProps {
  /**
   * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
   */
  public fun authType(): String? = unwrap(this).getAuthType()

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   *
   * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
   * use resource-based permissions on the Lambda function, specify null.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
   */
  public fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

  /**
   * The TTL in seconds of cached authorizer results.
   *
   * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
   * cache authorizer responses. If this field is not set, the default value is 300. The maximum value
   * is 3600, or 1 hour.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
   */
  public fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  /**
   * Specifies the authorizer's Uniform Resource Identifier (URI).
   *
   * For `TOKEN` or `REQUEST` authorizers, this must be a well-formed Lambda function URI, for
   * example,
   * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations`
   * . In general, the URI has this form `arn:aws:apigateway:{region}:lambda:path/{service_api}` ,
   * where `{region}` is the same as the region hosting the Lambda function, `path` indicates that the
   * remaining substring in the URI should be treated as the path to the resource, including the
   * initial `/` . For Lambda functions, this is usually of the form
   * `/2015-03-31/functions/[FunctionARN]/invocations` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri)
   */
  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  /**
   * The identity source for which authorization is requested.
   *
   * For a `TOKEN` or `COGNITO_USER_POOLS` authorizer, this is required and specifies the request
   * header mapping expression for the custom header holding the authorization token submitted by the
   * client. For example, if the token header name is `Auth` , the header mapping expression is
   * `method.request.header.Auth` . For the `REQUEST` authorizer, this is required when authorization
   * caching is enabled. The value is a comma-separated string of one or more mapping expressions of
   * the specified request parameters. For example, if an `Auth` header, a `Name` query string
   * parameter are defined as identity sources, this value is `method.request.header.Auth,
   * method.request.querystring.Name` . These parameters will be used to derive the authorization
   * caching key and to perform runtime validation of the `REQUEST` authorizer by verifying all of the
   * identity-related request parameters are present, not null and non-empty. Only when this is true
   * does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401
   * Unauthorized response without calling the Lambda function. The valid value is a string of
   * comma-separated mapping expressions of the specified request parameters. When the authorization
   * caching is not enabled, this property is optional.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource)
   */
  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  /**
   * A validation expression for the incoming identity token.
   *
   * For `TOKEN` authorizers, this value is a regular expression. For `COGNITO_USER_POOLS`
   * authorizers, API Gateway will match the `aud` field of the incoming token from the client against
   * the specified regular expression. It will invoke the authorizer's Lambda function when there is a
   * match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function.
   * The validation expression does not apply to the `REQUEST` authorizer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression)
   */
  public fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  /**
   * The name of the authorizer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
   */
  public fun name(): String

  /**
   * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
   *
   * Each element is of this format:
   * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
   * authorizer, this is not defined.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
   */
  public fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
   */
  public fun restApiId(): String

  /**
   * The authorizer type.
   *
   * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted in
   * a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
   * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType Optional customer-defined field, used in OpenAPI imports and exports without
     * functional impact.
     */
    public fun authType(authType: String)

    /**
     * @param authorizerCredentials Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer.
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null.
     */
    public fun authorizerCredentials(authorizerCredentials: String)

    /**
     * @param authorizerResultTtlInSeconds The TTL in seconds of cached authorizer results.
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
     * cache authorizer responses. If this field is not set, the default value is 300. The maximum
     * value is 3600, or 1 hour.
     */
    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

    /**
     * @param authorizerUri Specifies the authorizer's Uniform Resource Identifier (URI).
     * For `TOKEN` or `REQUEST` authorizers, this must be a well-formed Lambda function URI, for
     * example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations`
     * . In general, the URI has this form `arn:aws:apigateway:{region}:lambda:path/{service_api}` ,
     * where `{region}` is the same as the region hosting the Lambda function, `path` indicates that
     * the remaining substring in the URI should be treated as the path to the resource, including the
     * initial `/` . For Lambda functions, this is usually of the form
     * `/2015-03-31/functions/[FunctionARN]/invocations` .
     */
    public fun authorizerUri(authorizerUri: String)

    /**
     * @param identitySource The identity source for which authorization is requested.
     * For a `TOKEN` or `COGNITO_USER_POOLS` authorizer, this is required and specifies the request
     * header mapping expression for the custom header holding the authorization token submitted by the
     * client. For example, if the token header name is `Auth` , the header mapping expression is
     * `method.request.header.Auth` . For the `REQUEST` authorizer, this is required when authorization
     * caching is enabled. The value is a comma-separated string of one or more mapping expressions of
     * the specified request parameters. For example, if an `Auth` header, a `Name` query string
     * parameter are defined as identity sources, this value is `method.request.header.Auth,
     * method.request.querystring.Name` . These parameters will be used to derive the authorization
     * caching key and to perform runtime validation of the `REQUEST` authorizer by verifying all of
     * the identity-related request parameters are present, not null and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401
     * Unauthorized response without calling the Lambda function. The valid value is a string of
     * comma-separated mapping expressions of the specified request parameters. When the authorization
     * caching is not enabled, this property is optional.
     */
    public fun identitySource(identitySource: String)

    /**
     * @param identityValidationExpression A validation expression for the incoming identity token.
     * For `TOKEN` authorizers, this value is a regular expression. For `COGNITO_USER_POOLS`
     * authorizers, API Gateway will match the `aud` field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when
     * there is a match. Otherwise, it will return a 401 Unauthorized response without calling the
     * Lambda function. The validation expression does not apply to the `REQUEST` authorizer.
     */
    public fun identityValidationExpression(identityValidationExpression: String)

    /**
     * @param name The name of the authorizer. 
     */
    public fun name(name: String)

    /**
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer.
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     */
    public fun providerArns(providerArns: List<String>)

    /**
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer.
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     */
    public fun providerArns(vararg providerArns: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param type The authorizer type. 
     * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted
     * in a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
     * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnAuthorizerProps.builder()

    /**
     * @param authType Optional customer-defined field, used in OpenAPI imports and exports without
     * functional impact.
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param authorizerCredentials Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer.
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null.
     */
    override fun authorizerCredentials(authorizerCredentials: String) {
      cdkBuilder.authorizerCredentials(authorizerCredentials)
    }

    /**
     * @param authorizerResultTtlInSeconds The TTL in seconds of cached authorizer results.
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
     * cache authorizer responses. If this field is not set, the default value is 300. The maximum
     * value is 3600, or 1 hour.
     */
    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    /**
     * @param authorizerUri Specifies the authorizer's Uniform Resource Identifier (URI).
     * For `TOKEN` or `REQUEST` authorizers, this must be a well-formed Lambda function URI, for
     * example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations`
     * . In general, the URI has this form `arn:aws:apigateway:{region}:lambda:path/{service_api}` ,
     * where `{region}` is the same as the region hosting the Lambda function, `path` indicates that
     * the remaining substring in the URI should be treated as the path to the resource, including the
     * initial `/` . For Lambda functions, this is usually of the form
     * `/2015-03-31/functions/[FunctionARN]/invocations` .
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     * For a `TOKEN` or `COGNITO_USER_POOLS` authorizer, this is required and specifies the request
     * header mapping expression for the custom header holding the authorization token submitted by the
     * client. For example, if the token header name is `Auth` , the header mapping expression is
     * `method.request.header.Auth` . For the `REQUEST` authorizer, this is required when authorization
     * caching is enabled. The value is a comma-separated string of one or more mapping expressions of
     * the specified request parameters. For example, if an `Auth` header, a `Name` query string
     * parameter are defined as identity sources, this value is `method.request.header.Auth,
     * method.request.querystring.Name` . These parameters will be used to derive the authorization
     * caching key and to perform runtime validation of the `REQUEST` authorizer by verifying all of
     * the identity-related request parameters are present, not null and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401
     * Unauthorized response without calling the Lambda function. The valid value is a string of
     * comma-separated mapping expressions of the specified request parameters. When the authorization
     * caching is not enabled, this property is optional.
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identityValidationExpression A validation expression for the incoming identity token.
     * For `TOKEN` authorizers, this value is a regular expression. For `COGNITO_USER_POOLS`
     * authorizers, API Gateway will match the `aud` field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when
     * there is a match. Otherwise, it will return a 401 Unauthorized response without calling the
     * Lambda function. The validation expression does not apply to the `REQUEST` authorizer.
     */
    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    /**
     * @param name The name of the authorizer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer.
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     */
    override fun providerArns(providerArns: List<String>) {
      cdkBuilder.providerArns(providerArns)
    }

    /**
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer.
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     */
    override fun providerArns(vararg providerArns: String): Unit =
        providerArns(providerArns.toList())

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param type The authorizer type. 
     * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted
     * in a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
     * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps,
  ) : CdkObject(cdkObject), CfnAuthorizerProps {
    /**
     * Optional customer-defined field, used in OpenAPI imports and exports without functional
     * impact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
     */
    override fun authType(): String? = unwrap(this).getAuthType()

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
     */
    override fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

    /**
     * The TTL in seconds of cached authorizer results.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
     * cache authorizer responses. If this field is not set, the default value is 300. The maximum
     * value is 3600, or 1 hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
     */
    override fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    /**
     * Specifies the authorizer's Uniform Resource Identifier (URI).
     *
     * For `TOKEN` or `REQUEST` authorizers, this must be a well-formed Lambda function URI, for
     * example,
     * `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations`
     * . In general, the URI has this form `arn:aws:apigateway:{region}:lambda:path/{service_api}` ,
     * where `{region}` is the same as the region hosting the Lambda function, `path` indicates that
     * the remaining substring in the URI should be treated as the path to the resource, including the
     * initial `/` . For Lambda functions, this is usually of the form
     * `/2015-03-31/functions/[FunctionARN]/invocations` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri)
     */
    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    /**
     * The identity source for which authorization is requested.
     *
     * For a `TOKEN` or `COGNITO_USER_POOLS` authorizer, this is required and specifies the request
     * header mapping expression for the custom header holding the authorization token submitted by the
     * client. For example, if the token header name is `Auth` , the header mapping expression is
     * `method.request.header.Auth` . For the `REQUEST` authorizer, this is required when authorization
     * caching is enabled. The value is a comma-separated string of one or more mapping expressions of
     * the specified request parameters. For example, if an `Auth` header, a `Name` query string
     * parameter are defined as identity sources, this value is `method.request.header.Auth,
     * method.request.querystring.Name` . These parameters will be used to derive the authorization
     * caching key and to perform runtime validation of the `REQUEST` authorizer by verifying all of
     * the identity-related request parameters are present, not null and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401
     * Unauthorized response without calling the Lambda function. The valid value is a string of
     * comma-separated mapping expressions of the specified request parameters. When the authorization
     * caching is not enabled, this property is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource)
     */
    override fun identitySource(): String? = unwrap(this).getIdentitySource()

    /**
     * A validation expression for the incoming identity token.
     *
     * For `TOKEN` authorizers, this value is a regular expression. For `COGNITO_USER_POOLS`
     * authorizers, API Gateway will match the `aud` field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when
     * there is a match. Otherwise, it will return a 401 Unauthorized response without calling the
     * Lambda function. The validation expression does not apply to the `REQUEST` authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression)
     */
    override fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
     *
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
     */
    override fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The authorizer type.
     *
     * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted
     * in a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
     * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps):
        CfnAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.apigateway.CfnAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
  }
}
