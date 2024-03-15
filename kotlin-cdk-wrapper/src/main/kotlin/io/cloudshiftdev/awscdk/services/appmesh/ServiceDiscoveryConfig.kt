@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for VirtualNode Service Discovery.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * ServiceDiscoveryConfig serviceDiscoveryConfig = ServiceDiscoveryConfig.builder()
 * .cloudmap(AwsCloudMapServiceDiscoveryProperty.builder()
 * .namespaceName("namespaceName")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .ipPreference("ipPreference")
 * .build())
 * .dns(DnsServiceDiscoveryProperty.builder()
 * .hostname("hostname")
 * // the properties below are optional
 * .ipPreference("ipPreference")
 * .responseType("responseType")
 * .build())
 * .build();
 * ```
 */
public interface ServiceDiscoveryConfig {
  /**
   * Cloud Map based Service Discovery.
   *
   * Default: - no Cloud Map based service discovery
   */
  public fun cloudmap(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty? =
      unwrap(this).getCloudmap()?.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::wrap)

  /**
   * DNS based Service Discovery.
   *
   * Default: - no DNS based service discovery
   */
  public fun dns(): CfnVirtualNode.DnsServiceDiscoveryProperty? =
      unwrap(this).getDns()?.let(CfnVirtualNode.DnsServiceDiscoveryProperty::wrap)

  /**
   * A builder for [ServiceDiscoveryConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudmap Cloud Map based Service Discovery.
     */
    public fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty)

    /**
     * @param cloudmap Cloud Map based Service Discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7246157f6b89ec0fcdb2403b4e9036c19e6203aa026f820dc1a629629707093c")
    public
        fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit)

    /**
     * @param dns DNS based Service Discovery.
     */
    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty)

    /**
     * @param dns DNS based Service Discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1f545ce5c02cea5dcad961485c3d0b63becbc4a8f28abcca9cbe2a05336c880")
    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig.Builder =
        software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig.builder()

    /**
     * @param cloudmap Cloud Map based Service Discovery.
     */
    override fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
      cdkBuilder.cloudmap(cloudmap.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::unwrap))
    }

    /**
     * @param cloudmap Cloud Map based Service Discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7246157f6b89ec0fcdb2403b4e9036c19e6203aa026f820dc1a629629707093c")
    override
        fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit):
        Unit = cloudmap(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty(cloudmap))

    /**
     * @param dns DNS based Service Discovery.
     */
    override fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
      cdkBuilder.dns(dns.let(CfnVirtualNode.DnsServiceDiscoveryProperty::unwrap))
    }

    /**
     * @param dns DNS based Service Discovery.
     */
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
    /**
     * Cloud Map based Service Discovery.
     *
     * Default: - no Cloud Map based service discovery
     */
    override fun cloudmap(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty? =
        unwrap(this).getCloudmap()?.let(CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty::wrap)

    /**
     * DNS based Service Discovery.
     *
     * Default: - no DNS based service discovery
     */
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
