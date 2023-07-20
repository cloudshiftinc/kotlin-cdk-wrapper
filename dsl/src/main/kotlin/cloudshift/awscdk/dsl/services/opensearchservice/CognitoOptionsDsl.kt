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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.CognitoOptions
import kotlin.String

@CdkDslMarker
public class CognitoOptionsDsl {
    private val cdkBuilder: CognitoOptions.Builder = CognitoOptions.builder()

    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CognitoOptions = cdkBuilder.build()
}
