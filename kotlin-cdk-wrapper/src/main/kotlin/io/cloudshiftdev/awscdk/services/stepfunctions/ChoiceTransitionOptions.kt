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
 * Options for Choice Transition.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Connection connection;
 * HttpInvoke getIssue = HttpInvoke.jsonata(this, "Get Issue", HttpInvokeJsonataProps.builder()
 * .connection(connection)
 * .apiRoot("{% 'https://' &amp; $states.input.hostname %}")
 * .apiEndpoint(TaskInput.fromText("{% 'issues/' &amp; $states.input.issue.id %}"))
 * .method(TaskInput.fromText("GET"))
 * // Parse the API call result to object and set to the variables
 * .assign(Map.of(
 * "hostname", "{% $states.input.hostname %}",
 * "issue", "{% $parse($states.result.ResponseBody) %}"))
 * .build());
 * HttpInvoke updateLabels = HttpInvoke.jsonata(this, "Update Issue Labels",
 * HttpInvokeJsonataProps.builder()
 * .connection(connection)
 * .apiRoot("{% 'https://' &amp; $states.input.hostname %}")
 * .apiEndpoint(TaskInput.fromText("{% 'issues/' &amp; $states.input.issue.id &amp; 'labels' %}"))
 * .method(TaskInput.fromText("POST"))
 * .body(TaskInput.fromObject(Map.of(
 * "labels", "{% [$type, $component] %}")))
 * .build());
 * Pass notMatchTitleTemplate = Pass.jsonata(this, "Not Match Title Template");
 * Chain definition = getIssue.next(Choice.jsonata(this, "Match Title
 * Template?").when(Condition.jsonata("{% $contains($issue.title, /(feat)|(fix)|(chore)(w*):.*&#47;)
 * %}"), updateLabels, ChoiceTransitionOptions.builder()
 * .assign(Map.of(
 * "type", "{% $match($states.input.title, /(w*)((.*))/).groups[0] %}",
 * "component", "{% $match($states.input.title, /(w*)((.*))/).groups[1] %}"))
 * .build()).otherwise(notMatchTitleTemplate));
 * StateMachine.Builder.create(this, "StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(definition))
 * .timeout(Duration.minutes(5))
 * .comment("automate issue labeling state machine")
 * .build();
 * ```
 */
public interface ChoiceTransitionOptions : AssignableStateOptions {
  /**
   * An optional description for the choice transition.
   *
   * Default: No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

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
   * A builder for [ChoiceTransitionOptions]
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
     * @param comment An optional description for the choice transition.
     */
    public fun comment(comment: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment An optional description for the choice transition.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions,
  ) : CdkObject(cdkObject),
      ChoiceTransitionOptions {
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
     * An optional description for the choice transition.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ChoiceTransitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions):
        ChoiceTransitionOptions = CdkObjectWrappers.wrap(cdkObject) as? ChoiceTransitionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChoiceTransitionOptions):
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions
  }
}
