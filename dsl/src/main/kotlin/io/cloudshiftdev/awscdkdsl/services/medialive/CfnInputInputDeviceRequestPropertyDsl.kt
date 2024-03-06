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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

/**
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

    /** @param id the value to be set. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnInput.InputDeviceRequestProperty = cdkBuilder.build()
}
