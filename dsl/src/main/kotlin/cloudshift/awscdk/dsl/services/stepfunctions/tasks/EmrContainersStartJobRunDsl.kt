@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
import software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel
import software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput
import software.constructs.Construct

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
@CdkDslMarker
public class EmrContainersStartJobRunDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EmrContainersStartJobRun.Builder =
      EmrContainersStartJobRun.Builder.create(scope, id)

  private val _applicationConfig: MutableList<ApplicationConfiguration> = mutableListOf()

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
  public fun applicationConfig(applicationConfig: ApplicationConfigurationDsl.() -> Unit) {
    _applicationConfig.add(ApplicationConfigurationDsl().apply(applicationConfig).build())
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
  public fun applicationConfig(applicationConfig: Collection<ApplicationConfiguration>) {
    _applicationConfig.addAll(applicationConfig)
  }

  /**
   * An optional description for this state.
   *
   * Default: - No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
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
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * Credentials for an IAM Role that the State Machine assumes for executing the task.
   *
   * This enables cross-account resource invocations.
   *
   * Default: - None (Task is executed using the State Machine's execution role)
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

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
   * @param executionRole The execution role for the job run. 
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
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
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
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
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: - The entire task input (JSON path '$')
   *
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * 
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * AWS Step Functions integrates with services directly in the Amazon States Language.
   *
   * You can control these AWS services using service integration patterns
   *
   * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
   * `IntegrationPattern.RUN_JOB` for the following exceptions:
   * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
   * `EmrContainersStartJobRun`.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language. 
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * The job driver for the job run.
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
   * @param jobDriver The job driver for the job run. 
   */
  public fun jobDriver(jobDriver: JobDriverDsl.() -> Unit = {}) {
    val builder = JobDriverDsl()
    builder.apply(jobDriver)
    cdkBuilder.jobDriver(builder.build())
  }

  /**
   * The job driver for the job run.
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_JobDriver.html)
   * @param jobDriver The job driver for the job run. 
   */
  public fun jobDriver(jobDriver: JobDriver) {
    cdkBuilder.jobDriver(jobDriver)
  }

  /**
   * The name of the job run.
   *
   * Default: - No job run name
   *
   * @param jobName The name of the job run. 
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * Configuration for monitoring the job run.
   *
   * Default: - logging enabled and resources automatically generated if `monitoring.logging` is set
   * to `true`
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
   * @param monitoring Configuration for monitoring the job run. 
   */
  public fun monitoring(monitoring: MonitoringDsl.() -> Unit = {}) {
    val builder = MonitoringDsl()
    builder.apply(monitoring)
    cdkBuilder.monitoring(builder.build())
  }

  /**
   * Configuration for monitoring the job run.
   *
   * Default: - logging enabled and resources automatically generated if `monitoring.logging` is set
   * to `true`
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_MonitoringConfiguration.html)
   * @param monitoring Configuration for monitoring the job run. 
   */
  public fun monitoring(monitoring: Monitoring) {
    cdkBuilder.monitoring(monitoring)
  }

  /**
   * JSONPath expression to select select a portion of the state output to pass to the next state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   *
   * Default: - The entire JSON node determined by the state input, the task result,
   * and resultPath is passed to the next state (JSON path '$')
   *
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state. 
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * The Amazon EMR release version to use for the job run.
   *
   * @param releaseLabel The Amazon EMR release version to use for the job run. 
   */
  public fun releaseLabel(releaseLabel: ReleaseLabel) {
    cdkBuilder.releaseLabel(releaseLabel)
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
  public fun resultPath(resultPath: String) {
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
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
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
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  /**
   * The tags assigned to job runs.
   *
   * Default: - None
   *
   * @param tags The tags assigned to job runs. 
   */
  public fun tags(tags: Map<String, String>) {
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
  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
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
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * The ID of the virtual cluster where the job will be run.
   *
   * @param virtualCluster The ID of the virtual cluster where the job will be run. 
   */
  public fun virtualCluster(virtualCluster: VirtualClusterInput) {
    cdkBuilder.virtualCluster(virtualCluster)
  }

  public fun build(): EmrContainersStartJobRun {
    if(_applicationConfig.isNotEmpty()) cdkBuilder.applicationConfig(_applicationConfig)
    return cdkBuilder.build()
  }
}
