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

  /**
   * @param canSignal the value to be set. 
   */
  public fun canSignal(canSignal: IResolvable) {
    cdkBuilder.canSignal(canSignal)
  }

  /**
   * @param canSignal the value to be set. 
   */
  public fun canSignal(canSignal: CfnDecoderManifest.CanSignalProperty) {
    cdkBuilder.canSignal(canSignal)
  }

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
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.CanSignalDecoderProperty = cdkBuilder.build()
}
