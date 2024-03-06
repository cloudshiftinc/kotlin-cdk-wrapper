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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.constructs.Construct

/**
 * An authorizer for Http Apis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * HttpAuthorizer httpAuthorizer = HttpAuthorizer.Builder.create(this, "MyHttpAuthorizer")
 * .httpApi(httpApi)
 * .identitySource(List.of("identitySource"))
 * .type(HttpAuthorizerType.IAM)
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .authorizerUri("authorizerUri")
 * .enableSimpleResponses(false)
 * .jwtAudience(List.of("jwtAudience"))
 * .jwtIssuer("jwtIssuer")
 * .payloadFormatVersion(AuthorizerPayloadVersion.VERSION_1_0)
 * .resultsCacheTtl(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpAuthorizerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpAuthorizer.Builder = HttpAuthorizer.Builder.create(scope, id)

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _jwtAudience: MutableList<String> = mutableListOf()

    /**
     * Name of the authorizer.
     *
     * Default: - id of the HttpAuthorizer construct.
     *
     * @param authorizerName Name of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     *
     * Default: - required for Request authorizer types
     *
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     */
    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     *
     * Default: - The lambda authorizer must return an IAM policy as its response
     *
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     *   simple format.
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean) {
        cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * HTTP Api to attach the authorizer to.
     *
     * @param httpApi HTTP Api to attach the authorizer to.
     */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT.
     */
    public fun jwtAudience(vararg jwtAudience: String) {
        _jwtAudience.addAll(listOf(*jwtAudience))
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT.
     */
    public fun jwtAudience(jwtAudience: Collection<String>) {
        _jwtAudience.addAll(jwtAudience)
    }

    /**
     * The base domain of the identity provider that issues JWT.
     *
     * Default: - required for JWT authorizer types.
     *
     * @param jwtIssuer The base domain of the identity provider that issues JWT.
     */
    public fun jwtIssuer(jwtIssuer: String) {
        cdkBuilder.jwtIssuer(jwtIssuer)
    }

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Default: AuthorizerPayloadVersion.VERSION_2_0 if the authorizer type is
     * HttpAuthorizerType.LAMBDA
     *
     * @param payloadFormatVersion Specifies the format of the payload sent to an HTTP API Lambda
     *   authorizer.
     */
    public fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     *
     * Default: - API Gateway will not cache authorizer responses
     *
     * @param resultsCacheTtl How long APIGateway should cache the results.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer.
     */
    public fun type(type: HttpAuthorizerType) {
        cdkBuilder.type(type)
    }

    public fun build(): HttpAuthorizer {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_jwtAudience.isNotEmpty()) cdkBuilder.jwtAudience(_jwtAudience)
        return cdkBuilder.build()
    }
}
