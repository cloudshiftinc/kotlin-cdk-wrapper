@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGeospatialWindowOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GeospatialWindowOptionsProperty.Builder =
      CfnAnalysis.GeospatialWindowOptionsProperty.builder()

  public fun bounds(bounds: IResolvable) {
    cdkBuilder.bounds(bounds)
  }

  public fun bounds(bounds: CfnAnalysis.GeospatialCoordinateBoundsProperty) {
    cdkBuilder.bounds(bounds)
  }

  public fun mapZoomMode(mapZoomMode: String) {
    cdkBuilder.mapZoomMode(mapZoomMode)
  }

  public fun build(): CfnAnalysis.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
