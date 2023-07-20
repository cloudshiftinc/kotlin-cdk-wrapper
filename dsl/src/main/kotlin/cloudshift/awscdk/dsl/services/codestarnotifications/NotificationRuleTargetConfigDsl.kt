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
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import kotlin.String

@CdkDslMarker
public class NotificationRuleTargetConfigDsl {
    private val cdkBuilder: NotificationRuleTargetConfig.Builder =
        NotificationRuleTargetConfig.builder()

    public fun targetAddress(targetAddress: String) {
        cdkBuilder.targetAddress(targetAddress)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): NotificationRuleTargetConfig = cdkBuilder.build()
}
