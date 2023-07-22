@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelDvbTdtSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.DvbTdtSettingsProperty.Builder =
      CfnChannel.DvbTdtSettingsProperty.builder()

  /**
   * @param repInterval The number of milliseconds between instances of this table in the output
   * transport stream.
   */
  public fun repInterval(repInterval: Number) {
    cdkBuilder.repInterval(repInterval)
  }

  public fun build(): CfnChannel.DvbTdtSettingsProperty = cdkBuilder.build()
}
