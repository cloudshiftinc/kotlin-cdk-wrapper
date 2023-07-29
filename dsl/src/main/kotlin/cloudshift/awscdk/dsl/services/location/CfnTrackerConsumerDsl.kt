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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.constructs.Construct

/**
 * The `AWS::Location::TrackerConsumer` resource specifies an association between a geofence
 * collection and a tracker resource.
 *
 * The geofence collection is referred to as the *consumer* of the tracker. This allows the tracker
 * resource to communicate location data to the linked geofence collection.
 *
 * Currently not supported — Cross-account configurations, such as creating associations between a
 * tracker resource in one account and a geofence collection in another account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnTrackerConsumer cfnTrackerConsumer = CfnTrackerConsumer.Builder.create(this,
 * "MyCfnTrackerConsumer")
 * .consumerArn("consumerArn")
 * .trackerName("trackerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html)
 */
@CdkDslMarker
public class CfnTrackerConsumerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrackerConsumer.Builder =
        CfnTrackerConsumer.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker
     * resource.
     *
     * Used when you need to specify a resource across all AWS .
     * * Format example:
     *   `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-consumerarn)
     *
     * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be
     *   associated to tracker resource.
     */
    public fun consumerArn(consumerArn: String) {
        cdkBuilder.consumerArn(consumerArn)
    }

    /**
     * The name for the tracker resource.
     *
     * Requirements:
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-trackerconsumer.html#cfn-location-trackerconsumer-trackername)
     *
     * @param trackerName The name for the tracker resource.
     */
    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTrackerConsumer = cdkBuilder.build()
}
