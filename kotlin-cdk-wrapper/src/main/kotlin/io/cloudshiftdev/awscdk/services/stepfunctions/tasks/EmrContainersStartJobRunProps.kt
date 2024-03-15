@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface EmrContainersStartJobRunProps : TaskStateBaseProps {
  public fun applicationConfig(): List<ApplicationConfiguration> =
      unwrap(this).getApplicationConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun jobDriver(): JobDriver

  public fun jobName(): String? = unwrap(this).getJobName()

  public fun monitoring(): Monitoring? = unwrap(this).getMonitoring()?.let(Monitoring::wrap)

  public fun releaseLabel(): ReleaseLabel

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun virtualCluster(): VirtualClusterInput

  @CdkDslMarker
  public interface Builder {
    public fun applicationConfig(applicationConfig: List<ApplicationConfiguration>)

    public fun applicationConfig(vararg applicationConfig: ApplicationConfiguration)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("181d89eba921a419b91206d87daad3e750301905844aaffd64f3675d38247dc1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun executionRole(executionRole: IRole)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun jobDriver(jobDriver: JobDriver)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1092962ea4091f5904136f0dac283933a00a3a8e09af81b2404303350e28578e")
    public fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit)

    public fun jobName(jobName: String)

    public fun monitoring(monitoring: Monitoring)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc1fc7612672dfdaa3479269fcf19be9ef6011639392f16c2f473e8199b33e1b")
    public fun monitoring(monitoring: Monitoring.Builder.() -> Unit)

    public fun outputPath(outputPath: String)

    public fun releaseLabel(releaseLabel: ReleaseLabel)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun virtualCluster(virtualCluster: VirtualClusterInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps.builder()

    override fun applicationConfig(applicationConfig: List<ApplicationConfiguration>) {
      cdkBuilder.applicationConfig(applicationConfig.map(ApplicationConfiguration::unwrap))
    }

    override fun applicationConfig(vararg applicationConfig: ApplicationConfiguration): Unit =
        applicationConfig(applicationConfig.toList())

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("181d89eba921a419b91206d87daad3e750301905844aaffd64f3675d38247dc1")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun jobDriver(jobDriver: JobDriver) {
      cdkBuilder.jobDriver(jobDriver.let(JobDriver::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1092962ea4091f5904136f0dac283933a00a3a8e09af81b2404303350e28578e")
    override fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit): Unit =
        jobDriver(JobDriver(jobDriver))

    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    override fun monitoring(monitoring: Monitoring) {
      cdkBuilder.monitoring(monitoring.let(Monitoring::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc1fc7612672dfdaa3479269fcf19be9ef6011639392f16c2f473e8199b33e1b")
    override fun monitoring(monitoring: Monitoring.Builder.() -> Unit): Unit =
        monitoring(Monitoring(monitoring))

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun releaseLabel(releaseLabel: ReleaseLabel) {
      cdkBuilder.releaseLabel(releaseLabel.let(ReleaseLabel::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun virtualCluster(virtualCluster: VirtualClusterInput) {
      cdkBuilder.virtualCluster(virtualCluster.let(VirtualClusterInput::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps,
  ) : CdkObject(cdkObject), EmrContainersStartJobRunProps {
    override fun applicationConfig(): List<ApplicationConfiguration> =
        unwrap(this).getApplicationConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun jobDriver(): JobDriver = unwrap(this).getJobDriver().let(JobDriver::wrap)

    override fun jobName(): String? = unwrap(this).getJobName()

    override fun monitoring(): Monitoring? = unwrap(this).getMonitoring()?.let(Monitoring::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun releaseLabel(): ReleaseLabel =
        unwrap(this).getReleaseLabel().let(ReleaseLabel::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

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
        EmrContainersStartJobRunProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrContainersStartJobRunProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
  }
}
