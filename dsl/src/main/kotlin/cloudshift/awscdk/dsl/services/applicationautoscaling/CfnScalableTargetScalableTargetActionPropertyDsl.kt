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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

/**
 * `ScalableTargetAction` specifies the minimum and maximum capacity for the `ScalableTargetAction`
 * property of the
 * [AWS::ApplicationAutoScaling::ScalableTarget ScheduledAction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * ScalableTargetActionProperty scalableTargetActionProperty =
 * ScalableTargetActionProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html)
 */
@CdkDslMarker
public class CfnScalableTargetScalableTargetActionPropertyDsl {
    private val cdkBuilder: CfnScalableTarget.ScalableTargetActionProperty.Builder =
        CfnScalableTarget.ScalableTargetActionProperty.builder()

    /** @param maxCapacity The maximum capacity. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity The minimum capacity. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnScalableTarget.ScalableTargetActionProperty = cdkBuilder.build()
}
