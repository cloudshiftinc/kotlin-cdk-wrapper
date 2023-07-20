@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.RequestContext
import kotlin.Boolean

@CdkDslMarker
public class RequestContextDsl {
    private val cdkBuilder: RequestContext.Builder = RequestContext.builder()

    public fun accountId(accountId: Boolean) {
        cdkBuilder.accountId(accountId)
    }

    public fun apiId(apiId: Boolean) {
        cdkBuilder.apiId(apiId)
    }

    public fun apiKey(apiKey: Boolean) {
        cdkBuilder.apiKey(apiKey)
    }

    public fun authorizerPrincipalId(authorizerPrincipalId: Boolean) {
        cdkBuilder.authorizerPrincipalId(authorizerPrincipalId)
    }

    public fun caller(caller: Boolean) {
        cdkBuilder.caller(caller)
    }

    public fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean) {
        cdkBuilder.cognitoAuthenticationProvider(cognitoAuthenticationProvider)
    }

    public fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean) {
        cdkBuilder.cognitoAuthenticationType(cognitoAuthenticationType)
    }

    public fun cognitoIdentityId(cognitoIdentityId: Boolean) {
        cdkBuilder.cognitoIdentityId(cognitoIdentityId)
    }

    public fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean) {
        cdkBuilder.cognitoIdentityPoolId(cognitoIdentityPoolId)
    }

    public fun httpMethod(httpMethod: Boolean) {
        cdkBuilder.httpMethod(httpMethod)
    }

    public fun requestId(requestId: Boolean) {
        cdkBuilder.requestId(requestId)
    }

    public fun resourceId(resourceId: Boolean) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun resourcePath(resourcePath: Boolean) {
        cdkBuilder.resourcePath(resourcePath)
    }

    public fun sourceIp(sourceIp: Boolean) {
        cdkBuilder.sourceIp(sourceIp)
    }

    public fun stage(stage: Boolean) {
        cdkBuilder.stage(stage)
    }

    public fun user(user: Boolean) {
        cdkBuilder.user(user)
    }

    public fun userAgent(userAgent: Boolean) {
        cdkBuilder.userAgent(userAgent)
    }

    public fun userArn(userArn: Boolean) {
        cdkBuilder.userArn(userArn)
    }

    public fun build(): RequestContext = cdkBuilder.build()
}
