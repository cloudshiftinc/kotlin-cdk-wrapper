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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.eks.CfnNodegroup

/**
 * An object representing the scaling configuration details for the Auto Scaling group that is
 * associated with your node group.
 *
 * When creating a node group, you must specify all or none of the properties. When updating a node
 * group, you can specify any or none of the properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * ScalingConfigProperty scalingConfigProperty = ScalingConfigProperty.builder()
 * .desiredSize(123)
 * .maxSize(123)
 * .minSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html)
 */
@CdkDslMarker
public class CfnNodegroupScalingConfigPropertyDsl {
    private val cdkBuilder: CfnNodegroup.ScalingConfigProperty.Builder =
        CfnNodegroup.ScalingConfigProperty.builder()

    /**
     * @param desiredSize The current number of nodes that the managed node group should maintain.
     *
     * If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this
     * can cause the Cluster Autoscaler to suddenly scale up or scale down.
     *
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to
     * the specified size. If this parameter is given a value that is smaller than the current
     * number of running worker nodes, the necessary number of worker nodes are terminated to match
     * the given value. When using CloudFormation, no action occurs if you remove this parameter
     * from your CFN template.
     *
     * This parameter can be different from minSize in some cases, such as when starting with extra
     * hosts for testing. This parameter can also be different when you want to start with an
     * estimated number of needed hosts, but let Cluster Autoscaler reduce the number if there are
     * too many. When Cluster Autoscaler is used, the desiredSize parameter is altered by Cluster
     * Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler doesn't
     * scale a managed node group lower than minSize or higher than maxSize.
     */
    public fun desiredSize(desiredSize: Number) {
        cdkBuilder.desiredSize(desiredSize)
    }

    /**
     * @param maxSize The maximum number of nodes that the managed node group can scale out to. For
     *   information about the maximum number that you can specify, see
     *   [Amazon EKS service quotas](https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html)
     *   in the *Amazon EKS User Guide* .
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /** @param minSize The minimum number of nodes that the managed node group can scale in to. */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    public fun build(): CfnNodegroup.ScalingConfigProperty = cdkBuilder.build()
}
