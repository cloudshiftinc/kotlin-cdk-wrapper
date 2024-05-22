@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html)
 */
public interface CfnSubnetGroupProps {
  /**
   * The name for the cache subnet group. This value is stored as a lowercase string.
   *
   * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
   *
   * Example: `mysubnetgroup`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
   */
  public fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  /**
   * The description for the cache subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
   */
  public fun description(): String

  /**
   * The EC2 subnet IDs for the cache subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * A tag that can be added to an ElastiCache subnet group.
   *
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your subnet
   * groups. A tag with a null Value is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheSubnetGroupName The name for the cache subnet group. This value is stored as a
     * lowercase string.
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    /**
     * @param description The description for the cache subnet group. 
     */
    public fun description(description: String)

    /**
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags A tag that can be added to an ElastiCache subnet group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag that can be added to an ElastiCache subnet group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder
        = software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.builder()

    /**
     * @param cacheSubnetGroupName The name for the cache subnet group. This value is stored as a
     * lowercase string.
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     */
    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * @param description The description for the cache subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The EC2 subnet IDs for the cache subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags A tag that can be added to an ElastiCache subnet group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A tag that can be added to an ElastiCache subnet group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnSubnetGroupProps {
    /**
     * The name for the cache subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
     */
    override fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

    /**
     * The description for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps):
        CfnSubnetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSubnetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroupProps):
        software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps
  }
}
