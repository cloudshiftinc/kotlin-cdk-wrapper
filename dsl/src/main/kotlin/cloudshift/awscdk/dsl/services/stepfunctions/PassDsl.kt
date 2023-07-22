@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.Result
import software.constructs.Construct

/**
 * Define a Pass in the state machine.
 *
 * A Pass state can be used to transform the current execution's state.
 *
 * Example:
 *
 * ```
 * Choice choice = new Choice(this, "Did it work?");
 * // Add conditions with .when()
 * Pass successState = new Pass(this, "SuccessState");
 * Pass failureState = new Pass(this, "FailureState");
 * choice.when(Condition.stringEquals("$.status", "SUCCESS"), successState);
 * choice.when(Condition.numberGreaterThan("$.attempts", 5), failureState);
 * // Use .otherwise() to indicate what should be done if none of the conditions match
 * Pass tryAgainState = new Pass(this, "TryAgainState");
 * choice.otherwise(tryAgainState);
 * ```
 */
@CdkDslMarker
public class PassDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Pass.Builder = Pass.Builder.create(scope, id)

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
   * May also be the special value JsonPath.DISCARD, which will cause the effective
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
   * May also be the special value JsonPath.DISCARD, which will cause the effective
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

  /**
   * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
   * that select from the input.
   *
   * Default: No parameters
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
   * @param parameters Parameters pass a collection of key-value pairs, either static values or
   * JSONPath expressions that select from the input. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
   * that select from the input.
   *
   * Default: No parameters
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
   * @param parameters Parameters pass a collection of key-value pairs, either static values or
   * JSONPath expressions that select from the input. 
   */
  public fun parameters(parameters: Map<String, Any>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * If given, treat as the result of this operation.
   *
   * Can be used to inject or replace the current execution state.
   *
   * Default: No injected result
   *
   * @param result If given, treat as the result of this operation. 
   */
  public fun result(result: Result) {
    cdkBuilder.result(result)
  }

  /**
   * JSONPath expression to indicate where to inject the state's output.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   *
   * Default: $
   *
   * @param resultPath JSONPath expression to indicate where to inject the state's output. 
   */
  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun build(): Pass = cdkBuilder.build()
}
