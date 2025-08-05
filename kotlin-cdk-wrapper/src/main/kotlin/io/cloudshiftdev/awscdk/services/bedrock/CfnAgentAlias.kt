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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an agent alias as a resource in a top-level template. Minimally, you must specify the
 * following properties:.
 *
 * * AgentAliasName – Specify a name for the alias.
 *
 * For more information about creating aliases for an agent in Amazon Bedrock , see [Deploy an
 * Amazon Bedrock agent](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-deploy.html) .
 *
 * See the *Properties* section below for descriptions of both the required and optional properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnAgentAlias cfnAgentAlias = CfnAgentAlias.Builder.create(this, "MyCfnAgentAlias")
 * .agentAliasName("agentAliasName")
 * .agentId("agentId")
 * // the properties below are optional
 * .description("description")
 * .routingConfiguration(List.of(AgentAliasRoutingConfigurationListItemProperty.builder()
 * .agentVersion("agentVersion")
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html)
 */
public open class CfnAgentAlias(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentAliasProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnAgentAlias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAgentAliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAgentAliasProps(props)
  )

  /**
   * The name of the alias of the agent.
   */
  public open fun agentAliasName(): String = unwrap(this).getAgentAliasName()

  /**
   * The name of the alias of the agent.
   */
  public open fun agentAliasName(`value`: String) {
    unwrap(this).setAgentAliasName(`value`)
  }

  /**
   * The unique identifier of the agent.
   */
  public open fun agentId(): String = unwrap(this).getAgentId()

  /**
   * The unique identifier of the agent.
   */
  public open fun agentId(`value`: String) {
    unwrap(this).setAgentId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the alias of the agent.
   */
  public open fun attrAgentAliasArn(): String = unwrap(this).getAttrAgentAliasArn()

  /**
   * Contains details about the history of the alias.
   */
  public open fun attrAgentAliasHistoryEvents(): IResolvable =
      unwrap(this).getAttrAgentAliasHistoryEvents().let(IResolvable::wrap)

  /**
   * The unique identifier of the alias of the agent.
   */
  public open fun attrAgentAliasId(): String = unwrap(this).getAttrAgentAliasId()

  /**
   * The status of the alias of the agent and whether it is ready for use.
   *
   * The following statuses are possible:
   *
   * * CREATING – The agent alias is being created.
   * * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
   * * FAILED – The agent alias API operation failed.
   * * UPDATING – The agent alias is being updated.
   * * DELETING – The agent alias is being deleted.
   * * DISSOCIATED - The agent alias has no version associated with it.
   */
  public open fun attrAgentAliasStatus(): String = unwrap(this).getAttrAgentAliasStatus()

  /**
   * The time at which the alias of the agent was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The time at which the alias was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the alias of the agent.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the alias of the agent.
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
   * Contains details about the routing configuration of the alias.
   */
  public open fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

  /**
   * Contains details about the routing configuration of the alias.
   */
  public open fun routingConfiguration(`value`: IResolvable) {
    unwrap(this).setRoutingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the routing configuration of the alias.
   */
  public open fun routingConfiguration(`value`: List<Any>) {
    unwrap(this).setRoutingConfiguration(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Contains details about the routing configuration of the alias.
   */
  public open fun routingConfiguration(vararg `value`: Any): Unit =
      routingConfiguration(`value`.toList())

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnAgentAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentaliasname)
     * @param agentAliasName The name of the alias of the agent. 
     */
    public fun agentAliasName(agentAliasName: String)

    /**
     * The unique identifier of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentid)
     * @param agentId The unique identifier of the agent. 
     */
    public fun agentId(agentId: String)

    /**
     * The description of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-description)
     * @param description The description of the alias of the agent. 
     */
    public fun description(description: String)

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    public fun routingConfiguration(routingConfiguration: IResolvable)

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    public fun routingConfiguration(routingConfiguration: List<Any>)

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    public fun routingConfiguration(vararg routingConfiguration: Any)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnAgentAlias.Builder =
        software.amazon.awscdk.services.bedrock.CfnAgentAlias.Builder.create(scope, id)

    /**
     * The name of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentaliasname)
     * @param agentAliasName The name of the alias of the agent. 
     */
    override fun agentAliasName(agentAliasName: String) {
      cdkBuilder.agentAliasName(agentAliasName)
    }

    /**
     * The unique identifier of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentid)
     * @param agentId The unique identifier of the agent. 
     */
    override fun agentId(agentId: String) {
      cdkBuilder.agentId(agentId)
    }

    /**
     * The description of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-description)
     * @param description The description of the alias of the agent. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     * @param routingConfiguration Contains details about the routing configuration of the alias. 
     */
    override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
        routingConfiguration(routingConfiguration.toList())

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnAgentAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnAgentAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgentAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgentAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias):
        CfnAgentAlias = CfnAgentAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAgentAlias):
        software.amazon.awscdk.services.bedrock.CfnAgentAlias = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnAgentAlias
  }

  /**
   * Contains details about the history of the alias.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentAliasHistoryEventProperty agentAliasHistoryEventProperty =
   * AgentAliasHistoryEventProperty.builder()
   * .endDate("endDate")
   * .routingConfiguration(List.of(AgentAliasRoutingConfigurationListItemProperty.builder()
   * .agentVersion("agentVersion")
   * .build()))
   * .startDate("startDate")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html)
   */
  public interface AgentAliasHistoryEventProperty {
    /**
     * The date that the alias stopped being associated to the version in the `routingConfiguration`
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-enddate)
     */
    public fun endDate(): String? = unwrap(this).getEndDate()

    /**
     * Contains details about the version of the agent with which the alias is associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-routingconfiguration)
     */
    public fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

    /**
     * The date that the alias began being associated to the version in the `routingConfiguration`
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-startdate)
     */
    public fun startDate(): String? = unwrap(this).getStartDate()

    /**
     * A builder for [AgentAliasHistoryEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endDate The date that the alias stopped being associated to the version in the
       * `routingConfiguration` object.
       */
      public fun endDate(endDate: String)

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      public fun routingConfiguration(routingConfiguration: IResolvable)

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      public fun routingConfiguration(routingConfiguration: List<Any>)

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      public fun routingConfiguration(vararg routingConfiguration: Any)

      /**
       * @param startDate The date that the alias began being associated to the version in the
       * `routingConfiguration` object.
       */
      public fun startDate(startDate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty.builder()

      /**
       * @param endDate The date that the alias stopped being associated to the version in the
       * `routingConfiguration` object.
       */
      override fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
      }

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      override fun routingConfiguration(routingConfiguration: IResolvable) {
        cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      override fun routingConfiguration(routingConfiguration: List<Any>) {
        cdkBuilder.routingConfiguration(routingConfiguration.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param routingConfiguration Contains details about the version of the agent with which the
       * alias is associated.
       */
      override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
          routingConfiguration(routingConfiguration.toList())

      /**
       * @param startDate The date that the alias began being associated to the version in the
       * `routingConfiguration` object.
       */
      override fun startDate(startDate: String) {
        cdkBuilder.startDate(startDate)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty,
    ) : CdkObject(cdkObject),
        AgentAliasHistoryEventProperty {
      /**
       * The date that the alias stopped being associated to the version in the
       * `routingConfiguration` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-enddate)
       */
      override fun endDate(): String? = unwrap(this).getEndDate()

      /**
       * Contains details about the version of the agent with which the alias is associated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-routingconfiguration)
       */
      override fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

      /**
       * The date that the alias began being associated to the version in the `routingConfiguration`
       * object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliashistoryevent.html#cfn-bedrock-agentalias-agentaliashistoryevent-startdate)
       */
      override fun startDate(): String? = unwrap(this).getStartDate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentAliasHistoryEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty):
          AgentAliasHistoryEventProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentAliasHistoryEventProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentAliasHistoryEventProperty):
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasHistoryEventProperty
    }
  }

  /**
   * Contains details about the routing configuration of the alias.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentAliasRoutingConfigurationListItemProperty agentAliasRoutingConfigurationListItemProperty =
   * AgentAliasRoutingConfigurationListItemProperty.builder()
   * .agentVersion("agentVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliasroutingconfigurationlistitem.html)
   */
  public interface AgentAliasRoutingConfigurationListItemProperty {
    /**
     * The version of the agent with which the alias is associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliasroutingconfigurationlistitem.html#cfn-bedrock-agentalias-agentaliasroutingconfigurationlistitem-agentversion)
     */
    public fun agentVersion(): String

    /**
     * A builder for [AgentAliasRoutingConfigurationListItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentVersion The version of the agent with which the alias is associated. 
       */
      public fun agentVersion(agentVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty.builder()

      /**
       * @param agentVersion The version of the agent with which the alias is associated. 
       */
      override fun agentVersion(agentVersion: String) {
        cdkBuilder.agentVersion(agentVersion)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty,
    ) : CdkObject(cdkObject),
        AgentAliasRoutingConfigurationListItemProperty {
      /**
       * The version of the agent with which the alias is associated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-agentalias-agentaliasroutingconfigurationlistitem.html#cfn-bedrock-agentalias-agentaliasroutingconfigurationlistitem-agentversion)
       */
      override fun agentVersion(): String = unwrap(this).getAgentVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AgentAliasRoutingConfigurationListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty):
          AgentAliasRoutingConfigurationListItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentAliasRoutingConfigurationListItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentAliasRoutingConfigurationListItemProperty):
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnAgentAlias.AgentAliasRoutingConfigurationListItemProperty
    }
  }
}
