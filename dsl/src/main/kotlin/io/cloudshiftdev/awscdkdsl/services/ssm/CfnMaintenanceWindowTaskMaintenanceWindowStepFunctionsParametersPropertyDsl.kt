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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `MaintenanceWindowStepFunctionsParameters` property type specifies the parameters for the
 * execution of a `STEP_FUNCTIONS` task in a Systems Manager maintenance window.
 *
 * `MaintenanceWindowStepFunctionsParameters` is a property of the
 * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * MaintenanceWindowStepFunctionsParametersProperty maintenanceWindowStepFunctionsParametersProperty
 * = MaintenanceWindowStepFunctionsParametersProperty.builder()
 * .input("input")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl {
    private val cdkBuilder:
        CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder =
        CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.builder()

    /** @param input The inputs for the `STEP_FUNCTIONS` task. */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /** @param name The name of the `STEP_FUNCTIONS` task. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty =
        cdkBuilder.build()
}
