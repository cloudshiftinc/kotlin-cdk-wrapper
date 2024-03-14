package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ExternalTaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinition,
) : TaskDefinition(cdkObject), IExternalTaskDefinition {
  public override fun addInferenceAccelerator(_inferenceAccelerator: InferenceAccelerator) {
    unwrap(this).addInferenceAccelerator(_inferenceAccelerator.let(InferenceAccelerator::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed9df469538219aa4a519c5c670da4fa01bf9950e8d2a410fbf5d7fc465f966")
  public override
      fun addInferenceAccelerator(_inferenceAccelerator: InferenceAccelerator.Builder.() -> Unit):
      Unit = addInferenceAccelerator(InferenceAccelerator(_inferenceAccelerator))

  public interface Builder {
    public fun executionRole(executionRole: IRole)

    public fun family(family: String)

    public fun networkMode(networkMode: NetworkMode)

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    public fun taskRole(taskRole: IRole)

    public fun volumes(volumes: List<Volume>)

    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.Builder.create(scope, id)

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.ExternalTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromEc2TaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      externalTaskDefinitionArn: String,
    ): IExternalTaskDefinition =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.fromEc2TaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, externalTaskDefinitionArn).let(IExternalTaskDefinition::wrap)

    public open fun fromExternalTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalTaskDefinitionAttributes,
    ): IExternalTaskDefinition =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.fromExternalTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ExternalTaskDefinitionAttributes::unwrap)).let(IExternalTaskDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79b74a848577dd70dae18e1ee2e46d90562825a4b2b91ccfd7a22ec79c56b22a")
    public open fun fromExternalTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalTaskDefinitionAttributes.Builder.() -> Unit,
    ): IExternalTaskDefinition = fromExternalTaskDefinitionAttributes(scope, id,
        ExternalTaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ExternalTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ExternalTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinition):
        ExternalTaskDefinition = ExternalTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: ExternalTaskDefinition):
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition = wrapped.cdkObject
  }
}
