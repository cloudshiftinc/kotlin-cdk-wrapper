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
import kotlin.Number
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * `ScalingConstraints` is a subproperty of the `AutoScalingPolicy` property type.
 *
 * `ScalingConstraints` defines the upper and lower EC2 instance limits for an automatic scaling
 * policy. Automatic scaling activities triggered by automatic scaling rules will not cause an
 * instance group to grow above or shrink below these limits.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigScalingConstraintsPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder =
        CfnInstanceGroupConfig.ScalingConstraintsProperty.builder()

    /**
     * @param maxCapacity The upper boundary of Amazon EC2 instances in an instance group beyond
     *   which scaling activities are not allowed to grow. Scale-out activities will not add
     *   instances beyond this boundary.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The lower boundary of Amazon EC2 instances in an instance group below
     *   which scaling activities are not allowed to shrink. Scale-in activities will not terminate
     *   instances below this boundary.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnInstanceGroupConfig.ScalingConstraintsProperty = cdkBuilder.build()
}
