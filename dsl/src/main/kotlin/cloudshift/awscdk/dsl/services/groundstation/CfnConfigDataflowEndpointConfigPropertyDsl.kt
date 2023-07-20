@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigDataflowEndpointConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.DataflowEndpointConfigProperty.Builder =
      CfnConfig.DataflowEndpointConfigProperty.builder()

  public fun dataflowEndpointName(dataflowEndpointName: String) {
    cdkBuilder.dataflowEndpointName(dataflowEndpointName)
  }

  public fun dataflowEndpointRegion(dataflowEndpointRegion: String) {
    cdkBuilder.dataflowEndpointRegion(dataflowEndpointRegion)
  }

  public fun build(): CfnConfig.DataflowEndpointConfigProperty = cdkBuilder.build()
}
