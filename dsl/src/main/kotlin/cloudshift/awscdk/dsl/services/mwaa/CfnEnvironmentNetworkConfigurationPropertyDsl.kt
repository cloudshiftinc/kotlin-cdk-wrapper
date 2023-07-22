@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mwaa.CfnEnvironment

/**
 * The VPC networking components used to secure and enable network traffic between the AWS resources
 * for your environment.
 *
 * To learn more, see [About networking on Amazon
 * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mwaa.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnEnvironmentNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.NetworkConfigurationProperty.Builder =
      CfnEnvironment.NetworkConfigurationProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds A list of one or more security group IDs.
   * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as the
   * subnets. To learn more, see [Security in your VPC on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds A list of one or more security group IDs.
   * Accepts up to 5 security group IDs. A security group must be attached to the same VPC as the
   * subnets. To learn more, see [Security in your VPC on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html) .
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds A list of subnet IDs.
   * *Required* to create an environment. Must be private subnets in two different availability
   * zones. A subnet must be attached to the same VPC as the security group. To learn more, see [About
   * networking on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds A list of subnet IDs.
   * *Required* to create an environment. Must be private subnets in two different availability
   * zones. A subnet must be attached to the same VPC as the security group. To learn more, see [About
   * networking on Amazon
   * MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html) .
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnEnvironment.NetworkConfigurationProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
