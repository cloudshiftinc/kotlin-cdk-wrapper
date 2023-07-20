@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionRectanglePropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionRectangleProperty.Builder =
      CfnChannel.CaptionRectangleProperty.builder()

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun leftOffset(leftOffset: Number) {
    cdkBuilder.leftOffset(leftOffset)
  }

  public fun topOffset(topOffset: Number) {
    cdkBuilder.topOffset(topOffset)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnChannel.CaptionRectangleProperty = cdkBuilder.build()
}
