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

public open class FargateService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.FargateService,
) : BaseService(cdkObject), IFargateService {
  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4133a5d5444a3ad32024ac1bdb3aad4ca6d2044f408b729296940b41ba29997")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d2703f8bbc1f869e307080200a2798a7db4ac891d546f15bc6804480b796296")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba7bfc6bbaec8f7ce17a64df0b3e3f774311f4bb6b68689cbc622a5cb8dbe7f")
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit)

    public fun deploymentController(deploymentController: DeploymentController)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4191ad45937172fc43b2c8cb1cd42ab6fb9217c27289514c478654666afbc6e0")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun maxHealthyPercent(maxHealthyPercent: Number)

    public fun minHealthyPercent(minHealthyPercent: Number)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00341cc9ac612e3652f4a111b430e8c917ac8622d39cc00d0f091ebbb440488")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun taskDefinition(taskDefinition: TaskDefinition)

    public fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision)

    public fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>)

    public fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("424a118b89462e45ea412cf00a89eaddf35e0cb909046a921e7a57e64bc4420a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateService.Builder =
        software.amazon.awscdk.services.ecs.FargateService.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4133a5d5444a3ad32024ac1bdb3aad4ca6d2044f408b729296940b41ba29997")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d2703f8bbc1f869e307080200a2798a7db4ac891d546f15bc6804480b796296")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba7bfc6bbaec8f7ce17a64df0b3e3f774311f4bb6b68689cbc622a5cb8dbe7f")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4191ad45937172fc43b2c8cb1cd42ab6fb9217c27289514c478654666afbc6e0")
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

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00341cc9ac612e3652f4a111b430e8c917ac8622d39cc00d0f091ebbb440488")
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

    override fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("424a118b89462e45ea412cf00a89eaddf35e0cb909046a921e7a57e64bc4420a")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ecs.FargateService = cdkBuilder.build()
  }

  public companion object {
    public open fun fromFargateServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateServiceArn: String,
    ): IFargateService =
        software.amazon.awscdk.services.ecs.FargateService.fromFargateServiceArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fargateServiceArn).let(IFargateService::wrap)

    public open fun fromFargateServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateServiceAttributes,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.FargateService.fromFargateServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FargateServiceAttributes::unwrap)).let(IBaseService::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c5efe0a0970d19a1c51a45728e582eb1f09f35537ee09070a9268210df4858a")
    public open fun fromFargateServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateServiceAttributes.Builder.() -> Unit,
    ): IBaseService = fromFargateServiceAttributes(scope, id, FargateServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateService): FargateService
        = FargateService(cdkObject)

    internal fun unwrap(wrapped: FargateService): software.amazon.awscdk.services.ecs.FargateService
        = wrapped.cdkObject
  }
}
