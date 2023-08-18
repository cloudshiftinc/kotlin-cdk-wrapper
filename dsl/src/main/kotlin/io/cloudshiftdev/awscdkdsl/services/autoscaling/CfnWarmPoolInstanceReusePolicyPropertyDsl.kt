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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnWarmPool

/**
 * A structure that specifies an instance reuse policy for the `InstanceReusePolicy` property of the
 * [AWS::AutoScaling::WarmPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
 * resource.
 *
 * For more information, see
 * [Warm pools for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * InstanceReusePolicyProperty instanceReusePolicyProperty = InstanceReusePolicyProperty.builder()
 * .reuseOnScaleIn(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-warmpool-instancereusepolicy.html)
 */
@CdkDslMarker
public class CfnWarmPoolInstanceReusePolicyPropertyDsl {
    private val cdkBuilder: CfnWarmPool.InstanceReusePolicyProperty.Builder =
        CfnWarmPool.InstanceReusePolicyProperty.builder()

    /**
     * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
     *   to the warm pool on scale in.
     */
    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    /**
     * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned
     *   to the warm pool on scale in.
     */
    public fun reuseOnScaleIn(reuseOnScaleIn: IResolvable) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): CfnWarmPool.InstanceReusePolicyProperty = cdkBuilder.build()
}
