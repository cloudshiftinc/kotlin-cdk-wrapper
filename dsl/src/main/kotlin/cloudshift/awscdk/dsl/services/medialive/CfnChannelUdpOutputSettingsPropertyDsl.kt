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

@CdkDslMarker
public class CfnChannelUdpOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.UdpOutputSettingsProperty.Builder =
        CfnChannel.UdpOutputSettingsProperty.builder()

    public fun bufferMsec(bufferMsec: Number) {
        cdkBuilder.bufferMsec(bufferMsec)
    }

    public fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings)
    }

    public fun containerSettings(containerSettings: CfnChannel.UdpContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun fecOutputSettings(fecOutputSettings: IResolvable) {
        cdkBuilder.fecOutputSettings(fecOutputSettings)
    }

    public fun fecOutputSettings(fecOutputSettings: CfnChannel.FecOutputSettingsProperty) {
        cdkBuilder.fecOutputSettings(fecOutputSettings)
    }

    public fun build(): CfnChannel.UdpOutputSettingsProperty = cdkBuilder.build()
}
