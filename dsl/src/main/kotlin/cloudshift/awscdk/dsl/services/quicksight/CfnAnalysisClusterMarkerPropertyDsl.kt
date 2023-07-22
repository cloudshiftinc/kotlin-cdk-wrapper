@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisClusterMarkerPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ClusterMarkerProperty.Builder =
      CfnAnalysis.ClusterMarkerProperty.builder()

  /**
   * @param simpleClusterMarker The simple cluster marker of the cluster marker.
   */
  public fun simpleClusterMarker(simpleClusterMarker: IResolvable) {
    cdkBuilder.simpleClusterMarker(simpleClusterMarker)
  }

  /**
   * @param simpleClusterMarker The simple cluster marker of the cluster marker.
   */
  public fun simpleClusterMarker(simpleClusterMarker: CfnAnalysis.SimpleClusterMarkerProperty) {
    cdkBuilder.simpleClusterMarker(simpleClusterMarker)
  }

  public fun build(): CfnAnalysis.ClusterMarkerProperty = cdkBuilder.build()
}
