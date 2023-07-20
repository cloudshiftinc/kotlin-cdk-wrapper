@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestObdSignalPropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.ObdSignalProperty.Builder =
      CfnDecoderManifest.ObdSignalProperty.builder()

  public fun bitMaskLength(bitMaskLength: String) {
    cdkBuilder.bitMaskLength(bitMaskLength)
  }

  public fun bitRightShift(bitRightShift: String) {
    cdkBuilder.bitRightShift(bitRightShift)
  }

  public fun byteLength(byteLength: String) {
    cdkBuilder.byteLength(byteLength)
  }

  public fun offset(offset: String) {
    cdkBuilder.offset(offset)
  }

  public fun pid(pid: String) {
    cdkBuilder.pid(pid)
  }

  public fun pidResponseLength(pidResponseLength: String) {
    cdkBuilder.pidResponseLength(pidResponseLength)
  }

  public fun scaling(scaling: String) {
    cdkBuilder.scaling(scaling)
  }

  public fun serviceMode(serviceMode: String) {
    cdkBuilder.serviceMode(serviceMode)
  }

  public fun startByte(startByte: String) {
    cdkBuilder.startByte(startByte)
  }

  public fun build(): CfnDecoderManifest.ObdSignalProperty = cdkBuilder.build()
}
