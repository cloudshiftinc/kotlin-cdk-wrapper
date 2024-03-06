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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.DefaultInstanceTenancy
import software.amazon.awscdk.services.ec2.FlowLogOptions
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
import software.amazon.awscdk.services.ec2.IIpAddresses
import software.amazon.awscdk.services.ec2.IIpv6Addresses
import software.amazon.awscdk.services.ec2.IpProtocol
import software.amazon.awscdk.services.ec2.NatProvider
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpnConnectionOptions
import software.constructs.Construct

/**
 * Define an AWS Virtual Private Cloud.
 *
 * See the package-level documentation of this package for an overview of the various dimensions in
 * which you can configure your VPC.
 *
 * For example:
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "TheVPC")
 * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
 * .build();
 * // Iterate the private subnets
 * SelectedSubnets selection = vpc.selectSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build());
 * for (Object subnet : selection.getSubnets()) {
 * }
 * ```
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ec2.*;
 * Vpc vpc = Vpc.Builder.create(this, "Vpc")
 * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
 * .build();
 * VpcConnector vpcConnector = VpcConnector.Builder.create(this, "VpcConnector")
 * .vpc(vpc)
 * .vpcSubnets(vpc.selectSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build()))
 * .vpcConnectorName("MyVpcConnector")
 * .build();
 * Service.Builder.create(this, "Service")
 * .source(Source.fromEcrPublic(EcrPublicProps.builder()
 * .imageConfiguration(ImageConfiguration.builder().port(8000).build())
 * .imageIdentifier("public.ecr.aws/aws-containers/hello-app-runner:latest")
 * .build()))
 * .vpcConnector(vpcConnector)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Vpc.Builder = Vpc.Builder.create(scope, id)

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _subnetConfiguration: MutableList<SubnetConfiguration> = mutableListOf()

    private val _vpnRoutePropagation: MutableList<SubnetSelection> = mutableListOf()

    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * (deprecated) The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     *
     * Should be a minimum of /28 and maximum size of /16. The range will be split across all
     * subnets per Availability Zone.
     *
     * Default: Vpc.DEFAULT_CIDR_RANGE
     *
     * @param cidr The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     * @deprecated Use ipAddresses instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * If set to false then disable the creation of the default internet gateway.
     *
     * Default: true
     *
     * @param createInternetGateway If set to false then disable the creation of the default
     *   internet gateway.
     */
    public fun createInternetGateway(createInternetGateway: Boolean) {
        cdkBuilder.createInternetGateway(createInternetGateway)
    }

    /**
     * The default tenancy of instances launched into the VPC.
     *
     * By setting this to dedicated tenancy, instances will be launched on hardware dedicated to a
     * single AWS customer, unless specifically specified at instance launch time. Please note, not
     * all instance types are usable with Dedicated tenancy.
     *
     * Default: DefaultInstanceTenancy.Default (shared) tenancy
     *
     * @param defaultInstanceTenancy The default tenancy of instances launched into the VPC.
     */
    public fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy) {
        cdkBuilder.defaultInstanceTenancy(defaultInstanceTenancy)
    }

    /**
     * Indicates whether the instances launched in the VPC get public DNS hostnames.
     *
     * If this attribute is true, instances in the VPC get public DNS hostnames, but only if the
     * enableDnsSupport attribute is also set to true.
     *
     * Default: true
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get public DNS
     *   hostnames.
     */
    public fun enableDnsHostnames(enableDnsHostnames: Boolean) {
        cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    /**
     * Indicates whether the DNS resolution is supported for the VPC.
     *
     * If this attribute is false, the Amazon-provided DNS server in the VPC that resolves public
     * DNS hostnames to IP addresses is not enabled. If this attribute is true, queries to the
     * Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at
     * the base of the VPC IPv4 network range plus two will succeed.
     *
     * Default: true
     *
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     */
    public fun enableDnsSupport(enableDnsSupport: Boolean) {
        cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    /**
     * Flow logs to add to this VPC.
     *
     * Default: - No flow logs.
     *
     * @param flowLogs Flow logs to add to this VPC.
     */
    public fun flowLogs(flowLogs: Map<String, FlowLogOptions>) {
        cdkBuilder.flowLogs(flowLogs)
    }

    /**
     * Gateway endpoints to add to this VPC.
     *
     * Default: - None.
     *
     * @param gatewayEndpoints Gateway endpoints to add to this VPC.
     */
    public fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>) {
        cdkBuilder.gatewayEndpoints(gatewayEndpoints)
    }

    /**
     * The Provider to use to allocate IPv4 Space to your VPC.
     *
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: ec2.IpAddresses.cidr
     *
     * @param ipAddresses The Provider to use to allocate IPv4 Space to your VPC.
     */
    public fun ipAddresses(ipAddresses: IIpAddresses) {
        cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * The protocol of the vpc.
     *
     * Options are IPv4 only or dual stack.
     *
     * Default: IpProtocol.IPV4_ONLY
     *
     * @param ipProtocol The protocol of the vpc.
     */
    public fun ipProtocol(ipProtocol: IpProtocol) {
        cdkBuilder.ipProtocol(ipProtocol)
    }

    /**
     * The Provider to use to allocate IPv6 Space to your VPC.
     *
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     *
     * Default: Ipv6Addresses.amazonProvided
     *
     * @param ipv6Addresses The Provider to use to allocate IPv6 Space to your VPC.
     */
    public fun ipv6Addresses(ipv6Addresses: IIpv6Addresses) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * Define the maximum number of AZs to use in this region.
     *
     * If the region has more AZs than you want to use (for example, because of EIP limits), pick a
     * lower number here. The AZs will be sorted and picked from the start of the list.
     *
     * If you pick a higher number than the number of AZs in the region, all AZs in the region will
     * be selected. To use "all AZs" available to your account, use a high number (such as 99).
     *
     * Be aware that environment-agnostic stacks will be created with access to only 2 AZs, so to
     * use more than 2 AZs, be sure to specify the account and region on your stack.
     *
     * Specify this option only if you do not specify `availabilityZones`.
     *
     * Default: 3
     *
     * @param maxAzs Define the maximum number of AZs to use in this region.
     */
    public fun maxAzs(maxAzs: Number) {
        cdkBuilder.maxAzs(maxAzs)
    }

    /**
     * What type of NAT provider to use.
     *
     * Select between NAT gateways or NAT instances. NAT gateways may not be available in all AWS
     * regions.
     *
     * Default: NatProvider.gateway()
     *
     * @param natGatewayProvider What type of NAT provider to use.
     */
    public fun natGatewayProvider(natGatewayProvider: NatProvider) {
        cdkBuilder.natGatewayProvider(natGatewayProvider)
    }

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name; the picked subnets
     * must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     */
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(natGatewaySubnets)
        cdkBuilder.natGatewaySubnets(builder.build())
    }

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name; the picked subnets
     * must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     */
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection) {
        cdkBuilder.natGatewaySubnets(natGatewaySubnets)
    }

    /**
     * The number of NAT Gateways/Instances to create.
     *
     * The type of NAT gateway or instance will be determined by the `natGatewayProvider` parameter.
     *
     * You can set this number lower than the number of Availability Zones in your VPC in order to
     * save on NAT cost. Be aware you may be charged for cross-AZ data traffic instead.
     *
     * Default: - One NAT gateway/instance per Availability Zone
     *
     * @param natGateways The number of NAT Gateways/Instances to create.
     */
    public fun natGateways(natGateways: Number) {
        cdkBuilder.natGateways(natGateways)
    }

    /**
     * Define the number of AZs to reserve.
     *
     * When specified, the IP space is reserved for the azs but no actual resources are provisioned.
     *
     * Default: 0
     *
     * @param reservedAzs Define the number of AZs to reserve.
     */
    public fun reservedAzs(reservedAzs: Number) {
        cdkBuilder.reservedAzs(reservedAzs)
    }

    /**
     * If set to true then the default inbound &amp; outbound rules will be removed from the default
     * security group.
     *
     * Default: true if '@aws-cdk/aws-ec2:restrictDefaultSecurityGroup' is enabled, false otherwise
     *
     * @param restrictDefaultSecurityGroup If set to true then the default inbound &amp; outbound
     *   rules will be removed from the default security group.
     */
    public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean) {
        cdkBuilder.restrictDefaultSecurityGroup(restrictDefaultSecurityGroup)
    }

    /**
     * Configure the subnets to build for each AZ.
     *
     * Each entry in this list configures a Subnet Group; each group will contain a subnet for each
     * Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated subnet in each AZ
     * provide the following:
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     *
     * Default: - The VPC CIDR will be evenly divided between 1 public and 1 private subnet per AZ.
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     */
    public fun subnetConfiguration(subnetConfiguration: SubnetConfigurationDsl.() -> Unit) {
        _subnetConfiguration.add(SubnetConfigurationDsl().apply(subnetConfiguration).build())
    }

    /**
     * Configure the subnets to build for each AZ.
     *
     * Each entry in this list configures a Subnet Group; each group will contain a subnet for each
     * Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated subnet in each AZ
     * provide the following:
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     *
     * Default: - The VPC CIDR will be evenly divided between 1 public and 1 private subnet per AZ.
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     */
    public fun subnetConfiguration(subnetConfiguration: Collection<SubnetConfiguration>) {
        _subnetConfiguration.addAll(subnetConfiguration)
    }

    /**
     * The VPC name.
     *
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     *
     * Default: this.node.path
     *
     * @param vpcName The VPC name.
     */
    public fun vpcName(vpcName: String) {
        cdkBuilder.vpcName(vpcName)
    }

    /**
     * VPN connections to this VPC.
     *
     * Default: - No connections.
     *
     * @param vpnConnections VPN connections to this VPC.
     */
    public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>) {
        cdkBuilder.vpnConnections(vpnConnections)
    }

    /**
     * Indicates whether a VPN gateway should be created and attached to this VPC.
     *
     * Default: - true when vpnGatewayAsn or vpnConnections is specified
     *
     * @param vpnGateway Indicates whether a VPN gateway should be created and attached to this VPC.
     */
    public fun vpnGateway(vpnGateway: Boolean) {
        cdkBuilder.vpnGateway(vpnGateway)
    }

    /**
     * The private Autonomous System Number (ASN) for the VPN gateway.
     *
     * Default: - Amazon default ASN.
     *
     * @param vpnGatewayAsn The private Autonomous System Number (ASN) for the VPN gateway.
     */
    public fun vpnGatewayAsn(vpnGatewayAsn: Number) {
        cdkBuilder.vpnGatewayAsn(vpnGatewayAsn)
    }

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no private subnets exists,
     * isolated subnets are used. If no isolated subnets exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    public fun vpnRoutePropagation(vpnRoutePropagation: SubnetSelectionDsl.() -> Unit) {
        _vpnRoutePropagation.add(SubnetSelectionDsl().apply(vpnRoutePropagation).build())
    }

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no private subnets exists,
     * isolated subnets are used. If no isolated subnets exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    public fun vpnRoutePropagation(vpnRoutePropagation: Collection<SubnetSelection>) {
        _vpnRoutePropagation.addAll(vpnRoutePropagation)
    }

    public fun build(): Vpc {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_subnetConfiguration.isNotEmpty()) cdkBuilder.subnetConfiguration(_subnetConfiguration)
        if (_vpnRoutePropagation.isNotEmpty()) cdkBuilder.vpnRoutePropagation(_vpnRoutePropagation)
        return cdkBuilder.build()
    }
}
