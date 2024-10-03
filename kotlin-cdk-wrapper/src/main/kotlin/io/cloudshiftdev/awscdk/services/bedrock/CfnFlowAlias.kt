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
 * Creates an alias of a flow for deployment.
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
 * CfnFlowAlias cfnFlowAlias = CfnFlowAlias.Builder.create(this, "MyCfnFlowAlias")
 * .flowArn("flowArn")
 * .name("name")
 * .routingConfiguration(List.of(FlowAliasRoutingConfigurationListItemProperty.builder()
 * .flowVersion("flowVersion")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html)
 */
public open class CfnFlowAlias(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAlias,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowAliasProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnFlowAlias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowAliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowAliasProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the alias.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time at which the alias was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The unique identifier of the flow.
   */
  public open fun attrFlowId(): String = unwrap(this).getAttrFlowId()

  /**
   * The unique identifier of the alias of the flow.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

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
   * A description of the alias.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the alias.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the alias.
   */
  public open fun flowArn(): String = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the alias.
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
   * The name of the alias.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the alias.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of configurations about the versions that the alias maps to.
   */
  public open fun routingConfiguration(): Any = unwrap(this).getRoutingConfiguration()

  /**
   * A list of configurations about the versions that the alias maps to.
   */
  public open fun routingConfiguration(`value`: IResolvable) {
    unwrap(this).setRoutingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of configurations about the versions that the alias maps to.
   */
  public open fun routingConfiguration(`value`: List<Any>) {
    unwrap(this).setRoutingConfiguration(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of configurations about the versions that the alias maps to.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnFlowAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-description)
     * @param description A description of the alias. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the alias. 
     */
    public fun flowArn(flowArn: String)

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-name)
     * @param name The name of the alias. 
     */
    public fun name(name: String)

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     */
    public fun routingConfiguration(routingConfiguration: IResolvable)

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     */
    public fun routingConfiguration(routingConfiguration: List<Any>)

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlowAlias.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlowAlias.Builder.create(scope, id)

    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-description)
     * @param description A description of the alias. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the alias. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-name)
     * @param name The name of the alias. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     */
    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     */
    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnFlowAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAlias): CfnFlowAlias
        = CfnFlowAlias(cdkObject)

    internal fun unwrap(wrapped: CfnFlowAlias): software.amazon.awscdk.services.bedrock.CfnFlowAlias
        = wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnFlowAlias
  }

  /**
   * Contains information about a version that the alias maps to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowAliasRoutingConfigurationListItemProperty flowAliasRoutingConfigurationListItemProperty =
   * FlowAliasRoutingConfigurationListItemProperty.builder()
   * .flowVersion("flowVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowalias-flowaliasroutingconfigurationlistitem.html)
   */
  public interface FlowAliasRoutingConfigurationListItemProperty {
    /**
     * The version that the alias maps to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowalias-flowaliasroutingconfigurationlistitem.html#cfn-bedrock-flowalias-flowaliasroutingconfigurationlistitem-flowversion)
     */
    public fun flowVersion(): String? = unwrap(this).getFlowVersion()

    /**
     * A builder for [FlowAliasRoutingConfigurationListItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flowVersion The version that the alias maps to.
       */
      public fun flowVersion(flowVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty.builder()

      /**
       * @param flowVersion The version that the alias maps to.
       */
      override fun flowVersion(flowVersion: String) {
        cdkBuilder.flowVersion(flowVersion)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty,
    ) : CdkObject(cdkObject),
        FlowAliasRoutingConfigurationListItemProperty {
      /**
       * The version that the alias maps to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flowalias-flowaliasroutingconfigurationlistitem.html#cfn-bedrock-flowalias-flowaliasroutingconfigurationlistitem-flowversion)
       */
      override fun flowVersion(): String? = unwrap(this).getFlowVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowAliasRoutingConfigurationListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty):
          FlowAliasRoutingConfigurationListItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowAliasRoutingConfigurationListItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowAliasRoutingConfigurationListItemProperty):
          software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlowAlias.FlowAliasRoutingConfigurationListItemProperty
    }
  }
}
