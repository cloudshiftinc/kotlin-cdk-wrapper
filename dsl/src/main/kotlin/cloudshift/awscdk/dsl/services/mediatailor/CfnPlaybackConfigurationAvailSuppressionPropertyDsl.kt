@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationAvailSuppressionPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder =
      CfnPlaybackConfiguration.AvailSuppressionProperty.builder()

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPlaybackConfiguration.AvailSuppressionProperty = cdkBuilder.build()
}
