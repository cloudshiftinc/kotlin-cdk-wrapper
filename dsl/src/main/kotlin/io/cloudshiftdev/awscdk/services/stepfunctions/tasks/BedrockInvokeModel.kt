package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.bedrock.IModel
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

public open class BedrockInvokeModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun accept(accept: String) {
    }

    public fun body(body: TaskInput) {
    }

    public fun comment(comment: String) {
    }

    public fun contentType(contentType: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9836b1e352f5e6c2dbfc3ccc5026429a9c84a71307d8aad3dd518bd7d4b995ed")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun input(input: BedrockInvokeModelInputProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce31c844fd3047c8f83fe543db576d9f3095ccd4ea32abd1c1b5da8acefe766c")
    public fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun model(model: IModel) {
    }

    public fun output(output: BedrockInvokeModelOutputProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun stateName(stateName: String) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.Builder.create(scope,
        id)

    public override fun accept(accept: String) {
      cdkBuilder.accept(accept)
    }

    public override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput::unwrap))
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9836b1e352f5e6c2dbfc3ccc5026429a9c84a71307d8aad3dd518bd7d4b995ed")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce31c844fd3047c8f83fe543db576d9f3095ccd4ea32abd1c1b5da8acefe766c")
    public override fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit): Unit =
        input(BedrockInvokeModelInputProps(input))

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel::unwrap))
    }

    public override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    public override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BedrockInvokeModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BedrockInvokeModel(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel):
        BedrockInvokeModel = BedrockInvokeModel(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModel):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel = wrapped.cdkObject
  }
}
