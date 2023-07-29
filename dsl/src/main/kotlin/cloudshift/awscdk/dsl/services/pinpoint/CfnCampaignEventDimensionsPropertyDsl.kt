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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the dimensions for an event filter that determines when a campaign is sent or a journey
 * activity is performed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * EventDimensionsProperty eventDimensionsProperty = EventDimensionsProperty.builder()
 * .attributes(attributes)
 * .eventType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .metrics(metrics)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html)
 */
@CdkDslMarker
public class CfnCampaignEventDimensionsPropertyDsl {
    private val cdkBuilder: CfnCampaign.EventDimensionsProperty.Builder =
        CfnCampaign.EventDimensionsProperty.builder()

    /**
     * @param attributes One or more custom attributes that your application reports to Amazon
     *   Pinpoint. You can use these attributes as selection criteria when you create an event
     *   filter.
     */
    public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributes)
        cdkBuilder.attributes(builder.map)
    }

    /**
     * @param attributes One or more custom attributes that your application reports to Amazon
     *   Pinpoint. You can use these attributes as selection criteria when you create an event
     *   filter.
     */
    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param eventType The name of the event that causes the campaign to be sent or the journey
     *   activity to be performed. This can be a standard event that Amazon Pinpoint generates, such
     *   as `_email.delivered` or `_custom.delivered` . For campaigns, this can also be a custom
     *   event that's specific to your application. For information about standard events, see
     *   [Streaming Amazon Pinpoint Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html)
     *   in the *Amazon Pinpoint Developer Guide* .
     */
    public fun eventType(eventType: IResolvable) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param eventType The name of the event that causes the campaign to be sent or the journey
     *   activity to be performed. This can be a standard event that Amazon Pinpoint generates, such
     *   as `_email.delivered` or `_custom.delivered` . For campaigns, this can also be a custom
     *   event that's specific to your application. For information about standard events, see
     *   [Streaming Amazon Pinpoint Events](https://docs.aws.amazon.com/pinpoint/latest/developerguide/event-streams.html)
     *   in the *Amazon Pinpoint Developer Guide* .
     */
    public fun eventType(eventType: CfnCampaign.SetDimensionProperty) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param metrics One or more custom metrics that your application reports to Amazon Pinpoint .
     *   You can use these metrics as selection criteria when you create an event filter.
     */
    public fun metrics(metrics: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(metrics)
        cdkBuilder.metrics(builder.map)
    }

    /**
     * @param metrics One or more custom metrics that your application reports to Amazon Pinpoint .
     *   You can use these metrics as selection criteria when you create an event filter.
     */
    public fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
    }

    public fun build(): CfnCampaign.EventDimensionsProperty = cdkBuilder.build()
}
