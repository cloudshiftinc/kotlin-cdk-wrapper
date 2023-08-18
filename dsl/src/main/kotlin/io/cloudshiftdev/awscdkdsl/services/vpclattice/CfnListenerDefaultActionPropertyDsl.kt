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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener

/**
 * The action for the default rule.
 *
 * Each listener has a default rule. Each rule consists of a priority, one or more actions, and one
 * or more conditions. The default rule is the rule that's used if no other rules match. Each rule
 * must include exactly one of the following types of actions: `forward` or `fixed-response` , and
 * it must be the last action to be performed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * DefaultActionProperty defaultActionProperty = DefaultActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html)
 */
@CdkDslMarker
public class CfnListenerDefaultActionPropertyDsl {
    private val cdkBuilder: CfnListener.DefaultActionProperty.Builder =
        CfnListener.DefaultActionProperty.builder()

    /** @param fixedResponse Information about an action that returns a custom HTTP response. */
    public fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse)
    }

    /** @param fixedResponse Information about an action that returns a custom HTTP response. */
    public fun fixedResponse(fixedResponse: CfnListener.FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse)
    }

    /**
     * @param forward Describes a forward action. You can use forward actions to route requests to
     *   one or more target groups.
     */
    public fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward)
    }

    /**
     * @param forward Describes a forward action. You can use forward actions to route requests to
     *   one or more target groups.
     */
    public fun forward(forward: CfnListener.ForwardProperty) {
        cdkBuilder.forward(forward)
    }

    public fun build(): CfnListener.DefaultActionProperty = cdkBuilder.build()
}
