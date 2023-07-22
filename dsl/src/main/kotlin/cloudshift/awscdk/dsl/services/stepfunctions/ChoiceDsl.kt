@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.Choice
import software.constructs.Construct

@CdkDslMarker
public class ChoiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Choice.Builder = Choice.Builder.create(scope, id)

  /**
   * An optional description for this state.
   *
   * Default: No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: $
   *
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * 
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * JSONPath expression to select part of the state to be the output to this state.
   *
   * May also be the special value DISCARD, which will cause the effective
   * output to be the empty object {}.
   *
   * Default: $
   *
   * @param outputPath JSONPath expression to select part of the state to be the output to this
   * state. 
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun build(): Choice = cdkBuilder.build()
}
