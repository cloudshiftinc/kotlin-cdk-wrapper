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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import kotlin.Number

@CdkDslMarker
public class CfnApplicationSettingsLimitsPropertyDsl {
    private val cdkBuilder: CfnApplicationSettings.LimitsProperty.Builder =
        CfnApplicationSettings.LimitsProperty.builder()

    public fun daily(daily: Number) {
        cdkBuilder.daily(daily)
    }

    public fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
    }

    public fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
    }

    public fun total(total: Number) {
        cdkBuilder.total(total)
    }

    public fun build(): CfnApplicationSettings.LimitsProperty = cdkBuilder.build()
}
