@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssmcontacts.CfnContact

@CdkDslMarker
public class CfnContactChannelTargetInfoPropertyDsl {
  private val cdkBuilder: CfnContact.ChannelTargetInfoProperty.Builder =
      CfnContact.ChannelTargetInfoProperty.builder()

  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  public fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
    cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
  }

  public fun build(): CfnContact.ChannelTargetInfoProperty = cdkBuilder.build()
}
