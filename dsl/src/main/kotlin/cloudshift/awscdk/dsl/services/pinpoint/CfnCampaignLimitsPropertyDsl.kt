@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignLimitsPropertyDsl {
  private val cdkBuilder: CfnCampaign.LimitsProperty.Builder = CfnCampaign.LimitsProperty.builder()

  public fun daily(daily: Number) {
    cdkBuilder.daily(daily)
  }

  public fun maximumDuration(maximumDuration: Number) {
    cdkBuilder.maximumDuration(maximumDuration)
  }

  public fun messagesPerSecond(messagesPerSecond: Number) {
    cdkBuilder.messagesPerSecond(messagesPerSecond)
  }

  public fun session(session: Number) {
    cdkBuilder.session(session)
  }

  public fun total(total: Number) {
    cdkBuilder.total(total)
  }

  public fun build(): CfnCampaign.LimitsProperty = cdkBuilder.build()
}
