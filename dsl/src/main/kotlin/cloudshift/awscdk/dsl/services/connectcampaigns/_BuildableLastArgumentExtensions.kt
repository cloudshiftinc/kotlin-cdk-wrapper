@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import kotlin.Unit
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

public inline fun CfnCampaign.setDialerConfig(block: CfnCampaignDialerConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCampaignDialerConfigPropertyDsl()
  builder.apply(block)
  return setDialerConfig(builder.build())
}

public inline
    fun CfnCampaign.setOutboundCallConfig(block: CfnCampaignOutboundCallConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCampaignOutboundCallConfigPropertyDsl()
  builder.apply(block)
  return setOutboundCallConfig(builder.build())
}
