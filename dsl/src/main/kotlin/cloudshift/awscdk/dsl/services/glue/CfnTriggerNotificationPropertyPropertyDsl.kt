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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnTrigger
import kotlin.Number

@CdkDslMarker
public class CfnTriggerNotificationPropertyPropertyDsl {
    private val cdkBuilder: CfnTrigger.NotificationPropertyProperty.Builder =
        CfnTrigger.NotificationPropertyProperty.builder()

    public fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
    }

    public fun build(): CfnTrigger.NotificationPropertyProperty = cdkBuilder.build()
}
