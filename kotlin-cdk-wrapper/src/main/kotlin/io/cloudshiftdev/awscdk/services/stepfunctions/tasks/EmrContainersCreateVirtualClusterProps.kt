@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface EmrContainersCreateVirtualClusterProps : TaskStateBaseProps {
  public fun eksCluster(): EksClusterInput

  public fun eksNamespace(): String? = unwrap(this).getEksNamespace()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun virtualClusterName(): String? = unwrap(this).getVirtualClusterName()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29d711abe2222b0df39667224f93722c4b57ddf2771a891743a0a28888a1b48a")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun eksCluster(eksCluster: EksClusterInput)

    public fun eksNamespace(eksNamespace: String)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun virtualClusterName(virtualClusterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29d711abe2222b0df39667224f93722c4b57ddf2771a891743a0a28888a1b48a")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun eksCluster(eksCluster: EksClusterInput) {
      cdkBuilder.eksCluster(eksCluster.let(EksClusterInput::unwrap))
    }

    override fun eksNamespace(eksNamespace: String) {
      cdkBuilder.eksNamespace(eksNamespace)
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

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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

    override fun virtualClusterName(virtualClusterName: String) {
      cdkBuilder.virtualClusterName(virtualClusterName)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps,
  ) : CdkObject(cdkObject), EmrContainersCreateVirtualClusterProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun eksCluster(): EksClusterInput =
        unwrap(this).getEksCluster().let(EksClusterInput::wrap)

    override fun eksNamespace(): String? = unwrap(this).getEksNamespace()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun virtualClusterName(): String? = unwrap(this).getVirtualClusterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EmrContainersCreateVirtualClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps):
        EmrContainersCreateVirtualClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrContainersCreateVirtualClusterProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps
  }
}
