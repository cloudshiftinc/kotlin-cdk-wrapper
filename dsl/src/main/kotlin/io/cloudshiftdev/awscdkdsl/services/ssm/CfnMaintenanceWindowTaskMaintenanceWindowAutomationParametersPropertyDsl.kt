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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `MaintenanceWindowAutomationParameters` property type specifies the parameters for an
 * `AUTOMATION` task type for a maintenance window task in AWS Systems Manager .
 *
 * `MaintenanceWindowAutomationParameters` is a property of the
 * [TaskInvocationParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
 * property type.
 *
 * For information about available parameters in Automation runbooks, you can view the content of
 * the runbook itself in the Systems Manager console. For information, see
 * [View runbook content](https://docs.aws.amazon.com/systems-manager/latest/userguide/automation-documents-reference-details.html#view-automation-json)
 * in the *AWS Systems Manager User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object parameters;
 * MaintenanceWindowAutomationParametersProperty maintenanceWindowAutomationParametersProperty =
 * MaintenanceWindowAutomationParametersProperty.builder()
 * .documentVersion("documentVersion")
 * .parameters(parameters)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl {
    private val cdkBuilder:
        CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder =
        CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder()

    /** @param documentVersion The version of an Automation runbook to use during task execution. */
    public fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
    }

    /** @param parameters The parameters for the `AUTOMATION` type task. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters The parameters for the `AUTOMATION` type task. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty =
        cdkBuilder.build()
}
