@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * The props for a EMR Containers StartJobRun Task.
 *
 * Example:
 *
 * ```
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobName("EMR-Containers-Job")
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .build())
 * .build())
 * .applicationConfig(List.of(ApplicationConfiguration.builder()
 * .classification(Classification.SPARK_DEFAULTS)
 * .properties(Map.of(
 * "spark.executor.instances", "1",
 * "spark.executor.memory", "512M"))
 * .build()))
 * .build();
 * ```
 */
public interface EmrContainersStartJobRunProps : TaskStateBaseProps {
  /**
   * The configurations for the application running in the job run.
   *
   * Maximum of 100 items
   *
   * Default: - No application config
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
   */
  public fun applicationConfig(): List<ApplicationConfiguration> =
      unwrap(this).getApplicationConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

  /**
   * The execution role for the job run.
   *
   * If `virtualClusterId` is from a JSON input path, an execution role must be provided.
   * If an execution role is provided, follow the documentation to update the role trust policy.
   *
   * Default: - Automatically generated only when the provided `virtualClusterId` is not an encoded
   * JSON path
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/setting-up-trust-policy.html)
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The job driver for the job run.
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
   */
  public fun jobDriver(): JobDriver

  /**
   * The name of the job run.
   *
   * Default: - No job run name
   */
  public fun jobName(): String? = unwrap(this).getJobName()

  /**
   * Configuration for monitoring the job run.
   *
   * Default: - logging enabled and resources automatically generated if `monitoring.logging` is set
   * to `true`
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
   */
  public fun monitoring(): Monitoring? = unwrap(this).getMonitoring()?.let(Monitoring::wrap)

  /**
   * The Amazon EMR release version to use for the job run.
   */
  public fun releaseLabel(): ReleaseLabel

  /**
   * The tags assigned to job runs.
   *
   * Default: - None
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the virtual cluster where the job will be run.
   */
  public fun virtualCluster(): VirtualClusterInput

  /**
   * A builder for [EmrContainersStartJobRunProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationConfig The configurations for the application running in the job run.
     * Maximum of 100 items
     */
    public fun applicationConfig(applicationConfig: List<ApplicationConfiguration>)

    /**
     * @param applicationConfig The configurations for the application running in the job run.
     * Maximum of 100 items
     */
    public fun applicationConfig(vararg applicationConfig: ApplicationConfiguration)

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
    @JvmName("181d89eba921a419b91206d87daad3e750301905844aaffd64f3675d38247dc1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param executionRole The execution role for the job run.
     * If `virtualClusterId` is from a JSON input path, an execution role must be provided.
     * If an execution role is provided, follow the documentation to update the role trust policy.
     */
    public fun executionRole(executionRole: IRole)

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
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param jobDriver The job driver for the job run. 
     */
    public fun jobDriver(jobDriver: JobDriver)

    /**
     * @param jobDriver The job driver for the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1092962ea4091f5904136f0dac283933a00a3a8e09af81b2404303350e28578e")
    public fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit)

    /**
     * @param jobName The name of the job run.
     */
    public fun jobName(jobName: String)

    /**
     * @param monitoring Configuration for monitoring the job run.
     */
    public fun monitoring(monitoring: Monitoring)

    /**
     * @param monitoring Configuration for monitoring the job run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc1fc7612672dfdaa3479269fcf19be9ef6011639392f16c2f473e8199b33e1b")
    public fun monitoring(monitoring: Monitoring.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
     * @param releaseLabel The Amazon EMR release version to use for the job run. 
     */
    public fun releaseLabel(releaseLabel: ReleaseLabel)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param tags The tags assigned to job runs.
     */
    public fun tags(tags: Map<String, String>)

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
     * @param virtualCluster The ID of the virtual cluster where the job will be run. 
     */
    public fun virtualCluster(virtualCluster: VirtualClusterInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps.builder()

    /**
     * @param applicationConfig The configurations for the application running in the job run.
     * Maximum of 100 items
     */
    override fun applicationConfig(applicationConfig: List<ApplicationConfiguration>) {
      cdkBuilder.applicationConfig(applicationConfig.map(ApplicationConfiguration.Companion::unwrap))
    }

    /**
     * @param applicationConfig The configurations for the application running in the job run.
     * Maximum of 100 items
     */
    override fun applicationConfig(vararg applicationConfig: ApplicationConfiguration): Unit =
        applicationConfig(applicationConfig.toList())

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
    @JvmName("181d89eba921a419b91206d87daad3e750301905844aaffd64f3675d38247dc1")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param executionRole The execution role for the job run.
     * If `virtualClusterId` is from a JSON input path, an execution role must be provided.
     * If an execution role is provided, follow the documentation to update the role trust policy.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
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
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
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
     * @param jobDriver The job driver for the job run. 
     */
    override fun jobDriver(jobDriver: JobDriver) {
      cdkBuilder.jobDriver(jobDriver.let(JobDriver.Companion::unwrap))
    }

    /**
     * @param jobDriver The job driver for the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1092962ea4091f5904136f0dac283933a00a3a8e09af81b2404303350e28578e")
    override fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit): Unit =
        jobDriver(JobDriver(jobDriver))

    /**
     * @param jobName The name of the job run.
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    /**
     * @param monitoring Configuration for monitoring the job run.
     */
    override fun monitoring(monitoring: Monitoring) {
      cdkBuilder.monitoring(monitoring.let(Monitoring.Companion::unwrap))
    }

    /**
     * @param monitoring Configuration for monitoring the job run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc1fc7612672dfdaa3479269fcf19be9ef6011639392f16c2f473e8199b33e1b")
    override fun monitoring(monitoring: Monitoring.Builder.() -> Unit): Unit =
        monitoring(Monitoring(monitoring))

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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
     * @param releaseLabel The Amazon EMR release version to use for the job run. 
     */
    override fun releaseLabel(releaseLabel: ReleaseLabel) {
      cdkBuilder.releaseLabel(releaseLabel.let(ReleaseLabel.Companion::unwrap))
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param tags The tags assigned to job runs.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
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
     * @param virtualCluster The ID of the virtual cluster where the job will be run. 
     */
    override fun virtualCluster(virtualCluster: VirtualClusterInput) {
      cdkBuilder.virtualCluster(virtualCluster.let(VirtualClusterInput.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps,
  ) : CdkObject(cdkObject),
      EmrContainersStartJobRunProps {
    /**
     * The configurations for the application running in the job run.
     *
     * Maximum of 100 items
     *
     * Default: - No application config
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
     */
    override fun applicationConfig(): List<ApplicationConfiguration> =
        unwrap(this).getApplicationConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

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
     * The execution role for the job run.
     *
     * If `virtualClusterId` is from a JSON input path, an execution role must be provided.
     * If an execution role is provided, follow the documentation to update the role trust policy.
     *
     * Default: - Automatically generated only when the provided `virtualClusterId` is not an
     * encoded JSON path
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/setting-up-trust-policy.html)
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

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
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

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
     * The job driver for the job run.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
     */
    override fun jobDriver(): JobDriver = unwrap(this).getJobDriver().let(JobDriver::wrap)

    /**
     * The name of the job run.
     *
     * Default: - No job run name
     */
    override fun jobName(): String? = unwrap(this).getJobName()

    /**
     * Configuration for monitoring the job run.
     *
     * Default: - logging enabled and resources automatically generated if `monitoring.logging` is
     * set to `true`
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
     */
    override fun monitoring(): Monitoring? = unwrap(this).getMonitoring()?.let(Monitoring::wrap)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

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
     * The Amazon EMR release version to use for the job run.
     */
    override fun releaseLabel(): ReleaseLabel =
        unwrap(this).getReleaseLabel().let(ReleaseLabel::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

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
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * The tags assigned to job runs.
     *
     * Default: - None
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

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
     * The ID of the virtual cluster where the job will be run.
     */
    override fun virtualCluster(): VirtualClusterInput =
        unwrap(this).getVirtualCluster().let(VirtualClusterInput::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrContainersStartJobRunProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps):
        EmrContainersStartJobRunProps = CdkObjectWrappers.wrap(cdkObject) as?
        EmrContainersStartJobRunProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrContainersStartJobRunProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
  }
}
