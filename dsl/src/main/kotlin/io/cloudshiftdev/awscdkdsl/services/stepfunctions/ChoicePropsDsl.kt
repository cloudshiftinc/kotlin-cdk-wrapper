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
import software.amazon.awscdk.services.stepfunctions.ChoiceProps

/**
 * Properties for defining a Choice state.
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
public class ChoicePropsDsl {
    private val cdkBuilder: ChoiceProps.Builder = ChoiceProps.builder()

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective
     *   output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    public fun build(): ChoiceProps = cdkBuilder.build()
}
