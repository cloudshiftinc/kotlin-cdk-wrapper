@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigTrackingConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.TrackingConfigProperty.Builder =
      CfnConfig.TrackingConfigProperty.builder()

  public fun autotrack(autotrack: String) {
    cdkBuilder.autotrack(autotrack)
  }

  public fun build(): CfnConfig.TrackingConfigProperty = cdkBuilder.build()
}
