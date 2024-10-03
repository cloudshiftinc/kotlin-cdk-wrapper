@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Starts a job run.
 *
 * A job is a unit of work that you submit to Amazon EMR on EKS for execution.
 * The work performed by the job can be defined by a Spark jar, PySpark script, or SparkSQL query.
 * A job run is an execution of the job on the virtual cluster.
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
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-emr-eks.html)
 */
public open class EmrContainersStartJobRun(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun,
) : TaskStateBase(cdkObject),
    IGrantable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrContainersStartJobRunProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EmrContainersStartJobRunProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrContainersStartJobRunProps.Builder.() -> Unit,
  ) : this(scope, id, EmrContainersStartJobRunProps(props)
  )

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configurations for the application running in the job run.
     *
     * Maximum of 100 items
     *
     * Default: - No application config
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
     * @param applicationConfig The configurations for the application running in the job run. 
     */
    public fun applicationConfig(applicationConfig: List<ApplicationConfiguration>)

    /**
     * The configurations for the application running in the job run.
     *
     * Maximum of 100 items
     *
     * Default: - No application config
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
     * @param applicationConfig The configurations for the application running in the job run. 
     */
    public fun applicationConfig(vararg applicationConfig: ApplicationConfiguration)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
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
    @JvmName("8b3da2b4031a0fbb88f274e003d39f32e03f223d156002935aa9496039fbb580")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
     * @param executionRole The execution role for the job run. 
     */
    public fun executionRole(executionRole: IRole)

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
     * Default: - The entire task input (JSON path '$')
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
     * The job driver for the job run.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
     * @param jobDriver The job driver for the job run. 
     */
    public fun jobDriver(jobDriver: JobDriver)

    /**
     * The job driver for the job run.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
     * @param jobDriver The job driver for the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324dccdccb01290b4209a243d6efdc9da5d8fc543ba1505e6a8ae1317f36126c")
    public fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit)

    /**
     * The name of the job run.
     *
     * Default: - No job run name
     *
     * @param jobName The name of the job run. 
     */
    public fun jobName(jobName: String)

    /**
     * Configuration for monitoring the job run.
     *
     * Default: - logging enabled and resources automatically generated if `monitoring.logging` is
     * set to `true`
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
     * @param monitoring Configuration for monitoring the job run. 
     */
    public fun monitoring(monitoring: Monitoring)

    /**
     * Configuration for monitoring the job run.
     *
     * Default: - logging enabled and resources automatically generated if `monitoring.logging` is
     * set to `true`
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
     * @param monitoring Configuration for monitoring the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fc52187966051a33869f2f4c7b100d8a0d3a4facddd9b92073410b125f265c0")
    public fun monitoring(monitoring: Monitoring.Builder.() -> Unit)

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * The Amazon EMR release version to use for the job run.
     *
     * @param releaseLabel The Amazon EMR release version to use for the job run. 
     */
    public fun releaseLabel(releaseLabel: ReleaseLabel)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * The tags assigned to job runs.
     *
     * Default: - None
     *
     * @param tags The tags assigned to job runs. 
     */
    public fun tags(tags: Map<String, String>)

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
     * The ID of the virtual cluster where the job will be run.
     *
     * @param virtualCluster The ID of the virtual cluster where the job will be run. 
     */
    public fun virtualCluster(virtualCluster: VirtualClusterInput)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun.Builder.create(scope,
        id)

    /**
     * The configurations for the application running in the job run.
     *
     * Maximum of 100 items
     *
     * Default: - No application config
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
     * @param applicationConfig The configurations for the application running in the job run. 
     */
    override fun applicationConfig(applicationConfig: List<ApplicationConfiguration>) {
      cdkBuilder.applicationConfig(applicationConfig.map(ApplicationConfiguration.Companion::unwrap))
    }

    /**
     * The configurations for the application running in the job run.
     *
     * Maximum of 100 items
     *
     * Default: - No application config
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_Configuration.html)
     * @param applicationConfig The configurations for the application running in the job run. 
     */
    override fun applicationConfig(vararg applicationConfig: ApplicationConfiguration): Unit =
        applicationConfig(applicationConfig.toList())

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
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
    @JvmName("8b3da2b4031a0fbb88f274e003d39f32e03f223d156002935aa9496039fbb580")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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
     * @param executionRole The execution role for the job run. 
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
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
     * Default: - The entire task input (JSON path '$')
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
     * The job driver for the job run.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
     * @param jobDriver The job driver for the job run. 
     */
    override fun jobDriver(jobDriver: JobDriver) {
      cdkBuilder.jobDriver(jobDriver.let(JobDriver.Companion::unwrap))
    }

    /**
     * The job driver for the job run.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
     * @param jobDriver The job driver for the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324dccdccb01290b4209a243d6efdc9da5d8fc543ba1505e6a8ae1317f36126c")
    override fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit): Unit =
        jobDriver(JobDriver(jobDriver))

    /**
     * The name of the job run.
     *
     * Default: - No job run name
     *
     * @param jobName The name of the job run. 
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    /**
     * Configuration for monitoring the job run.
     *
     * Default: - logging enabled and resources automatically generated if `monitoring.logging` is
     * set to `true`
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
     * @param monitoring Configuration for monitoring the job run. 
     */
    override fun monitoring(monitoring: Monitoring) {
      cdkBuilder.monitoring(monitoring.let(Monitoring.Companion::unwrap))
    }

    /**
     * Configuration for monitoring the job run.
     *
     * Default: - logging enabled and resources automatically generated if `monitoring.logging` is
     * set to `true`
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
     * @param monitoring Configuration for monitoring the job run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fc52187966051a33869f2f4c7b100d8a0d3a4facddd9b92073410b125f265c0")
    override fun monitoring(monitoring: Monitoring.Builder.() -> Unit): Unit =
        monitoring(Monitoring(monitoring))

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * The Amazon EMR release version to use for the job run.
     *
     * @param releaseLabel The Amazon EMR release version to use for the job run. 
     */
    override fun releaseLabel(releaseLabel: ReleaseLabel) {
      cdkBuilder.releaseLabel(releaseLabel.let(ReleaseLabel.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
     * The tags assigned to job runs.
     *
     * Default: - None
     *
     * @param tags The tags assigned to job runs. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
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
     * The ID of the virtual cluster where the job will be run.
     *
     * @param virtualCluster The ID of the virtual cluster where the job will be run. 
     */
    override fun virtualCluster(virtualCluster: VirtualClusterInput) {
      cdkBuilder.virtualCluster(virtualCluster.let(VirtualClusterInput.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrContainersStartJobRun {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrContainersStartJobRun(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun):
        EmrContainersStartJobRun = EmrContainersStartJobRun(cdkObject)

    internal fun unwrap(wrapped: EmrContainersStartJobRun):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
  }
}
