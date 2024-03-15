@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  public fun cluster(): String? = unwrap(this).getCluster()

  public fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  public fun deploymentController(): Any? = unwrap(this).getDeploymentController()

  public fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

  public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

  public fun healthCheckGracePeriodSeconds(): Number? =
      unwrap(this).getHealthCheckGracePeriodSeconds()

  public fun launchType(): String? = unwrap(this).getLaunchType()

  public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  public fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

  public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  public fun propagateTags(): String? = unwrap(this).getPropagateTags()

  public fun role(): String? = unwrap(this).getRole()

  public fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  public fun serviceConnectConfiguration(): Any? = unwrap(this).getServiceConnectConfiguration()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

  public fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  @CdkDslMarker
  public interface Builder {
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

    public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

    public fun cluster(cluster: String)

    public fun deploymentConfiguration(deploymentConfiguration: IResolvable)

    public
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bfe5d1c1586c1905ebbbf506ca279d0a6c87ce9dacef580455c27215b81b48e")
    public
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit)

    public fun deploymentController(deploymentController: IResolvable)

    public fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf4ceefc364272b19ad3045427442333d4cfedfa588102902f59c07d2bde3ac")
    public
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty.Builder.() -> Unit)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

    public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number)

    public fun launchType(launchType: String)

    public fun loadBalancers(loadBalancers: IResolvable)

    public fun loadBalancers(loadBalancers: List<Any>)

    public fun loadBalancers(vararg loadBalancers: Any)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6dddf30ca601e6c80286a2d1987fbb8ca662769f862093c4d103c239abeb4bc")
    public
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit)

    public fun placementConstraints(placementConstraints: IResolvable)

    public fun placementConstraints(placementConstraints: List<Any>)

    public fun placementConstraints(vararg placementConstraints: Any)

    public fun placementStrategies(placementStrategies: IResolvable)

    public fun placementStrategies(placementStrategies: List<Any>)

    public fun placementStrategies(vararg placementStrategies: Any)

    public fun platformVersion(platformVersion: String)

    public fun propagateTags(propagateTags: String)

    public fun role(role: String)

    public fun schedulingStrategy(schedulingStrategy: String)

    public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable)

    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc95716bfa4b4518e5ee9a0d4288a7ae79193d679924f67d0ea61638cd58f0b1")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun serviceRegistries(serviceRegistries: IResolvable)

    public fun serviceRegistries(serviceRegistries: List<Any>)

    public fun serviceRegistries(vararg serviceRegistries: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskDefinition(taskDefinition: String)

    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnServiceProps.Builder =
        software.amazon.awscdk.services.ecs.CfnServiceProps.builder()

    override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
    }

    override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
        capacityProviderStrategy(capacityProviderStrategy.toList())

    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(CfnService.DeploymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bfe5d1c1586c1905ebbbf506ca279d0a6c87ce9dacef580455c27215b81b48e")
    override
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        deploymentConfiguration(CfnService.DeploymentConfigurationProperty(deploymentConfiguration))

    override fun deploymentController(deploymentController: IResolvable) {
      cdkBuilder.deploymentController(deploymentController.let(IResolvable::unwrap))
    }

    override
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty) {
      cdkBuilder.deploymentController(deploymentController.let(CfnService.DeploymentControllerProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf4ceefc364272b19ad3045427442333d4cfedfa588102902f59c07d2bde3ac")
    override
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty.Builder.() -> Unit):
        Unit = deploymentController(CfnService.DeploymentControllerProperty(deploymentController))

    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
    }

    override fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
      cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
    }

    override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
    }

    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers)
    }

    override fun loadBalancers(vararg loadBalancers: Any): Unit =
        loadBalancers(loadBalancers.toList())

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnService.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6dddf30ca601e6c80286a2d1987fbb8ca662769f862093c4d103c239abeb4bc")
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnService.NetworkConfigurationProperty(networkConfiguration))

    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    override fun placementConstraints(vararg placementConstraints: Any): Unit =
        placementConstraints(placementConstraints.toList())

    override fun placementStrategies(placementStrategies: IResolvable) {
      cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
    }

    override fun placementStrategies(placementStrategies: List<Any>) {
      cdkBuilder.placementStrategies(placementStrategies)
    }

    override fun placementStrategies(vararg placementStrategies: Any): Unit =
        placementStrategies(placementStrategies.toList())

    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    override fun propagateTags(propagateTags: String) {
      cdkBuilder.propagateTags(propagateTags)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    override fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(CfnService.ServiceConnectConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc95716bfa4b4518e5ee9a0d4288a7ae79193d679924f67d0ea61638cd58f0b1")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit):
        Unit =
        serviceConnectConfiguration(CfnService.ServiceConnectConfigurationProperty(serviceConnectConfiguration))

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable::unwrap))
    }

    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries)
    }

    override fun serviceRegistries(vararg serviceRegistries: Any): Unit =
        serviceRegistries(serviceRegistries.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnServiceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    override fun cluster(): String? = unwrap(this).getCluster()

    override fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

    override fun deploymentController(): Any? = unwrap(this).getDeploymentController()

    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    override fun healthCheckGracePeriodSeconds(): Number? =
        unwrap(this).getHealthCheckGracePeriodSeconds()

    override fun launchType(): String? = unwrap(this).getLaunchType()

    override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    override fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

    override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    override fun propagateTags(): String? = unwrap(this).getPropagateTags()

    override fun role(): String? = unwrap(this).getRole()

    override fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

    override fun serviceConnectConfiguration(): Any? = unwrap(this).getServiceConnectConfiguration()

    override fun serviceName(): String? = unwrap(this).getServiceName()

    override fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

    override fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.ecs.CfnServiceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnServiceProps
  }
}
