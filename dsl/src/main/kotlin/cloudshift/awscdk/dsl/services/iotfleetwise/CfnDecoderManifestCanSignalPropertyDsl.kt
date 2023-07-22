@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestCanSignalPropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.CanSignalProperty.Builder =
      CfnDecoderManifest.CanSignalProperty.builder()

  /**
   * @param factor A multiplier used to decode the CAN message. 
   */
  public fun factor(factor: String) {
    cdkBuilder.factor(factor)
  }

  /**
   * @param isBigEndian Whether the byte ordering of a CAN message is big-endian. 
   */
  public fun isBigEndian(isBigEndian: String) {
    cdkBuilder.isBigEndian(isBigEndian)
  }

  /**
   * @param isSigned Whether the message data is specified as a signed value. 
   */
  public fun isSigned(isSigned: String) {
    cdkBuilder.isSigned(isSigned)
  }

  /**
   * @param length How many bytes of data are in the message. 
   */
  public fun length(length: String) {
    cdkBuilder.length(length)
  }

  /**
   * @param messageId The ID of the message. 
   */
  public fun messageId(messageId: String) {
    cdkBuilder.messageId(messageId)
  }

  /**
   * @param name (Optional) The name of the signal.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param offset The offset used to calculate the signal value. 
   * Combined with factor, the calculation is `value = raw_value * factor + offset` .
   */
  public fun offset(offset: String) {
    cdkBuilder.offset(offset)
  }

  /**
   * @param startBit Indicates the beginning of the CAN message. 
   */
  public fun startBit(startBit: String) {
    cdkBuilder.startBit(startBit)
  }

  public fun build(): CfnDecoderManifest.CanSignalProperty = cdkBuilder.build()
}
