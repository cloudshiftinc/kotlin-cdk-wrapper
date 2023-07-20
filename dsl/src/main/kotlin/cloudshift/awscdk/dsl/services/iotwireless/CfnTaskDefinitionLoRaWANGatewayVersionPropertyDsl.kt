@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.LoRaWANGatewayVersionProperty.Builder =
      CfnTaskDefinition.LoRaWANGatewayVersionProperty.builder()

  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  public fun packageVersion(packageVersion: String) {
    cdkBuilder.packageVersion(packageVersion)
  }

  public fun station(station: String) {
    cdkBuilder.station(station)
  }

  public fun build(): CfnTaskDefinition.LoRaWANGatewayVersionProperty = cdkBuilder.build()
}
