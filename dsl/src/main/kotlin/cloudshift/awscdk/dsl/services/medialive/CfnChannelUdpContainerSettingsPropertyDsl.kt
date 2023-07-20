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

@CdkDslMarker
public class CfnChannelUdpContainerSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.UdpContainerSettingsProperty.Builder =
        CfnChannel.UdpContainerSettingsProperty.builder()

    public fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings)
    }

    public fun m2TsSettings(m2TsSettings: CfnChannel.M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings)
    }

    public fun build(): CfnChannel.UdpContainerSettingsProperty = cdkBuilder.build()
}
