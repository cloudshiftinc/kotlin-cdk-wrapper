@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.HealthCheck
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface QueueProcessingFargateServiceProps : QueueProcessingServiceBaseProps,
    FargateServiceBaseProps {
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  public fun containerName(): String? = unwrap(this).getContainerName()

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun taskSubnets(): SubnetSelection? =
      unwrap(this).getTaskSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("026e1d286a75fc3cd5f3e13c334b905f966c1b17a5a97874bc60832c0d2dd9ef")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun containerName(containerName: String)

    public fun cooldown(cooldown: Duration)

    public fun cpu(cpu: Number)

    public fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number)

    public fun deploymentController(deploymentController: DeploymentController)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ca2735818fe47633949e5c150c313d33cf516a5202ff7108f7cf55494a0ae6f")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    public fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun enableLogging(enableLogging: Boolean)

    public fun environment(environment: Map<String, String>)

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    public fun family(family: String)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3326961939a08233e2db2fab56e0e5f2776b0e6fd211f4a125c8c2ba0be26d04")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public fun image(image: ContainerImage)

    public fun logDriver(logDriver: LogDriver)

    public fun maxHealthyPercent(maxHealthyPercent: Number)

    public fun maxReceiveCount(maxReceiveCount: Number)

    public fun maxScalingCapacity(maxScalingCapacity: Number)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun minHealthyPercent(minHealthyPercent: Number)

    public fun minScalingCapacity(minScalingCapacity: Number)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun queue(queue: IQueue)

    public fun retentionPeriod(retentionPeriod: Duration)

    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12566fa7c838361ef93b2388413de9be0cbbb1220dee78e455732120a03b4505")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun scalingSteps(scalingSteps: List<ScalingInterval>)

    public fun scalingSteps(vararg scalingSteps: ScalingInterval)

    public fun secrets(secrets: Map<String, Secret>)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serviceName(serviceName: String)

    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    public fun taskSubnets(taskSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a605acacf298c097f82f0e235834d0a6942a8e3e654cc1bbe481a5837ec36bf2")
    public fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit)

    public fun visibilityTimeout(visibilityTimeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps.builder()

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("026e1d286a75fc3cd5f3e13c334b905f966c1b17a5a97874bc60832c0d2dd9ef")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
      cdkBuilder.cpuTargetUtilizationPercent(cpuTargetUtilizationPercent)
    }

    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ca2735818fe47633949e5c150c313d33cf516a5202ff7108f7cf55494a0ae6f")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    override fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
      cdkBuilder.disableCpuBasedScaling(disableCpuBasedScaling)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3326961939a08233e2db2fab56e0e5f2776b0e6fd211f4a125c8c2ba0be26d04")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    override fun maxScalingCapacity(maxScalingCapacity: Number) {
      cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    override fun minScalingCapacity(minScalingCapacity: Number) {
      cdkBuilder.minScalingCapacity(minScalingCapacity)
    }

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12566fa7c838361ef93b2388413de9be0cbbb1220dee78e455732120a03b4505")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    override fun scalingSteps(vararg scalingSteps: ScalingInterval): Unit =
        scalingSteps(scalingSteps.toList())

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    override fun taskSubnets(taskSubnets: SubnetSelection) {
      cdkBuilder.taskSubnets(taskSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a605acacf298c097f82f0e235834d0a6942a8e3e654cc1bbe481a5837ec36bf2")
    override fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        taskSubnets(SubnetSelection(taskSubnets))

    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps,
  ) : CdkObject(cdkObject), QueueProcessingFargateServiceProps {
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

    override fun circuitBreaker(): DeploymentCircuitBreaker? =
        unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun containerName(): String? = unwrap(this).getContainerName()

    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun cpuTargetUtilizationPercent(): Number? =
        unwrap(this).getCpuTargetUtilizationPercent()

    override fun deploymentController(): DeploymentController? =
        unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

    override fun disableCpuBasedScaling(): Boolean? = unwrap(this).getDisableCpuBasedScaling()

    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    override fun family(): String? = unwrap(this).getFamily()

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun image(): ContainerImage? = unwrap(this).getImage()?.let(ContainerImage::wrap)

    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    override fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

    override fun maxReceiveCount(): Number? = unwrap(this).getMaxReceiveCount()

    override fun maxScalingCapacity(): Number? = unwrap(this).getMaxScalingCapacity()

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

    override fun minScalingCapacity(): Number? = unwrap(this).getMinScalingCapacity()

    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun queue(): IQueue? = unwrap(this).getQueue()?.let(IQueue::wrap)

    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    override fun scalingSteps(): List<ScalingInterval> =
        unwrap(this).getScalingSteps()?.map(ScalingInterval::wrap) ?: emptyList()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun serviceName(): String? = unwrap(this).getServiceName()

    override fun taskDefinition(): FargateTaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)

    override fun taskSubnets(): SubnetSelection? =
        unwrap(this).getTaskSubnets()?.let(SubnetSelection::wrap)

    override fun visibilityTimeout(): Duration? =
        unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueueProcessingFargateServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps):
        QueueProcessingFargateServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingFargateServiceProps):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
  }
}
