@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The model identifiers for the Bedrock base foundation models.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html)
 */
public open class FoundationModelIdentifier internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.bedrock.FoundationModelIdentifier,
) : CdkObject(cdkObject) {
  public constructor(modelId: String) :
      this(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier(modelId))

  /**
   * the model identifier.
   */
  public open fun modelId(): String = unwrap(this).getModelId()

  public companion object {
    public val AI21_LABS_JURASSIC_2_MID_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_LABS_JURASSIC_2_MID_V1)

    public val AI21_LABS_JURASSIC_2_ULTRA_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_LABS_JURASSIC_2_ULTRA_V1)

    public val AMAZON_TITAN_EMBEDDINGS_G1_TEXT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBEDDINGS_G1_TEXT_V1)

    public val AMAZON_TITAN_IMAGE_GENERATOR_G1_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_IMAGE_GENERATOR_G1_V1)

    public val AMAZON_TITAN_MULTIMODAL_EMBEDDINGS_G1_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_MULTIMODAL_EMBEDDINGS_G1_V1)

    public val AMAZON_TITAN_TEXT_G1_EXPRESS_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1)

    public val ANTHROPIC_CLAUDE_INSTANT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_INSTANT_V1)

    public val ANTHROPIC_CLAUDE_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V1)

    public val ANTHROPIC_CLAUDE_V2: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2)

    public val ANTHROPIC_CLAUDE_V2_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_1)

    public val COHERE_COMMAND_LIGHT_V14: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_LIGHT_V14)

    public val COHERE_COMMAND_V14: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_V14)

    public val COHERE_EMBED_ENGLISH_V3: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_ENGLISH_V3)

    public val COHERE_EMBED_MULTILINGUAL_V3: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_MULTILINGUAL_V3)

    public val META_LLAMA_2_CHAT_13_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_CHAT_13_B_V1)

    public val META_LLAMA_2_CHAT_70_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_CHAT_70_B_V1)

    public val STABILITY_STABLE_DIFFUSION_XL_V0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL_V0)

    public val STABILITY_STABLE_DIFFUSION_XL_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL_V1)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.FoundationModelIdentifier):
        FoundationModelIdentifier = FoundationModelIdentifier(cdkObject)

    internal fun unwrap(wrapped: FoundationModelIdentifier):
        software.amazon.awscdk.services.bedrock.FoundationModelIdentifier = wrapped.cdkObject
  }
}
