@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorBoundingBoxPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.BoundingBoxProperty.Builder =
      CfnStreamProcessor.BoundingBoxProperty.builder()

  /**
   * @param height Height of the bounding box as a ratio of the overall image height. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param left Left coordinate of the bounding box as a ratio of overall image width. 
   */
  public fun left(left: Number) {
    cdkBuilder.left(left)
  }

  /**
   * @param top Top coordinate of the bounding box as a ratio of overall image height. 
   */
  public fun top(top: Number) {
    cdkBuilder.top(top)
  }

  /**
   * @param width Width of the bounding box as a ratio of the overall image width. 
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnStreamProcessor.BoundingBoxProperty = cdkBuilder.build()
}
