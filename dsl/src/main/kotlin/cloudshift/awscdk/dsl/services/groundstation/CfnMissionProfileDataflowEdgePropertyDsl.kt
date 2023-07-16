@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

@CdkDslMarker
public class CfnMissionProfileDataflowEdgePropertyDsl {
  private val cdkBuilder: CfnMissionProfile.DataflowEdgeProperty.Builder =
      CfnMissionProfile.DataflowEdgeProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnMissionProfile.DataflowEdgeProperty = cdkBuilder.build()
}
