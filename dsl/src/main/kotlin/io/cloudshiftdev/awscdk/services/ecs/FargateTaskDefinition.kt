package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateTaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinition,
) : TaskDefinition(cdkObject), IFargateTaskDefinition {
  public override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  public override fun networkMode(): NetworkMode =
      unwrap(this).getNetworkMode().let(NetworkMode::wrap)

  public interface Builder {
    public fun cpu(cpu: Number) {
    }

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    }

    public fun executionRole(executionRole: IRole) {
    }

    public fun family(family: String) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit) {
    }

    public fun taskRole(taskRole: IRole) {
    }

    public fun volumes(volumes: List<Volume>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder.create(scope, id)

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    public override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    public override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    public override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromFargateTaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateTaskDefinitionArn: String,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fargateTaskDefinitionArn).let(IFargateTaskDefinition::wrap)

    public open fun fromFargateTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateTaskDefinitionAttributes,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FargateTaskDefinitionAttributes::unwrap)).let(IFargateTaskDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a04252545f1217926f85148bb768fff294d8987397e2ce21b792cf7ae5f7fdcf")
    public open fun fromFargateTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateTaskDefinitionAttributes.Builder.() -> Unit,
    ): IFargateTaskDefinition = fromFargateTaskDefinitionAttributes(scope, id,
        FargateTaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinition):
        FargateTaskDefinition = FargateTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: FargateTaskDefinition):
        software.amazon.awscdk.services.ecs.FargateTaskDefinition = wrapped.cdkObject
  }
}
