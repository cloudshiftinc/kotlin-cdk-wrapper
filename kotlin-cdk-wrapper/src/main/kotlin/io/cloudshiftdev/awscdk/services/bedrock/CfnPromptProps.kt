@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnPrompt`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnPromptProps cfnPromptProps = CfnPromptProps.builder()
 * .name("name")
 * // the properties below are optional
 * .customerEncryptionKeyArn("customerEncryptionKeyArn")
 * .defaultVariant("defaultVariant")
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .variants(List.of(PromptVariantProperty.builder()
 * .name("name")
 * .templateType("templateType")
 * // the properties below are optional
 * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
 * .text(PromptModelInferenceConfigurationProperty.builder()
 * .maxTokens(123)
 * .stopSequences(List.of("stopSequences"))
 * .temperature(123)
 * .topK(123)
 * .topP(123)
 * .build())
 * .build())
 * .modelId("modelId")
 * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
 * .text(TextPromptTemplateConfigurationProperty.builder()
 * .inputVariables(List.of(PromptInputVariableProperty.builder()
 * .name("name")
 * .build()))
 * .text("text")
 * .textS3Location(TextS3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html)
 */
public interface CfnPromptProps {
  /**
   * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
   */
  public fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The name of the default variant for the prompt.
   *
   * This value must match the `name` field in the relevant
   * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
   * object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
   */
  public fun defaultVariant(): String? = unwrap(this).getDefaultVariant()

  /**
   * The description of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
   */
  public fun name(): String

  /**
   * Metadata that you can assign to a resource as key-value pairs. For more information, see the
   * following resources:.
   *
   * * [Tag naming limits and
   * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
   * * [Tagging best
   * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of objects, each containing details about a variant of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
   */
  public fun variants(): Any? = unwrap(this).getVariants()

  /**
   * A builder for [CfnPromptProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with.
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * @param defaultVariant The name of the default variant for the prompt.
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     */
    public fun defaultVariant(defaultVariant: String)

    /**
     * @param description The description of the prompt.
     */
    public fun description(description: String)

    /**
     * @param name The name of the prompt. 
     */
    public fun name(name: String)

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    public fun variants(variants: IResolvable)

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    public fun variants(variants: List<Any>)

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPromptProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnPromptProps.builder()

    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with.
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * @param defaultVariant The name of the default variant for the prompt.
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     */
    override fun defaultVariant(defaultVariant: String) {
      cdkBuilder.defaultVariant(defaultVariant)
    }

    /**
     * @param description The description of the prompt.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the prompt. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param variants A list of objects, each containing details about a variant of the prompt.
     */
    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptProps,
  ) : CdkObject(cdkObject),
      CfnPromptProps {
    /**
     * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
     */
    override fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

    /**
     * The name of the default variant for the prompt.
     *
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
     */
    override fun defaultVariant(): String? = unwrap(this).getDefaultVariant()

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     */
    override fun variants(): Any? = unwrap(this).getVariants()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPromptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptProps):
        CfnPromptProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPromptProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPromptProps):
        software.amazon.awscdk.services.bedrock.CfnPromptProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.bedrock.CfnPromptProps
  }
}
