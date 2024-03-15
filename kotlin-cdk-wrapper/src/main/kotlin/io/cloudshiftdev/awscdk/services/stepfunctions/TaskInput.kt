@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Type union for task classes that accept multiple types of payload.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockInvokeModel task = BedrockInvokeModel.Builder.create(this, "Prompt Model")
 * .model(model)
 * .body(TaskInput.fromObject(Map.of(
 * "inputText", "Generate a list of five first names.",
 * "textGenerationConfig", Map.of(
 * "maxTokenCount", 100,
 * "temperature", 1))))
 * .resultSelector(Map.of(
 * "names", JsonPath.stringAt("$.Body.results[0].outputText")))
 * .build();
 * ```
 */
public open class TaskInput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput,
) : CdkObject(cdkObject) {
  /**
   * type of task input.
   */
  public open fun type(): InputType = unwrap(this).getType().let(InputType::wrap)

  /**
   * payload for the corresponding input type.
   *
   * It can be a JSON-encoded object, context, data, etc.
   */
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public fun fromJsonPathAt(path: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromJsonPathAt(path).let(TaskInput::wrap)

    public fun fromObject(obj: Map<String, Any>): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromObject(obj).let(TaskInput::wrap)

    public fun fromText(text: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromText(text).let(TaskInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput): TaskInput
        = TaskInput(cdkObject)

    internal fun unwrap(wrapped: TaskInput): software.amazon.awscdk.services.stepfunctions.TaskInput
        = wrapped.cdkObject
  }
}
