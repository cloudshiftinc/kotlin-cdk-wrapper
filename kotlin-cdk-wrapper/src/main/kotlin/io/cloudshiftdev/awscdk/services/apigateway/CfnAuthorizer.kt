@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::Authorizer` resource creates an authorization layer that API Gateway
 * activates for methods that have authorization enabled.
 *
 * API Gateway activates the authorizer when a client calls those methods.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnAuthorizer cfnAuthorizer = CfnAuthorizer.Builder.create(this, "MyCfnAuthorizer")
 * .name("name")
 * .restApiId("restApiId")
 * .type("type")
 * // the properties below are optional
 * .authorizerCredentials("authorizerCredentials")
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .authType("authType")
 * .identitySource("identitySource")
 * .identityValidationExpression("identityValidationExpression")
 * .providerArns(List.of("providerArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
 */
public open class CfnAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAuthorizerProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnAuthorizer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAuthorizerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAuthorizerProps(props)
  )

  /**
   * The ID for the authorizer.
   *
   * For example: `abc123` .
   */
  public open fun attrAuthorizerId(): String = unwrap(this).getAttrAuthorizerId()

  /**
   * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
   */
  public open fun authType(): String? = unwrap(this).getAuthType()

  /**
   * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   */
  public open fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

  /**
   * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
   */
  public open fun authorizerCredentials(`value`: String) {
    unwrap(this).setAuthorizerCredentials(`value`)
  }

  /**
   * The TTL in seconds of cached authorizer results.
   */
  public open fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  /**
   * The TTL in seconds of cached authorizer results.
   */
  public open fun authorizerResultTtlInSeconds(`value`: Number) {
    unwrap(this).setAuthorizerResultTtlInSeconds(`value`)
  }

  /**
   * Specifies the authorizer's Uniform Resource Identifier (URI).
   */
  public open fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  /**
   * Specifies the authorizer's Uniform Resource Identifier (URI).
   */
  public open fun authorizerUri(`value`: String) {
    unwrap(this).setAuthorizerUri(`value`)
  }

  /**
   * The identity source for which authorization is requested.
   */
  public open fun identitySource(): String? = unwrap(this).getIdentitySource()

  /**
   * The identity source for which authorization is requested.
   */
  public open fun identitySource(`value`: String) {
    unwrap(this).setIdentitySource(`value`)
  }

  /**
   * A validation expression for the incoming identity token.
   */
  public open fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  /**
   * A validation expression for the incoming identity token.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

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
   * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
   */
  public open fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

  /**
   * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
   */
  public open fun providerArns(`value`: List<String>) {
    unwrap(this).setProviderArns(`value`)
  }

  /**
   * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
   */
  public open fun providerArns(vararg `value`: String): Unit = providerArns(`value`.toList())

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * The authorizer type.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The authorizer type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional customer-defined field, used in OpenAPI imports and exports without functional
     * impact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
     * @param authType Optional customer-defined field, used in OpenAPI imports and exports without
     * functional impact. 
     */
    public fun authType(authType: String)

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
     * @param authorizerCredentials Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer. 
     */
    public fun authorizerCredentials(authorizerCredentials: String)

    /**
     * The TTL in seconds of cached authorizer results.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
     * cache authorizer responses. If this field is not set, the default value is 300. The maximum
     * value is 3600, or 1 hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
     * @param authorizerResultTtlInSeconds The TTL in seconds of cached authorizer results. 
     */
    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

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
     * @param authorizerUri Specifies the authorizer's Uniform Resource Identifier (URI). 
     */
    public fun authorizerUri(authorizerUri: String)

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
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: String)

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
     * @param identityValidationExpression A validation expression for the incoming identity token. 
     */
    public fun identityValidationExpression(identityValidationExpression: String)

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
     * @param name The name of the authorizer. 
     */
    public fun name(name: String)

    /**
     * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
     *
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer. 
     */
    public fun providerArns(providerArns: List<String>)

    /**
     * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
     *
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer. 
     */
    public fun providerArns(vararg providerArns: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * The authorizer type.
     *
     * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted
     * in a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
     * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
     * @param type The authorizer type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.CfnAuthorizer.Builder.create(scope, id)

    /**
     * Optional customer-defined field, used in OpenAPI imports and exports without functional
     * impact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
     * @param authType Optional customer-defined field, used in OpenAPI imports and exports without
     * functional impact. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     *
     * To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To use resource-based permissions on the Lambda function, specify null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
     * @param authorizerCredentials Specifies the required credentials as an IAM role for API
     * Gateway to invoke the authorizer. 
     */
    override fun authorizerCredentials(authorizerCredentials: String) {
      cdkBuilder.authorizerCredentials(authorizerCredentials)
    }

    /**
     * The TTL in seconds of cached authorizer results.
     *
     * If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will
     * cache authorizer responses. If this field is not set, the default value is 300. The maximum
     * value is 3600, or 1 hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
     * @param authorizerResultTtlInSeconds The TTL in seconds of cached authorizer results. 
     */
    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

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
     * @param authorizerUri Specifies the authorizer's Uniform Resource Identifier (URI). 
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

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
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

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
     * @param identityValidationExpression A validation expression for the incoming identity token. 
     */
    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    /**
     * The name of the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
     * @param name The name of the authorizer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
     *
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer. 
     */
    override fun providerArns(providerArns: List<String>) {
      cdkBuilder.providerArns(providerArns)
    }

    /**
     * A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS` authorizer.
     *
     * Each element is of this format:
     * `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}` . For a `TOKEN` or `REQUEST`
     * authorizer, this is not defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
     * @param providerArns A list of the Amazon Cognito user pool ARNs for the `COGNITO_USER_POOLS`
     * authorizer. 
     */
    override fun providerArns(vararg providerArns: String): Unit =
        providerArns(providerArns.toList())

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * The authorizer type.
     *
     * Valid values are `TOKEN` for a Lambda function using a single authorization token submitted
     * in a custom header, `REQUEST` for a Lambda function using incoming request parameters, and
     * `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
     * @param type The authorizer type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnAuthorizer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizer):
        CfnAuthorizer = CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer):
        software.amazon.awscdk.services.apigateway.CfnAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnAuthorizer
  }
}
