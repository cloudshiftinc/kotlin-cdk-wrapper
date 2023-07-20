@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoDescriptionPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoDescriptionProperty.Builder =
      CfnChannel.VideoDescriptionProperty.builder()

  public fun codecSettings(codecSettings: IResolvable) {
    cdkBuilder.codecSettings(codecSettings)
  }

  public fun codecSettings(codecSettings: CfnChannel.VideoCodecSettingsProperty) {
    cdkBuilder.codecSettings(codecSettings)
  }

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun respondToAfd(respondToAfd: String) {
    cdkBuilder.respondToAfd(respondToAfd)
  }

  public fun scalingBehavior(scalingBehavior: String) {
    cdkBuilder.scalingBehavior(scalingBehavior)
  }

  public fun sharpness(sharpness: Number) {
    cdkBuilder.sharpness(sharpness)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnChannel.VideoDescriptionProperty = cdkBuilder.build()
}
