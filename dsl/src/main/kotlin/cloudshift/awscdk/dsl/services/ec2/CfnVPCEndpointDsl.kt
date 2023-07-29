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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.constructs.Construct

/**
 * Specifies a VPC endpoint.
 *
 * A VPC endpoint provides a private connection between your VPC and an endpoint service. You can
 * use an endpoint service provided by AWS , an AWS Marketplace Partner, or another AWS accounts in
 * your organization. For more information, see the
 * [AWS PrivateLink User Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
 *
 * An endpoint of type `Interface` establishes connections between the subnets in your VPC and an
 * AWS service , your own service, or a service hosted by another AWS account . With an interface
 * VPC endpoint, you specify the subnets in which to create the endpoint and the security groups to
 * associate with the endpoint network interfaces.
 *
 * An endpoint of type `gateway` serves as a target for a route in your route table for traffic
 * destined for Amazon S3 or DynamoDB . You can specify an endpoint policy for the endpoint, which
 * controls access to the service from your VPC. You can also specify the VPC route tables that use
 * the endpoint. For more information about connectivity to Amazon S3 , see
 * [Why can't I connect to an S3 bucket using a gateway VPC endpoint?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/connect-s3-vpc-endpoint)
 *
 * An endpoint of type `GatewayLoadBalancer` provides private connectivity between your VPC and
 * virtual appliances from a service provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object policyDocument;
 * CfnVPCEndpoint cfnVPCEndpoint = CfnVPCEndpoint.Builder.create(this, "MyCfnVPCEndpoint")
 * .serviceName("serviceName")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .policyDocument(policyDocument)
 * .privateDnsEnabled(false)
 * .routeTableIds(List.of("routeTableIds"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcEndpointType("vpcEndpointType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
 */
@CdkDslMarker
public class CfnVPCEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCEndpoint.Builder = CfnVPCEndpoint.Builder.create(scope, id)

    private val _routeTableIds: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. AWS
     * CloudFormation converts YAML policies to JSON format before calling the API to create or
     * modify the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     *
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. AWS
     * CloudFormation converts YAML policies to JSON format before calling the API to create or
     * modify the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     *
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This enables you to make
     * requests to the default public DNS name for the service instead of the public DNS names that
     * are automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     *
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     *   specified VPC.
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This enables you to make
     * requests to the default public DNS name for the service instead of the public DNS names that
     * are automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     *
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     *   specified VPC.
     */
    public fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     *
     * @param routeTableIds The IDs of the route tables.
     */
    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     *
     * @param routeTableIds The IDs of the route tables.
     */
    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     *
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     *   interfaces.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     *
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     *   interfaces.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     *
     * @param serviceName The name of the endpoint service.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     *
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     *
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     *
     * @param vpcEndpointType The type of endpoint.
     */
    public fun vpcEndpointType(vpcEndpointType: String) {
        cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     *
     * @param vpcId The ID of the VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCEndpoint {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
