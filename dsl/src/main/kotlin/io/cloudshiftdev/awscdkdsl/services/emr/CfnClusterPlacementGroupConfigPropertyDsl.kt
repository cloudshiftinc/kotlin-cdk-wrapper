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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * Placement group configuration for an Amazon EMR cluster.
 *
 * The configuration specifies the placement strategy that can be applied to instance roles during
 * cluster creation.
 *
 * To use this configuration, consider attaching managed policy
 * AmazonElasticMapReducePlacementGroupPolicy to the Amazon EMR role.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * PlacementGroupConfigProperty placementGroupConfigProperty =
 * PlacementGroupConfigProperty.builder()
 * .instanceRole("instanceRole")
 * // the properties below are optional
 * .placementStrategy("placementStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html)
 */
@CdkDslMarker
public class CfnClusterPlacementGroupConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.PlacementGroupConfigProperty.Builder =
        CfnCluster.PlacementGroupConfigProperty.builder()

    /**
     * @param instanceRole Role of the instance in the cluster. Starting with Amazon EMR release
     *   5.23.0, the only supported instance role is `MASTER` .
     */
    public fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
    }

    /**
     * @param placementStrategy Amazon EC2 Placement Group strategy associated with instance role.
     *   Starting with Amazon EMR release 5.23.0, the only supported placement strategy is `SPREAD`
     *   for the `MASTER` instance role.
     */
    public fun placementStrategy(placementStrategy: String) {
        cdkBuilder.placementStrategy(placementStrategy)
    }

    public fun build(): CfnCluster.PlacementGroupConfigProperty = cdkBuilder.build()
}
