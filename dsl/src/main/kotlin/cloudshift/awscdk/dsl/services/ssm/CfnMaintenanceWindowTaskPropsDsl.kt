@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps

/**
 * Properties for defining a `CfnMaintenanceWindowTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object parameters;
 * Object taskParameters;
 * CfnMaintenanceWindowTaskProps cfnMaintenanceWindowTaskProps =
 * CfnMaintenanceWindowTaskProps.builder()
 * .priority(123)
 * .taskArn("taskArn")
 * .taskType("taskType")
 * .windowId("windowId")
 * // the properties below are optional
 * .cutoffBehavior("cutoffBehavior")
 * .description("description")
 * .loggingInfo(LoggingInfoProperty.builder()
 * .region("region")
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Prefix("s3Prefix")
 * .build())
 * .maxConcurrency("maxConcurrency")
 * .maxErrors("maxErrors")
 * .name("name")
 * .serviceRoleArn("serviceRoleArn")
 * .targets(List.of(TargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .taskInvocationParameters(TaskInvocationParametersProperty.builder()
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
 * .build())
 * .taskParameters(taskParameters)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskPropsDsl {
  private val cdkBuilder: CfnMaintenanceWindowTaskProps.Builder =
      CfnMaintenanceWindowTaskProps.builder()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * @param cutoffBehavior The specification for whether tasks should continue to run after the
   * cutoff time specified in the maintenance windows is reached.
   */
  public fun cutoffBehavior(cutoffBehavior: String) {
    cdkBuilder.cutoffBehavior(cutoffBehavior)
  }

  /**
   * @param description A description of the task.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
   * to.
   *
   * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs for Run
   * Command tasks, instead use the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the
   * `TaskInvocationParameters` structure. For information about how Systems Manager handles these
   * options for the supported maintenance window task types, see [AWS ::SSM::MaintenanceWindowTask
   * MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
   * .
   */
  public fun loggingInfo(loggingInfo: IResolvable) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
   * to.
   *
   * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs for Run
   * Command tasks, instead use the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the
   * `TaskInvocationParameters` structure. For information about how Systems Manager handles these
   * options for the supported maintenance window task types, see [AWS ::SSM::MaintenanceWindowTask
   * MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
   * .
   */
  public fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty) {
    cdkBuilder.loggingInfo(loggingInfo)
  }

  /**
   * @param maxConcurrency The maximum number of targets this task can be run for, in parallel.
   *
   * Although this element is listed as "Required: No", a value can be omitted only when you are
   * registering or updating a [targetless
   * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
   * You must provide a value in all other cases.
   *
   * For maintenance window tasks without a target specified, you can't supply a value for this
   * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
   * running of your task.
   */
  public fun maxConcurrency(maxConcurrency: String) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  /**
   * @param maxErrors The maximum number of errors allowed before this task stops being scheduled.
   *
   * Although this element is listed as "Required: No", a value can be omitted only when you are
   * registering or updating a [targetless
   * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
   * You must provide a value in all other cases.
   *
   * For maintenance window tasks without a target specified, you can't supply a value for this
   * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
   * running of your task.
   */
  public fun maxErrors(maxErrors: String) {
    cdkBuilder.maxErrors(maxErrors)
  }

  /**
   * @param name The task name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority The priority of the task in the maintenance window. 
   * The lower the number, the higher the priority. Tasks that have the same priority are scheduled
   * in parallel.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management
   * (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
   * for maintenance window Run Command tasks.
   */
  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  /**
   * @param targets The targets, either instances or window target IDs.
   * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
   * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
   * *window-target-id-2*` .
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The targets, either instances or window target IDs.
   * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
   * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
   * *window-target-id-2*` .
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * @param targets The targets, either instances or window target IDs.
   * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
   * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
   * *window-target-id-2*` .
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  /**
   * @param taskArn The resource that the task uses during execution. 
   * For `RUN_COMMAND` and `AUTOMATION` task types, `TaskArn` is the SSM document name or Amazon
   * Resource Name (ARN).
   *
   * For `LAMBDA` tasks, `TaskArn` is the function name or ARN.
   *
   * For `STEP_FUNCTIONS` tasks, `TaskArn` is the state machine ARN.
   */
  public fun taskArn(taskArn: String) {
    cdkBuilder.taskArn(taskArn)
  }

  /**
   * @param taskInvocationParameters The parameters to pass to the task when it runs.
   * Populate only the fields that match the task type. All other fields should be empty.
   *
   *
   * When you update a maintenance window task that has options specified in
   * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values that
   * you want to retain. The values you do not specify again are removed. For example, suppose that
   * when you registered a Run Command task, you specified `TaskInvocationParameters` values for
   * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance window
   * task and specify only a different `OutputS3BucketName` value, the values for `Comment` and
   * `NotificationConfig` are removed.
   */
  public fun taskInvocationParameters(taskInvocationParameters: IResolvable) {
    cdkBuilder.taskInvocationParameters(taskInvocationParameters)
  }

  /**
   * @param taskInvocationParameters The parameters to pass to the task when it runs.
   * Populate only the fields that match the task type. All other fields should be empty.
   *
   *
   * When you update a maintenance window task that has options specified in
   * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values that
   * you want to retain. The values you do not specify again are removed. For example, suppose that
   * when you registered a Run Command task, you specified `TaskInvocationParameters` values for
   * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance window
   * task and specify only a different `OutputS3BucketName` value, the values for `Comment` and
   * `NotificationConfig` are removed.
   */
  public
      fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty) {
    cdkBuilder.taskInvocationParameters(taskInvocationParameters)
  }

  /**
   * @param taskParameters The parameters to pass to the task when it runs.
   *
   * `TaskParameters` has been deprecated. To specify parameters to pass to a task when it runs,
   * instead use the `Parameters` option in the `TaskInvocationParameters` structure. For information
   * about how Systems Manager handles these options for the supported maintenance window task types,
   * see
   * [MaintenanceWindowTaskInvocationParameters](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_MaintenanceWindowTaskInvocationParameters.html)
   * .
   */
  public fun taskParameters(taskParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(taskParameters)
    cdkBuilder.taskParameters(builder.map)
  }

  /**
   * @param taskParameters The parameters to pass to the task when it runs.
   *
   * `TaskParameters` has been deprecated. To specify parameters to pass to a task when it runs,
   * instead use the `Parameters` option in the `TaskInvocationParameters` structure. For information
   * about how Systems Manager handles these options for the supported maintenance window task types,
   * see
   * [MaintenanceWindowTaskInvocationParameters](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_MaintenanceWindowTaskInvocationParameters.html)
   * .
   */
  public fun taskParameters(taskParameters: Any) {
    cdkBuilder.taskParameters(taskParameters)
  }

  /**
   * @param taskType The type of task. 
   * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
   */
  public fun taskType(taskType: String) {
    cdkBuilder.taskType(taskType)
  }

  /**
   * @param windowId The ID of the maintenance window where the task is registered. 
   */
  public fun windowId(windowId: String) {
    cdkBuilder.windowId(windowId)
  }

  public fun build(): CfnMaintenanceWindowTaskProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
