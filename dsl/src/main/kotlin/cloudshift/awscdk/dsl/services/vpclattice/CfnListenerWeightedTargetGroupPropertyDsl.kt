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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnListener

/**
 * Describes the weight of a target group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * WeightedTargetGroupProperty weightedTargetGroupProperty = WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html)
 */
@CdkDslMarker
public class CfnListenerWeightedTargetGroupPropertyDsl {
    private val cdkBuilder: CfnListener.WeightedTargetGroupProperty.Builder =
        CfnListener.WeightedTargetGroupProperty.builder()

    /** @param targetGroupIdentifier The ID of the target group. */
    public fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
    }

    /**
     * @param weight Only required if you specify multiple target groups for a forward action. The
     *   "weight" determines how requests are distributed to the target group. For example, if you
     *   specify two target groups, each with a weight of 10, each target group receives half the
     *   requests. If you specify two target groups, one with a weight of 10 and the other with a
     *   weight of 20, the target group with a weight of 20 receives twice as many requests as the
     *   other target group. If there's only one target group specified, then the default value
     *   is 100.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnListener.WeightedTargetGroupProperty = cdkBuilder.build()
}
