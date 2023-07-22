@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.Builder =
      CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.builder()

  /**
   * @param currentVersion The version of the gateways that should receive the update.
   */
  public fun currentVersion(currentVersion: IResolvable) {
    cdkBuilder.currentVersion(currentVersion)
  }

  /**
   * @param currentVersion The version of the gateways that should receive the update.
   */
  public fun currentVersion(currentVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
    cdkBuilder.currentVersion(currentVersion)
  }

  /**
   * @param sigKeyCrc The CRC of the signature private key to check.
   */
  public fun sigKeyCrc(sigKeyCrc: Number) {
    cdkBuilder.sigKeyCrc(sigKeyCrc)
  }

  /**
   * @param updateSignature The signature used to verify the update firmware.
   */
  public fun updateSignature(updateSignature: String) {
    cdkBuilder.updateSignature(updateSignature)
  }

  /**
   * @param updateVersion The firmware version to update the gateway to.
   */
  public fun updateVersion(updateVersion: IResolvable) {
    cdkBuilder.updateVersion(updateVersion)
  }

  /**
   * @param updateVersion The firmware version to update the gateway to.
   */
  public fun updateVersion(updateVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
    cdkBuilder.updateVersion(updateVersion)
  }

  public fun build(): CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty = cdkBuilder.build()
}
