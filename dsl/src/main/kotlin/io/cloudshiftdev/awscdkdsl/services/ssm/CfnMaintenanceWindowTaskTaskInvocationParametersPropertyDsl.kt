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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `TaskInvocationParameters` property type specifies the task execution parameters for a
 * maintenance window task in AWS Systems Manager .
 *
 * `TaskInvocationParameters` is a property of the
 * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object parameters;
 * TaskInvocationParametersProperty taskInvocationParametersProperty =
 * TaskInvocationParametersProperty.builder()
 * .maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty.builder()
 * .documentVersion("documentVersion")
 * .parameters(parameters)
 * .build())
 * .maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty.builder()
 * .clientContext("clientContext")
 * .payload("payload")
 * .qualifier("qualifier")
 * .build())
 * .maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty.builder()
 * .cloudWatchOutputConfig(CloudWatchOutputConfigProperty.builder()
 * .cloudWatchLogGroupName("cloudWatchLogGroupName")
 * .cloudWatchOutputEnabled(false)
 * .build())
 * .comment("comment")
 * .documentHash("documentHash")
 * .documentHashType("documentHashType")
 * .documentVersion("documentVersion")
 * .notificationConfig(NotificationConfigProperty.builder()
 * .notificationArn("notificationArn")
 * // the properties below are optional
 * .notificationEvents(List.of("notificationEvents"))
 * .notificationType("notificationType")
 * .build())
 * .outputS3BucketName("outputS3BucketName")
 * .outputS3KeyPrefix("outputS3KeyPrefix")
 * .parameters(parameters)
 * .serviceRoleArn("serviceRoleArn")
 * .timeoutSeconds(123)
 * .build())
 * .maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty.builder()
 * .input("input")
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder =
        CfnMaintenanceWindowTask.TaskInvocationParametersProperty.builder()

    /**
     * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
     */
    public fun maintenanceWindowAutomationParameters(
        maintenanceWindowAutomationParameters: IResolvable
    ) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters)
    }

    /**
     * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
     */
    public fun maintenanceWindowAutomationParameters(
        maintenanceWindowAutomationParameters:
            CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
    ) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters)
    }

    /** @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type. */
    public fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters)
    }

    /** @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type. */
    public fun maintenanceWindowLambdaParameters(
        maintenanceWindowLambdaParameters:
            CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
    ) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters)
    }

    /**
     * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
     */
    public fun maintenanceWindowRunCommandParameters(
        maintenanceWindowRunCommandParameters: IResolvable
    ) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters)
    }

    /**
     * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
     */
    public fun maintenanceWindowRunCommandParameters(
        maintenanceWindowRunCommandParameters:
            CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
    ) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters)
    }

    /**
     * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
     *   type.
     */
    public fun maintenanceWindowStepFunctionsParameters(
        maintenanceWindowStepFunctionsParameters: IResolvable
    ) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(
            maintenanceWindowStepFunctionsParameters
        )
    }

    /**
     * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
     *   type.
     */
    public fun maintenanceWindowStepFunctionsParameters(
        maintenanceWindowStepFunctionsParameters:
            CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
    ) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(
            maintenanceWindowStepFunctionsParameters
        )
    }

    public fun build(): CfnMaintenanceWindowTask.TaskInvocationParametersProperty =
        cdkBuilder.build()
}
