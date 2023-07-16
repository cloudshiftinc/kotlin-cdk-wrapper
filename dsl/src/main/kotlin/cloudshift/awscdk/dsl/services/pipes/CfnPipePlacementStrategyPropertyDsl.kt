@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePlacementStrategyPropertyDsl {
  private val cdkBuilder: CfnPipe.PlacementStrategyProperty.Builder =
      CfnPipe.PlacementStrategyProperty.builder()

  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipe.PlacementStrategyProperty = cdkBuilder.build()
}
