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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps

/**
 * Properties for defining a `CfnAuthorizer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
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
@CdkDslMarker
public class CfnAuthorizerPropsDsl {
    private val cdkBuilder: CfnAuthorizerProps.Builder = CfnAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    /** @param apiId The API identifier. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * @param authorizerCredentialsArn Specifies the required credentials as an IAM role for API
     *   Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the
     *   role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda
     *   function, specify null. Supported only for `REQUEST` authorizers.
     */
    public fun authorizerCredentialsArn(authorizerCredentialsArn: String) {
        cdkBuilder.authorizerCredentialsArn(authorizerCredentialsArn)
    }

    /**
     * @param authorizerPayloadFormatVersion Specifies the format of the payload sent to an HTTP API
     *   Lambda authorizer. Required for HTTP API Lambda authorizers. Supported values are `1.0` and
     *   `2.0` . To learn more, see
     *   [Working with AWS Lambda authorizers for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     *   .
     */
    public fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String) {
        cdkBuilder.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion)
    }

    /**
     * @param authorizerResultTtlInSeconds The time to live (TTL) for cached authorizer results, in
     *   seconds. If it equals 0, authorization caching is disabled. If it is greater than 0, API
     *   Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only
     *   for HTTP API Lambda authorizers.
     */
    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
        cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    /**
     * @param authorizerType The authorizer type. Specify `REQUEST` for a Lambda function using
     *   incoming request parameters. Specify `JWT` to use JSON Web Tokens (supported only for HTTP
     *   APIs).
     */
    public fun authorizerType(authorizerType: String) {
        cdkBuilder.authorizerType(authorizerType)
    }

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). For `REQUEST`
     *   authorizers, this must be a well-formed Lambda function URI, for example,
     *   `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     *   *{account_id}* :function: *{lambda_function_name}* /invocations` . In general, the URI has
     *   this form: `arn:aws:apigateway: *{region}* :lambda:path/ *{service_api}*` , where
     *   *{region}* is the same as the region hosting the Lambda function, path indicates that the
     *   remaining substring in the URI should be treated as the path to the resource, including the
     *   initial `/` . For Lambda functions, this is usually of the form
     *   `/2015-03-31/functions/[FunctionARN]/invocations` .
     */
    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     *   simple format. By default, a Lambda authorizer must return an IAM policy. If enabled, the
     *   Lambda authorizer can return a boolean value instead of an IAM policy. Supported only for
     *   HTTP APIs. To learn more, see
     *   [Working with AWS Lambda authorizers for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     *   .
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean) {
        cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     *   simple format. By default, a Lambda authorizer must return an IAM policy. If enabled, the
     *   Lambda authorizer can return a boolean value instead of an IAM policy. Supported only for
     *   HTTP APIs. To learn more, see
     *   [Working with AWS Lambda authorizers for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     *   .
     */
    public fun enableSimpleResponses(enableSimpleResponses: IResolvable) {
        cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * @param identitySource The identity source for which authorization is requested. For a
     *   `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     *   expressions of the specified request parameters. The identity source can be headers, query
     *   string parameters, stage variables, and context parameters. For example, if an Auth header
     *   and a Name query string parameter are defined as identity sources, this value is
     *   route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP
     *   APIs, use selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     *   `$request.querystring.Name` . These parameters are used to perform runtime validation for
     *   Lambda-based authorizers by verifying all of the identity-related request parameters are
     *   present in the request, not null, and non-empty. Only when this is true does the authorizer
     *   invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response
     *   without calling the Lambda function. For HTTP APIs, identity sources are also used as the
     *   cache key when caching is enabled. To learn more, see
     *   [Working with AWS Lambda authorizers for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     *   .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * @param identitySource The identity source for which authorization is requested. For a
     *   `REQUEST` authorizer, this is optional. The value is a set of one or more mapping
     *   expressions of the specified request parameters. The identity source can be headers, query
     *   string parameters, stage variables, and context parameters. For example, if an Auth header
     *   and a Name query string parameter are defined as identity sources, this value is
     *   route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP
     *   APIs, use selection expressions prefixed with `$` , for example, `$request.header.Auth` ,
     *   `$request.querystring.Name` . These parameters are used to perform runtime validation for
     *   Lambda-based authorizers by verifying all of the identity-related request parameters are
     *   present in the request, not null, and non-empty. Only when this is true does the authorizer
     *   invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response
     *   without calling the Lambda function. For HTTP APIs, identity sources are also used as the
     *   cache key when caching is enabled. To learn more, see
     *   [Working with AWS Lambda authorizers for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html)
     *   .
     *
     * For `JWT` , a single entry that specifies where to extract the JSON Web Token (JWT) from
     * inbound requests. Currently only header-based and query parameter-based selections are
     * supported, for example `$request.header.Authorization` .
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /** @param identityValidationExpression This parameter is not used. */
    public fun identityValidationExpression(identityValidationExpression: String) {
        cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     *   authorizer. Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    public fun jwtConfiguration(jwtConfiguration: IResolvable) {
        cdkBuilder.jwtConfiguration(jwtConfiguration)
    }

    /**
     * @param jwtConfiguration The `JWTConfiguration` property specifies the configuration of a JWT
     *   authorizer. Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     */
    public fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty) {
        cdkBuilder.jwtConfiguration(jwtConfiguration)
    }

    /** @param name The name of the authorizer. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        return cdkBuilder.build()
    }
}
