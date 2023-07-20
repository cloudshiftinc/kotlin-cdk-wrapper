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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnCampaignSchedulePropertyDsl {
    private val cdkBuilder: CfnCampaign.ScheduleProperty.Builder =
        CfnCampaign.ScheduleProperty.builder()

    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    public fun eventFilter(eventFilter: IResolvable) {
        cdkBuilder.eventFilter(eventFilter)
    }

    public fun eventFilter(eventFilter: CfnCampaign.CampaignEventFilterProperty) {
        cdkBuilder.eventFilter(eventFilter)
    }

    public fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
    }

    public fun isLocalTime(isLocalTime: Boolean) {
        cdkBuilder.isLocalTime(isLocalTime)
    }

    public fun isLocalTime(isLocalTime: IResolvable) {
        cdkBuilder.isLocalTime(isLocalTime)
    }

    public fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime)
    }

    public fun quietTime(quietTime: CfnCampaign.QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnCampaign.ScheduleProperty = cdkBuilder.build()
}
