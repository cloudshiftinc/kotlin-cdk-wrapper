@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet,
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

  public open fun loadBalancers(vararg __idx_ac66f0: Any): Unit =
      loadBalancers(__idx_ac66f0.toList())

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun serviceRegistries(vararg __idx_ac66f0: Any): Unit =
      serviceRegistries(__idx_ac66f0.toList())

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun taskDefinition(): String = unwrap(this).getTaskDefinition()

  public open fun taskDefinition(`value`: String) {
    unwrap(this).setTaskDefinition(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: String)

    public fun externalId(externalId: String)

    public fun launchType(launchType: String)

    public fun loadBalancers(loadBalancers: IResolvable)

    public fun loadBalancers(loadBalancers: List<Any>)

    public fun loadBalancers(vararg loadBalancers: Any)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    public fun platformVersion(platformVersion: String)

    public fun scale(scale: IResolvable)

    public fun scale(scale: ScaleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    public fun scale(scale: ScaleProperty.Builder.() -> Unit)

    public fun service(service: String)

    public fun serviceRegistries(serviceRegistries: IResolvable)

    public fun serviceRegistries(serviceRegistries: List<Any>)

    public fun serviceRegistries(vararg serviceRegistries: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskDefinition(taskDefinition: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskSet.Builder.create(scope, id)

    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    override fun externalId(externalId: String) {
      cdkBuilder.externalId(externalId)
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

    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    override fun scale(scale: IResolvable) {
      cdkBuilder.scale(scale.let(IResolvable::unwrap))
    }

    override fun scale(scale: ScaleProperty) {
      cdkBuilder.scale(scale.let(ScaleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    override fun scale(scale: ScaleProperty.Builder.() -> Unit): Unit = scale(ScaleProperty(scale))

    override fun service(service: String) {
      cdkBuilder.service(service)
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

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnTaskSet.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty,
    ) : CdkObject(cdkObject), ScaleProperty {
      override fun unit(): String? = unwrap(this).getUnit()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty):
          ScaleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty
    }
  }

  public interface LoadBalancerProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    @CdkDslMarker
    public interface Builder {
      public fun containerName(containerName: String)

      public fun containerPort(containerPort: Number)

      public fun targetGroupArn(targetGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.builder()

      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty,
    ) : CdkObject(cdkObject), LoadBalancerProperty {
      override fun containerName(): String? = unwrap(this).getContainerName()

      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty):
          LoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty
    }
  }

  public interface ServiceRegistryProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun port(): Number? = unwrap(this).getPort()

    public fun registryArn(): String? = unwrap(this).getRegistryArn()

    @CdkDslMarker
    public interface Builder {
      public fun containerName(containerName: String)

      public fun containerPort(containerPort: Number)

      public fun port(port: Number)

      public fun registryArn(registryArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.builder()

      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun registryArn(registryArn: String) {
        cdkBuilder.registryArn(registryArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty,
    ) : CdkObject(cdkObject), ServiceRegistryProperty {
      override fun containerName(): String? = unwrap(this).getContainerName()

      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      override fun port(): Number? = unwrap(this).getPort()

      override fun registryArn(): String? = unwrap(this).getRegistryArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceRegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty):
          ServiceRegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable)

      public fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      public
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.builder()

      override fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(IResolvable::unwrap))
      }

      override fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      override
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsVpcConfiguration(AwsVpcConfigurationProperty(awsVpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      override fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String)

      public fun securityGroups(securityGroups: List<String>)

      public fun securityGroups(vararg securityGroups: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.builder()

      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty
    }
  }
}
