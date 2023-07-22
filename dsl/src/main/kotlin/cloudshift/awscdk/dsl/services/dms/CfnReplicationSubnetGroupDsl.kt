@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnReplicationSubnetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReplicationSubnetGroup.Builder =
      CfnReplicationSubnetGroup.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description for the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
   * @param replicationSubnetGroupDescription The description for the subnet group. 
   */
  public fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String) {
    cdkBuilder.replicationSubnetGroupDescription(replicationSubnetGroupDescription)
  }

  /**
   * The identifier for the replication subnet group.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
   * @param replicationSubnetGroupIdentifier The identifier for the replication subnet group. 
   */
  public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
    cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
  }

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
   * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
   * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * One or more tags to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
   * @param tags One or more tags to be assigned to the subnet group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * One or more tags to be assigned to the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
   * @param tags One or more tags to be assigned to the subnet group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnReplicationSubnetGroup {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
