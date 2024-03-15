@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface FargateTaskDefinitionProps : CommonTaskDefinitionProps {
  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  public fun runtimePlatform(): RuntimePlatform? =
      unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

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
    @JvmName("155de2a041f71af28c81cda70d395e02590af84689b48fbc9a6b8532c2e085eb")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun taskRole(taskRole: IRole)

    public fun volumes(volumes: List<Volume>)

    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.builder()

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
    @JvmName("155de2a041f71af28c81cda70d395e02590af84689b48fbc9a6b8532c2e085eb")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps,
  ) : CdkObject(cdkObject), FargateTaskDefinitionProps {
    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun family(): String? = unwrap(this).getFamily()

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun proxyConfiguration(): ProxyConfiguration? =
        unwrap(this).getProxyConfiguration()?.let(ProxyConfiguration::wrap)

    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

    override fun volumes(): List<Volume> = unwrap(this).getVolumes()?.map(Volume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateTaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps):
        FargateTaskDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateTaskDefinitionProps):
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
  }
}
