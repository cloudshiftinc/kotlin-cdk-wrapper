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

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

/**
 * The trigger threshold of the action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * ActionThresholdProperty actionThresholdProperty = ActionThresholdProperty.builder()
 * .type("type")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html)
 */
@CdkDslMarker
public class CfnBudgetsActionActionThresholdPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.ActionThresholdProperty.Builder =
        CfnBudgetsAction.ActionThresholdProperty.builder()

    /** @param type The type of threshold for a notification. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The threshold of a notification. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBudgetsAction.ActionThresholdProperty = cdkBuilder.build()
}
