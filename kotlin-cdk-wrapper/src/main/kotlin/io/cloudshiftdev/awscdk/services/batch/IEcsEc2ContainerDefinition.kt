@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface IEcsEc2ContainerDefinition : IEcsContainerDefinition {
  public fun addUlimit(arg0: Ulimit)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
  public fun addUlimit(arg0: Ulimit.Builder.() -> Unit)

  public fun gpu(): Number? = unwrap(this).getGpu()

  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  public fun ulimits(): List<Ulimit>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition,
  ) : CdkObject(cdkObject), IEcsEc2ContainerDefinition {
    override fun addUlimit(arg0: Ulimit) {
      unwrap(this).addUlimit(arg0.let(Ulimit::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
    override fun addUlimit(arg0: Ulimit.Builder.() -> Unit): Unit = addUlimit(Ulimit(arg0))

    override fun addVolume(arg0: EcsVolume) {
      unwrap(this).addVolume(arg0.let(EcsVolume::unwrap))
    }

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun cpu(): Number = unwrap(this).getCpu()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

    override fun gpu(): Number? = unwrap(this).getGpu()

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    override fun logDriverConfig(): LogDriverConfig? =
        unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

    override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition):
        IEcsEc2ContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsEc2ContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition
  }
}
