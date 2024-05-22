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
 * CfnAgent cfnAgent = CfnAgent.Builder.create(this, "MyCfnAgent")
 * .agentName("agentName")
 * // the properties below are optional
 * .actionGroups(List.of(AgentActionGroupProperty.builder()
 * .actionGroupName("actionGroupName")
 * // the properties below are optional
 * .actionGroupExecutor(ActionGroupExecutorProperty.builder()
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
 * .parentActionGroupSignature("parentActionGroupSignature")
 * .skipResourceInUseCheckOnDelete(false)
 * .build()))
 * .agentResourceRoleArn("agentResourceRoleArn")
 * .autoPrepare(false)
 * .customerEncryptionKeyArn("customerEncryptionKeyArn")
 * .description("description")
 * .foundationModel("foundationModel")
 * .idleSessionTtlInSeconds(123)
 * .instruction("instruction")
 * .knowledgeBases(List.of(AgentKnowledgeBaseProperty.builder()
 * .description("description")
 * .knowledgeBaseId("knowledgeBaseId")
 * // the properties below are optional
 * .knowledgeBaseState("knowledgeBaseState")
 * .build()))
 * .promptOverrideConfiguration(PromptOverrideConfigurationProperty.builder()
 * .promptConfigurations(List.of(PromptConfigurationProperty.builder()
 * .basePromptTemplate("basePromptTemplate")
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
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
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
   * A map of tag keys and values.
   */
  public open fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()

  /**
   * A map of tag keys and values.
   */
  public open fun testAliasTags(`value`: IResolvable) {
    unwrap(this).setTestAliasTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A map of tag keys and values.
   */
  public open fun testAliasTags(`value`: Map<String, String>) {
    unwrap(this).setTestAliasTags(`value`)
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
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    public fun testAliasTags(testAliasTags: IResolvable)

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    public fun testAliasTags(testAliasTags: Map<String, String>)
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
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    override fun testAliasTags(testAliasTags: IResolvable) {
      cdkBuilder.testAliasTags(testAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    override fun testAliasTags(testAliasTags: Map<String, String>) {
      cdkBuilder.testAliasTags(testAliasTags)
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
   * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) . You can
   * either include the schema directly in the `payload` field or you can upload it to an S3 bucket and
   * specify the S3 bucket location in the `s3` field.
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
     * For more information, see [Action group OpenAPI
     * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-payload)
     */
    public fun payload(): String? = unwrap(this).getPayload()

    /**
     * Contains details about the S3 object containing the OpenAPI schema for the action group.
     *
     * For more information, see [Action group OpenAPI
     * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
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
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun payload(payload: String)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun s3(s3: S3IdentifierProperty)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
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
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun payload(payload: String) {
        cdkBuilder.payload(payload)
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun s3(s3: S3IdentifierProperty) {
        cdkBuilder.s3(s3.let(S3IdentifierProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for the action
       * group.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
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
    ) : CdkObject(cdkObject), APISchemaProperty {
      /**
       * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group.
       *
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-apischema.html#cfn-bedrock-agent-apischema-payload)
       */
      override fun payload(): String? = unwrap(this).getPayload()

      /**
       * Contains details about the S3 object containing the OpenAPI schema for the action group.
       *
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
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
   * upon invoking the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ActionGroupExecutorProperty actionGroupExecutorProperty = ActionGroupExecutorProperty.builder()
   * .lambda("lambda")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html)
   */
  public interface ActionGroupExecutorProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
     * carried out upon invoking the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-lambda)
     */
    public fun lambda(): String

    /**
     * A builder for [ActionGroupExecutorProperty]
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
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnAgent.ActionGroupExecutorProperty.builder()

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
    ) : CdkObject(cdkObject), ActionGroupExecutorProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
       * carried out upon invoking the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-actiongroupexecutor.html#cfn-bedrock-agent-actiongroupexecutor-lambda)
       */
      override fun lambda(): String = unwrap(this).getLambda()
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
   * Contains details about an action group.
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
     * carried out upon invoking the action.
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
     * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-apischema)
     */
    public fun apiSchema(): Any? = unwrap(this).getApiSchema()

    /**
     * The description of the action group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

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
       * the business logic that is carried out upon invoking the action.
       */
      public fun actionGroupExecutor(actionGroupExecutor: IResolvable)

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action.
       */
      public fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty)

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action.
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
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun apiSchema(apiSchema: IResolvable)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      public fun apiSchema(apiSchema: APISchemaProperty)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49a66ceb426740b8b0779f6110b585a64c809f1c0de64db0220e4424b031e9")
      public fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit)

      /**
       * @param description The description of the action group.
       */
      public fun description(description: String)

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
       * the business logic that is carried out upon invoking the action.
       */
      override fun actionGroupExecutor(actionGroupExecutor: IResolvable) {
        cdkBuilder.actionGroupExecutor(actionGroupExecutor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action.
       */
      override fun actionGroupExecutor(actionGroupExecutor: ActionGroupExecutorProperty) {
        cdkBuilder.actionGroupExecutor(actionGroupExecutor.let(ActionGroupExecutorProperty.Companion::unwrap))
      }

      /**
       * @param actionGroupExecutor The Amazon Resource Name (ARN) of the Lambda function containing
       * the business logic that is carried out upon invoking the action.
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
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun apiSchema(apiSchema: IResolvable) {
        cdkBuilder.apiSchema(apiSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      override fun apiSchema(apiSchema: APISchemaProperty) {
        cdkBuilder.apiSchema(apiSchema.let(APISchemaProperty.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema.
       * For more information, see [Action group OpenAPI
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49a66ceb426740b8b0779f6110b585a64c809f1c0de64db0220e4424b031e9")
      override fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit): Unit =
          apiSchema(APISchemaProperty(apiSchema))

      /**
       * @param description The description of the action group.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

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
    ) : CdkObject(cdkObject), AgentActionGroupProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is
       * carried out upon invoking the action.
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
       * schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-apischema)
       */
      override fun apiSchema(): Any? = unwrap(this).getApiSchema()

      /**
       * The description of the action group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-agentactiongroup.html#cfn-bedrock-agent-agentactiongroup-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

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
    ) : CdkObject(cdkObject), AgentKnowledgeBaseProperty {
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
   * Specifications about the inference parameters that were provided alongside the prompt.
   *
   * These are specified in the
   * [PromptOverrideConfiguration](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html)
   * object that was set when the agent was created or updated. For more information, see [Inference
   * parameters for foundation
   * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
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
     * While generating a response, the model determines the probability of the following token at
     * each point of generation.
     *
     * The value that you set for `Top P` determines the number of most-likely candidates from which
     * the model chooses the next token in the sequence. For example, if you set `topP` to 80, the
     * model only selects the next token from the top 80% of the probability distribution of next
     * tokens.
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
       * @param topP While generating a response, the model determines the probability of the
       * following token at each point of generation.
       * The value that you set for `Top P` determines the number of most-likely candidates from
       * which the model chooses the next token in the sequence. For example, if you set `topP` to 80,
       * the model only selects the next token from the top 80% of the probability distribution of next
       * tokens.
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
       * @param topP While generating a response, the model determines the probability of the
       * following token at each point of generation.
       * The value that you set for `Top P` determines the number of most-likely candidates from
       * which the model chooses the next token in the sequence. For example, if you set `topP` to 80,
       * the model only selects the next token from the top 80% of the probability distribution of next
       * tokens.
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
    ) : CdkObject(cdkObject), InferenceConfigurationProperty {
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
       * While generating a response, the model determines the probability of the following token at
       * each point of generation.
       *
       * The value that you set for `Top P` determines the number of most-likely candidates from
       * which the model chooses the next token in the sequence. For example, if you set `topP` to 80,
       * the model only selects the next token from the top 80% of the probability distribution of next
       * tokens.
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
   * PromptConfigurationProperty promptConfigurationProperty = PromptConfigurationProperty.builder()
   * .basePromptTemplate("basePromptTemplate")
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
     * Defines the prompt template with which to replace the default prompt template.
     *
     * You can use placeholder variables in the base prompt template to customize the prompt. For
     * more information, see [Prompt template placeholder
     * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-baseprompttemplate)
     */
    public fun basePromptTemplate(): String? = unwrap(this).getBasePromptTemplate()

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
     * If you set the field as `OVERRIDEN` , the `overrideLambda` field in the
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
     * Specifies whether to allow the agent to carry out the step specified in the `promptType` .
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
       * @param basePromptTemplate Defines the prompt template with which to replace the default
       * prompt template.
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       */
      public fun basePromptTemplate(basePromptTemplate: String)

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
       * If you set the field as `OVERRIDEN` , the `overrideLambda` field in the
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
       * @param promptState Specifies whether to allow the agent to carry out the step specified in
       * the `promptType` .
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
       * @param basePromptTemplate Defines the prompt template with which to replace the default
       * prompt template.
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       */
      override fun basePromptTemplate(basePromptTemplate: String) {
        cdkBuilder.basePromptTemplate(basePromptTemplate)
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
       * If you set the field as `OVERRIDEN` , the `overrideLambda` field in the
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
       * @param promptState Specifies whether to allow the agent to carry out the step specified in
       * the `promptType` .
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
    ) : CdkObject(cdkObject), PromptConfigurationProperty {
      /**
       * Defines the prompt template with which to replace the default prompt template.
       *
       * You can use placeholder variables in the base prompt template to customize the prompt. For
       * more information, see [Prompt template placeholder
       * variables](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-promptconfiguration.html#cfn-bedrock-agent-promptconfiguration-baseprompttemplate)
       */
      override fun basePromptTemplate(): String? = unwrap(this).getBasePromptTemplate()

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
       * If you set the field as `OVERRIDEN` , the `overrideLambda` field in the
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
       * Specifies whether to allow the agent to carry out the step specified in the `promptType` .
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
   * PromptOverrideConfigurationProperty promptOverrideConfigurationProperty =
   * PromptOverrideConfigurationProperty.builder()
   * .promptConfigurations(List.of(PromptConfigurationProperty.builder()
   * .basePromptTemplate("basePromptTemplate")
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
     * `parserMode` value that is set to `OVERRIDDEN` .
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
       * `parserMode` value that is set to `OVERRIDDEN` .
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
       * `parserMode` value that is set to `OVERRIDDEN` .
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
    ) : CdkObject(cdkObject), PromptOverrideConfigurationProperty {
      /**
       * The ARN of the Lambda function to use when parsing the raw foundation model output in parts
       * of the agent sequence.
       *
       * If you specify this field, at least one of the `promptConfigurations` must contain a
       * `parserMode` value that is set to `OVERRIDDEN` .
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
   * Contains information about the S3 object containing the resource.
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
     * The S3 object key containing the resource.
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
       * @param s3ObjectKey The S3 object key containing the resource.
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
       * @param s3ObjectKey The S3 object key containing the resource.
       */
      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgent.S3IdentifierProperty,
    ) : CdkObject(cdkObject), S3IdentifierProperty {
      /**
       * The name of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agent-s3identifier.html#cfn-bedrock-agent-s3identifier-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * The S3 object key containing the resource.
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
}
