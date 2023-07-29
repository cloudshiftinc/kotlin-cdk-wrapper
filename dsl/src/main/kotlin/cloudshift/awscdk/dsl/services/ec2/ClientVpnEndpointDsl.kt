@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout
import software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication
import software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.TransportProtocol
import software.amazon.awscdk.services.ec2.VpnPort
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogStream
import software.constructs.Construct

/**
 * A client VPN connnection.
 *
 * Example:
 * ```
 * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
 * ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
 * .authorizeAllUsersToVpcCidr(false)
 * .build());
 * endpoint.addAuthorizationRule("Rule", ClientVpnAuthorizationRuleOptions.builder()
 * .cidr("10.0.10.0/32")
 * .groupId("group-id")
 * .build());
 * ```
 */
@CdkDslMarker
public class ClientVpnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClientVpnEndpoint.Builder = ClientVpnEndpoint.Builder.create(scope, id)

    private val _dnsServers: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * Whether to authorize all users to the VPC CIDR.
     *
     * This automatically creates an authorization rule. Set this to `false` and use
     * `addAuthorizationRule()` to create your own rules instead.
     *
     * Default: true
     *
     * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR.
     */
    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
        cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     *
     * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP
     *   addresses.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * The ARN of the client certificate for mutual authentication.
     *
     * The certificate must be signed by a certificate authority (CA) and it must be provisioned in
     * AWS Certificate Manager (ACM).
     *
     * Default: - use user-based authentication
     *
     * @param clientCertificateArn The ARN of the client certificate for mutual authentication.
     */
    public fun clientCertificateArn(clientCertificateArn: String) {
        cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    /**
     * The AWS Lambda function used for connection authorization.
     *
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     *
     * Default: - no connection handler
     *
     * @param clientConnectionHandler The AWS Lambda function used for connection authorization.
     */
    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
        cdkBuilder.clientConnectionHandler(clientConnectionHandler)
    }

    /**
     * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
     * session is established.
     *
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     *
     * Default: - no banner is presented to the client
     *
     * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
     *   clients when a VPN session is established.
     */
    public fun clientLoginBanner(clientLoginBanner: String) {
        cdkBuilder.clientLoginBanner(clientLoginBanner)
    }

    /**
     * A brief description of the Client VPN endpoint.
     *
     * Default: - no description
     *
     * @param description A brief description of the Client VPN endpoint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     */
    public fun dnsServers(vararg dnsServers: String) {
        _dnsServers.addAll(listOf(*dnsServers))
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution.
     */
    public fun dnsServers(dnsServers: Collection<String>) {
        _dnsServers.addAll(dnsServers)
    }

    /**
     * A CloudWatch Logs log group for connection logging.
     *
     * Default: - a new group is created
     *
     * @param logGroup A CloudWatch Logs log group for connection logging.
     */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /**
     * A CloudWatch Logs log stream for connection logging.
     *
     * Default: - a new stream is created
     *
     * @param logStream A CloudWatch Logs log stream for connection logging.
     */
    public fun logStream(logStream: ILogStream) {
        cdkBuilder.logStream(logStream)
    }

    /**
     * Whether to enable connections logging.
     *
     * Default: true
     *
     * @param logging Whether to enable connections logging.
     */
    public fun logging(logging: Boolean) {
        cdkBuilder.logging(logging)
    }

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Default: VpnPort.HTTPS
     *
     * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     */
    public fun port(port: VpnPort) {
        cdkBuilder.port(port)
    }

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default: true
     *
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     *   endpoint.
     */
    public fun selfServicePortal(selfServicePortal: Boolean) {
        cdkBuilder.selfServicePortal(selfServicePortal)
    }

    /**
     * The ARN of the server certificate.
     *
     * @param serverCertificateArn The ARN of the server certificate.
     */
    public fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /**
     * The maximum VPN session duration time.
     *
     * Default: ClientVpnSessionTimeout.TWENTY_FOUR_HOURS
     *
     * @param sessionTimeout The maximum VPN session duration time.
     */
    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html)
     *
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     */
    public fun splitTunnel(splitTunnel: Boolean) {
        cdkBuilder.splitTunnel(splitTunnel)
    }

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default: TransportProtocol.UDP
     *
     * @param transportProtocol The transport protocol to be used by the VPN session.
     */
    public fun transportProtocol(transportProtocol: TransportProtocol) {
        cdkBuilder.transportProtocol(transportProtocol)
    }

    /**
     * The type of user-based authentication to use.
     *
     * Default: - use mutual authentication
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html)
     *
     * @param userBasedAuthentication The type of user-based authentication to use.
     */
    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
        cdkBuilder.userBasedAuthentication(userBasedAuthentication)
    }

    /**
     * The VPC to connect to.
     *
     * @param vpc The VPC to connect to.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ClientVpnEndpoint {
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
