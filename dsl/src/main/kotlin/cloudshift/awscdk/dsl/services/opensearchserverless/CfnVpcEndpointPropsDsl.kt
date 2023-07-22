@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps

/**
 * Properties for defining a `CfnVpcEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
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
@CdkDslMarker
public class CfnVpcEndpointPropsDsl {
  private val cdkBuilder: CfnVpcEndpointProps.Builder = CfnVpcEndpointProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param name The name of the endpoint. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param securityGroupIds The unique identifiers of the security groups that define the ports,
   * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The unique identifiers of the security groups that define the ports,
   * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVpcEndpointProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
