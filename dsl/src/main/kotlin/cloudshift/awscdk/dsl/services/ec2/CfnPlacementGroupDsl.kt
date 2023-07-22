@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnPlacementGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPlacementGroup.Builder = CfnPlacementGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The number of partitions.
   *
   * Valid only when *Strategy* is set to `partition` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
   * @param partitionCount The number of partitions. 
   */
  public fun partitionCount(partitionCount: Number) {
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
  public fun spreadLevel(spreadLevel: String) {
    cdkBuilder.spreadLevel(spreadLevel)
  }

  /**
   * The placement strategy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
   * @param strategy The placement strategy. 
   */
  public fun strategy(strategy: String) {
    cdkBuilder.strategy(strategy)
  }

  /**
   * The tags to apply to the new placement group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
   * @param tags The tags to apply to the new placement group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to apply to the new placement group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
   * @param tags The tags to apply to the new placement group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPlacementGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
