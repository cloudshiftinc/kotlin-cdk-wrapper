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

public interface ApplicationLoadBalancedTaskImageOptions {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun containerName(): String? = unwrap(this).getContainerName()

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun family(): String? = unwrap(this).getFamily()

  public fun image(): ContainerImage

  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  public fun secrets(): Map<String, Secret> = unwrap(this).getSecrets()?.mapValues {
      Secret.wrap(it.value)} ?: emptyMap()

  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  public interface Builder {
    public fun command(command: List<String>) {
    }

    public fun containerName(containerName: String) {
    }

    public fun containerPort(containerPort: Number) {
    }

    public fun dockerLabels(dockerLabels: Map<String, String>) {
    }

    public fun enableLogging(enableLogging: Boolean) {
    }

    public fun entryPoint(entryPoint: List<String>) {
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
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions.builder()

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    public override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    public override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    public override fun entryPoint(entryPoint: List<String>) {
      cdkBuilder.entryPoint(entryPoint)
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
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions,
  ) : ApplicationLoadBalancedTaskImageOptions {
    public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public override fun containerName(): String? = unwrap(this).getContainerName()

    public override fun containerPort(): Number? = unwrap(this).getContainerPort()

    public override fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?:
        emptyMap()

    public override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    public override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

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

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancedTaskImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions):
        ApplicationLoadBalancedTaskImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedTaskImageOptions):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions =
        (wrapped as Wrapper).cdkObject
  }
}
