@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
 * Creates an Amazon Q in Connect AI Agent.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIAgent cfnAIAgent = CfnAIAgent.Builder.create(this, "MyCfnAIAgent")
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
public open class CfnAIAgent(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIAgentProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIAgent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIAgentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIAgentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIAgentProps(props)
  )

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(): String = unwrap(this).getAssistantId()

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AI agent.
   */
  public open fun attrAiAgentArn(): String = unwrap(this).getAttrAiAgentArn()

  /**
   * The identifier of the AI Agent.
   */
  public open fun attrAiAgentId(): String = unwrap(this).getAttrAiAgentId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Q in Connect assistant.
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Configuration for the AI Agent.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Configuration for the AI Agent.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration for the AI Agent.
   */
  public open fun configuration(`value`: AIAgentConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(AIAgentConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration for the AI Agent.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7df1f93d0b11e7c33e468198b6ac8eca90bd90ff0ad8230221496600e206ff7c")
  public open fun configuration(`value`: AIAgentConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(AIAgentConfigurationProperty(`value`))

  /**
   * The description of the AI Agent.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the AI Agent.
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
   * The name of the AI Agent.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the AI Agent.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The type of the AI Agent.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the AI Agent.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIAgent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    public fun configuration(configuration: AIAgentConfigurationProperty)

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceca9c7f61da03880c005325badf639817031109cd11d3b73821cca76ac8142a")
    public fun configuration(configuration: AIAgentConfigurationProperty.Builder.() -> Unit)

    /**
     * The description of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-description)
     * @param description The description of the AI Agent. 
     */
    public fun description(description: String)

    /**
     * The name of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-name)
     * @param name The name of the AI Agent. 
     */
    public fun name(name: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The type of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-type)
     * @param type The type of the AI Agent. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIAgent.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIAgent.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    override fun configuration(configuration: AIAgentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(AIAgentConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration for the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-configuration)
     * @param configuration Configuration for the AI Agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceca9c7f61da03880c005325badf639817031109cd11d3b73821cca76ac8142a")
    override fun configuration(configuration: AIAgentConfigurationProperty.Builder.() -> Unit): Unit
        = configuration(AIAgentConfigurationProperty(configuration))

    /**
     * The description of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-description)
     * @param description The description of the AI Agent. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-name)
     * @param name The name of the AI Agent. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The type of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagent.html#cfn-wisdom-aiagent-type)
     * @param type The type of the AI Agent. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgent = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIAgent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIAgent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIAgent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent): CfnAIAgent =
        CfnAIAgent(cdkObject)

    internal fun unwrap(wrapped: CfnAIAgent): software.amazon.awscdk.services.wisdom.CfnAIAgent =
        wrapped.cdkObject as software.amazon.awscdk.services.wisdom.CfnAIAgent
  }

  /**
   * A typed union that specifies the configuration based on the type of AI Agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIAgentConfigurationProperty aIAgentConfigurationProperty =
   * AIAgentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html)
   */
  public interface AIAgentConfigurationProperty {
    /**
     * The configuration for AI Agents of type `ANSWER_RECOMMENDATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-answerrecommendationaiagentconfiguration)
     */
    public fun answerRecommendationAiAgentConfiguration(): Any? =
        unwrap(this).getAnswerRecommendationAiAgentConfiguration()

    /**
     * The configuration for AI Agents of type `MANUAL_SEARCH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-manualsearchaiagentconfiguration)
     */
    public fun manualSearchAiAgentConfiguration(): Any? =
        unwrap(this).getManualSearchAiAgentConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-selfserviceaiagentconfiguration)
     */
    public fun selfServiceAiAgentConfiguration(): Any? =
        unwrap(this).getSelfServiceAiAgentConfiguration()

    /**
     * A builder for [AIAgentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      public
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: IResolvable)

      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      public
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: AnswerRecommendationAIAgentConfigurationProperty)

      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88d1c3187c3fbbe5798d4d816f91ea31a45443326c6835262199b07fefa93e8e")
      public
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: AnswerRecommendationAIAgentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      public fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: IResolvable)

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      public
          fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: ManualSearchAIAgentConfigurationProperty)

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05885dd505623ad947211755886a7c60adb70ccbf4a567db039c98a8822db5d5")
      public
          fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: ManualSearchAIAgentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      public fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: IResolvable)

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      public
          fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: SelfServiceAIAgentConfigurationProperty)

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53e3f7349d77370af8845da1a36cb3f059dcf98cd2b3dd3b2e8373621ac908a9")
      public
          fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: SelfServiceAIAgentConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty.builder()

      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      override
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: IResolvable) {
        cdkBuilder.answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      override
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: AnswerRecommendationAIAgentConfigurationProperty) {
        cdkBuilder.answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration.let(AnswerRecommendationAIAgentConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param answerRecommendationAiAgentConfiguration The configuration for AI Agents of type
       * `ANSWER_RECOMMENDATION` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88d1c3187c3fbbe5798d4d816f91ea31a45443326c6835262199b07fefa93e8e")
      override
          fun answerRecommendationAiAgentConfiguration(answerRecommendationAiAgentConfiguration: AnswerRecommendationAIAgentConfigurationProperty.Builder.() -> Unit):
          Unit =
          answerRecommendationAiAgentConfiguration(AnswerRecommendationAIAgentConfigurationProperty(answerRecommendationAiAgentConfiguration))

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      override fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: IResolvable) {
        cdkBuilder.manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      override
          fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: ManualSearchAIAgentConfigurationProperty) {
        cdkBuilder.manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration.let(ManualSearchAIAgentConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param manualSearchAiAgentConfiguration The configuration for AI Agents of type
       * `MANUAL_SEARCH` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05885dd505623ad947211755886a7c60adb70ccbf4a567db039c98a8822db5d5")
      override
          fun manualSearchAiAgentConfiguration(manualSearchAiAgentConfiguration: ManualSearchAIAgentConfigurationProperty.Builder.() -> Unit):
          Unit =
          manualSearchAiAgentConfiguration(ManualSearchAIAgentConfigurationProperty(manualSearchAiAgentConfiguration))

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      override fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: IResolvable) {
        cdkBuilder.selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      override
          fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: SelfServiceAIAgentConfigurationProperty) {
        cdkBuilder.selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration.let(SelfServiceAIAgentConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param selfServiceAiAgentConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53e3f7349d77370af8845da1a36cb3f059dcf98cd2b3dd3b2e8373621ac908a9")
      override
          fun selfServiceAiAgentConfiguration(selfServiceAiAgentConfiguration: SelfServiceAIAgentConfigurationProperty.Builder.() -> Unit):
          Unit =
          selfServiceAiAgentConfiguration(SelfServiceAIAgentConfigurationProperty(selfServiceAiAgentConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty,
    ) : CdkObject(cdkObject),
        AIAgentConfigurationProperty {
      /**
       * The configuration for AI Agents of type `ANSWER_RECOMMENDATION` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-answerrecommendationaiagentconfiguration)
       */
      override fun answerRecommendationAiAgentConfiguration(): Any? =
          unwrap(this).getAnswerRecommendationAiAgentConfiguration()

      /**
       * The configuration for AI Agents of type `MANUAL_SEARCH` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-manualsearchaiagentconfiguration)
       */
      override fun manualSearchAiAgentConfiguration(): Any? =
          unwrap(this).getManualSearchAiAgentConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-aiagentconfiguration.html#cfn-wisdom-aiagent-aiagentconfiguration-selfserviceaiagentconfiguration)
       */
      override fun selfServiceAiAgentConfiguration(): Any? =
          unwrap(this).getSelfServiceAiAgentConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AIAgentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty):
          AIAgentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIAgentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIAgentConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AIAgentConfigurationProperty
    }
  }

  /**
   * The configuration for AI Agents of type `ANSWER_RECOMMENDATION` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AnswerRecommendationAIAgentConfigurationProperty
   * answerRecommendationAIAgentConfigurationProperty =
   * AnswerRecommendationAIAgentConfigurationProperty.builder()
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
   * .queryReformulationAiPromptId("queryReformulationAiPromptId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html)
   */
  public interface AnswerRecommendationAIAgentConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-answergenerationaiguardrailid)
     */
    public fun answerGenerationAiGuardrailId(): String? =
        unwrap(this).getAnswerGenerationAiGuardrailId()

    /**
     * The AI Prompt identifier for the Answer Generation prompt used by the `ANSWER_RECOMMENDATION`
     * AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-answergenerationaipromptid)
     */
    public fun answerGenerationAiPromptId(): String? = unwrap(this).getAnswerGenerationAiPromptId()

    /**
     * The association configurations for overriding behavior on this AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-associationconfigurations)
     */
    public fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()

    /**
     * The AI Prompt identifier for the Intent Labeling prompt used by the `ANSWER_RECOMMENDATION`
     * AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-intentlabelinggenerationaipromptid)
     */
    public fun intentLabelingGenerationAiPromptId(): String? =
        unwrap(this).getIntentLabelingGenerationAiPromptId()

    /**
     * The AI Prompt identifier for the Query Reformulation prompt used by the
     * `ANSWER_RECOMMENDATION` AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-queryreformulationaipromptid)
     */
    public fun queryReformulationAiPromptId(): String? =
        unwrap(this).getQueryReformulationAiPromptId()

    /**
     * A builder for [AnswerRecommendationAIAgentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param answerGenerationAiGuardrailId the value to be set.
       */
      public fun answerGenerationAiGuardrailId(answerGenerationAiGuardrailId: String)

      /**
       * @param answerGenerationAiPromptId The AI Prompt identifier for the Answer Generation prompt
       * used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      public fun answerGenerationAiPromptId(answerGenerationAiPromptId: String)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(associationConfigurations: IResolvable)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(associationConfigurations: List<Any>)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(vararg associationConfigurations: Any)

      /**
       * @param intentLabelingGenerationAiPromptId The AI Prompt identifier for the Intent Labeling
       * prompt used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      public fun intentLabelingGenerationAiPromptId(intentLabelingGenerationAiPromptId: String)

      /**
       * @param queryReformulationAiPromptId The AI Prompt identifier for the Query Reformulation
       * prompt used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      public fun queryReformulationAiPromptId(queryReformulationAiPromptId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty.builder()

      /**
       * @param answerGenerationAiGuardrailId the value to be set.
       */
      override fun answerGenerationAiGuardrailId(answerGenerationAiGuardrailId: String) {
        cdkBuilder.answerGenerationAiGuardrailId(answerGenerationAiGuardrailId)
      }

      /**
       * @param answerGenerationAiPromptId The AI Prompt identifier for the Answer Generation prompt
       * used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      override fun answerGenerationAiPromptId(answerGenerationAiPromptId: String) {
        cdkBuilder.answerGenerationAiPromptId(answerGenerationAiPromptId)
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(associationConfigurations: IResolvable) {
        cdkBuilder.associationConfigurations(associationConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(associationConfigurations: List<Any>) {
        cdkBuilder.associationConfigurations(associationConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(vararg associationConfigurations: Any): Unit =
          associationConfigurations(associationConfigurations.toList())

      /**
       * @param intentLabelingGenerationAiPromptId The AI Prompt identifier for the Intent Labeling
       * prompt used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      override fun intentLabelingGenerationAiPromptId(intentLabelingGenerationAiPromptId: String) {
        cdkBuilder.intentLabelingGenerationAiPromptId(intentLabelingGenerationAiPromptId)
      }

      /**
       * @param queryReformulationAiPromptId The AI Prompt identifier for the Query Reformulation
       * prompt used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      override fun queryReformulationAiPromptId(queryReformulationAiPromptId: String) {
        cdkBuilder.queryReformulationAiPromptId(queryReformulationAiPromptId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty,
    ) : CdkObject(cdkObject),
        AnswerRecommendationAIAgentConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-answergenerationaiguardrailid)
       */
      override fun answerGenerationAiGuardrailId(): String? =
          unwrap(this).getAnswerGenerationAiGuardrailId()

      /**
       * The AI Prompt identifier for the Answer Generation prompt used by the
       * `ANSWER_RECOMMENDATION` AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-answergenerationaipromptid)
       */
      override fun answerGenerationAiPromptId(): String? =
          unwrap(this).getAnswerGenerationAiPromptId()

      /**
       * The association configurations for overriding behavior on this AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-associationconfigurations)
       */
      override fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()

      /**
       * The AI Prompt identifier for the Intent Labeling prompt used by the `ANSWER_RECOMMENDATION`
       * AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-intentlabelinggenerationaipromptid)
       */
      override fun intentLabelingGenerationAiPromptId(): String? =
          unwrap(this).getIntentLabelingGenerationAiPromptId()

      /**
       * The AI Prompt identifier for the Query Reformulation prompt used by the
       * `ANSWER_RECOMMENDATION` AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-answerrecommendationaiagentconfiguration.html#cfn-wisdom-aiagent-answerrecommendationaiagentconfiguration-queryreformulationaipromptid)
       */
      override fun queryReformulationAiPromptId(): String? =
          unwrap(this).getQueryReformulationAiPromptId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnswerRecommendationAIAgentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty):
          AnswerRecommendationAIAgentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnswerRecommendationAIAgentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnswerRecommendationAIAgentConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AnswerRecommendationAIAgentConfigurationProperty
    }
  }

  /**
   * A typed union of the data of the configuration for an Amazon Q in Connect Assistant
   * Association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AssociationConfigurationDataProperty associationConfigurationDataProperty =
   * AssociationConfigurationDataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfigurationdata.html)
   */
  public interface AssociationConfigurationDataProperty {
    /**
     * The data of the configuration for a `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant
     * Association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfigurationdata.html#cfn-wisdom-aiagent-associationconfigurationdata-knowledgebaseassociationconfigurationdata)
     */
    public fun knowledgeBaseAssociationConfigurationData(): Any

    /**
     * A builder for [AssociationConfigurationDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      public
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: IResolvable)

      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      public
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: KnowledgeBaseAssociationConfigurationDataProperty)

      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e4765834942a4a59a774c2f5ef028aa66c42e955258c19db21d9e5ceb9aa4f3")
      public
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: KnowledgeBaseAssociationConfigurationDataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty.builder()

      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      override
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: IResolvable) {
        cdkBuilder.knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      override
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: KnowledgeBaseAssociationConfigurationDataProperty) {
        cdkBuilder.knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData.let(KnowledgeBaseAssociationConfigurationDataProperty.Companion::unwrap))
      }

      /**
       * @param knowledgeBaseAssociationConfigurationData The data of the configuration for a
       * `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant Association. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e4765834942a4a59a774c2f5ef028aa66c42e955258c19db21d9e5ceb9aa4f3")
      override
          fun knowledgeBaseAssociationConfigurationData(knowledgeBaseAssociationConfigurationData: KnowledgeBaseAssociationConfigurationDataProperty.Builder.() -> Unit):
          Unit =
          knowledgeBaseAssociationConfigurationData(KnowledgeBaseAssociationConfigurationDataProperty(knowledgeBaseAssociationConfigurationData))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty,
    ) : CdkObject(cdkObject),
        AssociationConfigurationDataProperty {
      /**
       * The data of the configuration for a `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant
       * Association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfigurationdata.html#cfn-wisdom-aiagent-associationconfigurationdata-knowledgebaseassociationconfigurationdata)
       */
      override fun knowledgeBaseAssociationConfigurationData(): Any =
          unwrap(this).getKnowledgeBaseAssociationConfigurationData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AssociationConfigurationDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty):
          AssociationConfigurationDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssociationConfigurationDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationConfigurationDataProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationDataProperty
    }
  }

  /**
   * The configuration for an Amazon Q in Connect Assistant Association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AssociationConfigurationProperty associationConfigurationProperty =
   * AssociationConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html)
   */
  public interface AssociationConfigurationProperty {
    /**
     * A typed union of the data of the configuration for an Amazon Q in Connect Assistant
     * Association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationconfigurationdata)
     */
    public fun associationConfigurationData(): Any? = unwrap(this).getAssociationConfigurationData()

    /**
     * The identifier of the association for this Association Configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationid)
     */
    public fun associationId(): String? = unwrap(this).getAssociationId()

    /**
     * The type of the association for this Association Configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationtype)
     */
    public fun associationType(): String? = unwrap(this).getAssociationType()

    /**
     * A builder for [AssociationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      public fun associationConfigurationData(associationConfigurationData: IResolvable)

      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      public
          fun associationConfigurationData(associationConfigurationData: AssociationConfigurationDataProperty)

      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bc4ab1281b9e31fb7c5dd1ddc3cd21b1fc3094ac574daab3818b71c24b4a95a")
      public
          fun associationConfigurationData(associationConfigurationData: AssociationConfigurationDataProperty.Builder.() -> Unit)

      /**
       * @param associationId The identifier of the association for this Association Configuration.
       */
      public fun associationId(associationId: String)

      /**
       * @param associationType The type of the association for this Association Configuration.
       */
      public fun associationType(associationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty.builder()

      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      override fun associationConfigurationData(associationConfigurationData: IResolvable) {
        cdkBuilder.associationConfigurationData(associationConfigurationData.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      override
          fun associationConfigurationData(associationConfigurationData: AssociationConfigurationDataProperty) {
        cdkBuilder.associationConfigurationData(associationConfigurationData.let(AssociationConfigurationDataProperty.Companion::unwrap))
      }

      /**
       * @param associationConfigurationData A typed union of the data of the configuration for an
       * Amazon Q in Connect Assistant Association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bc4ab1281b9e31fb7c5dd1ddc3cd21b1fc3094ac574daab3818b71c24b4a95a")
      override
          fun associationConfigurationData(associationConfigurationData: AssociationConfigurationDataProperty.Builder.() -> Unit):
          Unit =
          associationConfigurationData(AssociationConfigurationDataProperty(associationConfigurationData))

      /**
       * @param associationId The identifier of the association for this Association Configuration.
       */
      override fun associationId(associationId: String) {
        cdkBuilder.associationId(associationId)
      }

      /**
       * @param associationType The type of the association for this Association Configuration.
       */
      override fun associationType(associationType: String) {
        cdkBuilder.associationType(associationType)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty,
    ) : CdkObject(cdkObject),
        AssociationConfigurationProperty {
      /**
       * A typed union of the data of the configuration for an Amazon Q in Connect Assistant
       * Association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationconfigurationdata)
       */
      override fun associationConfigurationData(): Any? =
          unwrap(this).getAssociationConfigurationData()

      /**
       * The identifier of the association for this Association Configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationid)
       */
      override fun associationId(): String? = unwrap(this).getAssociationId()

      /**
       * The type of the association for this Association Configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-associationconfiguration.html#cfn-wisdom-aiagent-associationconfiguration-associationtype)
       */
      override fun associationType(): String? = unwrap(this).getAssociationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty):
          AssociationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssociationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.AssociationConfigurationProperty
    }
  }

  /**
   * The data of the configuration for a `KNOWLEDGE_BASE` type Amazon Q in Connect Assistant
   * Association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * KnowledgeBaseAssociationConfigurationDataProperty
   * knowledgeBaseAssociationConfigurationDataProperty =
   * KnowledgeBaseAssociationConfigurationDataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html)
   */
  public interface KnowledgeBaseAssociationConfigurationDataProperty {
    /**
     * An object that can be used to specify Tag conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-contenttagfilter)
     */
    public fun contentTagFilter(): Any? = unwrap(this).getContentTagFilter()

    /**
     * The maximum number of results to return per page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-maxresults)
     */
    public fun maxResults(): Number? = unwrap(this).getMaxResults()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-overrideknowledgebasesearchtype)
     */
    public fun overrideKnowledgeBaseSearchType(): String? =
        unwrap(this).getOverrideKnowledgeBaseSearchType()

    /**
     * A builder for [KnowledgeBaseAssociationConfigurationDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      public fun contentTagFilter(contentTagFilter: IResolvable)

      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      public fun contentTagFilter(contentTagFilter: TagFilterProperty)

      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("718f75a2e5b1d824ced06f1f4e1ca6ff1632eb8c00c85c84a49a8ca2a727b9f3")
      public fun contentTagFilter(contentTagFilter: TagFilterProperty.Builder.() -> Unit)

      /**
       * @param maxResults The maximum number of results to return per page.
       */
      public fun maxResults(maxResults: Number)

      /**
       * @param overrideKnowledgeBaseSearchType the value to be set.
       */
      public fun overrideKnowledgeBaseSearchType(overrideKnowledgeBaseSearchType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty.builder()

      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      override fun contentTagFilter(contentTagFilter: IResolvable) {
        cdkBuilder.contentTagFilter(contentTagFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      override fun contentTagFilter(contentTagFilter: TagFilterProperty) {
        cdkBuilder.contentTagFilter(contentTagFilter.let(TagFilterProperty.Companion::unwrap))
      }

      /**
       * @param contentTagFilter An object that can be used to specify Tag conditions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("718f75a2e5b1d824ced06f1f4e1ca6ff1632eb8c00c85c84a49a8ca2a727b9f3")
      override fun contentTagFilter(contentTagFilter: TagFilterProperty.Builder.() -> Unit): Unit =
          contentTagFilter(TagFilterProperty(contentTagFilter))

      /**
       * @param maxResults The maximum number of results to return per page.
       */
      override fun maxResults(maxResults: Number) {
        cdkBuilder.maxResults(maxResults)
      }

      /**
       * @param overrideKnowledgeBaseSearchType the value to be set.
       */
      override fun overrideKnowledgeBaseSearchType(overrideKnowledgeBaseSearchType: String) {
        cdkBuilder.overrideKnowledgeBaseSearchType(overrideKnowledgeBaseSearchType)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBaseAssociationConfigurationDataProperty {
      /**
       * An object that can be used to specify Tag conditions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-contenttagfilter)
       */
      override fun contentTagFilter(): Any? = unwrap(this).getContentTagFilter()

      /**
       * The maximum number of results to return per page.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-maxresults)
       */
      override fun maxResults(): Number? = unwrap(this).getMaxResults()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-knowledgebaseassociationconfigurationdata.html#cfn-wisdom-aiagent-knowledgebaseassociationconfigurationdata-overrideknowledgebasesearchtype)
       */
      override fun overrideKnowledgeBaseSearchType(): String? =
          unwrap(this).getOverrideKnowledgeBaseSearchType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBaseAssociationConfigurationDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty):
          KnowledgeBaseAssociationConfigurationDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBaseAssociationConfigurationDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBaseAssociationConfigurationDataProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.KnowledgeBaseAssociationConfigurationDataProperty
    }
  }

  /**
   * The configuration for AI Agents of type `MANUAL_SEARCH` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ManualSearchAIAgentConfigurationProperty manualSearchAIAgentConfigurationProperty =
   * ManualSearchAIAgentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html)
   */
  public interface ManualSearchAIAgentConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-answergenerationaiguardrailid)
     */
    public fun answerGenerationAiGuardrailId(): String? =
        unwrap(this).getAnswerGenerationAiGuardrailId()

    /**
     * The AI Prompt identifier for the Answer Generation prompt used by the `ANSWER_RECOMMENDATION`
     * AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-answergenerationaipromptid)
     */
    public fun answerGenerationAiPromptId(): String? = unwrap(this).getAnswerGenerationAiPromptId()

    /**
     * The association configurations for overriding behavior on this AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-associationconfigurations)
     */
    public fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()

    /**
     * A builder for [ManualSearchAIAgentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param answerGenerationAiGuardrailId the value to be set.
       */
      public fun answerGenerationAiGuardrailId(answerGenerationAiGuardrailId: String)

      /**
       * @param answerGenerationAiPromptId The AI Prompt identifier for the Answer Generation prompt
       * used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      public fun answerGenerationAiPromptId(answerGenerationAiPromptId: String)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(associationConfigurations: IResolvable)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(associationConfigurations: List<Any>)

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      public fun associationConfigurations(vararg associationConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty.builder()

      /**
       * @param answerGenerationAiGuardrailId the value to be set.
       */
      override fun answerGenerationAiGuardrailId(answerGenerationAiGuardrailId: String) {
        cdkBuilder.answerGenerationAiGuardrailId(answerGenerationAiGuardrailId)
      }

      /**
       * @param answerGenerationAiPromptId The AI Prompt identifier for the Answer Generation prompt
       * used by the `ANSWER_RECOMMENDATION` AI Agent.
       */
      override fun answerGenerationAiPromptId(answerGenerationAiPromptId: String) {
        cdkBuilder.answerGenerationAiPromptId(answerGenerationAiPromptId)
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(associationConfigurations: IResolvable) {
        cdkBuilder.associationConfigurations(associationConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(associationConfigurations: List<Any>) {
        cdkBuilder.associationConfigurations(associationConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param associationConfigurations The association configurations for overriding behavior on
       * this AI Agent.
       */
      override fun associationConfigurations(vararg associationConfigurations: Any): Unit =
          associationConfigurations(associationConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty,
    ) : CdkObject(cdkObject),
        ManualSearchAIAgentConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-answergenerationaiguardrailid)
       */
      override fun answerGenerationAiGuardrailId(): String? =
          unwrap(this).getAnswerGenerationAiGuardrailId()

      /**
       * The AI Prompt identifier for the Answer Generation prompt used by the
       * `ANSWER_RECOMMENDATION` AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-answergenerationaipromptid)
       */
      override fun answerGenerationAiPromptId(): String? =
          unwrap(this).getAnswerGenerationAiPromptId()

      /**
       * The association configurations for overriding behavior on this AI Agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-manualsearchaiagentconfiguration.html#cfn-wisdom-aiagent-manualsearchaiagentconfiguration-associationconfigurations)
       */
      override fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManualSearchAIAgentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty):
          ManualSearchAIAgentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManualSearchAIAgentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManualSearchAIAgentConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.ManualSearchAIAgentConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * OrConditionProperty orConditionProperty = OrConditionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-orcondition.html)
   */
  public interface OrConditionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-orcondition.html#cfn-wisdom-aiagent-orcondition-andconditions)
     */
    public fun andConditions(): Any? = unwrap(this).getAndConditions()

    /**
     * A leaf node condition which can be used to specify a tag condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-orcondition.html#cfn-wisdom-aiagent-orcondition-tagcondition)
     */
    public fun tagCondition(): Any? = unwrap(this).getTagCondition()

    /**
     * A builder for [OrConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andConditions the value to be set.
       */
      public fun andConditions(andConditions: IResolvable)

      /**
       * @param andConditions the value to be set.
       */
      public fun andConditions(andConditions: List<Any>)

      /**
       * @param andConditions the value to be set.
       */
      public fun andConditions(vararg andConditions: Any)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      public fun tagCondition(tagCondition: IResolvable)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      public fun tagCondition(tagCondition: TagConditionProperty)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cabde1a8eee948ac60c08844a77bba16656ba5003e1439c8634dc66116276790")
      public fun tagCondition(tagCondition: TagConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty.builder()

      /**
       * @param andConditions the value to be set.
       */
      override fun andConditions(andConditions: IResolvable) {
        cdkBuilder.andConditions(andConditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param andConditions the value to be set.
       */
      override fun andConditions(andConditions: List<Any>) {
        cdkBuilder.andConditions(andConditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param andConditions the value to be set.
       */
      override fun andConditions(vararg andConditions: Any): Unit =
          andConditions(andConditions.toList())

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      override fun tagCondition(tagCondition: IResolvable) {
        cdkBuilder.tagCondition(tagCondition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      override fun tagCondition(tagCondition: TagConditionProperty) {
        cdkBuilder.tagCondition(tagCondition.let(TagConditionProperty.Companion::unwrap))
      }

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cabde1a8eee948ac60c08844a77bba16656ba5003e1439c8634dc66116276790")
      override fun tagCondition(tagCondition: TagConditionProperty.Builder.() -> Unit): Unit =
          tagCondition(TagConditionProperty(tagCondition))

      public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty,
    ) : CdkObject(cdkObject),
        OrConditionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-orcondition.html#cfn-wisdom-aiagent-orcondition-andconditions)
       */
      override fun andConditions(): Any? = unwrap(this).getAndConditions()

      /**
       * A leaf node condition which can be used to specify a tag condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-orcondition.html#cfn-wisdom-aiagent-orcondition-tagcondition)
       */
      override fun tagCondition(): Any? = unwrap(this).getTagCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty):
          OrConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? OrConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrConditionProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.OrConditionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SelfServiceAIAgentConfigurationProperty selfServiceAIAgentConfigurationProperty =
   * SelfServiceAIAgentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html)
   */
  public interface SelfServiceAIAgentConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-associationconfigurations)
     */
    public fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfserviceaiguardrailid)
     */
    public fun selfServiceAiGuardrailId(): String? = unwrap(this).getSelfServiceAiGuardrailId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfserviceanswergenerationaipromptid)
     */
    public fun selfServiceAnswerGenerationAiPromptId(): String? =
        unwrap(this).getSelfServiceAnswerGenerationAiPromptId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfservicepreprocessingaipromptid)
     */
    public fun selfServicePreProcessingAiPromptId(): String? =
        unwrap(this).getSelfServicePreProcessingAiPromptId()

    /**
     * A builder for [SelfServiceAIAgentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associationConfigurations the value to be set.
       */
      public fun associationConfigurations(associationConfigurations: IResolvable)

      /**
       * @param associationConfigurations the value to be set.
       */
      public fun associationConfigurations(associationConfigurations: List<Any>)

      /**
       * @param associationConfigurations the value to be set.
       */
      public fun associationConfigurations(vararg associationConfigurations: Any)

      /**
       * @param selfServiceAiGuardrailId the value to be set.
       */
      public fun selfServiceAiGuardrailId(selfServiceAiGuardrailId: String)

      /**
       * @param selfServiceAnswerGenerationAiPromptId the value to be set.
       */
      public
          fun selfServiceAnswerGenerationAiPromptId(selfServiceAnswerGenerationAiPromptId: String)

      /**
       * @param selfServicePreProcessingAiPromptId the value to be set.
       */
      public fun selfServicePreProcessingAiPromptId(selfServicePreProcessingAiPromptId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty.builder()

      /**
       * @param associationConfigurations the value to be set.
       */
      override fun associationConfigurations(associationConfigurations: IResolvable) {
        cdkBuilder.associationConfigurations(associationConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param associationConfigurations the value to be set.
       */
      override fun associationConfigurations(associationConfigurations: List<Any>) {
        cdkBuilder.associationConfigurations(associationConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param associationConfigurations the value to be set.
       */
      override fun associationConfigurations(vararg associationConfigurations: Any): Unit =
          associationConfigurations(associationConfigurations.toList())

      /**
       * @param selfServiceAiGuardrailId the value to be set.
       */
      override fun selfServiceAiGuardrailId(selfServiceAiGuardrailId: String) {
        cdkBuilder.selfServiceAiGuardrailId(selfServiceAiGuardrailId)
      }

      /**
       * @param selfServiceAnswerGenerationAiPromptId the value to be set.
       */
      override
          fun selfServiceAnswerGenerationAiPromptId(selfServiceAnswerGenerationAiPromptId: String) {
        cdkBuilder.selfServiceAnswerGenerationAiPromptId(selfServiceAnswerGenerationAiPromptId)
      }

      /**
       * @param selfServicePreProcessingAiPromptId the value to be set.
       */
      override fun selfServicePreProcessingAiPromptId(selfServicePreProcessingAiPromptId: String) {
        cdkBuilder.selfServicePreProcessingAiPromptId(selfServicePreProcessingAiPromptId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty,
    ) : CdkObject(cdkObject),
        SelfServiceAIAgentConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-associationconfigurations)
       */
      override fun associationConfigurations(): Any? = unwrap(this).getAssociationConfigurations()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfserviceaiguardrailid)
       */
      override fun selfServiceAiGuardrailId(): String? = unwrap(this).getSelfServiceAiGuardrailId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfserviceanswergenerationaipromptid)
       */
      override fun selfServiceAnswerGenerationAiPromptId(): String? =
          unwrap(this).getSelfServiceAnswerGenerationAiPromptId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-selfserviceaiagentconfiguration.html#cfn-wisdom-aiagent-selfserviceaiagentconfiguration-selfservicepreprocessingaipromptid)
       */
      override fun selfServicePreProcessingAiPromptId(): String? =
          unwrap(this).getSelfServicePreProcessingAiPromptId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfServiceAIAgentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty):
          SelfServiceAIAgentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SelfServiceAIAgentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfServiceAIAgentConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.SelfServiceAIAgentConfigurationProperty
    }
  }

  /**
   * An object that can be used to specify tag conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * TagConditionProperty tagConditionProperty = TagConditionProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagcondition.html)
   */
  public interface TagConditionProperty {
    /**
     * The tag key in the tag condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagcondition.html#cfn-wisdom-aiagent-tagcondition-key)
     */
    public fun key(): String

    /**
     * The tag value in the tag condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagcondition.html#cfn-wisdom-aiagent-tagcondition-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TagConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key in the tag condition. 
       */
      public fun key(key: String)

      /**
       * @param value The tag value in the tag condition.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty.builder()

      /**
       * @param key The tag key in the tag condition. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag value in the tag condition.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty,
    ) : CdkObject(cdkObject),
        TagConditionProperty {
      /**
       * The tag key in the tag condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagcondition.html#cfn-wisdom-aiagent-tagcondition-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The tag value in the tag condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagcondition.html#cfn-wisdom-aiagent-tagcondition-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty):
          TagConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? TagConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagConditionProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagConditionProperty
    }
  }

  /**
   * An object that can be used to specify tag conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html)
   */
  public interface TagFilterProperty {
    /**
     * A list of conditions which would be applied together with an `AND` condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-andconditions)
     */
    public fun andConditions(): Any? = unwrap(this).getAndConditions()

    /**
     * A list of conditions which would be applied together with an `OR` condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-orconditions)
     */
    public fun orConditions(): Any? = unwrap(this).getOrConditions()

    /**
     * A leaf node condition which can be used to specify a tag condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-tagcondition)
     */
    public fun tagCondition(): Any? = unwrap(this).getTagCondition()

    /**
     * A builder for [TagFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      public fun andConditions(andConditions: IResolvable)

      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      public fun andConditions(andConditions: List<Any>)

      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      public fun andConditions(vararg andConditions: Any)

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      public fun orConditions(orConditions: IResolvable)

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      public fun orConditions(orConditions: List<Any>)

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      public fun orConditions(vararg orConditions: Any)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      public fun tagCondition(tagCondition: IResolvable)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      public fun tagCondition(tagCondition: TagConditionProperty)

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("513d905331a83d4791e67ecf5f1b8b8b49f2888671be41d51967ca11e67ee56f")
      public fun tagCondition(tagCondition: TagConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty.builder()

      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      override fun andConditions(andConditions: IResolvable) {
        cdkBuilder.andConditions(andConditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      override fun andConditions(andConditions: List<Any>) {
        cdkBuilder.andConditions(andConditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param andConditions A list of conditions which would be applied together with an `AND`
       * condition.
       */
      override fun andConditions(vararg andConditions: Any): Unit =
          andConditions(andConditions.toList())

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      override fun orConditions(orConditions: IResolvable) {
        cdkBuilder.orConditions(orConditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      override fun orConditions(orConditions: List<Any>) {
        cdkBuilder.orConditions(orConditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param orConditions A list of conditions which would be applied together with an `OR`
       * condition.
       */
      override fun orConditions(vararg orConditions: Any): Unit =
          orConditions(orConditions.toList())

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      override fun tagCondition(tagCondition: IResolvable) {
        cdkBuilder.tagCondition(tagCondition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      override fun tagCondition(tagCondition: TagConditionProperty) {
        cdkBuilder.tagCondition(tagCondition.let(TagConditionProperty.Companion::unwrap))
      }

      /**
       * @param tagCondition A leaf node condition which can be used to specify a tag condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("513d905331a83d4791e67ecf5f1b8b8b49f2888671be41d51967ca11e67ee56f")
      override fun tagCondition(tagCondition: TagConditionProperty.Builder.() -> Unit): Unit =
          tagCondition(TagConditionProperty(tagCondition))

      public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty,
    ) : CdkObject(cdkObject),
        TagFilterProperty {
      /**
       * A list of conditions which would be applied together with an `AND` condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-andconditions)
       */
      override fun andConditions(): Any? = unwrap(this).getAndConditions()

      /**
       * A list of conditions which would be applied together with an `OR` condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-orconditions)
       */
      override fun orConditions(): Any? = unwrap(this).getOrConditions()

      /**
       * A leaf node condition which can be used to specify a tag condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiagent-tagfilter.html#cfn-wisdom-aiagent-tagfilter-tagcondition)
       */
      override fun tagCondition(): Any? = unwrap(this).getTagCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty):
          TagFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? TagFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIAgent.TagFilterProperty
    }
  }
}
