@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String

/**
 * Specifies the settings for events that cause a campaign to be sent.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * CampaignEventFilterProperty campaignEventFilterProperty = CampaignEventFilterProperty.builder()
 * .dimensions(EventDimensionsProperty.builder()
 * .attributes(attributes)
 * .eventType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .metrics(metrics)
 * .build())
 * .filterType("filterType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignEventFilterPropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignEventFilterProperty.Builder =
        CfnCampaign.CampaignEventFilterProperty.builder()

    /**
     * @param dimensions The dimension settings of the event filter for the campaign.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param dimensions The dimension settings of the event filter for the campaign.
     */
    public fun dimensions(dimensions: CfnCampaign.EventDimensionsProperty) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param filterType The type of event that causes the campaign to be sent.
     * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT` ,
     * sends the campaign when an endpoint event (Events resource) occurs.
     */
    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    public fun build(): CfnCampaign.CampaignEventFilterProperty = cdkBuilder.build()
}
