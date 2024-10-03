@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

/**
 * Guradrail settings for BedrockInvokeModel.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockInvokeModel task = BedrockInvokeModel.Builder.create(this, "Prompt Model with guardrail")
 * .model(model)
 * .body(TaskInput.fromObject(Map.of(
 * "inputText", "Generate a list of five first names.",
 * "textGenerationConfig", Map.of(
 * "maxTokenCount", 100,
 * "temperature", 1))))
 * .guardrail(Guardrail.enable("guardrailId", 1))
 * .resultSelector(Map.of(
 * "names", JsonPath.stringAt("$.Body.results[0].outputText")))
 * .build();
 * ```
 */
public open class Guardrail(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Guardrail,
) : CdkObject(cdkObject) {
  /**
   * The identitifier of guardrail.
   */
  public open fun guardrailIdentifier(): String = unwrap(this).getGuardrailIdentifier()

  /**
   * The version of guardrail.
   */
  public open fun guardrailVersion(): String = unwrap(this).getGuardrailVersion()

  public companion object {
    public fun enable(identifier: String, version: Number): Guardrail =
        software.amazon.awscdk.services.stepfunctions.tasks.Guardrail.enable(identifier,
        version).let(Guardrail::wrap)

    public fun enableDraft(identifier: String): Guardrail =
        software.amazon.awscdk.services.stepfunctions.tasks.Guardrail.enableDraft(identifier).let(Guardrail::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Guardrail):
        Guardrail = Guardrail(cdkObject)

    internal fun unwrap(wrapped: Guardrail):
        software.amazon.awscdk.services.stepfunctions.tasks.Guardrail = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.Guardrail
  }
}
