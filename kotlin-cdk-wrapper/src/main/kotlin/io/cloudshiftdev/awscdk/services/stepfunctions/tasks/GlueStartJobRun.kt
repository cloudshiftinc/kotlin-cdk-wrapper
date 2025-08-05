@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Starts an AWS Glue job in a Task state.
 *
 * OUTPUT: the output of this task is a JobRun structure, for details consult
 * https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-runs.html#aws-glue-api-jobs-runs-JobRun
 *
 * Example:
 *
 * ```
 * GlueStartJobRun.Builder.create(this, "Task")
 * .glueJobName("my-glue-job")
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .workerTypeV2(WorkerTypeV2.G_1X) // Worker type
 * .numberOfWorkers(2)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-glue.html)
 */
public open class GlueStartJobRun(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GlueStartJobRunProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(GlueStartJobRunProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GlueStartJobRunProps.Builder.() -> Unit,
  ) : this(scope, id, GlueStartJobRunProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.GlueStartJobRun].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The job arguments specifically for this run.
     *
     * For this job run, they replace the default arguments set in the job
     * definition itself.
     *
     * Default: - Default arguments set in the job definition
     *
     * @param arguments The job arguments specifically for this run. 
     */
    public fun arguments(arguments: TaskInput)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aee74dc25bc0b12b0d3d4e10ef13dd696dcbd73632ff957db2199f3560ecf65")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The excecution class of the job.
     *
     * Default: - STANDARD
     *
     * @param executionClass The excecution class of the job. 
     */
    public fun executionClass(executionClass: ExecutionClass)

    /**
     * Glue job name.
     *
     * @param glueJobName Glue job name. 
     */
    public fun glueJobName(glueJobName: String)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay
     * notification.
     *
     * Must be at least 1 minute.
     *
     * Default: - Default delay set in the job definition
     *
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     * a job run delay notification. 
     */
    public fun notifyDelayAfter(notifyDelayAfter: Duration)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

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
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * The name of the SecurityConfiguration structure to be used with this job run.
     *
     * This must match the Glue API
     *
     * Default: - Default configuration set in the job definition
     *
     * [Documentation](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-oneLine)
     * @param securityConfiguration The name of the SecurityConfiguration structure to be used with
     * this job run. 
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * The worker configuration for this run.
     *
     * Default: - Default worker configuration in the job definition
     *
     * @param workerConfiguration The worker configuration for this run. 
     */
    public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

    /**
     * The worker configuration for this run.
     *
     * Default: - Default worker configuration in the job definition
     *
     * @param workerConfiguration The worker configuration for this run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43e47e27b7583458d69d98613de3eff71c77e1e0daeb70156d05d64c6b45117e")
    public
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.Builder.create(scope,
        id)

    /**
     * The job arguments specifically for this run.
     *
     * For this job run, they replace the default arguments set in the job
     * definition itself.
     *
     * Default: - Default arguments set in the job definition
     *
     * @param arguments The job arguments specifically for this run. 
     */
    override fun arguments(arguments: TaskInput) {
      cdkBuilder.arguments(arguments.let(TaskInput.Companion::unwrap))
    }

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aee74dc25bc0b12b0d3d4e10ef13dd696dcbd73632ff957db2199f3560ecf65")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The excecution class of the job.
     *
     * Default: - STANDARD
     *
     * @param executionClass The excecution class of the job. 
     */
    override fun executionClass(executionClass: ExecutionClass) {
      cdkBuilder.executionClass(executionClass.let(ExecutionClass.Companion::unwrap))
    }

    /**
     * Glue job name.
     *
     * @param glueJobName Glue job name. 
     */
    override fun glueJobName(glueJobName: String) {
      cdkBuilder.glueJobName(glueJobName)
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay
     * notification.
     *
     * Must be at least 1 minute.
     *
     * Default: - Default delay set in the job definition
     *
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     * a job run delay notification. 
     */
    override fun notifyDelayAfter(notifyDelayAfter: Duration) {
      cdkBuilder.notifyDelayAfter(notifyDelayAfter.let(Duration.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

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
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The name of the SecurityConfiguration structure to be used with this job run.
     *
     * This must match the Glue API
     *
     * Default: - Default configuration set in the job definition
     *
     * [Documentation](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-oneLine)
     * @param securityConfiguration The name of the SecurityConfiguration structure to be used with
     * this job run. 
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * The worker configuration for this run.
     *
     * Default: - Default worker configuration in the job definition
     *
     * @param workerConfiguration The worker configuration for this run. 
     */
    override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
      cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty.Companion::unwrap))
    }

    /**
     * The worker configuration for this run.
     *
     * Default: - Default worker configuration in the job definition
     *
     * @param workerConfiguration The worker configuration for this run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43e47e27b7583458d69d98613de3eff71c77e1e0daeb70156d05d64c6b45117e")
    override
        fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit):
        Unit = workerConfiguration(WorkerConfigurationProperty(workerConfiguration))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: GlueStartJobRunJsonPathProps,
    ): GlueStartJobRun =
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(GlueStartJobRunJsonPathProps.Companion::unwrap)).let(GlueStartJobRun::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a50531e0a41bc4e49e0ee2fb412bc70e418d08b62e29ed5ce7f45e9870a61317")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: GlueStartJobRunJsonPathProps.Builder.() -> Unit,
    ): GlueStartJobRun = jsonPath(scope, id, GlueStartJobRunJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: GlueStartJobRunJsonataProps,
    ): GlueStartJobRun =
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(GlueStartJobRunJsonataProps.Companion::unwrap)).let(GlueStartJobRun::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bdc3eb27021b10d451909ff8f2e9df1652ffcc02a323d7d7d10dd8b4e405567")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: GlueStartJobRunJsonataProps.Builder.() -> Unit,
    ): GlueStartJobRun = jsonata(scope, id, GlueStartJobRunJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GlueStartJobRun {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GlueStartJobRun(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun):
        GlueStartJobRun = GlueStartJobRun(cdkObject)

    internal fun unwrap(wrapped: GlueStartJobRun):
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
  }
}
