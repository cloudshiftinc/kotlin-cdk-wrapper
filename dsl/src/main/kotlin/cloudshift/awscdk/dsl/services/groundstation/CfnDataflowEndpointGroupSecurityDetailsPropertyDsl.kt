@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Information about IAM roles, subnets, and security groups needed for this DataflowEndpointGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * SecurityDetailsProperty securityDetailsProperty = SecurityDetailsProperty.builder()
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupSecurityDetailsPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.SecurityDetailsProperty.Builder =
      CfnDataflowEndpointGroup.SecurityDetailsProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param roleArn The ARN of a role which Ground Station has permission to assume, such as
   * `arn:aws:iam::1234567890:role/DataDeliveryServiceRole` .
   * Ground Station will assume this role and create an ENI in your VPC on the specified subnet upon
   * creation of a dataflow endpoint group. This ENI is used as the ingress/egress point for data
   * streamed during a satellite contact.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param securityGroupIds The security group Ids of the security role, such as
   * `sg-1234567890abcdef0` .
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The security group Ids of the security role, such as
   * `sg-1234567890abcdef0` .
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The subnet Ids of the security details, such as `subnet-12345678` .
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnDataflowEndpointGroup.SecurityDetailsProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
