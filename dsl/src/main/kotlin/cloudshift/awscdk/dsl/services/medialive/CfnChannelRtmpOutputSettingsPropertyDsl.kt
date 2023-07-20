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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelRtmpOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RtmpOutputSettingsProperty.Builder =
        CfnChannel.RtmpOutputSettingsProperty.builder()

    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    public fun build(): CfnChannel.RtmpOutputSettingsProperty = cdkBuilder.build()
}
