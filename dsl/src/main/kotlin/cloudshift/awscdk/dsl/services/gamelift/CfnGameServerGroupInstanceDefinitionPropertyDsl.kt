@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupInstanceDefinitionPropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.InstanceDefinitionProperty.Builder =
      CfnGameServerGroup.InstanceDefinitionProperty.builder()

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun weightedCapacity(weightedCapacity: String) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnGameServerGroup.InstanceDefinitionProperty = cdkBuilder.build()
}
