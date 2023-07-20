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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import kotlin.String

@CdkDslMarker
public class CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder =
        CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder()

    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    public fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    public fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.CognitoUserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun build(): CfnGraphQLApi.AdditionalAuthenticationProviderProperty = cdkBuilder.build()
}
