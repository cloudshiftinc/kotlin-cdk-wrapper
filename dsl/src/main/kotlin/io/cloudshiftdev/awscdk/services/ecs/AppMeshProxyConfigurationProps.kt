package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AppMeshProxyConfigurationProps {
  /**
   * The list of ports that the application uses.
   *
   * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
   */
  public fun appPorts(): List<Number>

  /**
   * The egress traffic going to these specified IP addresses is ignored and not redirected to the
   * ProxyEgressPort.
   *
   * It can be an empty list.
   */
  public fun egressIgnoredIPs(): List<String> = unwrap(this).getEgressIgnoredIPs() ?: emptyList()

  /**
   * The egress traffic going to these specified ports is ignored and not redirected to the
   * ProxyEgressPort.
   *
   * It can be an empty list.
   */
  public fun egressIgnoredPorts(): List<Number> = unwrap(this).getEgressIgnoredPorts() ?:
      emptyList()

  /**
   * The group ID (GID) of the proxy container as defined by the user parameter in a container
   * definition.
   *
   * This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this
   * field can be empty.
   */
  public fun ignoredGid(): Number? = unwrap(this).getIgnoredGID()

  /**
   * The user ID (UID) of the proxy container as defined by the user parameter in a container
   * definition.
   *
   * This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this
   * field can be empty.
   */
  public fun ignoredUid(): Number? = unwrap(this).getIgnoredUID()

  /**
   * Specifies the port that outgoing traffic from the AppPorts is directed to.
   */
  public fun proxyEgressPort(): Number

  /**
   * Specifies the port that incoming traffic to the AppPorts is directed to.
   */
  public fun proxyIngressPort(): Number

  /**
   * A builder for [AppMeshProxyConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appPorts The list of ports that the application uses. 
     * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
     */
    public fun appPorts(appPorts: List<Number>)

    /**
     * @param appPorts The list of ports that the application uses. 
     * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
     */
    public fun appPorts(vararg appPorts: Number)

    /**
     * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored
     * and not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    public fun egressIgnoredIPs(egressIgnoredIPs: List<String>)

    /**
     * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored
     * and not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    public fun egressIgnoredIPs(vararg egressIgnoredIPs: String)

    /**
     * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and
     * not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    public fun egressIgnoredPorts(egressIgnoredPorts: List<Number>)

    /**
     * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and
     * not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    public fun egressIgnoredPorts(vararg egressIgnoredPorts: Number)

    /**
     * @param ignoredGid The group ID (GID) of the proxy container as defined by the user parameter
     * in a container definition.
     * This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this
     * field can be empty.
     */
    public fun ignoredGid(ignoredGid: Number)

    /**
     * @param ignoredUid The user ID (UID) of the proxy container as defined by the user parameter
     * in a container definition.
     * This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this
     * field can be empty.
     */
    public fun ignoredUid(ignoredUid: Number)

    /**
     * @param proxyEgressPort Specifies the port that outgoing traffic from the AppPorts is directed
     * to. 
     */
    public fun proxyEgressPort(proxyEgressPort: Number)

    /**
     * @param proxyIngressPort Specifies the port that incoming traffic to the AppPorts is directed
     * to. 
     */
    public fun proxyIngressPort(proxyIngressPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.Builder =
        software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.builder()

    /**
     * @param appPorts The list of ports that the application uses. 
     * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
     */
    override fun appPorts(appPorts: List<Number>) {
      cdkBuilder.appPorts(appPorts)
    }

    /**
     * @param appPorts The list of ports that the application uses. 
     * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
     */
    override fun appPorts(vararg appPorts: Number): Unit = appPorts(appPorts.toList())

    /**
     * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored
     * and not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    override fun egressIgnoredIPs(egressIgnoredIPs: List<String>) {
      cdkBuilder.egressIgnoredIPs(egressIgnoredIPs)
    }

    /**
     * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored
     * and not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    override fun egressIgnoredIPs(vararg egressIgnoredIPs: String): Unit =
        egressIgnoredIPs(egressIgnoredIPs.toList())

    /**
     * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and
     * not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    override fun egressIgnoredPorts(egressIgnoredPorts: List<Number>) {
      cdkBuilder.egressIgnoredPorts(egressIgnoredPorts)
    }

    /**
     * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and
     * not redirected to the ProxyEgressPort.
     * It can be an empty list.
     */
    override fun egressIgnoredPorts(vararg egressIgnoredPorts: Number): Unit =
        egressIgnoredPorts(egressIgnoredPorts.toList())

    /**
     * @param ignoredGid The group ID (GID) of the proxy container as defined by the user parameter
     * in a container definition.
     * This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this
     * field can be empty.
     */
    override fun ignoredGid(ignoredGid: Number) {
      cdkBuilder.ignoredGid(ignoredGid)
    }

    /**
     * @param ignoredUid The user ID (UID) of the proxy container as defined by the user parameter
     * in a container definition.
     * This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this
     * field can be empty.
     */
    override fun ignoredUid(ignoredUid: Number) {
      cdkBuilder.ignoredUid(ignoredUid)
    }

    /**
     * @param proxyEgressPort Specifies the port that outgoing traffic from the AppPorts is directed
     * to. 
     */
    override fun proxyEgressPort(proxyEgressPort: Number) {
      cdkBuilder.proxyEgressPort(proxyEgressPort)
    }

    /**
     * @param proxyIngressPort Specifies the port that incoming traffic to the AppPorts is directed
     * to. 
     */
    override fun proxyIngressPort(proxyIngressPort: Number) {
      cdkBuilder.proxyIngressPort(proxyIngressPort)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps,
  ) : CdkObject(cdkObject), AppMeshProxyConfigurationProps {
    /**
     * The list of ports that the application uses.
     *
     * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
     */
    override fun appPorts(): List<Number> = unwrap(this).getAppPorts()

    /**
     * The egress traffic going to these specified IP addresses is ignored and not redirected to the
     * ProxyEgressPort.
     *
     * It can be an empty list.
     */
    override fun egressIgnoredIPs(): List<String> = unwrap(this).getEgressIgnoredIPs() ?:
        emptyList()

    /**
     * The egress traffic going to these specified ports is ignored and not redirected to the
     * ProxyEgressPort.
     *
     * It can be an empty list.
     */
    override fun egressIgnoredPorts(): List<Number> = unwrap(this).getEgressIgnoredPorts() ?:
        emptyList()

    /**
     * The group ID (GID) of the proxy container as defined by the user parameter in a container
     * definition.
     *
     * This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this
     * field can be empty.
     */
    override fun ignoredGid(): Number? = unwrap(this).getIgnoredGID()

    /**
     * The user ID (UID) of the proxy container as defined by the user parameter in a container
     * definition.
     *
     * This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this
     * field can be empty.
     */
    override fun ignoredUid(): Number? = unwrap(this).getIgnoredUID()

    /**
     * Specifies the port that outgoing traffic from the AppPorts is directed to.
     */
    override fun proxyEgressPort(): Number = unwrap(this).getProxyEgressPort()

    /**
     * Specifies the port that incoming traffic to the AppPorts is directed to.
     */
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
