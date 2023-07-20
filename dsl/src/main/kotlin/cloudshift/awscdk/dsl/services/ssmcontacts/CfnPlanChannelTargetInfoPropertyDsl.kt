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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPlanChannelTargetInfoPropertyDsl {
    private val cdkBuilder: CfnPlan.ChannelTargetInfoProperty.Builder =
        CfnPlan.ChannelTargetInfoProperty.builder()

    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    public fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
        cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
    }

    public fun build(): CfnPlan.ChannelTargetInfoProperty = cdkBuilder.build()
}
