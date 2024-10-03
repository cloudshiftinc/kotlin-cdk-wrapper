@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a placement group in which to launch instances.
 *
 * The strategy of the placement group determines how the instances are organized within the group.
 *
 * A `cluster` placement group is a logical grouping of instances within a single Availability Zone
 * that benefit from low network latency, high network throughput. A `spread` placement group places
 * instances on distinct hardware. A `partition` placement group places groups of instances in
 * different partitions, where instances in one partition do not share the same hardware with instances
 * in another partition.
 *
 * For more information, see [Placement
 * Groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the *Amazon
 * EC2 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnPlacementGroup cfnPlacementGroup = CfnPlacementGroup.Builder.create(this,
 * "MyCfnPlacementGroup")
 * .partitionCount(123)
 * .spreadLevel("spreadLevel")
 * .strategy("strategy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
 */
public open class CfnPlacementGroup(
  cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnPlacementGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlacementGroupProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnPlacementGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPlacementGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlacementGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPlacementGroupProps(props)
  )

  /**
   * The name of the placement group.
   */
  public open fun attrGroupName(): String = unwrap(this).getAttrGroupName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The number of partitions.
   */
  public open fun partitionCount(): Number? = unwrap(this).getPartitionCount()

  /**
   * The number of partitions.
   */
  public open fun partitionCount(`value`: Number) {
    unwrap(this).setPartitionCount(`value`)
  }

  /**
   * Determines how placement groups spread instances.
   */
  public open fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

  /**
   * Determines how placement groups spread instances.
   */
  public open fun spreadLevel(`value`: String) {
    unwrap(this).setSpreadLevel(`value`)
  }

  /**
   * The placement strategy.
   */
  public open fun strategy(): String? = unwrap(this).getStrategy()

  /**
   * The placement strategy.
   */
  public open fun strategy(`value`: String) {
    unwrap(this).setStrategy(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to apply to the new placement group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply to the new placement group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to apply to the new placement group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnPlacementGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of partitions.
     *
     * Valid only when *Strategy* is set to `partition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
     * @param partitionCount The number of partitions. 
     */
    public fun partitionCount(partitionCount: Number)

    /**
     * Determines how placement groups spread instances.
     *
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-spreadlevel)
     * @param spreadLevel Determines how placement groups spread instances. 
     */
    public fun spreadLevel(spreadLevel: String)

    /**
     * The placement strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
     * @param strategy The placement strategy. 
     */
    public fun strategy(strategy: String)

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     * @param tags The tags to apply to the new placement group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     * @param tags The tags to apply to the new placement group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPlacementGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnPlacementGroup.Builder.create(scope, id)

    /**
     * The number of partitions.
     *
     * Valid only when *Strategy* is set to `partition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
     * @param partitionCount The number of partitions. 
     */
    override fun partitionCount(partitionCount: Number) {
      cdkBuilder.partitionCount(partitionCount)
    }

    /**
     * Determines how placement groups spread instances.
     *
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-spreadlevel)
     * @param spreadLevel Determines how placement groups spread instances. 
     */
    override fun spreadLevel(spreadLevel: String) {
      cdkBuilder.spreadLevel(spreadLevel)
    }

    /**
     * The placement strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
     * @param strategy The placement strategy. 
     */
    override fun strategy(strategy: String) {
      cdkBuilder.strategy(strategy)
    }

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     * @param tags The tags to apply to the new placement group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     * @param tags The tags to apply to the new placement group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPlacementGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnPlacementGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlacementGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlacementGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroup):
        CfnPlacementGroup = CfnPlacementGroup(cdkObject)

    internal fun unwrap(wrapped: CfnPlacementGroup):
        software.amazon.awscdk.services.ec2.CfnPlacementGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnPlacementGroup
  }
}
