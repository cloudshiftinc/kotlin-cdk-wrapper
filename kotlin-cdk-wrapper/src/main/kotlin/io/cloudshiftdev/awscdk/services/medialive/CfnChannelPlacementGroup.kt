@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::ChannelPlacementGroup Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnChannelPlacementGroup cfnChannelPlacementGroup = CfnChannelPlacementGroup.Builder.create(this,
 * "MyCfnChannelPlacementGroup")
 * .clusterId("clusterId")
 * .name("name")
 * .nodes(List.of("nodes"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html)
 */
public open class CfnChannelPlacementGroup(
  cdkObject: software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelPlacementGroupProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelPlacementGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelPlacementGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelPlacementGroupProps(props)
  )

  /**
   * The ARN of the channel placement group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * List of channel IDs added to the channel placement group.
   */
  public open fun attrChannels(): List<String> = unwrap(this).getAttrChannels()

  /**
   * Unique internal identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The current state of the ChannelPlacementGroupState.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the cluster the node is on.
   */
  public open fun clusterId(): String? = unwrap(this).getClusterId()

  /**
   * The ID of the cluster the node is on.
   */
  public open fun clusterId(`value`: String) {
    unwrap(this).setClusterId(`value`)
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
   * The name of the channel placement group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the channel placement group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * List of nodes added to the channel placement group.
   */
  public open fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

  /**
   * List of nodes added to the channel placement group.
   */
  public open fun nodes(`value`: List<String>) {
    unwrap(this).setNodes(`value`)
  }

  /**
   * List of nodes added to the channel placement group.
   */
  public open fun nodes(vararg `value`: String): Unit = nodes(`value`.toList())

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnChannelPlacementGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the cluster the node is on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-clusterid)
     * @param clusterId The ID of the cluster the node is on. 
     */
    public fun clusterId(clusterId: String)

    /**
     * The name of the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-name)
     * @param name The name of the channel placement group. 
     */
    public fun name(name: String)

    /**
     * List of nodes added to the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
     * @param nodes List of nodes added to the channel placement group. 
     */
    public fun nodes(nodes: List<String>)

    /**
     * List of nodes added to the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
     * @param nodes List of nodes added to the channel placement group. 
     */
    public fun nodes(vararg nodes: String)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup.Builder =
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup.Builder.create(scope, id)

    /**
     * The ID of the cluster the node is on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-clusterid)
     * @param clusterId The ID of the cluster the node is on. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * The name of the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-name)
     * @param name The name of the channel placement group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * List of nodes added to the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
     * @param nodes List of nodes added to the channel placement group. 
     */
    override fun nodes(nodes: List<String>) {
      cdkBuilder.nodes(nodes)
    }

    /**
     * List of nodes added to the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
     * @param nodes List of nodes added to the channel placement group. 
     */
    override fun nodes(vararg nodes: String): Unit = nodes(nodes.toList())

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelPlacementGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelPlacementGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup):
        CfnChannelPlacementGroup = CfnChannelPlacementGroup(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPlacementGroup):
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup
  }
}
