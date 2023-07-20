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
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.String

@CdkDslMarker
public class CfnUserPoolUserPoolAddOnsPropertyDsl {
    private val cdkBuilder: CfnUserPool.UserPoolAddOnsProperty.Builder =
        CfnUserPool.UserPoolAddOnsProperty.builder()

    public fun advancedSecurityMode(advancedSecurityMode: String) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
    }

    public fun build(): CfnUserPool.UserPoolAddOnsProperty = cdkBuilder.build()
}
