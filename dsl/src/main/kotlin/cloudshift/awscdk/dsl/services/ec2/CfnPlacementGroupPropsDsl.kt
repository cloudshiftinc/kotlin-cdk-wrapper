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
import software.amazon.awscdk.services.ec2.CfnPlacementGroupProps

@CdkDslMarker
public class CfnPlacementGroupPropsDsl {
  private val cdkBuilder: CfnPlacementGroupProps.Builder = CfnPlacementGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param partitionCount The number of partitions.
   * Valid only when *Strategy* is set to `partition` .
   */
  public fun partitionCount(partitionCount: Number) {
    cdkBuilder.partitionCount(partitionCount)
  }

  /**
   * @param spreadLevel Determines how placement groups spread instances.
   * * Host – You can use `host` only with Outpost placement groups.
   * * Rack – No usage restrictions.
   */
  public fun spreadLevel(spreadLevel: String) {
    cdkBuilder.spreadLevel(spreadLevel)
  }

  /**
   * @param strategy The placement strategy.
   */
  public fun strategy(strategy: String) {
    cdkBuilder.strategy(strategy)
  }

  /**
   * @param tags The tags to apply to the new placement group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to apply to the new placement group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPlacementGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
