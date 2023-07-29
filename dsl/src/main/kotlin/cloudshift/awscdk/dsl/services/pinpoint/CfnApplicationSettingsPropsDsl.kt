@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps

/**
 * Properties for defining a `CfnApplicationSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnApplicationSettingsProps cfnApplicationSettingsProps = CfnApplicationSettingsProps.builder()
 * .applicationId("applicationId")
 * // the properties below are optional
 * .campaignHook(CampaignHookProperty.builder()
 * .lambdaFunctionName("lambdaFunctionName")
 * .mode("mode")
 * .webUrl("webUrl")
 * .build())
 * .cloudWatchMetricsEnabled(false)
 * .limits(LimitsProperty.builder()
 * .daily(123)
 * .maximumDuration(123)
 * .messagesPerSecond(123)
 * .total(123)
 * .build())
 * .quietTime(QuietTimeProperty.builder()
 * .end("end")
 * .start("start")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html)
 */
@CdkDslMarker
public class CfnApplicationSettingsPropsDsl {
    private val cdkBuilder: CfnApplicationSettingsProps.Builder =
        CfnApplicationSettingsProps.builder()

    /** @param applicationId The unique identifier for the Amazon Pinpoint application. */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     *   campaigns in the application. To override these settings for a specific campaign, use the
     *   Campaign resource to define custom Lambda function settings for the campaign.
     */
    public fun campaignHook(campaignHook: IResolvable) {
        cdkBuilder.campaignHook(campaignHook)
    }

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     *   campaigns in the application. To override these settings for a specific campaign, use the
     *   Campaign resource to define custom Lambda function settings for the campaign.
     */
    public fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty) {
        cdkBuilder.campaignHook(campaignHook)
    }

    /**
     * @param cloudWatchMetricsEnabled Specifies whether to enable application-related alarms in
     *   Amazon CloudWatch.
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    /**
     * @param cloudWatchMetricsEnabled Specifies whether to enable application-related alarms in
     *   Amazon CloudWatch.
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    /**
     * @param limits The default sending limits for campaigns in the application. To override these
     *   limits for a specific campaign, use the Campaign resource to define custom limits for the
     *   campaign.
     */
    public fun limits(limits: IResolvable) {
        cdkBuilder.limits(limits)
    }

    /**
     * @param limits The default sending limits for campaigns in the application. To override these
     *   limits for a specific campaign, use the Campaign resource to define custom limits for the
     *   campaign.
     */
    public fun limits(limits: CfnApplicationSettings.LimitsProperty) {
        cdkBuilder.limits(limits)
    }

    /**
     * @param quietTime The default quiet time for campaigns in the application. Quiet time is a
     *   specific time range when campaigns don't send messages to endpoints, if all the following
     *   conditions are met:
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     *   by the `QuietTime.Start` property for the application (or a campaign that has custom quiet
     *   time settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     *   by the `QuietTime.End` property for the application (or a campaign that has custom quiet
     *   time settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    public fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime)
    }

    /**
     * @param quietTime The default quiet time for campaigns in the application. Quiet time is a
     *   specific time range when campaigns don't send messages to endpoints, if all the following
     *   conditions are met:
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     *   by the `QuietTime.Start` property for the application (or a campaign that has custom quiet
     *   time settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     *   by the `QuietTime.End` property for the application (or a campaign that has custom quiet
     *   time settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime)
    }

    public fun build(): CfnApplicationSettingsProps = cdkBuilder.build()
}
