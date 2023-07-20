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

@CdkDslMarker
public class CfnCampaignTimeBasedCollectionSchemePropertyDsl {
    private val cdkBuilder: CfnCampaign.TimeBasedCollectionSchemeProperty.Builder =
        CfnCampaign.TimeBasedCollectionSchemeProperty.builder()

    public fun periodMs(periodMs: Number) {
        cdkBuilder.periodMs(periodMs)
    }

    public fun build(): CfnCampaign.TimeBasedCollectionSchemeProperty = cdkBuilder.build()
}
