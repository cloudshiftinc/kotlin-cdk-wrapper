package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueueProcessingEc2Service internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service,
) : QueueProcessingServiceBase(cdkObject) {
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  public interface Builder {
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eb7aa4699ab36b0fdc52879df2df932e1f23f9c71c88f49b89662c44eb855a1")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun command(command: List<String>) {
    }

    public fun containerName(containerName: String) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
    }

    public fun deploymentController(deploymentController: DeploymentController) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ede7043074bb86a7a8192d6554577c5337ac2bf1a8e8a68f62deef21fc822e99")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit) {
    }

    public fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun enableLogging(enableLogging: Boolean) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun family(family: String) {
    }

    public fun gpuCount(gpuCount: Number) {
    }

    public fun image(image: ContainerImage) {
    }

    public fun logDriver(logDriver: LogDriver) {
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
    }

    public fun maxReceiveCount(maxReceiveCount: Number) {
    }

    public fun maxScalingCapacity(maxScalingCapacity: Number) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
    }

    public fun minScalingCapacity(minScalingCapacity: Number) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun queue(queue: IQueue) {
    }

    public fun retentionPeriod(retentionPeriod: Duration) {
    }

    public fun scalingSteps(scalingSteps: List<ScalingInterval>) {
    }

    public fun secrets(secrets: Map<String, Secret>) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun visibilityTimeout(visibilityTimeout: Duration) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service.Builder.create(scope,
        id)

    public override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eb7aa4699ab36b0fdc52879df2df932e1f23f9c71c88f49b89662c44eb855a1")
    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit):
        Unit = circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
      cdkBuilder.cpuTargetUtilizationPercent(cpuTargetUtilizationPercent)
    }

    public override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ede7043074bb86a7a8192d6554577c5337ac2bf1a8e8a68f62deef21fc822e99")
    public override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    public override fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
      cdkBuilder.disableCpuBasedScaling(disableCpuBasedScaling)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    public override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    public override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    public override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    public override fun maxScalingCapacity(maxScalingCapacity: Number) {
      cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public override fun minScalingCapacity(minScalingCapacity: Number) {
      cdkBuilder.minScalingCapacity(minScalingCapacity)
    }

    public override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    public override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    public override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    public override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    public override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues { Secret.unwrap(it.value)})
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): QueueProcessingEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return QueueProcessingEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service):
        QueueProcessingEc2Service = QueueProcessingEc2Service(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingEc2Service):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service = wrapped.cdkObject
  }
}
