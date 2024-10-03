@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVpcEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnVpcEndpointProps cfnVpcEndpointProps = CfnVpcEndpointProps.builder()
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html)
 */
public interface CfnVpcEndpointProps {
  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-name)
   */
  public fun name(): String

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The ID of the VPC from which you access OpenSearch Serverless.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVpcEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the endpoint. 
     */
    public fun name(name: String)

    /**
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps.builder()

    /**
     * @param name The name of the endpoint. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps,
  ) : CdkObject(cdkObject),
      CfnVpcEndpointProps {
    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The unique identifiers of the security groups that define the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The ID of the subnets from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The ID of the VPC from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps):
        CfnVpcEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVpcEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcEndpointProps):
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
  }
}
