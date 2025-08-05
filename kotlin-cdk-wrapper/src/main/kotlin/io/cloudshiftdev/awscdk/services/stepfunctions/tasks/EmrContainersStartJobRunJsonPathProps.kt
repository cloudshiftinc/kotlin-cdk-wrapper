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
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for calling EMR Containers StartJobRun using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * ApplicationConfiguration applicationConfiguration_;
 * Object assign;
 * Bucket bucket;
 * Classification classification;
 * LogGroup logGroup;
 * ReleaseLabel releaseLabel;
 * Object resultSelector;
 * Role role;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * VirtualClusterInput virtualClusterInput;
 * EmrContainersStartJobRunJsonPathProps emrContainersStartJobRunJsonPathProps =
 * EmrContainersStartJobRunJsonPathProps.builder()
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(taskInput)
 * // the properties below are optional
 * .entryPointArguments(taskInput)
 * .sparkSubmitParameters("sparkSubmitParameters")
 * .build())
 * .build())
 * .releaseLabel(releaseLabel)
 * .virtualCluster(virtualClusterInput)
 * // the properties below are optional
 * .applicationConfig(List.of(ApplicationConfiguration.builder()
 * .classification(classification)
 * // the properties below are optional
 * .nestedConfig(List.of(applicationConfiguration_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .executionRole(role)
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .jobName("jobName")
 * .monitoring(Monitoring.builder()
 * .logBucket(bucket)
 * .logging(false)
 * .logGroup(logGroup)
 * .logStreamNamePrefix("logStreamNamePrefix")
 * .persistentAppUI(false)
 * .build())
 * .outputPath("outputPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface EmrContainersStartJobRunJsonPathProps : TaskStateJsonPathBaseProps {
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
   * A builder for [EmrContainersStartJobRunJsonPathProps]
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
    @JvmName("b455875f7538dca8e5b1145ed9d6359ba2254e8c4a4e37f523a3cc1e2385c655")
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
    @JvmName("6691368d0c72ee75ba8717ef8630ea97e76b1e242e99d51768ddfe200f85c273")
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
    @JvmName("0177078d4f614f1377f6c4cc763d9454790c1b410d71dae7d9594efdb3b85d0a")
    public fun monitoring(monitoring: Monitoring.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps.builder()

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
    @JvmName("b455875f7538dca8e5b1145ed9d6359ba2254e8c4a4e37f523a3cc1e2385c655")
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
    @JvmName("6691368d0c72ee75ba8717ef8630ea97e76b1e242e99d51768ddfe200f85c273")
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
    @JvmName("0177078d4f614f1377f6c4cc763d9454790c1b410d71dae7d9594efdb3b85d0a")
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
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps,
  ) : CdkObject(cdkObject),
      EmrContainersStartJobRunJsonPathProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EmrContainersStartJobRunJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps):
        EmrContainersStartJobRunJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        EmrContainersStartJobRunJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrContainersStartJobRunJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunJsonPathProps
  }
}
