@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import kotlin.Number

@CdkDslMarker
public class CfnCampaignProgressiveDialerConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.ProgressiveDialerConfigProperty.Builder =
        CfnCampaign.ProgressiveDialerConfigProperty.builder()

    public fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
    }

    public fun build(): CfnCampaign.ProgressiveDialerConfigProperty = cdkBuilder.build()
}
