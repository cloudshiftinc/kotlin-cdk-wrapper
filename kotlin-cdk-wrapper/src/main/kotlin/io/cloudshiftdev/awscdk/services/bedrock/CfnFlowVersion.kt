@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a version of the flow that you can deploy.
 *
 * For more information, see [Deploy a flow in Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html) in the Amazon
 * Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnFlowVersion cfnFlowVersion = CfnFlowVersion.Builder.create(this, "MyCfnFlowVersion")
 * .flowArn("flowArn")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html)
 */
public open class CfnFlowVersion(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowVersionProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnFlowVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowVersionProps(props)
  )

  /**
   * The time at the version was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the flow version is encrypted with.
   */
  public open fun attrCustomerEncryptionKeyArn(): String =
      unwrap(this).getAttrCustomerEncryptionKeyArn()

  /**
   * Flow definition.
   */
  public open fun attrDefinition(): IResolvable =
      unwrap(this).getAttrDefinition().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
   *
   * For more information, see [Create a service row for
   * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the Amazon
   * Bedrock User Guide.
   */
  public open fun attrExecutionRoleArn(): String = unwrap(this).getAttrExecutionRoleArn()

  /**
   * The unique identifier of the flow.
   */
  public open fun attrFlowId(): String = unwrap(this).getAttrFlowId()

  /**
   * The name of the flow.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The status of the flow.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The version of the flow.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * The description of the flow version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the flow version.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow that the version belongs to.
   */
  public open fun flowArn(): String = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow that the version belongs to.
   */
  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnFlowVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-description)
     * @param description The description of the flow version. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow that the version belongs to. 
     */
    public fun flowArn(flowArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlowVersion.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlowVersion.Builder.create(scope, id)

    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-description)
     * @param description The description of the flow version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow that the version belongs to. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnFlowVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion):
        CfnFlowVersion = CfnFlowVersion(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVersion):
        software.amazon.awscdk.services.bedrock.CfnFlowVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnFlowVersion
  }

  /**
   * Defines an agent node in your flow.
   *
   * You specify the agent to invoke at this point in the flow. For more information, see [Node
   * types in a flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the
   * Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentFlowNodeConfigurationProperty agentFlowNodeConfigurationProperty =
   * AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-agentflownodeconfiguration.html)
   */
  public interface AgentFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-agentflownodeconfiguration.html#cfn-bedrock-flowversion-agentflownodeconfiguration-agentaliasarn)
     */
    public fun agentAliasArn(): String

    /**
     * A builder for [AgentFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentAliasArn The Amazon Resource Name (ARN) of the alias of the agent to invoke. 
       */
      public fun agentAliasArn(agentAliasArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty.builder()

      /**
       * @param agentAliasArn The Amazon Resource Name (ARN) of the alias of the agent to invoke. 
       */
      override fun agentAliasArn(agentAliasArn: String) {
        cdkBuilder.agentAliasArn(agentAliasArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        AgentFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-agentflownodeconfiguration.html#cfn-bedrock-flowversion-agentflownodeconfiguration-agentaliasarn)
       */
      override fun agentAliasArn(): String = unwrap(this).getAgentAliasArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AgentFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty):
          AgentFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.AgentFlowNodeConfigurationProperty
    }
  }

  /**
   * Defines a condition node in your flow.
   *
   * You can specify conditions that determine which node comes next in the flow. For more
   * information, see [Node types in a
   * flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ConditionFlowNodeConfigurationProperty conditionFlowNodeConfigurationProperty =
   * ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-conditionflownodeconfiguration.html)
   */
  public interface ConditionFlowNodeConfigurationProperty {
    /**
     * An array of conditions.
     *
     * Each member contains the name of a condition and an expression that defines the condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-conditionflownodeconfiguration.html#cfn-bedrock-flowversion-conditionflownodeconfiguration-conditions)
     */
    public fun conditions(): Any

    /**
     * A builder for [ConditionFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(vararg conditions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty.builder()

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ConditionFlowNodeConfigurationProperty {
      /**
       * An array of conditions.
       *
       * Each member contains the name of a condition and an expression that defines the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-conditionflownodeconfiguration.html#cfn-bedrock-flowversion-conditionflownodeconfiguration-conditions)
       */
      override fun conditions(): Any = unwrap(this).getConditions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConditionFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty):
          ConditionFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.ConditionFlowNodeConfigurationProperty
    }
  }

  /**
   * Specifies a field to be used during the reranking process in a Knowledge Base vector search.
   *
   * This structure identifies metadata fields that should be considered when reordering search
   * results to improve relevance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FieldForRerankingProperty fieldForRerankingProperty = FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-fieldforreranking.html)
   */
  public interface FieldForRerankingProperty {
    /**
     * The name of the metadata field to be used during the reranking process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-fieldforreranking.html#cfn-bedrock-flowversion-fieldforreranking-fieldname)
     */
    public fun fieldName(): String

    /**
     * A builder for [FieldForRerankingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the metadata field to be used during the reranking process. 
       */
      public fun fieldName(fieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty.builder()

      /**
       * @param fieldName The name of the metadata field to be used during the reranking process. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty,
    ) : CdkObject(cdkObject),
        FieldForRerankingProperty {
      /**
       * The name of the metadata field to be used during the reranking process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-fieldforreranking.html#cfn-bedrock-flowversion-fieldforreranking-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldForRerankingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty):
          FieldForRerankingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FieldForRerankingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldForRerankingProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FieldForRerankingProperty
    }
  }

  /**
   * Defines a condition in the condition node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConditionProperty flowConditionProperty = FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowcondition.html)
   */
  public interface FlowConditionProperty {
    /**
     * Defines the condition.
     *
     * You must refer to at least one of the inputs in the condition. For more information, expand
     * the Condition node section in [Node types in prompt
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowcondition.html#cfn-bedrock-flowversion-flowcondition-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A name for the condition that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowcondition.html#cfn-bedrock-flowversion-flowcondition-name)
     */
    public fun name(): String

    /**
     * A builder for [FlowConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression Defines the condition.
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       */
      public fun expression(expression: String)

      /**
       * @param name A name for the condition that you can reference. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty.builder()

      /**
       * @param expression Defines the condition.
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param name A name for the condition that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty,
    ) : CdkObject(cdkObject),
        FlowConditionProperty {
      /**
       * Defines the condition.
       *
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowcondition.html#cfn-bedrock-flowversion-flowcondition-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A name for the condition that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowcondition.html#cfn-bedrock-flowversion-flowcondition-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty):
          FlowConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConditionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionProperty
    }
  }

  /**
   * The configuration of a connection between a condition node and another node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConditionalConnectionConfigurationProperty flowConditionalConnectionConfigurationProperty =
   * FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconditionalconnectionconfiguration.html)
   */
  public interface FlowConditionalConnectionConfigurationProperty {
    /**
     * The condition that triggers this connection.
     *
     * For more information about how to write conditions, see the *Condition* node type in the
     * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in the
     * Amazon Bedrock User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconditionalconnectionconfiguration.html#cfn-bedrock-flowversion-flowconditionalconnectionconfiguration-condition)
     */
    public fun condition(): String

    /**
     * A builder for [FlowConditionalConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition The condition that triggers this connection. 
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       */
      public fun condition(condition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty.builder()

      /**
       * @param condition The condition that triggers this connection. 
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowConditionalConnectionConfigurationProperty {
      /**
       * The condition that triggers this connection.
       *
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconditionalconnectionconfiguration.html#cfn-bedrock-flowversion-flowconditionalconnectionconfiguration-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowConditionalConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty):
          FlowConditionalConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowConditionalConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConditionalConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConditionalConnectionConfigurationProperty
    }
  }

  /**
   * The configuration of the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConnectionConfigurationProperty flowConnectionConfigurationProperty =
   * FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnectionconfiguration.html)
   */
  public interface FlowConnectionConfigurationProperty {
    /**
     * The configuration of a connection originating from a Condition node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnectionconfiguration.html#cfn-bedrock-flowversion-flowconnectionconfiguration-conditional)
     */
    public fun conditional(): Any? = unwrap(this).getConditional()

    /**
     * The configuration of a connection originating from a node that isn't a Condition node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnectionconfiguration.html#cfn-bedrock-flowversion-flowconnectionconfiguration-data)
     */
    public fun `data`(): Any? = unwrap(this).getData()

    /**
     * A builder for [FlowConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      public fun conditional(conditional: IResolvable)

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      public fun conditional(conditional: FlowConditionalConnectionConfigurationProperty)

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47211eebd84a71d189de5aa7ae5018e9e3dc67eb88568e70f20ee7e2df70b7b2")
      public
          fun conditional(conditional: FlowConditionalConnectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      public fun `data`(`data`: IResolvable)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      public fun `data`(`data`: FlowDataConnectionConfigurationProperty)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06cc2bc985378c886de9c86064872679df435665aa7171b3553899355d4563ec")
      public fun `data`(`data`: FlowDataConnectionConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty.builder()

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      override fun conditional(conditional: FlowConditionalConnectionConfigurationProperty) {
        cdkBuilder.conditional(conditional.let(FlowConditionalConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47211eebd84a71d189de5aa7ae5018e9e3dc67eb88568e70f20ee7e2df70b7b2")
      override
          fun conditional(conditional: FlowConditionalConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = conditional(FlowConditionalConnectionConfigurationProperty(conditional))

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      override fun `data`(`data`: IResolvable) {
        cdkBuilder.`data`(`data`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      override fun `data`(`data`: FlowDataConnectionConfigurationProperty) {
        cdkBuilder.`data`(`data`.let(FlowDataConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06cc2bc985378c886de9c86064872679df435665aa7171b3553899355d4563ec")
      override fun `data`(`data`: FlowDataConnectionConfigurationProperty.Builder.() -> Unit): Unit
          = `data`(FlowDataConnectionConfigurationProperty(`data`))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowConnectionConfigurationProperty {
      /**
       * The configuration of a connection originating from a Condition node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnectionconfiguration.html#cfn-bedrock-flowversion-flowconnectionconfiguration-conditional)
       */
      override fun conditional(): Any? = unwrap(this).getConditional()

      /**
       * The configuration of a connection originating from a node that isn't a Condition node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnectionconfiguration.html#cfn-bedrock-flowversion-flowconnectionconfiguration-data)
       */
      override fun `data`(): Any? = unwrap(this).getData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty):
          FlowConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionConfigurationProperty
    }
  }

  /**
   * Contains information about a connection between two nodes in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConnectionProperty flowConnectionProperty = FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html)
   */
  public interface FlowConnectionProperty {
    /**
     * The configuration of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * A name for the connection that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-name)
     */
    public fun name(): String

    /**
     * The node that the connection starts at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-source)
     */
    public fun source(): String

    /**
     * The node that the connection ends at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-target)
     */
    public fun target(): String

    /**
     * Whether the source node that the connection begins from is a condition node ( `Conditional` )
     * or not ( `Data` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowConnectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration The configuration of the connection.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration The configuration of the connection.
       */
      public fun configuration(configuration: FlowConnectionConfigurationProperty)

      /**
       * @param configuration The configuration of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f5bf8a4efcfdeba0234b124d7285ec87889d10c5c18df186b6ccf122a85eabb")
      public
          fun configuration(configuration: FlowConnectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name A name for the connection that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param source The node that the connection starts at. 
       */
      public fun source(source: String)

      /**
       * @param target The node that the connection ends at. 
       */
      public fun target(target: String)

      /**
       * @param type Whether the source node that the connection begins from is a condition node (
       * `Conditional` ) or not ( `Data` ). 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty.builder()

      /**
       * @param configuration The configuration of the connection.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configuration The configuration of the connection.
       */
      override fun configuration(configuration: FlowConnectionConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(FlowConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configuration The configuration of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f5bf8a4efcfdeba0234b124d7285ec87889d10c5c18df186b6ccf122a85eabb")
      override
          fun configuration(configuration: FlowConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = configuration(FlowConnectionConfigurationProperty(configuration))

      /**
       * @param name A name for the connection that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param source The node that the connection starts at. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The node that the connection ends at. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param type Whether the source node that the connection begins from is a condition node (
       * `Conditional` ) or not ( `Data` ). 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty,
    ) : CdkObject(cdkObject),
        FlowConnectionProperty {
      /**
       * The configuration of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * A name for the connection that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The node that the connection starts at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The node that the connection ends at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-target)
       */
      override fun target(): String = unwrap(this).getTarget()

      /**
       * Whether the source node that the connection begins from is a condition node ( `Conditional`
       * ) or not ( `Data` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowconnection.html#cfn-bedrock-flowversion-flowconnection-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowConnectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty):
          FlowConnectionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowConnectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConnectionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowConnectionProperty
    }
  }

  /**
   * The configuration of a connection originating from a node that isn't a Condition node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowDataConnectionConfigurationProperty flowDataConnectionConfigurationProperty =
   * FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdataconnectionconfiguration.html)
   */
  public interface FlowDataConnectionConfigurationProperty {
    /**
     * The name of the output in the source node that the connection begins from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdataconnectionconfiguration.html#cfn-bedrock-flowversion-flowdataconnectionconfiguration-sourceoutput)
     */
    public fun sourceOutput(): String

    /**
     * The name of the input in the target node that the connection ends at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdataconnectionconfiguration.html#cfn-bedrock-flowversion-flowdataconnectionconfiguration-targetinput)
     */
    public fun targetInput(): String

    /**
     * A builder for [FlowDataConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceOutput The name of the output in the source node that the connection begins
       * from. 
       */
      public fun sourceOutput(sourceOutput: String)

      /**
       * @param targetInput The name of the input in the target node that the connection ends at. 
       */
      public fun targetInput(targetInput: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty.builder()

      /**
       * @param sourceOutput The name of the output in the source node that the connection begins
       * from. 
       */
      override fun sourceOutput(sourceOutput: String) {
        cdkBuilder.sourceOutput(sourceOutput)
      }

      /**
       * @param targetInput The name of the input in the target node that the connection ends at. 
       */
      override fun targetInput(targetInput: String) {
        cdkBuilder.targetInput(targetInput)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowDataConnectionConfigurationProperty {
      /**
       * The name of the output in the source node that the connection begins from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdataconnectionconfiguration.html#cfn-bedrock-flowversion-flowdataconnectionconfiguration-sourceoutput)
       */
      override fun sourceOutput(): String = unwrap(this).getSourceOutput()

      /**
       * The name of the input in the target node that the connection ends at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdataconnectionconfiguration.html#cfn-bedrock-flowversion-flowdataconnectionconfiguration-targetinput)
       */
      override fun targetInput(): String = unwrap(this).getTargetInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowDataConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty):
          FlowDataConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowDataConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDataConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDataConnectionConfigurationProperty
    }
  }

  /**
   * The definition of the nodes and connections between nodes in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * Object collector;
   * FlowDefinitionProperty flowDefinitionProperty_;
   * Object input;
   * Object iterator;
   * Object loopInput;
   * Object output;
   * FlowDefinitionProperty flowDefinitionProperty = FlowDefinitionProperty.builder()
   * .connections(List.of(FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build()))
   * .nodes(List.of(FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .inlineCode(InlineCodeFlowNodeConfigurationProperty.builder()
   * .code("code")
   * .language("language")
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .modelId("modelId")
   * .numberOfResults(123)
   * .orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .rerankingConfiguration(VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build())
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .loop(LoopFlowNodeConfigurationProperty.builder()
   * .definition(flowDefinitionProperty_)
   * .build())
   * .loopController(LoopControllerFlowNodeConfigurationProperty.builder()
   * .continueCondition(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build())
   * // the properties below are optional
   * .maxIterations(123)
   * .build())
   * .loopInput(loopInput)
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build())
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdefinition.html)
   */
  public interface FlowDefinitionProperty {
    /**
     * An array of connection definitions in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdefinition.html#cfn-bedrock-flowversion-flowdefinition-connections)
     */
    public fun connections(): Any? = unwrap(this).getConnections()

    /**
     * An array of node definitions in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdefinition.html#cfn-bedrock-flowversion-flowdefinition-nodes)
     */
    public fun nodes(): Any? = unwrap(this).getNodes()

    /**
     * A builder for [FlowDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(connections: IResolvable)

      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(connections: List<Any>)

      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(vararg connections: Any)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(nodes: IResolvable)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(nodes: List<Any>)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(vararg nodes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty.builder()

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(connections: IResolvable) {
        cdkBuilder.connections(connections.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(connections: List<Any>) {
        cdkBuilder.connections(connections.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(vararg connections: Any): Unit = connections(connections.toList())

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(nodes: IResolvable) {
        cdkBuilder.nodes(nodes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(nodes: List<Any>) {
        cdkBuilder.nodes(nodes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(vararg nodes: Any): Unit = nodes(nodes.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty,
    ) : CdkObject(cdkObject),
        FlowDefinitionProperty {
      /**
       * An array of connection definitions in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdefinition.html#cfn-bedrock-flowversion-flowdefinition-connections)
       */
      override fun connections(): Any? = unwrap(this).getConnections()

      /**
       * An array of node definitions in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flowdefinition.html#cfn-bedrock-flowversion-flowdefinition-nodes)
       */
      override fun nodes(): Any? = unwrap(this).getNodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty):
          FlowDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowDefinitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDefinitionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowDefinitionProperty
    }
  }

  /**
   * Contains configurations for a node in your flow.
   *
   * For more information, see [Node types in a
   * flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * Object collector;
   * FlowNodeConfigurationProperty flowNodeConfigurationProperty_;
   * Object input;
   * Object iterator;
   * Object loopInput;
   * Object output;
   * FlowNodeConfigurationProperty flowNodeConfigurationProperty =
   * FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .inlineCode(InlineCodeFlowNodeConfigurationProperty.builder()
   * .code("code")
   * .language("language")
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .modelId("modelId")
   * .numberOfResults(123)
   * .orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .rerankingConfiguration(VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build())
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .loop(LoopFlowNodeConfigurationProperty.builder()
   * .definition(FlowDefinitionProperty.builder()
   * .connections(List.of(FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build()))
   * .nodes(List.of(FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(flowNodeConfigurationProperty_)
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build()))
   * .build())
   * .build())
   * .loopController(LoopControllerFlowNodeConfigurationProperty.builder()
   * .continueCondition(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build())
   * // the properties below are optional
   * .maxIterations(123)
   * .build())
   * .loopInput(loopInput)
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html)
   */
  public interface FlowNodeConfigurationProperty {
    /**
     * Contains configurations for an agent node in your flow.
     *
     * Invokes an alias of an agent and returns the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-agent)
     */
    public fun agent(): Any? = unwrap(this).getAgent()

    /**
     * Contains configurations for a collector node in your flow.
     *
     * Collects an iteration of inputs and consolidates them into an array of outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-collector)
     */
    public fun collector(): Any? = unwrap(this).getCollector()

    /**
     * Contains configurations for a condition node in your flow.
     *
     * Defines conditions that lead to different branches of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-condition)
     */
    public fun condition(): Any? = unwrap(this).getCondition()

    /**
     * Contains configurations for an inline code node in your flow.
     *
     * Inline code nodes let you write and execute code directly within your flow, enabling data
     * transformations, custom logic, and integrations without needing an external Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-inlinecode)
     */
    public fun inlineCode(): Any? = unwrap(this).getInlineCode()

    /**
     * Contains configurations for an input flow node in your flow.
     *
     * The first node in the flow. `inputs` can't be specified for this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-input)
     */
    public fun input(): Any? = unwrap(this).getInput()

    /**
     * Contains configurations for an iterator node in your flow.
     *
     * Takes an input that is an array and iteratively sends each item of the array as an output to
     * the following node. The size of the array is also returned in the output.
     *
     * The output flow node at the end of the flow iteration will return a response for each member
     * of the array. To return only one response, you can include a collector node downstream from the
     * iterator node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-iterator)
     */
    public fun iterator(): Any? = unwrap(this).getIterator()

    /**
     * Contains configurations for a knowledge base node in your flow.
     *
     * Queries a knowledge base and returns the retrieved results or generated response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-knowledgebase)
     */
    public fun knowledgeBase(): Any? = unwrap(this).getKnowledgeBase()

    /**
     * Contains configurations for a Lambda function node in your flow.
     *
     * Invokes an AWS Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-lambdafunction)
     */
    public fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

    /**
     * Contains configurations for a Lex node in your flow.
     *
     * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-lex)
     */
    public fun lex(): Any? = unwrap(this).getLex()

    /**
     * Contains configurations for a DoWhile loop in your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loop)
     */
    public fun loop(): Any? = unwrap(this).getLoop()

    /**
     * Contains controller node configurations for a DoWhile loop in your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loopcontroller)
     */
    public fun loopController(): Any? = unwrap(this).getLoopController()

    /**
     * Contains input node configurations for a DoWhile loop in your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loopinput)
     */
    public fun loopInput(): Any? = unwrap(this).getLoopInput()

    /**
     * Contains configurations for an output flow node in your flow.
     *
     * The last node in the flow. `outputs` can't be specified for this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-output)
     */
    public fun output(): Any? = unwrap(this).getOutput()

    /**
     * Contains configurations for a prompt node in your flow.
     *
     * Runs a prompt and generates the model response as the output. You can use a prompt from
     * Prompt management or you can configure one in this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-prompt)
     */
    public fun prompt(): Any? = unwrap(this).getPrompt()

    /**
     * Contains configurations for a retrieval node in your flow.
     *
     * Retrieves data from an Amazon S3 location and returns it as the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-retrieval)
     */
    public fun retrieval(): Any? = unwrap(this).getRetrieval()

    /**
     * Contains configurations for a storage node in your flow.
     *
     * Stores an input in an Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-storage)
     */
    public fun storage(): Any? = unwrap(this).getStorage()

    /**
     * A builder for [FlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      public fun agent(agent: IResolvable)

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      public fun agent(agent: AgentFlowNodeConfigurationProperty)

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad185bad7d4492d9a0da83ef091b3d9ae9c516c3760ae74d3ed7e539c12a9b5f")
      public fun agent(agent: AgentFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param collector Contains configurations for a collector node in your flow.
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       */
      public fun collector(collector: Any)

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      public fun condition(condition: ConditionFlowNodeConfigurationProperty)

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("045924595e2feaa22ecebc836af784b7107df129a1ad68829224b14dac702d71")
      public fun condition(condition: ConditionFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      public fun inlineCode(inlineCode: IResolvable)

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      public fun inlineCode(inlineCode: InlineCodeFlowNodeConfigurationProperty)

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0e23890896dea5b9504ea561b94a37154992c4213e865719d685b47bd5c30b6")
      public fun inlineCode(inlineCode: InlineCodeFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param input Contains configurations for an input flow node in your flow.
       * The first node in the flow. `inputs` can't be specified for this node.
       */
      public fun input(input: Any)

      /**
       * @param iterator Contains configurations for an iterator node in your flow.
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       */
      public fun iterator(iterator: Any)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      public fun knowledgeBase(knowledgeBase: IResolvable)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      public fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a46ba72807beb6a92072e9e98c7299a3eae731dd00a0b1abb52a11b00965ba")
      public
          fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      public fun lambdaFunction(lambdaFunction: IResolvable)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      public fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f225e8e35ab5a4e9dc83f68bbb7ebc88b77fdf8966ae182934d8e446fa08b1c")
      public
          fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      public fun lex(lex: IResolvable)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      public fun lex(lex: LexFlowNodeConfigurationProperty)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f277d79e4905009a0b1d2bd0b58733b58693aa4a7bfcb45cd6571bbb8ea6a239")
      public fun lex(lex: LexFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      public fun loop(loop: IResolvable)

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      public fun loop(loop: LoopFlowNodeConfigurationProperty)

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("229e185b72b45e4b78824155d40b7e60fac40bf0c226d7e0eb6372af06de5c0d")
      public fun loop(loop: LoopFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      public fun loopController(loopController: IResolvable)

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      public fun loopController(loopController: LoopControllerFlowNodeConfigurationProperty)

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("194138658a2b0f41bddfb161543ac583d5eb6ab6964d91e425a5c614ce791b6d")
      public
          fun loopController(loopController: LoopControllerFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param loopInput Contains input node configurations for a DoWhile loop in your flow.
       */
      public fun loopInput(loopInput: Any)

      /**
       * @param output Contains configurations for an output flow node in your flow.
       * The last node in the flow. `outputs` can't be specified for this node.
       */
      public fun output(output: Any)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      public fun prompt(prompt: IResolvable)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      public fun prompt(prompt: PromptFlowNodeConfigurationProperty)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("410aa0f0e87e018314ab13e103639d778006a51f5d6b8a9754f2f43f549dbea2")
      public fun prompt(prompt: PromptFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      public fun retrieval(retrieval: IResolvable)

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      public fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty)

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cb91628f1bbb2ee78a545ca90a7329489b44a4a63f55bba94c6a1f7308fc4c2")
      public fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      public fun storage(storage: IResolvable)

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      public fun storage(storage: StorageFlowNodeConfigurationProperty)

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985a38093a9ef306cc4cba876d38c795bd53922fae43404cad8274ed9c55ef76")
      public fun storage(storage: StorageFlowNodeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty.builder()

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      override fun agent(agent: IResolvable) {
        cdkBuilder.agent(agent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      override fun agent(agent: AgentFlowNodeConfigurationProperty) {
        cdkBuilder.agent(agent.let(AgentFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad185bad7d4492d9a0da83ef091b3d9ae9c516c3760ae74d3ed7e539c12a9b5f")
      override fun agent(agent: AgentFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          agent(AgentFlowNodeConfigurationProperty(agent))

      /**
       * @param collector Contains configurations for a collector node in your flow.
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       */
      override fun collector(collector: Any) {
        cdkBuilder.collector(collector)
      }

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      override fun condition(condition: ConditionFlowNodeConfigurationProperty) {
        cdkBuilder.condition(condition.let(ConditionFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param condition Contains configurations for a condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("045924595e2feaa22ecebc836af784b7107df129a1ad68829224b14dac702d71")
      override fun condition(condition: ConditionFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = condition(ConditionFlowNodeConfigurationProperty(condition))

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      override fun inlineCode(inlineCode: IResolvable) {
        cdkBuilder.inlineCode(inlineCode.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      override fun inlineCode(inlineCode: InlineCodeFlowNodeConfigurationProperty) {
        cdkBuilder.inlineCode(inlineCode.let(InlineCodeFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inlineCode Contains configurations for an inline code node in your flow.
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0e23890896dea5b9504ea561b94a37154992c4213e865719d685b47bd5c30b6")
      override
          fun inlineCode(inlineCode: InlineCodeFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = inlineCode(InlineCodeFlowNodeConfigurationProperty(inlineCode))

      /**
       * @param input Contains configurations for an input flow node in your flow.
       * The first node in the flow. `inputs` can't be specified for this node.
       */
      override fun input(input: Any) {
        cdkBuilder.input(input)
      }

      /**
       * @param iterator Contains configurations for an iterator node in your flow.
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       */
      override fun iterator(iterator: Any) {
        cdkBuilder.iterator(iterator)
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      override fun knowledgeBase(knowledgeBase: IResolvable) {
        cdkBuilder.knowledgeBase(knowledgeBase.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      override fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty) {
        cdkBuilder.knowledgeBase(knowledgeBase.let(KnowledgeBaseFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a46ba72807beb6a92072e9e98c7299a3eae731dd00a0b1abb52a11b00965ba")
      override
          fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty(knowledgeBase))

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      override fun lambdaFunction(lambdaFunction: IResolvable) {
        cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      override fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty) {
        cdkBuilder.lambdaFunction(lambdaFunction.let(LambdaFunctionFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f225e8e35ab5a4e9dc83f68bbb7ebc88b77fdf8966ae182934d8e446fa08b1c")
      override
          fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty(lambdaFunction))

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      override fun lex(lex: IResolvable) {
        cdkBuilder.lex(lex.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      override fun lex(lex: LexFlowNodeConfigurationProperty) {
        cdkBuilder.lex(lex.let(LexFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f277d79e4905009a0b1d2bd0b58733b58693aa4a7bfcb45cd6571bbb8ea6a239")
      override fun lex(lex: LexFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          lex(LexFlowNodeConfigurationProperty(lex))

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      override fun loop(loop: IResolvable) {
        cdkBuilder.loop(loop.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      override fun loop(loop: LoopFlowNodeConfigurationProperty) {
        cdkBuilder.loop(loop.let(LoopFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param loop Contains configurations for a DoWhile loop in your flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("229e185b72b45e4b78824155d40b7e60fac40bf0c226d7e0eb6372af06de5c0d")
      override fun loop(loop: LoopFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          loop(LoopFlowNodeConfigurationProperty(loop))

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      override fun loopController(loopController: IResolvable) {
        cdkBuilder.loopController(loopController.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      override fun loopController(loopController: LoopControllerFlowNodeConfigurationProperty) {
        cdkBuilder.loopController(loopController.let(LoopControllerFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param loopController Contains controller node configurations for a DoWhile loop in your
       * flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("194138658a2b0f41bddfb161543ac583d5eb6ab6964d91e425a5c614ce791b6d")
      override
          fun loopController(loopController: LoopControllerFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = loopController(LoopControllerFlowNodeConfigurationProperty(loopController))

      /**
       * @param loopInput Contains input node configurations for a DoWhile loop in your flow.
       */
      override fun loopInput(loopInput: Any) {
        cdkBuilder.loopInput(loopInput)
      }

      /**
       * @param output Contains configurations for an output flow node in your flow.
       * The last node in the flow. `outputs` can't be specified for this node.
       */
      override fun output(output: Any) {
        cdkBuilder.output(output)
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      override fun prompt(prompt: IResolvable) {
        cdkBuilder.prompt(prompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      override fun prompt(prompt: PromptFlowNodeConfigurationProperty) {
        cdkBuilder.prompt(prompt.let(PromptFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("410aa0f0e87e018314ab13e103639d778006a51f5d6b8a9754f2f43f549dbea2")
      override fun prompt(prompt: PromptFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          prompt(PromptFlowNodeConfigurationProperty(prompt))

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      override fun retrieval(retrieval: IResolvable) {
        cdkBuilder.retrieval(retrieval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      override fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty) {
        cdkBuilder.retrieval(retrieval.let(RetrievalFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param retrieval Contains configurations for a retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cb91628f1bbb2ee78a545ca90a7329489b44a4a63f55bba94c6a1f7308fc4c2")
      override fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = retrieval(RetrievalFlowNodeConfigurationProperty(retrieval))

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      override fun storage(storage: IResolvable) {
        cdkBuilder.storage(storage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      override fun storage(storage: StorageFlowNodeConfigurationProperty) {
        cdkBuilder.storage(storage.let(StorageFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param storage Contains configurations for a storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985a38093a9ef306cc4cba876d38c795bd53922fae43404cad8274ed9c55ef76")
      override fun storage(storage: StorageFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          storage(StorageFlowNodeConfigurationProperty(storage))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowNodeConfigurationProperty {
      /**
       * Contains configurations for an agent node in your flow.
       *
       * Invokes an alias of an agent and returns the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-agent)
       */
      override fun agent(): Any? = unwrap(this).getAgent()

      /**
       * Contains configurations for a collector node in your flow.
       *
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-collector)
       */
      override fun collector(): Any? = unwrap(this).getCollector()

      /**
       * Contains configurations for a condition node in your flow.
       *
       * Defines conditions that lead to different branches of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-condition)
       */
      override fun condition(): Any? = unwrap(this).getCondition()

      /**
       * Contains configurations for an inline code node in your flow.
       *
       * Inline code nodes let you write and execute code directly within your flow, enabling data
       * transformations, custom logic, and integrations without needing an external Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-inlinecode)
       */
      override fun inlineCode(): Any? = unwrap(this).getInlineCode()

      /**
       * Contains configurations for an input flow node in your flow.
       *
       * The first node in the flow. `inputs` can't be specified for this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-input)
       */
      override fun input(): Any? = unwrap(this).getInput()

      /**
       * Contains configurations for an iterator node in your flow.
       *
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-iterator)
       */
      override fun iterator(): Any? = unwrap(this).getIterator()

      /**
       * Contains configurations for a knowledge base node in your flow.
       *
       * Queries a knowledge base and returns the retrieved results or generated response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-knowledgebase)
       */
      override fun knowledgeBase(): Any? = unwrap(this).getKnowledgeBase()

      /**
       * Contains configurations for a Lambda function node in your flow.
       *
       * Invokes an AWS Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-lambdafunction)
       */
      override fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

      /**
       * Contains configurations for a Lex node in your flow.
       *
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-lex)
       */
      override fun lex(): Any? = unwrap(this).getLex()

      /**
       * Contains configurations for a DoWhile loop in your flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loop)
       */
      override fun loop(): Any? = unwrap(this).getLoop()

      /**
       * Contains controller node configurations for a DoWhile loop in your flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loopcontroller)
       */
      override fun loopController(): Any? = unwrap(this).getLoopController()

      /**
       * Contains input node configurations for a DoWhile loop in your flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-loopinput)
       */
      override fun loopInput(): Any? = unwrap(this).getLoopInput()

      /**
       * Contains configurations for an output flow node in your flow.
       *
       * The last node in the flow. `outputs` can't be specified for this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-output)
       */
      override fun output(): Any? = unwrap(this).getOutput()

      /**
       * Contains configurations for a prompt node in your flow.
       *
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-prompt)
       */
      override fun prompt(): Any? = unwrap(this).getPrompt()

      /**
       * Contains configurations for a retrieval node in your flow.
       *
       * Retrieves data from an Amazon S3 location and returns it as the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-retrieval)
       */
      override fun retrieval(): Any? = unwrap(this).getRetrieval()

      /**
       * Contains configurations for a storage node in your flow.
       *
       * Stores an input in an Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeconfiguration.html#cfn-bedrock-flowversion-flownodeconfiguration-storage)
       */
      override fun storage(): Any? = unwrap(this).getStorage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty):
          FlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for an input in an Amazon Bedrock Flows node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowNodeInputProperty flowNodeInputProperty = FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html)
   */
  public interface FlowNodeInputProperty {
    /**
     * An expression that formats the input for the node.
     *
     * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
     * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-expression)
     */
    public fun expression(): String

    /**
     * Specifies a name for the input that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-name)
     */
    public fun name(): String

    /**
     * Specifies the data type of the input.
     *
     * If the input doesn't match this type at runtime, a validation error will be thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression An expression that formats the input for the node. 
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       */
      public fun expression(expression: String)

      /**
       * @param name Specifies a name for the input that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param type Specifies the data type of the input. 
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty.builder()

      /**
       * @param expression An expression that formats the input for the node. 
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param name Specifies a name for the input that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Specifies the data type of the input. 
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty,
    ) : CdkObject(cdkObject),
        FlowNodeInputProperty {
      /**
       * An expression that formats the input for the node.
       *
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * Specifies a name for the input that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Specifies the data type of the input.
       *
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeinput.html#cfn-bedrock-flowversion-flownodeinput-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty):
          FlowNodeInputProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeInputProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeInputProperty
    }
  }

  /**
   * Contains configurations for an output from a node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowNodeOutputProperty flowNodeOutputProperty = FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeoutput.html)
   */
  public interface FlowNodeOutputProperty {
    /**
     * A name for the output that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeoutput.html#cfn-bedrock-flowversion-flownodeoutput-name)
     */
    public fun name(): String

    /**
     * The data type of the output.
     *
     * If the output doesn't match this type at runtime, a validation error will be thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeoutput.html#cfn-bedrock-flowversion-flownodeoutput-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name A name for the output that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param type The data type of the output. 
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty.builder()

      /**
       * @param name A name for the output that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The data type of the output. 
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty,
    ) : CdkObject(cdkObject),
        FlowNodeOutputProperty {
      /**
       * A name for the output that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeoutput.html#cfn-bedrock-flowversion-flownodeoutput-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The data type of the output.
       *
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownodeoutput.html#cfn-bedrock-flowversion-flownodeoutput-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty):
          FlowNodeOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeOutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeOutputProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeOutputProperty
    }
  }

  /**
   * Contains configurations about a node in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * Object collector;
   * FlowNodeProperty flowNodeProperty_;
   * Object input;
   * Object iterator;
   * Object loopInput;
   * Object output;
   * FlowNodeProperty flowNodeProperty = FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .inlineCode(InlineCodeFlowNodeConfigurationProperty.builder()
   * .code("code")
   * .language("language")
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .modelId("modelId")
   * .numberOfResults(123)
   * .orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .rerankingConfiguration(VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build())
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .loop(LoopFlowNodeConfigurationProperty.builder()
   * .definition(FlowDefinitionProperty.builder()
   * .connections(List.of(FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build()))
   * .nodes(List.of(flowNodeProperty_))
   * .build())
   * .build())
   * .loopController(LoopControllerFlowNodeConfigurationProperty.builder()
   * .continueCondition(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build())
   * // the properties below are optional
   * .maxIterations(123)
   * .build())
   * .loopInput(loopInput)
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build())
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html)
   */
  public interface FlowNodeProperty {
    /**
     * Contains configurations for the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * An array of objects, each of which contains information about an input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-inputs)
     */
    public fun inputs(): Any? = unwrap(this).getInputs()

    /**
     * A name for the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-name)
     */
    public fun name(): String

    /**
     * A list of objects, each of which contains information about an output from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-outputs)
     */
    public fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The type of node.
     *
     * This value must match the name of the key that you provide in the configuration you provide
     * in the `FlowNodeConfiguration` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration Contains configurations for the node.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration Contains configurations for the node.
       */
      public fun configuration(configuration: FlowNodeConfigurationProperty)

      /**
       * @param configuration Contains configurations for the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47645a2afa9076813f619515aa779065e5ee3b846d206cf4b605343592ae176d")
      public fun configuration(configuration: FlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(inputs: IResolvable)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(inputs: List<Any>)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(vararg inputs: Any)

      /**
       * @param name A name for the node. 
       */
      public fun name(name: String)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(outputs: IResolvable)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(outputs: List<Any>)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(vararg outputs: Any)

      /**
       * @param type The type of node. 
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty.builder()

      /**
       * @param configuration Contains configurations for the node.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configuration Contains configurations for the node.
       */
      override fun configuration(configuration: FlowNodeConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(FlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configuration Contains configurations for the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47645a2afa9076813f619515aa779065e5ee3b846d206cf4b605343592ae176d")
      override fun configuration(configuration: FlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = configuration(FlowNodeConfigurationProperty(configuration))

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(inputs: List<Any>) {
        cdkBuilder.inputs(inputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

      /**
       * @param name A name for the node. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(outputs: List<Any>) {
        cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

      /**
       * @param type The type of node. 
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty,
    ) : CdkObject(cdkObject),
        FlowNodeProperty {
      /**
       * Contains configurations for the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * An array of objects, each of which contains information about an input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-inputs)
       */
      override fun inputs(): Any? = unwrap(this).getInputs()

      /**
       * A name for the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A list of objects, each of which contains information about an output from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-outputs)
       */
      override fun outputs(): Any? = unwrap(this).getOutputs()

      /**
       * The type of node.
       *
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-flownode.html#cfn-bedrock-flowversion-flownode-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty):
          FlowNodeProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.FlowNodeProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-guardrailconfiguration.html)
   */
  public interface GuardrailConfigurationProperty {
    /**
     * The identifier for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-guardrailconfiguration.html#cfn-bedrock-flowversion-guardrailconfiguration-guardrailidentifier)
     */
    public fun guardrailIdentifier(): String? = unwrap(this).getGuardrailIdentifier()

    /**
     * The version of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-guardrailconfiguration.html#cfn-bedrock-flowversion-guardrailconfiguration-guardrailversion)
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
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty.builder()

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
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty,
    ) : CdkObject(cdkObject),
        GuardrailConfigurationProperty {
      /**
       * The identifier for the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-guardrailconfiguration.html#cfn-bedrock-flowversion-guardrailconfiguration-guardrailidentifier)
       */
      override fun guardrailIdentifier(): String? = unwrap(this).getGuardrailIdentifier()

      /**
       * The version of the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-guardrailconfiguration.html#cfn-bedrock-flowversion-guardrailconfiguration-guardrailversion)
       */
      override fun guardrailVersion(): String? = unwrap(this).getGuardrailVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty):
          GuardrailConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.GuardrailConfigurationProperty
    }
  }

  /**
   * Contains configurations for an inline code node in your flow.
   *
   * Inline code nodes let you write and execute code directly within your flow, enabling data
   * transformations, custom logic, and integrations without needing an external Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * InlineCodeFlowNodeConfigurationProperty inlineCodeFlowNodeConfigurationProperty =
   * InlineCodeFlowNodeConfigurationProperty.builder()
   * .code("code")
   * .language("language")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-inlinecodeflownodeconfiguration.html)
   */
  public interface InlineCodeFlowNodeConfigurationProperty {
    /**
     * The code that's executed in your inline code node.
     *
     * The code can access input data from previous nodes in the flow, perform operations on that
     * data, and produce output that can be used by other nodes in your flow.
     *
     * The code must be valid in the programming `language` that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-inlinecodeflownodeconfiguration.html#cfn-bedrock-flowversion-inlinecodeflownodeconfiguration-code)
     */
    public fun code(): String

    /**
     * The programming language used by your inline code node.
     *
     * The code must be valid in the programming `language` that you specify. Currently, only Python
     * 3 ( `Python_3` ) is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-inlinecodeflownodeconfiguration.html#cfn-bedrock-flowversion-inlinecodeflownodeconfiguration-language)
     */
    public fun language(): String

    /**
     * A builder for [InlineCodeFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The code that's executed in your inline code node. 
       * The code can access input data from previous nodes in the flow, perform operations on that
       * data, and produce output that can be used by other nodes in your flow.
       *
       * The code must be valid in the programming `language` that you specify.
       */
      public fun code(code: String)

      /**
       * @param language The programming language used by your inline code node. 
       * The code must be valid in the programming `language` that you specify. Currently, only
       * Python 3 ( `Python_3` ) is supported.
       */
      public fun language(language: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty.builder()

      /**
       * @param code The code that's executed in your inline code node. 
       * The code can access input data from previous nodes in the flow, perform operations on that
       * data, and produce output that can be used by other nodes in your flow.
       *
       * The code must be valid in the programming `language` that you specify.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param language The programming language used by your inline code node. 
       * The code must be valid in the programming `language` that you specify. Currently, only
       * Python 3 ( `Python_3` ) is supported.
       */
      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        InlineCodeFlowNodeConfigurationProperty {
      /**
       * The code that's executed in your inline code node.
       *
       * The code can access input data from previous nodes in the flow, perform operations on that
       * data, and produce output that can be used by other nodes in your flow.
       *
       * The code must be valid in the programming `language` that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-inlinecodeflownodeconfiguration.html#cfn-bedrock-flowversion-inlinecodeflownodeconfiguration-code)
       */
      override fun code(): String = unwrap(this).getCode()

      /**
       * The programming language used by your inline code node.
       *
       * The code must be valid in the programming `language` that you specify. Currently, only
       * Python 3 ( `Python_3` ) is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-inlinecodeflownodeconfiguration.html#cfn-bedrock-flowversion-inlinecodeflownodeconfiguration-language)
       */
      override fun language(): String = unwrap(this).getLanguage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InlineCodeFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty):
          InlineCodeFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InlineCodeFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineCodeFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.InlineCodeFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a knowledge base node in a flow.
   *
   * This node takes a query as the input and returns, as the output, the retrieved responses
   * directly (as an array) or a response generated based on the retrieved responses. For more
   * information, see [Node types in a
   * flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * KnowledgeBaseFlowNodeConfigurationProperty knowledgeBaseFlowNodeConfigurationProperty =
   * KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .modelId("modelId")
   * .numberOfResults(123)
   * .orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .rerankingConfiguration(VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html)
   */
  public interface KnowledgeBaseFlowNodeConfigurationProperty {
    /**
     * Contains configurations for a guardrail to apply during query and response generation for the
     * knowledge base in this configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-guardrailconfiguration)
     */
    public fun guardrailConfiguration(): Any? = unwrap(this).getGuardrailConfiguration()

    /**
     * Contains inference configurations for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * The unique identifier of the knowledge base to query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-knowledgebaseid)
     */
    public fun knowledgeBaseId(): String

    /**
     * The unique identifier of the model or [inference
     * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
     * use to generate a response from the query results. Omit this field if you want to return the
     * retrieved results as an array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The number of results to retrieve from the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-numberofresults)
     */
    public fun numberOfResults(): Number? = unwrap(this).getNumberOfResults()

    /**
     * The configuration for orchestrating the retrieval and generation process in the knowledge
     * base node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-orchestrationconfiguration)
     */
    public fun orchestrationConfiguration(): Any? = unwrap(this).getOrchestrationConfiguration()

    /**
     * A custom prompt template to use with the knowledge base for generating responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-prompttemplate)
     */
    public fun promptTemplate(): Any? = unwrap(this).getPromptTemplate()

    /**
     * The configuration for reranking the retrieved results from the knowledge base to improve
     * relevance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-rerankingconfiguration)
     */
    public fun rerankingConfiguration(): Any? = unwrap(this).getRerankingConfiguration()

    /**
     * A builder for [KnowledgeBaseFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      public fun guardrailConfiguration(guardrailConfiguration: IResolvable)

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      public fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty)

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adbb4d13fa9b96f58165bd246c315a87737710fab54429817a982c88160c4a2b")
      public
          fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7b035eb11fa6b1b3aa6ceec6a1bc5787f1145e7a79052c70b9c411a03146d3f")
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param knowledgeBaseId The unique identifier of the knowledge base to query. 
       */
      public fun knowledgeBaseId(knowledgeBaseId: String)

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * use to generate a response from the query results. Omit this field if you want to return the
       * retrieved results as an array.
       */
      public fun modelId(modelId: String)

      /**
       * @param numberOfResults The number of results to retrieve from the knowledge base.
       */
      public fun numberOfResults(numberOfResults: Number)

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      public fun orchestrationConfiguration(orchestrationConfiguration: IResolvable)

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      public
          fun orchestrationConfiguration(orchestrationConfiguration: KnowledgeBaseOrchestrationConfigurationProperty)

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aeade31087742498ce97417baabe91bd58964d75e3e254b29d399ba349d4392")
      public
          fun orchestrationConfiguration(orchestrationConfiguration: KnowledgeBaseOrchestrationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      public fun promptTemplate(promptTemplate: IResolvable)

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      public fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty)

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fab187b0c2bbde26a439d0f6286e167afd4cb50ba8036e3575121c0a26515fde")
      public
          fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty.Builder.() -> Unit)

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      public fun rerankingConfiguration(rerankingConfiguration: IResolvable)

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      public
          fun rerankingConfiguration(rerankingConfiguration: VectorSearchRerankingConfigurationProperty)

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e9c1c579e10b46c4b797584800c14d828ff93f530c97d11673b1ce443cdeb")
      public
          fun rerankingConfiguration(rerankingConfiguration: VectorSearchRerankingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty.builder()

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      override fun guardrailConfiguration(guardrailConfiguration: IResolvable) {
        cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      override fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty) {
        cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(GuardrailConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply during query
       * and response generation for the knowledge base in this configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adbb4d13fa9b96f58165bd246c315a87737710fab54429817a982c88160c4a2b")
      override
          fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit):
          Unit = guardrailConfiguration(GuardrailConfigurationProperty(guardrailConfiguration))

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7b035eb11fa6b1b3aa6ceec6a1bc5787f1145e7a79052c70b9c411a03146d3f")
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceConfiguration(PromptInferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param knowledgeBaseId The unique identifier of the knowledge base to query. 
       */
      override fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
      }

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * use to generate a response from the query results. Omit this field if you want to return the
       * retrieved results as an array.
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param numberOfResults The number of results to retrieve from the knowledge base.
       */
      override fun numberOfResults(numberOfResults: Number) {
        cdkBuilder.numberOfResults(numberOfResults)
      }

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      override fun orchestrationConfiguration(orchestrationConfiguration: IResolvable) {
        cdkBuilder.orchestrationConfiguration(orchestrationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      override
          fun orchestrationConfiguration(orchestrationConfiguration: KnowledgeBaseOrchestrationConfigurationProperty) {
        cdkBuilder.orchestrationConfiguration(orchestrationConfiguration.let(KnowledgeBaseOrchestrationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param orchestrationConfiguration The configuration for orchestrating the retrieval and
       * generation process in the knowledge base node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aeade31087742498ce97417baabe91bd58964d75e3e254b29d399ba349d4392")
      override
          fun orchestrationConfiguration(orchestrationConfiguration: KnowledgeBaseOrchestrationConfigurationProperty.Builder.() -> Unit):
          Unit =
          orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty(orchestrationConfiguration))

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      override fun promptTemplate(promptTemplate: IResolvable) {
        cdkBuilder.promptTemplate(promptTemplate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      override fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty) {
        cdkBuilder.promptTemplate(promptTemplate.let(KnowledgeBasePromptTemplateProperty.Companion::unwrap))
      }

      /**
       * @param promptTemplate A custom prompt template to use with the knowledge base for
       * generating responses.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fab187b0c2bbde26a439d0f6286e167afd4cb50ba8036e3575121c0a26515fde")
      override
          fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty.Builder.() -> Unit):
          Unit = promptTemplate(KnowledgeBasePromptTemplateProperty(promptTemplate))

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      override fun rerankingConfiguration(rerankingConfiguration: IResolvable) {
        cdkBuilder.rerankingConfiguration(rerankingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      override
          fun rerankingConfiguration(rerankingConfiguration: VectorSearchRerankingConfigurationProperty) {
        cdkBuilder.rerankingConfiguration(rerankingConfiguration.let(VectorSearchRerankingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param rerankingConfiguration The configuration for reranking the retrieved results from
       * the knowledge base to improve relevance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e9c1c579e10b46c4b797584800c14d828ff93f530c97d11673b1ce443cdeb")
      override
          fun rerankingConfiguration(rerankingConfiguration: VectorSearchRerankingConfigurationProperty.Builder.() -> Unit):
          Unit =
          rerankingConfiguration(VectorSearchRerankingConfigurationProperty(rerankingConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBaseFlowNodeConfigurationProperty {
      /**
       * Contains configurations for a guardrail to apply during query and response generation for
       * the knowledge base in this configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-guardrailconfiguration)
       */
      override fun guardrailConfiguration(): Any? = unwrap(this).getGuardrailConfiguration()

      /**
       * Contains inference configurations for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * The unique identifier of the knowledge base to query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-knowledgebaseid)
       */
      override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()

      /**
       * The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * use to generate a response from the query results. Omit this field if you want to return the
       * retrieved results as an array.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The number of results to retrieve from the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-numberofresults)
       */
      override fun numberOfResults(): Number? = unwrap(this).getNumberOfResults()

      /**
       * The configuration for orchestrating the retrieval and generation process in the knowledge
       * base node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-orchestrationconfiguration)
       */
      override fun orchestrationConfiguration(): Any? = unwrap(this).getOrchestrationConfiguration()

      /**
       * A custom prompt template to use with the knowledge base for generating responses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-prompttemplate)
       */
      override fun promptTemplate(): Any? = unwrap(this).getPromptTemplate()

      /**
       * The configuration for reranking the retrieved results from the knowledge base to improve
       * relevance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flowversion-knowledgebaseflownodeconfiguration-rerankingconfiguration)
       */
      override fun rerankingConfiguration(): Any? = unwrap(this).getRerankingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBaseFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty):
          KnowledgeBaseFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBaseFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBaseFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseFlowNodeConfigurationProperty
    }
  }

  /**
   * Configures how the knowledge base orchestrates the retrieval and generation process, allowing
   * for customization of prompts, inference parameters, and performance settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * KnowledgeBaseOrchestrationConfigurationProperty knowledgeBaseOrchestrationConfigurationProperty
   * = KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html)
   */
  public interface KnowledgeBaseOrchestrationConfigurationProperty {
    /**
     * The additional model-specific request parameters as key-value pairs to be included in the
     * request to the foundation model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-additionalmodelrequestfields)
     */
    public fun additionalModelRequestFields(): Any? = unwrap(this).getAdditionalModelRequestFields()

    /**
     * Contains inference configurations for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-inferenceconfig)
     */
    public fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

    /**
     * The performance configuration options for the knowledge base retrieval and generation
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-performanceconfig)
     */
    public fun performanceConfig(): Any? = unwrap(this).getPerformanceConfig()

    /**
     * A custom prompt template for orchestrating the retrieval and generation process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-prompttemplate)
     */
    public fun promptTemplate(): Any? = unwrap(this).getPromptTemplate()

    /**
     * A builder for [KnowledgeBaseOrchestrationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalModelRequestFields The additional model-specific request parameters as
       * key-value pairs to be included in the request to the foundation model.
       */
      public fun additionalModelRequestFields(additionalModelRequestFields: Any)

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      public fun inferenceConfig(inferenceConfig: IResolvable)

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      public fun inferenceConfig(inferenceConfig: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20e4777d51338d148b721edac44d3de25870d022654b312804a60f53ca508ae4")
      public
          fun inferenceConfig(inferenceConfig: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      public fun performanceConfig(performanceConfig: IResolvable)

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      public fun performanceConfig(performanceConfig: PerformanceConfigurationProperty)

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("653349a23722e41a5865a12a02db9962a8ce8c12d8a14f498b619e4d95abc2be")
      public
          fun performanceConfig(performanceConfig: PerformanceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      public fun promptTemplate(promptTemplate: IResolvable)

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      public fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty)

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adc1f32c3fe443dbfdce1c19e5dfe82954df1e5e2d81ebd2993e3387213f3a53")
      public
          fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty.builder()

      /**
       * @param additionalModelRequestFields The additional model-specific request parameters as
       * key-value pairs to be included in the request to the foundation model.
       */
      override fun additionalModelRequestFields(additionalModelRequestFields: Any) {
        cdkBuilder.additionalModelRequestFields(additionalModelRequestFields)
      }

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      override fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      override fun inferenceConfig(inferenceConfig: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfig Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20e4777d51338d148b721edac44d3de25870d022654b312804a60f53ca508ae4")
      override
          fun inferenceConfig(inferenceConfig: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit = inferenceConfig(PromptInferenceConfigurationProperty(inferenceConfig))

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      override fun performanceConfig(performanceConfig: IResolvable) {
        cdkBuilder.performanceConfig(performanceConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      override fun performanceConfig(performanceConfig: PerformanceConfigurationProperty) {
        cdkBuilder.performanceConfig(performanceConfig.let(PerformanceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param performanceConfig The performance configuration options for the knowledge base
       * retrieval and generation process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("653349a23722e41a5865a12a02db9962a8ce8c12d8a14f498b619e4d95abc2be")
      override
          fun performanceConfig(performanceConfig: PerformanceConfigurationProperty.Builder.() -> Unit):
          Unit = performanceConfig(PerformanceConfigurationProperty(performanceConfig))

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      override fun promptTemplate(promptTemplate: IResolvable) {
        cdkBuilder.promptTemplate(promptTemplate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      override fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty) {
        cdkBuilder.promptTemplate(promptTemplate.let(KnowledgeBasePromptTemplateProperty.Companion::unwrap))
      }

      /**
       * @param promptTemplate A custom prompt template for orchestrating the retrieval and
       * generation process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adc1f32c3fe443dbfdce1c19e5dfe82954df1e5e2d81ebd2993e3387213f3a53")
      override
          fun promptTemplate(promptTemplate: KnowledgeBasePromptTemplateProperty.Builder.() -> Unit):
          Unit = promptTemplate(KnowledgeBasePromptTemplateProperty(promptTemplate))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBaseOrchestrationConfigurationProperty {
      /**
       * The additional model-specific request parameters as key-value pairs to be included in the
       * request to the foundation model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-additionalmodelrequestfields)
       */
      override fun additionalModelRequestFields(): Any? =
          unwrap(this).getAdditionalModelRequestFields()

      /**
       * Contains inference configurations for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-inferenceconfig)
       */
      override fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

      /**
       * The performance configuration options for the knowledge base retrieval and generation
       * process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-performanceconfig)
       */
      override fun performanceConfig(): Any? = unwrap(this).getPerformanceConfig()

      /**
       * A custom prompt template for orchestrating the retrieval and generation process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseorchestrationconfiguration.html#cfn-bedrock-flowversion-knowledgebaseorchestrationconfiguration-prompttemplate)
       */
      override fun promptTemplate(): Any? = unwrap(this).getPromptTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBaseOrchestrationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty):
          KnowledgeBaseOrchestrationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBaseOrchestrationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBaseOrchestrationConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBaseOrchestrationConfigurationProperty
    }
  }

  /**
   * Defines a custom prompt template for orchestrating the retrieval and generation process.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * KnowledgeBasePromptTemplateProperty knowledgeBasePromptTemplateProperty =
   * KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseprompttemplate.html)
   */
  public interface KnowledgeBasePromptTemplateProperty {
    /**
     * The text of the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseprompttemplate.html#cfn-bedrock-flowversion-knowledgebaseprompttemplate-textprompttemplate)
     */
    public fun textPromptTemplate(): String

    /**
     * A builder for [KnowledgeBasePromptTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param textPromptTemplate The text of the prompt template. 
       */
      public fun textPromptTemplate(textPromptTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty.builder()

      /**
       * @param textPromptTemplate The text of the prompt template. 
       */
      override fun textPromptTemplate(textPromptTemplate: String) {
        cdkBuilder.textPromptTemplate(textPromptTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBasePromptTemplateProperty {
      /**
       * The text of the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-knowledgebaseprompttemplate.html#cfn-bedrock-flowversion-knowledgebaseprompttemplate-textprompttemplate)
       */
      override fun textPromptTemplate(): String = unwrap(this).getTextPromptTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBasePromptTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty):
          KnowledgeBasePromptTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBasePromptTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBasePromptTemplateProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.KnowledgeBasePromptTemplateProperty
    }
  }

  /**
   * Contains configurations for a Lambda function node in the flow.
   *
   * You specify the Lambda function to invoke and the inputs into the function. The output is the
   * response that is defined in the Lambda function. For more information, see [Node types in a
   * flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * LambdaFunctionFlowNodeConfigurationProperty lambdaFunctionFlowNodeConfigurationProperty =
   * LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lambdafunctionflownodeconfiguration.html)
   */
  public interface LambdaFunctionFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lambdafunctionflownodeconfiguration.html#cfn-bedrock-flowversion-lambdafunctionflownodeconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * A builder for [LambdaFunctionFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function to invoke. 
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty.builder()

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function to invoke. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LambdaFunctionFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lambdafunctionflownodeconfiguration.html#cfn-bedrock-flowversion-lambdafunctionflownodeconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty):
          LambdaFunctionFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaFunctionFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LambdaFunctionFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Lex node in the flow.
   *
   * You specify a Amazon Lex bot to invoke. This node takes an utterance as the input and returns
   * as the output the intent identified by the Amazon Lex bot. For more information, see [Node types
   * in a flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * LexFlowNodeConfigurationProperty lexFlowNodeConfigurationProperty =
   * LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lexflownodeconfiguration.html)
   */
  public interface LexFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lexflownodeconfiguration.html#cfn-bedrock-flowversion-lexflownodeconfiguration-botaliasarn)
     */
    public fun botAliasArn(): String

    /**
     * The Region to invoke the Amazon Lex bot in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lexflownodeconfiguration.html#cfn-bedrock-flowversion-lexflownodeconfiguration-localeid)
     */
    public fun localeId(): String

    /**
     * A builder for [LexFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botAliasArn The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke. 
       */
      public fun botAliasArn(botAliasArn: String)

      /**
       * @param localeId The Region to invoke the Amazon Lex bot in. 
       */
      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty.builder()

      /**
       * @param botAliasArn The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke. 
       */
      override fun botAliasArn(botAliasArn: String) {
        cdkBuilder.botAliasArn(botAliasArn)
      }

      /**
       * @param localeId The Region to invoke the Amazon Lex bot in. 
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LexFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lexflownodeconfiguration.html#cfn-bedrock-flowversion-lexflownodeconfiguration-botaliasarn)
       */
      override fun botAliasArn(): String = unwrap(this).getBotAliasArn()

      /**
       * The Region to invoke the Amazon Lex bot in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-lexflownodeconfiguration.html#cfn-bedrock-flowversion-lexflownodeconfiguration-localeid)
       */
      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LexFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty):
          LexFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LexFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LexFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LexFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the controller node of a DoWhile loop in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * LoopControllerFlowNodeConfigurationProperty loopControllerFlowNodeConfigurationProperty =
   * LoopControllerFlowNodeConfigurationProperty.builder()
   * .continueCondition(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build())
   * // the properties below are optional
   * .maxIterations(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopcontrollerflownodeconfiguration.html)
   */
  public interface LoopControllerFlowNodeConfigurationProperty {
    /**
     * Specifies the condition that determines when the flow exits the DoWhile loop.
     *
     * The loop executes until this condition evaluates to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopcontrollerflownodeconfiguration.html#cfn-bedrock-flowversion-loopcontrollerflownodeconfiguration-continuecondition)
     */
    public fun continueCondition(): Any

    /**
     * Specifies the maximum number of times the DoWhile loop can iterate before the flow exits the
     * loop.
     *
     * Default: - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopcontrollerflownodeconfiguration.html#cfn-bedrock-flowversion-loopcontrollerflownodeconfiguration-maxiterations)
     */
    public fun maxIterations(): Number? = unwrap(this).getMaxIterations()

    /**
     * A builder for [LoopControllerFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      public fun continueCondition(continueCondition: IResolvable)

      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      public fun continueCondition(continueCondition: FlowConditionProperty)

      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0871834c3cd8c8546128225f0e1f66ca650fd8c6d73c8014013c0c66fb6d1bf6")
      public fun continueCondition(continueCondition: FlowConditionProperty.Builder.() -> Unit)

      /**
       * @param maxIterations Specifies the maximum number of times the DoWhile loop can iterate
       * before the flow exits the loop.
       */
      public fun maxIterations(maxIterations: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty.builder()

      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      override fun continueCondition(continueCondition: IResolvable) {
        cdkBuilder.continueCondition(continueCondition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      override fun continueCondition(continueCondition: FlowConditionProperty) {
        cdkBuilder.continueCondition(continueCondition.let(FlowConditionProperty.Companion::unwrap))
      }

      /**
       * @param continueCondition Specifies the condition that determines when the flow exits the
       * DoWhile loop. 
       * The loop executes until this condition evaluates to true.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0871834c3cd8c8546128225f0e1f66ca650fd8c6d73c8014013c0c66fb6d1bf6")
      override fun continueCondition(continueCondition: FlowConditionProperty.Builder.() -> Unit):
          Unit = continueCondition(FlowConditionProperty(continueCondition))

      /**
       * @param maxIterations Specifies the maximum number of times the DoWhile loop can iterate
       * before the flow exits the loop.
       */
      override fun maxIterations(maxIterations: Number) {
        cdkBuilder.maxIterations(maxIterations)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LoopControllerFlowNodeConfigurationProperty {
      /**
       * Specifies the condition that determines when the flow exits the DoWhile loop.
       *
       * The loop executes until this condition evaluates to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopcontrollerflownodeconfiguration.html#cfn-bedrock-flowversion-loopcontrollerflownodeconfiguration-continuecondition)
       */
      override fun continueCondition(): Any = unwrap(this).getContinueCondition()

      /**
       * Specifies the maximum number of times the DoWhile loop can iterate before the flow exits
       * the loop.
       *
       * Default: - 10
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopcontrollerflownodeconfiguration.html#cfn-bedrock-flowversion-loopcontrollerflownodeconfiguration-maxiterations)
       */
      override fun maxIterations(): Number? = unwrap(this).getMaxIterations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoopControllerFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty):
          LoopControllerFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoopControllerFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoopControllerFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopControllerFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the nodes of a DoWhile loop in your flow.
   *
   * A DoWhile loop is made up of the following nodes:
   *
   * * `Loop` - The container node that holds the loop's flow definition. This node encompasses the
   * entire loop structure.
   * * `LoopInput` - The entry point node for the loop. This node receives inputs from nodes outside
   * the loop and from previous loop iterations.
   * * Body nodes - The processing nodes that execute within each loop iteration. These can be nodes
   * for handling data in your flow, such as a prompt or Lambda function nodes. Some node types aren't
   * supported inside a DoWhile loop body. For more information, see
   * [LoopIncompatibleNodeTypeFlowValidationDetails](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_LoopIncompatibleNodeTypeFlowValidationDetails.html)
   * .
   * * `LoopController` - The node that evaluates whether the loop should continue or exit based on
   * a condition.
   *
   * These nodes work together to create a loop that runs at least once and continues until a
   * specified condition is met or a maximum number of iterations is reached.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * Object collector;
   * Object input;
   * Object iterator;
   * LoopFlowNodeConfigurationProperty loopFlowNodeConfigurationProperty_;
   * Object loopInput;
   * Object output;
   * LoopFlowNodeConfigurationProperty loopFlowNodeConfigurationProperty =
   * LoopFlowNodeConfigurationProperty.builder()
   * .definition(FlowDefinitionProperty.builder()
   * .connections(List.of(FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build()))
   * .nodes(List.of(FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .inlineCode(InlineCodeFlowNodeConfigurationProperty.builder()
   * .code("code")
   * .language("language")
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .modelId("modelId")
   * .numberOfResults(123)
   * .orchestrationConfiguration(KnowledgeBaseOrchestrationConfigurationProperty.builder()
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .inferenceConfig(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .performanceConfig(PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .build())
   * .promptTemplate(KnowledgeBasePromptTemplateProperty.builder()
   * .textPromptTemplate("textPromptTemplate")
   * .build())
   * .rerankingConfiguration(VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build())
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .loop(loopFlowNodeConfigurationProperty_)
   * .loopController(LoopControllerFlowNodeConfigurationProperty.builder()
   * .continueCondition(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build())
   * // the properties below are optional
   * .maxIterations(123)
   * .build())
   * .loopInput(loopInput)
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build())
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopflownodeconfiguration.html)
   */
  public interface LoopFlowNodeConfigurationProperty {
    /**
     * The definition of the DoWhile loop nodes and connections between nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopflownodeconfiguration.html#cfn-bedrock-flowversion-loopflownodeconfiguration-definition)
     */
    public fun definition(): Any

    /**
     * A builder for [LoopFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      public fun definition(definition: IResolvable)

      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      public fun definition(definition: FlowDefinitionProperty)

      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e66f0f7ee383f444a426a5be945041f0e7b8b753aeb760eda76b79acf53112d")
      public fun definition(definition: FlowDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty.builder()

      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      override fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      override fun definition(definition: FlowDefinitionProperty) {
        cdkBuilder.definition(definition.let(FlowDefinitionProperty.Companion::unwrap))
      }

      /**
       * @param definition The definition of the DoWhile loop nodes and connections between nodes in
       * the flow. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e66f0f7ee383f444a426a5be945041f0e7b8b753aeb760eda76b79acf53112d")
      override fun definition(definition: FlowDefinitionProperty.Builder.() -> Unit): Unit =
          definition(FlowDefinitionProperty(definition))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LoopFlowNodeConfigurationProperty {
      /**
       * The definition of the DoWhile loop nodes and connections between nodes in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-loopflownodeconfiguration.html#cfn-bedrock-flowversion-loopflownodeconfiguration-definition)
       */
      override fun definition(): Any = unwrap(this).getDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoopFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty):
          LoopFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoopFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoopFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.LoopFlowNodeConfigurationProperty
    }
  }

  /**
   * Configuration for how metadata should be used during the reranking process in Knowledge Base
   * vector searches.
   *
   * This determines which metadata fields are included or excluded when reordering search results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * MetadataConfigurationForRerankingProperty metadataConfigurationForRerankingProperty =
   * MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-metadataconfigurationforreranking.html)
   */
  public interface MetadataConfigurationForRerankingProperty {
    /**
     * The mode for selecting which metadata fields to include in the reranking process.
     *
     * Valid values are ALL (use all available metadata fields) or SELECTIVE (use only specified
     * fields).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-metadataconfigurationforreranking.html#cfn-bedrock-flowversion-metadataconfigurationforreranking-selectionmode)
     */
    public fun selectionMode(): String

    /**
     * Configuration for selective mode, which allows you to explicitly include or exclude specific
     * metadata fields during reranking.
     *
     * This is only used when selectionMode is set to SELECTIVE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-metadataconfigurationforreranking.html#cfn-bedrock-flowversion-metadataconfigurationforreranking-selectivemodeconfiguration)
     */
    public fun selectiveModeConfiguration(): Any? = unwrap(this).getSelectiveModeConfiguration()

    /**
     * A builder for [MetadataConfigurationForRerankingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param selectionMode The mode for selecting which metadata fields to include in the
       * reranking process. 
       * Valid values are ALL (use all available metadata fields) or SELECTIVE (use only specified
       * fields).
       */
      public fun selectionMode(selectionMode: String)

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      public fun selectiveModeConfiguration(selectiveModeConfiguration: IResolvable)

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      public
          fun selectiveModeConfiguration(selectiveModeConfiguration: RerankingMetadataSelectiveModeConfigurationProperty)

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6c68dd1cd823bcabca712185471f317bd082addea83e5ac6b088024c858f6b1")
      public
          fun selectiveModeConfiguration(selectiveModeConfiguration: RerankingMetadataSelectiveModeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty.builder()

      /**
       * @param selectionMode The mode for selecting which metadata fields to include in the
       * reranking process. 
       * Valid values are ALL (use all available metadata fields) or SELECTIVE (use only specified
       * fields).
       */
      override fun selectionMode(selectionMode: String) {
        cdkBuilder.selectionMode(selectionMode)
      }

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      override fun selectiveModeConfiguration(selectiveModeConfiguration: IResolvable) {
        cdkBuilder.selectiveModeConfiguration(selectiveModeConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      override
          fun selectiveModeConfiguration(selectiveModeConfiguration: RerankingMetadataSelectiveModeConfigurationProperty) {
        cdkBuilder.selectiveModeConfiguration(selectiveModeConfiguration.let(RerankingMetadataSelectiveModeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param selectiveModeConfiguration Configuration for selective mode, which allows you to
       * explicitly include or exclude specific metadata fields during reranking.
       * This is only used when selectionMode is set to SELECTIVE.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6c68dd1cd823bcabca712185471f317bd082addea83e5ac6b088024c858f6b1")
      override
          fun selectiveModeConfiguration(selectiveModeConfiguration: RerankingMetadataSelectiveModeConfigurationProperty.Builder.() -> Unit):
          Unit =
          selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty(selectiveModeConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty,
    ) : CdkObject(cdkObject),
        MetadataConfigurationForRerankingProperty {
      /**
       * The mode for selecting which metadata fields to include in the reranking process.
       *
       * Valid values are ALL (use all available metadata fields) or SELECTIVE (use only specified
       * fields).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-metadataconfigurationforreranking.html#cfn-bedrock-flowversion-metadataconfigurationforreranking-selectionmode)
       */
      override fun selectionMode(): String = unwrap(this).getSelectionMode()

      /**
       * Configuration for selective mode, which allows you to explicitly include or exclude
       * specific metadata fields during reranking.
       *
       * This is only used when selectionMode is set to SELECTIVE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-metadataconfigurationforreranking.html#cfn-bedrock-flowversion-metadataconfigurationforreranking-selectivemodeconfiguration)
       */
      override fun selectiveModeConfiguration(): Any? = unwrap(this).getSelectiveModeConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetadataConfigurationForRerankingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty):
          MetadataConfigurationForRerankingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetadataConfigurationForRerankingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataConfigurationForRerankingProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.MetadataConfigurationForRerankingProperty
    }
  }

  /**
   * Performance settings for a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PerformanceConfigurationProperty performanceConfigurationProperty =
   * PerformanceConfigurationProperty.builder()
   * .latency("latency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-performanceconfiguration.html)
   */
  public interface PerformanceConfigurationProperty {
    /**
     * To use a latency-optimized version of the model, set to `optimized` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-performanceconfiguration.html#cfn-bedrock-flowversion-performanceconfiguration-latency)
     */
    public fun latency(): String? = unwrap(this).getLatency()

    /**
     * A builder for [PerformanceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param latency To use a latency-optimized version of the model, set to `optimized` .
       */
      public fun latency(latency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty.builder()

      /**
       * @param latency To use a latency-optimized version of the model, set to `optimized` .
       */
      override fun latency(latency: String) {
        cdkBuilder.latency(latency)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PerformanceConfigurationProperty {
      /**
       * To use a latency-optimized version of the model, set to `optimized` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-performanceconfiguration.html#cfn-bedrock-flowversion-performanceconfiguration-latency)
       */
      override fun latency(): String? = unwrap(this).getLatency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PerformanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty):
          PerformanceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PerformanceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PerformanceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PerformanceConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt node in the flow.
   *
   * You can use a prompt from Prompt management or you can define one in this node. If the prompt
   * contains variables, the inputs into this node will fill in the variables. The output from this
   * node is the response generated by the model. For more information, see [Node types in a
   * flow](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeConfigurationProperty promptFlowNodeConfigurationProperty =
   * PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
   * .guardrailIdentifier("guardrailIdentifier")
   * .guardrailVersion("guardrailVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeconfiguration.html)
   */
  public interface PromptFlowNodeConfigurationProperty {
    /**
     * Contains configurations for a guardrail to apply to the prompt in this node and the response
     * generated from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeconfiguration.html#cfn-bedrock-flowversion-promptflownodeconfiguration-guardrailconfiguration)
     */
    public fun guardrailConfiguration(): Any? = unwrap(this).getGuardrailConfiguration()

    /**
     * Specifies whether the prompt is from Prompt management or defined inline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeconfiguration.html#cfn-bedrock-flowversion-promptflownodeconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [PromptFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      public fun guardrailConfiguration(guardrailConfiguration: IResolvable)

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      public fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty)

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33f0cc1f82891e865ab36736bcbf25101cc9ae2b70a311fc334c9f8e04adbab0")
      public
          fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      public fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty)

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1f45d5e9d7dd2626e480f20ab521227ce46632649c5ffccf8a3b8e381e285d")
      public
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty.builder()

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      override fun guardrailConfiguration(guardrailConfiguration: IResolvable) {
        cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      override fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty) {
        cdkBuilder.guardrailConfiguration(guardrailConfiguration.let(GuardrailConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param guardrailConfiguration Contains configurations for a guardrail to apply to the
       * prompt in this node and the response generated from it.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33f0cc1f82891e865ab36736bcbf25101cc9ae2b70a311fc334c9f8e04adbab0")
      override
          fun guardrailConfiguration(guardrailConfiguration: GuardrailConfigurationProperty.Builder.() -> Unit):
          Unit = guardrailConfiguration(GuardrailConfigurationProperty(guardrailConfiguration))

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      override
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(PromptFlowNodeSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1f45d5e9d7dd2626e480f20ab521227ce46632649c5ffccf8a3b8e381e285d")
      override
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(PromptFlowNodeSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeConfigurationProperty {
      /**
       * Contains configurations for a guardrail to apply to the prompt in this node and the
       * response generated from it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeconfiguration.html#cfn-bedrock-flowversion-promptflownodeconfiguration-guardrailconfiguration)
       */
      override fun guardrailConfiguration(): Any? = unwrap(this).getGuardrailConfiguration()

      /**
       * Specifies whether the prompt is from Prompt management or defined inline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeconfiguration.html#cfn-bedrock-flowversion-promptflownodeconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty):
          PromptFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt defined inline in the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeInlineConfigurationProperty promptFlowNodeInlineConfigurationProperty =
   * PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html)
   */
  public interface PromptFlowNodeInlineConfigurationProperty {
    /**
     * Contains inference configurations for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * The unique identifier of the model or [inference
     * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
     * run inference with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-modelid)
     */
    public fun modelId(): String

    /**
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-templateconfiguration)
     */
    public fun templateConfiguration(): Any

    /**
     * The type of prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-templatetype)
     */
    public fun templateType(): String

    /**
     * A builder for [PromptFlowNodeInlineConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db33b17a8eb11e9029db4eae69f9c035aeb402bf23819d19cfd36cf0ae5b50")
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * run inference with. 
       */
      public fun modelId(modelId: String)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      public fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d47ea7e3433a81a153c54dd95f3b08856ff64ef3408d13c58b95174a4a203a4")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty.builder()

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db33b17a8eb11e9029db4eae69f9c035aeb402bf23819d19cfd36cf0ae5b50")
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceConfiguration(PromptInferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * run inference with. 
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(PromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d47ea7e3433a81a153c54dd95f3b08856ff64ef3408d13c58b95174a4a203a4")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeInlineConfigurationProperty {
      /**
       * Contains inference configurations for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) to
       * run inference with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-modelid)
       */
      override fun modelId(): String = unwrap(this).getModelId()

      /**
       * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-templateconfiguration)
       */
      override fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodeinlineconfiguration.html#cfn-bedrock-flowversion-promptflownodeinlineconfiguration-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeInlineConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty):
          PromptFlowNodeInlineConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeInlineConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeInlineConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeInlineConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt from Prompt management to use in a node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeResourceConfigurationProperty promptFlowNodeResourceConfigurationProperty =
   * PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownoderesourceconfiguration.html)
   */
  public interface PromptFlowNodeResourceConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownoderesourceconfiguration.html#cfn-bedrock-flowversion-promptflownoderesourceconfiguration-promptarn)
     */
    public fun promptArn(): String

    /**
     * A builder for [PromptFlowNodeResourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param promptArn The Amazon Resource Name (ARN) of the prompt from Prompt management. 
       */
      public fun promptArn(promptArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty.builder()

      /**
       * @param promptArn The Amazon Resource Name (ARN) of the prompt from Prompt management. 
       */
      override fun promptArn(promptArn: String) {
        cdkBuilder.promptArn(promptArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeResourceConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the prompt from Prompt management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownoderesourceconfiguration.html#cfn-bedrock-flowversion-promptflownoderesourceconfiguration-promptarn)
       */
      override fun promptArn(): String = unwrap(this).getPromptArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeResourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty):
          PromptFlowNodeResourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeResourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeResourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeResourceConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt and whether it is from Prompt management or defined
   * inline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeSourceConfigurationProperty promptFlowNodeSourceConfigurationProperty =
   * PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
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
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodesourceconfiguration.html)
   */
  public interface PromptFlowNodeSourceConfigurationProperty {
    /**
     * Contains configurations for a prompt that is defined inline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodesourceconfiguration.html#cfn-bedrock-flowversion-promptflownodesourceconfiguration-inline)
     */
    public fun `inline`(): Any? = unwrap(this).getInline()

    /**
     * Contains configurations for a prompt from Prompt management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodesourceconfiguration.html#cfn-bedrock-flowversion-promptflownodesourceconfiguration-resource)
     */
    public fun resource(): Any? = unwrap(this).getResource()

    /**
     * A builder for [PromptFlowNodeSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      public fun `inline`(`inline`: IResolvable)

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      public fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty)

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d6e6824bfc6ddfa15886de2fd7482f3359a3d3d0e692aec4af62196a9581159")
      public fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      public fun resource(resource: IResolvable)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      public fun resource(resource: PromptFlowNodeResourceConfigurationProperty)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4028242501aa7b40c4e74c9f0a9b170e27cb04ccc5ca835d8bbec47f40c4eeb")
      public fun resource(resource: PromptFlowNodeResourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty.builder()

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      override fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty) {
        cdkBuilder.`inline`(`inline`.let(PromptFlowNodeInlineConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d6e6824bfc6ddfa15886de2fd7482f3359a3d3d0e692aec4af62196a9581159")
      override fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty.Builder.() -> Unit):
          Unit = `inline`(PromptFlowNodeInlineConfigurationProperty(`inline`))

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      override fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      override fun resource(resource: PromptFlowNodeResourceConfigurationProperty) {
        cdkBuilder.resource(resource.let(PromptFlowNodeResourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4028242501aa7b40c4e74c9f0a9b170e27cb04ccc5ca835d8bbec47f40c4eeb")
      override
          fun resource(resource: PromptFlowNodeResourceConfigurationProperty.Builder.() -> Unit):
          Unit = resource(PromptFlowNodeResourceConfigurationProperty(resource))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeSourceConfigurationProperty {
      /**
       * Contains configurations for a prompt that is defined inline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodesourceconfiguration.html#cfn-bedrock-flowversion-promptflownodesourceconfiguration-inline)
       */
      override fun `inline`(): Any? = unwrap(this).getInline()

      /**
       * Contains configurations for a prompt from Prompt management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptflownodesourceconfiguration.html#cfn-bedrock-flowversion-promptflownodesourceconfiguration-resource)
       */
      override fun resource(): Any? = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty):
          PromptFlowNodeSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptFlowNodeSourceConfigurationProperty
    }
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
   * .topP(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinferenceconfiguration.html#cfn-bedrock-flowversion-promptinferenceconfiguration-text)
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
      @JvmName("18f1bcb18bbd77aa99512d47e20cbbac1b042c94788f5bcca6945ec3e3264d36")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty.builder()

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
      @JvmName("18f1bcb18bbd77aa99512d47e20cbbac1b042c94788f5bcca6945ec3e3264d36")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinferenceconfiguration.html#cfn-bedrock-flowversion-promptinferenceconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInferenceConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinputvariable.html#cfn-bedrock-flowversion-promptinputvariable-name)
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
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptinputvariable.html#cfn-bedrock-flowversion-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptInputVariableProperty
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
   * .topP(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-topp)
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
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      public fun topP(topP: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty.builder()

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
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      override fun topP(topP: Number) {
        cdkBuilder.topP(topP)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-promptmodelinferenceconfiguration.html#cfn-bedrock-flowversion-promptmodelinferenceconfiguration-topp)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptModelInferenceConfigurationProperty
    }
  }

  /**
   * Contains the message for a prompt.
   *
   * For more information, see [Construct and store reusable prompts with Prompt management in
   * Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-prompttemplateconfiguration.html#cfn-bedrock-flowversion-prompttemplateconfiguration-text)
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
      @JvmName("b343be77157f91d13a7a4923e4e390f7c980cb77acbaf6b81f104d24868377e8")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty.builder()

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
      @JvmName("b343be77157f91d13a7a4923e4e390f7c980cb77acbaf6b81f104d24868377e8")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-prompttemplateconfiguration.html#cfn-bedrock-flowversion-prompttemplateconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.PromptTemplateConfigurationProperty
    }
  }

  /**
   * Configuration for selectively including or excluding metadata fields during the reranking
   * process.
   *
   * This allows you to control which metadata attributes are considered when reordering search
   * results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RerankingMetadataSelectiveModeConfigurationProperty
   * rerankingMetadataSelectiveModeConfigurationProperty =
   * RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration.html)
   */
  public interface RerankingMetadataSelectiveModeConfigurationProperty {
    /**
     * A list of metadata field names to explicitly exclude from the reranking process.
     *
     * All metadata fields except these will be considered when reordering search results. This
     * parameter cannot be used together with fieldsToInclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration.html#cfn-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration-fieldstoexclude)
     */
    public fun fieldsToExclude(): Any? = unwrap(this).getFieldsToExclude()

    /**
     * A list of metadata field names to explicitly include in the reranking process.
     *
     * Only these fields will be considered when reordering search results. This parameter cannot be
     * used together with fieldsToExclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration.html#cfn-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration-fieldstoinclude)
     */
    public fun fieldsToInclude(): Any? = unwrap(this).getFieldsToInclude()

    /**
     * A builder for [RerankingMetadataSelectiveModeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      public fun fieldsToExclude(fieldsToExclude: IResolvable)

      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      public fun fieldsToExclude(fieldsToExclude: List<Any>)

      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      public fun fieldsToExclude(vararg fieldsToExclude: Any)

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      public fun fieldsToInclude(fieldsToInclude: IResolvable)

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      public fun fieldsToInclude(fieldsToInclude: List<Any>)

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      public fun fieldsToInclude(vararg fieldsToInclude: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty.builder()

      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      override fun fieldsToExclude(fieldsToExclude: IResolvable) {
        cdkBuilder.fieldsToExclude(fieldsToExclude.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      override fun fieldsToExclude(fieldsToExclude: List<Any>) {
        cdkBuilder.fieldsToExclude(fieldsToExclude.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fieldsToExclude A list of metadata field names to explicitly exclude from the
       * reranking process.
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       */
      override fun fieldsToExclude(vararg fieldsToExclude: Any): Unit =
          fieldsToExclude(fieldsToExclude.toList())

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      override fun fieldsToInclude(fieldsToInclude: IResolvable) {
        cdkBuilder.fieldsToInclude(fieldsToInclude.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      override fun fieldsToInclude(fieldsToInclude: List<Any>) {
        cdkBuilder.fieldsToInclude(fieldsToInclude.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fieldsToInclude A list of metadata field names to explicitly include in the
       * reranking process.
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       */
      override fun fieldsToInclude(vararg fieldsToInclude: Any): Unit =
          fieldsToInclude(fieldsToInclude.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty,
    ) : CdkObject(cdkObject),
        RerankingMetadataSelectiveModeConfigurationProperty {
      /**
       * A list of metadata field names to explicitly exclude from the reranking process.
       *
       * All metadata fields except these will be considered when reordering search results. This
       * parameter cannot be used together with fieldsToInclude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration.html#cfn-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration-fieldstoexclude)
       */
      override fun fieldsToExclude(): Any? = unwrap(this).getFieldsToExclude()

      /**
       * A list of metadata field names to explicitly include in the reranking process.
       *
       * Only these fields will be considered when reordering search results. This parameter cannot
       * be used together with fieldsToExclude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration.html#cfn-bedrock-flowversion-rerankingmetadataselectivemodeconfiguration-fieldstoinclude)
       */
      override fun fieldsToInclude(): Any? = unwrap(this).getFieldsToInclude()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RerankingMetadataSelectiveModeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty):
          RerankingMetadataSelectiveModeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? RerankingMetadataSelectiveModeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RerankingMetadataSelectiveModeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RerankingMetadataSelectiveModeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Retrieval node in a flow.
   *
   * This node retrieves data from the Amazon S3 location that you specify and returns it as the
   * output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeConfigurationProperty retrievalFlowNodeConfigurationProperty =
   * RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeconfiguration.html)
   */
  public interface RetrievalFlowNodeConfigurationProperty {
    /**
     * Contains configurations for the service to use for retrieving data to return as the output
     * from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeconfiguration.html#cfn-bedrock-flowversion-retrievalflownodeconfiguration-serviceconfiguration)
     */
    public fun serviceConfiguration(): Any

    /**
     * A builder for [RetrievalFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      public fun serviceConfiguration(serviceConfiguration: IResolvable)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      public
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09bf12ed3bc21cccf63e923d2ca73e62bd3c8290499e036c322d75ad83734f82")
      public
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty.builder()

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      override fun serviceConfiguration(serviceConfiguration: IResolvable) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      override
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(RetrievalFlowNodeServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09bf12ed3bc21cccf63e923d2ca73e62bd3c8290499e036c322d75ad83734f82")
      override
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty(serviceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeConfigurationProperty {
      /**
       * Contains configurations for the service to use for retrieving data to return as the output
       * from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeconfiguration.html#cfn-bedrock-flowversion-retrievalflownodeconfiguration-serviceconfiguration)
       */
      override fun serviceConfiguration(): Any = unwrap(this).getServiceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty):
          RetrievalFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the Amazon S3 location from which to retrieve data to return as the
   * output from the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeS3ConfigurationProperty retrievalFlowNodeS3ConfigurationProperty =
   * RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodes3configuration.html)
   */
  public interface RetrievalFlowNodeS3ConfigurationProperty {
    /**
     * The name of the Amazon S3 bucket from which to retrieve data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodes3configuration.html#cfn-bedrock-flowversion-retrievalflownodes3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [RetrievalFlowNodeS3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket from which to retrieve data. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket from which to retrieve data. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeS3ConfigurationProperty {
      /**
       * The name of the Amazon S3 bucket from which to retrieve data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodes3configuration.html#cfn-bedrock-flowversion-retrievalflownodes3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeS3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty):
          RetrievalFlowNodeS3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeS3ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeS3ConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeS3ConfigurationProperty
    }
  }

  /**
   * Contains configurations for the service to use for retrieving data to return as the output from
   * the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeServiceConfigurationProperty retrievalFlowNodeServiceConfigurationProperty =
   * RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeserviceconfiguration.html)
   */
  public interface RetrievalFlowNodeServiceConfigurationProperty {
    /**
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as
     * the output from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeserviceconfiguration.html#cfn-bedrock-flowversion-retrievalflownodeserviceconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [RetrievalFlowNodeServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      public fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty)

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("135a6a93b3ae7fb21234a5ca63e70aad41c15c80673649ad862626fbdb144fee")
      public fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty.builder()

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      override fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty) {
        cdkBuilder.s3(s3.let(RetrievalFlowNodeS3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("135a6a93b3ae7fb21234a5ca63e70aad41c15c80673649ad862626fbdb144fee")
      override fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty.Builder.() -> Unit): Unit =
          s3(RetrievalFlowNodeS3ConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeServiceConfigurationProperty {
      /**
       * Contains configurations for the Amazon S3 location from which to retrieve data to return as
       * the output from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-retrievalflownodeserviceconfiguration.html#cfn-bedrock-flowversion-retrievalflownodeserviceconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty):
          RetrievalFlowNodeServiceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeServiceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeServiceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.RetrievalFlowNodeServiceConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Storage node in a flow.
   *
   * This node stores the input in an Amazon S3 location that you specify.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeConfigurationProperty storageFlowNodeConfigurationProperty =
   * StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeconfiguration.html)
   */
  public interface StorageFlowNodeConfigurationProperty {
    /**
     * Contains configurations for the service to use for storing the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeconfiguration.html#cfn-bedrock-flowversion-storageflownodeconfiguration-serviceconfiguration)
     */
    public fun serviceConfiguration(): Any

    /**
     * A builder for [StorageFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      public fun serviceConfiguration(serviceConfiguration: IResolvable)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      public
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccab3e8fa5677d87d44231f7829d24f1bae4fad0c62927089f06354143a27646")
      public
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty.builder()

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      override fun serviceConfiguration(serviceConfiguration: IResolvable) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      override
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(StorageFlowNodeServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccab3e8fa5677d87d44231f7829d24f1bae4fad0c62927089f06354143a27646")
      override
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceConfiguration(StorageFlowNodeServiceConfigurationProperty(serviceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeConfigurationProperty {
      /**
       * Contains configurations for the service to use for storing the input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeconfiguration.html#cfn-bedrock-flowversion-storageflownodeconfiguration-serviceconfiguration)
       */
      override fun serviceConfiguration(): Any = unwrap(this).getServiceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty):
          StorageFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the Amazon S3 location in which to store the input into the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeS3ConfigurationProperty storageFlowNodeS3ConfigurationProperty =
   * StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodes3configuration.html)
   */
  public interface StorageFlowNodeS3ConfigurationProperty {
    /**
     * The name of the Amazon S3 bucket in which to store the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodes3configuration.html#cfn-bedrock-flowversion-storageflownodes3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [StorageFlowNodeS3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket in which to store the input into the
       * node. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket in which to store the input into the
       * node. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeS3ConfigurationProperty {
      /**
       * The name of the Amazon S3 bucket in which to store the input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodes3configuration.html#cfn-bedrock-flowversion-storageflownodes3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeS3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty):
          StorageFlowNodeS3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeS3ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeS3ConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeS3ConfigurationProperty
    }
  }

  /**
   * Contains configurations for the service to use for storing the input into the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeServiceConfigurationProperty storageFlowNodeServiceConfigurationProperty =
   * StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeserviceconfiguration.html)
   */
  public interface StorageFlowNodeServiceConfigurationProperty {
    /**
     * Contains configurations for the Amazon S3 location in which to store the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeserviceconfiguration.html#cfn-bedrock-flowversion-storageflownodeserviceconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [StorageFlowNodeServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      public fun s3(s3: StorageFlowNodeS3ConfigurationProperty)

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1d2c4d247c8e832fe0af5754deda6ad3b1fd7cd59c429537d8a086dc08ded00")
      public fun s3(s3: StorageFlowNodeS3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty.builder()

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      override fun s3(s3: StorageFlowNodeS3ConfigurationProperty) {
        cdkBuilder.s3(s3.let(StorageFlowNodeS3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1d2c4d247c8e832fe0af5754deda6ad3b1fd7cd59c429537d8a086dc08ded00")
      override fun s3(s3: StorageFlowNodeS3ConfigurationProperty.Builder.() -> Unit): Unit =
          s3(StorageFlowNodeS3ConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeServiceConfigurationProperty {
      /**
       * Contains configurations for the Amazon S3 location in which to store the input into the
       * node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-storageflownodeserviceconfiguration.html#cfn-bedrock-flowversion-storageflownodeserviceconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty):
          StorageFlowNodeServiceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeServiceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeServiceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.StorageFlowNodeServiceConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-textprompttemplateconfiguration.html#cfn-bedrock-flowversion-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-textprompttemplateconfiguration.html#cfn-bedrock-flowversion-textprompttemplateconfiguration-text)
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
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty.builder()

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
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-textprompttemplateconfiguration.html#cfn-bedrock-flowversion-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-textprompttemplateconfiguration.html#cfn-bedrock-flowversion-textprompttemplateconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.TextPromptTemplateConfigurationProperty
    }
  }

  /**
   * Configuration for using Amazon Bedrock foundation models to rerank Knowledge Base vector search
   * results.
   *
   * This enables more sophisticated relevance ranking using large language models.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * VectorSearchBedrockRerankingConfigurationProperty
   * vectorSearchBedrockRerankingConfigurationProperty =
   * VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html)
   */
  public interface VectorSearchBedrockRerankingConfigurationProperty {
    /**
     * Configuration for how document metadata should be used during the reranking process.
     *
     * This determines which metadata fields are included when reordering search results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-metadataconfiguration)
     */
    public fun metadataConfiguration(): Any? = unwrap(this).getMetadataConfiguration()

    /**
     * Configuration for the Amazon Bedrock foundation model used for reranking.
     *
     * This includes the model ARN and any additional request fields required by the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-modelconfiguration)
     */
    public fun modelConfiguration(): Any

    /**
     * The maximum number of results to rerank.
     *
     * This limits how many of the initial vector search results will be processed by the reranking
     * model. A smaller number improves performance but may exclude potentially relevant results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-numberofrerankedresults)
     */
    public fun numberOfRerankedResults(): Number? = unwrap(this).getNumberOfRerankedResults()

    /**
     * A builder for [VectorSearchBedrockRerankingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      public fun metadataConfiguration(metadataConfiguration: IResolvable)

      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      public
          fun metadataConfiguration(metadataConfiguration: MetadataConfigurationForRerankingProperty)

      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2811a7e2ce0a6bb466da511fbf2046e8b7f3e655d101c626bad5ae26c2a45ea7")
      public
          fun metadataConfiguration(metadataConfiguration: MetadataConfigurationForRerankingProperty.Builder.() -> Unit)

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      public fun modelConfiguration(modelConfiguration: IResolvable)

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      public
          fun modelConfiguration(modelConfiguration: VectorSearchBedrockRerankingModelConfigurationProperty)

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4c9548c3b7e428fd142b452261e44b71c3460aeb7762e5e18633aa280a6ec47")
      public
          fun modelConfiguration(modelConfiguration: VectorSearchBedrockRerankingModelConfigurationProperty.Builder.() -> Unit)

      /**
       * @param numberOfRerankedResults The maximum number of results to rerank.
       * This limits how many of the initial vector search results will be processed by the
       * reranking model. A smaller number improves performance but may exclude potentially relevant
       * results.
       */
      public fun numberOfRerankedResults(numberOfRerankedResults: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty.builder()

      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      override fun metadataConfiguration(metadataConfiguration: IResolvable) {
        cdkBuilder.metadataConfiguration(metadataConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      override
          fun metadataConfiguration(metadataConfiguration: MetadataConfigurationForRerankingProperty) {
        cdkBuilder.metadataConfiguration(metadataConfiguration.let(MetadataConfigurationForRerankingProperty.Companion::unwrap))
      }

      /**
       * @param metadataConfiguration Configuration for how document metadata should be used during
       * the reranking process.
       * This determines which metadata fields are included when reordering search results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2811a7e2ce0a6bb466da511fbf2046e8b7f3e655d101c626bad5ae26c2a45ea7")
      override
          fun metadataConfiguration(metadataConfiguration: MetadataConfigurationForRerankingProperty.Builder.() -> Unit):
          Unit =
          metadataConfiguration(MetadataConfigurationForRerankingProperty(metadataConfiguration))

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      override fun modelConfiguration(modelConfiguration: IResolvable) {
        cdkBuilder.modelConfiguration(modelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      override
          fun modelConfiguration(modelConfiguration: VectorSearchBedrockRerankingModelConfigurationProperty) {
        cdkBuilder.modelConfiguration(modelConfiguration.let(VectorSearchBedrockRerankingModelConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modelConfiguration Configuration for the Amazon Bedrock foundation model used for
       * reranking. 
       * This includes the model ARN and any additional request fields required by the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4c9548c3b7e428fd142b452261e44b71c3460aeb7762e5e18633aa280a6ec47")
      override
          fun modelConfiguration(modelConfiguration: VectorSearchBedrockRerankingModelConfigurationProperty.Builder.() -> Unit):
          Unit =
          modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty(modelConfiguration))

      /**
       * @param numberOfRerankedResults The maximum number of results to rerank.
       * This limits how many of the initial vector search results will be processed by the
       * reranking model. A smaller number improves performance but may exclude potentially relevant
       * results.
       */
      override fun numberOfRerankedResults(numberOfRerankedResults: Number) {
        cdkBuilder.numberOfRerankedResults(numberOfRerankedResults)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorSearchBedrockRerankingConfigurationProperty {
      /**
       * Configuration for how document metadata should be used during the reranking process.
       *
       * This determines which metadata fields are included when reordering search results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-metadataconfiguration)
       */
      override fun metadataConfiguration(): Any? = unwrap(this).getMetadataConfiguration()

      /**
       * Configuration for the Amazon Bedrock foundation model used for reranking.
       *
       * This includes the model ARN and any additional request fields required by the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-modelconfiguration)
       */
      override fun modelConfiguration(): Any = unwrap(this).getModelConfiguration()

      /**
       * The maximum number of results to rerank.
       *
       * This limits how many of the initial vector search results will be processed by the
       * reranking model. A smaller number improves performance but may exclude potentially relevant
       * results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingconfiguration-numberofrerankedresults)
       */
      override fun numberOfRerankedResults(): Number? = unwrap(this).getNumberOfRerankedResults()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorSearchBedrockRerankingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty):
          VectorSearchBedrockRerankingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VectorSearchBedrockRerankingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorSearchBedrockRerankingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingConfigurationProperty
    }
  }

  /**
   * Configuration for the Amazon Bedrock foundation model used for reranking vector search results.
   *
   * This specifies which model to use and any additional parameters required by the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * VectorSearchBedrockRerankingModelConfigurationProperty
   * vectorSearchBedrockRerankingModelConfigurationProperty =
   * VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration.html)
   */
  public interface VectorSearchBedrockRerankingModelConfigurationProperty {
    /**
     * A list of additional fields to include in the model request during reranking.
     *
     * These fields provide extra context or configuration options specific to the selected
     * foundation model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration-additionalmodelrequestfields)
     */
    public fun additionalModelRequestFields(): Any? = unwrap(this).getAdditionalModelRequestFields()

    /**
     * The Amazon Resource Name (ARN) of the foundation model to use for reranking.
     *
     * This model processes the query and search results to determine a more relevant ordering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration-modelarn)
     */
    public fun modelArn(): String

    /**
     * A builder for [VectorSearchBedrockRerankingModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalModelRequestFields A list of additional fields to include in the model
       * request during reranking.
       * These fields provide extra context or configuration options specific to the selected
       * foundation model.
       */
      public fun additionalModelRequestFields(additionalModelRequestFields: Any)

      /**
       * @param modelArn The Amazon Resource Name (ARN) of the foundation model to use for
       * reranking. 
       * This model processes the query and search results to determine a more relevant ordering.
       */
      public fun modelArn(modelArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty.builder()

      /**
       * @param additionalModelRequestFields A list of additional fields to include in the model
       * request during reranking.
       * These fields provide extra context or configuration options specific to the selected
       * foundation model.
       */
      override fun additionalModelRequestFields(additionalModelRequestFields: Any) {
        cdkBuilder.additionalModelRequestFields(additionalModelRequestFields)
      }

      /**
       * @param modelArn The Amazon Resource Name (ARN) of the foundation model to use for
       * reranking. 
       * This model processes the query and search results to determine a more relevant ordering.
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorSearchBedrockRerankingModelConfigurationProperty {
      /**
       * A list of additional fields to include in the model request during reranking.
       *
       * These fields provide extra context or configuration options specific to the selected
       * foundation model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration-additionalmodelrequestfields)
       */
      override fun additionalModelRequestFields(): Any? =
          unwrap(this).getAdditionalModelRequestFields()

      /**
       * The Amazon Resource Name (ARN) of the foundation model to use for reranking.
       *
       * This model processes the query and search results to determine a more relevant ordering.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration.html#cfn-bedrock-flowversion-vectorsearchbedrockrerankingmodelconfiguration-modelarn)
       */
      override fun modelArn(): String = unwrap(this).getModelArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorSearchBedrockRerankingModelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty):
          VectorSearchBedrockRerankingModelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? VectorSearchBedrockRerankingModelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorSearchBedrockRerankingModelConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchBedrockRerankingModelConfigurationProperty
    }
  }

  /**
   * Configuration for reranking vector search results to improve relevance.
   *
   * Reranking applies additional relevance models to reorder the initial vector search results
   * based on more sophisticated criteria.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * VectorSearchRerankingConfigurationProperty vectorSearchRerankingConfigurationProperty =
   * VectorSearchRerankingConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty.builder()
   * .modelConfiguration(VectorSearchBedrockRerankingModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .build())
   * // the properties below are optional
   * .metadataConfiguration(MetadataConfigurationForRerankingProperty.builder()
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .selectiveModeConfiguration(RerankingMetadataSelectiveModeConfigurationProperty.builder()
   * .fieldsToExclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .fieldsToInclude(List.of(FieldForRerankingProperty.builder()
   * .fieldName("fieldName")
   * .build()))
   * .build())
   * .build())
   * .numberOfRerankedResults(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchrerankingconfiguration.html)
   */
  public interface VectorSearchRerankingConfigurationProperty {
    /**
     * Configuration for using Amazon Bedrock foundation models to rerank search results.
     *
     * This is required when the reranking type is set to BEDROCK.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchrerankingconfiguration-bedrockrerankingconfiguration)
     */
    public fun bedrockRerankingConfiguration(): Any? =
        unwrap(this).getBedrockRerankingConfiguration()

    /**
     * The type of reranking to apply to vector search results.
     *
     * Currently, the only supported value is BEDROCK, which uses Amazon Bedrock foundation models
     * for reranking.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchrerankingconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [VectorSearchRerankingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      public fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: IResolvable)

      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      public
          fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: VectorSearchBedrockRerankingConfigurationProperty)

      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0d8afe2bd1141d9430ed817869335f6d3f8da1a7e8be85af9b48562693d0098")
      public
          fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: VectorSearchBedrockRerankingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of reranking to apply to vector search results. 
       * Currently, the only supported value is BEDROCK, which uses Amazon Bedrock foundation models
       * for reranking.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty.builder()

      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      override fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: IResolvable) {
        cdkBuilder.bedrockRerankingConfiguration(bedrockRerankingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      override
          fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: VectorSearchBedrockRerankingConfigurationProperty) {
        cdkBuilder.bedrockRerankingConfiguration(bedrockRerankingConfiguration.let(VectorSearchBedrockRerankingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockRerankingConfiguration Configuration for using Amazon Bedrock foundation
       * models to rerank search results.
       * This is required when the reranking type is set to BEDROCK.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0d8afe2bd1141d9430ed817869335f6d3f8da1a7e8be85af9b48562693d0098")
      override
          fun bedrockRerankingConfiguration(bedrockRerankingConfiguration: VectorSearchBedrockRerankingConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockRerankingConfiguration(VectorSearchBedrockRerankingConfigurationProperty(bedrockRerankingConfiguration))

      /**
       * @param type The type of reranking to apply to vector search results. 
       * Currently, the only supported value is BEDROCK, which uses Amazon Bedrock foundation models
       * for reranking.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorSearchRerankingConfigurationProperty {
      /**
       * Configuration for using Amazon Bedrock foundation models to rerank search results.
       *
       * This is required when the reranking type is set to BEDROCK.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchrerankingconfiguration-bedrockrerankingconfiguration)
       */
      override fun bedrockRerankingConfiguration(): Any? =
          unwrap(this).getBedrockRerankingConfiguration()

      /**
       * The type of reranking to apply to vector search results.
       *
       * Currently, the only supported value is BEDROCK, which uses Amazon Bedrock foundation models
       * for reranking.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowversion-vectorsearchrerankingconfiguration.html#cfn-bedrock-flowversion-vectorsearchrerankingconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorSearchRerankingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty):
          VectorSearchRerankingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VectorSearchRerankingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorSearchRerankingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowVersion.VectorSearchRerankingConfigurationProperty
    }
  }
}
