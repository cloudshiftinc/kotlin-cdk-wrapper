@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface BedrockInvokeModelProps : TaskStateBaseProps {
  public fun accept(): String? = unwrap(this).getAccept()

  public fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

  public fun contentType(): String? = unwrap(this).getContentType()

  public fun input(): BedrockInvokeModelInputProps? =
      unwrap(this).getInput()?.let(BedrockInvokeModelInputProps::wrap)

  public fun model(): IModel

  public fun output(): BedrockInvokeModelOutputProps? =
      unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accept(accept: String)

    public fun body(body: TaskInput)

    public fun comment(comment: String)

    public fun contentType(contentType: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("325a554503021599a7241386fb143c9e545442362ed53bcd75e5b5cce3585a73")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun input(input: BedrockInvokeModelInputProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebf5e3d848d362be87d17220070b5aebc32936fe5210754ba33f32d23924644e")
    public fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun model(model: IModel)

    public fun output(output: BedrockInvokeModelOutputProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa0163256f1a2ad7fb781397069d5b6bd7802a0e0d6ef80a4955da44911cfa5b")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps.builder()

    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
    }

    override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("325a554503021599a7241386fb143c9e545442362ed53bcd75e5b5cce3585a73")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebf5e3d848d362be87d17220070b5aebc32936fe5210754ba33f32d23924644e")
    override fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit): Unit =
        input(BedrockInvokeModelInputProps(input))

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel::unwrap))
    }

    override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa0163256f1a2ad7fb781397069d5b6bd7802a0e0d6ef80a4955da44911cfa5b")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

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

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps,
  ) : CdkObject(cdkObject), BedrockInvokeModelProps {
    override fun accept(): String? = unwrap(this).getAccept()

    override fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun contentType(): String? = unwrap(this).getContentType()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun input(): BedrockInvokeModelInputProps? =
        unwrap(this).getInput()?.let(BedrockInvokeModelInputProps::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun model(): IModel = unwrap(this).getModel().let(IModel::wrap)

    override fun output(): BedrockInvokeModelOutputProps? =
        unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps):
        BedrockInvokeModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps
  }
}
