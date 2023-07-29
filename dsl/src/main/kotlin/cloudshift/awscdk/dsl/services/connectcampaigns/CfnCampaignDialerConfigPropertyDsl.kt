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

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains dialer configuration for an outbound campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * DialerConfigProperty dialerConfigProperty = DialerConfigProperty.builder()
 * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html)
 */
@CdkDslMarker
public class CfnCampaignDialerConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.DialerConfigProperty.Builder =
        CfnCampaign.DialerConfigProperty.builder()

    /** @param predictiveDialerConfig The configuration of the predictive dialer. */
    public fun predictiveDialerConfig(predictiveDialerConfig: IResolvable) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig)
    }

    /** @param predictiveDialerConfig The configuration of the predictive dialer. */
    public fun predictiveDialerConfig(
        predictiveDialerConfig: CfnCampaign.PredictiveDialerConfigProperty
    ) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig)
    }

    /** @param progressiveDialerConfig The configuration of the progressive dialer. */
    public fun progressiveDialerConfig(progressiveDialerConfig: IResolvable) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig)
    }

    /** @param progressiveDialerConfig The configuration of the progressive dialer. */
    public fun progressiveDialerConfig(
        progressiveDialerConfig: CfnCampaign.ProgressiveDialerConfigProperty
    ) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig)
    }

    public fun build(): CfnCampaign.DialerConfigProperty = cdkBuilder.build()
}
