package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Ec2Service internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.Ec2Service,
) : BaseService(cdkObject), IEc2Service {
  public open fun addPlacementConstraints(constraints: PlacementConstraint) {
    unwrap(this).addPlacementConstraints(constraints.let(PlacementConstraint::unwrap))
  }

  public open fun addPlacementStrategies(strategies: PlacementStrategy) {
    unwrap(this).addPlacementStrategies(strategies.let(PlacementStrategy::unwrap))
  }

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23455443786fb538a40c3eacae9199768b8e001bfa3f8111099e51dfb8c065b")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d85c7b6fdb0b9506661e7c01d11a52287ddcebb9de80c634087817e94bbe6945")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun daemon(daemon: Boolean)

    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4599c276ed248f7392a98339be67e1822146aa73502a5a9910f25e72a4416e7b")
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit)

    public fun deploymentController(deploymentController: DeploymentController)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca426c70ee8c6ec0eb942e70302b1b7b1ef4aefc663c1e01754d53ef620566f7")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun maxHealthyPercent(maxHealthyPercent: Number)

    public fun minHealthyPercent(minHealthyPercent: Number)

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("948729db429d07550a9a63b5340afcd2c7dbf969a2856730b348a0aef129dd7e")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun taskDefinition(taskDefinition: TaskDefinition)

    public fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision)

    public fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bffb9afdd7f6f4d65bdaba1c8e021e51638743b2706bee102d058f0b24dfefe")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2Service.Builder =
        software.amazon.awscdk.services.ecs.Ec2Service.Builder.create(scope, id)

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23455443786fb538a40c3eacae9199768b8e001bfa3f8111099e51dfb8c065b")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d85c7b6fdb0b9506661e7c01d11a52287ddcebb9de80c634087817e94bbe6945")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun daemon(daemon: Boolean) {
      cdkBuilder.daemon(daemon)
    }

    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4599c276ed248f7392a98339be67e1822146aa73502a5a9910f25e72a4416e7b")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca426c70ee8c6ec0eb942e70302b1b7b1ef4aefc663c1e01754d53ef620566f7")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("948729db429d07550a9a63b5340afcd2c7dbf969a2856730b348a0aef129dd7e")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit):
        Unit = serviceConnectConfiguration(ServiceConnectProps(serviceConnectConfiguration))

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    override fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision) {
      cdkBuilder.taskDefinitionRevision(taskDefinitionRevision.let(TaskDefinitionRevision::unwrap))
    }

    override fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map(ServiceManagedVolume::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bffb9afdd7f6f4d65bdaba1c8e021e51638743b2706bee102d058f0b24dfefe")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ecs.Ec2Service = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEc2ServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ec2ServiceArn: String,
    ): IEc2Service =
        software.amazon.awscdk.services.ecs.Ec2Service.fromEc2ServiceArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ec2ServiceArn).let(IEc2Service::wrap)

    public open fun fromEc2ServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2ServiceAttributes,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.Ec2Service.fromEc2ServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(Ec2ServiceAttributes::unwrap)).let(IBaseService::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deda49ac6a4ffe06a7cd5863c7416e87d620457ecd6508bced33ce9c2f31b151")
    public open fun fromEc2ServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2ServiceAttributes.Builder.() -> Unit,
    ): IBaseService = fromEc2ServiceAttributes(scope, id, Ec2ServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Ec2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Ec2Service(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2Service): Ec2Service =
        Ec2Service(cdkObject)

    internal fun unwrap(wrapped: Ec2Service): software.amazon.awscdk.services.ecs.Ec2Service =
        wrapped.cdkObject
  }
}
