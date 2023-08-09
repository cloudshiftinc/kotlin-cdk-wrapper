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
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRoutingProfile

/**
 * Contains information about the queue and channel for which priority and delay can be set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * RoutingProfileQueueConfigProperty routingProfileQueueConfigProperty =
 * RoutingProfileQueueConfigProperty.builder()
 * .delay(123)
 * .priority(123)
 * .queueReference(RoutingProfileQueueReferenceProperty.builder()
 * .channel("channel")
 * .queueArn("queueArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html)
 */
@CdkDslMarker
public class CfnRoutingProfileRoutingProfileQueueConfigPropertyDsl {
    private val cdkBuilder: CfnRoutingProfile.RoutingProfileQueueConfigProperty.Builder =
        CfnRoutingProfile.RoutingProfileQueueConfigProperty.builder()

    /**
     * @param delay The delay, in seconds, a contact should be in the queue before they are routed
     *   to an available agent. For more information, see
     *   [Queues: priority and delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
     *   in the *Amazon Connect Administrator Guide* .
     */
    public fun delay(delay: Number) {
        cdkBuilder.delay(delay)
    }

    /**
     * @param priority The order in which contacts are to be handled for the queue. For more
     *   information, see
     *   [Queues: priority and delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
     *   .
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param queueReference Contains information about a queue resource. */
    public fun queueReference(queueReference: IResolvable) {
        cdkBuilder.queueReference(queueReference)
    }

    /** @param queueReference Contains information about a queue resource. */
    public fun queueReference(
        queueReference: CfnRoutingProfile.RoutingProfileQueueReferenceProperty
    ) {
        cdkBuilder.queueReference(queueReference)
    }

    public fun build(): CfnRoutingProfile.RoutingProfileQueueConfigProperty = cdkBuilder.build()
}
