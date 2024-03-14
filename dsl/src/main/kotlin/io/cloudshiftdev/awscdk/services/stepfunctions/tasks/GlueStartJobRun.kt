package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GlueStartJobRun internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun arguments(arguments: TaskInput)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aee74dc25bc0b12b0d3d4e10ef13dd696dcbd73632ff957db2199f3560ecf65")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun glueJobName(glueJobName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun notifyDelayAfter(notifyDelayAfter: Duration)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun securityConfiguration(securityConfiguration: String)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.Builder.create(scope,
        id)

    override fun arguments(arguments: TaskInput) {
      cdkBuilder.arguments(arguments.let(TaskInput::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5aee74dc25bc0b12b0d3d4e10ef13dd696dcbd73632ff957db2199f3560ecf65")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun glueJobName(glueJobName: String) {
      cdkBuilder.glueJobName(glueJobName)
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

    override fun notifyDelayAfter(notifyDelayAfter: Duration) {
      cdkBuilder.notifyDelayAfter(notifyDelayAfter.let(Duration::unwrap))
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

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun = wrapped.cdkObject
  }
}
