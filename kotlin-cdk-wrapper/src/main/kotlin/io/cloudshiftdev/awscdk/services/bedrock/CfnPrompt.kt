@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a prompt in your prompt library that you can add to a flow.
 *
 * For more information, see [Prompt management in Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) , [Create a
 * prompt using Prompt
 * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html) and
 * [Prompt flows in Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows.html) in
 * the Amazon Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnPrompt cfnPrompt = CfnPrompt.Builder.create(this, "MyCfnPrompt")
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
public open class CfnPrompt(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnPrompt(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPromptProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPromptProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the prompt or the prompt version (if you specified a version
   * in the request).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time at which the prompt was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The unique identifier of the prompt.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The time at which the prompt was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The version of the prompt that this summary applies to.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
   */
  public open fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
   */
  public open fun customerEncryptionKeyArn(`value`: String) {
    unwrap(this).setCustomerEncryptionKeyArn(`value`)
  }

  /**
   * The name of the default variant for the prompt.
   */
  public open fun defaultVariant(): String? = unwrap(this).getDefaultVariant()

  /**
   * The name of the default variant for the prompt.
   */
  public open fun defaultVariant(`value`: String) {
    unwrap(this).setDefaultVariant(`value`)
  }

  /**
   * The description of the prompt.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the prompt.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the prompt.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the prompt.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(): Any? = unwrap(this).getVariants()

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(`value`: IResolvable) {
    unwrap(this).setVariants(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(`value`: List<Any>) {
    unwrap(this).setVariants(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(vararg `value`: Any): Unit = variants(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnPrompt].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with. 
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * The name of the default variant for the prompt.
     *
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
     * @param defaultVariant The name of the default variant for the prompt. 
     */
    public fun defaultVariant(defaultVariant: String)

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
     * @param description The description of the prompt. 
     */
    public fun description(description: String)

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
     * @param name The name of the prompt. 
     */
    public fun name(name: String)

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
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(variants: IResolvable)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(variants: List<Any>)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPrompt.Builder =
        software.amazon.awscdk.services.bedrock.CfnPrompt.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with. 
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * The name of the default variant for the prompt.
     *
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
     * @param defaultVariant The name of the default variant for the prompt. 
     */
    override fun defaultVariant(defaultVariant: String) {
      cdkBuilder.defaultVariant(defaultVariant)
    }

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
     * @param description The description of the prompt. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
     * @param name The name of the prompt. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnPrompt.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrompt {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrompt(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt): CfnPrompt =
        CfnPrompt(cdkObject)

    internal fun unwrap(wrapped: CfnPrompt): software.amazon.awscdk.services.bedrock.CfnPrompt =
        wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnPrompt
  }

  /**
   * Contains inference configurations for the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptInferenceConfigurationProperty promptInferenceConfigurationProperty =
   * PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html#cfn-bedrock-prompt-promptinferenceconfiguration-text)
     */
    public fun text(): Any

    /**
     * A builder for [PromptInferenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      public fun text(text: IResolvable)

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      public fun text(text: PromptModelInferenceConfigurationProperty)

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab599a4b78a1bf3e23ad8b9ea15d050ccc01528c07661c74cfa41231f8a3dedc")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty.builder()

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      override fun text(text: IResolvable) {
        cdkBuilder.text(text.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      override fun text(text: PromptModelInferenceConfigurationProperty) {
        cdkBuilder.text(text.let(PromptModelInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab599a4b78a1bf3e23ad8b9ea15d050ccc01528c07661c74cfa41231f8a3dedc")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html#cfn-bedrock-prompt-promptinferenceconfiguration-text)
       */
      override fun text(): Any = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptInferenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty
    }
  }

  /**
   * Contains information about a variable in the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptInputVariableProperty promptInputVariableProperty = PromptInputVariableProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html#cfn-bedrock-prompt-promptinputvariable-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [PromptInputVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the variable.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html#cfn-bedrock-prompt-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty
    }
  }

  /**
   * Contains inference configurations related to model inference for a prompt.
   *
   * For more information, see [Inference
   * parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/inference-parameters.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptModelInferenceConfigurationProperty promptModelInferenceConfigurationProperty =
   * PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The number of most-likely candidates that the model considers for the next token during
     * generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topk)
     */
    public fun topK(): Number? = unwrap(this).getTopK()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topp)
     */
    public fun topP(): Number? = unwrap(this).getTopP()

    /**
     * A builder for [PromptModelInferenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens to return in the response.
       */
      public fun maxTokens(maxTokens: Number)

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      public fun stopSequences(stopSequences: List<String>)

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      public fun stopSequences(vararg stopSequences: String)

      /**
       * @param temperature Controls the randomness of the response.
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       */
      public fun temperature(temperature: Number)

      /**
       * @param topK The number of most-likely candidates that the model considers for the next
       * token during generation.
       */
      public fun topK(topK: Number)

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      public fun topP(topP: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens to return in the response.
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      override fun stopSequences(stopSequences: List<String>) {
        cdkBuilder.stopSequences(stopSequences)
      }

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      override fun stopSequences(vararg stopSequences: String): Unit =
          stopSequences(stopSequences.toList())

      /**
       * @param temperature Controls the randomness of the response.
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       */
      override fun temperature(temperature: Number) {
        cdkBuilder.temperature(temperature)
      }

      /**
       * @param topK The number of most-likely candidates that the model considers for the next
       * token during generation.
       */
      override fun topK(topK: Number) {
        cdkBuilder.topK(topK)
      }

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      override fun topP(topP: Number) {
        cdkBuilder.topP(topP)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The number of most-likely candidates that the model considers for the next token during
       * generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topk)
       */
      override fun topK(): Number? = unwrap(this).getTopK()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topp)
       */
      override fun topP(): Number? = unwrap(this).getTopP()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptModelInferenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
    }
  }

  /**
   * Contains the message for a prompt.
   *
   * For more information, see [Prompt management in Amazon
   * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptTemplateConfigurationProperty promptTemplateConfigurationProperty =
   * PromptTemplateConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-text)
     */
    public fun text(): Any

    /**
     * A builder for [PromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      public fun text(text: IResolvable)

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      public fun text(text: TextPromptTemplateConfigurationProperty)

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("554107c324cc7377756d6996f21ba0e9883d0fe2fecc8d558b6268f3effb0fa1")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty.builder()

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      override fun text(text: IResolvable) {
        cdkBuilder.text(text.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      override fun text(text: TextPromptTemplateConfigurationProperty) {
        cdkBuilder.text(text.let(TextPromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("554107c324cc7377756d6996f21ba0e9883d0fe2fecc8d558b6268f3effb0fa1")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-text)
       */
      override fun text(): Any = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty
    }
  }

  /**
   * Contains details about a variant of the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptVariantProperty promptVariantProperty = PromptVariantProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html)
   */
  public interface PromptVariantProperty {
    /**
     * Contains inference configurations for the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * The unique identifier of the model with which to run inference on the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The name of the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-name)
     */
    public fun name(): String

    /**
     * Contains configurations for the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templateconfiguration)
     */
    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    /**
     * The type of prompt template to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templatetype)
     */
    public fun templateType(): String

    /**
     * A builder for [PromptVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90dbe0e59146cb52dc591b153c5872cdeeb89cca8ca46eb283039cb48af6d817")
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param modelId The unique identifier of the model with which to run inference on the
       * prompt.
       */
      public fun modelId(modelId: String)

      /**
       * @param name The name of the prompt variant. 
       */
      public fun name(name: String)

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      public fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty)

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5758586513ea834b3c833df383cab1d46ccf68ff3294044c3168cd548c90393e")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template to use. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty.builder()

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90dbe0e59146cb52dc591b153c5872cdeeb89cca8ca46eb283039cb48af6d817")
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceConfiguration(PromptInferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param modelId The unique identifier of the model with which to run inference on the
       * prompt.
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param name The name of the prompt variant. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(PromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5758586513ea834b3c833df383cab1d46ccf68ff3294044c3168cd548c90393e")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template to use. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty,
    ) : CdkObject(cdkObject),
        PromptVariantProperty {
      /**
       * Contains inference configurations for the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * The unique identifier of the model with which to run inference on the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The name of the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Contains configurations for the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templateconfiguration)
       */
      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty):
          PromptVariantProperty = CdkObjectWrappers.wrap(cdkObject) as? PromptVariantProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptVariantProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty
    }
  }

  /**
   * Contains configurations for a text prompt template.
   *
   * To include a variable, enclose a word in double curly braces as in `{{variable}}` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TextPromptTemplateConfigurationProperty textPromptTemplateConfigurationProperty =
   * TextPromptTemplateConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * The Amazon S3 location of the prompt text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-texts3location)
     */
    public fun textS3Location(): Any? = unwrap(this).getTextS3Location()

    /**
     * A builder for [TextPromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(inputVariables: IResolvable)

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(inputVariables: List<Any>)

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(vararg inputVariables: Any)

      /**
       * @param text The message for the prompt.
       */
      public fun text(text: String)

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      public fun textS3Location(textS3Location: IResolvable)

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      public fun textS3Location(textS3Location: TextS3LocationProperty)

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02427a56088d9207e758c07379af97595ff46441a363782bde2a8f9c67a84ce4")
      public fun textS3Location(textS3Location: TextS3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty.builder()

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(inputVariables: IResolvable) {
        cdkBuilder.inputVariables(inputVariables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(inputVariables: List<Any>) {
        cdkBuilder.inputVariables(inputVariables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(vararg inputVariables: Any): Unit =
          inputVariables(inputVariables.toList())

      /**
       * @param text The message for the prompt.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      override fun textS3Location(textS3Location: IResolvable) {
        cdkBuilder.textS3Location(textS3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      override fun textS3Location(textS3Location: TextS3LocationProperty) {
        cdkBuilder.textS3Location(textS3Location.let(TextS3LocationProperty.Companion::unwrap))
      }

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02427a56088d9207e758c07379af97595ff46441a363782bde2a8f9c67a84ce4")
      override fun textS3Location(textS3Location: TextS3LocationProperty.Builder.() -> Unit): Unit =
          textS3Location(TextS3LocationProperty(textS3Location))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-text)
       */
      override fun text(): String? = unwrap(this).getText()

      /**
       * The Amazon S3 location of the prompt text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-texts3location)
       */
      override fun textS3Location(): Any? = unwrap(this).getTextS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TextPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
    }
  }

  /**
   * The Amazon S3 location of the prompt text.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TextS3LocationProperty textS3LocationProperty = TextS3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html)
   */
  public interface TextS3LocationProperty {
    /**
     * The Amazon S3 bucket containing the prompt text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-bucket)
     */
    public fun bucket(): String

    /**
     * The object key for the Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-key)
     */
    public fun key(): String

    /**
     * The version of the Amazon S3 location to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [TextS3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket containing the prompt text. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The object key for the Amazon S3 location. 
       */
      public fun key(key: String)

      /**
       * @param version The version of the Amazon S3 location to use.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket containing the prompt text. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The object key for the Amazon S3 location. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The version of the Amazon S3 location to use.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty,
    ) : CdkObject(cdkObject),
        TextS3LocationProperty {
      /**
       * The Amazon S3 bucket containing the prompt text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The object key for the Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The version of the Amazon S3 location to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextS3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty):
          TextS3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? TextS3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextS3LocationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty
    }
  }
}
