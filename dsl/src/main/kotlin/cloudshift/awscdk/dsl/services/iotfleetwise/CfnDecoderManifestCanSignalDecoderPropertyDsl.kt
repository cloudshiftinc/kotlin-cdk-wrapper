@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestCanSignalDecoderPropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.CanSignalDecoderProperty.Builder =
      CfnDecoderManifest.CanSignalDecoderProperty.builder()

  public fun canSignal(canSignal: IResolvable) {
    cdkBuilder.canSignal(canSignal)
  }

  public fun canSignal(canSignal: CfnDecoderManifest.CanSignalProperty) {
    cdkBuilder.canSignal(canSignal)
  }

  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.CanSignalDecoderProperty = cdkBuilder.build()
}
