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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions

/**
 * Additional options for the blue/green deployment.
 *
 * The type of the `CfnCodeDeployBlueGreenHookProps.additionalOptions` property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCodeDeployBlueGreenAdditionalOptions cfnCodeDeployBlueGreenAdditionalOptions =
 * CfnCodeDeployBlueGreenAdditionalOptions.builder()
 * .terminationWaitTimeInMinutes(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCodeDeployBlueGreenAdditionalOptionsDsl {
    private val cdkBuilder: CfnCodeDeployBlueGreenAdditionalOptions.Builder =
        CfnCodeDeployBlueGreenAdditionalOptions.builder()

    /**
     * @param terminationWaitTimeInMinutes Specifies time to wait, in minutes, before terminating
     *   the blue resources.
     */
    public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
        cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
    }

    public fun build(): CfnCodeDeployBlueGreenAdditionalOptions = cdkBuilder.build()
}
