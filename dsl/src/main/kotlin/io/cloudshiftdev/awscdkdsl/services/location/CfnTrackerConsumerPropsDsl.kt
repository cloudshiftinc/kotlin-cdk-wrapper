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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps

/**
 * Properties for defining a `CfnTrackerConsumer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnTrackerConsumerProps cfnTrackerConsumerProps = CfnTrackerConsumerProps.builder()
 * .consumerArn("consumerArn")
 * .trackerName("trackerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
 */
@CdkDslMarker
public class CfnTrackerConsumerPropsDsl {
    private val cdkBuilder: CfnTrackerConsumerProps.Builder = CfnTrackerConsumerProps.builder()

    /**
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     *   associated to tracker resource. Used when you need to specify a resource across all AWS .
     * * Format example:
     *   `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
     */
    public fun consumerArn(consumerArn: String) {
        cdkBuilder.consumerArn(consumerArn)
    }

    /**
     * @param trackerName The name for the tracker resource. Requirements:
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     */
    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTrackerConsumerProps = cdkBuilder.build()
}
