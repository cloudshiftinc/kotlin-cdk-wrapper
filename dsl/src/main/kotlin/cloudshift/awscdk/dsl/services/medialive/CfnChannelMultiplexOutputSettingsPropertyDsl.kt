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
public class CfnChannelMultiplexOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MultiplexOutputSettingsProperty.Builder =
        CfnChannel.MultiplexOutputSettingsProperty.builder()

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnChannel.MultiplexOutputSettingsProperty = cdkBuilder.build()
}
