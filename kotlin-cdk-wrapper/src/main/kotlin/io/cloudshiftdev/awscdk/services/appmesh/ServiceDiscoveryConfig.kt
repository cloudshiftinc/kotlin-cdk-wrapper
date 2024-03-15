@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ServiceDiscoveryConfig {
  public fun cloudmap(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty? =
      unwrap(this).getCloudmap()?.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::wrap)

  public fun dns(): CfnVirtualNode.DnsServiceDiscoveryProperty? =
      unwrap(this).getDns()?.let(CfnVirtualNode.DnsServiceDiscoveryProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7246157f6b89ec0fcdb2403b4e9036c19e6203aa026f820dc1a629629707093c")
    public
        fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit)

    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1f545ce5c02cea5dcad961485c3d0b63becbc4a8f28abcca9cbe2a05336c880")
    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig.Builder =
        software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig.builder()

    override fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
      cdkBuilder.cloudmap(cloudmap.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7246157f6b89ec0fcdb2403b4e9036c19e6203aa026f820dc1a629629707093c")
    override
        fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit):
        Unit = cloudmap(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty(cloudmap))

    override fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
      cdkBuilder.dns(dns.let(CfnVirtualNode.DnsServiceDiscoveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1f545ce5c02cea5dcad961485c3d0b63becbc4a8f28abcca9cbe2a05336c880")
    override fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder.() -> Unit): Unit =
        dns(CfnVirtualNode.DnsServiceDiscoveryProperty(dns))

    public fun build(): software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig,
  ) : CdkObject(cdkObject), ServiceDiscoveryConfig {
    override fun cloudmap(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty? =
        unwrap(this).getCloudmap()?.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::wrap)

    override fun dns(): CfnVirtualNode.DnsServiceDiscoveryProperty? =
        unwrap(this).getDns()?.let(CfnVirtualNode.DnsServiceDiscoveryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceDiscoveryConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig):
        ServiceDiscoveryConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceDiscoveryConfig):
        software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig
  }
}
