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
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps

/**
 * Properties for defining a `CfnOriginEndpointPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * Object policy;
 * CfnOriginEndpointPolicyProps cfnOriginEndpointPolicyProps =
 * CfnOriginEndpointPolicyProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .originEndpointName("originEndpointName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html)
 */
@CdkDslMarker
public class CfnOriginEndpointPolicyPropsDsl {
    private val cdkBuilder: CfnOriginEndpointPolicyProps.Builder =
        CfnOriginEndpointPolicyProps.builder()

    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     *   policy.
     */
    public fun channelGroupName(channelGroupName: String) {
        cdkBuilder.channelGroupName(channelGroupName)
    }

    /** @param channelName The channel name associated with the origin endpoint policy. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     *   policy.
     */
    public fun originEndpointName(originEndpointName: String) {
        cdkBuilder.originEndpointName(originEndpointName)
    }

    /** @param policy The policy associated with the origin endpoint. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy The policy associated with the origin endpoint. */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnOriginEndpointPolicyProps = cdkBuilder.build()
}
