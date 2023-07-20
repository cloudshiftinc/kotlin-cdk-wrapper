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
public class CfnChannelEsamPropertyDsl {
    private val cdkBuilder: CfnChannel.EsamProperty.Builder = CfnChannel.EsamProperty.builder()

    public fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
    }

    public fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
    }

    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    public fun poisEndpoint(poisEndpoint: String) {
        cdkBuilder.poisEndpoint(poisEndpoint)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun zoneIdentity(zoneIdentity: String) {
        cdkBuilder.zoneIdentity(zoneIdentity)
    }

    public fun build(): CfnChannel.EsamProperty = cdkBuilder.build()
}
