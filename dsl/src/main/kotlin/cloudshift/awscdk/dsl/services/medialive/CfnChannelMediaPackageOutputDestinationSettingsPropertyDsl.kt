@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder =
      CfnChannel.MediaPackageOutputDestinationSettingsProperty.builder()

  /**
   * @param channelId The ID of the channel in MediaPackage that is the destination for this output
   * group.
   * You don't need to specify the individual inputs in MediaPackage; MediaLive handles the
   * connection of the two MediaLive pipelines to the two MediaPackage inputs. The MediaPackage channel
   * and MediaLive channel must be in the same Region.
   */
  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  public fun build(): CfnChannel.MediaPackageOutputDestinationSettingsProperty = cdkBuilder.build()
}
