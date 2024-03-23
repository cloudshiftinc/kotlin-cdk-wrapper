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
 * Options for creating a single state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object resultSelector;
 * SingleStateOptions singleStateOptions = SingleStateOptions.builder()
 * .comment("comment")
 * .inputPath("inputPath")
 * .outputPath("outputPath")
 * .prefixStates("prefixStates")
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateId("stateId")
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface SingleStateOptions : ParallelProps {
  /**
   * String to prefix all stateIds in the state machine with.
   *
   * Default: stateId
   */
  public fun prefixStates(): String? = unwrap(this).getPrefixStates()

  /**
   * ID of newly created containing state.
   *
   * Default: Construct ID of the StateMachineFragment
   */
  public fun stateId(): String? = unwrap(this).getStateId()

  /**
   * A builder for [SingleStateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment An optional description for this state.
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
     * @param prefixStates String to prefix all stateIds in the state machine with.
     */
    public fun prefixStates(prefixStates: String)

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
     * @param stateId ID of newly created containing state.
     */
    public fun stateId(stateId: String)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder
        = software.amazon.awscdk.services.stepfunctions.SingleStateOptions.builder()

    /**
     * @param comment An optional description for this state.
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
     * @param prefixStates String to prefix all stateIds in the state machine with.
     */
    override fun prefixStates(prefixStates: String) {
      cdkBuilder.prefixStates(prefixStates)
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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param stateId ID of newly created containing state.
     */
    override fun stateId(stateId: String) {
      cdkBuilder.stateId(stateId)
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.SingleStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.SingleStateOptions,
  ) : CdkObject(cdkObject), SingleStateOptions {
    /**
     * An optional description for this state.
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
     * String to prefix all stateIds in the state machine with.
     *
     * Default: stateId
     */
    override fun prefixStates(): String? = unwrap(this).getPrefixStates()

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
     * ID of newly created containing state.
     *
     * Default: Construct ID of the StateMachineFragment
     */
    override fun stateId(): String? = unwrap(this).getStateId()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SingleStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.SingleStateOptions):
        SingleStateOptions = CdkObjectWrappers.wrap(cdkObject) as? SingleStateOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SingleStateOptions):
        software.amazon.awscdk.services.stepfunctions.SingleStateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.SingleStateOptions
  }
}
