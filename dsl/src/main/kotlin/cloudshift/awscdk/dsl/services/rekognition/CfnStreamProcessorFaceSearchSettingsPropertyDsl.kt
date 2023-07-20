@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorFaceSearchSettingsPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.FaceSearchSettingsProperty.Builder =
      CfnStreamProcessor.FaceSearchSettingsProperty.builder()

  public fun collectionId(collectionId: String) {
    cdkBuilder.collectionId(collectionId)
  }

  public fun faceMatchThreshold(faceMatchThreshold: Number) {
    cdkBuilder.faceMatchThreshold(faceMatchThreshold)
  }

  public fun build(): CfnStreamProcessor.FaceSearchSettingsProperty = cdkBuilder.build()
}
