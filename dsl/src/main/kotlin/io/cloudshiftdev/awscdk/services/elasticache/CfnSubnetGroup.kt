package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.elasticache.CfnSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The name for the cache subnet group.
   *
   * This value is stored as a lowercase string.
   */
  public open fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  /**
   * The name for the cache subnet group.
   *
   * This value is stored as a lowercase string.
   */
  public open fun cacheSubnetGroupName(`value`: String) {
    unwrap(this).setCacheSubnetGroupName(`value`)
  }

  /**
   * The description for the cache subnet group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description for the cache subnet group.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The EC2 subnet IDs for the cache subnet group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The EC2 subnet IDs for the cache subnet group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The EC2 subnet IDs for the cache subnet group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag that can be added to an ElastiCache subnet group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag that can be added to an ElastiCache subnet group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A tag that can be added to an ElastiCache subnet group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name for the cache subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name for the cache subnet group. This value is stored as a
     * lowercase string. 
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    /**
     * The description for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
     * @param description The description for the cache subnet group. 
     */
    public fun description(description: String)

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     * @param tags A tag that can be added to an ElastiCache subnet group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     * @param tags A tag that can be added to an ElastiCache subnet group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnSubnetGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnSubnetGroup.Builder.create(scope, id)

    /**
     * The name for the cache subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name for the cache subnet group. This value is stored as a
     * lowercase string. 
     */
    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * The description for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
     * @param description The description for the cache subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     * @param tags A tag that can be added to an ElastiCache subnet group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     * @param tags A tag that can be added to an ElastiCache subnet group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSubnetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSubnetGroup):
        CfnSubnetGroup = CfnSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroup):
        software.amazon.awscdk.services.elasticache.CfnSubnetGroup = wrapped.cdkObject
  }
}
