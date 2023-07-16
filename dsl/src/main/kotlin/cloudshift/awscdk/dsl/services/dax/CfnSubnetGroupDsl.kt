@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnSubnetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubnetGroup.Builder = CfnSubnetGroup.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnSubnetGroup {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
