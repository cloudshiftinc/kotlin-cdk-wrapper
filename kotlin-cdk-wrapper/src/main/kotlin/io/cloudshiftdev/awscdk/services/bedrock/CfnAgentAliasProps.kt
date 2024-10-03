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
 * Properties for defining a `CfnAgentAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnAgentAliasProps cfnAgentAliasProps = CfnAgentAliasProps.builder()
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
public interface CfnAgentAliasProps {
  /**
   * The name of the alias of the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentaliasname)
   */
  public fun agentAliasName(): String

  /**
   * The unique identifier of the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentid)
   */
  public fun agentId(): String

  /**
   * The description of the alias of the agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Contains details about the routing configuration of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
   */
  public fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

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
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAgentAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentAliasName The name of the alias of the agent. 
     */
    public fun agentAliasName(agentAliasName: String)

    /**
     * @param agentId The unique identifier of the agent. 
     */
    public fun agentId(agentId: String)

    /**
     * @param description The description of the alias of the agent.
     */
    public fun description(description: String)

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    public fun routingConfiguration(routingConfiguration: IResolvable)

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    public fun routingConfiguration(routingConfiguration: List<Any>)

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    public fun routingConfiguration(vararg routingConfiguration: Any)

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnAgentAliasProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnAgentAliasProps.builder()

    /**
     * @param agentAliasName The name of the alias of the agent. 
     */
    override fun agentAliasName(agentAliasName: String) {
      cdkBuilder.agentAliasName(agentAliasName)
    }

    /**
     * @param agentId The unique identifier of the agent. 
     */
    override fun agentId(agentId: String) {
      cdkBuilder.agentId(agentId)
    }

    /**
     * @param description The description of the alias of the agent.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param routingConfiguration Contains details about the routing configuration of the alias.
     */
    override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
        routingConfiguration(routingConfiguration.toList())

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

    public fun build(): software.amazon.awscdk.services.bedrock.CfnAgentAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAliasProps,
  ) : CdkObject(cdkObject),
      CfnAgentAliasProps {
    /**
     * The name of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentaliasname)
     */
    override fun agentAliasName(): String = unwrap(this).getAgentAliasName()

    /**
     * The unique identifier of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-agentid)
     */
    override fun agentId(): String = unwrap(this).getAgentId()

    /**
     * The description of the alias of the agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Contains details about the routing configuration of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-agentalias.html#cfn-bedrock-agentalias-routingconfiguration)
     */
    override fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

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
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgentAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnAgentAliasProps):
        CfnAgentAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAgentAliasProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgentAliasProps):
        software.amazon.awscdk.services.bedrock.CfnAgentAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnAgentAliasProps
  }
}
