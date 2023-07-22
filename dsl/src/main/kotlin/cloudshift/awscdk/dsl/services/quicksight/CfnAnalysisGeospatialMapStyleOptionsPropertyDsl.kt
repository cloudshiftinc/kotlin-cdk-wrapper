@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGeospatialMapStyleOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GeospatialMapStyleOptionsProperty.Builder =
      CfnAnalysis.GeospatialMapStyleOptionsProperty.builder()

  /**
   * @param baseMapStyle The base map style of the geospatial map.
   */
  public fun baseMapStyle(baseMapStyle: String) {
    cdkBuilder.baseMapStyle(baseMapStyle)
  }

  public fun build(): CfnAnalysis.GeospatialMapStyleOptionsProperty = cdkBuilder.build()
}
