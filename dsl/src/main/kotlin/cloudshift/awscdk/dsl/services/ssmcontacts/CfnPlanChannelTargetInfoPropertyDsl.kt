@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

@CdkDslMarker
public class CfnPlanChannelTargetInfoPropertyDsl {
  private val cdkBuilder: CfnPlan.ChannelTargetInfoProperty.Builder =
      CfnPlan.ChannelTargetInfoProperty.builder()

  /**
   * @param channelId The Amazon Resource Name (ARN) of the contact channel. 
   */
  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  /**
   * @param retryIntervalInMinutes The number of minutes to wait before retrying to send engagement
   * if the engagement initially failed. 
   */
  public fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
    cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
  }

  public fun build(): CfnPlan.ChannelTargetInfoProperty = cdkBuilder.build()
}
