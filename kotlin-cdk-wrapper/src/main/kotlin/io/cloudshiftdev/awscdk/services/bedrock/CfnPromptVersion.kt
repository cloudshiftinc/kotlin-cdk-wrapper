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
 * Creates a static snapshot of your prompt that can be deployed to production.
 *
 * For more information, see [Deploy prompts using Prompt management by creating
 * versions](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html) in the
 * Amazon Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnPromptVersion cfnPromptVersion = CfnPromptVersion.Builder.create(this, "MyCfnPromptVersion")
 * .promptArn("promptArn")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html)
 */
public open class CfnPromptVersion(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptVersionProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnPromptVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPromptVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPromptVersionProps(props)
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
   * A KMS key ARN.
   */
  public open fun attrCustomerEncryptionKeyArn(): String =
      unwrap(this).getAttrCustomerEncryptionKeyArn()

  /**
   * The name of the default variant for the prompt.
   *
   * This value must match the `name` field in the relevant
   * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
   * object.
   */
  public open fun attrDefaultVariant(): String = unwrap(this).getAttrDefaultVariant()

  /**
   * The name of the prompt.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The unique identifier of the prompt.
   */
  public open fun attrPromptId(): String = unwrap(this).getAttrPromptId()

  /**
   * The time at which the prompt was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun attrVariants(): IResolvable =
      unwrap(this).getAttrVariants().let(IResolvable::wrap)

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
   * The description of the prompt version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the prompt version.
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
   * The Amazon Resource Name (ARN) of the version of the prompt.
   */
  public open fun promptArn(): String = unwrap(this).getPromptArn()

  /**
   * The Amazon Resource Name (ARN) of the version of the prompt.
   */
  public open fun promptArn(`value`: String) {
    unwrap(this).setPromptArn(`value`)
  }

  /**
   * A map of tag keys and values.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A map of tag keys and values.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnPromptVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the prompt version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
     * @param description The description of the prompt version. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the version of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    public fun promptArn(promptArn: String)

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
     * @param tags A map of tag keys and values. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPromptVersion.Builder =
        software.amazon.awscdk.services.bedrock.CfnPromptVersion.Builder.create(scope, id)

    /**
     * The description of the prompt version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
     * @param description The description of the prompt version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the version of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    override fun promptArn(promptArn: String) {
      cdkBuilder.promptArn(promptArn)
    }

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
     * @param tags A map of tag keys and values. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnPromptVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPromptVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPromptVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion):
        CfnPromptVersion = CfnPromptVersion(cdkObject)

    internal fun unwrap(wrapped: CfnPromptVersion):
        software.amazon.awscdk.services.bedrock.CfnPromptVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnPromptVersion
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html#cfn-bedrock-promptversion-promptinferenceconfiguration-text)
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
      @JvmName("1eb3a70c9d2984900cb6bee00162680f72f000cb6a9d54b041db25acab42fa13")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty.builder()

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
      @JvmName("1eb3a70c9d2984900cb6bee00162680f72f000cb6a9d54b041db25acab42fa13")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html#cfn-bedrock-promptversion-promptinferenceconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html#cfn-bedrock-promptversion-promptinputvariable-name)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html#cfn-bedrock-promptversion-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The number of most-likely candidates that the model considers for the next token during
     * generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topk)
     */
    public fun topK(): Number? = unwrap(this).getTopK()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topp)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty.builder()

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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The number of most-likely candidates that the model considers for the next token during
       * generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topk)
       */
      override fun topK(): Number? = unwrap(this).getTopK()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topp)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
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
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-text)
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
      @JvmName("5372db2b1583522d3cfbd1721ee81551b34949523229af53be68a69b3267d3ae")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty.builder()

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
      @JvmName("5372db2b1583522d3cfbd1721ee81551b34949523229af53be68a69b3267d3ae")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
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
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html)
   */
  public interface PromptVariantProperty {
    /**
     * Contains inference configurations for the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * The unique identifier of the model with which to run inference on the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The name of the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-name)
     */
    public fun name(): String

    /**
     * Contains configurations for the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templateconfiguration)
     */
    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    /**
     * The type of prompt template to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templatetype)
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
      @JvmName("e958ca8723d42817e5bf41dd33f11961f16f53ad6632b4cef4e9561900dc9187")
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
      @JvmName("fd43c246455bc988caccf0f0c2809d2caf1170f715eb08f94e6fea0e78046a9f")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template to use. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty.builder()

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
      @JvmName("e958ca8723d42817e5bf41dd33f11961f16f53ad6632b4cef4e9561900dc9187")
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
      @JvmName("fd43c246455bc988caccf0f0c2809d2caf1170f715eb08f94e6fea0e78046a9f")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template to use. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty,
    ) : CdkObject(cdkObject),
        PromptVariantProperty {
      /**
       * Contains inference configurations for the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * The unique identifier of the model with which to run inference on the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The name of the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Contains configurations for the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templateconfiguration)
       */
      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty):
          PromptVariantProperty = CdkObjectWrappers.wrap(cdkObject) as? PromptVariantProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptVariantProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty
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
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-text)
     */
    public fun text(): String

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TextPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
    }
  }
}
