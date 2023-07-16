@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps

@CdkDslMarker
public class CfnClientVpnEndpointPropsDsl {
  private val cdkBuilder: CfnClientVpnEndpointProps.Builder = CfnClientVpnEndpointProps.builder()

  private val _authenticationOptions: MutableList<Any> = mutableListOf()

  private val _dnsServers: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  public fun authenticationOptions(vararg authenticationOptions: Any) {
    _authenticationOptions.addAll(listOf(*authenticationOptions))
  }

  public fun authenticationOptions(authenticationOptions: Collection<Any>) {
    _authenticationOptions.addAll(authenticationOptions)
  }

  public fun authenticationOptions(authenticationOptions: IResolvable) {
    cdkBuilder.authenticationOptions(authenticationOptions)
  }

  public fun clientCidrBlock(clientCidrBlock: String) {
    cdkBuilder.clientCidrBlock(clientCidrBlock)
  }

  public fun clientConnectOptions(clientConnectOptions: IResolvable) {
    cdkBuilder.clientConnectOptions(clientConnectOptions)
  }

  public
      fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty) {
    cdkBuilder.clientConnectOptions(clientConnectOptions)
  }

  public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
    cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions)
  }

  public
      fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty) {
    cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions)
  }

  public fun connectionLogOptions(connectionLogOptions: IResolvable) {
    cdkBuilder.connectionLogOptions(connectionLogOptions)
  }

  public
      fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty) {
    cdkBuilder.connectionLogOptions(connectionLogOptions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun dnsServers(vararg dnsServers: String) {
    _dnsServers.addAll(listOf(*dnsServers))
  }

  public fun dnsServers(dnsServers: Collection<String>) {
    _dnsServers.addAll(dnsServers)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun selfServicePortal(selfServicePortal: String) {
    cdkBuilder.selfServicePortal(selfServicePortal)
  }

  public fun serverCertificateArn(serverCertificateArn: String) {
    cdkBuilder.serverCertificateArn(serverCertificateArn)
  }

  public fun sessionTimeoutHours(sessionTimeoutHours: Number) {
    cdkBuilder.sessionTimeoutHours(sessionTimeoutHours)
  }

  public fun splitTunnel(splitTunnel: Boolean) {
    cdkBuilder.splitTunnel(splitTunnel)
  }

  public fun splitTunnel(splitTunnel: IResolvable) {
    cdkBuilder.splitTunnel(splitTunnel)
  }

  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  public fun transportProtocol(transportProtocol: String) {
    cdkBuilder.transportProtocol(transportProtocol)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun vpnPort(vpnPort: Number) {
    cdkBuilder.vpnPort(vpnPort)
  }

  public fun build(): CfnClientVpnEndpointProps {
    if(_authenticationOptions.isNotEmpty()) cdkBuilder.authenticationOptions(_authenticationOptions)
    if(_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
