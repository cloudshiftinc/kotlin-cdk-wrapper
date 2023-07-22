@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigTrackingConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.TrackingConfigProperty.Builder =
      CfnConfig.TrackingConfigProperty.builder()

  /**
   * @param autotrack Specifies whether or not to use autotrack.
   * `REMOVED` specifies that program track should only be used during the contact. `PREFERRED`
   * specifies that autotracking is preferred during the contact but fallback to program track if the
   * signal is lost. `REQUIRED` specifies that autotracking is required during the contact and not to
   * use program track if the signal is lost.
   */
  public fun autotrack(autotrack: String) {
    cdkBuilder.autotrack(autotrack)
  }

  public fun build(): CfnConfig.TrackingConfigProperty = cdkBuilder.build()
}
