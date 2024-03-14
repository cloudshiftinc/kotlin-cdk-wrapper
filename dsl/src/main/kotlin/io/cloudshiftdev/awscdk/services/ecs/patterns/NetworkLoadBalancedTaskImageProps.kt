package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface NetworkLoadBalancedTaskImageProps {
  public fun containerName(): String? = unwrap(this).getContainerName()

  public fun containerPorts(): List<Number> = unwrap(this).getContainerPorts() ?: emptyList()

  public fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun family(): String? = unwrap(this).getFamily()

  public fun image(): ContainerImage

  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  public fun secrets(): Map<String, Secret> = unwrap(this).getSecrets()?.mapValues {
      Secret.wrap(it.value)} ?: emptyMap()

  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  public interface Builder {
    public fun containerName(containerName: String) {
    }

    public fun containerPorts(containerPorts: List<Number>) {
    }

    public fun dockerLabels(dockerLabels: Map<String, String>) {
    }

    public fun enableLogging(enableLogging: Boolean) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun executionRole(executionRole: IRole) {
    }

    public fun family(family: String) {
    }

    public fun image(image: ContainerImage) {
    }

    public fun logDriver(logDriver: LogDriver) {
    }

    public fun secrets(secrets: Map<String, Secret>) {
    }

    public fun taskRole(taskRole: IRole) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps.builder()

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun containerPorts(containerPorts: List<Number>) {
      cdkBuilder.containerPorts(containerPorts)
    }

    public override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    public override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    public override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    public override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues { Secret.unwrap(it.value)})
    }

    public override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps,
  ) : NetworkLoadBalancedTaskImageProps {
    public override fun containerName(): String? = unwrap(this).getContainerName()

    public override fun containerPorts(): List<Number> = unwrap(this).getContainerPorts() ?:
        emptyList()

    public override fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?:
        emptyMap()

    public override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
        emptyMap()

    public override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    public override fun family(): String? = unwrap(this).getFamily()

    public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    public override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    public override fun secrets(): Map<String, Secret> = unwrap(this).getSecrets()?.mapValues {
        Secret.wrap(it.value)} ?: emptyMap()

    public override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancedTaskImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps):
        NetworkLoadBalancedTaskImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedTaskImageProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps = (wrapped as
        Wrapper).cdkObject
  }
}
