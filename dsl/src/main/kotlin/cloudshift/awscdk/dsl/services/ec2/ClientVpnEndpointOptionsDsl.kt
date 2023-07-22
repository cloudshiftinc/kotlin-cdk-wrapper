@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions
import software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout
import software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication
import software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.TransportProtocol
import software.amazon.awscdk.services.ec2.VpnPort
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogStream

@CdkDslMarker
public class ClientVpnEndpointOptionsDsl {
  private val cdkBuilder: ClientVpnEndpointOptions.Builder = ClientVpnEndpointOptions.builder()

  private val _dnsServers: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR.
   * This automatically creates an authorization rule. Set this to `false` and
   * use `addAuthorizationRule()` to create your own rules instead.
   */
  public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
    cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
  }

  /**
   * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
   * 
   * The address range cannot overlap with the local CIDR of the VPC
   * in which the associated subnet is located, or the routes that you add manually.
   *
   * Changing the address range will replace the Client VPN endpoint.
   *
   * The CIDR block should be /22 or greater.
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param clientCertificateArn The ARN of the client certificate for mutual authentication.
   * The certificate must be signed by a certificate authority (CA) and it must
   * be provisioned in AWS Certificate Manager (ACM).
   */
  public fun clientCertificateArn(clientCertificateArn: String) {
    cdkBuilder.clientCertificateArn(clientCertificateArn)
  }

  /**
   * @param clientConnectionHandler The AWS Lambda function used for connection authorization.
   * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
   */
  public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
    cdkBuilder.clientConnectionHandler(clientConnectionHandler)
  }

  /**
   * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
   * clients when a VPN session is established.
   * UTF-8 encoded characters only. Maximum of 1400 characters.
   */
  public fun clientLoginBanner(clientLoginBanner: String) {
    cdkBuilder.clientLoginBanner(clientLoginBanner)
  }

  /**
   * @param description A brief description of the Client VPN endpoint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param dnsServers Information about the DNS servers to be used for DNS resolution.
   * A Client VPN endpoint can have up to two DNS servers.
   */
  public fun dnsServers(vararg dnsServers: String) {
    _dnsServers.addAll(listOf(*dnsServers))
  }

  /**
   * @param dnsServers Information about the DNS servers to be used for DNS resolution.
   * A Client VPN endpoint can have up to two DNS servers.
   */
  public fun dnsServers(dnsServers: Collection<String>) {
    _dnsServers.addAll(dnsServers)
  }

  /**
   * @param logGroup A CloudWatch Logs log group for connection logging.
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * @param logStream A CloudWatch Logs log stream for connection logging.
   */
  public fun logStream(logStream: ILogStream) {
    cdkBuilder.logStream(logStream)
  }

  /**
   * @param logging Whether to enable connections logging.
   */
  public fun logging(logging: Boolean) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
   */
  public fun port(port: VpnPort) {
    cdkBuilder.port(port)
  }

  /**
   * @param securityGroups The security groups to apply to the target network.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups to apply to the target network.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
   * endpoint.
   */
  public fun selfServicePortal(selfServicePortal: Boolean) {
    cdkBuilder.selfServicePortal(selfServicePortal)
  }

  /**
   * @param serverCertificateArn The ARN of the server certificate. 
   */
  public fun serverCertificateArn(serverCertificateArn: String) {
    cdkBuilder.serverCertificateArn(serverCertificateArn)
  }

  /**
   * @param sessionTimeout The maximum VPN session duration time.
   */
  public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  /**
   * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   */
  public fun splitTunnel(splitTunnel: Boolean) {
    cdkBuilder.splitTunnel(splitTunnel)
  }

  /**
   * @param transportProtocol The transport protocol to be used by the VPN session.
   */
  public fun transportProtocol(transportProtocol: TransportProtocol) {
    cdkBuilder.transportProtocol(transportProtocol)
  }

  /**
   * @param userBasedAuthentication The type of user-based authentication to use.
   */
  public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
    cdkBuilder.userBasedAuthentication(userBasedAuthentication)
  }

  /**
   * @param vpcSubnets Subnets to associate to the client VPN endpoint.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Subnets to associate to the client VPN endpoint.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): ClientVpnEndpointOptions {
    if(_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
