@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.connectcampaigns

import kotlin.Unit
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/** Contains information about the dialer configuration. */
public inline fun CfnCampaign.setDialerConfig(
    block: CfnCampaignDialerConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignDialerConfigPropertyDsl()
    builder.apply(block)
    return setDialerConfig(builder.build())
}

/** Contains information about the outbound call configuration. */
public inline fun CfnCampaign.setOutboundCallConfig(
    block: CfnCampaignOutboundCallConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignOutboundCallConfigPropertyDsl()
    builder.apply(block)
    return setOutboundCallConfig(builder.build())
}
