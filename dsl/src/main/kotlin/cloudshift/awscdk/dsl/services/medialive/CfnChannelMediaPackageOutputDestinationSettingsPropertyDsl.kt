@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder =
      CfnChannel.MediaPackageOutputDestinationSettingsProperty.builder()

  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  public fun build(): CfnChannel.MediaPackageOutputDestinationSettingsProperty = cdkBuilder.build()
}
