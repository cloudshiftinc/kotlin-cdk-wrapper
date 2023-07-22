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

/**
 * Properties for defining a `CfnClientVpnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnClientVpnEndpointProps cfnClientVpnEndpointProps = CfnClientVpnEndpointProps.builder()
 * .authenticationOptions(List.of(ClientAuthenticationRequestProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
 * .directoryId("directoryId")
 * .build())
 * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
 * .samlProviderArn("samlProviderArn")
 * // the properties below are optional
 * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
 * .build())
 * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
 * .clientRootCertificateChainArn("clientRootCertificateChainArn")
 * .build())
 * .build()))
 * .clientCidrBlock("clientCidrBlock")
 * .connectionLogOptions(ConnectionLogOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .cloudwatchLogGroup("cloudwatchLogGroup")
 * .cloudwatchLogStream("cloudwatchLogStream")
 * .build())
 * .serverCertificateArn("serverCertificateArn")
 * // the properties below are optional
 * .clientConnectOptions(ClientConnectOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build())
 * .clientLoginBannerOptions(ClientLoginBannerOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bannerText("bannerText")
 * .build())
 * .description("description")
 * .dnsServers(List.of("dnsServers"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .selfServicePortal("selfServicePortal")
 * .sessionTimeoutHours(123)
 * .splitTunnel(false)
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .transportProtocol("transportProtocol")
 * .vpcId("vpcId")
 * .vpnPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointPropsDsl {
  private val cdkBuilder: CfnClientVpnEndpointProps.Builder = CfnClientVpnEndpointProps.builder()

  private val _authenticationOptions: MutableList<Any> = mutableListOf()

  private val _dnsServers: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  /**
   * @param authenticationOptions Information about the authentication method to be used to
   * authenticate clients. 
   */
  public fun authenticationOptions(vararg authenticationOptions: Any) {
    _authenticationOptions.addAll(listOf(*authenticationOptions))
  }

  /**
   * @param authenticationOptions Information about the authentication method to be used to
   * authenticate clients. 
   */
  public fun authenticationOptions(authenticationOptions: Collection<Any>) {
    _authenticationOptions.addAll(authenticationOptions)
  }

  /**
   * @param authenticationOptions Information about the authentication method to be used to
   * authenticate clients. 
   */
  public fun authenticationOptions(authenticationOptions: IResolvable) {
    cdkBuilder.authenticationOptions(authenticationOptions)
  }

  /**
   * @param clientCidrBlock The IPv4 address range, in CIDR notation, from which to assign client IP
   * addresses. 
   * The address range cannot overlap with the local CIDR of the VPC in which the associated subnet
   * is located, or the routes that you add manually. The address range cannot be changed after the
   * Client VPN endpoint has been created. Client CIDR range must have a size of at least /22 and must
   * not be greater than /12.
   */
  public fun clientCidrBlock(clientCidrBlock: String) {
    cdkBuilder.clientCidrBlock(clientCidrBlock)
  }

  /**
   * @param clientConnectOptions The options for managing connection authorization for new client
   * connections.
   */
  public fun clientConnectOptions(clientConnectOptions: IResolvable) {
    cdkBuilder.clientConnectOptions(clientConnectOptions)
  }

  /**
   * @param clientConnectOptions The options for managing connection authorization for new client
   * connections.
   */
  public
      fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty) {
    cdkBuilder.clientConnectOptions(clientConnectOptions)
  }

  /**
   * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
   * displayed on AWS provided clients when a VPN session is established.
   */
  public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
    cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions)
  }

  /**
   * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
   * displayed on AWS provided clients when a VPN session is established.
   */
  public
      fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty) {
    cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions)
  }

  /**
   * @param connectionLogOptions Information about the client connection logging options. 
   * If you enable client connection logging, data about client connections is sent to a Cloudwatch
   * Logs log stream. The following information is logged:
   *
   * * Client connection requests
   * * Client connection results (successful and unsuccessful)
   * * Reasons for unsuccessful client connection requests
   * * Client connection termination time
   */
  public fun connectionLogOptions(connectionLogOptions: IResolvable) {
    cdkBuilder.connectionLogOptions(connectionLogOptions)
  }

  /**
   * @param connectionLogOptions Information about the client connection logging options. 
   * If you enable client connection logging, data about client connections is sent to a Cloudwatch
   * Logs log stream. The following information is logged:
   *
   * * Client connection requests
   * * Client connection results (successful and unsuccessful)
   * * Reasons for unsuccessful client connection requests
   * * Client connection termination time
   */
  public
      fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty) {
    cdkBuilder.connectionLogOptions(connectionLogOptions)
  }

  /**
   * @param description A brief description of the Client VPN endpoint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param dnsServers Information about the DNS servers to be used for DNS resolution.
   * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
   * address configured on the device is used for the DNS server.
   */
  public fun dnsServers(vararg dnsServers: String) {
    _dnsServers.addAll(listOf(*dnsServers))
  }

  /**
   * @param dnsServers Information about the DNS servers to be used for DNS resolution.
   * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
   * address configured on the device is used for the DNS server.
   */
  public fun dnsServers(dnsServers: Collection<String>) {
    _dnsServers.addAll(dnsServers)
  }

  /**
   * @param securityGroupIds The IDs of one or more security groups to apply to the target network.
   * You must also specify the ID of the VPC that contains the security groups.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The IDs of one or more security groups to apply to the target network.
   * You must also specify the ID of the VPC that contains the security groups.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
   * endpoint.
   * Default Value: `enabled`
   */
  public fun selfServicePortal(selfServicePortal: String) {
    cdkBuilder.selfServicePortal(selfServicePortal)
  }

  /**
   * @param serverCertificateArn The ARN of the server certificate. 
   * For more information, see the [AWS Certificate Manager User
   * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
   */
  public fun serverCertificateArn(serverCertificateArn: String) {
    cdkBuilder.serverCertificateArn(serverCertificateArn)
  }

  /**
   * @param sessionTimeoutHours The maximum VPN session duration time in hours.
   * Valid values: `8 | 10 | 12 | 24`
   *
   * Default value: `24`
   */
  public fun sessionTimeoutHours(sessionTimeoutHours: Number) {
    cdkBuilder.sessionTimeoutHours(sessionTimeoutHours)
  }

  /**
   * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   * By default, split-tunnel on a VPN endpoint is disabled.
   *
   * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
   * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
   * *AWS Client VPN Administrator Guide* .
   */
  public fun splitTunnel(splitTunnel: Boolean) {
    cdkBuilder.splitTunnel(splitTunnel)
  }

  /**
   * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   * By default, split-tunnel on a VPN endpoint is disabled.
   *
   * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
   * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
   * *AWS Client VPN Administrator Guide* .
   */
  public fun splitTunnel(splitTunnel: IResolvable) {
    cdkBuilder.splitTunnel(splitTunnel)
  }

  /**
   * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
   */
  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  /**
   * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
   */
  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  /**
   * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
   */
  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  /**
   * @param transportProtocol The transport protocol to be used by the VPN session.
   * Default value: `udp`
   */
  public fun transportProtocol(transportProtocol: String) {
    cdkBuilder.transportProtocol(transportProtocol)
  }

  /**
   * @param vpcId The ID of the VPC to associate with the Client VPN endpoint.
   * If no security group IDs are specified in the request, the default security group for the VPC
   * is applied.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  /**
   * @param vpnPort The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
   * Valid Values: `443` | `1194`
   *
   * Default Value: `443`
   */
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
