@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder =
      CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.builder()

  /**
   * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
   */
  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
   */
  public fun loRaWan(loRaWan: CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param updateDataRole The IAM role used to read data from the S3 bucket.
   */
  public fun updateDataRole(updateDataRole: String) {
    cdkBuilder.updateDataRole(updateDataRole)
  }

  /**
   * @param updateDataSource The link to the S3 bucket.
   */
  public fun updateDataSource(updateDataSource: String) {
    cdkBuilder.updateDataSource(updateDataSource)
  }

  public fun build(): CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty = cdkBuilder.build()
}
