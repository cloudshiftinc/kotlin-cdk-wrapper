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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * The placement configuration for all the control plane instances of your local Amazon EKS cluster
 * on an AWS Outpost.
 *
 * For more information, see
 * [Capacity considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
 * in the Amazon EKS User Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * ControlPlanePlacementProperty controlPlanePlacementProperty =
 * ControlPlanePlacementProperty.builder()
 * .groupName("groupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-controlplaneplacement.html)
 */
@CdkDslMarker
public class CfnClusterControlPlanePlacementPropertyDsl {
    private val cdkBuilder: CfnCluster.ControlPlanePlacementProperty.Builder =
        CfnCluster.ControlPlanePlacementProperty.builder()

    /**
     * @param groupName The name of the placement group for the Kubernetes control plane instances.
     *   This property is only used for a local cluster on an AWS Outpost.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun build(): CfnCluster.ControlPlanePlacementProperty = cdkBuilder.build()
}
