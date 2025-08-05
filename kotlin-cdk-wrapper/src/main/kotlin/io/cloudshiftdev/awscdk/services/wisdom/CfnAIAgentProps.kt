@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAIAgent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIAgentProps cfnAIAgentProps = CfnAIAgentProps.builder()
 * .assistantId("assistantId")
 * .configuration(AIAgentConfigurationProperty.builder()
 * .answerRecommendationAiAgentConfiguration(AnswerRecommendationAIAgentConfigurationProperty.builder()
 * .answerGenerationAiGuardrailId("answerGenerationAiGuardrailId")
 * .answerGenerationAiPromptId("answerGenerationAiPromptId")
 * .associationConfigurations(List.of(AssociationConfigurationProperty.builder()
 * .associationConfigurationData(AssociationConfigurationDataProperty.builder()
 * .knowledgeBaseAssociationConfigurationData(KnowledgeBaseAssociationConfigurationDataProperty.builder()
 * .contentTagFilter(TagFilterProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .orConditions(List.of(OrConditionProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .maxResults(123)
 * .overrideKnowledgeBaseSearchType("overrideKnowledgeBaseSearchType")
 * .build())
 * .build())
 * .associationId("associationId")
 * .associationType("associationType")
 * .build()))
 * .intentLabelingGenerationAiPromptId("intentLabelingGenerationAiPromptId")
 * .locale("locale")
 * .queryReformulationAiPromptId("queryReformulationAiPromptId")
 * .build())
 * .manualSearchAiAgentConfiguration(ManualSearchAIAgentConfigurationProperty.builder()
 * .answerGenerationAiGuardrailId("answerGenerationAiGuardrailId")
 * .answerGenerationAiPromptId("answerGenerationAiPromptId")
 * .associationConfigurations(List.of(AssociationConfigurationProperty.builder()
 * .associationConfigurationData(AssociationConfigurationDataProperty.builder()
 * .knowledgeBaseAssociationConfigurationData(KnowledgeBaseAssociationConfigurationDataProperty.builder()
 * .contentTagFilter(TagFilterProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .orConditions(List.of(OrConditionProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .maxResults(123)
 * .overrideKnowledgeBaseSearchType("overrideKnowledgeBaseSearchType")
 * .build())
 * .build())
 * .associationId("associationId")
 * .associationType("associationType")
 * .build()))
 * .locale("locale")
 * .build())
 * .selfServiceAiAgentConfiguration(SelfServiceAIAgentConfigurationProperty.builder()
 * .associationConfigurations(List.of(AssociationConfigurationProperty.builder()
 * .associationConfigurationData(AssociationConfigurationDataProperty.builder()
 * .knowledgeBaseAssociationConfigurationData(KnowledgeBaseAssociationConfigurationDataProperty.builder()
 * .contentTagFilter(TagFilterProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .orConditions(List.of(OrConditionProperty.builder()
 * .andConditions(List.of(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build()))
 * .tagCondition(TagConditionProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .maxResults(123)
 * .overrideKnowledgeBaseSearchType("overrideKnowledgeBaseSearchType")
 * .build())
 * .build())
 * .associationId("associationId")
 * .associationType("associationType")
 * .build()))
 * .selfServiceAiGuardrailId("selfServiceAiGuardrailId")
 * .selfServiceAnswerGenerationAiPromptId("selfServiceAnswerGenerationAiPromptId")
 * .selfServicePreProcessingAiPromptId("selfServicePreProcessingAiPromptId")
 * .build())
 * .build())
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html)
 */
public interface CfnAIAgentProps {
  /**
   * The identifier of the Amazon Q in Connect assistant.
   *
   * Can be either the ID or the ARN. URLs cannot contain the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-assistantid)
   */
  public fun assistantId(): String

  /**
   * Configuration for the AI Agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
   */
  public fun configuration(): Any

  /**
   * The description of the AI Agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the AI Agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The type of the AI Agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAIAgentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    public fun assistantId(assistantId: String)

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    public fun configuration(configuration: CfnAIAgent.AIAgentConfigurationProperty)

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69027b8ba7680f312cc4c585aee81c697be9d93340e5d74752aa933fabfa4e80")
    public
        fun configuration(configuration: CfnAIAgent.AIAgentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description The description of the AI Agent.
     */
    public fun description(description: String)

    /**
     * @param name The name of the AI Agent.
     */
    public fun name(name: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param type The type of the AI Agent. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIAgentProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIAgentProps.builder()

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    override fun configuration(configuration: CfnAIAgent.AIAgentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnAIAgent.AIAgentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configuration Configuration for the AI Agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69027b8ba7680f312cc4c585aee81c697be9d93340e5d74752aa933fabfa4e80")
    override
        fun configuration(configuration: CfnAIAgent.AIAgentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnAIAgent.AIAgentConfigurationProperty(configuration))

    /**
     * @param description The description of the AI Agent.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the AI Agent.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type The type of the AI Agent. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgentProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentProps,
  ) : CdkObject(cdkObject),
      CfnAIAgentProps {
    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * The description of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The type of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIAgentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentProps):
        CfnAIAgentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAIAgentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIAgentProps):
        software.amazon.awscdk.services.wisdom.CfnAIAgentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.wisdom.CfnAIAgentProps
  }
}
