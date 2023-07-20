@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestObdSignalDecoderPropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.ObdSignalDecoderProperty.Builder =
      CfnDecoderManifest.ObdSignalDecoderProperty.builder()

  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  public fun obdSignal(obdSignal: IResolvable) {
    cdkBuilder.obdSignal(obdSignal)
  }

  public fun obdSignal(obdSignal: CfnDecoderManifest.ObdSignalProperty) {
    cdkBuilder.obdSignal(obdSignal)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.ObdSignalDecoderProperty = cdkBuilder.build()
}
