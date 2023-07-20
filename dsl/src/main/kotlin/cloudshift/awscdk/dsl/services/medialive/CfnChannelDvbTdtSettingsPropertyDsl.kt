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

@CdkDslMarker
public class CfnChannelDvbTdtSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbTdtSettingsProperty.Builder =
        CfnChannel.DvbTdtSettingsProperty.builder()

    public fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
    }

    public fun build(): CfnChannel.DvbTdtSettingsProperty = cdkBuilder.build()
}
