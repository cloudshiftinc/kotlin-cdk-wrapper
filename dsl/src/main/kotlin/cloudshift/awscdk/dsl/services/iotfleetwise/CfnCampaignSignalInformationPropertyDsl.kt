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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnCampaignSignalInformationPropertyDsl {
    private val cdkBuilder: CfnCampaign.SignalInformationProperty.Builder =
        CfnCampaign.SignalInformationProperty.builder()

    public fun maxSampleCount(maxSampleCount: Number) {
        cdkBuilder.maxSampleCount(maxSampleCount)
    }

    public fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number) {
        cdkBuilder.minimumSamplingIntervalMs(minimumSamplingIntervalMs)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnCampaign.SignalInformationProperty = cdkBuilder.build()
}
