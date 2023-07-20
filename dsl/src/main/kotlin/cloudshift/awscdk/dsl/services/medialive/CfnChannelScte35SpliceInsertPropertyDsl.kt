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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelScte35SpliceInsertPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte35SpliceInsertProperty.Builder =
        CfnChannel.Scte35SpliceInsertProperty.builder()

    public fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
    }

    public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
        cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
    }

    public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
        cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
    }

    public fun build(): CfnChannel.Scte35SpliceInsertProperty = cdkBuilder.build()
}
