@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AppMeshProxyConfigurationProps {
  public fun appPorts(): List<Number>

  public fun egressIgnoredIPs(): List<String> = unwrap(this).getEgressIgnoredIPs() ?: emptyList()

  public fun egressIgnoredPorts(): List<Number> = unwrap(this).getEgressIgnoredPorts() ?:
      emptyList()

  public fun ignoredGid(): Number? = unwrap(this).getIgnoredGID()

  public fun ignoredUid(): Number? = unwrap(this).getIgnoredUID()

  public fun proxyEgressPort(): Number

  public fun proxyIngressPort(): Number

  @CdkDslMarker
  public interface Builder {
    public fun appPorts(appPorts: List<Number>)

    public fun appPorts(vararg appPorts: Number)

    public fun egressIgnoredIPs(egressIgnoredIPs: List<String>)

    public fun egressIgnoredIPs(vararg egressIgnoredIPs: String)

    public fun egressIgnoredPorts(egressIgnoredPorts: List<Number>)

    public fun egressIgnoredPorts(vararg egressIgnoredPorts: Number)

    public fun ignoredGid(ignoredGid: Number)

    public fun ignoredUid(ignoredUid: Number)

    public fun proxyEgressPort(proxyEgressPort: Number)

    public fun proxyIngressPort(proxyIngressPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.Builder =
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.builder()

    override fun appPorts(appPorts: List<Number>) {
      cdkBuilder.appPorts(appPorts)
    }

    override fun appPorts(vararg appPorts: Number): Unit = appPorts(appPorts.toList())

    override fun egressIgnoredIPs(egressIgnoredIPs: List<String>) {
      cdkBuilder.egressIgnoredIPs(egressIgnoredIPs)
    }

    override fun egressIgnoredIPs(vararg egressIgnoredIPs: String): Unit =
        egressIgnoredIPs(egressIgnoredIPs.toList())

    override fun egressIgnoredPorts(egressIgnoredPorts: List<Number>) {
      cdkBuilder.egressIgnoredPorts(egressIgnoredPorts)
    }

    override fun egressIgnoredPorts(vararg egressIgnoredPorts: Number): Unit =
        egressIgnoredPorts(egressIgnoredPorts.toList())

    override fun ignoredGid(ignoredGid: Number) {
      cdkBuilder.ignoredGid(ignoredGid)
    }

    override fun ignoredUid(ignoredUid: Number) {
      cdkBuilder.ignoredUid(ignoredUid)
    }

    override fun proxyEgressPort(proxyEgressPort: Number) {
      cdkBuilder.proxyEgressPort(proxyEgressPort)
    }

    override fun proxyIngressPort(proxyIngressPort: Number) {
      cdkBuilder.proxyIngressPort(proxyIngressPort)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps,
  ) : CdkObject(cdkObject), AppMeshProxyConfigurationProps {
    override fun appPorts(): List<Number> = unwrap(this).getAppPorts()

    override fun egressIgnoredIPs(): List<String> = unwrap(this).getEgressIgnoredIPs() ?:
        emptyList()

    override fun egressIgnoredPorts(): List<Number> = unwrap(this).getEgressIgnoredPorts() ?:
        emptyList()

    override fun ignoredGid(): Number? = unwrap(this).getIgnoredGID()

    override fun ignoredUid(): Number? = unwrap(this).getIgnoredUID()

    override fun proxyEgressPort(): Number = unwrap(this).getProxyEgressPort()

    override fun proxyIngressPort(): Number = unwrap(this).getProxyIngressPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppMeshProxyConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps):
        AppMeshProxyConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppMeshProxyConfigurationProps):
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps
  }
}
