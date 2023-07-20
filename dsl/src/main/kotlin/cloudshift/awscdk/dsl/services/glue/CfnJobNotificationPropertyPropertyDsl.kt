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
import software.amazon.awscdk.services.glue.CfnJob
import kotlin.Number

@CdkDslMarker
public class CfnJobNotificationPropertyPropertyDsl {
    private val cdkBuilder: CfnJob.NotificationPropertyProperty.Builder =
        CfnJob.NotificationPropertyProperty.builder()

    public fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
    }

    public fun build(): CfnJob.NotificationPropertyProperty = cdkBuilder.build()
}
