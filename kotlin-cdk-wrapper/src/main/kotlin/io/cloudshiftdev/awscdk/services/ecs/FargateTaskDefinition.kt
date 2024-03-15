@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateTaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinition,
) : TaskDefinition(cdkObject), IFargateTaskDefinition {
  public override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  public override fun networkMode(): NetworkMode =
      unwrap(this).getNetworkMode().let(NetworkMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cpu(cpu: Number)

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    public fun executionRole(executionRole: IRole)

    public fun family(family: String)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun taskRole(taskRole: IRole)

    public fun volumes(volumes: List<Volume>)

    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder.create(scope, id)

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromFargateTaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateTaskDefinitionArn: String,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fargateTaskDefinitionArn).let(IFargateTaskDefinition::wrap)

    public fun fromFargateTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateTaskDefinitionAttributes,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FargateTaskDefinitionAttributes::unwrap)).let(IFargateTaskDefinition::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a04252545f1217926f85148bb768fff294d8987397e2ce21b792cf7ae5f7fdcf")
    public fun fromFargateTaskDefinitionAttributes(
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
