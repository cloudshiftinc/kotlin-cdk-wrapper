@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.ILogStream
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a client VPN endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * IClientVpnConnectionHandler clientVpnConnectionHandler;
 * ClientVpnUserBasedAuthentication clientVpnUserBasedAuthentication;
 * LogGroup logGroup;
 * LogStream logStream;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * ClientVpnEndpointProps clientVpnEndpointProps = ClientVpnEndpointProps.builder()
 * .cidr("cidr")
 * .serverCertificateArn("serverCertificateArn")
 * .vpc(vpc)
 * // the properties below are optional
 * .authorizeAllUsersToVpcCidr(false)
 * .clientCertificateArn("clientCertificateArn")
 * .clientConnectionHandler(clientVpnConnectionHandler)
 * .clientLoginBanner("clientLoginBanner")
 * .description("description")
 * .dnsServers(List.of("dnsServers"))
 * .logging(false)
 * .logGroup(logGroup)
 * .logStream(logStream)
 * .port(VpnPort.HTTPS)
 * .securityGroups(List.of(securityGroup))
 * .selfServicePortal(false)
 * .sessionTimeout(ClientVpnSessionTimeout.EIGHT_HOURS)
 * .splitTunnel(false)
 * .transportProtocol(TransportProtocol.TCP)
 * .userBasedAuthentication(clientVpnUserBasedAuthentication)
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
public interface ClientVpnEndpointProps : ClientVpnEndpointOptions {
  /**
   * The VPC to connect to.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [ClientVpnEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR.
     * This automatically creates an authorization rule. Set this to `false` and
     * use `addAuthorizationRule()` to create your own rules instead.
     */
    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean)

    /**
     * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. 
     * The address range cannot overlap with the local CIDR of the VPC
     * in which the associated subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     */
    public fun cidr(cidr: String)

    /**
     * @param clientCertificateArn The ARN of the client certificate for mutual authentication.
     * The certificate must be signed by a certificate authority (CA) and it must
     * be provisioned in AWS Certificate Manager (ACM).
     */
    public fun clientCertificateArn(clientCertificateArn: String)

    /**
     * @param clientConnectionHandler The AWS Lambda function used for connection authorization.
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     */
    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler)

    /**
     * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
     * clients when a VPN session is established.
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     */
    public fun clientLoginBanner(clientLoginBanner: String)

    /**
     * @param description A brief description of the Client VPN endpoint.
     */
    public fun description(description: String)

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers.
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers.
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * @param logGroup A CloudWatch Logs log group for connection logging.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logStream A CloudWatch Logs log stream for connection logging.
     */
    public fun logStream(logStream: ILogStream)

    /**
     * @param logging Whether to enable connections logging.
     */
    public fun logging(logging: Boolean)

    /**
     * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     */
    public fun port(port: VpnPort)

    /**
     * @param securityGroups The security groups to apply to the target network.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups to apply to the target network.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint.
     */
    public fun selfServicePortal(selfServicePortal: Boolean)

    /**
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    public fun serverCertificateArn(serverCertificateArn: String)

    /**
     * @param sessionTimeout The maximum VPN session duration time.
     */
    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout)

    /**
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     */
    public fun splitTunnel(splitTunnel: Boolean)

    /**
     * @param transportProtocol The transport protocol to be used by the VPN session.
     */
    public fun transportProtocol(transportProtocol: TransportProtocol)

    /**
     * @param userBasedAuthentication The type of user-based authentication to use.
     */
    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication)

    /**
     * @param vpc The VPC to connect to. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef45475be8f79d0ff6eafc0601b8d3dc671e74f2563b3086b9eddc4e17644cbf")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnEndpointProps.builder()

    /**
     * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR.
     * This automatically creates an authorization rule. Set this to `false` and
     * use `addAuthorizationRule()` to create your own rules instead.
     */
    override fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
      cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    /**
     * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. 
     * The address range cannot overlap with the local CIDR of the VPC
     * in which the associated subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param clientCertificateArn The ARN of the client certificate for mutual authentication.
     * The certificate must be signed by a certificate authority (CA) and it must
     * be provisioned in AWS Certificate Manager (ACM).
     */
    override fun clientCertificateArn(clientCertificateArn: String) {
      cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    /**
     * @param clientConnectionHandler The AWS Lambda function used for connection authorization.
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     */
    override fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
      cdkBuilder.clientConnectionHandler(clientConnectionHandler.let(IClientVpnConnectionHandler::unwrap))
    }

    /**
     * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
     * clients when a VPN session is established.
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     */
    override fun clientLoginBanner(clientLoginBanner: String) {
      cdkBuilder.clientLoginBanner(clientLoginBanner)
    }

    /**
     * @param description A brief description of the Client VPN endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers.
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     * A Client VPN endpoint can have up to two DNS servers.
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * @param logGroup A CloudWatch Logs log group for connection logging.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logStream A CloudWatch Logs log stream for connection logging.
     */
    override fun logStream(logStream: ILogStream) {
      cdkBuilder.logStream(logStream.let(ILogStream::unwrap))
    }

    /**
     * @param logging Whether to enable connections logging.
     */
    override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    /**
     * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     */
    override fun port(port: VpnPort) {
      cdkBuilder.port(port.let(VpnPort::unwrap))
    }

    /**
     * @param securityGroups The security groups to apply to the target network.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups to apply to the target network.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint.
     */
    override fun selfServicePortal(selfServicePortal: Boolean) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    /**
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /**
     * @param sessionTimeout The maximum VPN session duration time.
     */
    override fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(ClientVpnSessionTimeout::unwrap))
    }

    /**
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     */
    override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    /**
     * @param transportProtocol The transport protocol to be used by the VPN session.
     */
    override fun transportProtocol(transportProtocol: TransportProtocol) {
      cdkBuilder.transportProtocol(transportProtocol.let(TransportProtocol::unwrap))
    }

    /**
     * @param userBasedAuthentication The type of user-based authentication to use.
     */
    override
        fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
      cdkBuilder.userBasedAuthentication(userBasedAuthentication.let(ClientVpnUserBasedAuthentication::unwrap))
    }

    /**
     * @param vpc The VPC to connect to. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef45475be8f79d0ff6eafc0601b8d3dc671e74f2563b3086b9eddc4e17644cbf")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps,
  ) : CdkObject(cdkObject), ClientVpnEndpointProps {
    /**
     * Whether to authorize all users to the VPC CIDR.
     *
     * This automatically creates an authorization rule. Set this to `false` and
     * use `addAuthorizationRule()` to create your own rules instead.
     *
     * Default: true
     */
    override fun authorizeAllUsersToVpcCidr(): Boolean? =
        unwrap(this).getAuthorizeAllUsersToVpcCidr()

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC
     * in which the associated subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     */
    override fun cidr(): String = unwrap(this).getCidr()

    /**
     * The ARN of the client certificate for mutual authentication.
     *
     * The certificate must be signed by a certificate authority (CA) and it must
     * be provisioned in AWS Certificate Manager (ACM).
     *
     * Default: - use user-based authentication
     */
    override fun clientCertificateArn(): String? = unwrap(this).getClientCertificateArn()

    /**
     * The AWS Lambda function used for connection authorization.
     *
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     *
     * Default: - no connection handler
     */
    override fun clientConnectionHandler(): IClientVpnConnectionHandler? =
        unwrap(this).getClientConnectionHandler()?.let(IClientVpnConnectionHandler::wrap)

    /**
     * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
     * session is established.
     *
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     *
     * Default: - no banner is presented to the client
     */
    override fun clientLoginBanner(): String? = unwrap(this).getClientLoginBanner()

    /**
     * A brief description of the Client VPN endpoint.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     */
    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    /**
     * A CloudWatch Logs log group for connection logging.
     *
     * Default: - a new group is created
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * A CloudWatch Logs log stream for connection logging.
     *
     * Default: - a new stream is created
     */
    override fun logStream(): ILogStream? = unwrap(this).getLogStream()?.let(ILogStream::wrap)

    /**
     * Whether to enable connections logging.
     *
     * Default: true
     */
    override fun logging(): Boolean? = unwrap(this).getLogging()

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Default: VpnPort.HTTPS
     */
    override fun port(): VpnPort? = unwrap(this).getPort()?.let(VpnPort::wrap)

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default: true
     */
    override fun selfServicePortal(): Boolean? = unwrap(this).getSelfServicePortal()

    /**
     * The ARN of the server certificate.
     */
    override fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

    /**
     * The maximum VPN session duration time.
     *
     * Default: ClientVpnSessionTimeout.TWENTY_FOUR_HOURS
     */
    override fun sessionTimeout(): ClientVpnSessionTimeout? =
        unwrap(this).getSessionTimeout()?.let(ClientVpnSessionTimeout::wrap)

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html)
     */
    override fun splitTunnel(): Boolean? = unwrap(this).getSplitTunnel()

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default: TransportProtocol.UDP
     */
    override fun transportProtocol(): TransportProtocol? =
        unwrap(this).getTransportProtocol()?.let(TransportProtocol::wrap)

    /**
     * The type of user-based authentication to use.
     *
     * Default: - use mutual authentication
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html)
     */
    override fun userBasedAuthentication(): ClientVpnUserBasedAuthentication? =
        unwrap(this).getUserBasedAuthentication()?.let(ClientVpnUserBasedAuthentication::wrap)

    /**
     * The VPC to connect to.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps):
        ClientVpnEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? ClientVpnEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpointProps):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointProps
  }
}
