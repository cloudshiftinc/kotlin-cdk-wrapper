@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface SageMakerCreateTransformJobProps : TaskStateBaseProps {
  public fun batchStrategy(): BatchStrategy? =
      unwrap(this).getBatchStrategy()?.let(BatchStrategy::wrap)

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

  public fun maxPayload(): Size? = unwrap(this).getMaxPayload()?.let(Size::wrap)

  public fun modelClientOptions(): ModelClientOptions? =
      unwrap(this).getModelClientOptions()?.let(ModelClientOptions::wrap)

  public fun modelName(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun transformInput(): TransformInput

  public fun transformJobName(): String

  public fun transformOutput(): TransformOutput

  public fun transformResources(): TransformResources? =
      unwrap(this).getTransformResources()?.let(TransformResources::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun batchStrategy(batchStrategy: BatchStrategy)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159aa3d67e0a952715613c7397b798fdc008ef748072832a87ee1baed95921c1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun environment(environment: Map<String, String>)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun maxConcurrentTransforms(maxConcurrentTransforms: Number)

    public fun maxPayload(maxPayload: Size)

    public fun modelClientOptions(modelClientOptions: ModelClientOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b17015454edaf23e76bbaa259fdecc39ac3446e23062301ec17ecb95f925743")
    public fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit)

    public fun modelName(modelName: String)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun role(role: IRole)

    public fun stateName(stateName: String)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun transformInput(transformInput: TransformInput)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac7cfcdf3f84e36627ba72aed2c353dae7611dc8b334ded0776319549feabab")
    public fun transformInput(transformInput: TransformInput.Builder.() -> Unit)

    public fun transformJobName(transformJobName: String)

    public fun transformOutput(transformOutput: TransformOutput)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fabf72084c0711d1a38e257479295ef6e8b5e490446d7f5bac142ee4db43a75")
    public fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit)

    public fun transformResources(transformResources: TransformResources)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8925d9f8bc5d75e4ecfe2e9f49b2fa219e6c1b34cbdba98d78923ab2b143ba78")
    public fun transformResources(transformResources: TransformResources.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps.builder()

    override fun batchStrategy(batchStrategy: BatchStrategy) {
      cdkBuilder.batchStrategy(batchStrategy.let(BatchStrategy::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159aa3d67e0a952715613c7397b798fdc008ef748072832a87ee1baed95921c1")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
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

    override fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
      cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
    }

    override fun maxPayload(maxPayload: Size) {
      cdkBuilder.maxPayload(maxPayload.let(Size::unwrap))
    }

    override fun modelClientOptions(modelClientOptions: ModelClientOptions) {
      cdkBuilder.modelClientOptions(modelClientOptions.let(ModelClientOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b17015454edaf23e76bbaa259fdecc39ac3446e23062301ec17ecb95f925743")
    override fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit): Unit
        = modelClientOptions(ModelClientOptions(modelClientOptions))

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
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

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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

    override fun transformInput(transformInput: TransformInput) {
      cdkBuilder.transformInput(transformInput.let(TransformInput::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac7cfcdf3f84e36627ba72aed2c353dae7611dc8b334ded0776319549feabab")
    override fun transformInput(transformInput: TransformInput.Builder.() -> Unit): Unit =
        transformInput(TransformInput(transformInput))

    override fun transformJobName(transformJobName: String) {
      cdkBuilder.transformJobName(transformJobName)
    }

    override fun transformOutput(transformOutput: TransformOutput) {
      cdkBuilder.transformOutput(transformOutput.let(TransformOutput::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fabf72084c0711d1a38e257479295ef6e8b5e490446d7f5bac142ee4db43a75")
    override fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit): Unit =
        transformOutput(TransformOutput(transformOutput))

    override fun transformResources(transformResources: TransformResources) {
      cdkBuilder.transformResources(transformResources.let(TransformResources::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8925d9f8bc5d75e4ecfe2e9f49b2fa219e6c1b34cbdba98d78923ab2b143ba78")
    override fun transformResources(transformResources: TransformResources.Builder.() -> Unit): Unit
        = transformResources(TransformResources(transformResources))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps,
  ) : CdkObject(cdkObject), SageMakerCreateTransformJobProps {
    override fun batchStrategy(): BatchStrategy? =
        unwrap(this).getBatchStrategy()?.let(BatchStrategy::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

    override fun maxPayload(): Size? = unwrap(this).getMaxPayload()?.let(Size::wrap)

    override fun modelClientOptions(): ModelClientOptions? =
        unwrap(this).getModelClientOptions()?.let(ModelClientOptions::wrap)

    override fun modelName(): String = unwrap(this).getModelName()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun transformInput(): TransformInput =
        unwrap(this).getTransformInput().let(TransformInput::wrap)

    override fun transformJobName(): String = unwrap(this).getTransformJobName()

    override fun transformOutput(): TransformOutput =
        unwrap(this).getTransformOutput().let(TransformOutput::wrap)

    override fun transformResources(): TransformResources? =
        unwrap(this).getTransformResources()?.let(TransformResources::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SageMakerCreateTransformJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps):
        SageMakerCreateTransformJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTransformJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
  }
}
