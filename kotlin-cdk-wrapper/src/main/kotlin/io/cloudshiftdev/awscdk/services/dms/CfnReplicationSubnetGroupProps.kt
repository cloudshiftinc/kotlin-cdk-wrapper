@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReplicationSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnReplicationSubnetGroupProps cfnReplicationSubnetGroupProps =
 * CfnReplicationSubnetGroupProps.builder()
 * .replicationSubnetGroupDescription("replicationSubnetGroupDescription")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
 */
public interface CfnReplicationSubnetGroupProps {
  /**
   * The description for the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
   */
  public fun replicationSubnetGroupDescription(): String

  /**
   * The identifier for the replication subnet group.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
   */
  public fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * One or more tags to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnReplicationSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param replicationSubnetGroupDescription The description for the subnet group. 
     */
    public fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String)

    /**
     * @param replicationSubnetGroupIdentifier The identifier for the replication subnet group.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the identifier.
     */
    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    /**
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags One or more tags to be assigned to the subnet group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags to be assigned to the subnet group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.builder()

    /**
     * @param replicationSubnetGroupDescription The description for the subnet group. 
     */
    override fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String) {
      cdkBuilder.replicationSubnetGroupDescription(replicationSubnetGroupDescription)
    }

    /**
     * @param replicationSubnetGroupIdentifier The identifier for the replication subnet group.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the identifier.
     */
    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    /**
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags One or more tags to be assigned to the subnet group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags One or more tags to be assigned to the subnet group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnReplicationSubnetGroupProps {
    /**
     * The description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
     */
    override fun replicationSubnetGroupDescription(): String =
        unwrap(this).getReplicationSubnetGroupDescription()

    /**
     * The identifier for the replication subnet group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
     */
    override fun replicationSubnetGroupIdentifier(): String? =
        unwrap(this).getReplicationSubnetGroupIdentifier()

    /**
     * One or more subnet IDs to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * One or more tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps):
        CfnReplicationSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSubnetGroupProps):
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
  }
}
