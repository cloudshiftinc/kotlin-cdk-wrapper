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
public class CfnChannelScte27SourceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte27SourceSettingsProperty.Builder =
        CfnChannel.Scte27SourceSettingsProperty.builder()

    public fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
    }

    public fun pid(pid: Number) {
        cdkBuilder.pid(pid)
    }

    public fun build(): CfnChannel.Scte27SourceSettingsProperty = cdkBuilder.build()
}
