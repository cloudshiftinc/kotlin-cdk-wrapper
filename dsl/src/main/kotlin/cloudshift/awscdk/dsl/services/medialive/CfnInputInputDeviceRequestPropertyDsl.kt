@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

/**
 * This entity is not used.
 *
 * Ignore it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputDeviceRequestProperty inputDeviceRequestProperty = InputDeviceRequestProperty.builder()
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicerequest.html)
 */
@CdkDslMarker
public class CfnInputInputDeviceRequestPropertyDsl {
    private val cdkBuilder: CfnInput.InputDeviceRequestProperty.Builder =
        CfnInput.InputDeviceRequestProperty.builder()

    /** @param id This property is not used. Ignore it. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnInput.InputDeviceRequestProperty = cdkBuilder.build()
}
