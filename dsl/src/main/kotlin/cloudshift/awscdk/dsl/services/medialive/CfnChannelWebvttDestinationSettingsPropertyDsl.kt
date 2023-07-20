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
public class CfnChannelWebvttDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.WebvttDestinationSettingsProperty.Builder =
        CfnChannel.WebvttDestinationSettingsProperty.builder()

    public fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
    }

    public fun build(): CfnChannel.WebvttDestinationSettingsProperty = cdkBuilder.build()
}
