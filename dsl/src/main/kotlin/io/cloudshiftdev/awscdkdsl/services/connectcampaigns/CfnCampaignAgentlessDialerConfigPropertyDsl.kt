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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains agentless dialer configuration for an outbound campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * AgentlessDialerConfigProperty agentlessDialerConfigProperty =
 * AgentlessDialerConfigProperty.builder()
 * .dialingCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-agentlessdialerconfig.html)
 */
@CdkDslMarker
public class CfnCampaignAgentlessDialerConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.AgentlessDialerConfigProperty.Builder =
        CfnCampaign.AgentlessDialerConfigProperty.builder()

    /**
     * @param dialingCapacity The allocation of dialing capacity between multiple active campaigns.
     */
    public fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
    }

    public fun build(): CfnCampaign.AgentlessDialerConfigProperty = cdkBuilder.build()
}
