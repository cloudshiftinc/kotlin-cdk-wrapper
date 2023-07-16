@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServicePlacementStrategyPropertyDsl {
  private val cdkBuilder: CfnService.PlacementStrategyProperty.Builder =
      CfnService.PlacementStrategyProperty.builder()

  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.PlacementStrategyProperty = cdkBuilder.build()
}
