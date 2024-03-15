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

public interface CfnClusterProps {
  public fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?: emptyList()

  public fun clusterName(): String? = unwrap(this).getClusterName()

  public fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun defaultCapacityProviderStrategy(): Any? =
      unwrap(this).getDefaultCapacityProviderStrategy()

  public fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun capacityProviders(capacityProviders: List<String>)

    public fun capacityProviders(vararg capacityProviders: String)

    public fun clusterName(clusterName: String)

    public fun clusterSettings(clusterSettings: IResolvable)

    public fun clusterSettings(clusterSettings: List<Any>)

    public fun clusterSettings(vararg clusterSettings: Any)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnCluster.ClusterConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6e99b1e2f459f41708260072121e7085e08fc6e0db3469037f419267c72f8c")
    public
        fun configuration(configuration: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit)

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)

    public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable)

    public
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abda0c5f82eecb52744b5c85186bd1ab6cbb213d95643185e65bc73b8067583")
    public
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnClusterProps.Builder =
        software.amazon.awscdk.services.ecs.CfnClusterProps.builder()

    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun clusterSettings(clusterSettings: IResolvable) {
      cdkBuilder.clusterSettings(clusterSettings.let(IResolvable::unwrap))
    }

    override fun clusterSettings(clusterSettings: List<Any>) {
      cdkBuilder.clusterSettings(clusterSettings)
    }

    override fun clusterSettings(vararg clusterSettings: Any): Unit =
        clusterSettings(clusterSettings.toList())

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnCluster.ClusterConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnCluster.ClusterConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6e99b1e2f459f41708260072121e7085e08fc6e0db3469037f419267c72f8c")
    override
        fun configuration(configuration: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnCluster.ClusterConfigurationProperty(configuration))

    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    override fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(IResolvable::unwrap))
    }

    override
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(CfnCluster.ServiceConnectDefaultsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abda0c5f82eecb52744b5c85186bd1ab6cbb213d95643185e65bc73b8067583")
    override
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit):
        Unit =
        serviceConnectDefaults(CfnCluster.ServiceConnectDefaultsProperty(serviceConnectDefaults))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?:
        emptyList()

    override fun clusterName(): String? = unwrap(this).getClusterName()

    override fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun defaultCapacityProviderStrategy(): Any? =
        unwrap(this).getDefaultCapacityProviderStrategy()

    override fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.ecs.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnClusterProps
  }
}
