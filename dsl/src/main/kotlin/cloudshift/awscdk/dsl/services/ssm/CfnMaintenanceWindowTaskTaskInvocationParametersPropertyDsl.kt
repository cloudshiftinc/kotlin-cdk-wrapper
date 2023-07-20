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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder =
        CfnMaintenanceWindowTask.TaskInvocationParametersProperty.builder()

    public fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: IResolvable) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters)
    }

    public fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters)
    }

    public fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters)
    }

    public fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters)
    }

    public fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: IResolvable) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters)
    }

    public fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters)
    }

    public fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: IResolvable) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters)
    }

    public fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters)
    }

    public fun build(): CfnMaintenanceWindowTask.TaskInvocationParametersProperty = cdkBuilder.build()
}
