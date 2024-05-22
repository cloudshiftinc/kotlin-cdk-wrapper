@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnAgent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnAgentProps cfnAgentProps = CfnAgentProps.builder()
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
public interface CfnAgentProps {
  /**
   * The action groups that belong to an agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
   */
  public fun actionGroups(): Any? = unwrap(this).getActionGroups()

  /**
   * The name of the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentname)
   */
  public fun agentName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentresourcerolearn)
   */
  public fun agentResourceRoleArn(): String? = unwrap(this).getAgentResourceRoleArn()

  /**
   * Specifies whether to automatically update the `DRAFT` version of the agent after making changes
   * to the agent.
   *
   * The `DRAFT` version can be continually iterated upon during internal development. By default,
   * this value is `false` .
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-autoprepare)
   */
  public fun autoPrepare(): Any? = unwrap(this).getAutoPrepare()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customerencryptionkeyarn)
   */
  public fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The description of the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The foundation model used for orchestration by the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-foundationmodel)
   */
  public fun foundationModel(): String? = unwrap(this).getFoundationModel()

  /**
   * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
   * with the agent.
   *
   * A user interaction remains active for the amount of time specified. If no conversation occurs
   * during this time, the session expires and Amazon Bedrock deletes any data provided before the
   * timeout.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-idlesessionttlinseconds)
   */
  public fun idleSessionTtlInSeconds(): Number? = unwrap(this).getIdleSessionTtlInSeconds()

  /**
   * Instructions that tell the agent what it should do and how it should interact with users.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-instruction)
   */
  public fun instruction(): String? = unwrap(this).getInstruction()

  /**
   * The knowledge bases associated with the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
   */
  public fun knowledgeBases(): Any? = unwrap(this).getKnowledgeBases()

  /**
   * Contains configurations to override prompt templates in different parts of an agent sequence.
   *
   * For more information, see [Advanced
   * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
   */
  public fun promptOverrideConfiguration(): Any? = unwrap(this).getPromptOverrideConfiguration()

  /**
   * Specifies whether to delete the resource even if it's in use.
   *
   * By default, this value is `false` .
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
   */
  public fun skipResourceInUseCheckOnDelete(): Any? =
      unwrap(this).getSkipResourceInUseCheckOnDelete()

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
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A map of tag keys and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
   */
  public fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()

  /**
   * A builder for [CfnAgentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    public fun actionGroups(actionGroups: IResolvable)

    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    public fun actionGroups(actionGroups: List<Any>)

    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    public fun actionGroups(vararg actionGroups: Any)

    /**
     * @param agentName The name of the agent. 
     */
    public fun agentName(agentName: String)

    /**
     * @param agentResourceRoleArn The Amazon Resource Name (ARN) of the IAM role with permissions
     * to invoke API operations on the agent.
     */
    public fun agentResourceRoleArn(agentResourceRoleArn: String)

    /**
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent.
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     */
    public fun autoPrepare(autoPrepare: Boolean)

    /**
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent.
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     */
    public fun autoPrepare(autoPrepare: IResolvable)

    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that
     * encrypts the agent.
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * @param description The description of the agent.
     */
    public fun description(description: String)

    /**
     * @param foundationModel The foundation model used for orchestration by the agent.
     */
    public fun foundationModel(foundationModel: String)

    /**
     * @param idleSessionTtlInSeconds The number of seconds for which Amazon Bedrock keeps
     * information about a user's conversation with the agent.
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Bedrock deletes any data provided before the
     * timeout.
     */
    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    /**
     * @param instruction Instructions that tell the agent what it should do and how it should
     * interact with users.
     */
    public fun instruction(instruction: String)

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    public fun knowledgeBases(knowledgeBases: IResolvable)

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    public fun knowledgeBases(knowledgeBases: List<Any>)

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    public fun knowledgeBases(vararg knowledgeBases: Any)

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    public fun promptOverrideConfiguration(promptOverrideConfiguration: IResolvable)

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    public
        fun promptOverrideConfiguration(promptOverrideConfiguration: CfnAgent.PromptOverrideConfigurationProperty)

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c30767a4aa8ca0670c9af8bd2cf590dfe41b26e0dc9d860f546007a052d4812f")
    public
        fun promptOverrideConfiguration(promptOverrideConfiguration: CfnAgent.PromptOverrideConfigurationProperty.Builder.() -> Unit)

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
     * @param testAliasTags A map of tag keys and values.
     */
    public fun testAliasTags(testAliasTags: IResolvable)

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    public fun testAliasTags(testAliasTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnAgentProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnAgentProps.builder()

    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    override fun actionGroups(actionGroups: IResolvable) {
      cdkBuilder.actionGroups(actionGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    override fun actionGroups(actionGroups: List<Any>) {
      cdkBuilder.actionGroups(actionGroups.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actionGroups The action groups that belong to an agent.
     */
    override fun actionGroups(vararg actionGroups: Any): Unit = actionGroups(actionGroups.toList())

    /**
     * @param agentName The name of the agent. 
     */
    override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

    /**
     * @param agentResourceRoleArn The Amazon Resource Name (ARN) of the IAM role with permissions
     * to invoke API operations on the agent.
     */
    override fun agentResourceRoleArn(agentResourceRoleArn: String) {
      cdkBuilder.agentResourceRoleArn(agentResourceRoleArn)
    }

    /**
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent.
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     */
    override fun autoPrepare(autoPrepare: Boolean) {
      cdkBuilder.autoPrepare(autoPrepare)
    }

    /**
     * @param autoPrepare Specifies whether to automatically update the `DRAFT` version of the agent
     * after making changes to the agent.
     * The `DRAFT` version can be continually iterated upon during internal development. By default,
     * this value is `false` .
     */
    override fun autoPrepare(autoPrepare: IResolvable) {
      cdkBuilder.autoPrepare(autoPrepare.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that
     * encrypts the agent.
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * @param description The description of the agent.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param foundationModel The foundation model used for orchestration by the agent.
     */
    override fun foundationModel(foundationModel: String) {
      cdkBuilder.foundationModel(foundationModel)
    }

    /**
     * @param idleSessionTtlInSeconds The number of seconds for which Amazon Bedrock keeps
     * information about a user's conversation with the agent.
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Bedrock deletes any data provided before the
     * timeout.
     */
    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    /**
     * @param instruction Instructions that tell the agent what it should do and how it should
     * interact with users.
     */
    override fun instruction(instruction: String) {
      cdkBuilder.instruction(instruction)
    }

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    override fun knowledgeBases(knowledgeBases: IResolvable) {
      cdkBuilder.knowledgeBases(knowledgeBases.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    override fun knowledgeBases(knowledgeBases: List<Any>) {
      cdkBuilder.knowledgeBases(knowledgeBases.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param knowledgeBases The knowledge bases associated with the agent.
     */
    override fun knowledgeBases(vararg knowledgeBases: Any): Unit =
        knowledgeBases(knowledgeBases.toList())

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    override fun promptOverrideConfiguration(promptOverrideConfiguration: IResolvable) {
      cdkBuilder.promptOverrideConfiguration(promptOverrideConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    override
        fun promptOverrideConfiguration(promptOverrideConfiguration: CfnAgent.PromptOverrideConfigurationProperty) {
      cdkBuilder.promptOverrideConfiguration(promptOverrideConfiguration.let(CfnAgent.PromptOverrideConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param promptOverrideConfiguration Contains configurations to override prompt templates in
     * different parts of an agent sequence.
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c30767a4aa8ca0670c9af8bd2cf590dfe41b26e0dc9d860f546007a052d4812f")
    override
        fun promptOverrideConfiguration(promptOverrideConfiguration: CfnAgent.PromptOverrideConfigurationProperty.Builder.() -> Unit):
        Unit =
        promptOverrideConfiguration(CfnAgent.PromptOverrideConfigurationProperty(promptOverrideConfiguration))

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
     * @param testAliasTags A map of tag keys and values.
     */
    override fun testAliasTags(testAliasTags: IResolvable) {
      cdkBuilder.testAliasTags(testAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    override fun testAliasTags(testAliasTags: Map<String, String>) {
      cdkBuilder.testAliasTags(testAliasTags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnAgentProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentProps,
  ) : CdkObject(cdkObject), CfnAgentProps {
    /**
     * The action groups that belong to an agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-actiongroups)
     */
    override fun actionGroups(): Any? = unwrap(this).getActionGroups()

    /**
     * The name of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentname)
     */
    override fun agentName(): String = unwrap(this).getAgentName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-agentresourcerolearn)
     */
    override fun agentResourceRoleArn(): String? = unwrap(this).getAgentResourceRoleArn()

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
     */
    override fun autoPrepare(): Any? = unwrap(this).getAutoPrepare()

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that encrypts the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-customerencryptionkeyarn)
     */
    override fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

    /**
     * The description of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The foundation model used for orchestration by the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-foundationmodel)
     */
    override fun foundationModel(): String? = unwrap(this).getFoundationModel()

    /**
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation
     * with the agent.
     *
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Bedrock deletes any data provided before the
     * timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-idlesessionttlinseconds)
     */
    override fun idleSessionTtlInSeconds(): Number? = unwrap(this).getIdleSessionTtlInSeconds()

    /**
     * Instructions that tell the agent what it should do and how it should interact with users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-instruction)
     */
    override fun instruction(): String? = unwrap(this).getInstruction()

    /**
     * The knowledge bases associated with the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-knowledgebases)
     */
    override fun knowledgeBases(): Any? = unwrap(this).getKnowledgeBases()

    /**
     * Contains configurations to override prompt templates in different parts of an agent sequence.
     *
     * For more information, see [Advanced
     * prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-promptoverrideconfiguration)
     */
    override fun promptOverrideConfiguration(): Any? = unwrap(this).getPromptOverrideConfiguration()

    /**
     * Specifies whether to delete the resource even if it's in use.
     *
     * By default, this value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-skipresourceinusecheckondelete)
     */
    override fun skipResourceInUseCheckOnDelete(): Any? =
        unwrap(this).getSkipResourceInUseCheckOnDelete()

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
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agent.html#cfn-bedrock-agent-testaliastags)
     */
    override fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentProps):
        CfnAgentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAgentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgentProps):
        software.amazon.awscdk.services.bedrock.CfnAgentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.bedrock.CfnAgentProps
  }
}
