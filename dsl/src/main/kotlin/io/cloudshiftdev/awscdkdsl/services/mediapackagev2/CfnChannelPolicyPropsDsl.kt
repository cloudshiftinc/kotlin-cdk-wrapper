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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps

/**
 * Properties for defining a `CfnChannelPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * Object policy;
 * CfnChannelPolicyProps cfnChannelPolicyProps = CfnChannelPolicyProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html)
 */
@CdkDslMarker
public class CfnChannelPolicyPropsDsl {
    private val cdkBuilder: CfnChannelPolicyProps.Builder = CfnChannelPolicyProps.builder()

    /** @param channelGroupName The name of the channel group associated with the channel policy. */
    public fun channelGroupName(channelGroupName: String) {
        cdkBuilder.channelGroupName(channelGroupName)
    }

    /** @param channelName The name of the channel associated with the channel policy. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param policy The policy associated with the channel. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy The policy associated with the channel. */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnChannelPolicyProps = cdkBuilder.build()
}
