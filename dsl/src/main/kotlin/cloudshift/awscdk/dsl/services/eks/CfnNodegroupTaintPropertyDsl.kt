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
import kotlin.String
import software.amazon.awscdk.services.eks.CfnNodegroup

/**
 * A property that allows a node to repel a set of pods.
 *
 * For more information, see
 * [Node taints on managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * TaintProperty taintProperty = TaintProperty.builder()
 * .effect("effect")
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html)
 */
@CdkDslMarker
public class CfnNodegroupTaintPropertyDsl {
    private val cdkBuilder: CfnNodegroup.TaintProperty.Builder =
        CfnNodegroup.TaintProperty.builder()

    /** @param effect The effect of the taint. */
    public fun effect(effect: String) {
        cdkBuilder.effect(effect)
    }

    /** @param key The key of the taint. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of the taint. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnNodegroup.TaintProperty = cdkBuilder.build()
}
