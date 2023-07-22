@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps

/**
 * Properties for defining a `CfnVPCConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnVPCConnectionProps cfnVPCConnectionProps = CfnVPCConnectionProps.builder()
 * .availabilityStatus("availabilityStatus")
 * .awsAccountId("awsAccountId")
 * .dnsResolvers(List.of("dnsResolvers"))
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConnectionId("vpcConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html)
 */
@CdkDslMarker
public class CfnVPCConnectionPropsDsl {
  private val cdkBuilder: CfnVPCConnectionProps.Builder = CfnVPCConnectionProps.builder()

  private val _dnsResolvers: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param availabilityStatus The availability status of the VPC connection.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  /**
   * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
   * connection.
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
   */
  public fun dnsResolvers(vararg dnsResolvers: String) {
    _dnsResolvers.addAll(listOf(*dnsResolvers))
  }

  /**
   * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
   */
  public fun dnsResolvers(dnsResolvers: Collection<String>) {
    _dnsResolvers.addAll(dnsResolvers)
  }

  /**
   * @param name The display name for the VPC connection.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The ARN of the IAM role associated with the VPC connection.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds A list of subnet IDs for the VPC connection.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds A list of subnet IDs for the VPC connection.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
   * connection.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
   * connection.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcConnectionId The ID of the VPC connection that you're creating.
   * This ID is a unique identifier for each AWS Region in an AWS account.
   */
  public fun vpcConnectionId(vpcConnectionId: String) {
    cdkBuilder.vpcConnectionId(vpcConnectionId)
  }

  public fun build(): CfnVPCConnectionProps {
    if(_dnsResolvers.isNotEmpty()) cdkBuilder.dnsResolvers(_dnsResolvers)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
