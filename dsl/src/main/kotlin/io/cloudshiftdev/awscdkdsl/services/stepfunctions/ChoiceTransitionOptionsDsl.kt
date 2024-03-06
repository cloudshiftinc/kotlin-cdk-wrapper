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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions

/**
 * Options for Choice Transition.
 *
 * Example:
 * ```
 * Choice choice = Choice.Builder.create(this, "What color is it?")
 * .comment("color comment")
 * .build();
 * Pass handleBlueItem = new Pass(this, "HandleBlueItem");
 * Pass handleOtherItemColor = new Pass(this, "HanldeOtherItemColor");
 * choice.when(Condition.stringEquals("$.color", "BLUE"), handleBlueItem,
 * ChoiceTransitionOptions.builder()
 * .comment("blue item comment")
 * .build());
 * choice.otherwise(handleOtherItemColor);
 * ```
 */
@CdkDslMarker
public class ChoiceTransitionOptionsDsl {
    private val cdkBuilder: ChoiceTransitionOptions.Builder = ChoiceTransitionOptions.builder()

    /** @param comment An optional description for the choice transition. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): ChoiceTransitionOptions = cdkBuilder.build()
}
