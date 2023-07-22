@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

/**
 * Interface for setting the properties of proxy configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AppMeshProxyConfigurationProps appMeshProxyConfigurationProps =
 * AppMeshProxyConfigurationProps.builder()
 * .appPorts(List.of(123))
 * .proxyEgressPort(123)
 * .proxyIngressPort(123)
 * // the properties below are optional
 * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
 * .egressIgnoredPorts(List.of(123))
 * .ignoredGID(123)
 * .ignoredUID(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AppMeshProxyConfigurationPropsDsl {
  private val cdkBuilder: AppMeshProxyConfigurationProps.Builder =
      AppMeshProxyConfigurationProps.builder()

  private val _appPorts: MutableList<Number> = mutableListOf()

  private val _egressIgnoredIPs: MutableList<String> = mutableListOf()

  private val _egressIgnoredPorts: MutableList<Number> = mutableListOf()

  /**
   * @param appPorts The list of ports that the application uses. 
   * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
   */
  public fun appPorts(vararg appPorts: Number) {
    _appPorts.addAll(listOf(*appPorts))
  }

  /**
   * @param appPorts The list of ports that the application uses. 
   * Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.
   */
  public fun appPorts(appPorts: Collection<Number>) {
    _appPorts.addAll(appPorts)
  }

  /**
   * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored and
   * not redirected to the ProxyEgressPort.
   * It can be an empty list.
   */
  public fun egressIgnoredIPs(vararg egressIgnoredIPs: String) {
    _egressIgnoredIPs.addAll(listOf(*egressIgnoredIPs))
  }

  /**
   * @param egressIgnoredIPs The egress traffic going to these specified IP addresses is ignored and
   * not redirected to the ProxyEgressPort.
   * It can be an empty list.
   */
  public fun egressIgnoredIPs(egressIgnoredIPs: Collection<String>) {
    _egressIgnoredIPs.addAll(egressIgnoredIPs)
  }

  /**
   * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and not
   * redirected to the ProxyEgressPort.
   * It can be an empty list.
   */
  public fun egressIgnoredPorts(vararg egressIgnoredPorts: Number) {
    _egressIgnoredPorts.addAll(listOf(*egressIgnoredPorts))
  }

  /**
   * @param egressIgnoredPorts The egress traffic going to these specified ports is ignored and not
   * redirected to the ProxyEgressPort.
   * It can be an empty list.
   */
  public fun egressIgnoredPorts(egressIgnoredPorts: Collection<Number>) {
    _egressIgnoredPorts.addAll(egressIgnoredPorts)
  }

  /**
   * @param ignoredGid The group ID (GID) of the proxy container as defined by the user parameter in
   * a container definition.
   * This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this
   * field can be empty.
   */
  public fun ignoredGid(ignoredGid: Number) {
    cdkBuilder.ignoredGid(ignoredGid)
  }

  /**
   * @param ignoredUid The user ID (UID) of the proxy container as defined by the user parameter in
   * a container definition.
   * This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this
   * field can be empty.
   */
  public fun ignoredUid(ignoredUid: Number) {
    cdkBuilder.ignoredUid(ignoredUid)
  }

  /**
   * @param proxyEgressPort Specifies the port that outgoing traffic from the AppPorts is directed
   * to. 
   */
  public fun proxyEgressPort(proxyEgressPort: Number) {
    cdkBuilder.proxyEgressPort(proxyEgressPort)
  }

  /**
   * @param proxyIngressPort Specifies the port that incoming traffic to the AppPorts is directed
   * to. 
   */
  public fun proxyIngressPort(proxyIngressPort: Number) {
    cdkBuilder.proxyIngressPort(proxyIngressPort)
  }

  public fun build(): AppMeshProxyConfigurationProps {
    if(_appPorts.isNotEmpty()) cdkBuilder.appPorts(_appPorts)
    if(_egressIgnoredIPs.isNotEmpty()) cdkBuilder.egressIgnoredIPs(_egressIgnoredIPs)
    if(_egressIgnoredPorts.isNotEmpty()) cdkBuilder.egressIgnoredPorts(_egressIgnoredPorts)
    return cdkBuilder.build()
  }
}
