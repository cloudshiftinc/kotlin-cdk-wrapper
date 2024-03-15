@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SageMakerCreateTransformJob internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob,
) : TaskStateBase(cdkObject) {
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun batchStrategy(batchStrategy: BatchStrategy)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439d8ddac8c9473287992dd7eb125d9170503f09906e8ee8651ff59387bd62f6")
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
    @JvmName("a18eba4f02fb1f502cbb95a2024973a630445f1f3d3f54a9f402773f7afcd47a")
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
    @JvmName("82dc1bf573e4c4374710f3488ec7e5eb7d43aeff9469aacf70ba2debe16c69d9")
    public fun transformInput(transformInput: TransformInput.Builder.() -> Unit)

    public fun transformJobName(transformJobName: String)

    public fun transformOutput(transformOutput: TransformOutput)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab81e075c43ff68c02bde2c94a7b730b7c7b5644a2a704dc5d0abc1d32f952e")
    public fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit)

    public fun transformResources(transformResources: TransformResources)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e33440e01307a8a13de1a422d68feeae02998fe1926849452a322e71e8500a41")
    public fun transformResources(transformResources: TransformResources.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob.Builder.create(scope,
        id)

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
    @JvmName("439d8ddac8c9473287992dd7eb125d9170503f09906e8ee8651ff59387bd62f6")
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
    @JvmName("a18eba4f02fb1f502cbb95a2024973a630445f1f3d3f54a9f402773f7afcd47a")
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
    @JvmName("82dc1bf573e4c4374710f3488ec7e5eb7d43aeff9469aacf70ba2debe16c69d9")
    override fun transformInput(transformInput: TransformInput.Builder.() -> Unit): Unit =
        transformInput(TransformInput(transformInput))

    override fun transformJobName(transformJobName: String) {
      cdkBuilder.transformJobName(transformJobName)
    }

    override fun transformOutput(transformOutput: TransformOutput) {
      cdkBuilder.transformOutput(transformOutput.let(TransformOutput::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab81e075c43ff68c02bde2c94a7b730b7c7b5644a2a704dc5d0abc1d32f952e")
    override fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit): Unit =
        transformOutput(TransformOutput(transformOutput))

    override fun transformResources(transformResources: TransformResources) {
      cdkBuilder.transformResources(transformResources.let(TransformResources::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e33440e01307a8a13de1a422d68feeae02998fe1926849452a322e71e8500a41")
    override fun transformResources(transformResources: TransformResources.Builder.() -> Unit): Unit
        = transformResources(TransformResources(transformResources))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SageMakerCreateTransformJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SageMakerCreateTransformJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob):
        SageMakerCreateTransformJob = SageMakerCreateTransformJob(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTransformJob):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob =
        wrapped.cdkObject
  }
}
