@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardClusterMarkerPropertyDsl {
  private val cdkBuilder: CfnDashboard.ClusterMarkerProperty.Builder =
      CfnDashboard.ClusterMarkerProperty.builder()

  public fun simpleClusterMarker(simpleClusterMarker: IResolvable) {
    cdkBuilder.simpleClusterMarker(simpleClusterMarker)
  }

  public fun simpleClusterMarker(simpleClusterMarker: CfnDashboard.SimpleClusterMarkerProperty) {
    cdkBuilder.simpleClusterMarker(simpleClusterMarker)
  }

  public fun build(): CfnDashboard.ClusterMarkerProperty = cdkBuilder.build()
}
