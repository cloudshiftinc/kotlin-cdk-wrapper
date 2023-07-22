@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * Specifies a VPC that your training jobs and hosted models have access to.
 *
 * Control access to and from your training and model containers by configuring the VPC. For more
 * information, see [Protect Endpoints by Using an Amazon Virtual Private
 * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Training Jobs by
 * Using an Amazon Virtual Private
 * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionVpcConfigPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.VpcConfigProperty.Builder =
      CfnModelQualityJobDefinition.VpcConfigProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
   * Specify the security groups for the VPC that is specified in the `Subnets` field.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
   * Specify the security groups for the VPC that is specified in the `Subnets` field.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnets The ID of the subnets in the VPC to which you want to connect your training job
   * or model. 
   * For information about the availability of specific instance types, see [Supported Instance
   * Types and Availability
   * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets The ID of the subnets in the VPC to which you want to connect your training job
   * or model. 
   * For information about the availability of specific instance types, see [Supported Instance
   * Types and Availability
   * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun build(): CfnModelQualityJobDefinition.VpcConfigProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
