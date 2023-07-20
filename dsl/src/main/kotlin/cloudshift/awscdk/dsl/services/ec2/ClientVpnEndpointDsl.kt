@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ClientVpnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClientVpnEndpoint.Builder = ClientVpnEndpoint.Builder.create(scope, id)

    private val _dnsServers: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
        cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun clientCertificateArn(clientCertificateArn: String) {
        cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
        cdkBuilder.clientConnectionHandler(clientConnectionHandler)
    }

    public fun clientLoginBanner(clientLoginBanner: String) {
        cdkBuilder.clientLoginBanner(clientLoginBanner)
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

    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun logStream(logStream: ILogStream) {
        cdkBuilder.logStream(logStream)
    }

    public fun logging(logging: Boolean) {
        cdkBuilder.logging(logging)
    }

    public fun port(port: VpnPort) {
        cdkBuilder.port(port)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun selfServicePortal(selfServicePortal: Boolean) {
        cdkBuilder.selfServicePortal(selfServicePortal)
    }

    public fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    public fun splitTunnel(splitTunnel: Boolean) {
        cdkBuilder.splitTunnel(splitTunnel)
    }

    public fun transportProtocol(transportProtocol: TransportProtocol) {
        cdkBuilder.transportProtocol(transportProtocol)
    }

    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
        cdkBuilder.userBasedAuthentication(userBasedAuthentication)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ClientVpnEndpoint {
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
