@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.constructs.Construct

/**
 * Creates an OpenSearch Serverless-managed interface VPC endpoint.
 *
 * For more information, see [Access Amazon OpenSearch Serverless using an interface
 * endpoint](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnVpcEndpoint cfnVpcEndpoint = CfnVpcEndpoint.Builder.create(this, "MyCfnVpcEndpoint")
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
@CdkDslMarker
public class CfnVpcEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcEndpoint.Builder = CfnVpcEndpoint.Builder.create(scope, id)

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-name)
   * @param name The name of the endpoint. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
   * @param securityGroupIds The unique identifiers of the security groups that define the ports,
   * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
   * @param securityGroupIds The unique identifiers of the security groups that define the ports,
   * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
   * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
   * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * The ID of the VPC from which you access OpenSearch Serverless.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-vpcid)
   * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVpcEndpoint {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
