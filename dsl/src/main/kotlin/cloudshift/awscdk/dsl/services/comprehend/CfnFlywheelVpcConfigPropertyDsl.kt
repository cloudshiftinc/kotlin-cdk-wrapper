@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.comprehend.CfnFlywheel

@CdkDslMarker
public class CfnFlywheelVpcConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.VpcConfigProperty.Builder =
      CfnFlywheel.VpcConfigProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds The ID number for a security group on an instance of your private VPC. 
   * Security groups on your VPC function serve as a virtual firewall to control inbound and
   * outbound traffic and provides security for the resources that you’ll be accessing on the VPC. This
   * ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
   * [Security Groups for your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The ID number for a security group on an instance of your private VPC. 
   * Security groups on your VPC function serve as a virtual firewall to control inbound and
   * outbound traffic and provides security for the resources that you’ll be accessing on the VPC. This
   * ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see
   * [Security Groups for your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnets The ID for each subnet being used in your private VPC. 
   * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to a
   * given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
   * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
   * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets The ID for each subnet being used in your private VPC. 
   * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to a
   * given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
   * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
   * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun build(): CfnFlywheel.VpcConfigProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
