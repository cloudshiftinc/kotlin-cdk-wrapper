package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IActivity
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
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

public open class StepFunctionsInvokeActivity internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun activity(activity: IActivity)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee8293d7c4f7e0dd2c541087c097026c9d08c2c497dde3ac8a5679688684039")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

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
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity.Builder.create(scope,
        id)

    override fun activity(activity: IActivity) {
      cdkBuilder.activity(activity.let(IActivity::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee8293d7c4f7e0dd2c541087c097026c9d08c2c497dde3ac8a5679688684039")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
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

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepFunctionsInvokeActivity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepFunctionsInvokeActivity(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity):
        StepFunctionsInvokeActivity = StepFunctionsInvokeActivity(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsInvokeActivity):
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity =
        wrapped.cdkObject
  }
}
