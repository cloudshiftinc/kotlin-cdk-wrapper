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
 * The update configuration for the node group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * UpdateConfigProperty updateConfigProperty = UpdateConfigProperty.builder()
 * .maxUnavailable(123)
 * .maxUnavailablePercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html)
 */
@CdkDslMarker
public class CfnNodegroupUpdateConfigPropertyDsl {
    private val cdkBuilder: CfnNodegroup.UpdateConfigProperty.Builder =
        CfnNodegroup.UpdateConfigProperty.builder()

    /**
     * @param maxUnavailable The maximum number of nodes unavailable at once during a version
     *   update. Nodes will be updated in parallel. This value or `maxUnavailablePercentage` is
     *   required to have a value.The maximum number is 100.
     */
    public fun maxUnavailable(maxUnavailable: Number) {
        cdkBuilder.maxUnavailable(maxUnavailable)
    }

    /**
     * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a version
     *   update. This percentage of nodes will be updated in parallel, up to 100 nodes at once. This
     *   value or `maxUnavailable` is required to have a value.
     */
    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
        cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
    }

    public fun build(): CfnNodegroup.UpdateConfigProperty = cdkBuilder.build()
}
