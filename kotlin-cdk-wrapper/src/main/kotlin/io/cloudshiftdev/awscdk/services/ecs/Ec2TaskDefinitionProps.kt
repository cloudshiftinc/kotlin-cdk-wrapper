@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Ec2TaskDefinitionProps : CommonTaskDefinitionProps {
  public fun inferenceAccelerators(): List<InferenceAccelerator> =
      unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

  public fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

  public fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

  public fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun executionRole(executionRole: IRole)

    public fun family(family: String)

    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>)

    public fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator)

    public fun ipcMode(ipcMode: IpcMode)

    public fun networkMode(networkMode: NetworkMode)

    public fun pidMode(pidMode: PidMode)

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    public fun taskRole(taskRole: IRole)

    public fun volumes(volumes: List<Volume>)

    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.builder()

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    override fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

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

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps,
  ) : CdkObject(cdkObject), Ec2TaskDefinitionProps {
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun family(): String? = unwrap(this).getFamily()

    override fun inferenceAccelerators(): List<InferenceAccelerator> =
        unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

    override fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    override fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    override fun proxyConfiguration(): ProxyConfiguration? =
        unwrap(this).getProxyConfiguration()?.let(ProxyConfiguration::wrap)

    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

    override fun volumes(): List<Volume> = unwrap(this).getVolumes()?.map(Volume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2TaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps):
        Ec2TaskDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskDefinitionProps):
        software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
  }
}
