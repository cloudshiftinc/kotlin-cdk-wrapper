@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMaintenanceWindowTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
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
public interface CfnMaintenanceWindowTaskProps {
  /**
   * The specification for whether tasks should continue to run after the cutoff time specified in
   * the maintenance windows is reached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-cutoffbehavior)
   */
  public fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

  /**
   * A description of the task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about an Amazon S3 bucket to write Run Command task-level logs to.
   *
   *
   * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs for Run
   * Command tasks, instead use the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the
   * `TaskInvocationParameters` structure. For information about how Systems Manager handles these
   * options for the supported maintenance window task types, see [AWS ::SSM::MaintenanceWindowTask
   * MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-logginginfo)
   */
  public fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   * The maximum number of targets this task can be run for, in parallel.
   *
   *
   * Although this element is listed as "Required: No", a value can be omitted only when you are
   * registering or updating a [targetless
   * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
   * You must provide a value in all other cases.
   *
   * For maintenance window tasks without a target specified, you can't supply a value for this
   * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
   * running of your task.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency)
   */
  public fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  /**
   * The maximum number of errors allowed before this task stops being scheduled.
   *
   *
   * Although this element is listed as "Required: No", a value can be omitted only when you are
   * registering or updating a [targetless
   * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
   * You must provide a value in all other cases.
   *
   * For maintenance window tasks without a target specified, you can't supply a value for this
   * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
   * running of your task.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors)
   */
  public fun maxErrors(): String? = unwrap(this).getMaxErrors()

  /**
   * The task name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The priority of the task in the maintenance window.
   *
   * The lower the number, the higher the priority. Tasks that have the same priority are scheduled
   * in parallel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
   */
  public fun priority(): Number

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to
   * use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
   * window Run Command tasks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
   */
  public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  /**
   * The targets, either instances or window target IDs.
   *
   * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
   * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
   * *window-target-id-2*` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
   */
  public fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The resource that the task uses during execution.
   *
   * For `RUN_COMMAND` and `AUTOMATION` task types, `TaskArn` is the SSM document name or Amazon
   * Resource Name (ARN).
   *
   * For `LAMBDA` tasks, `TaskArn` is the function name or ARN.
   *
   * For `STEP_FUNCTIONS` tasks, `TaskArn` is the state machine ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn)
   */
  public fun taskArn(): String

  /**
   * The parameters to pass to the task when it runs.
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters)
   */
  public fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

  /**
   * The parameters to pass to the task when it runs.
   *
   *
   * `TaskParameters` has been deprecated. To specify parameters to pass to a task when it runs,
   * instead use the `Parameters` option in the `TaskInvocationParameters` structure. For information
   * about how Systems Manager handles these options for the supported maintenance window task types,
   * see
   * [MaintenanceWindowTaskInvocationParameters](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_MaintenanceWindowTaskInvocationParameters.html)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters)
   */
  public fun taskParameters(): Any? = unwrap(this).getTaskParameters()

  /**
   * The type of task.
   *
   * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
   */
  public fun taskType(): String

  /**
   * The ID of the maintenance window where the task is registered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
   */
  public fun windowId(): String

  /**
   * A builder for [CfnMaintenanceWindowTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cutoffBehavior The specification for whether tasks should continue to run after the
     * cutoff time specified in the maintenance windows is reached.
     */
    public fun cutoffBehavior(cutoffBehavior: String)

    /**
     * @param description A description of the task.
     */
    public fun description(description: String)

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
    public fun loggingInfo(loggingInfo: IResolvable)

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
    public fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6424ecd79378f2fde91ccb9bffd09db2b58f9b0c80c60e41d8046c2f89557a1f")
    public
        fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit)

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
    public fun maxConcurrency(maxConcurrency: String)

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
    public fun maxErrors(maxErrors: String)

    /**
     * @param name The task name.
     */
    public fun name(name: String)

    /**
     * @param priority The priority of the task in the maintenance window. 
     * The lower the number, the higher the priority. Tasks that have the same priority are
     * scheduled in parallel.
     */
    public fun priority(priority: Number)

    /**
     * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     * notifications for maintenance window Run Command tasks.
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    public fun targets(vararg targets: Any)

    /**
     * @param taskArn The resource that the task uses during execution. 
     * For `RUN_COMMAND` and `AUTOMATION` task types, `TaskArn` is the SSM document name or Amazon
     * Resource Name (ARN).
     *
     * For `LAMBDA` tasks, `TaskArn` is the function name or ARN.
     *
     * For `STEP_FUNCTIONS` tasks, `TaskArn` is the state machine ARN.
     */
    public fun taskArn(taskArn: String)

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    public fun taskInvocationParameters(taskInvocationParameters: IResolvable)

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    public
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty)

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f55a86697eb847f753bbaae871485464d341d9dcb1a3d62946e081092c8ac14e")
    public
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder.() -> Unit)

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
    public fun taskParameters(taskParameters: Any)

    /**
     * @param taskType The type of task. 
     * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
     */
    public fun taskType(taskType: String)

    /**
     * @param windowId The ID of the maintenance window where the task is registered. 
     */
    public fun windowId(windowId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps.builder()

    /**
     * @param cutoffBehavior The specification for whether tasks should continue to run after the
     * cutoff time specified in the maintenance windows is reached.
     */
    override fun cutoffBehavior(cutoffBehavior: String) {
      cdkBuilder.cutoffBehavior(cutoffBehavior)
    }

    /**
     * @param description A description of the task.
     */
    override fun description(description: String) {
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
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
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
    override fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(CfnMaintenanceWindowTask.LoggingInfoProperty::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6424ecd79378f2fde91ccb9bffd09db2b58f9b0c80c60e41d8046c2f89557a1f")
    override
        fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit):
        Unit = loggingInfo(CfnMaintenanceWindowTask.LoggingInfoProperty(loggingInfo))

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
    override fun maxConcurrency(maxConcurrency: String) {
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
    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    /**
     * @param name The task name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param priority The priority of the task in the maintenance window. 
     * The lower the number, the higher the priority. Tasks that have the same priority are
     * scheduled in parallel.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     * notifications for maintenance window Run Command tasks.
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * @param targets The targets, either instances or window target IDs.
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * @param taskArn The resource that the task uses during execution. 
     * For `RUN_COMMAND` and `AUTOMATION` task types, `TaskArn` is the SSM document name or Amazon
     * Resource Name (ARN).
     *
     * For `LAMBDA` tasks, `TaskArn` is the function name or ARN.
     *
     * For `STEP_FUNCTIONS` tasks, `TaskArn` is the state machine ARN.
     */
    override fun taskArn(taskArn: String) {
      cdkBuilder.taskArn(taskArn)
    }

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    override fun taskInvocationParameters(taskInvocationParameters: IResolvable) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(IResolvable::unwrap))
    }

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    override
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(CfnMaintenanceWindowTask.TaskInvocationParametersProperty::unwrap))
    }

    /**
     * @param taskInvocationParameters The parameters to pass to the task when it runs.
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f55a86697eb847f753bbaae871485464d341d9dcb1a3d62946e081092c8ac14e")
    override
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder.() -> Unit):
        Unit =
        taskInvocationParameters(CfnMaintenanceWindowTask.TaskInvocationParametersProperty(taskInvocationParameters))

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
    override fun taskParameters(taskParameters: Any) {
      cdkBuilder.taskParameters(taskParameters)
    }

    /**
     * @param taskType The type of task. 
     * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
     */
    override fun taskType(taskType: String) {
      cdkBuilder.taskType(taskType)
    }

    /**
     * @param windowId The ID of the maintenance window where the task is registered. 
     */
    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowTaskProps {
    /**
     * The specification for whether tasks should continue to run after the cutoff time specified in
     * the maintenance windows is reached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-cutoffbehavior)
     */
    override fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

    /**
     * A description of the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Information about an Amazon S3 bucket to write Run Command task-level logs to.
     *
     *
     * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs for Run
     * Command tasks, instead use the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the
     * `TaskInvocationParameters` structure. For information about how Systems Manager handles these
     * options for the supported maintenance window task types, see [AWS ::SSM::MaintenanceWindowTask
     * MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-logginginfo)
     */
    override fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

    /**
     * The maximum number of targets this task can be run for, in parallel.
     *
     *
     * Although this element is listed as "Required: No", a value can be omitted only when you are
     * registering or updating a [targetless
     * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
     * You must provide a value in all other cases.
     *
     * For maintenance window tasks without a target specified, you can't supply a value for this
     * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
     * running of your task.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency)
     */
    override fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

    /**
     * The maximum number of errors allowed before this task stops being scheduled.
     *
     *
     * Although this element is listed as "Required: No", a value can be omitted only when you are
     * registering or updating a [targetless
     * task](https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html)
     * You must provide a value in all other cases.
     *
     * For maintenance window tasks without a target specified, you can't supply a value for this
     * option. Instead, the system inserts a placeholder value of `1` . This value doesn't affect the
     * running of your task.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors)
     */
    override fun maxErrors(): String? = unwrap(this).getMaxErrors()

    /**
     * The task name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The priority of the task in the maintenance window.
     *
     * The lower the number, the higher the priority. Tasks that have the same priority are
     * scheduled in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role
     * to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
     * window Run Command tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
     */
    override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     */
    override fun targets(): Any? = unwrap(this).getTargets()

    /**
     * The resource that the task uses during execution.
     *
     * For `RUN_COMMAND` and `AUTOMATION` task types, `TaskArn` is the SSM document name or Amazon
     * Resource Name (ARN).
     *
     * For `LAMBDA` tasks, `TaskArn` is the function name or ARN.
     *
     * For `STEP_FUNCTIONS` tasks, `TaskArn` is the state machine ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn)
     */
    override fun taskArn(): String = unwrap(this).getTaskArn()

    /**
     * The parameters to pass to the task when it runs.
     *
     * Populate only the fields that match the task type. All other fields should be empty.
     *
     *
     * When you update a maintenance window task that has options specified in
     * `TaskInvocationParameters` , you must provide again all the `TaskInvocationParameters` values
     * that you want to retain. The values you do not specify again are removed. For example, suppose
     * that when you registered a Run Command task, you specified `TaskInvocationParameters` values for
     * `Comment` , `NotificationConfig` , and `OutputS3BucketName` . If you update the maintenance
     * window task and specify only a different `OutputS3BucketName` value, the values for `Comment`
     * and `NotificationConfig` are removed.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters)
     */
    override fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

    /**
     * The parameters to pass to the task when it runs.
     *
     *
     * `TaskParameters` has been deprecated. To specify parameters to pass to a task when it runs,
     * instead use the `Parameters` option in the `TaskInvocationParameters` structure. For information
     * about how Systems Manager handles these options for the supported maintenance window task types,
     * see
     * [MaintenanceWindowTaskInvocationParameters](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_MaintenanceWindowTaskInvocationParameters.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters)
     */
    override fun taskParameters(): Any? = unwrap(this).getTaskParameters()

    /**
     * The type of task.
     *
     * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
     */
    override fun taskType(): String = unwrap(this).getTaskType()

    /**
     * The ID of the maintenance window where the task is registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
     */
    override fun windowId(): String = unwrap(this).getWindowId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps):
        CfnMaintenanceWindowTaskProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMaintenanceWindowTaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTaskProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
  }
}
