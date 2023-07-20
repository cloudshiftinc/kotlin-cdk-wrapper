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
import kotlin.String

@CdkDslMarker
public class CfnChannelTimecodeBurninSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.TimecodeBurninSettingsProperty.Builder =
        CfnChannel.TimecodeBurninSettingsProperty.builder()

    public fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnChannel.TimecodeBurninSettingsProperty = cdkBuilder.build()
}
