@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPCEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object policyDocument;
 * CfnVPCEndpointProps cfnVPCEndpointProps = CfnVPCEndpointProps.builder()
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
public interface CfnVPCEndpointProps {
  /**
   * An endpoint policy, which controls access to the service from the VPC.
   *
   * The default endpoint policy allows full access to the service. Endpoint policies are supported
   * only for gateway and interface endpoints.
   *
   * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
   * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
   * template, and AWS CloudFormation converts the policy to JSON format before calling the API actions
   * for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as shown in
   * the following `Properties` section:
   *
   * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub 'com.amazonaws.${AWS::Region}.logs'
   * PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{ "Effect":"Allow", "Principal":"*",
   * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }] }'`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
   */
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   *
   * The private hosted zone contains a record set for the default public DNS name for the service
   * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private IP
   * addresses of the endpoint network interfaces in the VPC. This enables you to make requests to the
   * default public DNS name for the service instead of the public DNS names that are automatically
   * generated by the VPC endpoint service.
   *
   * To use a private hosted zone, you must set the following VPC attributes to `true` :
   * `enableDnsHostnames` and `enableDnsSupport` .
   *
   * This property is supported only for interface endpoints.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
   */
  public fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

  /**
   * The IDs of the route tables.
   *
   * Routing is supported only for gateway endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
   */
  public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   *
   * If this parameter is not specified, we use the default security group for the VPC. Security
   * groups are supported only for interface endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The name of the endpoint service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
   */
  public fun serviceName(): String

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   *
   * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
   * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint, you
   * can specify only one subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The type of endpoint.
   *
   * Default: Gateway
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
   */
  public fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVPCEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC.
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
     * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
     * template, and AWS CloudFormation converts the policy to JSON format before calling the API
     * actions for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as
     * shown in the following `Properties` section:
     *
     * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub
     * 'com.amazonaws.${AWS::Region}.logs' PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{
     * "Effect":"Allow", "Principal":"*",
     * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }]
     * }'`
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC.
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    /**
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC.
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     */
    public fun privateDnsEnabled(privateDnsEnabled: IResolvable)

    /**
     * @param routeTableIds The IDs of the route tables.
     * Routing is supported only for gateway endpoints.
     */
    public fun routeTableIds(routeTableIds: List<String>)

    /**
     * @param routeTableIds The IDs of the route tables.
     * Routing is supported only for gateway endpoints.
     */
    public fun routeTableIds(vararg routeTableIds: String)

    /**
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces.
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces.
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param serviceName The name of the endpoint service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param vpcEndpointType The type of endpoint.
     * Default: Gateway
     */
    public fun vpcEndpointType(vpcEndpointType: String)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.builder()

    /**
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC.
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
     * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
     * template, and AWS CloudFormation converts the policy to JSON format before calling the API
     * actions for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as
     * shown in the following `Properties` section:
     *
     * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub
     * 'com.amazonaws.${AWS::Region}.logs' PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{
     * "Effect":"Allow", "Principal":"*",
     * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }]
     * }'`
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC.
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     */
    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC.
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     */
    override fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routeTableIds The IDs of the route tables.
     * Routing is supported only for gateway endpoints.
     */
    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    /**
     * @param routeTableIds The IDs of the route tables.
     * Routing is supported only for gateway endpoints.
     */
    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    /**
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces.
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces.
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param serviceName The name of the endpoint service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces.
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param vpcEndpointType The type of endpoint.
     * Default: Gateway
     */
    override fun vpcEndpointType(vpcEndpointType: String) {
      cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps,
  ) : CdkObject(cdkObject),
      CfnVPCEndpointProps {
    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
     * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
     * template, and AWS CloudFormation converts the policy to JSON format before calling the API
     * actions for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as
     * shown in the following `Properties` section:
     *
     * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub
     * 'com.amazonaws.${AWS::Region}.logs' PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{
     * "Effect":"Allow", "Principal":"*",
     * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }]
     * }'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     */
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     */
    override fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     */
    override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     */
    override fun serviceName(): String = unwrap(this).getServiceName()

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     */
    override fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps):
        CfnVPCEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVPCEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
  }
}
