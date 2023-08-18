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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the schedule settings for a campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
 * .endTime("endTime")
 * .eventFilter(CampaignEventFilterProperty.builder()
 * .dimensions(EventDimensionsProperty.builder()
 * .attributes(attributes)
 * .eventType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .metrics(metrics)
 * .build())
 * .filterType("filterType")
 * .build())
 * .frequency("frequency")
 * .isLocalTime(false)
 * .quietTime(QuietTimeProperty.builder()
 * .end("end")
 * .start("start")
 * .build())
 * .startTime("startTime")
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html)
 */
@CdkDslMarker
public class CfnCampaignSchedulePropertyDsl {
    private val cdkBuilder: CfnCampaign.ScheduleProperty.Builder =
        CfnCampaign.ScheduleProperty.builder()

    /**
     * @param endTime The scheduled time, in ISO 8601 format, when the campaign ended or will end.
     */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param eventFilter The type of event that causes the campaign to be sent, if the value of the
     *   `Frequency` property is `EVENT` .
     */
    public fun eventFilter(eventFilter: IResolvable) {
        cdkBuilder.eventFilter(eventFilter)
    }

    /**
     * @param eventFilter The type of event that causes the campaign to be sent, if the value of the
     *   `Frequency` property is `EVENT` .
     */
    public fun eventFilter(eventFilter: CfnCampaign.CampaignEventFilterProperty) {
        cdkBuilder.eventFilter(eventFilter)
    }

    /**
     * @param frequency Specifies how often the campaign is sent or whether the campaign is sent in
     *   response to a specific event.
     */
    public fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
    }

    /**
     * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
     *   each recipient's local time. To base the schedule on each recipient's local time, set this
     *   value to `true` .
     */
    public fun isLocalTime(isLocalTime: Boolean) {
        cdkBuilder.isLocalTime(isLocalTime)
    }

    /**
     * @param isLocalTime Specifies whether the start and end times for the campaign schedule use
     *   each recipient's local time. To base the schedule on each recipient's local time, set this
     *   value to `true` .
     */
    public fun isLocalTime(isLocalTime: IResolvable) {
        cdkBuilder.isLocalTime(isLocalTime)
    }

    /**
     * @param quietTime The default quiet time for the campaign. Quiet time is a specific time range
     *   when a campaign doesn't send messages to endpoints, if all the following conditions are
     *   met:
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     *   by the `QuietTime.Start` property for the campaign.
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     *   by the `QuietTime.End` property for the campaign.
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the
     * campaign, even if quiet time is enabled.
     */
    public fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime)
    }

    /**
     * @param quietTime The default quiet time for the campaign. Quiet time is a specific time range
     *   when a campaign doesn't send messages to endpoints, if all the following conditions are
     *   met:
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     *   by the `QuietTime.Start` property for the campaign.
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     *   by the `QuietTime.End` property for the campaign.
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the
     * campaign, even if quiet time is enabled.
     */
    public fun quietTime(quietTime: CfnCampaign.QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime)
    }

    /**
     * @param startTime The scheduled time when the campaign began or will begin. Valid values are:
     *   `IMMEDIATE` , to start the campaign immediately; or, a specific time in ISO 8601 format.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone The starting UTC offset for the campaign schedule, if the value of the
     *   `IsLocalTime` property is `true` . Valid values are: `UTC, UTC+01, UTC+02, UTC+03,
     *   UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07,
     *   UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03,
     *   UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10,` and `UTC-11` .
     */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnCampaign.ScheduleProperty = cdkBuilder.build()
}
