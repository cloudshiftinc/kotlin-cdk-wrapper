package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMaintenanceWindowTask internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The specification for whether tasks should continue to run after the cutoff time specified in
   * the maintenance windows is reached.
   */
  public open fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

  /**
   * The specification for whether tasks should continue to run after the cutoff time specified in
   * the maintenance windows is reached.
   */
  public open fun cutoffBehavior(`value`: String) {
    unwrap(this).setCutoffBehavior(`value`)
  }

  /**
   * A description of the task.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the task.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information about an Amazon S3 bucket to write Run Command task-level logs to.
   */
  public open fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  /**
   * Information about an Amazon S3 bucket to write Run Command task-level logs to.
   */
  public open fun loggingInfo(`value`: IResolvable) {
    unwrap(this).setLoggingInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about an Amazon S3 bucket to write Run Command task-level logs to.
   */
  public open fun loggingInfo(`value`: LoggingInfoProperty) {
    unwrap(this).setLoggingInfo(`value`.let(LoggingInfoProperty::unwrap))
  }

  /**
   * Information about an Amazon S3 bucket to write Run Command task-level logs to.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbba0f3c66e7a2938dee48fc664fc6682760e4935297faa77eeff3c4469f1157")
  public open fun loggingInfo(`value`: LoggingInfoProperty.Builder.() -> Unit): Unit =
      loggingInfo(LoggingInfoProperty(`value`))

  /**
   * The maximum number of targets this task can be run for, in parallel.
   */
  public open fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  /**
   * The maximum number of targets this task can be run for, in parallel.
   */
  public open fun maxConcurrency(`value`: String) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  /**
   * The maximum number of errors allowed before this task stops being scheduled.
   */
  public open fun maxErrors(): String? = unwrap(this).getMaxErrors()

  /**
   * The maximum number of errors allowed before this task stops being scheduled.
   */
  public open fun maxErrors(`value`: String) {
    unwrap(this).setMaxErrors(`value`)
  }

  /**
   * The task name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The task name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The priority of the task in the maintenance window.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The priority of the task in the maintenance window.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to
   * use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
   * window Run Command tasks.
   */
  public open fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to
   * use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
   * window Run Command tasks.
   */
  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  /**
   * The targets, either instances or window target IDs.
   */
  public open fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The targets, either instances or window target IDs.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * The targets, either instances or window target IDs.
   */
  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  /**
   * The targets, either instances or window target IDs.
   */
  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  /**
   * The resource that the task uses during execution.
   */
  public open fun taskArn(): String = unwrap(this).getTaskArn()

  /**
   * The resource that the task uses during execution.
   */
  public open fun taskArn(`value`: String) {
    unwrap(this).setTaskArn(`value`)
  }

  /**
   * The parameters to pass to the task when it runs.
   */
  public open fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

  /**
   * The parameters to pass to the task when it runs.
   */
  public open fun taskInvocationParameters(`value`: IResolvable) {
    unwrap(this).setTaskInvocationParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters to pass to the task when it runs.
   */
  public open fun taskInvocationParameters(`value`: TaskInvocationParametersProperty) {
    unwrap(this).setTaskInvocationParameters(`value`.let(TaskInvocationParametersProperty::unwrap))
  }

  /**
   * The parameters to pass to the task when it runs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e81404d3ee8fccf29e12a8734c109e64151389d0deeef605b473627741989f3")
  public open
      fun taskInvocationParameters(`value`: TaskInvocationParametersProperty.Builder.() -> Unit):
      Unit = taskInvocationParameters(TaskInvocationParametersProperty(`value`))

  /**
   * The parameters to pass to the task when it runs.
   */
  public open fun taskParameters(): Any? = unwrap(this).getTaskParameters()

  /**
   * The parameters to pass to the task when it runs.
   */
  public open fun taskParameters(`value`: Any) {
    unwrap(this).setTaskParameters(`value`)
  }

  /**
   * The type of task.
   */
  public open fun taskType(): String = unwrap(this).getTaskType()

  /**
   * The type of task.
   */
  public open fun taskType(`value`: String) {
    unwrap(this).setTaskType(`value`)
  }

  /**
   * The ID of the maintenance window where the task is registered.
   */
  public open fun windowId(): String = unwrap(this).getWindowId()

  /**
   * The ID of the maintenance window where the task is registered.
   */
  public open fun windowId(`value`: String) {
    unwrap(this).setWindowId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnMaintenanceWindowTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The specification for whether tasks should continue to run after the cutoff time specified in
     * the maintenance windows is reached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-cutoffbehavior)
     * @param cutoffBehavior The specification for whether tasks should continue to run after the
     * cutoff time specified in the maintenance windows is reached. 
     */
    public fun cutoffBehavior(cutoffBehavior: String)

    /**
     * A description of the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
     * @param description A description of the task. 
     */
    public fun description(description: String)

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    public fun loggingInfo(loggingInfo: IResolvable)

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    public fun loggingInfo(loggingInfo: LoggingInfoProperty)

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbf17c449fb922feebcb1dff803691433d401a752d8933a05ec06cdd103c753")
    public fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit)

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
     * @param maxConcurrency The maximum number of targets this task can be run for, in parallel. 
     */
    public fun maxConcurrency(maxConcurrency: String)

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
     * @param maxErrors The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    public fun maxErrors(maxErrors: String)

    /**
     * The task name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
     * @param name The task name. 
     */
    public fun name(name: String)

    /**
     * The priority of the task in the maintenance window.
     *
     * The lower the number, the higher the priority. Tasks that have the same priority are
     * scheduled in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
     * @param priority The priority of the task in the maintenance window. 
     */
    public fun priority(priority: Number)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role
     * to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
     * window Run Command tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
     * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     * notifications for maintenance window Run Command tasks. 
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    public fun targets(targets: List<Any>)

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    public fun targets(vararg targets: Any)

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
     * @param taskArn The resource that the task uses during execution. 
     */
    public fun taskArn(taskArn: String)

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    public fun taskInvocationParameters(taskInvocationParameters: IResolvable)

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    public fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty)

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a4651a882485982b5967f6dffd4aeed8c26aa0d3d45a180658ff849c2b80f2")
    public
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty.Builder.() -> Unit)

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
     * @param taskParameters The parameters to pass to the task when it runs. 
     */
    public fun taskParameters(taskParameters: Any)

    /**
     * The type of task.
     *
     * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
     * @param taskType The type of task. 
     */
    public fun taskType(taskType: String)

    /**
     * The ID of the maintenance window where the task is registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
     * @param windowId The ID of the maintenance window where the task is registered. 
     */
    public fun windowId(windowId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.Builder.create(scope, id)

    /**
     * The specification for whether tasks should continue to run after the cutoff time specified in
     * the maintenance windows is reached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-cutoffbehavior)
     * @param cutoffBehavior The specification for whether tasks should continue to run after the
     * cutoff time specified in the maintenance windows is reached. 
     */
    override fun cutoffBehavior(cutoffBehavior: String) {
      cdkBuilder.cutoffBehavior(cutoffBehavior)
    }

    /**
     * A description of the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
     * @param description A description of the task. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    override fun loggingInfo(loggingInfo: LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(LoggingInfoProperty::unwrap))
    }

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
     * @param loggingInfo Information about an Amazon S3 bucket to write Run Command task-level logs
     * to. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbf17c449fb922feebcb1dff803691433d401a752d8933a05ec06cdd103c753")
    override fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(LoggingInfoProperty(loggingInfo))

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
     * @param maxConcurrency The maximum number of targets this task can be run for, in parallel. 
     */
    override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

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
     * @param maxErrors The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    /**
     * The task name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
     * @param name The task name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The priority of the task in the maintenance window.
     *
     * The lower the number, the higher the priority. Tasks that have the same priority are
     * scheduled in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
     * @param priority The priority of the task in the maintenance window. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role
     * to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
     * window Run Command tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
     * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS)
     * notifications for maintenance window Run Command tasks. 
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * The targets, either instances or window target IDs.
     *
     * * Specify instances using `Key=InstanceIds,Values= *instanceid1* , *instanceid2*` .
     * * Specify window target IDs using `Key=WindowTargetIds,Values= *window-target-id-1* ,
     * *window-target-id-2*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
     * @param targets The targets, either instances or window target IDs. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

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
     * @param taskArn The resource that the task uses during execution. 
     */
    override fun taskArn(taskArn: String) {
      cdkBuilder.taskArn(taskArn)
    }

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    override fun taskInvocationParameters(taskInvocationParameters: IResolvable) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(IResolvable::unwrap))
    }

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    override
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(TaskInvocationParametersProperty::unwrap))
    }

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
     * @param taskInvocationParameters The parameters to pass to the task when it runs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a4651a882485982b5967f6dffd4aeed8c26aa0d3d45a180658ff849c2b80f2")
    override
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty.Builder.() -> Unit):
        Unit = taskInvocationParameters(TaskInvocationParametersProperty(taskInvocationParameters))

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
     * @param taskParameters The parameters to pass to the task when it runs. 
     */
    override fun taskParameters(taskParameters: Any) {
      cdkBuilder.taskParameters(taskParameters)
    }

    /**
     * The type of task.
     *
     * Valid values: `RUN_COMMAND` , `AUTOMATION` , `LAMBDA` , `STEP_FUNCTIONS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
     * @param taskType The type of task. 
     */
    override fun taskType(taskType: String) {
      cdkBuilder.taskType(taskType)
    }

    /**
     * The ID of the maintenance window where the task is registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
     * @param windowId The ID of the maintenance window where the task is registered. 
     */
    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindowTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindowTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask):
        CfnMaintenanceWindowTask = CfnMaintenanceWindowTask(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTask):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask = wrapped.cdkObject
  }

  public interface MaintenanceWindowLambdaParametersProperty {
    /**
     * Client-specific information to pass to the AWS Lambda function that you're invoking.
     *
     * You can then use the `context` variable to process the client information in your AWS Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
     */
    public fun clientContext(): String? = unwrap(this).getClientContext()

    /**
     * JSON to provide to your AWS Lambda function as input.
     *
     *
     * Although `Type` is listed as "String" for this property, the payload content must be
     * formatted as a Base64-encoded binary data object.
     *
     *
     * *Length Constraint:* 4096
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
     */
    public fun payload(): String? = unwrap(this).getPayload()

    /**
     * An AWS Lambda function version or alias name.
     *
     * If you specify a function version, the action uses the qualified function Amazon Resource
     * Name (ARN) to invoke a specific Lambda function. If you specify an alias name, the action uses
     * the alias ARN to invoke the Lambda function version that the alias points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
     */
    public fun qualifier(): String? = unwrap(this).getQualifier()

    /**
     * A builder for [MaintenanceWindowLambdaParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientContext Client-specific information to pass to the AWS Lambda function that
       * you're invoking.
       * You can then use the `context` variable to process the client information in your AWS
       * Lambda function.
       */
      public fun clientContext(clientContext: String)

      /**
       * @param payload JSON to provide to your AWS Lambda function as input.
       *
       * Although `Type` is listed as "String" for this property, the payload content must be
       * formatted as a Base64-encoded binary data object.
       *
       *
       * *Length Constraint:* 4096
       */
      public fun payload(payload: String)

      /**
       * @param qualifier An AWS Lambda function version or alias name.
       * If you specify a function version, the action uses the qualified function Amazon Resource
       * Name (ARN) to invoke a specific Lambda function. If you specify an alias name, the action uses
       * the alias ARN to invoke the Lambda function version that the alias points to.
       */
      public fun qualifier(qualifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.builder()

      /**
       * @param clientContext Client-specific information to pass to the AWS Lambda function that
       * you're invoking.
       * You can then use the `context` variable to process the client information in your AWS
       * Lambda function.
       */
      override fun clientContext(clientContext: String) {
        cdkBuilder.clientContext(clientContext)
      }

      /**
       * @param payload JSON to provide to your AWS Lambda function as input.
       *
       * Although `Type` is listed as "String" for this property, the payload content must be
       * formatted as a Base64-encoded binary data object.
       *
       *
       * *Length Constraint:* 4096
       */
      override fun payload(payload: String) {
        cdkBuilder.payload(payload)
      }

      /**
       * @param qualifier An AWS Lambda function version or alias name.
       * If you specify a function version, the action uses the qualified function Amazon Resource
       * Name (ARN) to invoke a specific Lambda function. If you specify an alias name, the action uses
       * the alias ARN to invoke the Lambda function version that the alias points to.
       */
      override fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowLambdaParametersProperty {
      /**
       * Client-specific information to pass to the AWS Lambda function that you're invoking.
       *
       * You can then use the `context` variable to process the client information in your AWS
       * Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
       */
      override fun clientContext(): String? = unwrap(this).getClientContext()

      /**
       * JSON to provide to your AWS Lambda function as input.
       *
       *
       * Although `Type` is listed as "String" for this property, the payload content must be
       * formatted as a Base64-encoded binary data object.
       *
       *
       * *Length Constraint:* 4096
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
       */
      override fun payload(): String? = unwrap(this).getPayload()

      /**
       * An AWS Lambda function version or alias name.
       *
       * If you specify a function version, the action uses the qualified function Amazon Resource
       * Name (ARN) to invoke a specific Lambda function. If you specify an alias name, the action uses
       * the alias ARN to invoke the Lambda function version that the alias points to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
       */
      override fun qualifier(): String? = unwrap(this).getQualifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowLambdaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty):
          MaintenanceWindowLambdaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowLambdaParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
    }
  }

  public interface MaintenanceWindowRunCommandParametersProperty {
    /**
     * Configuration options for sending command output to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-cloudwatchoutputconfig)
     */
    public fun cloudWatchOutputConfig(): Any? = unwrap(this).getCloudWatchOutputConfig()

    /**
     * Information about the command or commands to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The SHA-256 or SHA-1 hash created by the system when the document was created.
     *
     * SHA-1 hashes have been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
     */
    public fun documentHash(): String? = unwrap(this).getDocumentHash()

    /**
     * The SHA-256 or SHA-1 hash type.
     *
     * SHA-1 hashes are deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
     */
    public fun documentHashType(): String? = unwrap(this).getDocumentHashType()

    /**
     * The AWS Systems Manager document (SSM document) version to use in the request.
     *
     * You can specify `$DEFAULT` , `$LATEST` , or a specific version number. If you run commands by
     * using the AWS CLI, then you must escape the first two options by using a backslash. If you
     * specify a version number, then you don't need to use the backslash. For example:
     *
     * `--document-version "\$DEFAULT"`
     *
     * `--document-version "\$LATEST"`
     *
     * `--document-version "3"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documentversion)
     */
    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    /**
     * Configurations for sending notifications about command status changes on a per-managed node
     * basis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
     */
    public fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

    /**
     * The name of the Amazon Simple Storage Service (Amazon S3) bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
     */
    public fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

    /**
     * The S3 bucket subfolder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
     */
    public fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

    /**
     * The parameters for the `RUN_COMMAND` task execution.
     *
     * The supported parameters are the same as those for the `SendCommand` API call. For more
     * information, see
     * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role
     * to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance
     * window Run Command tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
     */
    public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

    /**
     * If this time is reached and the command hasn't already started running, it doesn't run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
     */
    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    /**
     * A builder for [MaintenanceWindowRunCommandParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      public fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable)

      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      public fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty)

      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102c967a4cf9341fe42734454c5ad0413f929090f11efe28c173537a2eef95f6")
      public
          fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty.Builder.() -> Unit)

      /**
       * @param comment Information about the command or commands to run.
       */
      public fun comment(comment: String)

      /**
       * @param documentHash The SHA-256 or SHA-1 hash created by the system when the document was
       * created.
       * SHA-1 hashes have been deprecated.
       */
      public fun documentHash(documentHash: String)

      /**
       * @param documentHashType The SHA-256 or SHA-1 hash type.
       * SHA-1 hashes are deprecated.
       */
      public fun documentHashType(documentHashType: String)

      /**
       * @param documentVersion The AWS Systems Manager document (SSM document) version to use in
       * the request.
       * You can specify `$DEFAULT` , `$LATEST` , or a specific version number. If you run commands
       * by using the AWS CLI, then you must escape the first two options by using a backslash. If you
       * specify a version number, then you don't need to use the backslash. For example:
       *
       * `--document-version "\$DEFAULT"`
       *
       * `--document-version "\$LATEST"`
       *
       * `--document-version "3"`
       */
      public fun documentVersion(documentVersion: String)

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      public fun notificationConfig(notificationConfig: IResolvable)

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      public fun notificationConfig(notificationConfig: NotificationConfigProperty)

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25b2c11086aec5ffa4631dd76b650010e51c85ba07b52e2ab287d52404837b4")
      public
          fun notificationConfig(notificationConfig: NotificationConfigProperty.Builder.() -> Unit)

      /**
       * @param outputS3BucketName The name of the Amazon Simple Storage Service (Amazon S3) bucket.
       */
      public fun outputS3BucketName(outputS3BucketName: String)

      /**
       * @param outputS3KeyPrefix The S3 bucket subfolder.
       */
      public fun outputS3KeyPrefix(outputS3KeyPrefix: String)

      /**
       * @param parameters The parameters for the `RUN_COMMAND` task execution.
       * The supported parameters are the same as those for the `SendCommand` API call. For more
       * information, see
       * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun parameters(parameters: Any)

      /**
       * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
       * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon
       * SNS) notifications for maintenance window Run Command tasks.
       */
      public fun serviceRoleArn(serviceRoleArn: String)

      /**
       * @param timeoutSeconds If this time is reached and the command hasn't already started
       * running, it doesn't run.
       */
      public fun timeoutSeconds(timeoutSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.builder()

      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      override fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable) {
        cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      override fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty) {
        cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig.let(CloudWatchOutputConfigProperty::unwrap))
      }

      /**
       * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
       * CloudWatch Logs.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102c967a4cf9341fe42734454c5ad0413f929090f11efe28c173537a2eef95f6")
      override
          fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty.Builder.() -> Unit):
          Unit = cloudWatchOutputConfig(CloudWatchOutputConfigProperty(cloudWatchOutputConfig))

      /**
       * @param comment Information about the command or commands to run.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param documentHash The SHA-256 or SHA-1 hash created by the system when the document was
       * created.
       * SHA-1 hashes have been deprecated.
       */
      override fun documentHash(documentHash: String) {
        cdkBuilder.documentHash(documentHash)
      }

      /**
       * @param documentHashType The SHA-256 or SHA-1 hash type.
       * SHA-1 hashes are deprecated.
       */
      override fun documentHashType(documentHashType: String) {
        cdkBuilder.documentHashType(documentHashType)
      }

      /**
       * @param documentVersion The AWS Systems Manager document (SSM document) version to use in
       * the request.
       * You can specify `$DEFAULT` , `$LATEST` , or a specific version number. If you run commands
       * by using the AWS CLI, then you must escape the first two options by using a backslash. If you
       * specify a version number, then you don't need to use the backslash. For example:
       *
       * `--document-version "\$DEFAULT"`
       *
       * `--document-version "\$LATEST"`
       *
       * `--document-version "3"`
       */
      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      override fun notificationConfig(notificationConfig: IResolvable) {
        cdkBuilder.notificationConfig(notificationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      override fun notificationConfig(notificationConfig: NotificationConfigProperty) {
        cdkBuilder.notificationConfig(notificationConfig.let(NotificationConfigProperty::unwrap))
      }

      /**
       * @param notificationConfig Configurations for sending notifications about command status
       * changes on a per-managed node basis.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25b2c11086aec5ffa4631dd76b650010e51c85ba07b52e2ab287d52404837b4")
      override
          fun notificationConfig(notificationConfig: NotificationConfigProperty.Builder.() -> Unit):
          Unit = notificationConfig(NotificationConfigProperty(notificationConfig))

      /**
       * @param outputS3BucketName The name of the Amazon Simple Storage Service (Amazon S3) bucket.
       */
      override fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
      }

      /**
       * @param outputS3KeyPrefix The S3 bucket subfolder.
       */
      override fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
      }

      /**
       * @param parameters The parameters for the `RUN_COMMAND` task execution.
       * The supported parameters are the same as those for the `SendCommand` API call. For more
       * information, see
       * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access
       * Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon
       * SNS) notifications for maintenance window Run Command tasks.
       */
      override fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
      }

      /**
       * @param timeoutSeconds If this time is reached and the command hasn't already started
       * running, it doesn't run.
       */
      override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowRunCommandParametersProperty {
      /**
       * Configuration options for sending command output to Amazon CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-cloudwatchoutputconfig)
       */
      override fun cloudWatchOutputConfig(): Any? = unwrap(this).getCloudWatchOutputConfig()

      /**
       * Information about the command or commands to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The SHA-256 or SHA-1 hash created by the system when the document was created.
       *
       * SHA-1 hashes have been deprecated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
       */
      override fun documentHash(): String? = unwrap(this).getDocumentHash()

      /**
       * The SHA-256 or SHA-1 hash type.
       *
       * SHA-1 hashes are deprecated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
       */
      override fun documentHashType(): String? = unwrap(this).getDocumentHashType()

      /**
       * The AWS Systems Manager document (SSM document) version to use in the request.
       *
       * You can specify `$DEFAULT` , `$LATEST` , or a specific version number. If you run commands
       * by using the AWS CLI, then you must escape the first two options by using a backslash. If you
       * specify a version number, then you don't need to use the backslash. For example:
       *
       * `--document-version "\$DEFAULT"`
       *
       * `--document-version "\$LATEST"`
       *
       * `--document-version "3"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documentversion)
       */
      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      /**
       * Configurations for sending notifications about command status changes on a per-managed node
       * basis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
       */
      override fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

      /**
       * The name of the Amazon Simple Storage Service (Amazon S3) bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
       */
      override fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

      /**
       * The S3 bucket subfolder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
       */
      override fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

      /**
       * The parameters for the `RUN_COMMAND` task execution.
       *
       * The supported parameters are the same as those for the `SendCommand` API call. For more
       * information, see
       * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
       * in the *AWS Systems Manager API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role
       * to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for
       * maintenance window Run Command tasks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
       */
      override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

      /**
       * If this time is reached and the command hasn't already started running, it doesn't run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
       */
      override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowRunCommandParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty):
          MaintenanceWindowRunCommandParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowRunCommandParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
    }
  }

  public interface NotificationConfigProperty {
    /**
     * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic.
     *
     * Run Command pushes notifications about command status changes to this topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
     */
    public fun notificationArn(): String

    /**
     * The different events that you can receive notifications for.
     *
     * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
     * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
     * Notifications for AWS Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
     */
    public fun notificationEvents(): List<String> = unwrap(this).getNotificationEvents() ?:
        emptyList()

    /**
     * The notification type.
     *
     * * `Command` : Receive notification when the status of a command changes.
     * * `Invocation` : For commands sent to multiple instances, receive notification on a
     * per-instance basis when the status of a command changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
     */
    public fun notificationType(): String? = unwrap(this).getNotificationType()

    /**
     * A builder for [NotificationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notificationArn An Amazon Resource Name (ARN) for an Amazon Simple Notification
       * Service (Amazon SNS) topic. 
       * Run Command pushes notifications about command status changes to this topic.
       */
      public fun notificationArn(notificationArn: String)

      /**
       * @param notificationEvents The different events that you can receive notifications for.
       * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
       * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
       * Notifications for AWS Systems
       * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun notificationEvents(notificationEvents: List<String>)

      /**
       * @param notificationEvents The different events that you can receive notifications for.
       * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
       * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
       * Notifications for AWS Systems
       * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun notificationEvents(vararg notificationEvents: String)

      /**
       * @param notificationType The notification type.
       * * `Command` : Receive notification when the status of a command changes.
       * * `Invocation` : For commands sent to multiple instances, receive notification on a
       * per-instance basis when the status of a command changes.
       */
      public fun notificationType(notificationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.builder()

      /**
       * @param notificationArn An Amazon Resource Name (ARN) for an Amazon Simple Notification
       * Service (Amazon SNS) topic. 
       * Run Command pushes notifications about command status changes to this topic.
       */
      override fun notificationArn(notificationArn: String) {
        cdkBuilder.notificationArn(notificationArn)
      }

      /**
       * @param notificationEvents The different events that you can receive notifications for.
       * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
       * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
       * Notifications for AWS Systems
       * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun notificationEvents(notificationEvents: List<String>) {
        cdkBuilder.notificationEvents(notificationEvents)
      }

      /**
       * @param notificationEvents The different events that you can receive notifications for.
       * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
       * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
       * Notifications for AWS Systems
       * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun notificationEvents(vararg notificationEvents: String): Unit =
          notificationEvents(notificationEvents.toList())

      /**
       * @param notificationType The notification type.
       * * `Command` : Receive notification when the status of a command changes.
       * * `Invocation` : For commands sent to multiple instances, receive notification on a
       * per-instance basis when the status of a command changes.
       */
      override fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty,
    ) : CdkObject(cdkObject), NotificationConfigProperty {
      /**
       * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic.
       *
       * Run Command pushes notifications about command status changes to this topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
       */
      override fun notificationArn(): String = unwrap(this).getNotificationArn()

      /**
       * The different events that you can receive notifications for.
       *
       * These events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
       * `Cancelled` , `Failed` . To learn more about these events, see [Configuring Amazon SNS
       * Notifications for AWS Systems
       * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
       * in the *AWS Systems Manager User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
       */
      override fun notificationEvents(): List<String> = unwrap(this).getNotificationEvents() ?:
          emptyList()

      /**
       * The notification type.
       *
       * * `Command` : Receive notification when the status of a command changes.
       * * `Invocation` : For commands sent to multiple instances, receive notification on a
       * per-instance basis when the status of a command changes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
       */
      override fun notificationType(): String? = unwrap(this).getNotificationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty):
          NotificationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty
    }
  }

  public interface TargetProperty {
    /**
     * User-defined criteria for sending commands that target instances that meet the criteria.
     *
     * `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how to target
     * instances within a maintenance window task, see [About 'register-task-with-maintenance-window'
     * Options and
     * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
     */
    public fun key(): String

    /**
     * User-defined criteria that maps to `Key` .
     *
     * For example, if you specify `InstanceIds` , you can specify
     * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
     * information about how to target instances within a maintenance window task, see [About
     * 'register-task-with-maintenance-window' Options and
     * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key User-defined criteria for sending commands that target instances that meet the
       * criteria. 
       * `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how to target
       * instances within a maintenance window task, see [About 'register-task-with-maintenance-window'
       * Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun key(key: String)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specify `InstanceIds` , you can specify
       * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
       * information about how to target instances within a maintenance window task, see [About
       * 'register-task-with-maintenance-window' Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun values(values: List<String>)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specify `InstanceIds` , you can specify
       * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
       * information about how to target instances within a maintenance window task, see [About
       * 'register-task-with-maintenance-window' Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty.builder()

      /**
       * @param key User-defined criteria for sending commands that target instances that meet the
       * criteria. 
       * `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how to target
       * instances within a maintenance window task, see [About 'register-task-with-maintenance-window'
       * Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specify `InstanceIds` , you can specify
       * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
       * information about how to target instances within a maintenance window task, see [About
       * 'register-task-with-maintenance-window' Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specify `InstanceIds` , you can specify
       * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
       * information about how to target instances within a maintenance window task, see [About
       * 'register-task-with-maintenance-window' Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      /**
       * User-defined criteria for sending commands that target instances that meet the criteria.
       *
       * `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how to target
       * instances within a maintenance window task, see [About 'register-task-with-maintenance-window'
       * Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * User-defined criteria that maps to `Key` .
       *
       * For example, if you specify `InstanceIds` , you can specify
       * `i-1234567890abcdef0,i-9876543210abcdef0` to run a command on two EC2 instances. For more
       * information about how to target instances within a maintenance window task, see [About
       * 'register-task-with-maintenance-window' Options and
       * Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
       * in the *AWS Systems Manager User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty
    }
  }

  public interface MaintenanceWindowAutomationParametersProperty {
    /**
     * The version of an Automation runbook to use during task execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
     */
    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    /**
     * The parameters for the `AUTOMATION` type task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [MaintenanceWindowAutomationParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentVersion The version of an Automation runbook to use during task execution.
       */
      public fun documentVersion(documentVersion: String)

      /**
       * @param parameters The parameters for the `AUTOMATION` type task.
       */
      public fun parameters(parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder()

      /**
       * @param documentVersion The version of an Automation runbook to use during task execution.
       */
      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      /**
       * @param parameters The parameters for the `AUTOMATION` type task.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowAutomationParametersProperty {
      /**
       * The version of an Automation runbook to use during task execution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
       */
      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      /**
       * The parameters for the `AUTOMATION` type task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowAutomationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty):
          MaintenanceWindowAutomationParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowAutomationParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
    }
  }

  public interface MaintenanceWindowStepFunctionsParametersProperty {
    /**
     * The inputs for the `STEP_FUNCTIONS` task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * The name of the `STEP_FUNCTIONS` task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [MaintenanceWindowStepFunctionsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param input The inputs for the `STEP_FUNCTIONS` task.
       */
      public fun input(input: String)

      /**
       * @param name The name of the `STEP_FUNCTIONS` task.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.builder()

      /**
       * @param input The inputs for the `STEP_FUNCTIONS` task.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param name The name of the `STEP_FUNCTIONS` task.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowStepFunctionsParametersProperty {
      /**
       * The inputs for the `STEP_FUNCTIONS` task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * The name of the `STEP_FUNCTIONS` task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowStepFunctionsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty):
          MaintenanceWindowStepFunctionsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowStepFunctionsParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
    }
  }

  public interface CloudWatchOutputConfigProperty {
    /**
     * The name of the CloudWatch Logs log group where you want to send command output.
     *
     * If you don't specify a group name, AWS Systems Manager automatically creates a log group for
     * you. The log group uses the following naming format:
     *
     * `aws/ssm/ *SystemsManagerDocumentName*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-cloudwatchoutputconfig.html#cfn-ssm-maintenancewindowtask-cloudwatchoutputconfig-cloudwatchloggroupname)
     */
    public fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

    /**
     * Enables Systems Manager to send command output to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-cloudwatchoutputconfig.html#cfn-ssm-maintenancewindowtask-cloudwatchoutputconfig-cloudwatchoutputenabled)
     */
    public fun cloudWatchOutputEnabled(): Any? = unwrap(this).getCloudWatchOutputEnabled()

    /**
     * A builder for [CloudWatchOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogGroupName The name of the CloudWatch Logs log group where you want to
       * send command output.
       * If you don't specify a group name, AWS Systems Manager automatically creates a log group
       * for you. The log group uses the following naming format:
       *
       * `aws/ssm/ *SystemsManagerDocumentName*`
       */
      public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String)

      /**
       * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
       * Logs.
       */
      public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean)

      /**
       * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
       * Logs.
       */
      public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder()

      /**
       * @param cloudWatchLogGroupName The name of the CloudWatch Logs log group where you want to
       * send command output.
       * If you don't specify a group name, AWS Systems Manager automatically creates a log group
       * for you. The log group uses the following naming format:
       *
       * `aws/ssm/ *SystemsManagerDocumentName*`
       */
      override fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
      }

      /**
       * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
       * Logs.
       */
      override fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
      }

      /**
       * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
       * Logs.
       */
      override fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty,
    ) : CdkObject(cdkObject), CloudWatchOutputConfigProperty {
      /**
       * The name of the CloudWatch Logs log group where you want to send command output.
       *
       * If you don't specify a group name, AWS Systems Manager automatically creates a log group
       * for you. The log group uses the following naming format:
       *
       * `aws/ssm/ *SystemsManagerDocumentName*`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-cloudwatchoutputconfig.html#cfn-ssm-maintenancewindowtask-cloudwatchoutputconfig-cloudwatchloggroupname)
       */
      override fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

      /**
       * Enables Systems Manager to send command output to CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-cloudwatchoutputconfig.html#cfn-ssm-maintenancewindowtask-cloudwatchoutputconfig-cloudwatchoutputenabled)
       */
      override fun cloudWatchOutputEnabled(): Any? = unwrap(this).getCloudWatchOutputEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty):
          CloudWatchOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchOutputConfigProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty
    }
  }

  public interface TaskInvocationParametersProperty {
    /**
     * The parameters for an `AUTOMATION` task type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
     */
    public fun maintenanceWindowAutomationParameters(): Any? =
        unwrap(this).getMaintenanceWindowAutomationParameters()

    /**
     * The parameters for a `LAMBDA` task type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
     */
    public fun maintenanceWindowLambdaParameters(): Any? =
        unwrap(this).getMaintenanceWindowLambdaParameters()

    /**
     * The parameters for a `RUN_COMMAND` task type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
     */
    public fun maintenanceWindowRunCommandParameters(): Any? =
        unwrap(this).getMaintenanceWindowRunCommandParameters()

    /**
     * The parameters for a `STEP_FUNCTIONS` task type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
     */
    public fun maintenanceWindowStepFunctionsParameters(): Any? =
        unwrap(this).getMaintenanceWindowStepFunctionsParameters()

    /**
     * A builder for [TaskInvocationParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: IResolvable)

      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty)

      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63593ae3b7f0d928a6578272ca63cc51e4a876c21628cca9194a24ee8afe3897")
      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty.Builder.() -> Unit)

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      public fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable)

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      public
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty)

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3956ce734b93da1442936537185d5795eb29e05ce35a9cad4b851c72c11ee1f6")
      public
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty.Builder.() -> Unit)

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: IResolvable)

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty)

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5afbfb626ae13685f0b01adfd1badbb701d9f85722c765f966389636f0e69da")
      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty.Builder.() -> Unit)

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: IResolvable)

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty)

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("270f735065e23fe71e6ef7b5b5b4093761bcdfe7c6309ec8c843a2193d1b4ee3")
      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty.builder()

      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: IResolvable) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters.let(MaintenanceWindowAutomationParametersProperty::unwrap))
      }

      /**
       * @param maintenanceWindowAutomationParameters The parameters for an `AUTOMATION` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63593ae3b7f0d928a6578272ca63cc51e4a876c21628cca9194a24ee8afe3897")
      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty(maintenanceWindowAutomationParameters))

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters.let(MaintenanceWindowLambdaParametersProperty::unwrap))
      }

      /**
       * @param maintenanceWindowLambdaParameters The parameters for a `LAMBDA` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3956ce734b93da1442936537185d5795eb29e05ce35a9cad4b851c72c11ee1f6")
      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty(maintenanceWindowLambdaParameters))

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: IResolvable) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters.let(MaintenanceWindowRunCommandParametersProperty::unwrap))
      }

      /**
       * @param maintenanceWindowRunCommandParameters The parameters for a `RUN_COMMAND` task type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5afbfb626ae13685f0b01adfd1badbb701d9f85722c765f966389636f0e69da")
      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty(maintenanceWindowRunCommandParameters))

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: IResolvable) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters.let(MaintenanceWindowStepFunctionsParametersProperty::unwrap))
      }

      /**
       * @param maintenanceWindowStepFunctionsParameters The parameters for a `STEP_FUNCTIONS` task
       * type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("270f735065e23fe71e6ef7b5b5b4093761bcdfe7c6309ec8c843a2193d1b4ee3")
      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty(maintenanceWindowStepFunctionsParameters))

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty,
    ) : CdkObject(cdkObject), TaskInvocationParametersProperty {
      /**
       * The parameters for an `AUTOMATION` task type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
       */
      override fun maintenanceWindowAutomationParameters(): Any? =
          unwrap(this).getMaintenanceWindowAutomationParameters()

      /**
       * The parameters for a `LAMBDA` task type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
       */
      override fun maintenanceWindowLambdaParameters(): Any? =
          unwrap(this).getMaintenanceWindowLambdaParameters()

      /**
       * The parameters for a `RUN_COMMAND` task type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
       */
      override fun maintenanceWindowRunCommandParameters(): Any? =
          unwrap(this).getMaintenanceWindowRunCommandParameters()

      /**
       * The parameters for a `STEP_FUNCTIONS` task type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
       */
      override fun maintenanceWindowStepFunctionsParameters(): Any? =
          unwrap(this).getMaintenanceWindowStepFunctionsParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskInvocationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty):
          TaskInvocationParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskInvocationParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty
    }
  }

  public interface LoggingInfoProperty {
    /**
     * The AWS Region where the S3 bucket is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
     */
    public fun region(): String

    /**
     * The name of an S3 bucket where execution logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The Amazon S3 bucket subfolder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
     */
    public fun s3Prefix(): String? = unwrap(this).getS3Prefix()

    /**
     * A builder for [LoggingInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param region The AWS Region where the S3 bucket is located. 
       */
      public fun region(region: String)

      /**
       * @param s3Bucket The name of an S3 bucket where execution logs are stored. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Prefix The Amazon S3 bucket subfolder.
       */
      public fun s3Prefix(s3Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.builder()

      /**
       * @param region The AWS Region where the S3 bucket is located. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param s3Bucket The name of an S3 bucket where execution logs are stored. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Prefix The Amazon S3 bucket subfolder.
       */
      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty,
    ) : CdkObject(cdkObject), LoggingInfoProperty {
      /**
       * The AWS Region where the S3 bucket is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
       */
      override fun region(): String = unwrap(this).getRegion()

      /**
       * The name of an S3 bucket where execution logs are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The Amazon S3 bucket subfolder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
       */
      override fun s3Prefix(): String? = unwrap(this).getS3Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty):
          LoggingInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingInfoProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty
    }
  }
}
