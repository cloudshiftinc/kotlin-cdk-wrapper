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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRoutingProfile

/**
 * Contains information about which channels are supported, and how many contacts an agent can have
 * on a channel simultaneously.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * MediaConcurrencyProperty mediaConcurrencyProperty = MediaConcurrencyProperty.builder()
 * .channel("channel")
 * .concurrency(123)
 * // the properties below are optional
 * .crossChannelBehavior(CrossChannelBehaviorProperty.builder()
 * .behaviorType("behaviorType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html)
 */
@CdkDslMarker
public class CfnRoutingProfileMediaConcurrencyPropertyDsl {
    private val cdkBuilder: CfnRoutingProfile.MediaConcurrencyProperty.Builder =
        CfnRoutingProfile.MediaConcurrencyProperty.builder()

    /** @param channel The channels that agents can handle in the Contact Control Panel (CCP). */
    public fun channel(channel: String) {
        cdkBuilder.channel(channel)
    }

    /**
     * @param concurrency The number of contacts an agent can have on a channel simultaneously.
     *   Valid Range for `VOICE` : Minimum value of 1. Maximum value of 1.
     *
     * Valid Range for `CHAT` : Minimum value of 1. Maximum value of 10.
     *
     * Valid Range for `TASK` : Minimum value of 1. Maximum value of 10.
     */
    public fun concurrency(concurrency: Number) {
        cdkBuilder.concurrency(concurrency)
    }

    /**
     * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel that
     *   is enabled for this Routing Profile. For example, this allows you to offer an agent a
     *   different contact from another channel when they are currently working with a contact from
     *   a Voice channel.
     */
    public fun crossChannelBehavior(crossChannelBehavior: IResolvable) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior)
    }

    /**
     * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel that
     *   is enabled for this Routing Profile. For example, this allows you to offer an agent a
     *   different contact from another channel when they are currently working with a contact from
     *   a Voice channel.
     */
    public fun crossChannelBehavior(
        crossChannelBehavior: CfnRoutingProfile.CrossChannelBehaviorProperty
    ) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior)
    }

    public fun build(): CfnRoutingProfile.MediaConcurrencyProperty = cdkBuilder.build()
}
