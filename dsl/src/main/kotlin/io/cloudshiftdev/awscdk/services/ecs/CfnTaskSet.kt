package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun cluster(): String = unwrap(this).getCluster()

  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  public open fun externalId(): String? = unwrap(this).getExternalId()

  public open fun externalId(`value`: String) {
    unwrap(this).setExternalId(`value`)
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
  @JvmName("9373718358fe917031751f90c22fedef7cacc83d89402ccecee5e89c526e2171")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  public open fun platformVersion(`value`: String) {
    unwrap(this).setPlatformVersion(`value`)
  }

  public open fun scale(): Any? = unwrap(this).getScale()

  public open fun scale(`value`: IResolvable) {
    unwrap(this).setScale(`value`.let(IResolvable::unwrap))
  }

  public open fun scale(`value`: ScaleProperty) {
    unwrap(this).setScale(`value`.let(ScaleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45b02fd5de48d0ca63425a76e9bdd7f578838bc275473a0e41853cea9914fe36")
  public open fun scale(`value`: ScaleProperty.Builder.() -> Unit): Unit =
      scale(ScaleProperty(`value`))

  public open fun service(): String = unwrap(this).getService()

  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  public open fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  public open fun serviceRegistries(`value`: IResolvable) {
    unwrap(this).setServiceRegistries(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceRegistries(__idx_ac66f0: List<Any>) {
    unwrap(this).setServiceRegistries(__idx_ac66f0)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun taskDefinition(): String = unwrap(this).getTaskDefinition()

  public open fun taskDefinition(`value`: String) {
    unwrap(this).setTaskDefinition(`value`)
  }

  public interface Builder {
    public fun cluster(cluster: String) {
    }

    public fun externalId(externalId: String) {
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
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
    }

    public fun platformVersion(platformVersion: String) {
    }

    public fun scale(scale: IResolvable) {
    }

    public fun scale(scale: ScaleProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    public fun scale(scale: ScaleProperty.Builder.() -> Unit) {
    }

    public fun service(service: String) {
    }

    public fun serviceRegistries(serviceRegistries: IResolvable) {
    }

    public fun serviceRegistries(serviceRegistries: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun taskDefinition(taskDefinition: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskSet.Builder.create(scope, id)

    public override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    public override fun externalId(externalId: String) {
      cdkBuilder.externalId(externalId)
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
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    public override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    public override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    public override fun scale(scale: IResolvable) {
      cdkBuilder.scale(scale.let(IResolvable::unwrap))
    }

    public override fun scale(scale: ScaleProperty) {
      cdkBuilder.scale(scale.let(ScaleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    public override fun scale(scale: ScaleProperty.Builder.() -> Unit): Unit =
        scale(ScaleProperty(scale))

    public override fun service(service: String) {
      cdkBuilder.service(service)
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

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet): CfnTaskSet =
        CfnTaskSet(cdkObject)

    internal fun unwrap(wrapped: CfnTaskSet): software.amazon.awscdk.services.ecs.CfnTaskSet =
        wrapped.cdkObject
  }

  public interface ScaleProperty {
    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun unit(unit: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.builder()

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty,
    ) : ScaleProperty {
      public override fun unit(): String? = unwrap(this).getUnit()

      public override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty):
          ScaleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoadBalancerProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    public interface Builder {
      public fun containerName(containerName: String) {
      }

      public fun containerPort(containerPort: Number) {
      }

      public fun targetGroupArn(targetGroupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.builder()

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      public override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty,
    ) : LoadBalancerProperty {
      public override fun containerName(): String? = unwrap(this).getContainerName()

      public override fun containerPort(): Number? = unwrap(this).getContainerPort()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty):
          LoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty = (wrapped as
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
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty):
          ServiceRegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()

    public interface Builder {
      public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
      }

      public fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      public
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.builder()

      public override fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(IResolvable::unwrap))
      }

      public override fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      public override
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsVpcConfiguration(AwsVpcConfigurationProperty(awsVpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String>

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
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.builder()

      public override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      public override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
