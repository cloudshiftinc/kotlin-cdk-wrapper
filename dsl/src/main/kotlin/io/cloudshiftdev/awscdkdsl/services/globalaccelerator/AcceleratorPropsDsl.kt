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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps

/**
 * Construct properties of the Accelerator.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * AcceleratorProps acceleratorProps = AcceleratorProps.builder()
 * .acceleratorName("acceleratorName")
 * .enabled(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class AcceleratorPropsDsl {
    private val cdkBuilder: AcceleratorProps.Builder = AcceleratorProps.builder()

    /** @param acceleratorName The name of the accelerator. */
    public fun acceleratorName(acceleratorName: String) {
        cdkBuilder.acceleratorName(acceleratorName)
    }

    /** @param enabled Indicates whether the accelerator is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): AcceleratorProps = cdkBuilder.build()
}
