@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBSubnetGroupProps cfnDBSubnetGroupProps = CfnDBSubnetGroupProps.builder()
 * .dbSubnetGroupDescription("dbSubnetGroupDescription")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html)
 */
public interface CfnDBSubnetGroupProps {
  /**
   * The description for the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
   */
  public fun dbSubnetGroupDescription(): String

  /**
   * The name for the DB subnet group. This value is stored as a lowercase string.
   *
   * Constraints:
   *
   * * Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens.
   * * Must not be default.
   * * First character must be a letter.
   *
   * Example: `mydbsubnetgroup`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * The EC2 Subnet IDs for the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * Tags to assign to the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbSubnetGroupDescription The description for the DB subnet group. 
     */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String)

    /**
     * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
     * lowercase string.
     * Constraints:
     *
     * * Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens.
     * * Must not be default.
     * * First character must be a letter.
     *
     * Example: `mydbsubnetgroup`
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags Tags to assign to the DB subnet group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the DB subnet group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps.builder()

    /**
     * @param dbSubnetGroupDescription The description for the DB subnet group. 
     */
    override fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
      cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
     * lowercase string.
     * Constraints:
     *
     * * Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens.
     * * Must not be default.
     * * First character must be a letter.
     *
     * Example: `mydbsubnetgroup`
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags Tags to assign to the DB subnet group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the DB subnet group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps,
  ) : CdkObject(cdkObject),
      CfnDBSubnetGroupProps {
    /**
     * The description for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
     */
    override fun dbSubnetGroupDescription(): String = unwrap(this).getDbSubnetGroupDescription()

    /**
     * The name for the DB subnet group. This value is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens.
     * * Must not be default.
     * * First character must be a letter.
     *
     * Example: `mydbsubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * The EC2 Subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * Tags to assign to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps):
        CfnDBSubnetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBSubnetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSubnetGroupProps):
        software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps
  }
}
