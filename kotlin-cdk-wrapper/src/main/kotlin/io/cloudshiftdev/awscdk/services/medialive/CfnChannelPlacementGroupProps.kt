@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnChannelPlacementGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnChannelPlacementGroupProps cfnChannelPlacementGroupProps =
 * CfnChannelPlacementGroupProps.builder()
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
public interface CfnChannelPlacementGroupProps {
  /**
   * The ID of the cluster the node is on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-clusterid)
   */
  public fun clusterId(): String? = unwrap(this).getClusterId()

  /**
   * The name of the channel placement group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * List of nodes added to the channel placement group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
   */
  public fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

  /**
   * A collection of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelPlacementGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterId The ID of the cluster the node is on.
     */
    public fun clusterId(clusterId: String)

    /**
     * @param name The name of the channel placement group.
     */
    public fun name(name: String)

    /**
     * @param nodes List of nodes added to the channel placement group.
     */
    public fun nodes(nodes: List<String>)

    /**
     * @param nodes List of nodes added to the channel placement group.
     */
    public fun nodes(vararg nodes: String)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps.Builder =
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps.builder()

    /**
     * @param clusterId The ID of the cluster the node is on.
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * @param name The name of the channel placement group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param nodes List of nodes added to the channel placement group.
     */
    override fun nodes(nodes: List<String>) {
      cdkBuilder.nodes(nodes)
    }

    /**
     * @param nodes List of nodes added to the channel placement group.
     */
    override fun nodes(vararg nodes: String): Unit = nodes(nodes.toList())

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps,
  ) : CdkObject(cdkObject),
      CfnChannelPlacementGroupProps {
    /**
     * The ID of the cluster the node is on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-clusterid)
     */
    override fun clusterId(): String? = unwrap(this).getClusterId()

    /**
     * The name of the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * List of nodes added to the channel placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-nodes)
     */
    override fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channelplacementgroup.html#cfn-medialive-channelplacementgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelPlacementGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps):
        CfnChannelPlacementGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnChannelPlacementGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPlacementGroupProps):
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps
  }
}
