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
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes the action for a rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * ActionProperty actionProperty = ActionProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html)
 */
@CdkDslMarker
public class CfnRuleActionPropertyDsl {
    private val cdkBuilder: CfnRule.ActionProperty.Builder = CfnRule.ActionProperty.builder()

    /** @param fixedResponse The fixed response action. The rule returns a custom HTTP response. */
    public fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse)
    }

    /** @param fixedResponse The fixed response action. The rule returns a custom HTTP response. */
    public fun fixedResponse(fixedResponse: CfnRule.FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse)
    }

    /**
     * @param forward The forward action. Traffic that matches the rule is forwarded to the
     *   specified target groups.
     */
    public fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward)
    }

    /**
     * @param forward The forward action. Traffic that matches the rule is forwarded to the
     *   specified target groups.
     */
    public fun forward(forward: CfnRule.ForwardProperty) {
        cdkBuilder.forward(forward)
    }

    public fun build(): CfnRule.ActionProperty = cdkBuilder.build()
}
