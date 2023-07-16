@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTeletextSourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TeletextSourceSettingsProperty.Builder =
      CfnChannel.TeletextSourceSettingsProperty.builder()

  public fun outputRectangle(outputRectangle: IResolvable) {
    cdkBuilder.outputRectangle(outputRectangle)
  }

  public fun outputRectangle(outputRectangle: CfnChannel.CaptionRectangleProperty) {
    cdkBuilder.outputRectangle(outputRectangle)
  }

  public fun pageNumber(pageNumber: String) {
    cdkBuilder.pageNumber(pageNumber)
  }

  public fun build(): CfnChannel.TeletextSourceSettingsProperty = cdkBuilder.build()
}
