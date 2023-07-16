@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialWindowOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialWindowOptionsProperty.Builder =
      CfnTemplate.GeospatialWindowOptionsProperty.builder()

  public fun bounds(bounds: IResolvable) {
    cdkBuilder.bounds(bounds)
  }

  public fun bounds(bounds: CfnTemplate.GeospatialCoordinateBoundsProperty) {
    cdkBuilder.bounds(bounds)
  }

  public fun mapZoomMode(mapZoomMode: String) {
    cdkBuilder.mapZoomMode(mapZoomMode)
  }

  public fun build(): CfnTemplate.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
