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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnCampaignEventDimensionsPropertyDsl {
    private val cdkBuilder: CfnCampaign.EventDimensionsProperty.Builder =
        CfnCampaign.EventDimensionsProperty.builder()

    public fun attributes(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.attributes(builder.map)
    }

    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    public fun eventType(eventType: IResolvable) {
        cdkBuilder.eventType(eventType)
    }

    public fun eventType(eventType: CfnCampaign.SetDimensionProperty) {
        cdkBuilder.eventType(eventType)
    }

    public fun metrics(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.metrics(builder.map)
    }

    public fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
    }

    public fun build(): CfnCampaign.EventDimensionsProperty = cdkBuilder.build()
}
