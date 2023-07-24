@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import kotlin.String

/**
 * Notification medium for users to get alerted for events that occur in application profile.
 *
 * We support SNS topic as a notification channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codeguruprofiler.*;
 * ChannelProperty channelProperty = ChannelProperty.builder()
 * .channelUri("channelUri")
 * // the properties below are optional
 * .channelId("channelId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html)
 */
@CdkDslMarker
public class CfnProfilingGroupChannelPropertyDsl {
    private val cdkBuilder: CfnProfilingGroup.ChannelProperty.Builder =
        CfnProfilingGroup.ChannelProperty.builder()

    /**
     * @param channelId The channel ID.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /**
     * @param channelUri The channel URI.
     */
    public fun channelUri(channelUri: String) {
        cdkBuilder.channelUri(channelUri)
    }

    public fun build(): CfnProfilingGroup.ChannelProperty = cdkBuilder.build()
}
