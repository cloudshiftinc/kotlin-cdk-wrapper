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

  /**
   * @param collectionId The ID of a collection that contains faces that you want to search for. 
   */
  public fun collectionId(collectionId: String) {
    cdkBuilder.collectionId(collectionId)
  }

  /**
   * @param faceMatchThreshold Minimum face match confidence score that must be met to return a
   * result for a recognized face.
   * The default is 80. 0 is the lowest confidence. 100 is the highest confidence. Values between 0
   * and 100 are accepted, and values lower than 80 are set to 80.
   */
  public fun faceMatchThreshold(faceMatchThreshold: Number) {
    cdkBuilder.faceMatchThreshold(faceMatchThreshold)
  }

  public fun build(): CfnStreamProcessor.FaceSearchSettingsProperty = cdkBuilder.build()
}
