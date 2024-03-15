@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.EnableScalingProps
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import io.cloudshiftdev.awscdk.services.servicediscovery.Service
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ExternalService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ExternalService,
) : BaseService(cdkObject), IExternalService {
  public override fun associateCloudMapService(_options: AssociateCloudMapServiceOptions) {
    unwrap(this).associateCloudMapService(_options.let(AssociateCloudMapServiceOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9efdde89b809884516ab0c4bd40829d6167d5f1d27bdea442fed263281456fdd")
  public override
      fun associateCloudMapService(_options: AssociateCloudMapServiceOptions.Builder.() -> Unit):
      Unit = associateCloudMapService(AssociateCloudMapServiceOptions(_options))

  public override fun attachToApplicationTargetGroup(_targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(_targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public override fun autoScaleTaskCount(_props: EnableScalingProps): ScalableTaskCount =
      unwrap(this).autoScaleTaskCount(_props.let(EnableScalingProps::unwrap)).let(ScalableTaskCount::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0163fbd7c68d4e9af9f18b4ef7de232b93ee41c4e9599b548a4b01bab6ca323c")
  public override fun autoScaleTaskCount(_props: EnableScalingProps.Builder.() -> Unit):
      ScalableTaskCount = autoScaleTaskCount(EnableScalingProps(_props))

  public override fun enableCloudMap(_options: CloudMapOptions): Service =
      unwrap(this).enableCloudMap(_options.let(CloudMapOptions::unwrap)).let(Service::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb98c16499f233304e458ef17b6e5c9df09e38dbe3c56301d0f41038fbab0cc")
  public override fun enableCloudMap(_options: CloudMapOptions.Builder.() -> Unit): Service =
      enableCloudMap(CloudMapOptions(_options))

  public override fun loadBalancerTarget(_options: LoadBalancerTargetOptions):
      IEcsLoadBalancerTarget =
      unwrap(this).loadBalancerTarget(_options.let(LoadBalancerTargetOptions::unwrap)).let(IEcsLoadBalancerTarget::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c1f6de1e98dab0564840813319e438b96687e7140defdd69ba7bee4103a780f")
  public override fun loadBalancerTarget(_options: LoadBalancerTargetOptions.Builder.() -> Unit):
      IEcsLoadBalancerTarget = loadBalancerTarget(LoadBalancerTargetOptions(_options))

  public override fun registerLoadBalancerTargets(_targets: EcsTarget) {
    unwrap(this).registerLoadBalancerTargets(_targets.let(EcsTarget::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3682e9eed91689cc4ed6f8310140605bef4e35e0fda59587fde4c2fc019cfaa6")
  public override fun registerLoadBalancerTargets(_targets: EcsTarget.Builder.() -> Unit): Unit =
      registerLoadBalancerTargets(EcsTarget(_targets))

  @CdkDslMarker
  public interface Builder {
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e00f0c2be59f79f24a63fa2cecbd3f84adbf5a8773e5e1ef11183e2ef35802c")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1bc3f4abf94a6c9ea5baf49213d4948feac1118cae7022f621965a879e7d36a")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9e7cbde8b2f51bf4837bd89ab7ce60476410d7c5b1f596ed1553c33bd546156")
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit)

    public fun deploymentController(deploymentController: DeploymentController)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("132283714c7dbffdd9b210c5eaa509f1a7e5dbce833291b4af8ace91975b6ecb")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun maxHealthyPercent(maxHealthyPercent: Number)

    public fun minHealthyPercent(minHealthyPercent: Number)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a34fbb39ed4eb18a677fea97b1604d0dd5c8962f8ce8117ae1165531a572f345")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun taskDefinition(taskDefinition: TaskDefinition)

    public fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision)

    public fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>)

    public fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalService.Builder =
        software.amazon.awscdk.services.ecs.ExternalService.Builder.create(scope, id)

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
    @JvmName("0e00f0c2be59f79f24a63fa2cecbd3f84adbf5a8773e5e1ef11183e2ef35802c")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1bc3f4abf94a6c9ea5baf49213d4948feac1118cae7022f621965a879e7d36a")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9e7cbde8b2f51bf4837bd89ab7ce60476410d7c5b1f596ed1553c33bd546156")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("132283714c7dbffdd9b210c5eaa509f1a7e5dbce833291b4af8ace91975b6ecb")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a34fbb39ed4eb18a677fea97b1604d0dd5c8962f8ce8117ae1165531a572f345")
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

    public fun build(): software.amazon.awscdk.services.ecs.ExternalService = cdkBuilder.build()
  }

  public companion object {
    public fun fromExternalServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      externalServiceArn: String,
    ): IExternalService =
        software.amazon.awscdk.services.ecs.ExternalService.fromExternalServiceArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, externalServiceArn).let(IExternalService::wrap)

    public fun fromExternalServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalServiceAttributes,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.ExternalService.fromExternalServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ExternalServiceAttributes::unwrap)).let(IBaseService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c821c053693b374d19971efb06539e7456849cba31705ede4c6c0f7fb4674de")
    public fun fromExternalServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalServiceAttributes.Builder.() -> Unit,
    ): IBaseService = fromExternalServiceAttributes(scope, id, ExternalServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ExternalService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ExternalService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalService):
        ExternalService = ExternalService(cdkObject)

    internal fun unwrap(wrapped: ExternalService):
        software.amazon.awscdk.services.ecs.ExternalService = wrapped.cdkObject
  }
}
