@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.datasync.CfnLocationEFS

/**
 * The subnet and security groups that AWS DataSync uses to access your Amazon EFS file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * Ec2ConfigProperty ec2ConfigProperty = Ec2ConfigProperty.builder()
 * .securityGroupArns(List.of("securityGroupArns"))
 * .subnetArn("subnetArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html)
 */
@CdkDslMarker
public class CfnLocationEFSEc2ConfigPropertyDsl {
  private val cdkBuilder: CfnLocationEFS.Ec2ConfigProperty.Builder =
      CfnLocationEFS.Ec2ConfigProperty.builder()

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
   * associated with an Amazon EFS file system's mount target. 
   */
  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  /**
   * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
   * associated with an Amazon EFS file system's mount target. 
   */
  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
  }

  /**
   * @param subnetArn Specifies the ARN of a subnet where DataSync creates the [network
   * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
   * for managing traffic during your transfer. 
   * The subnet must be located:
   *
   * * In the same virtual private cloud (VPC) as the Amazon EFS file system.
   * * In the same Availability Zone as at least one mount target for the Amazon EFS file system.
   *
   *
   * You don't need to specify a subnet that includes a file system mount target.
   */
  public fun subnetArn(subnetArn: String) {
    cdkBuilder.subnetArn(subnetArn)
  }

  public fun build(): CfnLocationEFS.Ec2ConfigProperty {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    return cdkBuilder.build()
  }
}
