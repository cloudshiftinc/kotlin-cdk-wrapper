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
import kotlin.String

@CdkDslMarker
public class CfnGraphQLApiUserPoolConfigPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.UserPoolConfigProperty.Builder =
        CfnGraphQLApi.UserPoolConfigProperty.builder()

    public fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    public fun defaultAction(defaultAction: String) {
        cdkBuilder.defaultAction(defaultAction)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnGraphQLApi.UserPoolConfigProperty = cdkBuilder.build()
}
