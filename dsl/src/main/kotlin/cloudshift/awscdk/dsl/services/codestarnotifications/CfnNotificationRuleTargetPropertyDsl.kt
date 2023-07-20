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

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import kotlin.String

@CdkDslMarker
public class CfnNotificationRuleTargetPropertyDsl {
    private val cdkBuilder: CfnNotificationRule.TargetProperty.Builder =
        CfnNotificationRule.TargetProperty.builder()

    public fun targetAddress(targetAddress: String) {
        cdkBuilder.targetAddress(targetAddress)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnNotificationRule.TargetProperty = cdkBuilder.build()
}
