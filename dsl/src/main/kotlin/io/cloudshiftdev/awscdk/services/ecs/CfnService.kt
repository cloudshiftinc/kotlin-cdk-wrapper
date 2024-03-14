package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
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

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  public open fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  public open fun capacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun capacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setCapacityProviderStrategy(__idx_ac66f0)
  }

  public open fun cluster(): String? = unwrap(this).getCluster()

  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  public open fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  public open fun deploymentConfiguration(`value`: IResolvable) {
    unwrap(this).setDeploymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentConfiguration(`value`: DeploymentConfigurationProperty) {
    unwrap(this).setDeploymentConfiguration(`value`.let(DeploymentConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b237ed05545d34c4cf98ae8855935be09660dba08dc5338b6296b20040f07f17")
  public open
      fun deploymentConfiguration(`value`: DeploymentConfigurationProperty.Builder.() -> Unit): Unit
      = deploymentConfiguration(DeploymentConfigurationProperty(`value`))

  public open fun deploymentController(): Any? = unwrap(this).getDeploymentController()

  public open fun deploymentController(`value`: IResolvable) {
    unwrap(this).setDeploymentController(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentController(`value`: DeploymentControllerProperty) {
    unwrap(this).setDeploymentController(`value`.let(DeploymentControllerProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b6db0216ad80eab0d29faf00fdc099392e7b67702d42db126b15018f7c12173")
  public open fun deploymentController(`value`: DeploymentControllerProperty.Builder.() -> Unit):
      Unit = deploymentController(DeploymentControllerProperty(`value`))

  public open fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  public open fun desiredCount(`value`: Number) {
    unwrap(this).setDesiredCount(`value`)
  }

  public open fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

  public open fun enableEcsManagedTags(`value`: Boolean) {
    unwrap(this).setEnableEcsManagedTags(`value`)
  }

  public open fun enableEcsManagedTags(`value`: IResolvable) {
    unwrap(this).setEnableEcsManagedTags(`value`.let(IResolvable::unwrap))
  }

  public open fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

  public open fun enableExecuteCommand(`value`: Boolean) {
    unwrap(this).setEnableExecuteCommand(`value`)
  }

  public open fun enableExecuteCommand(`value`: IResolvable) {
    unwrap(this).setEnableExecuteCommand(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckGracePeriodSeconds(): Number? =
      unwrap(this).getHealthCheckGracePeriodSeconds()

  public open fun healthCheckGracePeriodSeconds(`value`: Number) {
    unwrap(this).setHealthCheckGracePeriodSeconds(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun launchType(): String? = unwrap(this).getLaunchType()

  public open fun launchType(`value`: String) {
    unwrap(this).setLaunchType(`value`)
  }

  public open fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  public open fun loadBalancers(`value`: IResolvable) {
    unwrap(this).setLoadBalancers(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBalancers(__idx_ac66f0: List<Any>) {
    unwrap(this).setLoadBalancers(__idx_ac66f0)
  }

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b602c8d77fd908cdbc82f46996119da42cf6abc5be2f4d439f6ab4675e3b6959")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  public open fun placementConstraints(`value`: IResolvable) {
    unwrap(this).setPlacementConstraints(`value`.let(IResolvable::unwrap))
  }

  public open fun placementConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementConstraints(__idx_ac66f0)
  }

  public open fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

  public open fun placementStrategies(`value`: IResolvable) {
    unwrap(this).setPlacementStrategies(`value`.let(IResolvable::unwrap))
  }

  public open fun placementStrategies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementStrategies(__idx_ac66f0)
  }

  public open fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  public open fun platformVersion(`value`: String) {
    unwrap(this).setPlatformVersion(`value`)
  }

  public open fun propagateTags(): String? = unwrap(this).getPropagateTags()

  public open fun propagateTags(`value`: String) {
    unwrap(this).setPropagateTags(`value`)
  }

  public open fun role(): String? = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  public open fun schedulingStrategy(`value`: String) {
    unwrap(this).setSchedulingStrategy(`value`)
  }

  public open fun serviceConnectConfiguration(): Any? =
      unwrap(this).getServiceConnectConfiguration()

  public open fun serviceConnectConfiguration(`value`: IResolvable) {
    unwrap(this).setServiceConnectConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceConnectConfiguration(`value`: ServiceConnectConfigurationProperty) {
    unwrap(this).setServiceConnectConfiguration(`value`.let(ServiceConnectConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ea77deb70521835f0b6bef4d61c62e0fa8cb1dc3bff018b7e7062faf4d80c18")
  public open
      fun serviceConnectConfiguration(`value`: ServiceConnectConfigurationProperty.Builder.() -> Unit):
      Unit = serviceConnectConfiguration(ServiceConnectConfigurationProperty(`value`))

  public open fun serviceName(): String? = unwrap(this).getServiceName()

  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  public open fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  public open fun serviceRegistries(`value`: IResolvable) {
    unwrap(this).setServiceRegistries(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceRegistries(__idx_ac66f0: List<Any>) {
    unwrap(this).setServiceRegistries(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

  public open fun taskDefinition(`value`: String) {
    unwrap(this).setTaskDefinition(`value`)
  }

  public open fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  public open fun volumeConfigurations(`value`: IResolvable) {
    unwrap(this).setVolumeConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun volumeConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumeConfigurations(__idx_ac66f0)
  }

  public interface Builder {
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
    }

    public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
    }

    public fun cluster(cluster: String) {
    }

    public fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
    }

    public fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    public
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit) {
    }

    public fun deploymentController(deploymentController: IResolvable) {
    }

    public fun deploymentController(deploymentController: DeploymentControllerProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d9892e0de74cfc9b3d2fc8dd7448baf5c7ea7cfd7bd4fb8a2bac7f3f1c29b6b")
    public
        fun deploymentController(deploymentController: DeploymentControllerProperty.Builder.() -> Unit) {
    }

    public fun desiredCount(desiredCount: Number) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
    }

    public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
    }

    public fun launchType(launchType: String) {
    }

    public fun loadBalancers(loadBalancers: IResolvable) {
    }

    public fun loadBalancers(loadBalancers: List<Any>) {
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
    }

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3e8f28a5d18a781ff0151bbb8080c6fd56de0bfe6fcbb47c9c3ef7a8e9fa896")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
    }

    public fun placementConstraints(placementConstraints: IResolvable) {
    }

    public fun placementConstraints(placementConstraints: List<Any>) {
    }

    public fun placementStrategies(placementStrategies: IResolvable) {
    }

    public fun placementStrategies(placementStrategies: List<Any>) {
    }

    public fun platformVersion(platformVersion: String) {
    }

    public fun propagateTags(propagateTags: String) {
    }

    public fun role(role: String) {
    }

    public fun schedulingStrategy(schedulingStrategy: String) {
    }

    public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
    }

    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdfd973eb30ca9d27f340a41b919c48338de7a7528cac48ac3dd7a67c6843295")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun serviceRegistries(serviceRegistries: IResolvable) {
    }

    public fun serviceRegistries(serviceRegistries: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun taskDefinition(taskDefinition: String) {
    }

    public fun volumeConfigurations(volumeConfigurations: IResolvable) {
    }

    public fun volumeConfigurations(volumeConfigurations: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnService.Builder =
        software.amazon.awscdk.services.ecs.CfnService.Builder.create(scope, id)

    public override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
    }

    public override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    public override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    public override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(DeploymentConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    public override
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit = deploymentConfiguration(DeploymentConfigurationProperty(deploymentConfiguration))

    public override fun deploymentController(deploymentController: IResolvable) {
      cdkBuilder.deploymentController(deploymentController.let(IResolvable::unwrap))
    }

    public override fun deploymentController(deploymentController: DeploymentControllerProperty) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentControllerProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d9892e0de74cfc9b3d2fc8dd7448baf5c7ea7cfd7bd4fb8a2bac7f3f1c29b6b")
    public override
        fun deploymentController(deploymentController: DeploymentControllerProperty.Builder.() -> Unit):
        Unit = deploymentController(DeploymentControllerProperty(deploymentController))

    public override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
    }

    public override fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
      cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
    }

    public override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    public override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
    }

    public override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers)
    }

    public override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    public override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3e8f28a5d18a781ff0151bbb8080c6fd56de0bfe6fcbb47c9c3ef7a8e9fa896")
    public override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    public override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    public override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    public override fun placementStrategies(placementStrategies: IResolvable) {
      cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
    }

    public override fun placementStrategies(placementStrategies: List<Any>) {
      cdkBuilder.placementStrategies(placementStrategies)
    }

    public override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    public override fun propagateTags(propagateTags: String) {
      cdkBuilder.propagateTags(propagateTags)
    }

    public override fun role(role: String) {
      cdkBuilder.role(role)
    }

    public override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    public override fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdfd973eb30ca9d27f340a41b919c48338de7a7528cac48ac3dd7a67c6843295")
    public override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty.Builder.() -> Unit):
        Unit =
        serviceConnectConfiguration(ServiceConnectConfigurationProperty(serviceConnectConfiguration))

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable::unwrap))
    }

    public override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    public override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    public override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnService = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService): CfnService =
        CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService): software.amazon.awscdk.services.ecs.CfnService =
        wrapped.cdkObject
  }

  public interface TimeoutConfigurationProperty {
    public fun idleTimeoutSeconds(): Number? = unwrap(this).getIdleTimeoutSeconds()

    public fun perRequestTimeoutSeconds(): Number? = unwrap(this).getPerRequestTimeoutSeconds()

    public interface Builder {
      public fun idleTimeoutSeconds(idleTimeoutSeconds: Number) {
      }

      public fun perRequestTimeoutSeconds(perRequestTimeoutSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty.builder()

      public override fun idleTimeoutSeconds(idleTimeoutSeconds: Number) {
        cdkBuilder.idleTimeoutSeconds(idleTimeoutSeconds)
      }

      public override fun perRequestTimeoutSeconds(perRequestTimeoutSeconds: Number) {
        cdkBuilder.perRequestTimeoutSeconds(perRequestTimeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty,
    ) : TimeoutConfigurationProperty {
      public override fun idleTimeoutSeconds(): Number? = unwrap(this).getIdleTimeoutSeconds()

      public override fun perRequestTimeoutSeconds(): Number? =
          unwrap(this).getPerRequestTimeoutSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty):
          TimeoutConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoadBalancerProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    public interface Builder {
      public fun containerName(containerName: String) {
      }

      public fun containerPort(containerPort: Number) {
      }

      public fun loadBalancerName(loadBalancerName: String) {
      }

      public fun targetGroupArn(targetGroupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.builder()

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      public override fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
      }

      public override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty,
    ) : LoadBalancerProperty {
      public override fun containerName(): String? = unwrap(this).getContainerName()

      public override fun containerPort(): Number? = unwrap(this).getContainerPort()

      public override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

      public override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty):
          LoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceConnectClientAliasProperty {
    public fun dnsName(): String? = unwrap(this).getDnsName()

    public fun port(): Number

    public interface Builder {
      public fun dnsName(dnsName: String) {
      }

      public fun port(port: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty.builder()

      public override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty,
    ) : ServiceConnectClientAliasProperty {
      public override fun dnsName(): String? = unwrap(this).getDnsName()

      public override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectClientAliasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty):
          ServiceConnectClientAliasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectClientAliasProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceConnectTlsCertificateAuthorityProperty {
    public fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()

    public interface Builder {
      public fun awsPcaAuthorityArn(awsPcaAuthorityArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty.builder()

      public override fun awsPcaAuthorityArn(awsPcaAuthorityArn: String) {
        cdkBuilder.awsPcaAuthorityArn(awsPcaAuthorityArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty,
    ) : ServiceConnectTlsCertificateAuthorityProperty {
      public override fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTlsCertificateAuthorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty):
          ServiceConnectTlsCertificateAuthorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsCertificateAuthorityProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceConnectServiceProperty {
    public fun clientAliases(): Any? = unwrap(this).getClientAliases()

    public fun discoveryName(): String? = unwrap(this).getDiscoveryName()

    public fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

    public fun portName(): String

    public fun timeout(): Any? = unwrap(this).getTimeout()

    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun clientAliases(clientAliases: IResolvable) {
      }

      public fun clientAliases(clientAliases: List<Any>) {
      }

      public fun discoveryName(discoveryName: String) {
      }

      public fun ingressPortOverride(ingressPortOverride: Number) {
      }

      public fun portName(portName: String) {
      }

      public fun timeout(timeout: IResolvable) {
      }

      public fun timeout(timeout: TimeoutConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd6672f6cd887caf6beb473987f937d129d83a90c850ac6733330cfdcf360bb9")
      public fun timeout(timeout: TimeoutConfigurationProperty.Builder.() -> Unit) {
      }

      public fun tls(tls: IResolvable) {
      }

      public fun tls(tls: ServiceConnectTlsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed7373f407a897111bc9fc5ea3233167ec60d015f62c89c685d42e1a04adc986")
      public fun tls(tls: ServiceConnectTlsConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty.builder()

      public override fun clientAliases(clientAliases: IResolvable) {
        cdkBuilder.clientAliases(clientAliases.let(IResolvable::unwrap))
      }

      public override fun clientAliases(clientAliases: List<Any>) {
        cdkBuilder.clientAliases(clientAliases)
      }

      public override fun discoveryName(discoveryName: String) {
        cdkBuilder.discoveryName(discoveryName)
      }

      public override fun ingressPortOverride(ingressPortOverride: Number) {
        cdkBuilder.ingressPortOverride(ingressPortOverride)
      }

      public override fun portName(portName: String) {
        cdkBuilder.portName(portName)
      }

      public override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      public override fun timeout(timeout: TimeoutConfigurationProperty) {
        cdkBuilder.timeout(timeout.let(TimeoutConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd6672f6cd887caf6beb473987f937d129d83a90c850ac6733330cfdcf360bb9")
      public override fun timeout(timeout: TimeoutConfigurationProperty.Builder.() -> Unit): Unit =
          timeout(TimeoutConfigurationProperty(timeout))

      public override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      public override fun tls(tls: ServiceConnectTlsConfigurationProperty) {
        cdkBuilder.tls(tls.let(ServiceConnectTlsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed7373f407a897111bc9fc5ea3233167ec60d015f62c89c685d42e1a04adc986")
      public override fun tls(tls: ServiceConnectTlsConfigurationProperty.Builder.() -> Unit): Unit
          = tls(ServiceConnectTlsConfigurationProperty(tls))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty,
    ) : ServiceConnectServiceProperty {
      public override fun clientAliases(): Any? = unwrap(this).getClientAliases()

      public override fun discoveryName(): String? = unwrap(this).getDiscoveryName()

      public override fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

      public override fun portName(): String = unwrap(this).getPortName()

      public override fun timeout(): Any? = unwrap(this).getTimeout()

      public override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty):
          ServiceConnectServiceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectServiceProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    public interface Builder {
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
      }

      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79684c36acab0cdfbf04ed7dac66c18ab2c1361696165365afa87bebd36dc8cf")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.builder()

      public override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      public override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79684c36acab0cdfbf04ed7dac66c18ab2c1361696165365afa87bebd36dc8cf")
      public override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    public fun logDriver(): String? = unwrap(this).getLogDriver()

    public fun options(): Any? = unwrap(this).getOptions()

    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    public interface Builder {
      public fun logDriver(logDriver: String) {
      }

      public fun options(options: IResolvable) {
      }

      public fun options(options: Map<String, String>) {
      }

      public fun secretOptions(secretOptions: IResolvable) {
      }

      public fun secretOptions(secretOptions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty.builder()

      public override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      public override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      public override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      public override fun logDriver(): String? = unwrap(this).getLogDriver()

      public override fun options(): Any? = unwrap(this).getOptions()

      public override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceManagedEBSVolumeConfigurationProperty {
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun filesystemType(): String? = unwrap(this).getFilesystemType()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun roleArn(): String

    public fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
      }

      public fun filesystemType(filesystemType: String) {
      }

      public fun iops(iops: Number) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun sizeInGiB(sizeInGiB: Number) {
      }

      public fun snapshotId(snapshotId: String) {
      }

      public fun tagSpecifications(tagSpecifications: IResolvable) {
      }

      public fun tagSpecifications(tagSpecifications: List<Any>) {
      }

      public fun throughput(throughput: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty.builder()

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public override fun filesystemType(filesystemType: String) {
        cdkBuilder.filesystemType(filesystemType)
      }

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      public override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
      }

      public override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications)
      }

      public override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty,
    ) : ServiceManagedEBSVolumeConfigurationProperty {
      public override fun encrypted(): Any? = unwrap(this).getEncrypted()

      public override fun filesystemType(): String? = unwrap(this).getFilesystemType()

      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

      public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      public override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      public override fun throughput(): Number? = unwrap(this).getThroughput()

      public override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceManagedEBSVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty):
          ServiceManagedEBSVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEBSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentControllerProperty {
    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty,
    ) : DeploymentControllerProperty {
      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentControllerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty):
          DeploymentControllerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentControllerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceConnectConfigurationProperty {
    public fun enabled(): Any

    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun services(): Any? = unwrap(this).getServices()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun logConfiguration(logConfiguration: IResolvable) {
      }

      public fun logConfiguration(logConfiguration: LogConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf289910965c7adb3fb8fe199c5bdef3f31a13e658bf52d05729bf25ebd57fa")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit) {
      }

      public fun namespace(namespace: String) {
      }

      public fun services(services: IResolvable) {
      }

      public fun services(services: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      public override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf289910965c7adb3fb8fe199c5bdef3f31a13e658bf52d05729bf25ebd57fa")
      public override
          fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit): Unit
          = logConfiguration(LogConfigurationProperty(logConfiguration))

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun services(services: IResolvable) {
        cdkBuilder.services(services.let(IResolvable::unwrap))
      }

      public override fun services(services: List<Any>) {
        cdkBuilder.services(services)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty,
    ) : ServiceConnectConfigurationProperty {
      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      public override fun namespace(): String? = unwrap(this).getNamespace()

      public override fun services(): Any? = unwrap(this).getServices()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty):
          ServiceConnectConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentConfigurationProperty {
    public fun alarms(): Any? = unwrap(this).getAlarms()

    public fun deploymentCircuitBreaker(): Any? = unwrap(this).getDeploymentCircuitBreaker()

    public fun maximumPercent(): Number? = unwrap(this).getMaximumPercent()

    public fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()

    public interface Builder {
      public fun alarms(alarms: IResolvable) {
      }

      public fun alarms(alarms: DeploymentAlarmsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      public fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit) {
      }

      public fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable) {
      }

      public
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      public
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit) {
      }

      public fun maximumPercent(maximumPercent: Number) {
      }

      public fun minimumHealthyPercent(minimumHealthyPercent: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.builder()

      public override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      public override fun alarms(alarms: DeploymentAlarmsProperty) {
        cdkBuilder.alarms(alarms.let(DeploymentAlarmsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      public override fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit): Unit =
          alarms(DeploymentAlarmsProperty(alarms))

      public override fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(IResolvable::unwrap))
      }

      public override
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(DeploymentCircuitBreakerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      public override
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit):
          Unit =
          deploymentCircuitBreaker(DeploymentCircuitBreakerProperty(deploymentCircuitBreaker))

      public override fun maximumPercent(maximumPercent: Number) {
        cdkBuilder.maximumPercent(maximumPercent)
      }

      public override fun minimumHealthyPercent(minimumHealthyPercent: Number) {
        cdkBuilder.minimumHealthyPercent(minimumHealthyPercent)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty,
    ) : DeploymentConfigurationProperty {
      public override fun alarms(): Any? = unwrap(this).getAlarms()

      public override fun deploymentCircuitBreaker(): Any? =
          unwrap(this).getDeploymentCircuitBreaker()

      public override fun maximumPercent(): Number? = unwrap(this).getMaximumPercent()

      public override fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty):
          DeploymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EBSTagSpecificationProperty {
    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    public fun resourceType(): String

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun propagateTags(propagateTags: String) {
      }

      public fun resourceType(resourceType: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty.builder()

      public override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty,
    ) : EBSTagSpecificationProperty {
      public override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      public override fun resourceType(): String = unwrap(this).getResourceType()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EBSTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty):
          EBSTagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSTagSpecificationProperty):
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PlacementStrategyProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun type(): String

    public interface Builder {
      public fun `field`(`field`: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.builder()

      public override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty,
    ) : PlacementStrategyProperty {
      public override fun `field`(): String? = unwrap(this).getField()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceRegistryProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun port(): Number? = unwrap(this).getPort()

    public fun registryArn(): String? = unwrap(this).getRegistryArn()

    public interface Builder {
      public fun containerName(containerName: String) {
      }

      public fun containerPort(containerPort: Number) {
      }

      public fun port(port: Number) {
      }

      public fun registryArn(registryArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.builder()

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun registryArn(registryArn: String) {
        cdkBuilder.registryArn(registryArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty,
    ) : ServiceRegistryProperty {
      public override fun containerName(): String? = unwrap(this).getContainerName()

      public override fun containerPort(): Number? = unwrap(this).getContainerPort()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun registryArn(): String? = unwrap(this).getRegistryArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceRegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty):
          ServiceRegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecretProperty {
    public fun name(): String

    public fun valueFrom(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun valueFrom(valueFrom: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnService.SecretProperty.Builder
          = software.amazon.awscdk.services.ecs.CfnService.SecretProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnService.SecretProperty,
    ) : SecretProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.SecretProperty):
          SecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnService.SecretProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun base(base: Number) {
      }

      public fun capacityProvider(capacityProvider: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty.builder()

      public override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      public override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty,
    ) : CapacityProviderStrategyItemProperty {
      public override fun base(): Number? = unwrap(this).getBase()

      public override fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

      public override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String

    public interface Builder {
      public fun expression(expression: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.builder()

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty,
    ) : PlacementConstraintProperty {
      public override fun expression(): String? = unwrap(this).getExpression()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String) {
      }

      public fun securityGroups(securityGroups: List<String>) {
      }

      public fun subnets(subnets: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.builder()

      public override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      public override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty,
    ) : AwsVpcConfigurationProperty {
      public override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
          emptyList()

      public override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceConnectTlsConfigurationProperty {
    public fun issuerCertificateAuthority(): Any

    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun issuerCertificateAuthority(issuerCertificateAuthority: IResolvable) {
      }

      public
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8917a2b4b6006ad864bec0cd56ed283602a26562436c0e7272227f1e1b93d5ed")
      public
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty.Builder.() -> Unit) {
      }

      public fun kmsKey(kmsKey: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty.builder()

      public override fun issuerCertificateAuthority(issuerCertificateAuthority: IResolvable) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(IResolvable::unwrap))
      }

      public override
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(ServiceConnectTlsCertificateAuthorityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8917a2b4b6006ad864bec0cd56ed283602a26562436c0e7272227f1e1b93d5ed")
      public override
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty.Builder.() -> Unit):
          Unit =
          issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty(issuerCertificateAuthority))

      public override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty,
    ) : ServiceConnectTlsConfigurationProperty {
      public override fun issuerCertificateAuthority(): Any =
          unwrap(this).getIssuerCertificateAuthority()

      public override fun kmsKey(): String? = unwrap(this).getKmsKey()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTlsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty):
          ServiceConnectTlsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentCircuitBreakerProperty {
    public fun enable(): Any

    public fun rollback(): Any

    public interface Builder {
      public fun enable(enable: Boolean) {
      }

      public fun enable(enable: IResolvable) {
      }

      public fun rollback(rollback: Boolean) {
      }

      public fun rollback(rollback: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.builder()

      public override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      public override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public override fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
      }

      public override fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty,
    ) : DeploymentCircuitBreakerProperty {
      public override fun enable(): Any = unwrap(this).getEnable()

      public override fun rollback(): Any = unwrap(this).getRollback()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentCircuitBreakerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty):
          DeploymentCircuitBreakerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentCircuitBreakerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ServiceVolumeConfigurationProperty {
    public fun managedEbsVolume(): Any? = unwrap(this).getManagedEbsVolume()

    public fun name(): String

    public interface Builder {
      public fun managedEbsVolume(managedEbsVolume: IResolvable) {
      }

      public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf7d3181315d7869494ee47e09feeb88be280000fcea7b0feeb1335613f1eb1f")
      public
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty.builder()

      public override fun managedEbsVolume(managedEbsVolume: IResolvable) {
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(IResolvable::unwrap))
      }

      public override
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty) {
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf7d3181315d7869494ee47e09feeb88be280000fcea7b0feeb1335613f1eb1f")
      public override
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = managedEbsVolume(ServiceManagedEBSVolumeConfigurationProperty(managedEbsVolume))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty,
    ) : ServiceVolumeConfigurationProperty {
      public override fun managedEbsVolume(): Any? = unwrap(this).getManagedEbsVolume()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty):
          ServiceVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentAlarmsProperty {
    public fun alarmNames(): List<String>

    public fun enable(): Any

    public fun rollback(): Any

    public interface Builder {
      public fun alarmNames(alarmNames: List<String>) {
      }

      public fun enable(enable: Boolean) {
      }

      public fun enable(enable: IResolvable) {
      }

      public fun rollback(rollback: Boolean) {
      }

      public fun rollback(rollback: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty.builder()

      public override fun alarmNames(alarmNames: List<String>) {
        cdkBuilder.alarmNames(alarmNames)
      }

      public override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      public override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public override fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
      }

      public override fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty,
    ) : DeploymentAlarmsProperty {
      public override fun alarmNames(): List<String> = unwrap(this).getAlarmNames() ?: emptyList()

      public override fun enable(): Any = unwrap(this).getEnable()

      public override fun rollback(): Any = unwrap(this).getRollback()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty):
          DeploymentAlarmsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentAlarmsProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
