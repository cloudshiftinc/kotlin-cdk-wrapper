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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRoutingProfile

/**
 * Contains the channel and queue identifier for a routing profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * RoutingProfileQueueReferenceProperty routingProfileQueueReferenceProperty =
 * RoutingProfileQueueReferenceProperty.builder()
 * .channel("channel")
 * .queueArn("queueArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html)
 */
@CdkDslMarker
public class CfnRoutingProfileRoutingProfileQueueReferencePropertyDsl {
    private val cdkBuilder: CfnRoutingProfile.RoutingProfileQueueReferenceProperty.Builder =
        CfnRoutingProfile.RoutingProfileQueueReferenceProperty.builder()

    /**
     * @param channel The channels agents can handle in the Contact Control Panel (CCP) for this
     *   routing profile.
     */
    public fun channel(channel: String) {
        cdkBuilder.channel(channel)
    }

    /** @param queueArn The Amazon Resource Name (ARN) of the queue. */
    public fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
    }

    public fun build(): CfnRoutingProfile.RoutingProfileQueueReferenceProperty = cdkBuilder.build()
}
