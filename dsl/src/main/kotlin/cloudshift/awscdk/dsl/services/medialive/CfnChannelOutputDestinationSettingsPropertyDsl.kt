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
public class CfnChannelOutputDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputDestinationSettingsProperty.Builder =
        CfnChannel.OutputDestinationSettingsProperty.builder()

    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnChannel.OutputDestinationSettingsProperty = cdkBuilder.build()
}
