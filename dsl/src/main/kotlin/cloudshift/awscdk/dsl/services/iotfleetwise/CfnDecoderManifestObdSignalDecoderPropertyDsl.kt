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

  /**
   * @param fullyQualifiedName the value to be set. 
   */
  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  /**
   * @param interfaceId the value to be set. 
   */
  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  /**
   * @param obdSignal the value to be set. 
   */
  public fun obdSignal(obdSignal: IResolvable) {
    cdkBuilder.obdSignal(obdSignal)
  }

  /**
   * @param obdSignal the value to be set. 
   */
  public fun obdSignal(obdSignal: CfnDecoderManifest.ObdSignalProperty) {
    cdkBuilder.obdSignal(obdSignal)
  }

  /**
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.ObdSignalDecoderProperty = cdkBuilder.build()
}
