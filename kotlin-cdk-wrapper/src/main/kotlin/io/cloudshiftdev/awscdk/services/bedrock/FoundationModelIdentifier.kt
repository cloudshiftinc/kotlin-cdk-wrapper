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
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockInvokeModel task = BedrockInvokeModel.Builder.create(this, "Prompt Model")
 * .model(model)
 * .input(BedrockInvokeModelInputProps.builder().s3InputUri(JsonPath.stringAt("$.prompt")).build())
 * .output(BedrockInvokeModelOutputProps.builder().s3OutputUri(JsonPath.stringAt("$.prompt")).build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html)
 */
public open class FoundationModelIdentifier(
  cdkObject: software.amazon.awscdk.services.bedrock.FoundationModelIdentifier,
) : CdkObject(cdkObject) {
  public constructor(modelId: String) :
      this(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier(modelId)
  )

  /**
   * the model identifier.
   */
  public open fun modelId(): String = unwrap(this).getModelId()

  public companion object {
    public val AI21_J2_GRANDE_INSTRUCT: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_J2_GRANDE_INSTRUCT)

    public val AI21_J2_JAMBA_INSTRUCT_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_J2_JAMBA_INSTRUCT_V1_0)

    public val AI21_J2_JUMBO_INSTRUCT: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_J2_JUMBO_INSTRUCT)

    public val AI21_J2_MID: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_J2_MID)

    public val AI21_J2_ULTRA: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_J2_ULTRA)

    public val AI21_LABS_JURASSIC_2_MID_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_LABS_JURASSIC_2_MID_V1)

    public val AI21_LABS_JURASSIC_2_ULTRA_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_LABS_JURASSIC_2_ULTRA_V1)

    public val AI21_LABS_JURASSIC_2_ULTRA_V1_0_8_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AI21_LABS_JURASSIC_2_ULTRA_V1_0_8_K)

    public val AMAZON_TITAN_EMBED_G1_TEXT_02: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBED_G1_TEXT_02)

    public val AMAZON_TITAN_EMBED_IMAGE_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBED_IMAGE_V1_0)

    public val AMAZON_TITAN_EMBED_TEXT_V1_2_8_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBED_TEXT_V1_2_8_K)

    public val AMAZON_TITAN_EMBED_TEXT_V2_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBED_TEXT_V2_0)

    public val AMAZON_TITAN_EMBED_TEXT_V2_0_8_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBED_TEXT_V2_0_8_K)

    public val AMAZON_TITAN_EMBEDDINGS_G1_TEXT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_EMBEDDINGS_G1_TEXT_V1)

    public val AMAZON_TITAN_IMAGE_GENERATOR_G1_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_IMAGE_GENERATOR_G1_V1)

    public val AMAZON_TITAN_IMAGE_GENERATOR_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_IMAGE_GENERATOR_V1_0)

    public val AMAZON_TITAN_IMAGE_GENERATOR_V2_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_IMAGE_GENERATOR_V2_0)

    public val AMAZON_TITAN_MULTIMODAL_EMBEDDINGS_G1_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_MULTIMODAL_EMBEDDINGS_G1_V1)

    public val AMAZON_TITAN_TEXT_EXPRESS_V1_0_8_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_EXPRESS_V1_0_8_K)

    public val AMAZON_TITAN_TEXT_G1_EXPRESS_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1)

    public val AMAZON_TITAN_TEXT_G1_LITE_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_LITE_V1)

    public val AMAZON_TITAN_TEXT_LITE_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_LITE_V1)

    public val AMAZON_TITAN_TEXT_LITE_V1_0_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_LITE_V1_0_4_K)

    public val AMAZON_TITAN_TEXT_PREMIER_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TEXT_PREMIER_V1)

    public val AMAZON_TITAN_TG1_LARGE: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.AMAZON_TITAN_TG1_LARGE)

    public val ANTHROPIC_CLAUDE_3_5_SONNET_20240620_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_5_SONNET_20240620_V1_0)

    public val ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0)

    public val ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0_200_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0_200_K)

    public val ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0_48_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_HAIKU_20240307_V1_0_48_K)

    public val ANTHROPIC_CLAUDE_3_OPUS_20240229_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_OPUS_20240229_V1_0)

    public val ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0)

    public val ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0_200_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0_200_K)

    public val ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0_28_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_3_SONNET_20240229_V1_0_28_K)

    public val ANTHROPIC_CLAUDE_INSTANT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_INSTANT_V1)

    public val ANTHROPIC_CLAUDE_INSTANT_V1_2_100_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_INSTANT_V1_2_100_K)

    public val ANTHROPIC_CLAUDE_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V1)

    public val ANTHROPIC_CLAUDE_V2: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2)

    public val ANTHROPIC_CLAUDE_V2_0_100_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_0_100_K)

    public val ANTHROPIC_CLAUDE_V2_0_18_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_0_18_K)

    public val ANTHROPIC_CLAUDE_V2_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_1)

    public val ANTHROPIC_CLAUDE_V2_1_18_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_1_18_K)

    public val ANTHROPIC_CLAUDE_V2_1_200_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.ANTHROPIC_CLAUDE_V2_1_200_K)

    public val COHERE_COMMAND_LIGHT_TEXT_V14_7_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_LIGHT_TEXT_V14_7_4_K)

    public val COHERE_COMMAND_LIGHT_V14: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_LIGHT_V14)

    public val COHERE_COMMAND_R_PLUS_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_R_PLUS_V1)

    public val COHERE_COMMAND_R_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_R_V1)

    public val COHERE_COMMAND_TEXT_V14_7_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_TEXT_V14_7_4_K)

    public val COHERE_COMMAND_V14: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_COMMAND_V14)

    public val COHERE_EMBED_ENGLISH_V3: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_ENGLISH_V3)

    public val COHERE_EMBED_ENGLISH_V3_0_512: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_ENGLISH_V3_0_512)

    public val COHERE_EMBED_MULTILINGUAL_V3: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_MULTILINGUAL_V3)

    public val COHERE_EMBED_MULTILINGUAL_V3_0_512: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.COHERE_EMBED_MULTILINGUAL_V3_0_512)

    public val META_LLAMA_2_13_B_CHAT_V1_0_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_13_B_CHAT_V1_0_4_K)

    public val META_LLAMA_2_13_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_13_B_V1)

    public val META_LLAMA_2_13_B_V1_0_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_13_B_V1_0_4_K)

    public val META_LLAMA_2_70_B_CHAT_V1_0_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_70_B_CHAT_V1_0_4_K)

    public val META_LLAMA_2_70_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_70_B_V1)

    public val META_LLAMA_2_70_B_V1_0_4_K: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_70_B_V1_0_4_K)

    public val META_LLAMA_2_CHAT_13_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_CHAT_13_B_V1)

    public val META_LLAMA_2_CHAT_70_B_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_2_CHAT_70_B_V1)

    public val META_LLAMA_3_1_405_INSTRUCT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_3_1_405_INSTRUCT_V1)

    public val META_LLAMA_3_1_70_INSTRUCT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_3_1_70_INSTRUCT_V1)

    public val META_LLAMA_3_1_8_B_INSTRUCT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_3_1_8_B_INSTRUCT_V1)

    public val META_LLAMA_3_70_INSTRUCT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_3_70_INSTRUCT_V1)

    public val META_LLAMA_3_8_B_INSTRUCT_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.META_LLAMA_3_8_B_INSTRUCT_V1)

    public val MISTRAL_LARGE_2_V0_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.MISTRAL_LARGE_2_V0_1)

    public val MISTRAL_LARGE_V0_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.MISTRAL_LARGE_V0_1)

    public val MISTRAL_MISTRAL_7_B_INSTRUCT_V0_2: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.MISTRAL_MISTRAL_7_B_INSTRUCT_V0_2)

    public val MISTRAL_MIXTRAL_8_X7_B_INSTRUCT_V0_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.MISTRAL_MIXTRAL_8_X7_B_INSTRUCT_V0_1)

    public val MISTRAL_SMALL_V0_1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.MISTRAL_SMALL_V0_1)

    public val STABILITY_SD3_LARGE_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_SD3_LARGE_V1_0)

    public val STABILITY_STABLE_DIFFUSION_XL: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL)

    public val STABILITY_STABLE_DIFFUSION_XL_V0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL_V0)

    public val STABILITY_STABLE_DIFFUSION_XL_V1: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL_V1)

    public val STABILITY_STABLE_DIFFUSION_XL_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_DIFFUSION_XL_V1_0)

    public val STABILITY_STABLE_IMAGE_CORE_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_IMAGE_CORE_V1_0)

    public val STABILITY_STABLE_IMAGE_ULTRA_V1_0: FoundationModelIdentifier =
        FoundationModelIdentifier.wrap(software.amazon.awscdk.services.bedrock.FoundationModelIdentifier.STABILITY_STABLE_IMAGE_ULTRA_V1_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.FoundationModelIdentifier):
        FoundationModelIdentifier = FoundationModelIdentifier(cdkObject)

    internal fun unwrap(wrapped: FoundationModelIdentifier):
        software.amazon.awscdk.services.bedrock.FoundationModelIdentifier = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.FoundationModelIdentifier
  }
}
