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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.CfnAutoScalingScheduledAction

/**
 * With scheduled actions, the group size properties of an Auto Scaling group can change at any
 * time.
 *
 * When you update a stack with an Auto Scaling group and scheduled action, AWS CloudFormation
 * always sets the group size property values of your Auto Scaling group to the values that are
 * defined in the AWS::AutoScaling::AutoScalingGroup resource of your template, even if a scheduled
 * action is in effect.
 *
 * If you do not want AWS CloudFormation to change any of the group size property values when you
 * have a scheduled action in effect, use the AutoScalingScheduledAction update policy to prevent
 * AWS CloudFormation from changing the MinSize, MaxSize, or DesiredCapacity properties unless you
 * have modified these values in your template.\
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnAutoScalingScheduledAction cfnAutoScalingScheduledAction =
 * CfnAutoScalingScheduledAction.builder()
 * .ignoreUnmodifiedGroupSizeProperties(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnAutoScalingScheduledActionDsl {
    private val cdkBuilder: CfnAutoScalingScheduledAction.Builder =
        CfnAutoScalingScheduledAction.builder()

    /** @param ignoreUnmodifiedGroupSizeProperties the value to be set. */
    public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
        cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
    }

    public fun build(): CfnAutoScalingScheduledAction = cdkBuilder.build()
}
