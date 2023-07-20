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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.AuthFlow
import kotlin.Boolean

@CdkDslMarker
public class AuthFlowDsl {
    private val cdkBuilder: AuthFlow.Builder = AuthFlow.builder()

    public fun adminUserPassword(adminUserPassword: Boolean) {
        cdkBuilder.adminUserPassword(adminUserPassword)
    }

    public fun custom(custom: Boolean) {
        cdkBuilder.custom(custom)
    }

    public fun userPassword(userPassword: Boolean) {
        cdkBuilder.userPassword(userPassword)
    }

    public fun userSrp(userSrp: Boolean) {
        cdkBuilder.userSrp(userSrp)
    }

    public fun build(): AuthFlow = cdkBuilder.build()
}
