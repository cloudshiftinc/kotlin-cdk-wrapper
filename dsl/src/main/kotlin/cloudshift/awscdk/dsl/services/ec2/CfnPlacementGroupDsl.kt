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

  public fun partitionCount(partitionCount: Number) {
    cdkBuilder.partitionCount(partitionCount)
  }

  public fun spreadLevel(spreadLevel: String) {
    cdkBuilder.spreadLevel(spreadLevel)
  }

  public fun strategy(strategy: String) {
    cdkBuilder.strategy(strategy)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPlacementGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
