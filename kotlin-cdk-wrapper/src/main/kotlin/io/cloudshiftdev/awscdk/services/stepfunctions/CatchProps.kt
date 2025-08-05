@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Error handler details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * Object outputs;
 * CatchProps catchProps = CatchProps.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .errors(List.of("errors"))
 * .outputs(outputs)
 * .resultPath("resultPath")
 * .build();
 * ```
 */
public interface CatchProps {
  /**
   * Workflow variables to store in this step.
   *
   * Using workflow variables, you can store data in a step and retrieve that data in future steps.
   *
   * Default: - Not assign variables
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
   */
  public fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

  /**
   * Errors to recover from by going to the given state.
   *
   * A list of error strings to retry, which can be either predefined errors
   * (for example Errors.NoChoiceMatched) or a self-defined error.
   *
   * Default: All errors
   */
  public fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

  /**
   * This option for JSONata only.
   *
   * When you use JSONPath, then the state ignores this property.
   * Used to specify and transform output from the state.
   * When specified, the value overrides the state output default.
   * The output field accepts any JSON value (object, array, string, number, boolean, null).
   * Any string value, including those inside objects or arrays,
   * will be evaluated as JSONata if surrounded by {% %} characters.
   * Output also accepts a JSONata expression directly.
   *
   * Default: - $states.result or $states.errorOutput
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
   */
  public fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * JSONPath expression to indicate where to inject the error data.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the error
   * data to be discarded.
   *
   * Default: $
   */
  public fun resultPath(): String? = unwrap(this).getResultPath()

  /**
   * A builder for [CatchProps]
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
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(errors: List<String>)

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(vararg errors: String)

    /**
     * @param outputs This option for JSONata only.
     * When you use JSONPath, then the state ignores this property.
     * Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the error data.
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     */
    public fun resultPath(resultPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CatchProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CatchProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(errors: List<String>) {
      cdkBuilder.errors(errors)
    }

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(vararg errors: String): Unit = errors(errors.toList())

    /**
     * @param outputs This option for JSONata only.
     * When you use JSONPath, then the state ignores this property.
     * Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the error data.
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CatchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps,
  ) : CdkObject(cdkObject),
      CatchProps {
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
     * Errors to recover from by going to the given state.
     *
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     *
     * Default: All errors
     */
    override fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

    /**
     * This option for JSONata only.
     *
     * When you use JSONPath, then the state ignores this property.
     * Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * JSONPath expression to indicate where to inject the error data.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CatchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps):
        CatchProps = CdkObjectWrappers.wrap(cdkObject) as? CatchProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CatchProps):
        software.amazon.awscdk.services.stepfunctions.CatchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.CatchProps
  }
}
