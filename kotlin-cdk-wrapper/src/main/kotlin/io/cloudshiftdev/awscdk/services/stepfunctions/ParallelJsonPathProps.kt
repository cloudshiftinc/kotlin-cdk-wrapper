@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a Parallel state that using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * Object parameters;
 * Object resultSelector;
 * ParallelJsonPathProps parallelJsonPathProps = ParallelJsonPathProps.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .inputPath("inputPath")
 * .outputPath("outputPath")
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface ParallelJsonPathProps : StateBaseProps, AssignableStateOptions,
    JsonPathCommonOptions {
  /**
   * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
   * that select from the input.
   *
   * Default: No parameters
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * JSONPath expression to indicate where to inject the state's output.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   *
   * Default: $
   */
  public fun resultPath(): String? = unwrap(this).getResultPath()

  /**
   * The JSON that will replace the state's raw result and become the effective result before
   * ResultPath is applied.
   *
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
   */
  public fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

  /**
   * A builder for [ParallelJsonPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     * JSONPath expressions that select from the input.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     * JSONPath expressions that select from the input.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps,
  ) : CdkObject(cdkObject),
      ParallelJsonPathProps {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
     * that select from the input.
     *
     * Default: No parameters
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParallelJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps):
        ParallelJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as? ParallelJsonPathProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParallelJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ParallelJsonPathProps
  }
}
