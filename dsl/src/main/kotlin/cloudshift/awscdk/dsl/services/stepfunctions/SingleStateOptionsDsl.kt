@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.SingleStateOptions

@CdkDslMarker
public class SingleStateOptionsDsl {
  private val cdkBuilder: SingleStateOptions.Builder = SingleStateOptions.builder()

  /**
   * @param comment An optional description for this state.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param outputPath JSONPath expression to select part of the state to be the output to this
   * state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * @param prefixStates String to prefix all stateIds in the state machine with.
   */
  public fun prefixStates(prefixStates: String) {
    cdkBuilder.prefixStates(prefixStates)
  }

  /**
   * @param resultPath JSONPath expression to indicate where to inject the state's output.
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   */
  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  /**
   * @param stateId ID of newly created containing state.
   */
  public fun stateId(stateId: String) {
    cdkBuilder.stateId(stateId)
  }

  public fun build(): SingleStateOptions = cdkBuilder.build()
}
