package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrContainersStartJobRun internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun,
) : TaskStateBase(cdkObject), IGrantable {
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public interface Builder {
    public fun applicationConfig(applicationConfig: List<ApplicationConfiguration>)

    public fun applicationConfig(vararg applicationConfig: ApplicationConfiguration)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b3da2b4031a0fbb88f274e003d39f32e03f223d156002935aa9496039fbb580")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun executionRole(executionRole: IRole)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun jobDriver(jobDriver: JobDriver)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324dccdccb01290b4209a243d6efdc9da5d8fc543ba1505e6a8ae1317f36126c")
    public fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit)

    public fun jobName(jobName: String)

    public fun monitoring(monitoring: Monitoring)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fc52187966051a33869f2f4c7b100d8a0d3a4facddd9b92073410b125f265c0")
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun.Builder.create(scope,
        id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b3da2b4031a0fbb88f274e003d39f32e03f223d156002935aa9496039fbb580")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324dccdccb01290b4209a243d6efdc9da5d8fc543ba1505e6a8ae1317f36126c")
    override fun jobDriver(jobDriver: JobDriver.Builder.() -> Unit): Unit =
        jobDriver(JobDriver(jobDriver))

    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    override fun monitoring(monitoring: Monitoring) {
      cdkBuilder.monitoring(monitoring.let(Monitoring::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fc52187966051a33869f2f4c7b100d8a0d3a4facddd9b92073410b125f265c0")
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
