@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for starting an AWS Glue job as a task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Object outputs;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * WorkerTypeV2 workerTypeV2;
 * GlueStartJobRunJsonataProps glueStartJobRunJsonataProps = GlueStartJobRunJsonataProps.builder()
 * .glueJobName("glueJobName")
 * // the properties below are optional
 * .arguments(taskInput)
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .executionClass(ExecutionClass.FLEX)
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .notifyDelayAfter(Duration.minutes(30))
 * .outputs(outputs)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .securityConfiguration("securityConfiguration")
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .numberOfWorkers(123)
 * // the properties below are optional
 * .workerType(WorkerType.STANDARD)
 * .workerTypeV2(workerTypeV2)
 * .build())
 * .build();
 * ```
 */
public interface GlueStartJobRunJsonataProps : TaskStateJsonataBaseProps {
  /**
   * The job arguments specifically for this run.
   *
   * For this job run, they replace the default arguments set in the job
   * definition itself.
   *
   * Default: - Default arguments set in the job definition
   */
  public fun arguments(): TaskInput? = unwrap(this).getArguments()?.let(TaskInput::wrap)

  /**
   * The excecution class of the job.
   *
   * Default: - STANDARD
   */
  public fun executionClass(): ExecutionClass? =
      unwrap(this).getExecutionClass()?.let(ExecutionClass::wrap)

  /**
   * Glue job name.
   */
  public fun glueJobName(): String

  /**
   * After a job run starts, the number of minutes to wait before sending a job run delay
   * notification.
   *
   * Must be at least 1 minute.
   *
   * Default: - Default delay set in the job definition
   */
  public fun notifyDelayAfter(): Duration? = unwrap(this).getNotifyDelayAfter()?.let(Duration::wrap)

  /**
   * The name of the SecurityConfiguration structure to be used with this job run.
   *
   * This must match the Glue API
   *
   * Default: - Default configuration set in the job definition
   *
   * [Documentation](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-oneLine)
   */
  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The worker configuration for this run.
   *
   * Default: - Default worker configuration in the job definition
   */
  public fun workerConfiguration(): WorkerConfigurationProperty? =
      unwrap(this).getWorkerConfiguration()?.let(WorkerConfigurationProperty::wrap)

  /**
   * A builder for [GlueStartJobRunJsonataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arguments The job arguments specifically for this run.
     * For this job run, they replace the default arguments set in the job
     * definition itself.
     */
    public fun arguments(arguments: TaskInput)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ab44fe107233397c6fd81f94d60790409836c449e5ccf27ffdd83a094ed436")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param executionClass The excecution class of the job.
     */
    public fun executionClass(executionClass: ExecutionClass)

    /**
     * @param glueJobName Glue job name. 
     */
    public fun glueJobName(glueJobName: String)

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     * a job run delay notification.
     * Must be at least 1 minute.
     */
    public fun notifyDelayAfter(notifyDelayAfter: Duration)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param securityConfiguration The name of the SecurityConfiguration structure to be used with
     * this job run.
     * This must match the Glue API
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * @param workerConfiguration The worker configuration for this run.
     */
    public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

    /**
     * @param workerConfiguration The worker configuration for this run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1559dfdc1c65e1cc01cd9fb1808d9128d6c941eb3c11c5be76ca84cfe7e7d4c")
    public
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps.builder()

    /**
     * @param arguments The job arguments specifically for this run.
     * For this job run, they replace the default arguments set in the job
     * definition itself.
     */
    override fun arguments(arguments: TaskInput) {
      cdkBuilder.arguments(arguments.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ab44fe107233397c6fd81f94d60790409836c449e5ccf27ffdd83a094ed436")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param executionClass The excecution class of the job.
     */
    override fun executionClass(executionClass: ExecutionClass) {
      cdkBuilder.executionClass(executionClass.let(ExecutionClass.Companion::unwrap))
    }

    /**
     * @param glueJobName Glue job name. 
     */
    override fun glueJobName(glueJobName: String) {
      cdkBuilder.glueJobName(glueJobName)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     * a job run delay notification.
     * Must be at least 1 minute.
     */
    override fun notifyDelayAfter(notifyDelayAfter: Duration) {
      cdkBuilder.notifyDelayAfter(notifyDelayAfter.let(Duration.Companion::unwrap))
    }

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param securityConfiguration The name of the SecurityConfiguration structure to be used with
     * this job run.
     * This must match the Glue API
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param workerConfiguration The worker configuration for this run.
     */
    override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param workerConfiguration The worker configuration for this run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1559dfdc1c65e1cc01cd9fb1808d9128d6c941eb3c11c5be76ca84cfe7e7d4c")
    override
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit):
        Unit = workerConfiguration(WorkerConfigurationProperty(workerConfiguration))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps,
  ) : CdkObject(cdkObject),
      GlueStartJobRunJsonataProps {
    /**
     * The job arguments specifically for this run.
     *
     * For this job run, they replace the default arguments set in the job
     * definition itself.
     *
     * Default: - Default arguments set in the job definition
     */
    override fun arguments(): TaskInput? = unwrap(this).getArguments()?.let(TaskInput::wrap)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * The excecution class of the job.
     *
     * Default: - STANDARD
     */
    override fun executionClass(): ExecutionClass? =
        unwrap(this).getExecutionClass()?.let(ExecutionClass::wrap)

    /**
     * Glue job name.
     */
    override fun glueJobName(): String = unwrap(this).getGlueJobName()

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     */
    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay
     * notification.
     *
     * Must be at least 1 minute.
     *
     * Default: - Default delay set in the job definition
     */
    override fun notifyDelayAfter(): Duration? =
        unwrap(this).getNotifyDelayAfter()?.let(Duration::wrap)

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * The name of the SecurityConfiguration structure to be used with this job run.
     *
     * This must match the Glue API
     *
     * Default: - Default configuration set in the job definition
     *
     * [Documentation](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-oneLine)
     */
    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The worker configuration for this run.
     *
     * Default: - Default worker configuration in the job definition
     */
    override fun workerConfiguration(): WorkerConfigurationProperty? =
        unwrap(this).getWorkerConfiguration()?.let(WorkerConfigurationProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GlueStartJobRunJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps):
        GlueStartJobRunJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        GlueStartJobRunJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlueStartJobRunJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunJsonataProps
  }
}
