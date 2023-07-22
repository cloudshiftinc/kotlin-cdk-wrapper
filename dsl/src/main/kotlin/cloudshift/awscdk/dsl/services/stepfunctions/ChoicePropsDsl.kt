@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ChoiceProps

/**
 * Properties for defining a Choice state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * ChoiceProps choiceProps = ChoiceProps.builder()
 * .comment("comment")
 * .inputPath("inputPath")
 * .outputPath("outputPath")
 * .build();
 * ```
 */
@CdkDslMarker
public class ChoicePropsDsl {
  private val cdkBuilder: ChoiceProps.Builder = ChoiceProps.builder()

  /**
   * @param comment An optional description for this state.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * May also be the special value DISCARD, which will cause the effective
   * input to be the empty object {}.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param outputPath JSONPath expression to select part of the state to be the output to this
   * state.
   * May also be the special value DISCARD, which will cause the effective
   * output to be the empty object {}.
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun build(): ChoiceProps = cdkBuilder.build()
}
