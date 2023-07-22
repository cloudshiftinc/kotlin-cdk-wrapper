@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorPointPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.PointProperty.Builder =
      CfnStreamProcessor.PointProperty.builder()

  /**
   * @param x The X coordinate of the point. 
   */
  public fun x(x: Number) {
    cdkBuilder.x(x)
  }

  /**
   * @param y The Y coordinate of the point. 
   */
  public fun y(y: Number) {
    cdkBuilder.y(y)
  }

  public fun build(): CfnStreamProcessor.PointProperty = cdkBuilder.build()
}
