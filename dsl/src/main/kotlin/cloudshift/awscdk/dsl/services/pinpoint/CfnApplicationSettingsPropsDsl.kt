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
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnApplicationSettingsPropsDsl {
    private val cdkBuilder: CfnApplicationSettingsProps.Builder =
        CfnApplicationSettingsProps.builder()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun campaignHook(campaignHook: IResolvable) {
        cdkBuilder.campaignHook(campaignHook)
    }

    public fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty) {
        cdkBuilder.campaignHook(campaignHook)
    }

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    public fun limits(limits: IResolvable) {
        cdkBuilder.limits(limits)
    }

    public fun limits(limits: CfnApplicationSettings.LimitsProperty) {
        cdkBuilder.limits(limits)
    }

    public fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime)
    }

    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime)
    }

    public fun build(): CfnApplicationSettingsProps = cdkBuilder.build()
}
