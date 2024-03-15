@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTaskSetProps {
  public fun cluster(): String

  public fun externalId(): String? = unwrap(this).getExternalId()

  public fun launchType(): String? = unwrap(this).getLaunchType()

  public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  public fun scale(): Any? = unwrap(this).getScale()

  public fun service(): String

  public fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskDefinition(): String

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: String)

    public fun externalId(externalId: String)

    public fun launchType(launchType: String)

    public fun loadBalancers(loadBalancers: IResolvable)

    public fun loadBalancers(loadBalancers: List<Any>)

    public fun loadBalancers(vararg loadBalancers: Any)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4776b25cc0243bc05854d524129a25d9f1a4413eddaa19f13cf06c790dd41")
    public
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit)

    public fun platformVersion(platformVersion: String)

    public fun scale(scale: IResolvable)

    public fun scale(scale: CfnTaskSet.ScaleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38935f625979bbb68bcd980013bdc7653430db7b59351680e2217e4ed1aa9e8")
    public fun scale(scale: CfnTaskSet.ScaleProperty.Builder.() -> Unit)

    public fun service(service: String)

    public fun serviceRegistries(serviceRegistries: IResolvable)

    public fun serviceRegistries(serviceRegistries: List<Any>)

    public fun serviceRegistries(vararg serviceRegistries: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskDefinition(taskDefinition: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSetProps.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskSetProps.builder()

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

    override
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnTaskSet.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4776b25cc0243bc05854d524129a25d9f1a4413eddaa19f13cf06c790dd41")
    override
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnTaskSet.NetworkConfigurationProperty(networkConfiguration))

    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    override fun scale(scale: IResolvable) {
      cdkBuilder.scale(scale.let(IResolvable::unwrap))
    }

    override fun scale(scale: CfnTaskSet.ScaleProperty) {
      cdkBuilder.scale(scale.let(CfnTaskSet.ScaleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38935f625979bbb68bcd980013bdc7653430db7b59351680e2217e4ed1aa9e8")
    override fun scale(scale: CfnTaskSet.ScaleProperty.Builder.() -> Unit): Unit =
        scale(CfnTaskSet.ScaleProperty(scale))

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

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSetProps,
  ) : CdkObject(cdkObject), CfnTaskSetProps {
    override fun cluster(): String = unwrap(this).getCluster()

    override fun externalId(): String? = unwrap(this).getExternalId()

    override fun launchType(): String? = unwrap(this).getLaunchType()

    override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    override fun scale(): Any? = unwrap(this).getScale()

    override fun service(): String = unwrap(this).getService()

    override fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskDefinition(): String = unwrap(this).getTaskDefinition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSetProps):
        CfnTaskSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskSetProps):
        software.amazon.awscdk.services.ecs.CfnTaskSetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnTaskSetProps
  }
}
