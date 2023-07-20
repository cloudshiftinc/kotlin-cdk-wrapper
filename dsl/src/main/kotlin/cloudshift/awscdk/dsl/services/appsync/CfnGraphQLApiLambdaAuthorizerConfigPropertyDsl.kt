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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder =
        CfnGraphQLApi.LambdaAuthorizerConfigProperty.builder()

    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
        cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    public fun identityValidationExpression(identityValidationExpression: String) {
        cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    public fun build(): CfnGraphQLApi.LambdaAuthorizerConfigProperty = cdkBuilder.build()
}
