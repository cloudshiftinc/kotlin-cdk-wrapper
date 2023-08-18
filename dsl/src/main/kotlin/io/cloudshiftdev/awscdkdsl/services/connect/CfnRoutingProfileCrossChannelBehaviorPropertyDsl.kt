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
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRoutingProfile

/**
 * Defines the cross-channel routing behavior that allows an agent working on a contact in one
 * channel to be offered a contact from a different channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CrossChannelBehaviorProperty crossChannelBehaviorProperty =
 * CrossChannelBehaviorProperty.builder()
 * .behaviorType("behaviorType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-crosschannelbehavior.html)
 */
@CdkDslMarker
public class CfnRoutingProfileCrossChannelBehaviorPropertyDsl {
    private val cdkBuilder: CfnRoutingProfile.CrossChannelBehaviorProperty.Builder =
        CfnRoutingProfile.CrossChannelBehaviorProperty.builder()

    /**
     * @param behaviorType Specifies the other channels that can be routed to an agent handling
     *   their current channel.
     */
    public fun behaviorType(behaviorType: String) {
        cdkBuilder.behaviorType(behaviorType)
    }

    public fun build(): CfnRoutingProfile.CrossChannelBehaviorProperty = cdkBuilder.build()
}
