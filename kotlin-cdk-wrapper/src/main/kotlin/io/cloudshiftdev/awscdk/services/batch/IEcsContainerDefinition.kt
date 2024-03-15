@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IEcsContainerDefinition : IConstruct {
  public fun addVolume(arg0: EcsVolume)

  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun cpu(): Number

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun executionRole(): IRole

  public fun image(): ContainerImage

  public fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

  public fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  public fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  public fun memory(): Size

  public fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  public fun user(): String? = unwrap(this).getUser()

  public fun volumes(): List<EcsVolume>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IEcsContainerDefinition,
  ) : CdkObject(cdkObject), IEcsContainerDefinition {
    override fun addVolume(arg0: EcsVolume) {
      unwrap(this).addVolume(arg0.let(EcsVolume::unwrap))
    }

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun cpu(): Number = unwrap(this).getCpu()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    override fun logDriverConfig(): LogDriverConfig? =
        unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

    override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsContainerDefinition):
        IEcsContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsContainerDefinition
  }
}
