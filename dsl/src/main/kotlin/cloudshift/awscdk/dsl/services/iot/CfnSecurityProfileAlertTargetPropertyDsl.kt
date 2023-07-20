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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileAlertTargetPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.AlertTargetProperty.Builder =
        CfnSecurityProfile.AlertTargetProperty.builder()

    public fun alertTargetArn(alertTargetArn: String) {
        cdkBuilder.alertTargetArn(alertTargetArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSecurityProfile.AlertTargetProperty = cdkBuilder.build()
}
