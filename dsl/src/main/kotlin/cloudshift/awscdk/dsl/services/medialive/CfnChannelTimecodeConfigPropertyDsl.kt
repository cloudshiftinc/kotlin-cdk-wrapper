@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTimecodeConfigPropertyDsl {
  private val cdkBuilder: CfnChannel.TimecodeConfigProperty.Builder =
      CfnChannel.TimecodeConfigProperty.builder()

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun syncThreshold(syncThreshold: Number) {
    cdkBuilder.syncThreshold(syncThreshold)
  }

  public fun build(): CfnChannel.TimecodeConfigProperty = cdkBuilder.build()
}
