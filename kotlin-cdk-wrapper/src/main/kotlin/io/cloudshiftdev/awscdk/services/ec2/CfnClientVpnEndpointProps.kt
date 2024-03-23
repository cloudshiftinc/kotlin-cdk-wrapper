@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnClientVpnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface CfnClientVpnEndpointProps {
  /**
   * Information about the authentication method to be used to authenticate clients.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
   */
  public fun authenticationOptions(): Any

  /**
   * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
   *
   * The address range cannot overlap with the local CIDR of the VPC in which the associated subnet
   * is located, or the routes that you add manually. The address range cannot be changed after the
   * Client VPN endpoint has been created. Client CIDR range must have a size of at least /22 and must
   * not be greater than /12.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock)
   */
  public fun clientCidrBlock(): String

  /**
   * The options for managing connection authorization for new client connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
   */
  public fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
   */
  public fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

  /**
   * Information about the client connection logging options.
   *
   * If you enable client connection logging, data about client connections is sent to a Cloudwatch
   * Logs log stream. The following information is logged:
   *
   * * Client connection requests
   * * Client connection results (successful and unsuccessful)
   * * Reasons for unsuccessful client connection requests
   * * Client connection termination time
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
   */
  public fun connectionLogOptions(): Any

  /**
   * A brief description of the Client VPN endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the DNS servers to be used for DNS resolution.
   *
   * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
   * address configured on the device is used for the DNS server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
   */
  public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  /**
   * The IDs of one or more security groups to apply to the target network.
   *
   * You must also specify the ID of the VPC that contains the security groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * Specify whether to enable the self-service portal for the Client VPN endpoint.
   *
   * Default Value: `enabled`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-selfserviceportal)
   */
  public fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

  /**
   * The ARN of the server certificate.
   *
   * For more information, see the [AWS Certificate Manager User
   * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn)
   */
  public fun serverCertificateArn(): String

  /**
   * The maximum VPN session duration time in hours.
   *
   * Valid values: `8 | 10 | 12 | 24`
   *
   * Default value: `24`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-sessiontimeouthours)
   */
  public fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

  /**
   * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   *
   * By default, split-tunnel on a VPN endpoint is disabled.
   *
   * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
   * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
   * *AWS Client VPN Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
   */
  public fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

  /**
   * The tags to apply to the Client VPN endpoint during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The transport protocol to be used by the VPN session.
   *
   * Default value: `udp`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol)
   */
  public fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

  /**
   * The ID of the VPC to associate with the Client VPN endpoint.
   *
   * If no security group IDs are specified in the request, the default security group for the VPC
   * is applied.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
   *
   * Valid Values: `443` | `1194`
   *
   * Default Value: `443`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpnport)
   */
  public fun vpnPort(): Number? = unwrap(this).getVpnPort()

  /**
   * A builder for [CfnClientVpnEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(authenticationOptions: IResolvable)

    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(authenticationOptions: List<Any>)

    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(vararg authenticationOptions: Any)

    /**
     * @param clientCidrBlock The IPv4 address range, in CIDR notation, from which to assign client
     * IP addresses. 
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually. The address range cannot be changed
     * after the Client VPN endpoint has been created. Client CIDR range must have a size of at least
     * /22 and must not be greater than /12.
     */
    public fun clientCidrBlock(clientCidrBlock: String)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    public fun clientConnectOptions(clientConnectOptions: IResolvable)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    public
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d0fca7d776051fa280ddab2a949b995f860c769751a4f5d33ed75647e9565ce")
    public
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder.() -> Unit)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5373575109d6d6b7cd31bcee2963202f5a5c9dfbf72acedfe8cd25024e9cd29")
    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder.() -> Unit)

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    public fun connectionLogOptions(connectionLogOptions: IResolvable)

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    public
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty)

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eee4b8563134d4e4c9e4571627bac2a00389cf339a7f80981f67e146bfb00a")
    public
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder.() -> Unit)

    /**
     * @param description A brief description of the Client VPN endpoint.
     */
    public fun description(description: String)

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network.
     * You must also specify the ID of the VPC that contains the security groups.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network.
     * You must also specify the ID of the VPC that contains the security groups.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint.
     * Default Value: `enabled`
     */
    public fun selfServicePortal(selfServicePortal: String)

    /**
     * @param serverCertificateArn The ARN of the server certificate. 
     * For more information, see the [AWS Certificate Manager User
     * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     */
    public fun serverCertificateArn(serverCertificateArn: String)

    /**
     * @param sessionTimeoutHours The maximum VPN session duration time in hours.
     * Valid values: `8 | 10 | 12 | 24`
     *
     * Default value: `24`
     */
    public fun sessionTimeoutHours(sessionTimeoutHours: Number)

    /**
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     */
    public fun splitTunnel(splitTunnel: Boolean)

    /**
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     */
    public fun splitTunnel(splitTunnel: IResolvable)

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param transportProtocol The transport protocol to be used by the VPN session.
     * Default value: `udp`
     */
    public fun transportProtocol(transportProtocol: String)

    /**
     * @param vpcId The ID of the VPC to associate with the Client VPN endpoint.
     * If no security group IDs are specified in the request, the default security group for the VPC
     * is applied.
     */
    public fun vpcId(vpcId: String)

    /**
     * @param vpnPort The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * Valid Values: `443` | `1194`
     *
     * Default Value: `443`
     */
    public fun vpnPort(vpnPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps.builder()

    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(authenticationOptions: IResolvable) {
      cdkBuilder.authenticationOptions(authenticationOptions.let(IResolvable::unwrap))
    }

    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(authenticationOptions: List<Any>) {
      cdkBuilder.authenticationOptions(authenticationOptions)
    }

    /**
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(vararg authenticationOptions: Any): Unit =
        authenticationOptions(authenticationOptions.toList())

    /**
     * @param clientCidrBlock The IPv4 address range, in CIDR notation, from which to assign client
     * IP addresses. 
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually. The address range cannot be changed
     * after the Client VPN endpoint has been created. Client CIDR range must have a size of at least
     * /22 and must not be greater than /12.
     */
    override fun clientCidrBlock(clientCidrBlock: String) {
      cdkBuilder.clientCidrBlock(clientCidrBlock)
    }

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    override fun clientConnectOptions(clientConnectOptions: IResolvable) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(IResolvable::unwrap))
    }

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    override
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(CfnClientVpnEndpoint.ClientConnectOptionsProperty::unwrap))
    }

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d0fca7d776051fa280ddab2a949b995f860c769751a4f5d33ed75647e9565ce")
    override
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder.() -> Unit):
        Unit =
        clientConnectOptions(CfnClientVpnEndpoint.ClientConnectOptionsProperty(clientConnectOptions))

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    override fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(IResolvable::unwrap))
    }

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty::unwrap))
    }

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5373575109d6d6b7cd31bcee2963202f5a5c9dfbf72acedfe8cd25024e9cd29")
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder.() -> Unit):
        Unit =
        clientLoginBannerOptions(CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty(clientLoginBannerOptions))

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    override fun connectionLogOptions(connectionLogOptions: IResolvable) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(IResolvable::unwrap))
    }

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    override
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(CfnClientVpnEndpoint.ConnectionLogOptionsProperty::unwrap))
    }

    /**
     * @param connectionLogOptions Information about the client connection logging options. 
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eee4b8563134d4e4c9e4571627bac2a00389cf339a7f80981f67e146bfb00a")
    override
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder.() -> Unit):
        Unit =
        connectionLogOptions(CfnClientVpnEndpoint.ConnectionLogOptionsProperty(connectionLogOptions))

    /**
     * @param description A brief description of the Client VPN endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network.
     * You must also specify the ID of the VPC that contains the security groups.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network.
     * You must also specify the ID of the VPC that contains the security groups.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint.
     * Default Value: `enabled`
     */
    override fun selfServicePortal(selfServicePortal: String) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    /**
     * @param serverCertificateArn The ARN of the server certificate. 
     * For more information, see the [AWS Certificate Manager User
     * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     */
    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /**
     * @param sessionTimeoutHours The maximum VPN session duration time in hours.
     * Valid values: `8 | 10 | 12 | 24`
     *
     * Default value: `24`
     */
    override fun sessionTimeoutHours(sessionTimeoutHours: Number) {
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
    override fun splitTunnel(splitTunnel: Boolean) {
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
    override fun splitTunnel(splitTunnel: IResolvable) {
      cdkBuilder.splitTunnel(splitTunnel.let(IResolvable::unwrap))
    }

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation.
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param transportProtocol The transport protocol to be used by the VPN session.
     * Default value: `udp`
     */
    override fun transportProtocol(transportProtocol: String) {
      cdkBuilder.transportProtocol(transportProtocol)
    }

    /**
     * @param vpcId The ID of the VPC to associate with the Client VPN endpoint.
     * If no security group IDs are specified in the request, the default security group for the VPC
     * is applied.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnPort The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * Valid Values: `443` | `1194`
     *
     * Default Value: `443`
     */
    override fun vpnPort(vpnPort: Number) {
      cdkBuilder.vpnPort(vpnPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps,
  ) : CdkObject(cdkObject), CfnClientVpnEndpointProps {
    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     */
    override fun authenticationOptions(): Any = unwrap(this).getAuthenticationOptions()

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually. The address range cannot be changed
     * after the Client VPN endpoint has been created. Client CIDR range must have a size of at least
     * /22 and must not be greater than /12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock)
     */
    override fun clientCidrBlock(): String = unwrap(this).getClientCidrBlock()

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     */
    override fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     */
    override fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     */
    override fun connectionLogOptions(): Any = unwrap(this).getConnectionLogOptions()

    /**
     * A brief description of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
     */
    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    /**
     * The IDs of one or more security groups to apply to the target network.
     *
     * You must also specify the ID of the VPC that contains the security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default Value: `enabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-selfserviceportal)
     */
    override fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

    /**
     * The ARN of the server certificate.
     *
     * For more information, see the [AWS Certificate Manager User
     * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn)
     */
    override fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

    /**
     * The maximum VPN session duration time in hours.
     *
     * Valid values: `8 | 10 | 12 | 24`
     *
     * Default value: `24`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-sessiontimeouthours)
     */
    override fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
     */
    override fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default value: `udp`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol)
     */
    override fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

    /**
     * The ID of the VPC to associate with the Client VPN endpoint.
     *
     * If no security group IDs are specified in the request, the default security group for the VPC
     * is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Valid Values: `443` | `1194`
     *
     * Default Value: `443`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpnport)
     */
    override fun vpnPort(): Number? = unwrap(this).getVpnPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps):
        CfnClientVpnEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClientVpnEndpointProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnEndpointProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
  }
}
