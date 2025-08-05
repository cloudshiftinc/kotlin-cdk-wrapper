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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an agent as a resource in a top-level template. Minimally, you must specify the
 * following properties:.
 *
 * * AgentName – Specify a name for the agent.
 * * AgentResourceRoleArn – Specify the Amazon Resource Name (ARN) of the service role with
 * permissions to invoke API operations on the agent. For more information, see [Create a service role
 * for Agents for Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-permissions.html) .
 * * FoundationModel – Specify the model ID of a foundation model to use when invoking the agent.
 * For more information, see [Supported regions and models for Agents for Amazon
 * Bedrock](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-supported.html) .
 *
 * For more information about using agents in Amazon Bedrock , see [Agents for Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/agents.html) .
 *
 * See the *Properties* section below for descriptions of both the required and optional properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * Object additionalModelRequestFields;
 * CfnAgent cfnAgent = CfnAgent.Builder.create(this, "MyCfnAgent")
 * .agentName("agentName")
 * // the properties below are optional
 * .actionGroups(List.of(AgentActionGroupProperty.builder()
 * .actionGroupName("actionGroupName")
 * // the properties below are optional
 * .actionGroupExecutor(ActionGroupExecutorProperty.builder()
 * .customControl("customControl")
 * .lambda("lambda")
 * .build())
 * .actionGroupState("actionGroupState")
 * .apiSchema(APISchemaProperty.builder()
 * .payload("payload")
 * .s3(S3IdentifierProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3ObjectKey("s3ObjectKey")
 * .build())
 * .build())
 * .description("description")
 * .functionSchema(FunctionSchemaProperty.builder()
 * .functions(List.of(FunctionProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .parameters(Map.of(
 * "parametersKey", ParameterDetailProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .required(false)
 * .build()))
 * .requireConfirmation("requireConfirmation")
 * .build()))
 * .build())
 * .parentActionGroupSignature("parentActionGroupSignature")
 * .skipResourceInUseCheckOnDelete(false)
 * .build()))
 * .agentCollaboration("agentCollaboration")
 * .agentCollaborators(List.of(AgentCollaboratorProperty.builder()
 * .agentDescriptor(AgentDescriptorProperty.builder()
 * .aliasArn("aliasArn")
 * .build())
 * .collaborationInstruction("collaborationInstruction")
 * .collaboratorName("collaboratorName")
 * // the properties below are optional
 * .relayConversationHistory("relayConversationHistory")
 * .build()))
 * .agentResourceRoleArn("agentResourceRoleArn")
 * .autoPrepare(false)
 * .customerEncryptionKeyArn("customerEncryptionKeyArn")
 * .customOrchestration(CustomOrchestrationProperty.builder()
 * .executor(OrchestrationExecutorProperty.builder()
 * .lambda("lambda")
 * .build())
 * .build())
 * .description("description")
 * .foundationModel("foundationModel")
 * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
 * .guardrailIdentifier("guardrailIdentifier")
 * .guardrailVersion("guardrailVersion")
 * .build())
 * .idleSessionTtlInSeconds(123)
 * .instruction("instruction")
 * .knowledgeBases(List.of(AgentKnowledgeBaseProperty.builder()
 * .description("description")
 * .knowledgeBaseId("knowledgeBaseId")
 * // the properties below are optional
 * .knowledgeBaseState("knowledgeBaseState")
 * .build()))
 * .memoryConfiguration(MemoryConfigurationProperty.builder()
 * .enabledMemoryTypes(List.of("enabledMemoryTypes"))
 * .sessionSummaryConfiguration(SessionSummaryConfigurationProperty.builder()
 * .maxRecentSessions(123)
 * .build())
 * .storageDays(123)
 * .build())
 * .orchestrationType("orchestrationType")
 * .promptOverrideConfiguration(PromptOverrideConfigurationProperty.builder()
 * .promptConfigurations(List.of(PromptConfigurationProperty.builder()
 * .additionalModelRequestFields(additionalModelRequestFields)
 * .basePromptTemplate("basePromptTemplate")
 * .foundationModel("foundationModel")
 * .inferenceConfiguration(InferenceConfigurationProperty.builder()
 * .maximumLength(123)
 * .stopSequences(List.of("stopSequences"))
 * .temperature(123)
 * .topK(123)
 * .topP(123)
 * .build())
 * .parserMode("parserMode")
 * .promptCreationMode("promptCreationMode")
 * .promptState("promptState")
 * .promptType("promptType")
 * .build()))
 * // the properties below are optional
 * .overrideLambda("overrideLambda")
 * .build())
 * .skipResourceInUseCheckOnDelete(false)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .testAliasTags(Map.of(
 * "testAliasTagsKey", "testAliasTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html)
 */
public open class CfnAgent(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnAgent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAgentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAgentProps(props)
  )

  /**
   * The action groups that belong to an agent.
   */
  public open fun actionGroups(): Any? = unwrap(this).getActionGroups()

  /**
   * The action groups that belong to an agent.
   */
  public open fun actionGroups(`value`: IResolvable) {
    unwrap(this).setActionGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The action groups that belong to an agent.
   */
  public open fun actionGroups(`value`: List<Any>) {
    unwrap(this).setActionGroups(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The action groups that belong to an agent.
   */
  public open fun actionGroups(vararg `value`: Any): Unit = actionGroups(`value`.toList())

  /**
   * The agent's collaboration settings.
   */
  public open fun agentCollaboration(): String? = unwrap(this).getAgentCollaboration()

  /**
   * The agent's collaboration settings.
   */
  public open fun agentCollaboration(`value`: String) {
    unwrap(this).setAgentCollaboration(`value`)
  }

  /**
   * List of Agent Collaborators.
   */
  public open fun agentCollaborators(): Any? = unwrap(this).getAgentCollaborators()

  /**
   * List of Agent Collaborators.
   */
  public open fun agentCollaborators(`value`: IResolvable) {
    unwrap(this).setAgentCollaborators(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * List of Agent Collaborators.
   */
  public open fun agentCollaborators(`value`: List<Any>) {
    unwrap(this).setAgentCollaborators(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * List of Agent Collaborators.
   */
  public open fun agentCollaborators(vararg `value`: Any): Unit =
      agentCollaborators(`value`.toList())

  /**
   * The name of the agent.
   */
  public open fun agentName(): String = unwrap(this).getAgentName()

  /**
   * The name of the agent.
   */
  public open fun agentName(`value`: String) {
    unwrap(this).setAgentName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * agent.
   */
  public open fun agentResourceRoleArn(): String? = unwrap(this).getAgentResourceRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * agent.
   */
  public open fun agentResourceRoleArn(`value`: String) {
    unwrap(this).setAgentResourceRoleArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the agent.
   */
  public open fun attrAgentArn(): String = unwrap(this).getAttrAgentArn()

  /**
   * The unique identifier of the agent.
   */
  public open fun attrAgentId(): String = unwrap(this).getAttrAgentId()

  /**
   * The status of the agent and whether it is ready for use. The following statuses are possible:.
   *
   * * CREATING – The agent is being created.
   * * PREPARING – The agent is being prepared.
   * * PREPARED – The agent is prepared and ready to be invoked.
   * * NOT_PREPARED – The agent has been created but not yet prepared.
   * * FAILED – The agent API operation failed.
   * * UPDATING – The agent is being updated.
   * * DELETING – The agent is being deleted.
   */
  public open fun attrAgentStatus(): String = unwrap(this).getAttrAgentStatus()

  /**
   * The version of the agent.
   */
  public open fun attrAgentVersion(): String = unwrap(this).getAttrAgentVersion()

  /**
   * The time at which the agent was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Contains reasons that the agent-related API that you invoked failed.
   */
  public open fun attrFailureReasons(): List<String> = unwrap(this).getAttrFailureReasons()

  /**
   * The time at which the agent was last prepared.
   */
  public open fun attrPreparedAt(): String = unwrap(this).getAttrPreparedAt()

  /**
   * Contains recommended actions to take for the agent-related API that you invoked to succeed.
   */
  public open fun attrRecommendedActions(): List<String> = unwrap(this).getAttrRecommendedActions()

  /**
   * The time at which the agent was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Specifies whether to automatically update the `DRAFT` version of the agent after making changes
   * to the agent.
   */
  public open fun autoPrepare(): Any? = unwrap(this).getAutoPrepare()

  /**
   * Specifies whether to automatically update the `DRAFT` version of the agent after making changes
   * to the agent.
   */
  public open fun autoPrepare(`value`: Boolean) {
    unwrap(this).setAutoPrepare(`value`)
  }

  /**
   * Specifies whether to automatically update the `DRAFT` version of the agent after making changes
   * to the agent.
   */
  public open fun autoPrepare(`value`: IResolvable) {
    unwrap(this).setAutoPrepare(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Contains custom orchestration configurations for the agent.
   */
  public open fun customOrchestration(): Any? = unwrap(this).getCustomOrchestration()

  /**
   * Contains custom orchestration configurations for the agent.
   */
  public open fun customOrchestration(`value`: IResolvable) {
    unwrap(this).setCustomOrchestration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains custom orchestration configurations for the agent.
   */
  public open fun customOrchestration(`value`: CustomOrchestrationProperty) {
    unwrap(this).setCustomOrchestration(`value`.let(CustomOrchestrationProperty.Companion::unwrap))
  }

  /**
   * Contains custom orchestration configurations for the agent.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d056802d19df4b6ce757df2e5c9e3532a21f991436183f3a3c0e395dea1d43de")
  public open fun customOrchestration(`value`: CustomOrchestrationProperty.Builder.() -> Unit): Unit
      = customOrchestration(CustomOrchestrationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
   */
  public open fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
   */
  public open fun customerEncryptionKeyArn(`value`: String) {
    unwrap(this).setCustomerEncryptionKeyArn(`value`)
  }

  /**
   * The description of the agent.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the agent.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The foundation model used for orchestration by the agent.
   */
  public open fun foundationModel(): String? = unwrap(this).getFoundationModel()

  /**
   * The foundation model used for orchestration by the agent.
   */
  public open fun foundationModel(`value`: String) {
    unwrap(this).setFoundationModel(`value`)
  }

  /**
   * Details about the guardrail associated with the agent.
   */
  public open fun guardrailConfiguration(): Any? = unwrap(this).getGuardrailConfiguration()

  /**
   * Details about the guardrail associated with the agent.
   */
  public open fun guardrailConfiguration(`value`: IResolvable) {
    unwrap(this).setGuardrailConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Details about the guardrail associated with the agent.
   */
  public open fun guardrailConfiguration(`value`: GuardrailConfigurationProperty) {
    unwrap(this).setGuardrailConfiguration(`value`.let(GuardrailConfigurationProperty.Companion::unwrap))
  }

  /**
   * Details about the guardrail associated with the agent.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04049312d43b17b62d0851c33cd32642ec76160c8c5b6015e9019ca6c2e786e0")
  public open
      fun guardrailConfiguration(`value`: GuardrailConfigurationProperty.Builder.() -> Unit): Unit =
      guardrailConfiguration(GuardrailConfigurationProperty(`value`))

  /**
   * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
   * with the agent.
   */
  public open fun idleSessionTtlInSeconds(): Number? = unwrap(this).getIdleSessionTtlInSeconds()

  /**
   * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
   * with the agent.
   */
  public open fun idleSessionTtlInSeconds(`value`: Number) {
    unwrap(this).setIdleSessionTtlInSeconds(`value`)
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
   * Instructions that tell the agent what it should do and how it should interact with users.
   */
  public open fun instruction(): String? = unwrap(this).getInstruction()

  /**
   * Instructions that tell the agent what it should do and how it should interact with users.
   */
  public open fun instruction(`value`: String) {
    unwrap(this).setInstruction(`value`)
  }

  /**
   * The knowledge bases associated with the agent.
   */
  public open fun knowledgeBases(): Any? = unwrap(this).getKnowledgeBases()

  /**
   * The knowledge bases associated with the agent.
   */
  public open fun knowledgeBases(`value`: IResolvable) {
    unwrap(this).setKnowledgeBases(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The knowledge bases associated with the agent.
   */
  public open fun knowledgeBases(`value`: List<Any>) {
    unwrap(this).setKnowledgeBases(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The knowledge bases associated with the agent.
   */
  public open fun knowledgeBases(vararg `value`: Any): Unit = knowledgeBases(`value`.toList())

  /**
   * Contains memory configuration for the agent.
   */
  public open fun memoryConfiguration(): Any? = unwrap(this).getMemoryConfiguration()

  /**
   * Contains memory configuration for the agent.
   */
  public open fun memoryConfiguration(`value`: IResolvable) {
    unwrap(this).setMemoryConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains memory configuration for the agent.
   */
  public open fun memoryConfiguration(`value`: MemoryConfigurationProperty) {
    unwrap(this).setMemoryConfiguration(`value`.let(MemoryConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains memory configuration for the agent.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1c9efe6cb3f299190f8981d97d700b394298eab4ece52fb73cac41d2cdee08af")
  public open fun memoryConfiguration(`value`: MemoryConfigurationProperty.Builder.() -> Unit): Unit
      = memoryConfiguration(MemoryConfigurationProperty(`value`))

  /**
   * Specifies the orchestration strategy for the agent.
   */
  public open fun orchestrationType(): String? = unwrap(this).getOrchestrationType()

  /**
   * Specifies the orchestration strategy for the agent.
   */
  public open fun orchestrationType(`value`: String) {
    unwrap(this).setOrchestrationType(`value`)
  }

  /**
   * Contains configurations to override prompt templates in different parts of an agent sequence.
   */
  public open fun promptOverrideConfiguration(): Any? =
      unwrap(this).getPromptOverrideConfiguration()

  /**
   * Contains configurations to override prompt templates in different parts of an agent sequence.
   */
  public open fun promptOverrideConfiguration(`value`: IResolvable) {
    unwrap(this).setPromptOverrideConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains configurations to override prompt templates in different parts of an agent sequence.
   */
  public open fun promptOverrideConfiguration(`value`: PromptOverrideConfigurationProperty) {
    unwrap(this).setPromptOverrideConfiguration(`value`.let(PromptOverrideConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains configurations to override prompt templates in different parts of an agent sequence.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("910512d1ffbfb09cb0f740546a7e7856681d649dd88fc9ce9c47c2775d1dc878")
  public open
      fun promptOverrideConfiguration(`value`: PromptOverrideConfigurationProperty.Builder.() -> Unit):
      Unit = promptOverrideConfiguration(PromptOverrideConfigurationProperty(`value`))

  /**
   * Specifies whether to delete the resource even if it's in use.
   */
  public open fun skipResourceInUseCheckOnDelete(): Any? =
      unwrap(this).getSkipResourceInUseCheckOnDelete()

  /**
   * Specifies whether to delete the resource even if it's in use.
   */
  public open fun skipResourceInUseCheckOnDelete(`value`: Boolean) {
    unwrap(this).setSkipResourceInUseCheckOnDelete(`value`)
  }

  /**
   * Specifies whether to delete the resource even if it's in use.
   */
  public open fun skipResourceInUseCheckOnDelete(`value`: IResolvable) {
    unwrap(this).setSkipResourceInUseCheckOnDelete(`value`.let(IResolvable.Companion::unwrap))
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
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun testAliasTags(`value`: Map<String, String>) {
    unwrap(this).setTestAliasTags(`value`)
  }

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun testAliasTags(`value`: IResolvable) {
    unwrap(this).setTestAliasTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnAgent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    public fun actionGroups(actionGroups: IResolvable)

    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    public fun actionGroups(actionGroups: List<Any>)

    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    public fun actionGroups(vararg actionGroups: Any)

    /**
     * The agent's collaboration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaboration)
     * @param agentCollaboration The agent's collaboration settings. 
     */
    public fun agentCollaboration(agentCollaboration: String)

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    public fun agentCollaborators(agentCollaborators: IResolvable)

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    public fun agentCollaborators(agentCollaborators: List<Any>)

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    public fun agentCollaborators(vararg agentCollaborators: Any)

    /**
     * The name of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentname)
     * @param agentName The name of the agent. 
     */
    public fun agentName(agentName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentresourcerolearn)
     * @param agentResourceRoleArn The Amazon Resource Name (ARN) of the IAM role with permissions
     * to invoke API operations on the agent. 
     */
    public fun agentResourceRoleArn(agentResourceRoleArn: String)

    /**
     * Specifies whether to automatically update the `DRAFT` version of the agent after making
     * changes to the agent.
     *
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-autoprepare)
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent. 
     */
    public fun autoPrepare(autoPrepare: Boolean)

    /**
     * Specifies whether to automatically update the `DRAFT` version of the agent after making
     * changes to the agent.
     *
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-autoprepare)
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent. 
     */
    public fun autoPrepare(autoPrepare: IResolvable)

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    public fun customOrchestration(customOrchestration: IResolvable)

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    public fun customOrchestration(customOrchestration: CustomOrchestrationProperty)

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c38bec09316a44197e0821bf7af6e8e0753115e21b2a4961c33ca33c417976e")
    public
        fun customOrchestration(customOrchestration: CustomOrchestrationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that
     * encrypts the agent. 
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * The description of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-description)
     * @param description The description of the agent. 
     */
    public fun description(description: String)

    /**
     * The foundation model used for orchestration by the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-foundationmodel)
     * @param foundationModel The foundation model used for orchestration by the agent. 
     */
    public fun foundationModel(foundationModel: String)

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    public fun guardrailConfiguration(guardrailConfiguration: IResolvable)

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    public fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty)

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8418c91d52c1bd259d601e910d40b1c6737b53abf42d92d66f60f80fe319930c")
    public
        fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit)

    /**
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
     * with the agent.
     *
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Bedrock deletes any data provided before the
     * timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-idlesessionttlinseconds)
     * @param idleSessionTtlInSeconds The number of seconds for which Amazon Bedrock keeps
     * information about a user's conversation with the agent. 
     */
    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    /**
     * Instructions that tell the agent what it should do and how it should interact with users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-instruction)
     * @param instruction Instructions that tell the agent what it should do and how it should
     * interact with users. 
     */
    public fun instruction(instruction: String)

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    public fun knowledgeBases(knowledgeBases: IResolvable)

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    public fun knowledgeBases(knowledgeBases: List<Any>)

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    public fun knowledgeBases(vararg knowledgeBases: Any)

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    public fun memoryConfiguration(memoryConfiguration: IResolvable)

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    public fun memoryConfiguration(memoryConfiguration: MemoryConfigurationProperty)

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c29cdd82c7790a6fa8e9e775b4107abef523649d8234c60cc5e5046d36cdb2f3")
    public
        fun memoryConfiguration(memoryConfiguration: MemoryConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies the orchestration strategy for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-orchestrationtype)
     * @param orchestrationType Specifies the orchestration strategy for the agent. 
     */
    public fun orchestrationType(orchestrationType: String)

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    public fun promptOverrideConfiguration(promptOverrideConfiguration: IResolvable)

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    public
        fun promptOverrideConfiguration(promptOverrideConfiguration: PromptOverrideConfigurationProperty)

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b61e2d46e1a572cddb4e9171b94f9069b7eddc6c44b643337fd8c78b6716e1f")
    public
        fun promptOverrideConfiguration(promptOverrideConfiguration: PromptOverrideConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
     * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
     * in use. 
     */
    public fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: Boolean)

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
     * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
     * in use. 
     */
    public fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: IResolvable)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun testAliasTags(testAliasTags: Map<String, String>)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun testAliasTags(testAliasTags: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnAgent.Builder =
        software.amazon.awscdk.services.bedrock.CfnAgent.Builder.create(scope, id)

    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    override fun actionGroups(actionGroups: IResolvable) {
      cdkBuilder.actionGroups(actionGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    override fun actionGroups(actionGroups: List<Any>) {
      cdkBuilder.actionGroups(actionGroups.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     * @param actionGroups The action groups that belong to an agent. 
     */
    override fun actionGroups(vararg actionGroups: Any): Unit = actionGroups(actionGroups.toList())

    /**
     * The agent's collaboration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaboration)
     * @param agentCollaboration The agent's collaboration settings. 
     */
    override fun agentCollaboration(agentCollaboration: String) {
      cdkBuilder.agentCollaboration(agentCollaboration)
    }

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    override fun agentCollaborators(agentCollaborators: IResolvable) {
      cdkBuilder.agentCollaborators(agentCollaborators.let(IResolvable.Companion::unwrap))
    }

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    override fun agentCollaborators(agentCollaborators: List<Any>) {
      cdkBuilder.agentCollaborators(agentCollaborators.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * List of Agent Collaborators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentcollaborators)
     * @param agentCollaborators List of Agent Collaborators. 
     */
    override fun agentCollaborators(vararg agentCollaborators: Any): Unit =
        agentCollaborators(agentCollaborators.toList())

    /**
     * The name of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentname)
     * @param agentName The name of the agent. 
     */
    override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentresourcerolearn)
     * @param agentResourceRoleArn The Amazon Resource Name (ARN) of the IAM role with permissions
     * to invoke API operations on the agent. 
     */
    override fun agentResourceRoleArn(agentResourceRoleArn: String) {
      cdkBuilder.agentResourceRoleArn(agentResourceRoleArn)
    }

    /**
     * Specifies whether to automatically update the `DRAFT` version of the agent after making
     * changes to the agent.
     *
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-autoprepare)
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent. 
     */
    override fun autoPrepare(autoPrepare: Boolean) {
      cdkBuilder.autoPrepare(autoPrepare)
    }

    /**
     * Specifies whether to automatically update the `DRAFT` version of the agent after making
     * changes to the agent.
     *
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-autoprepare)
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent. 
     */
    override fun autoPrepare(autoPrepare: IResolvable) {
      cdkBuilder.autoPrepare(autoPrepare.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    override fun customOrchestration(customOrchestration: IResolvable) {
      cdkBuilder.customOrchestration(customOrchestration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    override fun customOrchestration(customOrchestration: CustomOrchestrationProperty) {
      cdkBuilder.customOrchestration(customOrchestration.let(CustomOrchestrationProperty.Companion::unwrap))
    }

    /**
     * Contains custom orchestration configurations for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customorchestration)
     * @param customOrchestration Contains custom orchestration configurations for the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c38bec09316a44197e0821bf7af6e8e0753115e21b2a4961c33ca33c417976e")
    override
        fun customOrchestration(customOrchestration: CustomOrchestrationProperty.Builder.() -> Unit):
        Unit = customOrchestration(CustomOrchestrationProperty(customOrchestration))

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that
     * encrypts the agent. 
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * The description of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-description)
     * @param description The description of the agent. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The foundation model used for orchestration by the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-foundationmodel)
     * @param foundationModel The foundation model used for orchestration by the agent. 
     */
    override fun foundationModel(foundationModel: String) {
      cdkBuilder.foundationModel(foundationModel)
    }

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    override fun guardrailConfiguration(guardrailConfiguration: IResolvable) {
      cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    override fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty) {
      cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(GuardrailConfigurationProperty.Companion::unwrap))
    }

    /**
     * Details about the guardrail associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-guardrailconfiguration)
     * @param guardrailConfiguration Details about the guardrail associated with the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8418c91d52c1bd259d601e910d40b1c6737b53abf42d92d66f60f80fe319930c")
    override
        fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit):
        Unit = guardrailConfiguration(GuardrailConfigurationProperty(guardrailConfiguration))

    /**
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
     * with the agent.
     *
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Bedrock deletes any data provided before the
     * timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-idlesessionttlinseconds)
     * @param idleSessionTtlInSeconds The number of seconds for which Amazon Bedrock keeps
     * information about a user's conversation with the agent. 
     */
    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    /**
     * Instructions that tell the agent what it should do and how it should interact with users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-instruction)
     * @param instruction Instructions that tell the agent what it should do and how it should
     * interact with users. 
     */
    override fun instruction(instruction: String) {
      cdkBuilder.instruction(instruction)
    }

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    override fun knowledgeBases(knowledgeBases: IResolvable) {
      cdkBuilder.knowledgeBases(knowledgeBases.let(IResolvable.Companion::unwrap))
    }

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    override fun knowledgeBases(knowledgeBases: List<Any>) {
      cdkBuilder.knowledgeBases(knowledgeBases.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     * @param knowledgeBases The knowledge bases associated with the agent. 
     */
    override fun knowledgeBases(vararg knowledgeBases: Any): Unit =
        knowledgeBases(knowledgeBases.toList())

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    override fun memoryConfiguration(memoryConfiguration: IResolvable) {
      cdkBuilder.memoryConfiguration(memoryConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    override fun memoryConfiguration(memoryConfiguration: MemoryConfigurationProperty) {
      cdkBuilder.memoryConfiguration(memoryConfiguration.let(MemoryConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains memory configuration for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-memoryconfiguration)
     * @param memoryConfiguration Contains memory configuration for the agent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c29cdd82c7790a6fa8e9e775b4107abef523649d8234c60cc5e5046d36cdb2f3")
    override
        fun memoryConfiguration(memoryConfiguration: MemoryConfigurationProperty.Builder.() -> Unit):
        Unit = memoryConfiguration(MemoryConfigurationProperty(memoryConfiguration))

    /**
     * Specifies the orchestration strategy for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-orchestrationtype)
     * @param orchestrationType Specifies the orchestration strategy for the agent. 
     */
    override fun orchestrationType(orchestrationType: String) {
      cdkBuilder.orchestrationType(orchestrationType)
    }

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    override fun promptOverrideConfiguration(promptOverrideConfiguration: IResolvable) {
      cdkBuilder.promptOverrideConfiguration(promptOverrideConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    override
        fun promptOverrideConfiguration(promptOverrideConfiguration: PromptOverrideConfigurationProperty) {
      cdkBuilder.promptOverrideConfiguration(promptOverrideConfiguration.let(PromptOverrideConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b61e2d46e1a572cddb4e9171b94f9069b7eddc6c44b643337fd8c78b6716e1f")
    override
        fun promptOverrideConfiguration(promptOverrideConfiguration: PromptOverrideConfigurationProperty.Builder.() -> Unit):
        Unit =
        promptOverrideConfiguration(PromptOverrideConfigurationProperty(promptOverrideConfiguration))

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
     * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
     * in use. 
     */
    override fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: Boolean) {
      cdkBuilder.skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete)
    }

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
     * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
     * in use. 
     */
    override fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: IResolvable) {
      cdkBuilder.skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete.let(IResolvable.Companion::unwrap))
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun testAliasTags(testAliasTags: Map<String, String>) {
      cdkBuilder.testAliasTags(testAliasTags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun testAliasTags(testAliasTags: IResolvable) {
      cdkBuilder.testAliasTags(testAliasTags.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnAgent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent): CfnAgent =
        CfnAgent(cdkObject)

    internal fun unwrap(wrapped: CfnAgent): software.amazon.awscdk.services.bedrock.CfnAgent =
        wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnAgent
  }

  /**
   * Contains details about the OpenAPI schema for the action group.
   *
   * For more information, see [Action group OpenAPI
   * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) . You can
   * either include the schema directly in the payload field or you can upload it to an S3 bucket and
   * specify the S3 bucket location in the s3 field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * APISchemaProperty aPISchemaProperty = APISchemaProperty.builder()
   * .payload("payload")
   * .s3(S3IdentifierProperty.builder()
   * .s3BucketName("s3BucketName")
   * .s3ObjectKey("s3ObjectKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html)
   */
  public interface APISchemaProperty {
    /**
     * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-payload)
     */
    public fun payload(): String? = unwrap(this).getPayload()

    /**
     * Contains details about the S3 object containing the OpenAPI schema for the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [APISchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload The JSON or YAML-formatted payload defining the OpenAPI schema for the
       * action group.
       */
      public fun payload(payload: String)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      public fun s3(s3: S3IdentifierProperty)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3709b0a16a0ad1e7693d74f1a146d5aebd11b63fb28f127c1b77deddbd4e974")
      public fun s3(s3: S3IdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty.builder()

      /**
       * @param payload The JSON or YAML-formatted payload defining the OpenAPI schema for the
       * action group.
       */
      override fun payload(payload: String) {
        cdkBuilder.payload(payload)
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      override fun s3(s3: S3IdentifierProperty) {
        cdkBuilder.s3(s3.let(S3IdentifierProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3709b0a16a0ad1e7693d74f1a146d5aebd11b63fb28f127c1b77deddbd4e974")
      override fun s3(s3: S3IdentifierProperty.Builder.() -> Unit): Unit =
          s3(S3IdentifierProperty(s3))

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty,
    ) : CdkObject(cdkObject),
        APISchemaProperty {
      /**
       * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-payload)
       */
      override fun payload(): String? = unwrap(this).getPayload()

      /**
       * Contains details about the S3 object containing the OpenAPI schema for the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): APISchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty):
          APISchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? APISchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: APISchemaProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnAgent.APISchemaProperty
    }
  }

  /**
   * Contains details about the Lambda function containing the business logic that is carried out
   * upon invoking the action or the custom control method for handling the information elicited from
   * the user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ActionGroupExecutorProperty actionGroupExecutorProperty = ActionGroupExecutorProperty.builder()
   * .customControl("customControl")
   * .lambda("lambda")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html)
   */
  public interface ActionGroupExecutorProperty {
    /**
     * To return the action group invocation results directly in the `InvokeInlineAgent` response,
     * specify `RETURN_CONTROL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-customcontrol)
     */
    public fun customControl(): String? = unwrap(this).getCustomControl()

    /**
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
     * carried out upon invoking the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-lambda)
     */
    public fun lambda(): String? = unwrap(this).getLambda()

    /**
     * A builder for [ActionGroupExecutorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customControl To return the action group invocation results directly in the
       * `InvokeInlineAgent` response, specify `RETURN_CONTROL` .
       */
      public fun customControl(customControl: String)

      /**
       * @param lambda The Amazon Resource Name (ARN) of the Lambda function containing the business
       * logic that is carried out upon invoking the action.
       */
      public fun lambda(lambda: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty.builder()

      /**
       * @param customControl To return the action group invocation results directly in the
       * `InvokeInlineAgent` response, specify `RETURN_CONTROL` .
       */
      override fun customControl(customControl: String) {
        cdkBuilder.customControl(customControl)
      }

      /**
       * @param lambda The Amazon Resource Name (ARN) of the Lambda function containing the business
       * logic that is carried out upon invoking the action.
       */
      override fun lambda(lambda: String) {
        cdkBuilder.lambda(lambda)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty,
    ) : CdkObject(cdkObject),
        ActionGroupExecutorProperty {
      /**
       * To return the action group invocation results directly in the `InvokeInlineAgent` response,
       * specify `RETURN_CONTROL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-customcontrol)
       */
      override fun customControl(): String? = unwrap(this).getCustomControl()

      /**
       * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
       * carried out upon invoking the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-lambda)
       */
      override fun lambda(): String? = unwrap(this).getLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionGroupExecutorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty):
          ActionGroupExecutorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActionGroupExecutorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionGroupExecutorProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty
    }
  }

  /**
   * Contains details of the inline agent's action group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentActionGroupProperty agentActionGroupProperty = AgentActionGroupProperty.builder()
   * .actionGroupName("actionGroupName")
   * // the properties below are optional
   * .actionGroupExecutor(ActionGroupExecutorProperty.builder()
   * .customControl("customControl")
   * .lambda("lambda")
   * .build())
   * .actionGroupState("actionGroupState")
   * .apiSchema(APISchemaProperty.builder()
   * .payload("payload")
   * .s3(S3IdentifierProperty.builder()
   * .s3BucketName("s3BucketName")
   * .s3ObjectKey("s3ObjectKey")
   * .build())
   * .build())
   * .description("description")
   * .functionSchema(FunctionSchemaProperty.builder()
   * .functions(List.of(FunctionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", ParameterDetailProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .required(false)
   * .build()))
   * .requireConfirmation("requireConfirmation")
   * .build()))
   * .build())
   * .parentActionGroupSignature("parentActionGroupSignature")
   * .skipResourceInUseCheckOnDelete(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html)
   */
  public interface AgentActionGroupProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
     * carried out upon invoking the action or the custom control method for handling the information
     * elicited from the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupexecutor)
     */
    public fun actionGroupExecutor(): Any? = unwrap(this).getActionGroupExecutor()

    /**
     * The name of the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupname)
     */
    public fun actionGroupName(): String

    /**
     * Specifies whether the action group is available for the agent to invoke or not when sending
     * an
     * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupstate)
     */
    public fun actionGroupState(): String? = unwrap(this).getActionGroupState()

    /**
     * Contains either details about the S3 object containing the OpenAPI schema for the action
     * group or the JSON or YAML-formatted payload defining the schema.
     *
     * For more information, see [Action group OpenAPI
     * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-apischema)
     */
    public fun apiSchema(): Any? = unwrap(this).getApiSchema()

    /**
     * A description of the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Contains details about the function schema for the action group or the JSON or YAML-formatted
     * payload defining the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-functionschema)
     */
    public fun functionSchema(): Any? = unwrap(this).getFunctionSchema()

    /**
     * If this field is set as `AMAZON.UserInput` , the agent can request the user for additional
     * information when trying to complete a task. The `description` , `apiSchema` , and
     * `actionGroupExecutor` fields must be blank for this action group.
     *
     * During orchestration, if the agent determines that it needs to invoke an API in an action
     * group, but doesn't have enough information to complete the API request, it will invoke this
     * action group instead and return an
     * [Observation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html)
     * reprompting the user for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-parentactiongroupsignature)
     */
    public fun parentActionGroupSignature(): String? = unwrap(this).getParentActionGroupSignature()

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-skipresourceinusecheckondelete)
     */
    public fun skipResourceInUseCheckOnDelete(): Any? =
        unwrap(this).getSkipResourceInUseCheckOnDelete()

    /**
     * A builder for [AgentActionGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      public fun actionGroupExecutor(actionGroupExecutor: IResolvable)

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      public fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty)

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe9062ac1f596537a9de04683d855a04b2e8cd613ad96c21989601a932af6ab")
      public
          fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty.Builder.() -> Unit)

      /**
       * @param actionGroupName The name of the action group. 
       */
      public fun actionGroupName(actionGroupName: String)

      /**
       * @param actionGroupState Specifies whether the action group is available for the agent to
       * invoke or not when sending an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       */
      public fun actionGroupState(actionGroupState: String)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun apiSchema(apiSchema: IResolvable)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun apiSchema(apiSchema: APISchemaProperty)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49a66ceb426740b8b0779f6110b585a64c809f1c0de64db0220e4424b031e9")
      public fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit)

      /**
       * @param description A description of the action group.
       */
      public fun description(description: String)

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      public fun functionSchema(functionSchema: IResolvable)

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      public fun functionSchema(functionSchema: FunctionSchemaProperty)

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ae6a932602ba614adb804ec413d8870487556f1dcdb132b461d7ab5eee1a9c6")
      public fun functionSchema(functionSchema: FunctionSchemaProperty.Builder.() -> Unit)

      /**
       * @param parentActionGroupSignature If this field is set as `AMAZON.UserInput` , the agent
       * can request the user for additional information when trying to complete a task. The
       * `description` , `apiSchema` , and `actionGroupExecutor` fields must be blank for this action
       * group.
       * During orchestration, if the agent determines that it needs to invoke an API in an action
       * group, but doesn't have enough information to complete the API request, it will invoke this
       * action group instead and return an
       * [Observation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html)
       * reprompting the user for more information.
       */
      public fun parentActionGroupSignature(parentActionGroupSignature: String)

      /**
       * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
       * in use.
       * By default, this value is `false` .
       */
      public fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: Boolean)

      /**
       * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
       * in use.
       * By default, this value is `false` .
       */
      public fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty.builder()

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      override fun actionGroupExecutor(actionGroupExecutor: IResolvable) {
        cdkBuilder.actionGroupExecutor(actionGroupExecutor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      override fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty) {
        cdkBuilder.actionGroupExecutor(actionGroupExecutor.let(ActionGroupExecutorProperty.Companion::unwrap))
      }

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action or the custom control method
       * for handling the information elicited from the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe9062ac1f596537a9de04683d855a04b2e8cd613ad96c21989601a932af6ab")
      override
          fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty.Builder.() -> Unit):
          Unit = actionGroupExecutor(ActionGroupExecutorProperty(actionGroupExecutor))

      /**
       * @param actionGroupName The name of the action group. 
       */
      override fun actionGroupName(actionGroupName: String) {
        cdkBuilder.actionGroupName(actionGroupName)
      }

      /**
       * @param actionGroupState Specifies whether the action group is available for the agent to
       * invoke or not when sending an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       */
      override fun actionGroupState(actionGroupState: String) {
        cdkBuilder.actionGroupState(actionGroupState)
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun apiSchema(apiSchema: IResolvable) {
        cdkBuilder.apiSchema(apiSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun apiSchema(apiSchema: APISchemaProperty) {
        cdkBuilder.apiSchema(apiSchema.let(APISchemaProperty.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49a66ceb426740b8b0779f6110b585a64c809f1c0de64db0220e4424b031e9")
      override fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit): Unit =
          apiSchema(APISchemaProperty(apiSchema))

      /**
       * @param description A description of the action group.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      override fun functionSchema(functionSchema: IResolvable) {
        cdkBuilder.functionSchema(functionSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      override fun functionSchema(functionSchema: FunctionSchemaProperty) {
        cdkBuilder.functionSchema(functionSchema.let(FunctionSchemaProperty.Companion::unwrap))
      }

      /**
       * @param functionSchema Contains details about the function schema for the action group or
       * the JSON or YAML-formatted payload defining the schema.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ae6a932602ba614adb804ec413d8870487556f1dcdb132b461d7ab5eee1a9c6")
      override fun functionSchema(functionSchema: FunctionSchemaProperty.Builder.() -> Unit): Unit =
          functionSchema(FunctionSchemaProperty(functionSchema))

      /**
       * @param parentActionGroupSignature If this field is set as `AMAZON.UserInput` , the agent
       * can request the user for additional information when trying to complete a task. The
       * `description` , `apiSchema` , and `actionGroupExecutor` fields must be blank for this action
       * group.
       * During orchestration, if the agent determines that it needs to invoke an API in an action
       * group, but doesn't have enough information to complete the API request, it will invoke this
       * action group instead and return an
       * [Observation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html)
       * reprompting the user for more information.
       */
      override fun parentActionGroupSignature(parentActionGroupSignature: String) {
        cdkBuilder.parentActionGroupSignature(parentActionGroupSignature)
      }

      /**
       * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
       * in use.
       * By default, this value is `false` .
       */
      override fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: Boolean) {
        cdkBuilder.skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete)
      }

      /**
       * @param skipResourceInUseCheckOnDelete Specifies whether to delete the resource even if it's
       * in use.
       * By default, this value is `false` .
       */
      override fun skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete: IResolvable) {
        cdkBuilder.skipResourceInUseCheckOnDelete(skipResourceInUseCheckOnDelete.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty,
    ) : CdkObject(cdkObject),
        AgentActionGroupProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
       * carried out upon invoking the action or the custom control method for handling the information
       * elicited from the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupexecutor)
       */
      override fun actionGroupExecutor(): Any? = unwrap(this).getActionGroupExecutor()

      /**
       * The name of the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupname)
       */
      override fun actionGroupName(): String = unwrap(this).getActionGroupName()

      /**
       * Specifies whether the action group is available for the agent to invoke or not when sending
       * an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-actiongroupstate)
       */
      override fun actionGroupState(): String? = unwrap(this).getActionGroupState()

      /**
       * Contains either details about the S3 object containing the OpenAPI schema for the action
       * group or the JSON or YAML-formatted payload defining the schema.
       *
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com//bedrock/latest/userguide/agents-api-schema.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-apischema)
       */
      override fun apiSchema(): Any? = unwrap(this).getApiSchema()

      /**
       * A description of the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Contains details about the function schema for the action group or the JSON or
       * YAML-formatted payload defining the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-functionschema)
       */
      override fun functionSchema(): Any? = unwrap(this).getFunctionSchema()

      /**
       * If this field is set as `AMAZON.UserInput` , the agent can request the user for additional
       * information when trying to complete a task. The `description` , `apiSchema` , and
       * `actionGroupExecutor` fields must be blank for this action group.
       *
       * During orchestration, if the agent determines that it needs to invoke an API in an action
       * group, but doesn't have enough information to complete the API request, it will invoke this
       * action group instead and return an
       * [Observation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html)
       * reprompting the user for more information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-parentactiongroupsignature)
       */
      override fun parentActionGroupSignature(): String? =
          unwrap(this).getParentActionGroupSignature()

      /**
       * Specifies whether to delete the resource even if it's in use.
       *
       * By default, this value is `false` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-skipresourceinusecheckondelete)
       */
      override fun skipResourceInUseCheckOnDelete(): Any? =
          unwrap(this).getSkipResourceInUseCheckOnDelete()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentActionGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty):
          AgentActionGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? AgentActionGroupProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentActionGroupProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentActionGroupProperty
    }
  }

  /**
   * An agent collaborator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentCollaboratorProperty agentCollaboratorProperty = AgentCollaboratorProperty.builder()
   * .agentDescriptor(AgentDescriptorProperty.builder()
   * .aliasArn("aliasArn")
   * .build())
   * .collaborationInstruction("collaborationInstruction")
   * .collaboratorName("collaboratorName")
   * // the properties below are optional
   * .relayConversationHistory("relayConversationHistory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html)
   */
  public interface AgentCollaboratorProperty {
    /**
     * The collaborator's agent descriptor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-agentdescriptor)
     */
    public fun agentDescriptor(): Any

    /**
     * The collaborator's instructions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-collaborationinstruction)
     */
    public fun collaborationInstruction(): String

    /**
     * The collaborator's collaborator name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-collaboratorname)
     */
    public fun collaboratorName(): String

    /**
     * The collaborator's relay conversation history.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-relayconversationhistory)
     */
    public fun relayConversationHistory(): String? = unwrap(this).getRelayConversationHistory()

    /**
     * A builder for [AgentCollaboratorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      public fun agentDescriptor(agentDescriptor: IResolvable)

      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      public fun agentDescriptor(agentDescriptor: AgentDescriptorProperty)

      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be703fab1407f7b7f2b5639d19e08c105939555cd8b582c676d92b4d203255c2")
      public fun agentDescriptor(agentDescriptor: AgentDescriptorProperty.Builder.() -> Unit)

      /**
       * @param collaborationInstruction The collaborator's instructions. 
       */
      public fun collaborationInstruction(collaborationInstruction: String)

      /**
       * @param collaboratorName The collaborator's collaborator name. 
       */
      public fun collaboratorName(collaboratorName: String)

      /**
       * @param relayConversationHistory The collaborator's relay conversation history.
       */
      public fun relayConversationHistory(relayConversationHistory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty.builder()

      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      override fun agentDescriptor(agentDescriptor: IResolvable) {
        cdkBuilder.agentDescriptor(agentDescriptor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      override fun agentDescriptor(agentDescriptor: AgentDescriptorProperty) {
        cdkBuilder.agentDescriptor(agentDescriptor.let(AgentDescriptorProperty.Companion::unwrap))
      }

      /**
       * @param agentDescriptor The collaborator's agent descriptor. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be703fab1407f7b7f2b5639d19e08c105939555cd8b582c676d92b4d203255c2")
      override fun agentDescriptor(agentDescriptor: AgentDescriptorProperty.Builder.() -> Unit):
          Unit = agentDescriptor(AgentDescriptorProperty(agentDescriptor))

      /**
       * @param collaborationInstruction The collaborator's instructions. 
       */
      override fun collaborationInstruction(collaborationInstruction: String) {
        cdkBuilder.collaborationInstruction(collaborationInstruction)
      }

      /**
       * @param collaboratorName The collaborator's collaborator name. 
       */
      override fun collaboratorName(collaboratorName: String) {
        cdkBuilder.collaboratorName(collaboratorName)
      }

      /**
       * @param relayConversationHistory The collaborator's relay conversation history.
       */
      override fun relayConversationHistory(relayConversationHistory: String) {
        cdkBuilder.relayConversationHistory(relayConversationHistory)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty,
    ) : CdkObject(cdkObject),
        AgentCollaboratorProperty {
      /**
       * The collaborator's agent descriptor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-agentdescriptor)
       */
      override fun agentDescriptor(): Any = unwrap(this).getAgentDescriptor()

      /**
       * The collaborator's instructions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-collaborationinstruction)
       */
      override fun collaborationInstruction(): String = unwrap(this).getCollaborationInstruction()

      /**
       * The collaborator's collaborator name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-collaboratorname)
       */
      override fun collaboratorName(): String = unwrap(this).getCollaboratorName()

      /**
       * The collaborator's relay conversation history.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentcollaborator.html#cfn-bedrock-agent-agentcollaborator-relayconversationhistory)
       */
      override fun relayConversationHistory(): String? = unwrap(this).getRelayConversationHistory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentCollaboratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty):
          AgentCollaboratorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentCollaboratorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentCollaboratorProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentCollaboratorProperty
    }
  }

  /**
   * An agent descriptor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentDescriptorProperty agentDescriptorProperty = AgentDescriptorProperty.builder()
   * .aliasArn("aliasArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentdescriptor.html)
   */
  public interface AgentDescriptorProperty {
    /**
     * The agent's alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentdescriptor.html#cfn-bedrock-agent-agentdescriptor-aliasarn)
     */
    public fun aliasArn(): String? = unwrap(this).getAliasArn()

    /**
     * A builder for [AgentDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aliasArn The agent's alias ARN.
       */
      public fun aliasArn(aliasArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty.builder()

      /**
       * @param aliasArn The agent's alias ARN.
       */
      override fun aliasArn(aliasArn: String) {
        cdkBuilder.aliasArn(aliasArn)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty,
    ) : CdkObject(cdkObject),
        AgentDescriptorProperty {
      /**
       * The agent's alias ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentdescriptor.html#cfn-bedrock-agent-agentdescriptor-aliasarn)
       */
      override fun aliasArn(): String? = unwrap(this).getAliasArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty):
          AgentDescriptorProperty = CdkObjectWrappers.wrap(cdkObject) as? AgentDescriptorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentDescriptorProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentDescriptorProperty
    }
  }

  /**
   * Contains details about a knowledge base that is associated with an agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentKnowledgeBaseProperty agentKnowledgeBaseProperty = AgentKnowledgeBaseProperty.builder()
   * .description("description")
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .knowledgeBaseState("knowledgeBaseState")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html)
   */
  public interface AgentKnowledgeBaseProperty {
    /**
     * The description of the association between the agent and the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-description)
     */
    public fun description(): String

    /**
     * The unique identifier of the association between the agent and the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-knowledgebaseid)
     */
    public fun knowledgeBaseId(): String

    /**
     * Specifies whether to use the knowledge base or not when sending an
     * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-knowledgebasestate)
     */
    public fun knowledgeBaseState(): String? = unwrap(this).getKnowledgeBaseState()

    /**
     * A builder for [AgentKnowledgeBaseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the association between the agent and the knowledge
       * base. 
       */
      public fun description(description: String)

      /**
       * @param knowledgeBaseId The unique identifier of the association between the agent and the
       * knowledge base. 
       */
      public fun knowledgeBaseId(knowledgeBaseId: String)

      /**
       * @param knowledgeBaseState Specifies whether to use the knowledge base or not when sending
       * an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       */
      public fun knowledgeBaseState(knowledgeBaseState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty.builder()

      /**
       * @param description The description of the association between the agent and the knowledge
       * base. 
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param knowledgeBaseId The unique identifier of the association between the agent and the
       * knowledge base. 
       */
      override fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
      }

      /**
       * @param knowledgeBaseState Specifies whether to use the knowledge base or not when sending
       * an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       */
      override fun knowledgeBaseState(knowledgeBaseState: String) {
        cdkBuilder.knowledgeBaseState(knowledgeBaseState)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty,
    ) : CdkObject(cdkObject),
        AgentKnowledgeBaseProperty {
      /**
       * The description of the association between the agent and the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-description)
       */
      override fun description(): String = unwrap(this).getDescription()

      /**
       * The unique identifier of the association between the agent and the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-knowledgebaseid)
       */
      override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()

      /**
       * Specifies whether to use the knowledge base or not when sending an
       * [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html)
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentknowledgebase.html#cfn-bedrock-agent-agentknowledgebase-knowledgebasestate)
       */
      override fun knowledgeBaseState(): String? = unwrap(this).getKnowledgeBaseState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentKnowledgeBaseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty):
          AgentKnowledgeBaseProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentKnowledgeBaseProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentKnowledgeBaseProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.AgentKnowledgeBaseProperty
    }
  }

  /**
   * Contains details of the custom orchestration configured for the agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CustomOrchestrationProperty customOrchestrationProperty = CustomOrchestrationProperty.builder()
   * .executor(OrchestrationExecutorProperty.builder()
   * .lambda("lambda")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-customorchestration.html)
   */
  public interface CustomOrchestrationProperty {
    /**
     * The structure of the executor invoking the actions in custom orchestration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-customorchestration.html#cfn-bedrock-agent-customorchestration-executor)
     */
    public fun executor(): Any? = unwrap(this).getExecutor()

    /**
     * A builder for [CustomOrchestrationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      public fun executor(executor: IResolvable)

      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      public fun executor(executor: OrchestrationExecutorProperty)

      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b2378d0be0bd94a7810fb8cecf4e41c6970912f9ee54688f99abe75d1b5fcf")
      public fun executor(executor: OrchestrationExecutorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty.builder()

      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      override fun executor(executor: IResolvable) {
        cdkBuilder.executor(executor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      override fun executor(executor: OrchestrationExecutorProperty) {
        cdkBuilder.executor(executor.let(OrchestrationExecutorProperty.Companion::unwrap))
      }

      /**
       * @param executor The structure of the executor invoking the actions in custom orchestration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b2378d0be0bd94a7810fb8cecf4e41c6970912f9ee54688f99abe75d1b5fcf")
      override fun executor(executor: OrchestrationExecutorProperty.Builder.() -> Unit): Unit =
          executor(OrchestrationExecutorProperty(executor))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty,
    ) : CdkObject(cdkObject),
        CustomOrchestrationProperty {
      /**
       * The structure of the executor invoking the actions in custom orchestration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-customorchestration.html#cfn-bedrock-agent-customorchestration-executor)
       */
      override fun executor(): Any? = unwrap(this).getExecutor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomOrchestrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty):
          CustomOrchestrationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomOrchestrationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomOrchestrationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.CustomOrchestrationProperty
    }
  }

  /**
   * Defines parameters that the agent needs to invoke from the user to complete the function.
   *
   * Corresponds to an action in an action group.
   *
   * This data type is used in the following API operations:
   *
   * * [CreateAgentActionGroup
   * request](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_CreateAgentActionGroup.html#API_agent_CreateAgentActionGroup_RequestSyntax)
   * * [CreateAgentActionGroup
   * response](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_CreateAgentActionGroup.html#API_agent_CreateAgentActionGroup_ResponseSyntax)
   * * [UpdateAgentActionGroup
   * request](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_UpdateAgentActionGroup.html#API_agent_UpdateAgentActionGroup_RequestSyntax)
   * * [UpdateAgentActionGroup
   * response](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_UpdateAgentActionGroup.html#API_agent_UpdateAgentActionGroup_ResponseSyntax)
   * * [GetAgentActionGroup
   * response](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetAgentActionGroup.html#API_agent_GetAgentActionGroup_ResponseSyntax)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FunctionProperty functionProperty = FunctionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", ParameterDetailProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .required(false)
   * .build()))
   * .requireConfirmation("requireConfirmation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html)
   */
  public interface FunctionProperty {
    /**
     * A description of the function and its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-name)
     */
    public fun name(): String

    /**
     * The parameters that the agent elicits from the user to fulfill the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Contains information if user confirmation is required to invoke the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-requireconfirmation)
     */
    public fun requireConfirmation(): String? = unwrap(this).getRequireConfirmation()

    /**
     * A builder for [FunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the function and its purpose.
       */
      public fun description(description: String)

      /**
       * @param name A name for the function. 
       */
      public fun name(name: String)

      /**
       * @param parameters The parameters that the agent elicits from the user to fulfill the
       * function.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The parameters that the agent elicits from the user to fulfill the
       * function.
       */
      public fun parameters(parameters: Map<String, Any>)

      /**
       * @param requireConfirmation Contains information if user confirmation is required to invoke
       * the function.
       */
      public fun requireConfirmation(requireConfirmation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty.builder()

      /**
       * @param description A description of the function and its purpose.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name A name for the function. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parameters The parameters that the agent elicits from the user to fulfill the
       * function.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters The parameters that the agent elicits from the user to fulfill the
       * function.
       */
      override fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param requireConfirmation Contains information if user confirmation is required to invoke
       * the function.
       */
      override fun requireConfirmation(requireConfirmation: String) {
        cdkBuilder.requireConfirmation(requireConfirmation)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty,
    ) : CdkObject(cdkObject),
        FunctionProperty {
      /**
       * A description of the function and its purpose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A name for the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The parameters that the agent elicits from the user to fulfill the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * Contains information if user confirmation is required to invoke the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-function.html#cfn-bedrock-agent-function-requireconfirmation)
       */
      override fun requireConfirmation(): String? = unwrap(this).getRequireConfirmation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty):
          FunctionProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnAgent.FunctionProperty
    }
  }

  /**
   * Contains details about the function schema for the action group or the JSON or YAML-formatted
   * payload defining the schema.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FunctionSchemaProperty functionSchemaProperty = FunctionSchemaProperty.builder()
   * .functions(List.of(FunctionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", ParameterDetailProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .required(false)
   * .build()))
   * .requireConfirmation("requireConfirmation")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-functionschema.html)
   */
  public interface FunctionSchemaProperty {
    /**
     * A list of functions that each define an action in the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-functionschema.html#cfn-bedrock-agent-functionschema-functions)
     */
    public fun functions(): Any

    /**
     * A builder for [FunctionSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      public fun functions(functions: IResolvable)

      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      public fun functions(functions: List<Any>)

      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      public fun functions(vararg functions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty.builder()

      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      override fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      override fun functions(functions: List<Any>) {
        cdkBuilder.functions(functions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param functions A list of functions that each define an action in the action group. 
       */
      override fun functions(vararg functions: Any): Unit = functions(functions.toList())

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty,
    ) : CdkObject(cdkObject),
        FunctionSchemaProperty {
      /**
       * A list of functions that each define an action in the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-functionschema.html#cfn-bedrock-agent-functionschema-functions)
       */
      override fun functions(): Any = unwrap(this).getFunctions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty):
          FunctionSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionSchemaProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.FunctionSchemaProperty
    }
  }

  /**
   * Configuration information for a guardrail that you use with the
   * [Converse](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html)
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * GuardrailConfigurationProperty guardrailConfigurationProperty =
   * GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-guardrailconfiguration.html)
   */
  public interface GuardrailConfigurationProperty {
    /**
     * The identifier for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-guardrailconfiguration.html#cfn-bedrock-agent-guardrailconfiguration-guardrailidentifier)
     */
    public fun guardrailIdentifier(): String? = unwrap(this).getGuardrailIdentifier()

    /**
     * The version of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-guardrailconfiguration.html#cfn-bedrock-agent-guardrailconfiguration-guardrailversion)
     */
    public fun guardrailVersion(): String? = unwrap(this).getGuardrailVersion()

    /**
     * A builder for [GuardrailConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param guardrailIdentifier The identifier for the guardrail.
       */
      public fun guardrailIdentifier(guardrailIdentifier: String)

      /**
       * @param guardrailVersion The version of the guardrail.
       */
      public fun guardrailVersion(guardrailVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty.builder()

      /**
       * @param guardrailIdentifier The identifier for the guardrail.
       */
      override fun guardrailIdentifier(guardrailIdentifier: String) {
        cdkBuilder.guardrailIdentifier(guardrailIdentifier)
      }

      /**
       * @param guardrailVersion The version of the guardrail.
       */
      override fun guardrailVersion(guardrailVersion: String) {
        cdkBuilder.guardrailVersion(guardrailVersion)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty,
    ) : CdkObject(cdkObject),
        GuardrailConfigurationProperty {
      /**
       * The identifier for the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-guardrailconfiguration.html#cfn-bedrock-agent-guardrailconfiguration-guardrailidentifier)
       */
      override fun guardrailIdentifier(): String? = unwrap(this).getGuardrailIdentifier()

      /**
       * The version of the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-guardrailconfiguration.html#cfn-bedrock-agent-guardrailconfiguration-guardrailversion)
       */
      override fun guardrailVersion(): String? = unwrap(this).getGuardrailVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty):
          GuardrailConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.GuardrailConfigurationProperty
    }
  }

  /**
   * Base inference parameters to pass to a model in a call to
   * [Converse](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html) or
   * [ConverseStream](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html)
   * . For more information, see [Inference parameters for foundation
   * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
   *
   * If you need to pass additional parameters that the model supports, use the
   * `additionalModelRequestFields` request field in the call to `Converse` or `ConverseStream` . For
   * more information, see [Model
   * parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * InferenceConfigurationProperty inferenceConfigurationProperty =
   * InferenceConfigurationProperty.builder()
   * .maximumLength(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html)
   */
  public interface InferenceConfigurationProperty {
    /**
     * The maximum number of tokens allowed in the generated response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-maximumlength)
     */
    public fun maximumLength(): Number? = unwrap(this).getMaximumLength()

    /**
     * A list of stop sequences.
     *
     * A stop sequence is a sequence of characters that causes the model to stop generating the
     * response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * The likelihood of the model selecting higher-probability options while generating a response.
     *
     * A lower value makes the model more likely to choose higher-probability options, while a
     * higher value makes the model more likely to choose lower-probability options.
     *
     * The default value is the default value for the model that you are using. For more
     * information, see [Inference parameters for foundation
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * While generating a response, the model determines the probability of the following token at
     * each point of generation.
     *
     * The value that you set for `topK` is the number of most-likely candidates from which the
     * model chooses the next token in the sequence. For example, if you set `topK` to 50, the model
     * selects the next token from among the top 50 most likely choices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-topk)
     */
    public fun topK(): Number? = unwrap(this).getTopK()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * For example, if you choose a value of 0.8 for `topP` , the model selects from the top 80% of
     * the probability distribution of tokens that could be next in the sequence.
     *
     * The default value is the default value for the model that you are using. For more
     * information, see [Inference parameters for foundation
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-topp)
     */
    public fun topP(): Number? = unwrap(this).getTopP()

    /**
     * A builder for [InferenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumLength The maximum number of tokens allowed in the generated response.
       */
      public fun maximumLength(maximumLength: Number)

      /**
       * @param stopSequences A list of stop sequences.
       * A stop sequence is a sequence of characters that causes the model to stop generating the
       * response.
       */
      public fun stopSequences(stopSequences: List<String>)

      /**
       * @param stopSequences A list of stop sequences.
       * A stop sequence is a sequence of characters that causes the model to stop generating the
       * response.
       */
      public fun stopSequences(vararg stopSequences: String)

      /**
       * @param temperature The likelihood of the model selecting higher-probability options while
       * generating a response.
       * A lower value makes the model more likely to choose higher-probability options, while a
       * higher value makes the model more likely to choose lower-probability options.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun temperature(temperature: Number)

      /**
       * @param topK While generating a response, the model determines the probability of the
       * following token at each point of generation.
       * The value that you set for `topK` is the number of most-likely candidates from which the
       * model chooses the next token in the sequence. For example, if you set `topK` to 50, the model
       * selects the next token from among the top 50 most likely choices.
       */
      public fun topK(topK: Number)

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       * For example, if you choose a value of 0.8 for `topP` , the model selects from the top 80%
       * of the probability distribution of tokens that could be next in the sequence.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun topP(topP: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty.builder()

      /**
       * @param maximumLength The maximum number of tokens allowed in the generated response.
       */
      override fun maximumLength(maximumLength: Number) {
        cdkBuilder.maximumLength(maximumLength)
      }

      /**
       * @param stopSequences A list of stop sequences.
       * A stop sequence is a sequence of characters that causes the model to stop generating the
       * response.
       */
      override fun stopSequences(stopSequences: List<String>) {
        cdkBuilder.stopSequences(stopSequences)
      }

      /**
       * @param stopSequences A list of stop sequences.
       * A stop sequence is a sequence of characters that causes the model to stop generating the
       * response.
       */
      override fun stopSequences(vararg stopSequences: String): Unit =
          stopSequences(stopSequences.toList())

      /**
       * @param temperature The likelihood of the model selecting higher-probability options while
       * generating a response.
       * A lower value makes the model more likely to choose higher-probability options, while a
       * higher value makes the model more likely to choose lower-probability options.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun temperature(temperature: Number) {
        cdkBuilder.temperature(temperature)
      }

      /**
       * @param topK While generating a response, the model determines the probability of the
       * following token at each point of generation.
       * The value that you set for `topK` is the number of most-likely candidates from which the
       * model chooses the next token in the sequence. For example, if you set `topK` to 50, the model
       * selects the next token from among the top 50 most likely choices.
       */
      override fun topK(topK: Number) {
        cdkBuilder.topK(topK)
      }

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       * For example, if you choose a value of 0.8 for `topP` , the model selects from the top 80%
       * of the probability distribution of tokens that could be next in the sequence.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun topP(topP: Number) {
        cdkBuilder.topP(topP)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        InferenceConfigurationProperty {
      /**
       * The maximum number of tokens allowed in the generated response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-maximumlength)
       */
      override fun maximumLength(): Number? = unwrap(this).getMaximumLength()

      /**
       * A list of stop sequences.
       *
       * A stop sequence is a sequence of characters that causes the model to stop generating the
       * response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * The likelihood of the model selecting higher-probability options while generating a
       * response.
       *
       * A lower value makes the model more likely to choose higher-probability options, while a
       * higher value makes the model more likely to choose lower-probability options.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * While generating a response, the model determines the probability of the following token at
       * each point of generation.
       *
       * The value that you set for `topK` is the number of most-likely candidates from which the
       * model chooses the next token in the sequence. For example, if you set `topK` to 50, the model
       * selects the next token from among the top 50 most likely choices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-topk)
       */
      override fun topK(): Number? = unwrap(this).getTopK()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * For example, if you choose a value of 0.8 for `topP` , the model selects from the top 80%
       * of the probability distribution of tokens that could be next in the sequence.
       *
       * The default value is the default value for the model that you are using. For more
       * information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-inferenceconfiguration.html#cfn-bedrock-agent-inferenceconfiguration-topp)
       */
      override fun topP(): Number? = unwrap(this).getTopP()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty):
          InferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.InferenceConfigurationProperty
    }
  }

  /**
   * Details of the memory configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * MemoryConfigurationProperty memoryConfigurationProperty = MemoryConfigurationProperty.builder()
   * .enabledMemoryTypes(List.of("enabledMemoryTypes"))
   * .sessionSummaryConfiguration(SessionSummaryConfigurationProperty.builder()
   * .maxRecentSessions(123)
   * .build())
   * .storageDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html)
   */
  public interface MemoryConfigurationProperty {
    /**
     * The type of memory that is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-enabledmemorytypes)
     */
    public fun enabledMemoryTypes(): List<String> = unwrap(this).getEnabledMemoryTypes() ?:
        emptyList()

    /**
     * Contains the configuration for SESSION_SUMMARY memory type enabled for the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-sessionsummaryconfiguration)
     */
    public fun sessionSummaryConfiguration(): Any? = unwrap(this).getSessionSummaryConfiguration()

    /**
     * The number of days the agent is configured to retain the conversational context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-storagedays)
     */
    public fun storageDays(): Number? = unwrap(this).getStorageDays()

    /**
     * A builder for [MemoryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledMemoryTypes The type of memory that is stored.
       */
      public fun enabledMemoryTypes(enabledMemoryTypes: List<String>)

      /**
       * @param enabledMemoryTypes The type of memory that is stored.
       */
      public fun enabledMemoryTypes(vararg enabledMemoryTypes: String)

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      public fun sessionSummaryConfiguration(sessionSummaryConfiguration: IResolvable)

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      public
          fun sessionSummaryConfiguration(sessionSummaryConfiguration: SessionSummaryConfigurationProperty)

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b30a67153d051849457d51621726ad2fea5100972337e7a6d209e16b8137566e")
      public
          fun sessionSummaryConfiguration(sessionSummaryConfiguration: SessionSummaryConfigurationProperty.Builder.() -> Unit)

      /**
       * @param storageDays The number of days the agent is configured to retain the conversational
       * context.
       */
      public fun storageDays(storageDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty.builder()

      /**
       * @param enabledMemoryTypes The type of memory that is stored.
       */
      override fun enabledMemoryTypes(enabledMemoryTypes: List<String>) {
        cdkBuilder.enabledMemoryTypes(enabledMemoryTypes)
      }

      /**
       * @param enabledMemoryTypes The type of memory that is stored.
       */
      override fun enabledMemoryTypes(vararg enabledMemoryTypes: String): Unit =
          enabledMemoryTypes(enabledMemoryTypes.toList())

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      override fun sessionSummaryConfiguration(sessionSummaryConfiguration: IResolvable) {
        cdkBuilder.sessionSummaryConfiguration(sessionSummaryConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      override
          fun sessionSummaryConfiguration(sessionSummaryConfiguration: SessionSummaryConfigurationProperty) {
        cdkBuilder.sessionSummaryConfiguration(sessionSummaryConfiguration.let(SessionSummaryConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sessionSummaryConfiguration Contains the configuration for SESSION_SUMMARY memory
       * type enabled for the agent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b30a67153d051849457d51621726ad2fea5100972337e7a6d209e16b8137566e")
      override
          fun sessionSummaryConfiguration(sessionSummaryConfiguration: SessionSummaryConfigurationProperty.Builder.() -> Unit):
          Unit =
          sessionSummaryConfiguration(SessionSummaryConfigurationProperty(sessionSummaryConfiguration))

      /**
       * @param storageDays The number of days the agent is configured to retain the conversational
       * context.
       */
      override fun storageDays(storageDays: Number) {
        cdkBuilder.storageDays(storageDays)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty,
    ) : CdkObject(cdkObject),
        MemoryConfigurationProperty {
      /**
       * The type of memory that is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-enabledmemorytypes)
       */
      override fun enabledMemoryTypes(): List<String> = unwrap(this).getEnabledMemoryTypes() ?:
          emptyList()

      /**
       * Contains the configuration for SESSION_SUMMARY memory type enabled for the agent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-sessionsummaryconfiguration)
       */
      override fun sessionSummaryConfiguration(): Any? =
          unwrap(this).getSessionSummaryConfiguration()

      /**
       * The number of days the agent is configured to retain the conversational context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-memoryconfiguration.html#cfn-bedrock-agent-memoryconfiguration-storagedays)
       */
      override fun storageDays(): Number? = unwrap(this).getStorageDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty):
          MemoryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MemoryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.MemoryConfigurationProperty
    }
  }

  /**
   * The structure of the executor invoking the actions in custom orchestration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OrchestrationExecutorProperty orchestrationExecutorProperty =
   * OrchestrationExecutorProperty.builder()
   * .lambda("lambda")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-orchestrationexecutor.html)
   */
  public interface OrchestrationExecutorProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
     * carried out upon invoking the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-orchestrationexecutor.html#cfn-bedrock-agent-orchestrationexecutor-lambda)
     */
    public fun lambda(): String

    /**
     * A builder for [OrchestrationExecutorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambda The Amazon Resource Name (ARN) of the Lambda function containing the business
       * logic that is carried out upon invoking the action. 
       */
      public fun lambda(lambda: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty.builder()

      /**
       * @param lambda The Amazon Resource Name (ARN) of the Lambda function containing the business
       * logic that is carried out upon invoking the action. 
       */
      override fun lambda(lambda: String) {
        cdkBuilder.lambda(lambda)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty,
    ) : CdkObject(cdkObject),
        OrchestrationExecutorProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
       * carried out upon invoking the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-orchestrationexecutor.html#cfn-bedrock-agent-orchestrationexecutor-lambda)
       */
      override fun lambda(): String = unwrap(this).getLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrchestrationExecutorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty):
          OrchestrationExecutorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OrchestrationExecutorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrchestrationExecutorProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.OrchestrationExecutorProperty
    }
  }

  /**
   * Contains details about a parameter in a function for an action group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ParameterDetailProperty parameterDetailProperty = ParameterDetailProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .required(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html)
   */
  public interface ParameterDetailProperty {
    /**
     * A description of the parameter.
     *
     * Helps the foundation model determine how to elicit the parameters from the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether the parameter is required for the agent to complete the function for action group
     * invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-required)
     */
    public fun required(): Any? = unwrap(this).getRequired()

    /**
     * The data type of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-type)
     */
    public fun type(): String

    /**
     * A builder for [ParameterDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the parameter.
       * Helps the foundation model determine how to elicit the parameters from the user.
       */
      public fun description(description: String)

      /**
       * @param required Whether the parameter is required for the agent to complete the function
       * for action group invocation.
       */
      public fun required(required: Boolean)

      /**
       * @param required Whether the parameter is required for the agent to complete the function
       * for action group invocation.
       */
      public fun required(required: IResolvable)

      /**
       * @param type The data type of the parameter. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty.builder()

      /**
       * @param description A description of the parameter.
       * Helps the foundation model determine how to elicit the parameters from the user.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param required Whether the parameter is required for the agent to complete the function
       * for action group invocation.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required Whether the parameter is required for the agent to complete the function
       * for action group invocation.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type The data type of the parameter. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty,
    ) : CdkObject(cdkObject),
        ParameterDetailProperty {
      /**
       * A description of the parameter.
       *
       * Helps the foundation model determine how to elicit the parameters from the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Whether the parameter is required for the agent to complete the function for action group
       * invocation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()

      /**
       * The data type of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-parameterdetail.html#cfn-bedrock-agent-parameterdetail-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty):
          ParameterDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterDetailProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterDetailProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.ParameterDetailProperty
    }
  }

  /**
   * Contains configurations to override a prompt template in one part of an agent sequence.
   *
   * For more information, see [Advanced
   * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * PromptConfigurationProperty promptConfigurationProperty = PromptConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .basePromptTemplate("basePromptTemplate")
   * .foundationModel("foundationModel")
   * .inferenceConfiguration(InferenceConfigurationProperty.builder()
   * .maximumLength(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .parserMode("parserMode")
   * .promptCreationMode("promptCreationMode")
   * .promptState("promptState")
   * .promptType("promptType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html)
   */
  public interface PromptConfigurationProperty {
    /**
     * If the Converse or ConverseStream operations support the model,
     * `additionalModelRequestFields` contains additional inference parameters, beyond the base set of
     * inference parameters in the `inferenceConfiguration` field.
     *
     * For more information, see [Inference request parameters and response fields for foundation
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-additionalmodelrequestfields)
     */
    public fun additionalModelRequestFields(): Any? = unwrap(this).getAdditionalModelRequestFields()

    /**
     * Defines the prompt template with which to replace the default prompt template.
     *
     * You can use placeholder variables in the base prompt template to customize the prompt. For
     * more information, see [Prompt template placeholder
     * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) . For
     * more information, see [Configure the prompt
     * templates](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-baseprompttemplate)
     */
    public fun basePromptTemplate(): String? = unwrap(this).getBasePromptTemplate()

    /**
     * The agent's foundation model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-foundationmodel)
     */
    public fun foundationModel(): String? = unwrap(this).getFoundationModel()

    /**
     * Contains inference parameters to use when the agent invokes a foundation model in the part of
     * the agent sequence defined by the `promptType` .
     *
     * For more information, see [Inference parameters for foundation
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * Specifies whether to override the default parser Lambda function when parsing the raw
     * foundation model output in the part of the agent sequence defined by the `promptType` .
     *
     * If you set the field as `OVERRIDDEN` , the `overrideLambda` field in the
     * [PromptOverrideConfiguration](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html)
     * must be specified with the ARN of a Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-parsermode)
     */
    public fun parserMode(): String? = unwrap(this).getParserMode()

    /**
     * Specifies whether to override the default prompt template for this `promptType` .
     *
     * Set this value to `OVERRIDDEN` to use the prompt that you provide in the `basePromptTemplate`
     * . If you leave it as `DEFAULT` , the agent uses a default prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-promptcreationmode)
     */
    public fun promptCreationMode(): String? = unwrap(this).getPromptCreationMode()

    /**
     * Specifies whether to allow the inline agent to carry out the step specified in the
     * `promptType` .
     *
     * If you set this value to `DISABLED` , the agent skips that step. The default state for each
     * `promptType` is as follows.
     *
     * * `PRE_PROCESSING` – `ENABLED`
     * * `ORCHESTRATION` – `ENABLED`
     * * `KNOWLEDGE_BASE_RESPONSE_GENERATION` – `ENABLED`
     * * `POST_PROCESSING` – `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-promptstate)
     */
    public fun promptState(): String? = unwrap(this).getPromptState()

    /**
     * The step in the agent sequence that this prompt configuration applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-prompttype)
     */
    public fun promptType(): String? = unwrap(this).getPromptType()

    /**
     * A builder for [PromptConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalModelRequestFields If the Converse or ConverseStream operations support
       * the model, `additionalModelRequestFields` contains additional inference parameters, beyond the
       * base set of inference parameters in the `inferenceConfiguration` field.
       * For more information, see [Inference request parameters and response fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun additionalModelRequestFields(additionalModelRequestFields: Any)

      /**
       * @param basePromptTemplate Defines the prompt template with which to replace the default
       * prompt template.
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       * For more information, see [Configure the prompt
       * templates](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html)
       * .
       */
      public fun basePromptTemplate(basePromptTemplate: String)

      /**
       * @param foundationModel The agent's foundation model.
       */
      public fun foundationModel(foundationModel: String)

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun inferenceConfiguration(inferenceConfiguration: InferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28f92ae04d5c07417a391b6f4fa805cd0010eb598952bdd757f82759d5dbe953")
      public
          fun inferenceConfiguration(inferenceConfiguration: InferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parserMode Specifies whether to override the default parser Lambda function when
       * parsing the raw foundation model output in the part of the agent sequence defined by the
       * `promptType` .
       * If you set the field as `OVERRIDDEN` , the `overrideLambda` field in the
       * [PromptOverrideConfiguration](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html)
       * must be specified with the ARN of a Lambda function.
       */
      public fun parserMode(parserMode: String)

      /**
       * @param promptCreationMode Specifies whether to override the default prompt template for
       * this `promptType` .
       * Set this value to `OVERRIDDEN` to use the prompt that you provide in the
       * `basePromptTemplate` . If you leave it as `DEFAULT` , the agent uses a default prompt
       * template.
       */
      public fun promptCreationMode(promptCreationMode: String)

      /**
       * @param promptState Specifies whether to allow the inline agent to carry out the step
       * specified in the `promptType` .
       * If you set this value to `DISABLED` , the agent skips that step. The default state for each
       * `promptType` is as follows.
       *
       * * `PRE_PROCESSING` – `ENABLED`
       * * `ORCHESTRATION` – `ENABLED`
       * * `KNOWLEDGE_BASE_RESPONSE_GENERATION` – `ENABLED`
       * * `POST_PROCESSING` – `DISABLED`
       */
      public fun promptState(promptState: String)

      /**
       * @param promptType The step in the agent sequence that this prompt configuration applies to.
       */
      public fun promptType(promptType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty.builder()

      /**
       * @param additionalModelRequestFields If the Converse or ConverseStream operations support
       * the model, `additionalModelRequestFields` contains additional inference parameters, beyond the
       * base set of inference parameters in the `inferenceConfiguration` field.
       * For more information, see [Inference request parameters and response fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun additionalModelRequestFields(additionalModelRequestFields: Any) {
        cdkBuilder.additionalModelRequestFields(additionalModelRequestFields)
      }

      /**
       * @param basePromptTemplate Defines the prompt template with which to replace the default
       * prompt template.
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       * For more information, see [Configure the prompt
       * templates](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html)
       * .
       */
      override fun basePromptTemplate(basePromptTemplate: String) {
        cdkBuilder.basePromptTemplate(basePromptTemplate)
      }

      /**
       * @param foundationModel The agent's foundation model.
       */
      override fun foundationModel(foundationModel: String) {
        cdkBuilder.foundationModel(foundationModel)
      }

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun inferenceConfiguration(inferenceConfiguration: InferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(InferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference parameters to use when the agent invokes a
       * foundation model in the part of the agent sequence defined by the `promptType` .
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28f92ae04d5c07417a391b6f4fa805cd0010eb598952bdd757f82759d5dbe953")
      override
          fun inferenceConfiguration(inferenceConfiguration: InferenceConfigurationProperty.Builder.() -> Unit):
          Unit = inferenceConfiguration(InferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param parserMode Specifies whether to override the default parser Lambda function when
       * parsing the raw foundation model output in the part of the agent sequence defined by the
       * `promptType` .
       * If you set the field as `OVERRIDDEN` , the `overrideLambda` field in the
       * [PromptOverrideConfiguration](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html)
       * must be specified with the ARN of a Lambda function.
       */
      override fun parserMode(parserMode: String) {
        cdkBuilder.parserMode(parserMode)
      }

      /**
       * @param promptCreationMode Specifies whether to override the default prompt template for
       * this `promptType` .
       * Set this value to `OVERRIDDEN` to use the prompt that you provide in the
       * `basePromptTemplate` . If you leave it as `DEFAULT` , the agent uses a default prompt
       * template.
       */
      override fun promptCreationMode(promptCreationMode: String) {
        cdkBuilder.promptCreationMode(promptCreationMode)
      }

      /**
       * @param promptState Specifies whether to allow the inline agent to carry out the step
       * specified in the `promptType` .
       * If you set this value to `DISABLED` , the agent skips that step. The default state for each
       * `promptType` is as follows.
       *
       * * `PRE_PROCESSING` – `ENABLED`
       * * `ORCHESTRATION` – `ENABLED`
       * * `KNOWLEDGE_BASE_RESPONSE_GENERATION` – `ENABLED`
       * * `POST_PROCESSING` – `DISABLED`
       */
      override fun promptState(promptState: String) {
        cdkBuilder.promptState(promptState)
      }

      /**
       * @param promptType The step in the agent sequence that this prompt configuration applies to.
       */
      override fun promptType(promptType: String) {
        cdkBuilder.promptType(promptType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptConfigurationProperty {
      /**
       * If the Converse or ConverseStream operations support the model,
       * `additionalModelRequestFields` contains additional inference parameters, beyond the base set
       * of inference parameters in the `inferenceConfiguration` field.
       *
       * For more information, see [Inference request parameters and response fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-additionalmodelrequestfields)
       */
      override fun additionalModelRequestFields(): Any? =
          unwrap(this).getAdditionalModelRequestFields()

      /**
       * Defines the prompt template with which to replace the default prompt template.
       *
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       * For more information, see [Configure the prompt
       * templates](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-baseprompttemplate)
       */
      override fun basePromptTemplate(): String? = unwrap(this).getBasePromptTemplate()

      /**
       * The agent's foundation model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-foundationmodel)
       */
      override fun foundationModel(): String? = unwrap(this).getFoundationModel()

      /**
       * Contains inference parameters to use when the agent invokes a foundation model in the part
       * of the agent sequence defined by the `promptType` .
       *
       * For more information, see [Inference parameters for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * Specifies whether to override the default parser Lambda function when parsing the raw
       * foundation model output in the part of the agent sequence defined by the `promptType` .
       *
       * If you set the field as `OVERRIDDEN` , the `overrideLambda` field in the
       * [PromptOverrideConfiguration](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html)
       * must be specified with the ARN of a Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-parsermode)
       */
      override fun parserMode(): String? = unwrap(this).getParserMode()

      /**
       * Specifies whether to override the default prompt template for this `promptType` .
       *
       * Set this value to `OVERRIDDEN` to use the prompt that you provide in the
       * `basePromptTemplate` . If you leave it as `DEFAULT` , the agent uses a default prompt
       * template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-promptcreationmode)
       */
      override fun promptCreationMode(): String? = unwrap(this).getPromptCreationMode()

      /**
       * Specifies whether to allow the inline agent to carry out the step specified in the
       * `promptType` .
       *
       * If you set this value to `DISABLED` , the agent skips that step. The default state for each
       * `promptType` is as follows.
       *
       * * `PRE_PROCESSING` – `ENABLED`
       * * `ORCHESTRATION` – `ENABLED`
       * * `KNOWLEDGE_BASE_RESPONSE_GENERATION` – `ENABLED`
       * * `POST_PROCESSING` – `DISABLED`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-promptstate)
       */
      override fun promptState(): String? = unwrap(this).getPromptState()

      /**
       * The step in the agent sequence that this prompt configuration applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-prompttype)
       */
      override fun promptType(): String? = unwrap(this).getPromptType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty):
          PromptConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptConfigurationProperty
    }
  }

  /**
   * Contains configurations to override prompts in different parts of an agent sequence.
   *
   * For more information, see [Advanced
   * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * PromptOverrideConfigurationProperty promptOverrideConfigurationProperty =
   * PromptOverrideConfigurationProperty.builder()
   * .promptConfigurations(List.of(PromptConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .basePromptTemplate("basePromptTemplate")
   * .foundationModel("foundationModel")
   * .inferenceConfiguration(InferenceConfigurationProperty.builder()
   * .maximumLength(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .parserMode("parserMode")
   * .promptCreationMode("promptCreationMode")
   * .promptState("promptState")
   * .promptType("promptType")
   * .build()))
   * // the properties below are optional
   * .overrideLambda("overrideLambda")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptoverrideconfiguration.html)
   */
  public interface PromptOverrideConfigurationProperty {
    /**
     * The ARN of the Lambda function to use when parsing the raw foundation model output in parts
     * of the agent sequence.
     *
     * If you specify this field, at least one of the `promptConfigurations` must contain a
     * `parserMode` value that is set to `OVERRIDDEN` . For more information, see [Parser Lambda
     * function in Amazon Bedrock
     * Agents](https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptoverrideconfiguration.html#cfn-bedrock-agent-promptoverrideconfiguration-overridelambda)
     */
    public fun overrideLambda(): String? = unwrap(this).getOverrideLambda()

    /**
     * Contains configurations to override a prompt template in one part of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptoverrideconfiguration.html#cfn-bedrock-agent-promptoverrideconfiguration-promptconfigurations)
     */
    public fun promptConfigurations(): Any

    /**
     * A builder for [PromptOverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overrideLambda The ARN of the Lambda function to use when parsing the raw foundation
       * model output in parts of the agent sequence.
       * If you specify this field, at least one of the `promptConfigurations` must contain a
       * `parserMode` value that is set to `OVERRIDDEN` . For more information, see [Parser Lambda
       * function in Amazon Bedrock
       * Agents](https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html) .
       */
      public fun overrideLambda(overrideLambda: String)

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      public fun promptConfigurations(promptConfigurations: IResolvable)

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      public fun promptConfigurations(promptConfigurations: List<Any>)

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      public fun promptConfigurations(vararg promptConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty.builder()

      /**
       * @param overrideLambda The ARN of the Lambda function to use when parsing the raw foundation
       * model output in parts of the agent sequence.
       * If you specify this field, at least one of the `promptConfigurations` must contain a
       * `parserMode` value that is set to `OVERRIDDEN` . For more information, see [Parser Lambda
       * function in Amazon Bedrock
       * Agents](https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html) .
       */
      override fun overrideLambda(overrideLambda: String) {
        cdkBuilder.overrideLambda(overrideLambda)
      }

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      override fun promptConfigurations(promptConfigurations: IResolvable) {
        cdkBuilder.promptConfigurations(promptConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      override fun promptConfigurations(promptConfigurations: List<Any>) {
        cdkBuilder.promptConfigurations(promptConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param promptConfigurations Contains configurations to override a prompt template in one
       * part of an agent sequence. 
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       */
      override fun promptConfigurations(vararg promptConfigurations: Any): Unit =
          promptConfigurations(promptConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptOverrideConfigurationProperty {
      /**
       * The ARN of the Lambda function to use when parsing the raw foundation model output in parts
       * of the agent sequence.
       *
       * If you specify this field, at least one of the `promptConfigurations` must contain a
       * `parserMode` value that is set to `OVERRIDDEN` . For more information, see [Parser Lambda
       * function in Amazon Bedrock
       * Agents](https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptoverrideconfiguration.html#cfn-bedrock-agent-promptoverrideconfiguration-overridelambda)
       */
      override fun overrideLambda(): String? = unwrap(this).getOverrideLambda()

      /**
       * Contains configurations to override a prompt template in one part of an agent sequence.
       *
       * For more information, see [Advanced
       * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptoverrideconfiguration.html#cfn-bedrock-agent-promptoverrideconfiguration-promptconfigurations)
       */
      override fun promptConfigurations(): Any = unwrap(this).getPromptConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptOverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty):
          PromptOverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptOverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptOverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.PromptOverrideConfigurationProperty
    }
  }

  /**
   * The identifier information for an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * S3IdentifierProperty s3IdentifierProperty = S3IdentifierProperty.builder()
   * .s3BucketName("s3BucketName")
   * .s3ObjectKey("s3ObjectKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html)
   */
  public interface S3IdentifierProperty {
    /**
     * The name of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html#cfn-bedrock-agent-s3identifier-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * The S3 object key for the S3 resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html#cfn-bedrock-agent-s3identifier-s3objectkey)
     */
    public fun s3ObjectKey(): String? = unwrap(this).getS3ObjectKey()

    /**
     * A builder for [S3IdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3BucketName The name of the S3 bucket.
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3ObjectKey The S3 object key for the S3 resource.
       */
      public fun s3ObjectKey(s3ObjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty.builder()

      /**
       * @param s3BucketName The name of the S3 bucket.
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3ObjectKey The S3 object key for the S3 resource.
       */
      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty,
    ) : CdkObject(cdkObject),
        S3IdentifierProperty {
      /**
       * The name of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html#cfn-bedrock-agent-s3identifier-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * The S3 object key for the S3 resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html#cfn-bedrock-agent-s3identifier-s3objectkey)
       */
      override fun s3ObjectKey(): String? = unwrap(this).getS3ObjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3IdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty):
          S3IdentifierProperty = CdkObjectWrappers.wrap(cdkObject) as? S3IdentifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3IdentifierProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty
    }
  }

  /**
   * Configuration for SESSION_SUMMARY memory type enabled for the agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SessionSummaryConfigurationProperty sessionSummaryConfigurationProperty =
   * SessionSummaryConfigurationProperty.builder()
   * .maxRecentSessions(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-sessionsummaryconfiguration.html)
   */
  public interface SessionSummaryConfigurationProperty {
    /**
     * Maximum number of recent session summaries to include in the agent's prompt context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-sessionsummaryconfiguration.html#cfn-bedrock-agent-sessionsummaryconfiguration-maxrecentsessions)
     */
    public fun maxRecentSessions(): Number? = unwrap(this).getMaxRecentSessions()

    /**
     * A builder for [SessionSummaryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxRecentSessions Maximum number of recent session summaries to include in the
       * agent's prompt context.
       */
      public fun maxRecentSessions(maxRecentSessions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty.builder()

      /**
       * @param maxRecentSessions Maximum number of recent session summaries to include in the
       * agent's prompt context.
       */
      override fun maxRecentSessions(maxRecentSessions: Number) {
        cdkBuilder.maxRecentSessions(maxRecentSessions)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty,
    ) : CdkObject(cdkObject),
        SessionSummaryConfigurationProperty {
      /**
       * Maximum number of recent session summaries to include in the agent's prompt context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-sessionsummaryconfiguration.html#cfn-bedrock-agent-sessionsummaryconfiguration-maxrecentsessions)
       */
      override fun maxRecentSessions(): Number? = unwrap(this).getMaxRecentSessions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SessionSummaryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty):
          SessionSummaryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SessionSummaryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionSummaryConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgent.SessionSummaryConfigurationProperty
    }
  }
}
