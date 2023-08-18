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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import io.cloudshiftdev.awscdkdsl.services.stepfunctions.CredentialsDsl
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
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
import software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel
import software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput

/**
 * The props for a EMR Containers StartJobRun Task.
 *
 * Example:
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
@CdkDslMarker
public class EmrContainersStartJobRunPropsDsl {
    private val cdkBuilder: EmrContainersStartJobRunProps.Builder =
        EmrContainersStartJobRunProps.builder()

    private val _applicationConfig: MutableList<ApplicationConfiguration> = mutableListOf()

    /**
     * @param applicationConfig The configurations for the application running in the job run.
     *   Maximum of 100 items
     */
    public fun applicationConfig(applicationConfig: ApplicationConfigurationDsl.() -> Unit) {
        _applicationConfig.add(ApplicationConfigurationDsl().apply(applicationConfig).build())
    }

    /**
     * @param applicationConfig The configurations for the application running in the job run.
     *   Maximum of 100 items
     */
    public fun applicationConfig(applicationConfig: Collection<ApplicationConfiguration>) {
        _applicationConfig.addAll(applicationConfig)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param executionRole The execution role for the job run. If `virtualClusterId` is from a JSON
     *   input path, an execution role must be provided. If an execution role is provided, follow
     *   the documentation to update the role trust policy.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat. [disable-awslint:duration-prop-type] is
     *   needed because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language. You can control these AWS services using service integration patterns
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /** @param jobDriver The job driver for the job run. */
    public fun jobDriver(jobDriver: JobDriverDsl.() -> Unit = {}) {
        val builder = JobDriverDsl()
        builder.apply(jobDriver)
        cdkBuilder.jobDriver(builder.build())
    }

    /** @param jobDriver The job driver for the job run. */
    public fun jobDriver(jobDriver: JobDriver) {
        cdkBuilder.jobDriver(jobDriver)
    }

    /** @param jobName The name of the job run. */
    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    /** @param monitoring Configuration for monitoring the job run. */
    public fun monitoring(monitoring: MonitoringDsl.() -> Unit = {}) {
        val builder = MonitoringDsl()
        builder.apply(monitoring)
        cdkBuilder.monitoring(builder.build())
    }

    /** @param monitoring Configuration for monitoring the job run. */
    public fun monitoring(monitoring: Monitoring) {
        cdkBuilder.monitoring(monitoring)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /** @param releaseLabel The Amazon EMR release version to use for the job run. */
    public fun releaseLabel(releaseLabel: ReleaseLabel) {
        cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /** @param tags The tags assigned to job runs. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param taskTimeout Timeout for the task. [disable-awslint:duration-prop-type] is needed
     *   because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /** @param virtualCluster The ID of the virtual cluster where the job will be run. */
    public fun virtualCluster(virtualCluster: VirtualClusterInput) {
        cdkBuilder.virtualCluster(virtualCluster)
    }

    public fun build(): EmrContainersStartJobRunProps {
        if (_applicationConfig.isNotEmpty()) cdkBuilder.applicationConfig(_applicationConfig)
        return cdkBuilder.build()
    }
}
