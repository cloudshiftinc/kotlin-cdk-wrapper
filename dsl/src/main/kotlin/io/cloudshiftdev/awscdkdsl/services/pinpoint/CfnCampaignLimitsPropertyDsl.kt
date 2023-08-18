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
import kotlin.Number
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the limits on the messages that a campaign can send.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * LimitsProperty limitsProperty = LimitsProperty.builder()
 * .daily(123)
 * .maximumDuration(123)
 * .messagesPerSecond(123)
 * .session(123)
 * .total(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html)
 */
@CdkDslMarker
public class CfnCampaignLimitsPropertyDsl {
    private val cdkBuilder: CfnCampaign.LimitsProperty.Builder =
        CfnCampaign.LimitsProperty.builder()

    /**
     * @param daily The maximum number of messages that a campaign can send to a single endpoint
     *   during a 24-hour period. The maximum value is 100.
     */
    public fun daily(daily: Number) {
        cdkBuilder.daily(daily)
    }

    /**
     * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt to
     *   deliver a message after the scheduled start time for the campaign. The minimum value is 60
     *   seconds.
     */
    public fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
    }

    /**
     * @param messagesPerSecond The maximum number of messages that a campaign can send each second.
     *   The minimum value is 1. The maximum value is 20,000.
     */
    public fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
    }

    /**
     * @param session The maximum number of messages that the campaign can send per user session.
     */
    public fun session(session: Number) {
        cdkBuilder.session(session)
    }

    /**
     * @param total The maximum number of messages that a campaign can send to a single endpoint
     *   during the course of the campaign. The maximum value is 100.
     */
    public fun total(total: Number) {
        cdkBuilder.total(total)
    }

    public fun build(): CfnCampaign.LimitsProperty = cdkBuilder.build()
}
