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
import software.amazon.awscdk.services.medialive.CfnInput
import kotlin.String

@CdkDslMarker
public class CfnInputInputDeviceSettingsPropertyDsl {
    private val cdkBuilder: CfnInput.InputDeviceSettingsProperty.Builder =
        CfnInput.InputDeviceSettingsProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnInput.InputDeviceSettingsProperty = cdkBuilder.build()
}
