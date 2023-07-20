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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolPoliciesPropertyDsl {
    private val cdkBuilder: CfnUserPool.PoliciesProperty.Builder =
        CfnUserPool.PoliciesProperty.builder()

    public fun passwordPolicy(passwordPolicy: IResolvable) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    public fun passwordPolicy(passwordPolicy: CfnUserPool.PasswordPolicyProperty) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    public fun build(): CfnUserPool.PoliciesProperty = cdkBuilder.build()
}
